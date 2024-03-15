
# Table `BidFloorRequest`
(mapped from: BidFloorRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**bidFloorSpecs** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BidFloorSpec&gt;**](BidFloorSpec.md) |  | 
**targetingSpec** | targeting_spec | long |  | [**TargetingSpec**](TargetingSpec.md) |  |  [optional] [foreignkey]


# **Table `BidFloorRequestBidFloorSpec`**
(mapped from: BidFloorRequestBidFloorSpec)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
bidFloorRequest | bidFloorRequest | long | | kotlin.Long | Primary Key | *one*
bidFloorSpec | bidFloorSpec | long | | kotlin.Long | Foreign Key | *many*




