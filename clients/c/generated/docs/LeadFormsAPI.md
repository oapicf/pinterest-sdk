# LeadFormsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**LeadFormsAPI_leadFormGet**](LeadFormsAPI.md#LeadFormsAPI_leadFormGet) | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id
[**LeadFormsAPI_leadFormTestCreate**](LeadFormsAPI.md#LeadFormsAPI_leadFormTestCreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data
[**LeadFormsAPI_leadFormsCreate**](LeadFormsAPI.md#LeadFormsAPI_leadFormsCreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms | Create lead forms
[**LeadFormsAPI_leadFormsList**](LeadFormsAPI.md#LeadFormsAPI_leadFormsList) | **GET** /ad_accounts/{ad_account_id}/lead_forms | List lead forms
[**LeadFormsAPI_leadFormsUpdate**](LeadFormsAPI.md#LeadFormsAPI_leadFormsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/lead_forms | Update lead forms


# **LeadFormsAPI_leadFormGet**
```c
// Get lead form by id
//
// **This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Gets a lead form given it's ID. It must also be associated with the provided ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
//
lead_form_t* LeadFormsAPI_leadFormGet(apiClient_t *apiClient, char *lead_form_id, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**lead_form_id** | **char \*** | The ID of this lead form | 
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 

### Return type

[lead_form_t](lead_form.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **LeadFormsAPI_leadFormTestCreate**
```c
// Create lead form test data
//
// Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.
//
lead_form_test_t* LeadFormsAPI_leadFormTestCreate(apiClient_t *apiClient, char *ad_account_id, char *lead_form_id, lead_form_test_create_t *lead_form_test_create);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** |  | 
**lead_form_id** | **char \*** | Unique identifier of a lead form. | 
**lead_form_test_create** | **[lead_form_test_create_t](lead_form_test_create.md) \*** |  | 

### Return type

[lead_form_test_t](lead_form_test.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **LeadFormsAPI_leadFormsCreate**
```c
// Create lead forms
//
// **This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form's description, questions and confirmation sections.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
//
lead_forms_create_200_response_t* LeadFormsAPI_leadFormsCreate(apiClient_t *apiClient, char *ad_account_id, list_t *lead_form_create);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**lead_form_create** | **[list_t](lead_form_create.md) \*** |  | 

### Return type

[lead_forms_create_200_response_t](lead_forms_create_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **LeadFormsAPI_leadFormsList**
```c
// List lead forms
//
// **This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  List lead forms associated with an ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
//
lead_forms_list_200_response_t* LeadFormsAPI_leadFormsList(apiClient_t *apiClient, char *ad_account_id, char *bookmark, int *page_size, pinterest_lib_pagination_order_e order);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
**order** | **pinterest_lib_pagination_order_e** | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 

### Return type

[lead_forms_list_200_response_t](lead_forms_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **LeadFormsAPI_leadFormsUpdate**
```c
// Update lead forms
//
// **This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
//
lead_forms_create_200_response_t* LeadFormsAPI_leadFormsUpdate(apiClient_t *apiClient, char *ad_account_id, list_t *lead_form_batch_update);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**lead_form_batch_update** | **[list_t](lead_form_batch_update.md) \*** |  | 

### Return type

[lead_forms_create_200_response_t](lead_forms_create_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

