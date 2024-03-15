
# Table `user_account_followed_interests_200_response`
(mapped from: UserAccountFollowedInterests200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Interest&gt;**](Interest.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `UserAccountFollowedInterests200ResponseInterest`**
(mapped from: UserAccountFollowedInterests200ResponseInterest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
userAccountFollowedInterests200Response | userAccountFollowedInterests200Response | long | | kotlin.Long | Primary Key | *one*
interest | interest | long | | kotlin.Long | Foreign Key | *many*




