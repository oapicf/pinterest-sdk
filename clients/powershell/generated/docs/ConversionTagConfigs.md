# ConversionTagConfigs
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AemEnabled** | **Boolean** | Whether Automatic Enhanced Match email is enabled. See &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/en/business/article/enhanced-match&quot;&quot; target&#x3D;&quot;&quot;_blank&quot;&quot;&gt;Enhanced match&lt;/a&gt; for more information. | [optional] [default to $false]
**MdFrequency** | **Decimal** | Metadata ingestion frequency. | [optional] [default to 1]
**AemFnlnEnabled** | **Boolean** | Whether Automatic Enhanced Match name is enabled. See &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/en/business/article/enhanced-match&quot;&quot; target&#x3D;&quot;&quot;_blank&quot;&quot;&gt;Enhanced match&lt;/a&gt; for more information. | [optional] [default to $false]
**AemPhEnabled** | **Boolean** | Whether Automatic Enhanced Match phone is enabled. See &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/en/business/article/enhanced-match&quot;&quot; target&#x3D;&quot;&quot;_blank&quot;&quot;&gt;Enhanced match&lt;/a&gt; for more information. | [optional] [default to $false]
**AemGeEnabled** | **Boolean** | Whether Automatic Enhanced Match gender is enabled. See &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/en/business/article/enhanced-match&quot;&quot; target&#x3D;&quot;&quot;_blank&quot;&quot;&gt;Enhanced match&lt;/a&gt; for more information. | [optional] [default to $false]
**AemDbEnabled** | **Boolean** | Whether Automatic Enhanced Match birthdate is enabled. See &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/en/business/article/enhanced-match&quot;&quot; target&#x3D;&quot;&quot;_blank&quot;&quot;&gt;Enhanced match&lt;/a&gt; for more information. | [optional] [default to $false]
**AemLocEnabled** | **Boolean** | Whether Automatic Enhanced Match location is enabled. See &lt;a href&#x3D;&quot;&quot;https://help.pinterest.com/en/business/article/enhanced-match&quot;&quot; target&#x3D;&quot;&quot;_blank&quot;&quot;&gt;Enhanced match&lt;/a&gt; for more information. | [optional] [default to $false]

## Examples

- Prepare the resource
```powershell
$ConversionTagConfigs = Initialize-PSOpenAPIToolsConversionTagConfigs  -AemEnabled true `
 -MdFrequency 0.6 `
 -AemFnlnEnabled true `
 -AemPhEnabled true `
 -AemGeEnabled true `
 -AemDbEnabled true `
 -AemLocEnabled true
```

- Convert the resource to JSON
```powershell
$ConversionTagConfigs | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

