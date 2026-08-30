# WWW::OpenAPIClient::LeadFormsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::LeadFormsApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**lead_form_get**](LeadFormsApi.md#lead_form_get) | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id
[**lead_form_test_create**](LeadFormsApi.md#lead_form_test_create) | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data
[**lead_forms_create**](LeadFormsApi.md#lead_forms_create) | **POST** /ad_accounts/{ad_account_id}/lead_forms | Create lead forms
[**lead_forms_list**](LeadFormsApi.md#lead_forms_list) | **GET** /ad_accounts/{ad_account_id}/lead_forms | List lead forms
[**lead_forms_update**](LeadFormsApi.md#lead_forms_update) | **PATCH** /ad_accounts/{ad_account_id}/lead_forms | Update lead forms


# **lead_form_get**
> LeadForm lead_form_get(lead_form_id => $lead_form_id, ad_account_id => $ad_account_id)

Get lead form by id

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Gets a lead form given it's ID. It must also be associated with the provided ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::LeadFormsApi;
my $api_instance = WWW::OpenAPIClient::LeadFormsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $lead_form_id = "lead_form_id_example"; # string | The ID of this lead form
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->lead_form_get(lead_form_id => $lead_form_id, ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LeadFormsApi->lead_form_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lead_form_id** | **string**| The ID of this lead form | 
 **ad_account_id** | **string**| Unique identifier of an ad account. | 

### Return type

[**LeadForm**](LeadForm.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **lead_form_test_create**
> LeadFormTest lead_form_test_create(ad_account_id => $ad_account_id, lead_form_id => $lead_form_id, lead_form_test_create => $lead_form_test_create)

Create lead form test data

Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::LeadFormsApi;
my $api_instance = WWW::OpenAPIClient::LeadFormsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | 
my $lead_form_id = "lead_form_id_example"; # string | Unique identifier of a lead form.
my $lead_form_test_create = WWW::OpenAPIClient::Object::LeadFormTestCreate->new(); # LeadFormTestCreate | 

eval {
    my $result = $api_instance->lead_form_test_create(ad_account_id => $ad_account_id, lead_form_id => $lead_form_id, lead_form_test_create => $lead_form_test_create);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LeadFormsApi->lead_form_test_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**|  | 
 **lead_form_id** | **string**| Unique identifier of a lead form. | 
 **lead_form_test_create** | [**LeadFormTestCreate**](LeadFormTestCreate.md)|  | 

### Return type

[**LeadFormTest**](LeadFormTest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **lead_forms_create**
> LeadFormsCreate200Response lead_forms_create(ad_account_id => $ad_account_id, lead_form_create => $lead_form_create)

Create lead forms

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form's description, questions and confirmation sections.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::LeadFormsApi;
my $api_instance = WWW::OpenAPIClient::LeadFormsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $lead_form_create = [WWW::OpenAPIClient::Object::ARRAY[LeadFormCreate]->new()]; # ARRAY[LeadFormCreate] | 

eval {
    my $result = $api_instance->lead_forms_create(ad_account_id => $ad_account_id, lead_form_create => $lead_form_create);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LeadFormsApi->lead_forms_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **lead_form_create** | [**ARRAY[LeadFormCreate]**](LeadFormCreate.md)|  | 

### Return type

[**LeadFormsCreate200Response**](LeadFormsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **lead_forms_list**
> LeadFormsList200Response lead_forms_list(ad_account_id => $ad_account_id, bookmark => $bookmark, page_size => $page_size, order => $order)

List lead forms

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  List lead forms associated with an ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::LeadFormsApi;
my $api_instance = WWW::OpenAPIClient::LeadFormsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
my $order = new WWW::OpenAPIClient.PinterestLibPaginationOrder(); # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.

eval {
    my $result = $api_instance->lead_forms_list(ad_account_id => $ad_account_id, bookmark => $bookmark, page_size => $page_size, order => $order);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LeadFormsApi->lead_forms_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 

### Return type

[**LeadFormsList200Response**](LeadFormsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **lead_forms_update**
> LeadFormsCreate200Response lead_forms_update(ad_account_id => $ad_account_id, lead_form_batch_update => $lead_form_batch_update)

Update lead forms

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::LeadFormsApi;
my $api_instance = WWW::OpenAPIClient::LeadFormsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $lead_form_batch_update = [WWW::OpenAPIClient::Object::ARRAY[LeadFormBatchUpdate]->new()]; # ARRAY[LeadFormBatchUpdate] | 

eval {
    my $result = $api_instance->lead_forms_update(ad_account_id => $ad_account_id, lead_form_batch_update => $lead_form_batch_update);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LeadFormsApi->lead_forms_update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **lead_form_batch_update** | [**ARRAY[LeadFormBatchUpdate]**](LeadFormBatchUpdate.md)|  | 

### Return type

[**LeadFormsCreate200Response**](LeadFormsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

