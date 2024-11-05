
# Table `business_assets_get_200_response`
(mapped from: BusinessAssetsGet200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;GetBusinessAssetsResponse&gt;**](GetBusinessAssetsResponse.md) | List of assets the requesting business has access to. | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `BusinessAssetsGet200ResponseGetBusinessAssetsResponse`**
(mapped from: BusinessAssetsGet200ResponseGetBusinessAssetsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
businessAssetsGet200Response | businessAssetsGet200Response | long | | kotlin.Long | Primary Key | *one*
getBusinessAssetsResponse | getBusinessAssetsResponse | long | | kotlin.Long | Foreign Key | *many*




