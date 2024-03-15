
# Table `user_following_get_200_response`
(mapped from: UserFollowingGet200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;UserSummary&gt;**](UserSummary.md) | Users | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `UserFollowingGet200ResponseUserSummary`**
(mapped from: UserFollowingGet200ResponseUserSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
userFollowingGet200Response | userFollowingGet200Response | long | | kotlin.Long | Primary Key | *one*
userSummary | userSummary | long | | kotlin.Long | Foreign Key | *many*




