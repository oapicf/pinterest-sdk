

# TargetingTemplateGetResponseData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | targeting template name |  [optional] |
|**autoTargetingEnabled** | **Boolean** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. |  [optional] |
|**targetingAttributes** | [**TargetingSpec**](TargetingSpec.md) |  |  [optional] |
|**placementGroup** | **PlacementGroupType** |  |  [optional] |
|**keywords** | [**List&lt;TargetingTemplateKeyword&gt;**](TargetingTemplateKeyword.md) |  |  [optional] |
|**trackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  |  [optional] |
|**id** | **String** | Targeting template ID. |  [optional] |
|**createdTime** | **Integer** | Targeting template created time. Unix timestamp in seconds. |  [optional] |
|**updatedTime** | **Integer** | Targeting template updated time.Unix timestamp in seconds. |  [optional] |
|**adAccountId** | **String** | The ID of the advertiser that this targeting template belongs to. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Indicate targeting template is active or Deleted |  [optional] |
|**sizing** | [**TargetingTemplateAudienceSizing**](TargetingTemplateAudienceSizing.md) |  |  [optional] |
|**valid** | **Boolean** | Inform if the targeting template is valid (ex. would be false if has revoked audience) |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| DELETED | &quot;DELETED&quot; |



