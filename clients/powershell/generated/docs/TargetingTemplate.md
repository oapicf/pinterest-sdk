# TargetingTemplate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **String** | The ID of the advertiser that this targeting template belongs to. | [optional] [readonly] 
**AutoTargetingEnabled** | **Boolean** | Enable auto-targeting for ad group. Also known as [&quot;&quot;expanded targeting&quot;&quot;](https://help.pinterest.com/en/business/article/expanded-targeting). | [optional] [default to $true]
**CreatedTime** | **Int32** | Targeting template created time. Unix timestamp in seconds. | [optional] [readonly] 
**Id** | **String** | Targeting template ID. | [optional] [readonly] 
**Keywords** | [**TargetingTemplateKeyword[]**](TargetingTemplateKeyword.md) |  | [optional] 
**Name** | **String** | targeting template name | 
**PlacementGroup** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional] 
**Sizing** | [**TargetingTemplateAudienceSizing**](TargetingTemplateAudienceSizing.md) |  | [optional] [readonly] 
**Status** | [**TargetingTemplateStatus**](TargetingTemplateStatus.md) | Indicate targeting template is active or Deleted | [optional] [readonly] 
**TargetingAttributes** | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) | targeting profile attributes | 
**TrackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**UpdatedTime** | **Int32** | Targeting template updated time.Unix timestamp in seconds. | [optional] [readonly] 
**Valid** | **Boolean** | Inform if the targeting template is valid (ex. would be false if has revoked audience) | [optional] [readonly] 

## Examples

- Prepare the resource
```powershell
$TargetingTemplate = Initialize-PSOpenAPIToolsTargetingTemplate  -AdAccountId null `
 -AutoTargetingEnabled null `
 -CreatedTime null `
 -Id null `
 -Keywords null `
 -Name null `
 -PlacementGroup null `
 -Sizing null `
 -Status null `
 -TargetingAttributes null `
 -TrackingUrls null `
 -UpdatedTime null `
 -Valid null
```

- Convert the resource to JSON
```powershell
$TargetingTemplate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

