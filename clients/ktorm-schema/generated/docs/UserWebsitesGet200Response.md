
# Table `user_websites_get_200_response`
(mapped from: UserWebsitesGet200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;UserWebsite&gt;**](UserWebsite.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `UserWebsitesGet200ResponseUserWebsite`**
(mapped from: UserWebsitesGet200ResponseUserWebsite)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
userWebsitesGet200Response | userWebsitesGet200Response | long | | kotlin.Long | Primary Key | *one*
userWebsite | userWebsite | long | | kotlin.Long | Foreign Key | *many*




