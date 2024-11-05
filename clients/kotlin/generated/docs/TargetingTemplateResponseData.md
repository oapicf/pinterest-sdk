
# TargetingTemplateResponseData

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** | targeting template name |  [optional] |
| **autoTargetingEnabled** | **kotlin.Boolean** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. |  [optional] |
| **targetingAttributes** | [**TargetingSpec**](TargetingSpec.md) |  |  [optional] |
| **placementGroup** | [**PlacementGroupType**](PlacementGroupType.md) |  |  [optional] |
| **keywords** | [**kotlin.collections.List&lt;TargetingTemplateKeyword&gt;**](TargetingTemplateKeyword.md) |  |  [optional] |
| **trackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  |  [optional] |
| **id** | **kotlin.String** | Targeting template ID. |  [optional] |
| **createdTime** | **kotlin.Int** | Targeting template created time. Unix timestamp in seconds. |  [optional] |
| **updatedTime** | **kotlin.Int** | Targeting template updated time.Unix timestamp in seconds. |  [optional] |
| **adAccountId** | **kotlin.String** | The ID of the advertiser that this targeting template belongs to. |  [optional] |
| **status** | [**inline**](#Status) | Indicate targeting template is active or Deleted |  [optional] |
| **sizing** | [**TargetingTemplateAudienceSizing**](TargetingTemplateAudienceSizing.md) |  |  [optional] |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | ACTIVE, DELETED |



