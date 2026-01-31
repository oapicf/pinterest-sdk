# DeletePartnerAssetAccessBodyAccessesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**partner_id** | **string** | Unique identifier of a business partner to update asset access to. | [default to undefined]
**asset_id** | **string** | Unique identifier of the business asset. | [default to undefined]
**partner_type** | **string** | If partner_type&#x3D;INTERNAL, the deleted asset access is for the access the partner has to your business asset.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the deleted asset access is for the access you have to the partner\&#39;s business asset. | [optional] [default to PartnerTypeEnum_Internal]

## Example

```typescript
import { DeletePartnerAssetAccessBodyAccessesInner } from './api';

const instance: DeletePartnerAssetAccessBodyAccessesInner = {
    partner_id,
    asset_id,
    partner_type,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
