# LEADFORMS_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**lead_form_get**](LEADFORMS_API.md#lead_form_get) | **Get** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id
[**lead_form_test_create**](LEADFORMS_API.md#lead_form_test_create) | **Post** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data
[**lead_forms_list**](LEADFORMS_API.md#lead_forms_list) | **Get** /ad_accounts/{ad_account_id}/lead_forms | Get lead forms


# **lead_form_get**
> lead_form_get (ad_account_id: STRING_32 ; lead_form_id: STRING_32 ): detachable LEAD_FORM_RESPONSE


Get lead form by id

Gets a lead form given it's ID. It must also be associated with the provided ad account ID. Retrieving an advertiser's lead form will only contain results if you're a part of the Lead ads beta. If you're interested in joining the beta, please reach out to your Pinterest account manager.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **lead_form_id** | **STRING_32**| Unique identifier of a lead form. | [default to null]

### Return type

[**LEAD_FORM_RESPONSE**](LeadFormResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **lead_form_test_create**
> lead_form_test_create (ad_account_id: STRING_32 ; lead_form_id: STRING_32 ; lead_form_test_request: LEAD_FORM_TEST_REQUEST ): detachable LEAD_FORM_TEST_RESPONSE


Create lead form test data

Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **lead_form_id** | **STRING_32**| Unique identifier of a lead form. | [default to null]
 **lead_form_test_request** | [**LEAD_FORM_TEST_REQUEST**](LEAD_FORM_TEST_REQUEST.md)| Subscription to create. | 

### Return type

[**LEAD_FORM_TEST_RESPONSE**](LeadFormTestResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **lead_forms_list**
> lead_forms_list (ad_account_id: STRING_32 ; page_size:  detachable INTEGER_32 ; order:  detachable STRING_32 ; bookmark:  detachable STRING_32 ): detachable LEAD_FORMS_LIST_200_RESPONSE


Get lead forms

Gets all Lead Forms associated with an ad account ID. Retrieving an advertiser's list of lead forms will only contain results if you're a part of the Lead ads beta.  If you're interested in joining the beta, please reach out to your Pinterest account manager.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **STRING_32**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]

### Return type

[**LEAD_FORMS_LIST_200_RESPONSE**](lead_forms_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

