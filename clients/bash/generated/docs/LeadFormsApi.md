# LeadFormsApi

All URIs are relative to */v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**leadFormGet**](LeadFormsApi.md#leadFormGet) | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id
[**leadFormTestCreate**](LeadFormsApi.md#leadFormTestCreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data
[**leadFormsList**](LeadFormsApi.md#leadFormsList) | **GET** /ad_accounts/{ad_account_id}/lead_forms | Get lead forms



## leadFormGet

Get lead form by id

Gets a lead form given it's ID. It must also be associated with the provided ad account ID.
Retrieving an advertiser's lead form will only contain results if you're a part of the Lead ads beta. If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example

```bash
 leadFormGet ad_account_id=value lead_form_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **leadFormId** | **string** | Unique identifier of a lead form. | [default to null]

### Return type

[**LeadFormResponse**](LeadFormResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## leadFormTestCreate

Create lead form test data

Create lead form test data based on the list of answers provided as part of the body.
- List of answers should follow the questions creation order.

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Example

```bash
 leadFormTestCreate ad_account_id=value lead_form_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **leadFormId** | **string** | Unique identifier of a lead form. | [default to null]
 **leadFormTestRequest** | [**LeadFormTestRequest**](LeadFormTestRequest.md) | Subscription to create. |

### Return type

[**LeadFormTestResponse**](LeadFormTestResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## leadFormsList

Get lead forms

Gets all Lead Forms associated with an ad account ID.
Retrieving an advertiser's list of lead forms will only contain results if you're a part of the Lead ads beta.  If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example

```bash
 leadFormsList ad_account_id=value  page_size=value  order=value  bookmark=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **pageSize** | **integer** | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. | [optional] [default to 25]
 **order** | **string** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING”
by ID. Note that higher-value IDs are associated with more-recently added
items. | [optional] [default to null]
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]

### Return type

[**LeadFormsList200Response**](LeadFormsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
