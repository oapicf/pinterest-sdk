
# Table `CampaignBidOptionsUpdate`
(mapped from: CampaignBidOptionsUpdate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**updateMask** | `One-To-Many` | `----` | `----`  | [**update_mask**](#kotlin.Array&lt;UpdateMask&gt;) | List of fields to update, only the fields in the list will be updated. | 
**appTypeMultipliers** | app_type_multipliers | long |  | [**AppTypeMultipliers**](AppTypeMultipliers.md) |  |  [optional] [foreignkey]
**audienceMultipliers** | audience_multipliers | long |  | [**CampaignAudienceMultipliers**](CampaignAudienceMultipliers.md) |  |  [optional] [foreignkey]
**placementMultipliers** | placement_multipliers | long |  | [**PlacementMultipliers**](PlacementMultipliers.md) |  |  [optional] [foreignkey]


# **Table `CampaignBidOptionsUpdateUpdateMask`**
(mapped from: CampaignBidOptionsUpdateUpdateMask)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
campaignBidOptionsUpdate | campaignBidOptionsUpdate | long | | kotlin.Long | Primary Key | *one*
updateMask | updateMask | text | | kotlin.String | Foreign Key | *many*






