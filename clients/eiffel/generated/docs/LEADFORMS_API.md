# LEADFORMS_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**lead_form_get**](LEADFORMS_API.md#lead_form_get) | **Get** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id
[**lead_form_test_create**](LEADFORMS_API.md#lead_form_test_create) | **Post** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data
[**lead_forms_create**](LEADFORMS_API.md#lead_forms_create) | **Post** /ad_accounts/{ad_account_id}/lead_forms | Create lead forms
[**lead_forms_list**](LEADFORMS_API.md#lead_forms_list) | **Get** /ad_accounts/{ad_account_id}/lead_forms | List lead forms
[**lead_forms_update**](LEADFORMS_API.md#lead_forms_update) | **Patch** /ad_accounts/{ad_account_id}/lead_forms | Update lead forms


# **lead_form_get**
> lead_form_get (lead_form_id: STRING_32 ; ad_account_id: STRING_32 ): detachable LEAD_FORM


Get lead form by id

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Gets a lead form given it's ID. It must also be associated with the provided ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lead_form_id** | **STRING_32**| The ID of this lead form | [default to null]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]

### Return type

[**LEAD_FORM**](LeadForm.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **lead_form_test_create**
> lead_form_test_create (ad_account_id: STRING_32 ; lead_form_id: STRING_32 ; lead_form_test_create: LEAD_FORM_TEST_CREATE ): detachable LEAD_FORM_TEST


Create lead form test data

Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**|  | [default to null]
 **lead_form_id** | **STRING_32**| Unique identifier of a lead form. | [default to null]
 **lead_form_test_create** | [**LEAD_FORM_TEST_CREATE**](LEAD_FORM_TEST_CREATE.md)|  | 

### Return type

[**LEAD_FORM_TEST**](LeadFormTest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **lead_forms_create**
> lead_forms_create (ad_account_id: STRING_32 ; lead_form_create: LIST [LEAD_FORM_CREATE] ): detachable LEAD_FORMS_CREATE_200_RESPONSE


Create lead forms

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form's description, questions and confirmation sections.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **lead_form_create** | [**LIST [LEAD_FORM_CREATE]**](LeadFormCreate.md)|  | 

### Return type

[**LEAD_FORMS_CREATE_200_RESPONSE**](lead_forms_create_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **lead_forms_list**
> lead_forms_list (ad_account_id: STRING_32 ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ; order:  detachable PINTEREST_LIB_PAGINATION_ORDER ): detachable LEAD_FORMS_LIST_200_RESPONSE


List lead forms

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  List lead forms associated with an ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PINTEREST_LIB_PAGINATION_ORDER**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null]

### Return type

[**LEAD_FORMS_LIST_200_RESPONSE**](lead_forms_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **lead_forms_update**
> lead_forms_update (ad_account_id: STRING_32 ; lead_form_batch_update: LIST [LEAD_FORM_BATCH_UPDATE] ): detachable LEAD_FORMS_CREATE_200_RESPONSE


Update lead forms

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **lead_form_batch_update** | [**LIST [LEAD_FORM_BATCH_UPDATE]**](LeadFormBatchUpdate.md)|  | 

### Return type

[**LEAD_FORMS_CREATE_200_RESPONSE**](lead_forms_create_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

