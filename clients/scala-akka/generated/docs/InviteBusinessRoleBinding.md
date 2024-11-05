

# InviteBusinessRoleBinding

An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdByBusinessId** | **String** | Unique identifier for the business that created the invite/request. |  [optional]
**createdByUserId** | **String** | Unique identifier for the user that created the invite/request. |  [optional]
**user** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the user that updated the invite/request. |  [optional]
**id** | **String** | Unique identifier of the invite/request. |  [optional]
**inviteData** | [**BaseInviteDataResponseInviteData**](BaseInviteDataResponseInviteData.md) |  |  [optional]
**isReceivedInvite** | **Boolean** | Indicates whether the invite/request was received. |  [optional]



