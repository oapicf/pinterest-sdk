

# CreateMMMReportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reportName** | **String** | Name of the Marketing Mix Modeling (MMM) report | 
**startDate** | **String** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**endDate** | **String** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**granularity** | [**GranularityEnum**](#GranularityEnum) | DAY - metrics are broken down daily.&lt;br&gt; WEEK - metrics are broken down weekly. | 
**level** | [**LevelEnum**](#LevelEnum) | Level of the report | 
**targetingTypes** | [**List&lt;MMMReportingTargetingType&gt;**](MMMReportingTargetingType.md) | List of targeting types | 
**columns** | [**List&lt;MMMReportingColumn&gt;**](MMMReportingColumn.md) | Metric and entity columns | 
**countries** | [**List&lt;TargetingAdvertiserCountry&gt;**](TargetingAdvertiserCountry.md) | A List of countries for filtering |  [optional]


## Enum: GranularityEnum

Name | Value
---- | -----


## Enum: LevelEnum

Name | Value
---- | -----




