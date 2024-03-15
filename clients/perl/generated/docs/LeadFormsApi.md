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
[**lead_forms_list**](LeadFormsApi.md#lead_forms_list) | **GET** /ad_accounts/{ad_account_id}/lead_forms | Get lead forms


# **lead_form_get**
> LeadFormResponse lead_form_get(ad_account_id => $ad_account_id, lead_form_id => $lead_form_id)

Get lead form by id

Gets a lead form given it's ID. It must also be associated with the provided ad account ID. Retrieving an advertiser's lead form will only contain results if you're a part of the Lead ads beta. If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::LeadFormsApi;
my $api_instance = WWW::OpenAPIClient::LeadFormsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $lead_form_id = 1234567890123; # string | Unique identifier of a lead form.

eval {
    my $result = $api_instance->lead_form_get(ad_account_id => $ad_account_id, lead_form_id => $lead_form_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LeadFormsApi->lead_form_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **lead_form_id** | **string**| Unique identifier of a lead form. | 

### Return type

[**LeadFormResponse**](LeadFormResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **lead_form_test_create**
> LeadFormTestResponse lead_form_test_create(ad_account_id => $ad_account_id, lead_form_id => $lead_form_id, lead_form_test_request => $lead_form_test_request)

Create lead form test data

Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::LeadFormsApi;
my $api_instance = WWW::OpenAPIClient::LeadFormsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $lead_form_id = 1234567890123; # string | Unique identifier of a lead form.
my $lead_form_test_request = WWW::OpenAPIClient::Object::LeadFormTestRequest->new(); # LeadFormTestRequest | Subscription to create.

eval {
    my $result = $api_instance->lead_form_test_create(ad_account_id => $ad_account_id, lead_form_id => $lead_form_id, lead_form_test_request => $lead_form_test_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LeadFormsApi->lead_form_test_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **lead_form_id** | **string**| Unique identifier of a lead form. | 
 **lead_form_test_request** | [**LeadFormTestRequest**](LeadFormTestRequest.md)| Subscription to create. | 

### Return type

[**LeadFormTestResponse**](LeadFormTestResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **lead_forms_list**
> LeadFormsList200Response lead_forms_list(ad_account_id => $ad_account_id, page_size => $page_size, order => $order, bookmark => $bookmark)

Get lead forms

Gets all Lead Forms associated with an ad account ID. Retrieving an advertiser's list of lead forms will only contain results if you're a part of the Lead ads beta.  If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::LeadFormsApi;
my $api_instance = WWW::OpenAPIClient::LeadFormsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
my $order = ASCENDING; # string | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items

eval {
    my $result = $api_instance->lead_forms_list(ad_account_id => $ad_account_id, page_size => $page_size, order => $order, bookmark => $bookmark);
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
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **string**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**LeadFormsList200Response**](LeadFormsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

