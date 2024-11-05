

# DeleteInvitesResultsResponseArray

Response to delete invites sent to Members or Partners, if there is an exception, return the exception mapped with the invite id

The class is defined in **[DeleteInvitesResultsResponseArray.java](../../src/main/java/org/openapitools/model/DeleteInvitesResultsResponseArray.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [`List&lt;DeleteInvitesResultsResponseArrayItemsInner&gt;`](DeleteInvitesResultsResponseArrayItemsInner.md) | List of invite/Request deletion status. If there is an error, an exception object will be returned. If the invite/request was successfully cancelled, an invite object will be returned for the invite that was cancelled. |  [optional property]



