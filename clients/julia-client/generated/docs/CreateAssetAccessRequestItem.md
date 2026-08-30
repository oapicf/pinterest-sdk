# CreateAssetAccessRequestItem


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`asset_id_to_permissions`** | **`Dict{String, Vector}`** | An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. | [default to nothing]
**`partner_id`** | **`String`** | Unique identifier of a business partner to request asset access to. | [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


