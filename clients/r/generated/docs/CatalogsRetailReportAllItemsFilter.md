# openapi::CatalogsRetailReportAllItemsFilter

ALL_ITEMS filter for retail catalogs. Optional product_group_id scopes the report to items in that product group. If omitted, all items are included.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **character** | Unique identifier of a catalog. If not given, oldest catalog will be used | [optional] [Pattern: ^\\d+$] 
**product_group_id** | **character** | Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature. | [optional] [Pattern: ^\\d+$] 
**report_type** | **character** |  | [Enum: [ALL_ITEMS]] 


