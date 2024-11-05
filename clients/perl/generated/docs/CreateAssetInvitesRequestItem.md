# WWW::OpenAPIClient::Object::CreateAssetInvitesRequestItem

## Load the model package
```perl
use WWW::OpenAPIClient::Object::CreateAssetInvitesRequestItem;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**invite_id** | **string** | Unique identifier of an invite. | 
**invite_type** | [**InviteType**](InviteType.md) |  | 
**asset_id_to_permissions** | **HASH[string,ARRAY[Permissions]]** | An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


