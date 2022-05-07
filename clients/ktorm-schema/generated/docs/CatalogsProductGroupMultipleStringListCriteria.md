
# Table `CatalogsProductGroupMultipleStringListCriteria`
(mapped from: CatalogsProductGroupMultipleStringListCriteria)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**propertyValues** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.Array&lt;kotlin.String&gt;&gt;** |  | 
**negated** | negated | boolean NOT NULL |  | **kotlin.Boolean** |  | 


# **Table `CatalogsProductGroupMultipleStringListCriteriaPropertyValues`**
(mapped from: CatalogsProductGroupMultipleStringListCriteriaPropertyValues)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsProductGroupMultipleStringListCriteria | catalogsProductGroupMultipleStringListCriteria | long | | kotlin.Long | Primary Key | *one*
propertyValues | propertyValues | blob | | kotlin.Array<kotlin.String> | Foreign Key | *many*




