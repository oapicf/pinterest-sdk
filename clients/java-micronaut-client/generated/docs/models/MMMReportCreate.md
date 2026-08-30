

# MMMReportCreate

Resource create operation model.

The class is defined in **[MMMReportCreate.java](../../src/main/java/org/openapitools/model/MMMReportCreate.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiserIds** | `List&lt;String&gt;` | Advertiser IDs for multi-advertiser report |  [optional property]
**columns** | `List&lt;MMMReportingColumn&gt;` | Metric and entity columns | 
**countries** | `List&lt;TargetingAdvertiserCountry&gt;` | A List of countries for filtering |  [optional property]
**customColumnIds** | `List&lt;String&gt;` | List of custom column IDs |  [optional property]
**endDate** | `String` | Metric report end date (UTC). Format: YYYY-MM-DD | 
**granularity** | `MMMReportGranularity` |   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly. | 
**level** | `MMMReportLevel` | Level of the report | 
**reportName** | `String` | Name of the Marketing Mix Modeling (MMM) report | 
**startDate** | `String` | Metric report start date (UTC). Format: YYYY-MM-DD | 
**targetingTypes** | `List&lt;MMMReportingTargetingType&gt;` | List of targeting types | 












