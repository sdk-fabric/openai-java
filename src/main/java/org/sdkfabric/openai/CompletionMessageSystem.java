/**
 * CompletionMessageSystem automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.openai;

import com.fasterxml.jackson.annotation.*;

public class CompletionMessageSystem extends CompletionMessage {
    private String name;

    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonGetter("name")
    public String getName() {
        return this.name;
    }
}

