# OAITargetingTemplate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **NSString*** | The ID of the advertiser that this targeting template belongs to. | [optional] [readonly] 
**autoTargetingEnabled** | **NSNumber*** | Enable auto-targeting for ad group. Also known as [\&quot;expanded targeting\&quot;](https://help.pinterest.com/en/business/article/expanded-targeting). | [optional] [default to @(YES)]
**createdTime** | **NSNumber*** | Targeting template created time. Unix timestamp in seconds. | [optional] [readonly] 
**_id** | **NSString*** | Targeting template ID. | [optional] [readonly] 
**keywords** | [**NSArray&lt;OAITargetingTemplateKeyword&gt;***](OAITargetingTemplateKeyword.md) |  | [optional] 
**name** | **NSString*** | targeting template name | 
**placementGroup** | [**OAIPlacementGroupType***](OAIPlacementGroupType.md) |  | [optional] 
**sizing** | [**OAITargetingTemplateAudienceSizing***](OAITargetingTemplateAudienceSizing.md) |  | [optional] [readonly] 
**status** | [**OAITargetingTemplateStatus***](OAITargetingTemplateStatus.md) | Indicate targeting template is active or Deleted | [optional] [readonly] 
**targetingAttributes** | [**OAITargetingSpecOptimal***](OAITargetingSpecOptimal.md) | targeting profile attributes | 
**trackingUrls** | [**OAITrackingUrls***](OAITrackingUrls.md) |  | [optional] 
**updatedTime** | **NSNumber*** | Targeting template updated time.Unix timestamp in seconds. | [optional] [readonly] 
**valid** | **NSNumber*** | Inform if the targeting template is valid (ex. would be false if has revoked audience) | [optional] [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


