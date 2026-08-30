

# TargetingTemplate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **String** | The ID of the advertiser that this targeting template belongs to. |  [optional] [readonly]
**autoTargetingEnabled** | **Boolean** | Enable auto-targeting for ad group. Also known as [\&quot;expanded targeting\&quot;](https://help.pinterest.com/en/business/article/expanded-targeting). |  [optional]
**createdTime** | **Int** | Targeting template created time. Unix timestamp in seconds. |  [optional] [readonly]
**id** | **String** | Targeting template ID. |  [optional] [readonly]
**keywords** | [**Seq&lt;TargetingTemplateKeyword&gt;**](TargetingTemplateKeyword.md) |  |  [optional]
**name** | **String** | targeting template name | 
**placementGroup** | **PlacementGroupType** |  |  [optional]
**sizing** | [**TargetingTemplateAudienceSizing**](TargetingTemplateAudienceSizing.md) |  |  [optional] [readonly]
**status** | **TargetingTemplateStatus** | Indicate targeting template is active or Deleted |  [optional] [readonly]
**targetingAttributes** | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) | targeting profile attributes | 
**trackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  |  [optional]
**updatedTime** | **Int** | Targeting template updated time.Unix timestamp in seconds. |  [optional] [readonly]
**valid** | **Boolean** | Inform if the targeting template is valid (ex. would be false if has revoked audience) |  [optional] [readonly]



