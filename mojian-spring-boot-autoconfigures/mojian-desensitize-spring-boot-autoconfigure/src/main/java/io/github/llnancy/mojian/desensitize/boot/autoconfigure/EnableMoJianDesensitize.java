package io.github.llnancy.mojian.desensitize.boot.autoconfigure;

import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Enable @Desensitize
 *
 * @author llnancy admin@lilu.org.cn
 * @since JDK17 2023/07/10
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(MoJianDesensitizeAutoConfiguration.class)
public @interface EnableMoJianDesensitize {
}
