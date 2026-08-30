# TargetingTemplate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **string** | The ID of the advertiser that this targeting template belongs to. | [optional] [readonly] 
**autoTargetingEnabled** | **bool** | Enable auto-targeting for ad group. Also known as [\&quot;expanded targeting\&quot;](https://help.pinterest.com/en/business/article/expanded-targeting). | [optional] [default to true]
**createdTime** | **int** | Targeting template created time. Unix timestamp in seconds. | [optional] [readonly] 
**id** | **string** | Targeting template ID. | [optional] [readonly] 
**keywords** | [**OpenAPI\Server\Model\TargetingTemplateKeyword**](TargetingTemplateKeyword.md) |  | [optional] 
**name** | **string** | targeting template name | 
**placementGroup** | [**OpenAPI\Server\Model\PlacementGroupType**](PlacementGroupType.md) |  | [optional] 
**sizing** | [**OpenAPI\Server\Model\TargetingTemplateAudienceSizing**](TargetingTemplateAudienceSizing.md) |  | [optional] [readonly] 
**status** | [**OpenAPI\Server\Model\TargetingTemplateStatus**](TargetingTemplateStatus.md) | Indicate targeting template is active or Deleted | [optional] [readonly] 
**targetingAttributes** | [**OpenAPI\Server\Model\TargetingSpecOptimal**](TargetingSpecOptimal.md) | targeting profile attributes | 
**trackingUrls** | [**OpenAPI\Server\Model\TrackingUrls**](TrackingUrls.md) |  | [optional] 
**updatedTime** | **int** | Targeting template updated time.Unix timestamp in seconds. | [optional] [readonly] 
**valid** | **bool** | Inform if the targeting template is valid (ex. would be false if has revoked audience) | [optional] [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


