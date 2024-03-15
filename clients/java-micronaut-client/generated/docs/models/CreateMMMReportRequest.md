

# CreateMMMReportRequest

The class is defined in **[CreateMMMReportRequest.java](../../src/main/java/org/openapitools/model/CreateMMMReportRequest.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reportName** | `String` | Name of the Marketing Mix Modeling (MMM) report | 
**startDate** | `String` | Metric report start date (UTC). Format: YYYY-MM-DD | 
**endDate** | `String` | Metric report end date (UTC). Format: YYYY-MM-DD | 
**granularity** | [**GranularityEnum**](#GranularityEnum) | DAY - metrics are broken down daily.&lt;br&gt; WEEK - metrics are broken down weekly. | 
**level** | [**LevelEnum**](#LevelEnum) | Level of the report | 
**targetingTypes** | `List&lt;MMMReportingTargetingType&gt;` | List of targeting types | 
**columns** | `List&lt;MMMReportingColumn&gt;` | Metric and entity columns | 
**countries** | `List&lt;TargetingAdvertiserCountry&gt;` | A List of countries for filtering |  [optional property]




## GranularityEnum

Name | Value
---- | -----
DAY | `"DAY"`
WEEK | `"WEEK"`

## LevelEnum

Name | Value
---- | -----
CAMPAIGN_TARGETING | `"CAMPAIGN_TARGETING"`
AD_GROUP_TARGETING | `"AD_GROUP_TARGETING"`





