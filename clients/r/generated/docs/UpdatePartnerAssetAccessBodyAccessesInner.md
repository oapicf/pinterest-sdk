# openapi::UpdatePartnerAssetAccessBodyAccessesInner


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**partner_id** | **character** | Unique identifier of a business partner to update asset access to. | [Pattern: ^\\d+$] [Max. length: 25] 
**asset_id** | **character** | Unique identifier of the business asset. | [Pattern: ^\\d+$] [Max. length: 25] 
**permissions** | [**array[Permissions]**](Permissions.md) | A non-empty array of permissions to assign to the partner. | [Max. items: 50] [Min. items: 1] 


