
# Table `ads_list_200_response`
(mapped from: AdsList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdResponse&gt;**](AdResponse.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `AdsList200ResponseAdResponse`**
(mapped from: AdsList200ResponseAdResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adsList200Response | adsList200Response | long | | kotlin.Long | Primary Key | *one*
adResponse | adResponse | long | | kotlin.Long | Foreign Key | *many*




