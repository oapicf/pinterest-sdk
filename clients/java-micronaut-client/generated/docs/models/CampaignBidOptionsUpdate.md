

# CampaignBidOptionsUpdate

Object describing an update to the campaign level bid multipliers.

The class is defined in **[CampaignBidOptionsUpdate.java](../../src/main/java/org/openapitools/model/CampaignBidOptionsUpdate.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appTypeMultipliers** | `AppTypeMultipliers` |  |  [optional property]
**audienceMultipliers** | `CampaignAudienceMultipliers` |  |  [optional property]
**placementMultipliers** | `PlacementMultipliers` |  |  [optional property]
**updateMask** | [**List&lt;UpdateMaskEnum&gt;**](#List&lt;UpdateMaskEnum&gt;) | List of fields to update, only the fields in the list will be updated. | 




## List&lt;UpdateMaskEnum&gt;

Name | Value
---- | -----
AUDIENCE | `"AUDIENCE"`
APP_TYPE | `"APP_TYPE"`
PLACEMENT | `"PLACEMENT"`
GENDER | `"GENDER"`
AGE_BUCKET | `"AGE_BUCKET"`


