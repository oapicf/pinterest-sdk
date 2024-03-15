# LeadFormsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**LeadFormsAPI_leadFormGet**](LeadFormsAPI.md#LeadFormsAPI_leadFormGet) | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id
[**LeadFormsAPI_leadFormTestCreate**](LeadFormsAPI.md#LeadFormsAPI_leadFormTestCreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data
[**LeadFormsAPI_leadFormsList**](LeadFormsAPI.md#LeadFormsAPI_leadFormsList) | **GET** /ad_accounts/{ad_account_id}/lead_forms | Get lead forms


# **LeadFormsAPI_leadFormGet**
```c
// Get lead form by id
//
// Gets a lead form given it's ID. It must also be associated with the provided ad account ID. Retrieving an advertiser's lead form will only contain results if you're a part of the Lead ads beta. If you're interested in joining the beta, please reach out to your Pinterest account manager.
//
lead_form_response_t* LeadFormsAPI_leadFormGet(apiClient_t *apiClient, char *ad_account_id, char *lead_form_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**lead_form_id** | **char \*** | Unique identifier of a lead form. | 

### Return type

[lead_form_response_t](lead_form_response.md) *


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
// Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>
//
lead_form_test_response_t* LeadFormsAPI_leadFormTestCreate(apiClient_t *apiClient, char *ad_account_id, char *lead_form_id, lead_form_test_request_t *lead_form_test_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**lead_form_id** | **char \*** | Unique identifier of a lead form. | 
**lead_form_test_request** | **[lead_form_test_request_t](lead_form_test_request.md) \*** | Subscription to create. | 

### Return type

[lead_form_test_response_t](lead_form_test_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **LeadFormsAPI_leadFormsList**
```c
// Get lead forms
//
// Gets all Lead Forms associated with an ad account ID. Retrieving an advertiser's list of lead forms will only contain results if you're a part of the Lead ads beta.  If you're interested in joining the beta, please reach out to your Pinterest account manager.
//
lead_forms_list_200_response_t* LeadFormsAPI_leadFormsList(apiClient_t *apiClient, char *ad_account_id, int *page_size, pinterest_rest_api_leadFormsList_order_e order, char *bookmark);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**page_size** | **int \*** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
**order** | **pinterest_rest_api_leadFormsList_order_e** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 

### Return type

[lead_forms_list_200_response_t](lead_forms_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

