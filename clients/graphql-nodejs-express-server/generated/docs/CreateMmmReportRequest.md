# CreateMmmReportRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reportName** | **String!** | Name of the Marketing Mix Modeling (MMM) report | [default to null]
**startDate** | **String!** | Metric report start date (UTC). Format: YYYY-MM-DD | [default to null]
**endDate** | **String!** | Metric report end date (UTC). Format: YYYY-MM-DD | [default to null]
**granularity** | **String!** | DAY - metrics are broken down daily.&lt;br&gt; WEEK - metrics are broken down weekly. | [default to null]
**level** | **String!** | Level of the report | [default to null]
**targetingTypes** | [**MmmReportingTargetingType**](MMMReportingTargetingType.md) | List of targeting types | [default to null]
**columns** | [**MmmReportingColumn**](MMMReportingColumn.md) | Metric and entity columns | [default to null]
**countries** | [**TargetingAdvertiserCountry**](TargetingAdvertiserCountry.md) | A List of countries for filtering | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


