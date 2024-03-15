
# Table `CatalogsProductGroupMultipleCountriesCriteria`
(mapped from: CatalogsProductGroupMultipleCountriesCriteria)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**propertyValues** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Country&gt;**](Country.md) |  | 
**negated** | negated | boolean |  | **kotlin.Boolean** |  |  [optional]


# **Table `CatalogsProductGroupMultipleCountriesCriteriaCountry`**
(mapped from: CatalogsProductGroupMultipleCountriesCriteriaCountry)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsProductGroupMultipleCountriesCriteria | catalogsProductGroupMultipleCountriesCriteria | long | | kotlin.Long | Primary Key | *one*
country | country | long | | kotlin.Long | Foreign Key | *many*




