
# Table `TargetingSpecOperationGeo`
(mapped from: TargetingSpecOperationGeo)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**field** | field | text NOT NULL |  | [**field**](#Field) |  | 
**operation** | operation | long NOT NULL |  | [**TargetingSpecListOperation**](TargetingSpecListOperation.md) |  |  [foreignkey]
**propertyValues** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  | 




# **Table `TargetingSpecOperationGeoPropertyValues`**
(mapped from: TargetingSpecOperationGeoPropertyValues)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpecOperationGeo | targetingSpecOperationGeo | long | | kotlin.Long | Primary Key | *one*
propertyValues | propertyValues | text | | kotlin.String | Foreign Key | *many*



