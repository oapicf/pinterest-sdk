
# Table `ad_accounts_catalogs_product_groups_list_200_response`
(mapped from: AdAccountsCatalogsProductGroupsList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CatalogProductGroup&gt;**](CatalogProductGroup.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `AdAccountsCatalogsProductGroupsList200ResponseCatalogProductGroup`**
(mapped from: AdAccountsCatalogsProductGroupsList200ResponseCatalogProductGroup)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adAccountsCatalogsProductGroupsList200Response | adAccountsCatalogsProductGroupsList200Response | long | | kotlin.Long | Primary Key | *one*
catalogProductGroup | catalogProductGroup | long | | kotlin.Long | Foreign Key | *many*




