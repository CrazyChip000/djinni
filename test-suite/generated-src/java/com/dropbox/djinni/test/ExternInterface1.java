// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from yaml-test.djinni

package com.dropbox.djinni.test;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class ExternInterface1 {
    public abstract com.dropbox.djinni.test.ClientReturnedRecord foo(com.dropbox.djinni.test.ClientInterface i);

    private static final class CppProxy extends ExternInterface1
    {
        private final long nativeRef;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);

        private CppProxy(long nativeRef)
        {
            if (nativeRef == 0) throw new RuntimeException("nativeRef is zero");
            this.nativeRef = nativeRef;
        }

        private native void nativeDestroy(long nativeRef);
        public void _djinni_private_destroy()
        {
            boolean destroyed = this.destroyed.getAndSet(true);
            if (!destroyed) nativeDestroy(this.nativeRef);
        }
        protected void finalize() throws java.lang.Throwable
        {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override
        public com.dropbox.djinni.test.ClientReturnedRecord foo(com.dropbox.djinni.test.ClientInterface i)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_foo(this.nativeRef, i);
        }
        private native com.dropbox.djinni.test.ClientReturnedRecord native_foo(long _nativeRef, com.dropbox.djinni.test.ClientInterface i);
    }
}
