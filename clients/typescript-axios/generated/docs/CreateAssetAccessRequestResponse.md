# CreateAssetAccessRequestResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exceptions** | [**Array&lt;AssetAccessRequestError&gt;**](AssetAccessRequestError.md) | A list of errors associated with the asset access requests. Will be returned if there is an error. | [optional] [default to undefined]
**invites** | **{ [key: string]: string; }** | An object mapping each partner id to the asset access request id. Only one request id is returned per partner. | [optional] [default to undefined]

## Example

```typescript
import { CreateAssetAccessRequestResponse } from './api';

const instance: CreateAssetAccessRequestResponse = {
    exceptions,
    invites,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
