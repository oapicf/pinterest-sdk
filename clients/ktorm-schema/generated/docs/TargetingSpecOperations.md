
# Table `TargetingSpecOperations`
(mapped from: TargetingSpecOperations)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**field** | field | text NOT NULL |  | [**field**](#Field) |  | 
**operation** | operation | text NOT NULL |  | [**operation**](#Operation) |  | 
**propertyValues** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TargetingSpecShoppingRetargeting&gt;**](TargetingSpecShoppingRetargeting.md) |  | 
**value** | value | text NOT NULL |  | **kotlin.String** |  | 




# **Table `TargetingSpecOperationsTargetingSpecShoppingRetargeting`**
(mapped from: TargetingSpecOperationsTargetingSpecShoppingRetargeting)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpecOperations | targetingSpecOperations | long | | kotlin.Long | Primary Key | *one*
targetingSpecShoppingRetargeting | targetingSpecShoppingRetargeting | long | | kotlin.Long | Foreign Key | *many*




