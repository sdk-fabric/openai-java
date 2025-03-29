/**
 * ErrorException automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.openai;

import app.sdkgen.client.Exception.KnownStatusCodeException;

public class ErrorException extends KnownStatusCodeException {

    private Error payload;

    public ErrorException(Error payload) {
        super("The server returned an error");

        this.payload = payload;
    }

    public Error getPayload() {
        return this.payload;
    }

}
