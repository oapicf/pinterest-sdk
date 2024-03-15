
# Table `user_websites_get_200_response`
(mapped from: UserWebsitesGet200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;UserWebsiteSummary&gt;**](UserWebsiteSummary.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `UserWebsitesGet200ResponseUserWebsiteSummary`**
(mapped from: UserWebsitesGet200ResponseUserWebsiteSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
userWebsitesGet200Response | userWebsitesGet200Response | long | | kotlin.Long | Primary Key | *one*
userWebsiteSummary | userWebsiteSummary | long | | kotlin.Long | Foreign Key | *many*




