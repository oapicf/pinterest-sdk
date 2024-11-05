# PinterestSdkClient::CreateAssetGroupBody

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **asset_group_name** | **String** | Asset Group name |  |
| **asset_group_description** | **String** | Asset group description |  |
| **asset_group_types** | [**Array&lt;AssetGroupType&gt;**](AssetGroupType.md) | Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CreateAssetGroupBody.new(
  asset_group_name: Canada Ad Accounts,
  asset_group_description: Asset groups that has ad accounts shared in Canada,
  asset_group_types: [&quot;BRAND&quot;,&quot;LOCATION_OR_LANGUAGE&quot;,&quot;PRODUCT_LINE&quot;,&quot;OTHER&quot;]
)
```

