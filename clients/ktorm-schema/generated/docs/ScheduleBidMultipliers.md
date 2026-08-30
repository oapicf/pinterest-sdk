
# Table `ScheduleBidMultipliers`
(mapped from: ScheduleBidMultipliers)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**ageBucketMultipliers** | age_bucket_multipliers | long |  | [**BidOptionsAgeBucketMultipliers**](BidOptionsAgeBucketMultipliers.md) |  |  [optional] [foreignkey]
**appTypeMultipliers** | app_type_multipliers | long |  | [**BidOptionsAppTypeMultipliers**](BidOptionsAppTypeMultipliers.md) |  |  [optional] [foreignkey]
**audienceMultipliers** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BidOptionsAudienceMultipliers&gt;**](BidOptionsAudienceMultipliers.md) |  |  [optional]
**genderMultipliers** | gender_multipliers | long |  | [**BidOptionsGenderMultipliers**](BidOptionsGenderMultipliers.md) |  |  [optional] [foreignkey]
**placementMultipliers** | placement_multipliers | long |  | [**BidOptionsPlacementMultipliers**](BidOptionsPlacementMultipliers.md) |  |  [optional] [foreignkey]




# **Table `ScheduleBidMultipliersBidOptionsAudienceMultipliers`**
(mapped from: ScheduleBidMultipliersBidOptionsAudienceMultipliers)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
scheduleBidMultipliers | scheduleBidMultipliers | long | | kotlin.Long | Primary Key | *one*
bidOptionsAudienceMultipliers | bidOptionsAudienceMultipliers | long | | kotlin.Long | Foreign Key | *many*





