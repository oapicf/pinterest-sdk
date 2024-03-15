

# CreateMMMReportRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reportName** | **String** | Name of the Marketing Mix Modeling (MMM) report | 
**startDate** | **String** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**endDate** | **String** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**granularity** | [**Granularity**](#Granularity) | DAY - metrics are broken down daily.&lt;br&gt; WEEK - metrics are broken down weekly. | 
**level** | [**Level**](#Level) | Level of the report | 
**targetingTypes** | **Seq&lt;MMMReportingTargetingType&gt;** | List of targeting types | 
**columns** | **Seq&lt;MMMReportingColumn&gt;** | Metric and entity columns | 
**countries** | **Seq&lt;TargetingAdvertiserCountry&gt;** | A List of countries for filtering |  [optional]


## Enum: Granularity
Allowed values: [DAY, WEEK]



## Enum: Level
Allowed values: [CAMPAIGN_TARGETING, AD_GROUP_TARGETING]




