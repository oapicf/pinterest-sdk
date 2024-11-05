# CREATE_ASSET_ACCESS_REQUEST_BODY_ASSET_REQUESTS_INNER

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**partner_id** | [**STRING_32**](STRING_32.md) | Unique identifier of a business partner to request asset access to. | [default to null]
**asset_id_to_permissions** | [**STRING_TABLE [LIST [PERMISSIONS]]**](LIST.md) | An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.  | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


