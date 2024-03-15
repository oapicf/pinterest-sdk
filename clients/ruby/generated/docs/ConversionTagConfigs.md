# PinterestSdkClient::ConversionTagConfigs

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **aem_enabled** | **Boolean** | Whether Automatic Enhanced Match email is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information. | [optional][default to false] |
| **md_frequency** | **Float** | Metadata ingestion frequency. | [optional][default to 1] |
| **aem_fnln_enabled** | **Boolean** | Whether Automatic Enhanced Match name is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information. | [optional][default to false] |
| **aem_ph_enabled** | **Boolean** | Whether Automatic Enhanced Match phone is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information. | [optional][default to false] |
| **aem_ge_enabled** | **Boolean** | Whether Automatic Enhanced Match gender is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information. | [optional][default to false] |
| **aem_db_enabled** | **Boolean** | Whether Automatic Enhanced Match birthdate is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information. | [optional][default to false] |
| **aem_loc_enabled** | **Boolean** | Whether Automatic Enhanced Match location is enabled. See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/enhanced-match\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Enhanced match&lt;/a&gt; for more information. | [optional][default to false] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::ConversionTagConfigs.new(
  aem_enabled: true,
  md_frequency: 0.6,
  aem_fnln_enabled: true,
  aem_ph_enabled: true,
  aem_ge_enabled: true,
  aem_db_enabled: true,
  aem_loc_enabled: true
)
```

