
# Table `CatalogsProductGroupMultiplePinterestProductCategoryCriteria`
(mapped from: CatalogsProductGroupMultiplePinterestProductCategoryCriteria)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**propertyValues** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ProductCategoryEnum&gt;**](ProductCategoryEnum.md) |  | 
**negated** | negated | boolean |  | **kotlin.Boolean** |  |  [optional]


# **Table `CatalogsProductGroupMultiplePinterestProductCategoryCriteriaProductCategoryEnum`**
(mapped from: CatalogsProductGroupMultiplePinterestProductCategoryCriteriaProductCategoryEnum)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsProductGroupMultiplePinterestProductCategoryCriteria | catalogsProductGroupMultiplePinterestProductCategoryCriteria | long | | kotlin.Long | Primary Key | *one*
productCategoryEnum | productCategoryEnum | long | | kotlin.Long | Foreign Key | *many*




