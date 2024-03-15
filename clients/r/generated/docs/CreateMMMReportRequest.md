# openapi::CreateMMMReportRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**report_name** | **character** | Name of the Marketing Mix Modeling (MMM) report | 
**start_date** | **character** | Metric report start date (UTC). Format: YYYY-MM-DD | [Pattern: ^(\\d{4})-(\\d{2})-(\\d{2})$] 
**end_date** | **character** | Metric report end date (UTC). Format: YYYY-MM-DD | [Pattern: ^(\\d{4})-(\\d{2})-(\\d{2})$] 
**granularity** | **character** | DAY - metrics are broken down daily.&lt;br&gt; WEEK - metrics are broken down weekly. | [Enum: [DAY, WEEK]] 
**level** | **character** | Level of the report | [Enum: [CAMPAIGN_TARGETING, AD_GROUP_TARGETING]] 
**targeting_types** | [**array[MMMReportingTargetingType]**](MMMReportingTargetingType.md) | List of targeting types | [Max. items: 5] [Min. items: 1] 
**columns** | [**array[MMMReportingColumn]**](MMMReportingColumn.md) | Metric and entity columns | 
**countries** | [**array[TargetingAdvertiserCountry]**](TargetingAdvertiserCountry.md) | A List of countries for filtering | [optional] 


