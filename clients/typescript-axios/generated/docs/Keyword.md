# Keyword


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**archived** | **boolean** |  | [optional] [default to undefined]
**bid** | **number** | **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] [default to undefined]
**id** | **string** | Keyword ID . | [default to undefined]
**match_type** | [**MatchType**](MatchType.md) | Keyword [match type](/docs/api-features/targeting-overview/) | [default to undefined]
**parent_id** | **string** | Keyword parent entity ID (advertiser, campaign, ad group). | [readonly] [default to undefined]
**parent_type** | **string** | Parent entity type (advertiser, campaign, ad group). | [optional] [readonly] [default to undefined]
**type** | **string** | Always keyword | [optional] [readonly] [default to undefined]
**value** | **string** | Keyword value (120 chars max). | [default to undefined]

## Example

```typescript
import { Keyword } from './api';

const instance: Keyword = {
    archived,
    bid,
    id,
    match_type,
    parent_id,
    parent_type,
    type,
    value,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
