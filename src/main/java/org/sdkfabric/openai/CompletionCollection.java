/**
 * CompletionCollection automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.openai;

import com.fasterxml.jackson.annotation.*;

public class CompletionCollection {
    @JsonPropertyDescription("The type of this object. It is always set to \"list\".")
    private String object;
    @JsonPropertyDescription("An array of chat completion objects.")
    private java.util.List<CompletionResponse> data;
    @JsonPropertyDescription("The identifier of the first chat completion in the data array.")
    private String firstId;
    @JsonPropertyDescription("The identifier of the last chat completion in the data array.")
    private String lastId;
    @JsonPropertyDescription("Indicates whether there are more Chat Completions available.")
    private Boolean hasMore;

    @JsonSetter("object")
    public void setObject(String object) {
        this.object = object;
    }

    @JsonGetter("object")
    public String getObject() {
        return this.object;
    }

    @JsonSetter("data")
    public void setData(java.util.List<CompletionResponse> data) {
        this.data = data;
    }

    @JsonGetter("data")
    public java.util.List<CompletionResponse> getData() {
        return this.data;
    }

    @JsonSetter("first_id")
    public void setFirstId(String firstId) {
        this.firstId = firstId;
    }

    @JsonGetter("first_id")
    public String getFirstId() {
        return this.firstId;
    }

    @JsonSetter("last_id")
    public void setLastId(String lastId) {
        this.lastId = lastId;
    }

    @JsonGetter("last_id")
    public String getLastId() {
        return this.lastId;
    }

    @JsonSetter("has_more")
    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    @JsonGetter("has_more")
    public Boolean getHasMore() {
        return this.hasMore;
    }
}

