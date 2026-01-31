# TargetingTemplateGetResponseData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**autoTargetingEnabled** | **bool** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional] [default to true]
**keywords** | [**OpenAPI\Server\Model\TargetingTemplateKeyword**](TargetingTemplateKeyword.md) |  | [optional] 
**name** | **string** | targeting template name | [optional] 
**placementGroup** | [**OpenAPI\Server\Model\PlacementGroupType**](PlacementGroupType.md) |  | [optional] 
**targetingAttributes** | [**OpenAPI\Server\Model\TargetingSpec**](TargetingSpec.md) |  | [optional] 
**trackingUrls** | [**OpenAPI\Server\Model\TrackingUrls**](TrackingUrls.md) |  | [optional] 
**adAccountId** | **string** | The ID of the advertiser that this targeting template belongs to. | [optional] 
**createdTime** | **int** | Targeting template created time. Unix timestamp in seconds. | [optional] 
**id** | **string** | Targeting template ID. | [optional] 
**sizing** | [**OpenAPI\Server\Model\TargetingTemplateAudienceSizing**](TargetingTemplateAudienceSizing.md) |  | [optional] 
**status** | **string** | Indicate targeting template is active or Deleted | [optional] [default to 'ACTIVE']
**updatedTime** | **int** | Targeting template updated time.Unix timestamp in seconds. | [optional] 
**valid** | **bool** | Inform if the targeting template is valid (ex. would be false if has revoked audience) | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


