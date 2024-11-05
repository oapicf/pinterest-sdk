# TARGETING_TEMPLATE_RESPONSE_DATA

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | [**STRING_32**](STRING_32.md) | targeting template name | [optional] [default to null]
**auto_targeting_enabled** | **BOOLEAN** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional] [default to true]
**targeting_attributes** | [**TARGETING_SPEC**](TargetingSpec.md) |  | [optional] [default to null]
**placement_group** | [**PLACEMENT_GROUP_TYPE**](PlacementGroupType.md) |  | [optional] [default to null]
**keywords** | [**LIST [TARGETING_TEMPLATE_KEYWORD]**](TargetingTemplateKeyword.md) |  | [optional] [default to null]
**tracking_urls** | [**TRACKING_URLS**](TrackingUrls.md) |  | [optional] [default to null]
**id** | [**STRING_32**](STRING_32.md) | Targeting template ID. | [optional] [default to null]
**created_time** | **INTEGER_32** | Targeting template created time. Unix timestamp in seconds. | [optional] [default to null]
**updated_time** | **INTEGER_32** | Targeting template updated time.Unix timestamp in seconds. | [optional] [default to null]
**ad_account_id** | [**STRING_32**](STRING_32.md) | The ID of the advertiser that this targeting template belongs to. | [optional] [default to null]
**status** | [**STRING_32**](STRING_32.md) | Indicate targeting template is active or Deleted | [optional] [default to ACTIVE]
**sizing** | [**TARGETING_TEMPLATE_AUDIENCE_SIZING**](TargetingTemplateAudienceSizing.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


