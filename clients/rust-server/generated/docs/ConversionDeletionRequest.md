# ConversionDeletionRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_time** | [***chrono::naive::NaiveDate**](date.md) | Timestamp when the conversion deletion request was succesfully created. | [readonly] 
**processed_time** | [***swagger::Nullable<chrono::naive::NaiveDate>**](date.md) | Timestamp when the conversion deletion request was processed. | [optional] [readonly] [default to None]
**request_id** | **String** | Unique identifier of the conversion deletion request | 
**status** | [***models::ConversionDeletionRequestStatus**](ConversionDeletionRequestStatus.md) | Represents the status of the conversion deletion request. \"PENDING\" or \"SUBMITTED\". \"PENDING\" meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \"SUBMITTED\" meaning that the Data Deletion process has begun and can no longer be canceled. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


