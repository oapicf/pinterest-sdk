
# Table `get_invites_200_response`
(mapped from: GetInvites200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;InviteResponse&gt;**](InviteResponse.md) | List of invite and request data. | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `GetInvites200ResponseInviteResponse`**
(mapped from: GetInvites200ResponseInviteResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getInvites200Response | getInvites200Response | long | | kotlin.Long | Primary Key | *one*
inviteResponse | inviteResponse | long | | kotlin.Long | Foreign Key | *many*




