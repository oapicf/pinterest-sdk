
# Table `TargetingSpecOperationAgeBucket`
(mapped from: TargetingSpecOperationAgeBucket)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**field** | field | text NOT NULL |  | [**field**](#Field) |  | 
**operation** | operation | text NOT NULL |  | [**operation**](#Operation) |  | 
**propertyValues** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TargetingSpecAgeBucket&gt;**](TargetingSpecAgeBucket.md) |  | 




# **Table `TargetingSpecOperationAgeBucketTargetingSpecAgeBucket`**
(mapped from: TargetingSpecOperationAgeBucketTargetingSpecAgeBucket)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpecOperationAgeBucket | targetingSpecOperationAgeBucket | long | | kotlin.Long | Primary Key | *one*
targetingSpecAgeBucket | targetingSpecAgeBucket | long | | kotlin.Long | Foreign Key | *many*



