# PinterestSdkClient::BulkUpsertStatusResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **result_url** | **String** |  | [optional] |
| **status** | [**BulkUpsertStatus**](BulkUpsertStatus.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BulkUpsertStatusResponse.new(
  result_url: https://pinterest-waterloo.s3.us-east-1.amazonaws.com/bulk_framework/AD_ENTITY_UPSERT/549763856637-1659122537-0b4d77d3-f620-48ce-bec9-616106afb8d4/(...),
  status: null
)
```

