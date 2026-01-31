# ConversionTagConfigs
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AemDbEnabled** | **Boolean** | Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. | [optional] [default to $false]
**AemEnabled** | **Boolean** | Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. | [optional] [default to $false]
**AemExternalIdEnabled** | **Boolean** | Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. | [optional] [default to $false]
**AemFnlnEnabled** | **Boolean** | Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. | [optional] [default to $false]
**AemGeEnabled** | **Boolean** | Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. | [optional] [default to $false]
**AemLocEnabled** | **Boolean** | Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. | [optional] [default to $false]
**AemPhEnabled** | **Boolean** | Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. | [optional] [default to $false]
**MdFrequency** | **Decimal** | Metadata ingestion frequency. | [optional] [default to 1]
**NoCodeCapiDomains** | **String[]** | List of advertiser subdomains configured for NoCodeCAPI calls. | [optional] 

## Examples

- Prepare the resource
```powershell
$ConversionTagConfigs = Initialize-PSOpenAPIToolsConversionTagConfigs  -AemDbEnabled null `
 -AemEnabled null `
 -AemExternalIdEnabled null `
 -AemFnlnEnabled null `
 -AemGeEnabled null `
 -AemLocEnabled null `
 -AemPhEnabled null `
 -MdFrequency 0.6 `
 -NoCodeCapiDomains [&quot;https://sub.exampledomain.com&quot;]
```

- Convert the resource to JSON
```powershell
$ConversionTagConfigs | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

