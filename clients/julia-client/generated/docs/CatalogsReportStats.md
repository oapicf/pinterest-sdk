# CatalogsReportStats



## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | This is a oneOf model. The value must be exactly one of the following types: CatalogsReportDistributionStats, CatalogsReportFeedIngestionStats | Diagnostics aggregated numbers | [optional] 

The discriminator field is `report_type` with the following mapping:
 - `DISTRIBUTION_ISSUES`: `CatalogsReportDistributionStats`
 - `FEED_INGESTION_ISSUES`: `CatalogsReportFeedIngestionStats`



[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


