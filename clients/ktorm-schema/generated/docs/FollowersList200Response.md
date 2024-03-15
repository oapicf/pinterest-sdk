
# Table `followers_list_200_response`
(mapped from: FollowersList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;UserSummary&gt;**](UserSummary.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `FollowersList200ResponseUserSummary`**
(mapped from: FollowersList200ResponseUserSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
followersList200Response | followersList200Response | long | | kotlin.Long | Primary Key | *one*
userSummary | userSummary | long | | kotlin.Long | Foreign Key | *many*




