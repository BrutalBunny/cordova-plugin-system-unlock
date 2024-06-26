package com.tokenized.cordova.system_unlock;

class CryptoException extends Exception {
    private PluginError error;

    CryptoException(String message, Throwable cause) {
        this(PluginError.BIOMETRIC_UNKNOWN_ERROR, message, cause);
    }

    CryptoException(PluginError error) {
        this(error, error.getMessage(), null);
    }

    CryptoException(PluginError error, Throwable cause) {
        this(error, error.getMessage(), cause);
    }

    private CryptoException(PluginError error, String message, Throwable cause) {
        super(message, cause);
        this.error = error;
    }

    public PluginError getError() {
        return error;
    }
}
