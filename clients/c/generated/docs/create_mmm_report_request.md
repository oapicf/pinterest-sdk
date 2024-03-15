# create_mmm_report_request_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**report_name** | **char \*** | Name of the Marketing Mix Modeling (MMM) report | 
**start_date** | **char \*** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**end_date** | **char \*** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**granularity** | **pinterest_rest_api_create_mmm_report_request_GRANULARITY_e** | DAY - metrics are broken down daily.&lt;br&gt; WEEK - metrics are broken down weekly. | 
**level** | **pinterest_rest_api_create_mmm_report_request_LEVEL_e** | Level of the report | 
**targeting_types** | [**list_t**](mmm_reporting_targeting_type.md) \* | List of targeting types | 
**columns** | [**list_t**](mmm_reporting_column.md) \* | Metric and entity columns | 
**countries** | [**list_t**](targeting_advertiser_country.md) \* | A List of countries for filtering | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


