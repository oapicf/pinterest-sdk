# TargetingTemplate
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String** | The ID of the advertiser that this targeting template belongs to. | [optional] [default to null] |
| **auto\_targeting\_enabled** | **Boolean** | Enable auto-targeting for ad group. Also known as [\&quot;expanded targeting\&quot;](https://help.pinterest.com/en/business/article/expanded-targeting). | [optional] [default to true] |
| **created\_time** | **Integer** | Targeting template created time. Unix timestamp in seconds. | [optional] [default to null] |
| **id** | **String** | Targeting template ID. | [optional] [default to null] |
| **keywords** | [**List**](TargetingTemplateKeyword.md) |  | [optional] [default to null] |
| **name** | **String** | targeting template name | [default to null] |
| **placement\_group** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional] [default to null] |
| **sizing** | [**TargetingTemplateAudienceSizing**](TargetingTemplateAudienceSizing.md) |  | [optional] [default to null] |
| **status** | [**TargetingTemplateStatus**](TargetingTemplateStatus.md) | Indicate targeting template is active or Deleted | [optional] [default to null] |
| **targeting\_attributes** | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) | targeting profile attributes | [default to null] |
| **tracking\_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] [default to null] |
| **updated\_time** | **Integer** | Targeting template updated time.Unix timestamp in seconds. | [optional] [default to null] |
| **valid** | **Boolean** | Inform if the targeting template is valid (ex. would be false if has revoked audience) | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

