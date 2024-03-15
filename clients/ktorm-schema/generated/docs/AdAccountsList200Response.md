
# Table `ad_accounts_list_200_response`
(mapped from: AdAccountsList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdAccount&gt;**](AdAccount.md) | Ad accounts | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `AdAccountsList200ResponseAdAccount`**
(mapped from: AdAccountsList200ResponseAdAccount)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adAccountsList200Response | adAccountsList200Response | long | | kotlin.Long | Primary Key | *one*
adAccount | adAccount | long | | kotlin.Long | Foreign Key | *many*




