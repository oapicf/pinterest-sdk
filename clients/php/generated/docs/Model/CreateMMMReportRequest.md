# # CreateMMMReportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**countries** | [**\OpenAPI\Client\Model\TargetingAdvertiserCountry[]**](TargetingAdvertiserCountry.md) | A List of countries for filtering | [optional]
**columns** | [**\OpenAPI\Client\Model\MMMReportingColumn[]**](MMMReportingColumn.md) | Metric and entity columns |
**end_date** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD |
**granularity** | **string** | DAY - metrics are broken down daily.&lt;br&gt; WEEK - metrics are broken down weekly. |
**level** | **string** | Level of the report |
**report_name** | **string** | Name of the Marketing Mix Modeling (MMM) report |
**start_date** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD |
**targeting_types** | [**\OpenAPI\Client\Model\MMMReportingTargetingType[]**](MMMReportingTargetingType.md) | List of targeting types |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
