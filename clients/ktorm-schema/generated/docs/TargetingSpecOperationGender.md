
# Table `TargetingSpecOperationGender`
(mapped from: TargetingSpecOperationGender)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**field** | field | text NOT NULL |  | [**field**](#Field) |  | 
**operation** | operation | long NOT NULL |  | [**TargetingSpecListOperation**](TargetingSpecListOperation.md) |  |  [foreignkey]
**propertyValues** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TargetingSpecGender&gt;**](TargetingSpecGender.md) |  | 




# **Table `TargetingSpecOperationGenderTargetingSpecGender`**
(mapped from: TargetingSpecOperationGenderTargetingSpecGender)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpecOperationGender | targetingSpecOperationGender | long | | kotlin.Long | Primary Key | *one*
targetingSpecGender | targetingSpecGender | long | | kotlin.Long | Foreign Key | *many*



