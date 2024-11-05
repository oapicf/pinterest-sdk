# TargetingTemplateGetResponseData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **string** | targeting template name | [optional] 
**autoTargetingEnabled** | **bool** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional] [default to true]
**targetingAttributes** | [**OpenAPI\Server\Model\TargetingSpec**](TargetingSpec.md) |  | [optional] 
**placementGroup** | [**OpenAPI\Server\Model\PlacementGroupType**](PlacementGroupType.md) |  | [optional] 
**keywords** | [**OpenAPI\Server\Model\TargetingTemplateKeyword**](TargetingTemplateKeyword.md) |  | [optional] 
**trackingUrls** | [**OpenAPI\Server\Model\TrackingUrls**](TrackingUrls.md) |  | [optional] 
**id** | **string** | Targeting template ID. | [optional] 
**createdTime** | **int** | Targeting template created time. Unix timestamp in seconds. | [optional] 
**updatedTime** | **int** | Targeting template updated time.Unix timestamp in seconds. | [optional] 
**adAccountId** | **string** | The ID of the advertiser that this targeting template belongs to. | [optional] 
**status** | **string** | Indicate targeting template is active or Deleted | [optional] [default to 'ACTIVE']
**sizing** | [**OpenAPI\Server\Model\TargetingTemplateAudienceSizing**](TargetingTemplateAudienceSizing.md) |  | [optional] 
**valid** | **bool** | Inform if the targeting template is valid (ex. would be false if has revoked audience) | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


