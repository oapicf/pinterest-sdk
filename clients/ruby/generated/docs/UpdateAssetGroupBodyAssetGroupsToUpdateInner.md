# PinterestSdkClient::UpdateAssetGroupBodyAssetGroupsToUpdateInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **asset_group_id** | **String** | Unique identifier of the asset group to update. |  |
| **name** | **String** | Asset Group name | [optional] |
| **description** | **String** | Asset group description | [optional] |
| **asset_group_types** | [**Array&lt;AssetGroupType&gt;**](AssetGroupType.md) | Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. | [optional] |
| **assets_to_add** | **Array&lt;String&gt;** | A list of asset ids to add to the asset group. | [optional] |
| **assets_to_remove** | **Array&lt;String&gt;** | A list of asset ids to remove from the asset group. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::UpdateAssetGroupBodyAssetGroupsToUpdateInner.new(
  asset_group_id: 666791336903426391,
  name: Canada Ad Accounts,
  description: Asset groups that has ad accounts shared in Canada,
  asset_group_types: [&quot;BRAND&quot;,&quot;LOCATION_OR_LANGUAGE&quot;,&quot;PRODUCT_LINE&quot;,&quot;OTHER&quot;],
  assets_to_add: null,
  assets_to_remove: null
)
```

