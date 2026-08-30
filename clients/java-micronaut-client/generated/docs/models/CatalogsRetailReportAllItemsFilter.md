

# CatalogsRetailReportAllItemsFilter

ALL_ITEMS filter for retail catalogs. Optional product_group_id scopes the report to items in that product group. If omitted, all items are included.

The class is defined in **[CatalogsRetailReportAllItemsFilter.java](../../src/main/java/org/openapitools/model/CatalogsRetailReportAllItemsFilter.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogId** | `String` | Unique identifier of a catalog. If not given, oldest catalog will be used |  [optional property]
**productGroupId** | `String` | Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature. |  [optional property]
**reportType** | [**ReportTypeEnum**](#ReportTypeEnum) |  | 



## ReportTypeEnum

Name | Value
---- | -----
ALL_ITEMS | `"ALL_ITEMS"`


