# WWW::OpenAPIClient::LabelsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::LabelsApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**labels_create**](LabelsApi.md#labels_create) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels
[**labels_list**](LabelsApi.md#labels_list) | **GET** /ad_accounts/{ad_account_id}/labels | List labels
[**labels_update**](LabelsApi.md#labels_update) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels


# **labels_create**
> LabelsResponse labels_create(ad_account_id => $ad_account_id, label_create_request => $label_create_request)

Create labels

<p> <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a> This endpoint is not available to all users. </p> <p>   Apply one or more labels to a campaign.   Currently, you can apply brand and custom labels. Future releases will provide more options.    <b>Note:</b> You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.  </p>

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::LabelsApi;
my $api_instance = WWW::OpenAPIClient::LabelsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $label_create_request = WWW::OpenAPIClient::Object::LabelCreateRequest->new(); # LabelCreateRequest | 

eval {
    my $result = $api_instance->labels_create(ad_account_id => $ad_account_id, label_create_request => $label_create_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LabelsApi->labels_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **label_create_request** | [**LabelCreateRequest**](LabelCreateRequest.md)|  | 

### Return type

[**LabelsResponse**](LabelsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **labels_list**
> LabelsList200Response labels_list(ad_account_id => $ad_account_id, campaign_ids => $campaign_ids, label_ids => $label_ids, entity_statuses => $entity_statuses, label_types => $label_types, page_size => $page_size, bookmark => $bookmark)

List labels

<p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   See a list of labels for assets that your account owns, and filter the list by different criteria. </p>

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::LabelsApi;
my $api_instance = WWW::OpenAPIClient::LabelsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $campaign_ids = [("null")]; # ARRAY[string] | List of Campaign Ids to use to filter the results.
my $label_ids = [("null")]; # ARRAY[string] | List of Label Ids to use to filter the results.
my $entity_statuses = [("ACTIVE")]; # ARRAY[string] | Label entity status
my $label_types = [["BRAND","CUSTOM"]]; # ARRAY[string] | Label type.
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items

eval {
    my $result = $api_instance->labels_list(ad_account_id => $ad_account_id, campaign_ids => $campaign_ids, label_ids => $label_ids, entity_statuses => $entity_statuses, label_types => $label_types, page_size => $page_size, bookmark => $bookmark);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LabelsApi->labels_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **campaign_ids** | [**ARRAY[string]**](string.md)| List of Campaign Ids to use to filter the results. | [optional] 
 **label_ids** | [**ARRAY[string]**](string.md)| List of Label Ids to use to filter the results. | [optional] 
 **entity_statuses** | [**ARRAY[string]**](string.md)| Label entity status | [optional] 
 **label_types** | [**ARRAY[string]**](string.md)| Label type. | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**LabelsList200Response**](LabelsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **labels_update**
> LabelsResponse labels_update(ad_account_id => $ad_account_id, label_update_request => $label_update_request)

Update labels

<p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   Change the properties of one or more labels. </p>

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::LabelsApi;
my $api_instance = WWW::OpenAPIClient::LabelsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $label_update_request = WWW::OpenAPIClient::Object::LabelUpdateRequest->new(); # LabelUpdateRequest | 

eval {
    my $result = $api_instance->labels_update(ad_account_id => $ad_account_id, label_update_request => $label_update_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LabelsApi->labels_update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **label_update_request** | [**LabelUpdateRequest**](LabelUpdateRequest.md)|  | 

### Return type

[**LabelsResponse**](LabelsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

