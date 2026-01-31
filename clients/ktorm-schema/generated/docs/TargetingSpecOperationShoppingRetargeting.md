
# Table `TargetingSpecOperationShoppingRetargeting`
(mapped from: TargetingSpecOperationShoppingRetargeting)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**field** | field | text NOT NULL |  | [**field**](#Field) |  | 
**operation** | operation | text NOT NULL |  | [**operation**](#Operation) |  | 
**propertyValues** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TargetingSpecShoppingRetargeting&gt;**](TargetingSpecShoppingRetargeting.md) |  | 




# **Table `TargetingSpecOperationShoppingRetargetingTargetingSpecShoppingRetargeting`**
(mapped from: TargetingSpecOperationShoppingRetargetingTargetingSpecShoppingRetargeting)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpecOperationShoppingRetargeting | targetingSpecOperationShoppingRetargeting | long | | kotlin.Long | Primary Key | *one*
targetingSpecShoppingRetargeting | targetingSpecShoppingRetargeting | long | | kotlin.Long | Foreign Key | *many*



