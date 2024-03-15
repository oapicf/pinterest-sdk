# CREATE_MMM_REPORT_REQUEST

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**report_name** | [**STRING_32**](STRING_32.md) | Name of the Marketing Mix Modeling (MMM) report | [default to null]
**start_date** | [**STRING_32**](STRING_32.md) | Metric report start date (UTC). Format: YYYY-MM-DD | [default to null]
**end_date** | [**STRING_32**](STRING_32.md) | Metric report end date (UTC). Format: YYYY-MM-DD | [default to null]
**granularity** | [**STRING_32**](STRING_32.md) | DAY - metrics are broken down daily.&lt;br&gt; WEEK - metrics are broken down weekly. | [default to null]
**level** | [**STRING_32**](STRING_32.md) | Level of the report | [default to null]
**targeting_types** | [**LIST [MMM_REPORTING_TARGETING_TYPE]**](MMMReportingTargetingType.md) | List of targeting types | [default to null]
**columns** | [**LIST [MMM_REPORTING_COLUMN]**](MMMReportingColumn.md) | Metric and entity columns | [default to null]
**countries** | [**LIST [TARGETING_ADVERTISER_COUNTRY]**](TargetingAdvertiserCountry.md) | A List of countries for filtering | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


