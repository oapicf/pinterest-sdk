
# Table `ad_account_countries_get_200_response`
(mapped from: AdAccountCountriesGet200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdAccountsCountry&gt;**](AdAccountsCountry.md) |  | 


# **Table `AdAccountCountriesGet200ResponseAdAccountsCountry`**
(mapped from: AdAccountCountriesGet200ResponseAdAccountsCountry)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adAccountCountriesGet200Response | adAccountCountriesGet200Response | long | | kotlin.Long | Primary Key | *one*
adAccountsCountry | adAccountsCountry | long | | kotlin.Long | Foreign Key | *many*



