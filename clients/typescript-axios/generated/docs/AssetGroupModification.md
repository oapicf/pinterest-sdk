# AssetGroupModification


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exceptions** | [**Array&lt;AssetGroupUpdateError&gt;**](AssetGroupUpdateError.md) | A list of errors associated with the asset groups. Will be returned if there is an error. | [optional] [readonly] [default to undefined]
**updated_asset_groups** | [**Array&lt;AssetGroupBinding&gt;**](AssetGroupBinding.md) | A list of successfully edited asset groups. | [optional] [readonly] [default to undefined]

## Example

```typescript
import { AssetGroupModification } from './api';

const instance: AssetGroupModification = {
    exceptions,
    updated_asset_groups,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
