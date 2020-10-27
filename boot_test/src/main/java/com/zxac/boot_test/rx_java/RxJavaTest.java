package com.zxac.boot_test.rx_java;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import org.junit.jupiter.api.Test;

public class RxJavaTest {

    @Test
    public void test1 () {
        Observable<String> observable = Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(@NonNull ObservableEmitter<String> emitter) throws Throwable {
                emitter.onNext("hello RxJava");
                emitter.onNext("I am czx");
                emitter.onError(new RuntimeException("error ~~~~~"));
                emitter.onComplete();
            }
        });

        observable.subscribe(System.out::println, System.out::println);

    }

}
