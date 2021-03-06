package ua.brander.core.viewmodel;

import androidx.lifecycle.ViewModel;
import dagger.MapKey;

import java.lang.annotation.*;

/**
 * Problems with migration to AndroidX
 * Workaround in Java due to Dagger/Kotlin not playing well together as of now
 * https://github.com/google/dagger/issues/1478
 */
@MapKey
@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ViewModelKey {
    Class<? extends ViewModel> value();
}
