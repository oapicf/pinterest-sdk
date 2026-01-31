# CreateInvitesResultsResponseArrayItemsInnerInvite

An invite object if the invite/request was successfully created. Will only be provided if the an invite/request is successfully created.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | Unique identifier of the invite/request. | [optional] [default to undefined]
**user** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the member/partner that was sent the invite/request. | [optional] [default to undefined]

## Example

```typescript
import { CreateInvitesResultsResponseArrayItemsInnerInvite } from './api';

const instance: CreateInvitesResultsResponseArrayItemsInnerInvite = {
    id,
    user,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
