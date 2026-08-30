# lead_forms_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
**lead_forms/create**](lead_forms_api.md#lead_forms/create) | **POST** /ad_accounts/{ad_account_id}/lead_forms | Create lead forms
**lead_forms/list**](lead_forms_api.md#lead_forms/list) | **GET** /ad_accounts/{ad_account_id}/lead_forms | List lead forms
**lead_forms/update**](lead_forms_api.md#lead_forms/update) | **PATCH** /ad_accounts/{ad_account_id}/lead_forms | Update lead forms
**lead_form/get**](lead_forms_api.md#lead_form/get) | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id
**lead_form_test/create**](lead_forms_api.md#lead_form_test/create) | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data


# **lead_forms/create**
> models::LeadFormsCreate200Response lead_forms/create(ctx, ad_account_id, lead_form_create)
Create lead forms

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form's description, questions and confirmation sections.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **lead_form_create** | [**LeadFormCreate**](LeadFormCreate.md)|  | 

### Return type

[**models::LeadFormsCreate200Response**](lead_forms_create_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **lead_forms/list**
> models::LeadFormsList200Response lead_forms/list(ctx, ad_account_id, optional)
List lead forms

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  List lead forms associated with an ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | 
 **page_size** | **i32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]
 **order** | [****](.md)| The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. | 

### Return type

[**models::LeadFormsList200Response**](lead_forms_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **lead_forms/update**
> models::LeadFormsCreate200Response lead_forms/update(ctx, ad_account_id, lead_form_batch_update)
Update lead forms

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **lead_form_batch_update** | [**LeadFormBatchUpdate**](LeadFormBatchUpdate.md)|  | 

### Return type

[**models::LeadFormsCreate200Response**](lead_forms_create_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **lead_form/get**
> models::LeadForm lead_form/get(ctx, lead_form_id, ad_account_id)
Get lead form by id

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Gets a lead form given it's ID. It must also be associated with the provided ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **lead_form_id** | **String**| The ID of this lead form | 
  **ad_account_id** | **String**| Unique identifier of an ad account. | 

### Return type

[**models::LeadForm**](LeadForm.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **lead_form_test/create**
> models::LeadFormTest lead_form_test/create(ctx, ad_account_id, lead_form_id, lead_form_test_create)
Create lead form test data

Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**|  | 
  **lead_form_id** | **String**| Unique identifier of a lead form. | 
  **lead_form_test_create** | [**LeadFormTestCreate**](LeadFormTestCreate.md)|  | 

### Return type

[**models::LeadFormTest**](LeadFormTest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

