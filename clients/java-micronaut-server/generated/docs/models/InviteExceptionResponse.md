

# InviteExceptionResponse

An exception object if there is an error performing the action. Will only be provided if there is an error.

The class is defined in **[InviteExceptionResponse.java](../../src/main/java/org/openapitools/model/InviteExceptionResponse.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inviteOrRequestId** | `String` | Unique identifier of the invite/request. |  [optional property]
**code** | `Integer` | Error code associated with the error in performing the action on the invite/request. |  [optional property]
**message** | `String` | Error message associated with the error in performing the action on the invite/request. |  [optional property]
**usersOrPartnerIds** | `List&lt;String&gt;` | A list of users&#39; usernames or emails OR a list of partner ids that caused the error. |  [optional property]






