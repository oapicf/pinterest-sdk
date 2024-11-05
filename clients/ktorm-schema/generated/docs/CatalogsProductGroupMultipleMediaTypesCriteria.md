
# Table `CatalogsProductGroupMultipleMediaTypesCriteria`
(mapped from: CatalogsProductGroupMultipleMediaTypesCriteria)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**propertyValues** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MediaType&gt;**](MediaType.md) |  | 
**negated** | negated | boolean |  | **kotlin.Boolean** |  |  [optional]


# **Table `CatalogsProductGroupMultipleMediaTypesCriteriaMediaType`**
(mapped from: CatalogsProductGroupMultipleMediaTypesCriteriaMediaType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsProductGroupMultipleMediaTypesCriteria | catalogsProductGroupMultipleMediaTypesCriteria | long | | kotlin.Long | Primary Key | *one*
mediaType | mediaType | long | | kotlin.Long | Foreign Key | *many*




