# PinterestSdkClient::LeadFormTestRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **answers** | **Array&lt;String&gt;** | Test lead answers. Should follow the creation order. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::LeadFormTestRequest.new(
  answers: [&quot;John&quot;,&quot;Doe&quot;,&quot;abc@email.com&quot;,&quot;987654321&quot;]
)
```

