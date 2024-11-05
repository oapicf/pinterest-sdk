# TargetingTemplateGetResponseData
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **name** | **String** | targeting template name | [optional] [default to null] |
| **auto\_targeting\_enabled** | **Boolean** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional] [default to true] |
| **targeting\_attributes** | [**TargetingSpec**](TargetingSpec.md) |  | [optional] [default to null] |
| **placement\_group** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional] [default to null] |
| **keywords** | [**List**](TargetingTemplateKeyword.md) |  | [optional] [default to null] |
| **tracking\_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] [default to null] |
| **id** | **String** | Targeting template ID. | [optional] [default to null] |
| **created\_time** | **Integer** | Targeting template created time. Unix timestamp in seconds. | [optional] [default to null] |
| **updated\_time** | **Integer** | Targeting template updated time.Unix timestamp in seconds. | [optional] [default to null] |
| **ad\_account\_id** | **String** | The ID of the advertiser that this targeting template belongs to. | [optional] [default to null] |
| **status** | **String** | Indicate targeting template is active or Deleted | [optional] [default to ACTIVE] |
| **sizing** | [**TargetingTemplateAudienceSizing**](TargetingTemplateAudienceSizing.md) |  | [optional] [default to null] |
| **valid** | **Boolean** | Inform if the targeting template is valid (ex. would be false if has revoked audience) | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

