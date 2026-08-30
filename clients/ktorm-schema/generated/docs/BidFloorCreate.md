
# Table `BidFloorCreate`
(mapped from: BidFloorCreate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**bidFloorSpecs** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BidFloorSpec&gt;**](BidFloorSpec.md) | List of bid floor specifications. | 
**targetingSpec** | targeting_spec | long |  | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) | Ad group targeting specification defining the ad group target audience. |  [optional] [foreignkey]


# **Table `BidFloorCreateBidFloorSpec`**
(mapped from: BidFloorCreateBidFloorSpec)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
bidFloorCreate | bidFloorCreate | long | | kotlin.Long | Primary Key | *one*
bidFloorSpec | bidFloorSpec | long | | kotlin.Long | Foreign Key | *many*




