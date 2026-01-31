# Org.OpenAPITools.Model.TargetingTemplateGetResponseData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AutoTargetingEnabled** | **bool** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional] [default to true]
**Keywords** | [**List&lt;TargetingTemplateKeyword&gt;**](TargetingTemplateKeyword.md) |  | [optional] 
**Name** | **string** | targeting template name | [optional] 
**PlacementGroup** | **PlacementGroupType** |  | [optional] 
**TargetingAttributes** | [**TargetingSpec**](TargetingSpec.md) |  | [optional] 
**TrackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**AdAccountId** | **string** | The ID of the advertiser that this targeting template belongs to. | [optional] 
**CreatedTime** | **int** | Targeting template created time. Unix timestamp in seconds. | [optional] 
**Id** | **string** | Targeting template ID. | [optional] 
**Sizing** | [**TargetingTemplateAudienceSizing**](TargetingTemplateAudienceSizing.md) |  | [optional] 
**Status** | **string** | Indicate targeting template is active or Deleted | [optional] [default to StatusEnum.ACTIVE]
**UpdatedTime** | **int** | Targeting template updated time.Unix timestamp in seconds. | [optional] 
**Valid** | **bool** | Inform if the targeting template is valid (ex. would be false if has revoked audience) | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

