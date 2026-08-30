
# Table `TargetingSpecOperationLocale`
(mapped from: TargetingSpecOperationLocale)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**field** | field | text NOT NULL |  | [**field**](#Field) |  | 
**operation** | operation | long NOT NULL |  | [**TargetingSpecListOperation**](TargetingSpecListOperation.md) |  |  [foreignkey]
**propertyValues** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  | 




# **Table `TargetingSpecOperationLocalePropertyValues`**
(mapped from: TargetingSpecOperationLocalePropertyValues)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpecOperationLocale | targetingSpecOperationLocale | long | | kotlin.Long | Primary Key | *one*
propertyValues | propertyValues | text | | kotlin.String | Foreign Key | *many*



