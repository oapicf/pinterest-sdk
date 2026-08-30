# TargetingTemplate


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`ad_account_id`** | **`String`** | The ID of the advertiser that this targeting template belongs to. | [optional] [readonly] [default to nothing]
**`auto_targeting_enabled`** | **`Bool`** | Enable auto-targeting for ad group. Also known as [\&quot;expanded targeting\&quot;](https://help.pinterest.com/en/business/article/expanded-targeting). | [optional] [default to true]
**`created_time`** | **`Int64`** | Targeting template created time. Unix timestamp in seconds. | [optional] [readonly] [default to nothing]
**`id`** | **`String`** | Targeting template ID. | [optional] [readonly] [default to nothing]
**`keywords`** | [**`Vector{TargetingTemplateKeyword}`**](TargetingTemplateKeyword.md) |  | [optional] [default to nothing]
**`name`** | **`String`** | targeting template name | [default to nothing]
**`placement_group`** | [**`*PlacementGroupType`**](PlacementGroupType.md) |  | [optional] [default to nothing]
**`sizing`** | [**`*TargetingTemplateAudienceSizing`**](TargetingTemplateAudienceSizing.md) |  | [optional] [readonly] [default to nothing]
**`status`** | [**`*TargetingTemplateStatus`**](TargetingTemplateStatus.md) | Indicate targeting template is active or Deleted | [optional] [readonly] [default to nothing]
**`targeting_attributes`** | [**`*TargetingSpecOptimal`**](TargetingSpecOptimal.md) | targeting profile attributes | [default to nothing]
**`tracking_urls`** | [**`*TrackingUrls`**](TrackingUrls.md) |  | [optional] [default to nothing]
**`updated_time`** | **`Int64`** | Targeting template updated time.Unix timestamp in seconds. | [optional] [readonly] [default to nothing]
**`valid`** | **`Bool`** | Inform if the targeting template is valid (ex. would be false if has revoked audience) | [optional] [readonly] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


