# openapi::UsersForIndividualAssetResponse

An object containing the permissions a business member has on the asset.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id** | **character** | Unique identifier of a business asset. | [optional] [Pattern: ^\\d+$] 
**member_id** | **character** | Unique identifier of the business member with asset access. | [optional] [Pattern: ^\\d+$] 
**permissions** | **array[character]** | Permission levels member or partner has on an asset. | [optional] 


