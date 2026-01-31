# CreateAssetGroupBody


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_group_name** | **string** | Asset Group name | [default to undefined]
**asset_group_description** | **string** | Asset group description | [default to undefined]
**asset_group_types** | [**Array&lt;AssetGroupType&gt;**](AssetGroupType.md) | Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. | [default to undefined]

## Example

```typescript
import { CreateAssetGroupBody } from './api';

const instance: CreateAssetGroupBody = {
    asset_group_name,
    asset_group_description,
    asset_group_types,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
