# PinterestSdkClient::AssetGroupBinding

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | Asset Group ID. | [optional] |
| **asset_group_name** | **String** | Asset Group name | [optional] |
| **asset_group_description** | **String** | Asset group description | [optional] |
| **asset_group_types** | **Array&lt;String&gt;** | Asset group types | [optional] |
| **ad_accounts_ids** | **Array&lt;String&gt;** | A list of ad account IDs under the asset group | [optional] |
| **profiles_ids** | **Array&lt;String&gt;** | A list of profile IDs under asset group | [optional] |
| **created_time** | **Integer** | The creation time of the asset group | [optional] |
| **updated_time** | **Integer** | The last update time of the asset group | [optional] |
| **owner** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | The data of the business that owns the asset group. | [optional] |
| **created_by** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | The data of the user that created the asset group. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AssetGroupBinding.new(
  id: 666791336903426391,
  asset_group_name: Canada Ad Accounts,
  asset_group_description: Asset group that has ad accounts used in Canada,
  asset_group_types: [&quot;LOCATION_OR_LANGUAGE&quot;],
  ad_accounts_ids: [&quot;549755885175&quot;],
  profiles_ids: [&quot;630433785246278264&quot;],
  created_time: 1646767577816,
  updated_time: 1646767577816,
  owner: null,
  created_by: null
)
```

