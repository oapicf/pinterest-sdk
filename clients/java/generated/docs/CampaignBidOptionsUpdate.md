

# CampaignBidOptionsUpdate

Object describing an update to the campaign level bid multipliers.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**appTypeMultipliers** | **AppTypeMultipliers** |  |  [optional] |
|**audienceMultipliers** | **CampaignAudienceMultipliers** |  |  [optional] |
|**placementMultipliers** | **PlacementMultipliers** |  |  [optional] |
|**updateMask** | [**List&lt;UpdateMaskEnum&gt;**](#List&lt;UpdateMaskEnum&gt;) | List of fields to update, only the fields in the list will be updated. |  |



## Enum: List&lt;UpdateMaskEnum&gt;

| Name | Value |
|---- | -----|
| AUDIENCE | &quot;AUDIENCE&quot; |
| APP_TYPE | &quot;APP_TYPE&quot; |
| PLACEMENT | &quot;PLACEMENT&quot; |
| GENDER | &quot;GENDER&quot; |
| AGE_BUCKET | &quot;AGE_BUCKET&quot; |



