# Org.OpenAPITools.Model.TargetingTemplateResponseData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | targeting template name | [optional] 
**AutoTargetingEnabled** | **bool** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional] [default to true]
**TargetingAttributes** | [**TargetingSpec**](TargetingSpec.md) |  | [optional] 
**PlacementGroup** | **PlacementGroupType** |  | [optional] 
**Keywords** | [**List&lt;TargetingTemplateKeyword&gt;**](TargetingTemplateKeyword.md) |  | [optional] 
**TrackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**Id** | **string** | Targeting template ID. | [optional] 
**CreatedTime** | **int** | Targeting template created time. Unix timestamp in seconds. | [optional] 
**UpdatedTime** | **int** | Targeting template updated time.Unix timestamp in seconds. | [optional] 
**AdAccountId** | **string** | The ID of the advertiser that this targeting template belongs to. | [optional] 
**Status** | **string** | Indicate targeting template is active or Deleted | [optional] [default to StatusEnum.ACTIVE]
**Sizing** | [**TargetingTemplateAudienceSizing**](TargetingTemplateAudienceSizing.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

