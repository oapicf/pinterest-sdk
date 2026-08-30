
# Table `business_assets_get_200_response`
(mapped from: BusinessAssetsGet200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BusinessAssets&gt;**](BusinessAssets.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `BusinessAssetsGet200ResponseBusinessAssets`**
(mapped from: BusinessAssetsGet200ResponseBusinessAssets)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
businessAssetsGet200Response | businessAssetsGet200Response | long | | kotlin.Long | Primary Key | *one*
businessAssets | businessAssets | long | | kotlin.Long | Foreign Key | *many*




