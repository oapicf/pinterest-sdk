# delete_partner_asset_access_result_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id** | **char \*** | Unique identifier of a business asset. | [optional] 
**asset_type** | **char \*** | Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG. | [optional] 
**is_shared_partner** | **int** | If is_shared_partner&#x3D;FALSE, you terminated a partner&#39;s asset access to your business asset. If is_shared_partner&#x3D;TRUE, you terminated your asset access to your partner&#39;s business asset. | [optional] 
**partner_id** | **char \*** | Unique identifier of a business partner. | [optional] 
**permissions** | **list_t \*** | Permission levels member or partner has on an asset. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


