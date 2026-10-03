
# openai-java

This [SDK](https://github.com/sdk-fabric/openai-java) is managed by the [SDK Fabric](https://sdk-fabric.org/) project, a global infrastructure to
automatically generate SDKs for every API.

You can find more information about this SDK at [TypeHub](https://typehub.cloud/):
https://app.typehub.cloud/d/sdkfabric/openai

## Usage

```java
import org.sdkfabric.openai.Client;

Client client = Client::build("[access_token]");

// Creates a model response for the given chat conversation.
Completion_Response response = client.completions().create(new Completion_Request());

// Delete a stored chat completion.
Completion_Deleted response = client.completions().delete("completion_id");

// List stored Chat Completions.
Completion_Collection response = client.completions().getAll("after", 1, "model", "order");

// Creates a model response.
Response_Response response = client.responses().create(new Response_Request());
```
