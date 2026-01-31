# UpdateAssetGroupBodyAssetGroupsToUpdateInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_group_id** | **string** | Unique identifier of the asset group to update. | [default to undefined]
**asset_group_types** | [**Array&lt;AssetGroupType&gt;**](AssetGroupType.md) | Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. | [optional] [default to undefined]
**assets_to_add** | **Array&lt;string&gt;** | A list of asset ids to add to the asset group. | [optional] [default to undefined]
**assets_to_remove** | **Array&lt;string&gt;** | A list of asset ids to remove from the asset group. | [optional] [default to undefined]
**description** | **string** | Asset group description | [optional] [default to undefined]
**name** | **string** | Asset Group name | [optional] [default to undefined]

## Example

```typescript
import { UpdateAssetGroupBodyAssetGroupsToUpdateInner } from './api';

const instance: UpdateAssetGroupBodyAssetGroupsToUpdateInner = {
    asset_group_id,
    asset_group_types,
    assets_to_add,
    assets_to_remove,
    description,
    name,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
