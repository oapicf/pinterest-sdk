# PinterestSdkClient::DeleteAssetGroupBody

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **asset_groups_to_delete** | **Array&lt;String&gt;** | List of ids of asset groups to be deleted |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::DeleteAssetGroupBody.new(
  asset_groups_to_delete: [&quot;666791336903426391&quot;,&quot;666791336903426392&quot;]
)
```

