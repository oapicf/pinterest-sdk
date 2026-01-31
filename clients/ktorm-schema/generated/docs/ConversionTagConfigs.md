
# Table `ConversionTagConfigs`
(mapped from: ConversionTagConfigs)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**aemDbEnabled** | aem_db_enabled | boolean |  | **kotlin.Boolean** | Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. |  [optional]
**aemEnabled** | aem_enabled | boolean |  | **kotlin.Boolean** | Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. |  [optional]
**aemExternalIdEnabled** | aem_external_id_enabled | boolean |  | **kotlin.Boolean** | Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. |  [optional]
**aemFnlnEnabled** | aem_fnln_enabled | boolean |  | **kotlin.Boolean** | Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. |  [optional]
**aemGeEnabled** | aem_ge_enabled | boolean |  | **kotlin.Boolean** | Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. |  [optional]
**aemLocEnabled** | aem_loc_enabled | boolean |  | **kotlin.Boolean** | Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. |  [optional]
**aemPhEnabled** | aem_ph_enabled | boolean |  | **kotlin.Boolean** | Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. |  [optional]
**mdFrequency** | md_frequency | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Metadata ingestion frequency. |  [optional]
**noCodeCapiDomains** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | List of advertiser subdomains configured for NoCodeCAPI calls. |  [optional]










# **Table `ConversionTagConfigsNoCodeCapiDomains`**
(mapped from: ConversionTagConfigsNoCodeCapiDomains)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionTagConfigs | conversionTagConfigs | long | | kotlin.Long | Primary Key | *one*
noCodeCapiDomains | noCodeCapiDomains | text | | kotlin.String | Foreign Key | *many*



