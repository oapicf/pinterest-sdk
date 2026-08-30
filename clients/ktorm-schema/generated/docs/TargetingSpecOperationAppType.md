
# Table `TargetingSpecOperationAppType`
(mapped from: TargetingSpecOperationAppType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**field** | field | text NOT NULL |  | [**field**](#Field) |  | 
**operation** | operation | long NOT NULL |  | [**TargetingSpecListOperation**](TargetingSpecListOperation.md) |  |  [foreignkey]
**propertyValues** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TargetingSpecAppType&gt;**](TargetingSpecAppType.md) |  | 




# **Table `TargetingSpecOperationAppTypeTargetingSpecAppType`**
(mapped from: TargetingSpecOperationAppTypeTargetingSpecAppType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpecOperationAppType | targetingSpecOperationAppType | long | | kotlin.Long | Primary Key | *one*
targetingSpecAppType | targetingSpecAppType | long | | kotlin.Long | Foreign Key | *many*



