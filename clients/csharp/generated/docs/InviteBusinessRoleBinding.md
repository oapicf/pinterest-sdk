# Org.OpenAPITools.Model.InviteBusinessRoleBinding
An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreatedByBusinessId** | **string** | Unique identifier for the business that created the invite/request. | [optional] 
**CreatedByUserId** | **string** | Unique identifier for the user that created the invite/request. | [optional] 
**User** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the user that updated the invite/request. | [optional] 
**Id** | **string** | Unique identifier of the invite/request. | [optional] 
**InviteData** | [**BaseInviteDataResponseInviteData**](BaseInviteDataResponseInviteData.md) |  | [optional] 
**IsReceivedInvite** | **bool** | Indicates whether the invite/request was received. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

