# TargetingTemplate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **string** | The ID of the advertiser that this targeting template belongs to. | [optional] [readonly]
**auto_targeting_enabled** | **bool** | Enable auto-targeting for ad group. Also known as [\&quot;expanded targeting\&quot;](https://help.pinterest.com/en/business/article/expanded-targeting). | [optional] [default to true]
**created_time** | **int** | Targeting template created time. Unix timestamp in seconds. | [optional] [readonly]
**id** | **string** | Targeting template ID. | [optional] [readonly]
**keywords** | [**\OpenAPI\Client\Model\TargetingTemplateKeyword[]**](TargetingTemplateKeyword.md) |  | [optional]
**name** | **string** | targeting template name |
**placement_group** | [**\OpenAPI\Client\Model\PlacementGroupType**](PlacementGroupType.md) |  | [optional]
**sizing** | [**\OpenAPI\Client\Model\TargetingTemplateAudienceSizing**](TargetingTemplateAudienceSizing.md) |  | [optional] [readonly]
**status** | [**\OpenAPI\Client\Model\TargetingTemplateStatus**](TargetingTemplateStatus.md) | Indicate targeting template is active or Deleted | [optional] [readonly]
**targeting_attributes** | [**\OpenAPI\Client\Model\TargetingSpecOptimal**](TargetingSpecOptimal.md) | targeting profile attributes |
**tracking_urls** | [**\OpenAPI\Client\Model\TrackingUrls**](TrackingUrls.md) |  | [optional]
**updated_time** | **int** | Targeting template updated time.Unix timestamp in seconds. | [optional] [readonly]
**valid** | **bool** | Inform if the targeting template is valid (ex. would be false if has revoked audience) | [optional] [readonly]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
