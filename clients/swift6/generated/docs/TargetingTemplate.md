# TargetingTemplate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **String** | The ID of the advertiser that this targeting template belongs to. | [optional] [readonly] 
**autoTargetingEnabled** | **Bool** | Enable auto-targeting for ad group. Also known as [\&quot;expanded targeting\&quot;](https://help.pinterest.com/en/business/article/expanded-targeting). | [optional] [default to true]
**createdTime** | **Int** | Targeting template created time. Unix timestamp in seconds. | [optional] [readonly] 
**id** | **String** | Targeting template ID. | [optional] [readonly] 
**keywords** | [TargetingTemplateKeyword] |  | [optional] 
**name** | **String** | targeting template name | 
**placementGroup** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional] 
**sizing** | [**TargetingTemplateAudienceSizing**](TargetingTemplateAudienceSizing.md) |  | [optional] [readonly] 
**status** | [**TargetingTemplateStatus**](TargetingTemplateStatus.md) | Indicate targeting template is active or Deleted | [optional] [readonly] 
**targetingAttributes** | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) | targeting profile attributes | 
**trackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**updatedTime** | **Int** | Targeting template updated time.Unix timestamp in seconds. | [optional] [readonly] 
**valid** | **Bool** | Inform if the targeting template is valid (ex. would be false if has revoked audience) | [optional] [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


