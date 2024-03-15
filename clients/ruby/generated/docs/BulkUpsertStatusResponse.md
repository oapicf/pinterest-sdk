# PinterestSdkClient::BulkUpsertStatusResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **status** | [**BulkUpsertStatus**](BulkUpsertStatus.md) |  | [optional] |
| **result_url** | **String** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BulkUpsertStatusResponse.new(
  status: null,
  result_url: https://pinterest-waterloo.s3.us-east-1.amazonaws.com/bulk_framework/AD_ENTITY_UPSERT/549763856637-1659122537-0b4d77d3-f620-48ce-bec9-616106afb8d4/(...)
)
```

