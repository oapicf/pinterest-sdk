# # TargetingTemplateResponseData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auto_targeting_enabled** | **bool** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional] [default to true]
**keywords** | [**\OpenAPI\Client\Model\TargetingTemplateKeyword[]**](TargetingTemplateKeyword.md) |  | [optional]
**name** | **string** | targeting template name | [optional]
**placement_group** | [**\OpenAPI\Client\Model\PlacementGroupType**](PlacementGroupType.md) |  | [optional]
**targeting_attributes** | [**\OpenAPI\Client\Model\TargetingSpec**](TargetingSpec.md) |  | [optional]
**tracking_urls** | [**\OpenAPI\Client\Model\TrackingUrls**](TrackingUrls.md) |  | [optional]
**ad_account_id** | **string** | The ID of the advertiser that this targeting template belongs to. | [optional]
**created_time** | **int** | Targeting template created time. Unix timestamp in seconds. | [optional]
**id** | **string** | Targeting template ID. | [optional]
**sizing** | [**\OpenAPI\Client\Model\TargetingTemplateAudienceSizing**](TargetingTemplateAudienceSizing.md) |  | [optional]
**status** | **string** | Indicate targeting template is active or Deleted | [optional] [default to 'ACTIVE']
**updated_time** | **int** | Targeting template updated time.Unix timestamp in seconds. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
