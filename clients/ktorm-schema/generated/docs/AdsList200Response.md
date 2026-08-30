
# Table `ads_list_200_response`
(mapped from: AdsList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Ad&gt;**](Ad.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `AdsList200ResponseAd`**
(mapped from: AdsList200ResponseAd)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adsList200Response | adsList200Response | long | | kotlin.Long | Primary Key | *one*
ad | ad | long | | kotlin.Long | Foreign Key | *many*




