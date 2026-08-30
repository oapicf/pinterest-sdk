
# Table `CatalogsRetailReportAllItemsFilter`
(mapped from: CatalogsRetailReportAllItemsFilter)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**reportType** | report_type | text NOT NULL |  | [**report_type**](#ReportType) |  | 
**catalogId** | catalog_id | text |  | **kotlin.String** | Unique identifier of a catalog. If not given, oldest catalog will be used |  [optional]
**productGroupId** | product_group_id | text |  | **kotlin.String** | Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature. |  [optional]





