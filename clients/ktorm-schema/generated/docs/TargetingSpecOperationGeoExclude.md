
# Table `TargetingSpecOperationGeoExclude`
(mapped from: TargetingSpecOperationGeoExclude)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**field** | field | text NOT NULL |  | [**field**](#Field) |  | 
**operation** | operation | long NOT NULL |  | [**TargetingSpecListOperation**](TargetingSpecListOperation.md) |  |  [foreignkey]
**propertyValues** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  | 




# **Table `TargetingSpecOperationGeoExcludePropertyValues`**
(mapped from: TargetingSpecOperationGeoExcludePropertyValues)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpecOperationGeoExclude | targetingSpecOperationGeoExclude | long | | kotlin.Long | Primary Key | *one*
propertyValues | propertyValues | text | | kotlin.String | Foreign Key | *many*



