# CatalogsRetailReportAllItemsFilter

ALL_ITEMS filter for retail catalogs. Optional product_group_id scopes the report to items in that product group. If omitted, all items are included.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **string** | Unique identifier of a catalog. If not given, oldest catalog will be used | [optional] [default to undefined]
**product_group_id** | **string** | Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature. | [optional] [default to undefined]
**report_type** | **string** |  | [default to undefined]

## Example

```typescript
import { CatalogsRetailReportAllItemsFilter } from './api';

const instance: CatalogsRetailReportAllItemsFilter = {
    catalog_id,
    product_group_id,
    report_type,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
