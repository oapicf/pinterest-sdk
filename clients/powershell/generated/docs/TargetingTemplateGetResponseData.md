# TargetingTemplateGetResponseData
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AutoTargetingEnabled** | **Boolean** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/en/business/article/expanded-targeting&quot;&quot; target&#x3D;&quot;&quot;_blank&quot;&quot;&gt;&quot;&quot;expanded targeting&quot;&quot;&lt;/a&gt;. | [optional] [default to $true]
**Keywords** | [**TargetingTemplateKeyword[]**](TargetingTemplateKeyword.md) |  | [optional] 
**Name** | **String** | targeting template name | [optional] 
**PlacementGroup** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional] 
**TargetingAttributes** | [**TargetingSpec**](TargetingSpec.md) |  | [optional] 
**TrackingUrls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**AdAccountId** | **String** | The ID of the advertiser that this targeting template belongs to. | [optional] 
**CreatedTime** | **Int32** | Targeting template created time. Unix timestamp in seconds. | [optional] 
**Id** | **String** | Targeting template ID. | [optional] 
**Sizing** | [**TargetingTemplateAudienceSizing**](TargetingTemplateAudienceSizing.md) |  | [optional] 
**Status** | **String** | Indicate targeting template is active or Deleted | [optional] [default to "ACTIVE"]
**UpdatedTime** | **Int32** | Targeting template updated time.Unix timestamp in seconds. | [optional] 
**Valid** | **Boolean** | Inform if the targeting template is valid (ex. would be false if has revoked audience) | [optional] 

## Examples

- Prepare the resource
```powershell
$TargetingTemplateGetResponseData = Initialize-PSOpenAPIToolsTargetingTemplateGetResponseData  -AutoTargetingEnabled null `
 -Keywords [{value&#x3D;cats, match_type&#x3D;EXACT_NEGATIVE}] `
 -Name Gaming `
 -PlacementGroup null `
 -TargetingAttributes null `
 -TrackingUrls null `
 -AdAccountId 549755885175 `
 -CreatedTime 1432744744 `
 -Id 643 `
 -Sizing null `
 -Status ACTIVE `
 -UpdatedTime 1432744744 `
 -Valid true
```

- Convert the resource to JSON
```powershell
$TargetingTemplateGetResponseData | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

