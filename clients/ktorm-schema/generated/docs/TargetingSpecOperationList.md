
# Table `TargetingSpecOperationList`
(mapped from: TargetingSpecOperationList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**field** | field | text NOT NULL |  | **kotlin.String** |  | 
**operation** | operation | text NOT NULL |  | [**operation**](#Operation) |  | 
**propertyValues** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  | 




# **Table `TargetingSpecOperationListPropertyValues`**
(mapped from: TargetingSpecOperationListPropertyValues)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpecOperationList | targetingSpecOperationList | long | | kotlin.Long | Primary Key | *one*
propertyValues | propertyValues | text | | kotlin.String | Foreign Key | *many*



