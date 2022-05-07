
# Table `CatalogsProductGroupMultipleStringCriteria`
(mapped from: CatalogsProductGroupMultipleStringCriteria)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**propertyValues** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  | 
**negated** | negated | boolean NOT NULL |  | **kotlin.Boolean** |  | 


# **Table `CatalogsProductGroupMultipleStringCriteriaPropertyValues`**
(mapped from: CatalogsProductGroupMultipleStringCriteriaPropertyValues)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsProductGroupMultipleStringCriteria | catalogsProductGroupMultipleStringCriteria | long | | kotlin.Long | Primary Key | *one*
propertyValues | propertyValues | text | | kotlin.String | Foreign Key | *many*




