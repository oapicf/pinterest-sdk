# MmmReportCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiserIds** | **String!** | Advertiser IDs for multi-advertiser report | [optional] [default to null]
**columns** | [**MmmReportingColumn**](MMMReportingColumn.md) | Metric and entity columns | [default to null]
**countries** | [**TargetingAdvertiserCountry**](TargetingAdvertiserCountry.md) | A List of countries for filtering | [optional] [default to null]
**customColumnIds** | **String!** | List of custom column IDs | [optional] [default to null]
**endDate** | **String!** | Metric report end date (UTC). Format: YYYY-MM-DD | [default to null]
**granularity** | [***MmmReportGranularity**](MMMReportGranularity.md) |   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly. | [default to null]
**level** | [***MmmReportLevel**](MMMReportLevel.md) | Level of the report | [default to null]
**reportName** | **String!** | Name of the Marketing Mix Modeling (MMM) report | [default to null]
**startDate** | **String!** | Metric report start date (UTC). Format: YYYY-MM-DD | [default to null]
**targetingTypes** | [**MmmReportingTargetingType**](MMMReportingTargetingType.md) | List of targeting types | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


