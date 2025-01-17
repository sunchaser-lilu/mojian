package io.github.llnancy.mojian.web.advice.handler;

import io.github.llnancy.mojian.base.entity.response.IResponse;
import lombok.Setter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatusCode;

import java.util.List;

/**
 * an abstract implement of {@link IExceptionHandler}
 *
 * @author llnancy admin@lilu.org.cn
 * @since JDK17 2024/3/15
 */
public abstract class AbstractExceptionHandler implements IExceptionHandler, Ordered {

    private final List<Class<? extends Throwable>> exceptionClasses;

    private final HttpStatusCode httpStatus;

    @Setter
    private IResponse response;

    public AbstractExceptionHandler(List<Class<? extends Throwable>> exceptionClasses, HttpStatusCode httpStatus) {
        this.exceptionClasses = exceptionClasses;
        this.httpStatus = httpStatus;
    }

    @Override
    public List<Class<? extends Throwable>> getExceptionClasses() {
        return this.exceptionClasses;
    }

    @Override
    public HttpStatusCode getStatusCode() {
        return httpStatus;
    }

    @Override
    public IResponse getResponse() {
        return response;
    }

    @Override
    public void formatIResponse(Throwable ex) {
        doFormatIResponse(ex);
    }

    @Override
    public int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE;
    }

    protected abstract void doFormatIResponse(Throwable ex);
}
