
# Table `catalogs_list_200_response`
(mapped from: CatalogsList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Catalog&gt;**](Catalog.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `CatalogsList200ResponseCatalog`**
(mapped from: CatalogsList200ResponseCatalog)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsList200Response | catalogsList200Response | long | | kotlin.Long | Primary Key | *one*
catalog | catalog | long | | kotlin.Long | Foreign Key | *many*




