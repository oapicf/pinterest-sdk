
# Table `catalogs_product_groups_list_200_response`
(mapped from: CatalogsProductGroupsList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CatalogsProductGroupsList200ResponseAllOfItemsInner&gt;**](CatalogsProductGroupsList200ResponseAllOfItemsInner.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `CatalogsProductGroupsList200ResponseCatalogsProductGroupsList200ResponseAllOfItemsInner`**
(mapped from: CatalogsProductGroupsList200ResponseCatalogsProductGroupsList200ResponseAllOfItemsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsProductGroupsList200Response | catalogsProductGroupsList200Response | long | | kotlin.Long | Primary Key | *one*
catalogsProductGroupsList200ResponseAllOfItemsInner | catalogsProductGroupsList200ResponseAllOfItemsInner | long | | kotlin.Long | Foreign Key | *many*




