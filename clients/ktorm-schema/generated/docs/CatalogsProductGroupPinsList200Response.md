
# Table `catalogs_product_group_pins_list_200_response`
(mapped from: CatalogsProductGroupPinsList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CatalogsProduct&gt;**](CatalogsProduct.md) | Pins | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `CatalogsProductGroupPinsList200ResponseCatalogsProduct`**
(mapped from: CatalogsProductGroupPinsList200ResponseCatalogsProduct)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsProductGroupPinsList200Response | catalogsProductGroupPinsList200Response | long | | kotlin.Long | Primary Key | *one*
catalogsProduct | catalogsProduct | long | | kotlin.Long | Foreign Key | *many*




