

# TargetingTemplate

The class is defined in **[TargetingTemplate.java](../../src/main/java/org/openapitools/model/TargetingTemplate.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | `String` | The ID of the advertiser that this targeting template belongs to. |  [optional property] [readonly property]
**autoTargetingEnabled** | `Boolean` | Enable auto-targeting for ad group. Also known as [\&quot;expanded targeting\&quot;](https://help.pinterest.com/en/business/article/expanded-targeting). |  [optional property]
**createdTime** | `Integer` | Targeting template created time. Unix timestamp in seconds. |  [optional property] [readonly property]
**id** | `String` | Targeting template ID. |  [optional property] [readonly property]
**keywords** | [`List&lt;TargetingTemplateKeyword&gt;`](TargetingTemplateKeyword.md) |  |  [optional property]
**name** | `String` | targeting template name | 
**placementGroup** | `PlacementGroupType` |  |  [optional property]
**sizing** | [`TargetingTemplateAudienceSizing`](TargetingTemplateAudienceSizing.md) |  |  [optional property] [readonly property]
**status** | `TargetingTemplateStatus` | Indicate targeting template is active or Deleted |  [optional property] [readonly property]
**targetingAttributes** | [`TargetingSpecOptimal`](TargetingSpecOptimal.md) | targeting profile attributes | 
**trackingUrls** | [`TrackingUrls`](TrackingUrls.md) |  |  [optional property]
**updatedTime** | `Integer` | Targeting template updated time.Unix timestamp in seconds. |  [optional property] [readonly property]
**valid** | `Boolean` | Inform if the targeting template is valid (ex. would be false if has revoked audience) |  [optional property] [readonly property]















