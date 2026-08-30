
# Table `audiences_list_200_response`
(mapped from: AudiencesList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdAccountsAudience&gt;**](AdAccountsAudience.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `AudiencesList200ResponseAdAccountsAudience`**
(mapped from: AudiencesList200ResponseAdAccountsAudience)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
audiencesList200Response | audiencesList200Response | long | | kotlin.Long | Primary Key | *one*
adAccountsAudience | adAccountsAudience | long | | kotlin.Long | Foreign Key | *many*




