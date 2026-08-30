# LeadFormsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**leadForm/get**](LeadFormsApi.md#leadForm/get) | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id |
| [**leadFormTest/create**](LeadFormsApi.md#leadFormTest/create) | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data |
| [**leadForms/create**](LeadFormsApi.md#leadForms/create) | **POST** /ad_accounts/{ad_account_id}/lead_forms | Create lead forms |
| [**leadForms/list**](LeadFormsApi.md#leadForms/list) | **GET** /ad_accounts/{ad_account_id}/lead_forms | List lead forms |
| [**leadForms/update**](LeadFormsApi.md#leadForms/update) | **PATCH** /ad_accounts/{ad_account_id}/lead_forms | Update lead forms |


<a name="leadForm/get"></a>
# **leadForm/get**
> LeadForm leadForm/get(lead\_form\_id, ad\_account\_id)

Get lead form by id

    **This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lead\_form\_id** | **String**| The ID of this lead form | [default to null] |
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |

### Return type

[**LeadForm**](../Models/LeadForm.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="leadFormTest/create"></a>
# **leadFormTest/create**
> LeadFormTest leadFormTest/create(ad\_account\_id, lead\_form\_id, LeadFormTestCreate)

Create lead form test data

    Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**|  | [default to null] |
| **lead\_form\_id** | **String**| Unique identifier of a lead form. | [default to null] |
| **LeadFormTestCreate** | [**LeadFormTestCreate**](../Models/LeadFormTestCreate.md)|  | |

### Return type

[**LeadFormTest**](../Models/LeadFormTest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="leadForms/create"></a>
# **leadForms/create**
> lead_forms_create_200_response leadForms/create(ad\_account\_id, LeadFormCreate)

Create lead forms

    **This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form&#39;s description, questions and confirmation sections.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **LeadFormCreate** | [**List**](../Models/LeadFormCreate.md)|  | |

### Return type

[**lead_forms_create_200_response**](../Models/lead_forms_create_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="leadForms/list"></a>
# **leadForms/list**
> lead_forms_list_200_response leadForms/list(ad\_account\_id, bookmark, page\_size, order)

List lead forms

    **This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  List lead forms associated with an ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |
| **order** | [**Pinterest.Lib.PaginationOrder**](../Models/.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null] [enum: ASCENDING, DESCENDING] |

### Return type

[**lead_forms_list_200_response**](../Models/lead_forms_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="leadForms/update"></a>
# **leadForms/update**
> lead_forms_create_200_response leadForms/update(ad\_account\_id, LeadFormBatchUpdate)

Update lead forms

    **This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **LeadFormBatchUpdate** | [**List**](../Models/LeadFormBatchUpdate.md)|  | |

### Return type

[**lead_forms_create_200_response**](../Models/lead_forms_create_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

