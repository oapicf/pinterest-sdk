# MMMReportCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiser_ids** | **string[]** | Advertiser IDs for multi-advertiser report | [optional]
**columns** | [**\OpenAPI\Client\Model\MMMReportingColumn[]**](MMMReportingColumn.md) | Metric and entity columns |
**countries** | [**\OpenAPI\Client\Model\TargetingAdvertiserCountry[]**](TargetingAdvertiserCountry.md) | A List of countries for filtering | [optional]
**custom_column_ids** | **string[]** | List of custom column IDs | [optional]
**end_date** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD |
**granularity** | [**\OpenAPI\Client\Model\MMMReportGranularity**](MMMReportGranularity.md) | DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly. |
**level** | [**\OpenAPI\Client\Model\MMMReportLevel**](MMMReportLevel.md) | Level of the report |
**report_name** | **string** | Name of the Marketing Mix Modeling (MMM) report |
**start_date** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD |
**targeting_types** | [**\OpenAPI\Client\Model\MMMReportingTargetingType[]**](MMMReportingTargetingType.md) | List of targeting types |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
