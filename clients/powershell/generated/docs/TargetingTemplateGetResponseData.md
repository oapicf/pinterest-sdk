# TargetingTemplateGetResponseData
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **String** | targeting template name | [optional] 
**AutoTargetingEnabled** | **Boolean** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/en/business/article/expanded-targeting&quot;&quot; target&#x3D;&quot;&quot;_blank&quot;&quot;&gt;&quot;&quot;expanded targeting&quot;&quot;&lt;/a&gt;. | [optional] [default to $true]
**TargetingAttributes** | [**TargetingSpec**](TargetingSpec.md) |  | [optional] 
**PlacementGroup** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional] 
**Keywords** | [**TargetingTemplateKeyword[]**](TargetingTemplateKeyword.md) |  | [optional] 
**TrackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**Id** | **String** | Targeting template ID. | [optional] 
**CreatedTime** | **Int32** | Targeting template created time. Unix timestamp in seconds. | [optional] 
**UpdatedTime** | **Int32** | Targeting template updated time.Unix timestamp in seconds. | [optional] 
**AdAccountId** | **String** | The ID of the advertiser that this targeting template belongs to. | [optional] 
**Status** | **String** | Indicate targeting template is active or Deleted | [optional] [default to "ACTIVE"]
**Sizing** | [**TargetingTemplateAudienceSizing**](TargetingTemplateAudienceSizing.md) |  | [optional] 
**Valid** | **Boolean** | Inform if the targeting template is valid (ex. would be false if has revoked audience) | [optional] 

## Examples

- Prepare the resource
```powershell
$TargetingTemplateGetResponseData = Initialize-PSOpenAPIToolsTargetingTemplateGetResponseData  -Name Gaming `
 -AutoTargetingEnabled null `
 -TargetingAttributes null `
 -PlacementGroup null `
 -Keywords [{value&#x3D;cats, match_type&#x3D;EXACT_NEGATIVE}] `
 -TrackingUrls null `
 -Id 643 `
 -CreatedTime 1432744744 `
 -UpdatedTime 1432744744 `
 -AdAccountId 549755885175 `
 -Status ACTIVE `
 -Sizing null `
 -Valid true
```

- Convert the resource to JSON
```powershell
$TargetingTemplateGetResponseData | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

