# AssetGroupBinding


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_accounts_ids** | **Array&lt;string&gt;** | A list of ad account IDs under the asset group | [optional] [default to undefined]
**asset_group_description** | **string** | Asset group description | [optional] [default to undefined]
**asset_group_name** | **string** | Asset Group name | [optional] [default to undefined]
**asset_group_types** | **Array&lt;string&gt;** | Asset group types | [optional] [default to undefined]
**catalogs_ids** | **Array&lt;string&gt;** | A list of catalog IDs under asset group | [optional] [default to undefined]
**created_by** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | The data of the user that created the asset group. | [optional] [default to undefined]
**created_time** | **number** | The creation time of the asset group | [optional] [default to undefined]
**id** | **string** | Asset Group ID. | [optional] [default to undefined]
**owner** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | The data of the business that owns the asset group. | [optional] [default to undefined]
**profiles_ids** | **Array&lt;string&gt;** | A list of profile IDs under asset group | [optional] [default to undefined]
**updated_time** | **number** | The last update time of the asset group | [optional] [default to undefined]

## Example

```typescript
import { AssetGroupBinding } from './api';

const instance: AssetGroupBinding = {
    ad_accounts_ids,
    asset_group_description,
    asset_group_name,
    asset_group_types,
    catalogs_ids,
    created_by,
    created_time,
    id,
    owner,
    profiles_ids,
    updated_time,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
