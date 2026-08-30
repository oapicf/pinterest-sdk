# Org.OpenAPITools.Model.TargetingTemplate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | targeting template name | 
**TargetingAttributes** | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) | targeting profile attributes | 
**AdAccountId** | **string** | The ID of the advertiser that this targeting template belongs to. | [optional] [readonly] 
**AutoTargetingEnabled** | **bool** | Enable auto-targeting for ad group. Also known as [\&quot;expanded targeting\&quot;](https://help.pinterest.com/en/business/article/expanded-targeting). | [optional] [default to true]
**CreatedTime** | **int** | Targeting template created time. Unix timestamp in seconds. | [optional] [readonly] 
**Id** | **string** | Targeting template ID. | [optional] [readonly] 
**Keywords** | [**List&lt;TargetingTemplateKeyword&gt;**](TargetingTemplateKeyword.md) |  | [optional] 
**PlacementGroup** | **PlacementGroupType** |  | [optional] 
**Sizing** | [**TargetingTemplateAudienceSizing**](TargetingTemplateAudienceSizing.md) |  | [optional] [readonly] 
**Status** | **TargetingTemplateStatus** | Indicate targeting template is active or Deleted | [optional] [readonly] 
**TrackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**UpdatedTime** | **int** | Targeting template updated time.Unix timestamp in seconds. | [optional] [readonly] 
**Valid** | **bool** | Inform if the targeting template is valid (ex. would be false if has revoked audience) | [optional] [readonly] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

