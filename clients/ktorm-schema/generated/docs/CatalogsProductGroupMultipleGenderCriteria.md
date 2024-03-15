
# Table `CatalogsProductGroupMultipleGenderCriteria`
(mapped from: CatalogsProductGroupMultipleGenderCriteria)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**propertyValues** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Gender&gt;**](Gender.md) |  | 
**negated** | negated | boolean |  | **kotlin.Boolean** |  |  [optional]


# **Table `CatalogsProductGroupMultipleGenderCriteriaGender`**
(mapped from: CatalogsProductGroupMultipleGenderCriteriaGender)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsProductGroupMultipleGenderCriteria | catalogsProductGroupMultipleGenderCriteria | long | | kotlin.Long | Primary Key | *one*
gender | gender | long | | kotlin.Long | Foreign Key | *many*




