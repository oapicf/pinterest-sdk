# openapi::MMMReportCreate

Resource create operation model.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiser_ids** | **array[character]** | Advertiser IDs for multi-advertiser report | [optional] 
**columns** | [**array[MMMReportingColumn]**](MMMReportingColumn.md) | Metric and entity columns | 
**countries** | [**array[TargetingAdvertiserCountry]**](TargetingAdvertiserCountry.md) | A List of countries for filtering | [optional] 
**custom_column_ids** | **array[character]** | List of custom column IDs | [optional] [Max. items: 20] 
**end_date** | **character** | Metric report end date (UTC). Format: YYYY-MM-DD | [Pattern: ^\\d{4}-\\d{2}-\\d{2}$] 
**granularity** | [**MMMReportGranularity**](MMMReportGranularity.md) |   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly. | [Enum: ] 
**level** | [**MMMReportLevel**](MMMReportLevel.md) | Level of the report | [Enum: ] 
**report_name** | **character** | Name of the Marketing Mix Modeling (MMM) report | 
**start_date** | **character** | Metric report start date (UTC). Format: YYYY-MM-DD | [Pattern: ^\\d{4}-\\d{2}-\\d{2}$] 
**targeting_types** | [**array[MMMReportingTargetingType]**](MMMReportingTargetingType.md) | List of targeting types | [Max. items: 7] [Min. items: 1] 


