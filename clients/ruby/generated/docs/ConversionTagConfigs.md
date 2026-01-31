# PinterestSdkClient::ConversionTagConfigs

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **aem_db_enabled** | **Boolean** | Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. | [optional][default to false] |
| **aem_enabled** | **Boolean** | Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. | [optional][default to false] |
| **aem_external_id_enabled** | **Boolean** | Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. | [optional][default to false] |
| **aem_fnln_enabled** | **Boolean** | Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. | [optional][default to false] |
| **aem_ge_enabled** | **Boolean** | Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. | [optional][default to false] |
| **aem_loc_enabled** | **Boolean** | Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. | [optional][default to false] |
| **aem_ph_enabled** | **Boolean** | Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. | [optional][default to false] |
| **md_frequency** | **Float** | Metadata ingestion frequency. | [optional][default to 1] |
| **no_code_capi_domains** | **Array&lt;String&gt;** | List of advertiser subdomains configured for NoCodeCAPI calls. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::ConversionTagConfigs.new(
  aem_db_enabled: null,
  aem_enabled: null,
  aem_external_id_enabled: null,
  aem_fnln_enabled: null,
  aem_ge_enabled: null,
  aem_loc_enabled: null,
  aem_ph_enabled: null,
  md_frequency: 0.6,
  no_code_capi_domains: [&quot;https://sub.exampledomain.com&quot;]
)
```

