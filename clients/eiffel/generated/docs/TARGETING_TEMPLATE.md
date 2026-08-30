# TARGETING_TEMPLATE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | [**STRING_32**](STRING_32.md) | The ID of the advertiser that this targeting template belongs to. | [optional] [readonly] [default to null]
**auto_targeting_enabled** | **BOOLEAN** | Enable auto-targeting for ad group. Also known as [\&quot;expanded targeting\&quot;](https://help.pinterest.com/en/business/article/expanded-targeting). | [optional] [default to true]
**created_time** | **INTEGER_32** | Targeting template created time. Unix timestamp in seconds. | [optional] [readonly] [default to null]
**id** | [**STRING_32**](STRING_32.md) | Targeting template ID. | [optional] [readonly] [default to null]
**keywords** | [**LIST [TARGETING_TEMPLATE_KEYWORD]**](TargetingTemplateKeyword.md) |  | [optional] [default to null]
**name** | [**STRING_32**](STRING_32.md) | targeting template name | [default to null]
**placement_group** | [**PLACEMENT_GROUP_TYPE**](PlacementGroupType.md) |  | [optional] [default to null]
**sizing** | [**TARGETING_TEMPLATE_AUDIENCE_SIZING**](TargetingTemplateAudienceSizing.md) |  | [optional] [readonly] [default to null]
**status** | [**TARGETING_TEMPLATE_STATUS**](TargetingTemplateStatus.md) | Indicate targeting template is active or Deleted | [optional] [readonly] [default to null]
**targeting_attributes** | [**TARGETING_SPEC_OPTIMAL**](TargetingSpecOptimal.md) | targeting profile attributes | [default to null]
**tracking_urls** | [**TRACKING_URLS**](TrackingUrls.md) |  | [optional] [default to null]
**updated_time** | **INTEGER_32** | Targeting template updated time.Unix timestamp in seconds. | [optional] [readonly] [default to null]
**valid** | **BOOLEAN** | Inform if the targeting template is valid (ex. would be false if has revoked audience) | [optional] [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


