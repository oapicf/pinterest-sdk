

# MMMReportCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiserIds** | **List&lt;String&gt;** | Advertiser IDs for multi-advertiser report |  [optional]
**columns** | [**List&lt;MMMReportingColumn&gt;**](MMMReportingColumn.md) | Metric and entity columns | 
**countries** | [**List&lt;TargetingAdvertiserCountry&gt;**](TargetingAdvertiserCountry.md) | A List of countries for filtering |  [optional]
**customColumnIds** | **List&lt;String&gt;** | List of custom column IDs |  [optional]
**endDate** | **String** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**granularity** | [**MMMReportGranularity**](MMMReportGranularity.md) |   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly. | 
**level** | [**MMMReportLevel**](MMMReportLevel.md) | Level of the report | 
**reportName** | **String** | Name of the Marketing Mix Modeling (MMM) report | 
**startDate** | **String** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**targetingTypes** | [**List&lt;MMMReportingTargetingType&gt;**](MMMReportingTargetingType.md) | List of targeting types | 




