# PinterestSdkClient::BusinessMemberAssetsGetResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **bookmark** | **String** |  | [optional] |
| **items** | [**Array&lt;AssetIdPermissions&gt;**](AssetIdPermissions.md) |  |  |
| **total_data_count** | **Integer** | Total number of assets matching the query |  |
| **total_data_count_by_status** | [**TotalCountByEntityStatus**](TotalCountByEntityStatus.md) | Breakdown of asset counts by entity status (ad accounts only) | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BusinessMemberAssetsGetResponse.new(
  bookmark: null,
  items: null,
  total_data_count: null,
  total_data_count_by_status: null
)
```

