

# CampaignBidOptionsUpdate

Object describing an update to the campaign level bid multipliers.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appTypeMultipliers** | **AppTypeMultipliers** |  |  [optional]
**audienceMultipliers** | **CampaignAudienceMultipliers** |  |  [optional]
**placementMultipliers** | **PlacementMultipliers** |  |  [optional]
**updateMask** | [**Seq[UpdateMask]**](#Seq[UpdateMask]) | List of fields to update, only the fields in the list will be updated. | 


## Enum: Seq[UpdateMask]
Allowed values: [AUDIENCE, APP_TYPE, PLACEMENT, GENDER, AGE_BUCKET]




