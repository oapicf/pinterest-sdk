# openapi::AuthRespondInvitesBodyInvitesInnerAction


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accept_invite** | **character** | Whether the invite/request is accepted. | 
**asset_id_to_permissions** | [**map(array[Permissions])**](array.md) | An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.  | [optional] [Min. items: 1] 


