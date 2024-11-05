

# InviteExceptionResponse

An exception object if there is an error performing the action. Will only be provided if there is an error.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inviteOrRequestId** | **String** | Unique identifier of the invite/request. |  [optional]
**code** | **Int** | Error code associated with the error in performing the action on the invite/request. |  [optional]
**message** | **String** | Error message associated with the error in performing the action on the invite/request. |  [optional]
**usersOrPartnerIds** | **Seq&lt;String&gt;** | A list of users&#39; usernames or emails OR a list of partner ids that caused the error. |  [optional]



