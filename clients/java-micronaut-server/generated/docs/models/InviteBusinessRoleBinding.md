

# InviteBusinessRoleBinding

An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.

The class is defined in **[InviteBusinessRoleBinding.java](../../src/main/java/org/openapitools/model/InviteBusinessRoleBinding.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdByBusinessId** | `String` | Unique identifier for the business that created the invite/request. |  [optional property]
**createdByUserId** | `String` | Unique identifier for the user that created the invite/request. |  [optional property]
**user** | [`BusinessAccessUserSummary`](BusinessAccessUserSummary.md) | Metadata for the user that updated the invite/request. |  [optional property]
**id** | `String` | Unique identifier of the invite/request. |  [optional property]
**inviteData** | [`BaseInviteDataResponseInviteData`](BaseInviteDataResponseInviteData.md) |  |  [optional property]
**isReceivedInvite** | `Boolean` | Indicates whether the invite/request was received. |  [optional property]








