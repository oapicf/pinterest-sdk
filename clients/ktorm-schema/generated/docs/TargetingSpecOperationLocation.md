
# Table `TargetingSpecOperationLocation`
(mapped from: TargetingSpecOperationLocation)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**field** | field | text NOT NULL |  | [**field**](#Field) |  | 
**operation** | operation | long NOT NULL |  | [**TargetingSpecListOperation**](TargetingSpecListOperation.md) |  |  [foreignkey]
**propertyValues** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  | 




# **Table `TargetingSpecOperationLocationPropertyValues`**
(mapped from: TargetingSpecOperationLocationPropertyValues)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpecOperationLocation | targetingSpecOperationLocation | long | | kotlin.Long | Primary Key | *one*
propertyValues | propertyValues | text | | kotlin.String | Foreign Key | *many*



