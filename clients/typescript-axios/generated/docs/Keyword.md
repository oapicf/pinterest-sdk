# Keyword


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bid** | **number** | &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] [default to undefined]
**match_type** | [**MatchTypeResponse**](MatchTypeResponse.md) |  | [default to undefined]
**value** | **string** | Keyword value (120 chars max). | [default to undefined]
**archived** | **boolean** |  | [optional] [default to undefined]
**id** | **string** | Keyword ID . | [optional] [default to undefined]
**parent_id** | **string** | Keyword parent entity ID (advertiser, campaign, ad group). | [optional] [default to undefined]
**parent_type** | **string** | Parent entity type | [optional] [default to undefined]
**type** | **string** | Always keyword | [optional] [default to undefined]

## Example

```typescript
import { Keyword } from './api';

const instance: Keyword = {
    bid,
    match_type,
    value,
    archived,
    id,
    parent_id,
    parent_type,
    type,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
