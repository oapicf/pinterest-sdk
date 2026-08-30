
# TargetingTemplate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **kotlin.String** | targeting template name | 
**targetingAttributes** | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) | targeting profile attributes | 
**adAccountId** | **kotlin.String** | The ID of the advertiser that this targeting template belongs to. |  [optional] [readonly]
**autoTargetingEnabled** | **kotlin.Boolean** | Enable auto-targeting for ad group. Also known as [\&quot;expanded targeting\&quot;](https://help.pinterest.com/en/business/article/expanded-targeting). |  [optional]
**createdTime** | **kotlin.Int** | Targeting template created time. Unix timestamp in seconds. |  [optional] [readonly]
**id** | **kotlin.String** | Targeting template ID. |  [optional] [readonly]
**keywords** | [**kotlin.collections.List&lt;TargetingTemplateKeyword&gt;**](TargetingTemplateKeyword.md) |  |  [optional]
**placementGroup** | [**PlacementGroupType**](PlacementGroupType.md) |  |  [optional]
**sizing** | [**TargetingTemplateAudienceSizing**](TargetingTemplateAudienceSizing.md) |  |  [optional] [readonly]
**status** | [**TargetingTemplateStatus**](TargetingTemplateStatus.md) | Indicate targeting template is active or Deleted |  [optional] [readonly]
**trackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  |  [optional]
**updatedTime** | **kotlin.Int** | Targeting template updated time.Unix timestamp in seconds. |  [optional] [readonly]
**valid** | **kotlin.Boolean** | Inform if the targeting template is valid (ex. would be false if has revoked audience) |  [optional] [readonly]



