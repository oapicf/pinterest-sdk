# ConversionTagCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aem_db_enabled** | **boolean** | Whether Automatic Enhanced Match birthdate is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. | [optional] [default to false]
**aem_enabled** | **boolean** | Whether Automatic Enhanced Match email is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. | [optional] [default to false]
**aem_external_id_enabled** | **boolean** | Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. | [optional] [default to false]
**aem_fnln_enabled** | **boolean** | Whether Automatic Enhanced Match name is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. | [optional] [default to false]
**aem_ge_enabled** | **boolean** | Whether Automatic Enhanced Match gender is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. | [optional] [default to false]
**aem_loc_enabled** | **boolean** | Whether Automatic Enhanced Match location is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. | [optional] [default to false]
**aem_ph_enabled** | **boolean** | Whether Automatic Enhanced Match phone is enabled. See [Enhanced match](https://help.pinterest.com/en/business/article/enhanced-match) for more information. | [optional] [default to false]
**md_frequency** | **number** | Metadata ingestion frequency. | [optional] [default to 1]
**name** | **string** | Conversion tag name. | [default to undefined]

## Example

```typescript
import { ConversionTagCreate } from './api';

const instance: ConversionTagCreate = {
    aem_db_enabled,
    aem_enabled,
    aem_external_id_enabled,
    aem_fnln_enabled,
    aem_ge_enabled,
    aem_loc_enabled,
    aem_ph_enabled,
    md_frequency,
    name,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
