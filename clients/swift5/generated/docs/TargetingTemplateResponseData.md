# TargetingTemplateResponseData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | targeting template name | [optional] 
**autoTargetingEnabled** | **Bool** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional] [default to true]
**targetingAttributes** | [**TargetingSpec**](TargetingSpec.md) |  | [optional] 
**placementGroup** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional] 
**keywords** | [TargetingTemplateKeyword] |  | [optional] 
**trackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**id** | **String** | Targeting template ID. | [optional] 
**createdTime** | **Int** | Targeting template created time. Unix timestamp in seconds. | [optional] 
**updatedTime** | **Int** | Targeting template updated time.Unix timestamp in seconds. | [optional] 
**adAccountId** | **String** | The ID of the advertiser that this targeting template belongs to. | [optional] 
**status** | **String** | Indicate targeting template is active or Deleted | [optional] [default to .active]
**sizing** | [**TargetingTemplateAudienceSizing**](TargetingTemplateAudienceSizing.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


