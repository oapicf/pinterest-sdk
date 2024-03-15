
# Table `AdAccountsCountryResponse`
(mapped from: AdAccountsCountryResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdAccountsCountryResponseData&gt;**](AdAccountsCountryResponseData.md) |  |  [optional]


# **Table `AdAccountsCountryResponseAdAccountsCountryResponseData`**
(mapped from: AdAccountsCountryResponseAdAccountsCountryResponseData)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adAccountsCountryResponse | adAccountsCountryResponse | long | | kotlin.Long | Primary Key | *one*
adAccountsCountryResponseData | adAccountsCountryResponseData | long | | kotlin.Long | Foreign Key | *many*



