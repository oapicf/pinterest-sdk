
# Table `followers_list_200_response`
(mapped from: FollowersList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;FollowUser&gt;**](FollowUser.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `FollowersList200ResponseFollowUser`**
(mapped from: FollowersList200ResponseFollowUser)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
followersList200Response | followersList200Response | long | | kotlin.Long | Primary Key | *one*
followUser | followUser | long | | kotlin.Long | Foreign Key | *many*




