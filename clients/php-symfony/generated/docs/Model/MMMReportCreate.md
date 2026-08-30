# MMMReportCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiserIds** | **string** | Advertiser IDs for multi-advertiser report | [optional] 
**columns** | [**OpenAPI\Server\Model\MMMReportingColumn**](MMMReportingColumn.md) | Metric and entity columns | 
**countries** | [**OpenAPI\Server\Model\TargetingAdvertiserCountry**](TargetingAdvertiserCountry.md) | A List of countries for filtering | [optional] 
**customColumnIds** | **string** | List of custom column IDs | [optional] 
**endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**granularity** | [**OpenAPI\Server\Model\MMMReportGranularity**](MMMReportGranularity.md) | DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly. | 
**level** | [**OpenAPI\Server\Model\MMMReportLevel**](MMMReportLevel.md) | Level of the report | 
**reportName** | **string** | Name of the Marketing Mix Modeling (MMM) report | 
**startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**targetingTypes** | [**OpenAPI\Server\Model\MMMReportingTargetingType**](MMMReportingTargetingType.md) | List of targeting types | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


