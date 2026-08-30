# AccountTemplate
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String** | ID of the Ad Account that owns the template | [optional] [default to null] |
| **ad\_account\_ids** | **List** | IDs of the Ad Accounts that have access to this template | [optional] [default to null] |
| **ade\_columns** | **List** | A list of ADE columns | [optional] [default to null] |
| **attribution\_type** | [**oas_any_type_not_mapped**](.md) | Attribution type for Brand/Category/SKU reports | [optional] [default to null] |
| **click\_window\_days** | **BigDecimal** | The length of the sliding window over which click conversions will be attributed | [optional] [default to null] |
| **columns** | [**List**](ReportingColumn.md) | A list of columns to be included in the report | [optional] [default to null] |
| **conversion\_report\_time\_type** | [**ConversionReportTimeType**](ConversionReportTimeType.md) | Conversion report time type | [optional] [default to null] |
| **creation\_source** | [**CreationSource**](CreationSource.md) | The surface used to create this template | [optional] [default to null] |
| **custom\_column\_ids** | **List** | A list of custom column IDs | [optional] [default to null] |
| **display\_metadata** | **String** | Additional metadata about this reporting template | [optional] [default to null] |
| **engagement\_window\_days** | **BigDecimal** | The length of the sliding window over which engagement conversions will be attributed | [optional] [default to null] |
| **filters\_json** | **String** | A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \&quot;field\&quot;: The column name\\ \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]\\ \&quot;value\&quot;: A single value or a list of values | [optional] [default to null] |
| **granularity** | [**Granularity**](Granularity.md) |  | [optional] [default to null] |
| **id** | **String** | Template ID | [default to null] |
| **ingestion\_sources** | [**List**](IngestionSource.md) | The filter on the conversion ingestion source method for conversion metrics | [optional] [default to null] |
| **is\_default** | **Boolean** | A boolean representing if this is the default view that loads for this template type | [optional] [default to null] |
| **is\_deleted** | **Boolean** | A boolean that indicates if the template has been deleted | [optional] [default to null] |
| **is\_owned\_by\_user** | **Boolean** | A boolean value that indicates if the user owns the template | [optional] [default to null] |
| **is\_scheduled** | **Boolean** | A boolean value that indicates if this template has been used to create a scheduled report | [optional] [default to null] |
| **name** | **String** | Template Name | [optional] [default to null] |
| **report\_end\_relative\_days\_in\_past** | **BigDecimal** | The number of days prior to the day the report will be delivered at which the report will end | [optional] [default to null] |
| **report\_format** | [**DataOutputFormat**](DataOutputFormat.md) |  | [optional] [default to null] |
| **report\_level** | [**MetricsReportingLevel**](MetricsReportingLevel.md) |  | [optional] [default to null] |
| **report\_start\_relative\_days\_in\_past** | **BigDecimal** | The number of days prior to the day the report will be delivered at which the report will start | [optional] [default to null] |
| **reporting\_time\_zone** | [**ReportingTimeZone**](ReportingTimeZone.md) | Timezone for reporting data | [optional] [default to null] |
| **sort\_by** | [**oas_any_type_not_mapped**](.md) | Unified metric sort configuration | [optional] [default to null] |
| **type** | **String** | Type of the template | [optional] [default to null] |
| **updated\_time** | **BigDecimal** | Time of last update in seconds since Unix epoch | [optional] [default to null] |
| **user\_id** | **String** | ID of the user who created the template | [optional] [default to null] |
| **view\_window\_days** | **BigDecimal** | The length of the sliding window over which view conversions will be attributed | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

