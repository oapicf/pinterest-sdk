# PinterestSdk.CreateMMMReportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reportName** | **String** | Name of the Marketing Mix Modeling (MMM) report | 
**startDate** | **String** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**endDate** | **String** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**granularity** | **String** | DAY - metrics are broken down daily.&lt;br&gt; WEEK - metrics are broken down weekly. | 
**level** | **String** | Level of the report | 
**targetingTypes** | [**[MMMReportingTargetingType]**](MMMReportingTargetingType.md) | List of targeting types | 
**columns** | [**[MMMReportingColumn]**](MMMReportingColumn.md) | Metric and entity columns | 
**countries** | [**[TargetingAdvertiserCountry]**](TargetingAdvertiserCountry.md) | A List of countries for filtering | [optional] 



## Enum: GranularityEnum


* `DAY` (value: `"DAY"`)

* `WEEK` (value: `"WEEK"`)





## Enum: LevelEnum


* `CAMPAIGN_TARGETING` (value: `"CAMPAIGN_TARGETING"`)

* `AD_GROUP_TARGETING` (value: `"AD_GROUP_TARGETING"`)




