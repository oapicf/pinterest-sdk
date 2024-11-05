# OAITargetingTemplateResponseData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **NSString*** | targeting template name | [optional] 
**autoTargetingEnabled** | **NSNumber*** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional] [default to @(YES)]
**targetingAttributes** | [**OAITargetingSpec***](OAITargetingSpec.md) |  | [optional] 
**placementGroup** | [**OAIPlacementGroupType***](OAIPlacementGroupType.md) |  | [optional] 
**keywords** | [**NSArray&lt;OAITargetingTemplateKeyword&gt;***](OAITargetingTemplateKeyword.md) |  | [optional] 
**trackingUrls** | [**OAITrackingUrls***](OAITrackingUrls.md) |  | [optional] 
**_id** | **NSString*** | Targeting template ID. | [optional] 
**createdTime** | **NSNumber*** | Targeting template created time. Unix timestamp in seconds. | [optional] 
**updatedTime** | **NSNumber*** | Targeting template updated time.Unix timestamp in seconds. | [optional] 
**adAccountId** | **NSString*** | The ID of the advertiser that this targeting template belongs to. | [optional] 
**status** | **NSString*** | Indicate targeting template is active or Deleted | [optional] [default to @"ACTIVE"]
**sizing** | [**OAITargetingTemplateAudienceSizing***](OAITargetingTemplateAudienceSizing.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


