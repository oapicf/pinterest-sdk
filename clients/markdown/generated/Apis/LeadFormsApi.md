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
> LeadFormResponse leadForm/get(ad\_account\_id, lead\_form\_id)

Get lead form by id

    &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **lead\_form\_id** | **String**| Unique identifier of a lead form. | [default to null] |

### Return type

[**LeadFormResponse**](../Models/LeadFormResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="leadFormTest/create"></a>
# **leadFormTest/create**
> LeadFormTestResponse leadFormTest/create(ad\_account\_id, lead\_form\_id, LeadFormTestRequest)

Create lead form test data

    Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **lead\_form\_id** | **String**| Unique identifier of a lead form. | [default to null] |
| **LeadFormTestRequest** | [**LeadFormTestRequest**](../Models/LeadFormTestRequest.md)| Subscription to create. | |

### Return type

[**LeadFormTestResponse**](../Models/LeadFormTestResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="leadForms/create"></a>
# **leadForms/create**
> LeadFormArrayResponse leadForms/create(ad\_account\_id, LeadFormCreateRequest)

Create lead forms

    &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form’ s description, questions and confirmation sections.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **LeadFormCreateRequest** | [**List**](../Models/LeadFormCreateRequest.md)| List of lead forms to create, size limit [1, 30]. | |

### Return type

[**LeadFormArrayResponse**](../Models/LeadFormArrayResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="leadForms/list"></a>
# **leadForms/list**
> lead_forms_list_200_response leadForms/list(ad\_account\_id, page\_size, order, bookmark)

List lead forms

    &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  List lead forms associated with an ad account ID.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **order** | **String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null] [enum: ASCENDING, DESCENDING] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |

### Return type

[**lead_forms_list_200_response**](../Models/lead_forms_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="leadForms/update"></a>
# **leadForms/update**
> LeadFormArrayResponse leadForms/update(ad\_account\_id, LeadFormUpdateRequest)

Update lead forms

    &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **LeadFormUpdateRequest** | [**List**](../Models/LeadFormUpdateRequest.md)| List of lead forms to update, size limit [1, 30]. | |

### Return type

[**LeadFormArrayResponse**](../Models/LeadFormArrayResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

