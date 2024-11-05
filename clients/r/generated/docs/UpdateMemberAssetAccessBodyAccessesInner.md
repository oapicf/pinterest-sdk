# openapi::UpdateMemberAssetAccessBodyAccessesInner


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id** | **character** | Id of the asset to update. | [Pattern: ^\\d+$] [Max. length: 25] 
**member_id** | **character** | Unique identifier of the member on which to perform the update | [Pattern: ^\\d+$] [Max. length: 25] 
**permissions** | [**array[Permissions]**](Permissions.md) | A non-empty array of permissions to assign to the member. | [Max. items: 50] [Min. items: 1] 


