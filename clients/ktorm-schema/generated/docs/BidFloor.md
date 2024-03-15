
# Table `BidFloor`
(mapped from: BidFloor)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**bidFloors** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.Int&gt;** | A list of bid floors in micro currency. For example, [100000, 200000] |  [optional]
**type** | type | text |  | **kotlin.String** | Always the string &#39;bidfloor&#39; |  [optional]


# **Table `BidFloorBidFloors`**
(mapped from: BidFloorBidFloors)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
bidFloor | bidFloor | long | | kotlin.Long | Primary Key | *one*
bidFloors | bidFloors | int | | kotlin.Int | Foreign Key | *many*




