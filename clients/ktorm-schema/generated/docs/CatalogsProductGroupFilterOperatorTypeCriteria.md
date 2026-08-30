
# Table `CatalogsProductGroupFilterOperatorTypeCriteria`
(mapped from: CatalogsProductGroupFilterOperatorTypeCriteria)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**propertyValues** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  | 
**filterOperatorType** | filter_operator_type | long |  | [**FilterOperatorType**](FilterOperatorType.md) |  |  [optional] [foreignkey]
**negated** | negated | boolean |  | **kotlin.Boolean** |  |  [optional]


# **Table `CatalogsProductGroupFilterOperatorTypeCriteriaPropertyValues`**
(mapped from: CatalogsProductGroupFilterOperatorTypeCriteriaPropertyValues)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
catalogsProductGroupFilterOperatorTypeCriteria | catalogsProductGroupFilterOperatorTypeCriteria | long | | kotlin.Long | Primary Key | *one*
propertyValues | propertyValues | text | | kotlin.String | Foreign Key | *many*





