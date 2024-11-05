

# TargetingTemplateGetResponseData

The class is defined in **[TargetingTemplateGetResponseData.java](../../src/main/java/org/openapitools/model/TargetingTemplateGetResponseData.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | `String` | targeting template name |  [optional property]
**autoTargetingEnabled** | `Boolean` | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. |  [optional property]
**targetingAttributes** | [`TargetingSpec`](TargetingSpec.md) |  |  [optional property]
**placementGroup** | `PlacementGroupType` |  |  [optional property]
**keywords** | [`List&lt;TargetingTemplateKeyword&gt;`](TargetingTemplateKeyword.md) |  |  [optional property]
**trackingUrls** | [`TrackingUrls`](TrackingUrls.md) |  |  [optional property]
**id** | `String` | Targeting template ID. |  [optional property]
**createdTime** | `Integer` | Targeting template created time. Unix timestamp in seconds. |  [optional property]
**updatedTime** | `Integer` | Targeting template updated time.Unix timestamp in seconds. |  [optional property]
**adAccountId** | `String` | The ID of the advertiser that this targeting template belongs to. |  [optional property]
**status** | [**StatusEnum**](#StatusEnum) | Indicate targeting template is active or Deleted |  [optional property]
**sizing** | [`TargetingTemplateAudienceSizing`](TargetingTemplateAudienceSizing.md) |  |  [optional property]
**valid** | `Boolean` | Inform if the targeting template is valid (ex. would be false if has revoked audience) |  [optional property]











## StatusEnum

Name | Value
---- | -----
ACTIVE | `"ACTIVE"`
DELETED | `"DELETED"`




