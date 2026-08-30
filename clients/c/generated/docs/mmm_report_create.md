# mmm_report_create_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiser_ids** | **list_t \*** | Advertiser IDs for multi-advertiser report | [optional] 
**columns** | [**list_t**](mmm_reporting_column.md) \* | Metric and entity columns | 
**countries** | [**list_t**](targeting_advertiser_country.md) \* | A List of countries for filtering | [optional] 
**custom_column_ids** | **list_t \*** | List of custom column IDs | [optional] 
**end_date** | **char \*** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**granularity** | **mmm_report_granularity_t \*** |   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly. | 
**level** | **mmm_report_level_t \*** | Level of the report | 
**report_name** | **char \*** | Name of the Marketing Mix Modeling (MMM) report | 
**start_date** | **char \*** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**targeting_types** | [**list_t**](mmm_reporting_targeting_type.md) \* | List of targeting types | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


