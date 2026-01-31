# DeleteAssetGroupResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deleted_asset_groups** | **Array&lt;string&gt;** | A list of ids of successfully deleted asset groups. | [optional] [default to undefined]
**exceptions** | [**Array&lt;DeleteAssetGroupResponseExceptionsInner&gt;**](DeleteAssetGroupResponseExceptionsInner.md) | A list of errors associated with the asset groups. Will be returned if there is an error. | [optional] [default to undefined]

## Example

```typescript
import { DeleteAssetGroupResponse } from './api';

const instance: DeleteAssetGroupResponse = {
    deleted_asset_groups,
    exceptions,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
