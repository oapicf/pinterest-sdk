
# Table `catalogs_product_groups_list_200_response`
(mapped from: CatalogsProductGroupsList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CatalogsVerticalProductGroup&gt;**](CatalogsVerticalProductGroup.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `CatalogsProductGroupsList200ResponseCatalogsVerticalProductGroup`**
(mapped from: CatalogsProductGroupsList200ResponseCatalogsVerticalProductGroup)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsProductGroupsList200Response | catalogsProductGroupsList200Response | long | | kotlin.Long | Primary Key | *one*
catalogsVerticalProductGroup | catalogsVerticalProductGroup | long | | kotlin.Long | Foreign Key | *many*




