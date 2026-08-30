# PinterestSdkClient::AssetGroupBinding

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_accounts_ids** | **Array&lt;String&gt;** | A list of ad account IDs under the asset group |  |
| **asset_group_description** | **String** | Asset group description |  |
| **asset_group_name** | **String** | Asset Group name |  |
| **asset_group_types** | **Array&lt;String&gt;** | Asset group types |  |
| **catalogs_ids** | **Array&lt;String&gt;** | A list of catalog IDs under asset group |  |
| **created_by** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | The data of the user that created the asset group. |  |
| **created_time** | **Integer** | The creation time of the asset group |  |
| **id** | **String** | Asset Group ID. |  |
| **owner** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | The data of the business that owns the asset group. |  |
| **profiles_ids** | **Array&lt;String&gt;** | A list of profile IDs under asset group |  |
| **updated_time** | **Integer** | The last update time of the asset group |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AssetGroupBinding.new(
  ad_accounts_ids: [&quot;549755885175&quot;],
  asset_group_description: Asset group that has ad accounts used in Canada,
  asset_group_name: Canada Ad Accounts,
  asset_group_types: [&quot;LOCATION_OR_LANGUAGE&quot;],
  catalogs_ids: [&quot;4836859046874&quot;],
  created_by: null,
  created_time: 1646767577816,
  id: 666791336903426391,
  owner: null,
  profiles_ids: [&quot;630433785246278264&quot;],
  updated_time: 1646767577816
)
```

