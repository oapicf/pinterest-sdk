

# BaseInviteDataResponse

Common invite/request data returned by the business access endpoints.

The class is defined in **[BaseInviteDataResponse.java](../../src/main/java/org/openapitools/model/BaseInviteDataResponse.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `String` | Unique identifier of the invite/request. |  [optional property]
**inviteData** | [`InviteDataResponse`](InviteDataResponse.md) |  |  [optional property]
**isReceivedInvite** | `Boolean` | Indicates whether the invite/request was received. |  [optional property]
**user** | [`BusinessAccessUserSummary`](BusinessAccessUserSummary.md) | Metadata for the member/partner that was sent the invite/request. |  [optional property]






