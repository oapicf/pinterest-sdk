# PinterestSdkClient::DeletePartnersResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **deleted_partners** | **Array&lt;String&gt;** | List of partners whose business partnership have been terminated. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::DeletePartnersResponse.new(
  deleted_partners: [&quot;809944451643622187&quot;,&quot;383791336903426391&quot;]
)
```

