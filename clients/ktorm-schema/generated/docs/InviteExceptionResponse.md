
# Table `InviteExceptionResponse`
(mapped from: InviteExceptionResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**inviteOrRequestId** | invite_or_request_id | text |  | **kotlin.String** | Unique identifier of the invite/request. |  [optional]
**code** | code | int |  | **kotlin.Int** | Error code associated with the error in performing the action on the invite/request. |  [optional]
**message** | message | text |  | **kotlin.String** | Error message associated with the error in performing the action on the invite/request. |  [optional]
**usersOrPartnerIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | A list of users&#39; usernames or emails OR a list of partner ids that caused the error. |  [optional]





# **Table `InviteExceptionResponseUsersOrPartnerIds`**
(mapped from: InviteExceptionResponseUsersOrPartnerIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
inviteExceptionResponse | inviteExceptionResponse | long | | kotlin.Long | Primary Key | *one*
usersOrPartnerIds | usersOrPartnerIds | text | | kotlin.String | Foreign Key | *many*



