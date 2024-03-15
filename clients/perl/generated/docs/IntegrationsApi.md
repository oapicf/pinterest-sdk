# WWW::OpenAPIClient::IntegrationsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::IntegrationsApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**integrations_commerce_del**](IntegrationsApi.md#integrations_commerce_del) | **DELETE** /integrations/commerce/{external_business_id} | Delete commerce integration
[**integrations_commerce_get**](IntegrationsApi.md#integrations_commerce_get) | **GET** /integrations/commerce/{external_business_id} | Get commerce integration
[**integrations_commerce_patch**](IntegrationsApi.md#integrations_commerce_patch) | **PATCH** /integrations/commerce/{external_business_id} | Update commerce integration
[**integrations_commerce_post**](IntegrationsApi.md#integrations_commerce_post) | **POST** /integrations/commerce | Create commerce integration
[**integrations_get_by_id**](IntegrationsApi.md#integrations_get_by_id) | **GET** /integrations/{id} | Get integration metadata
[**integrations_get_list**](IntegrationsApi.md#integrations_get_list) | **GET** /integrations | Get integration metadata list
[**integrations_logs_post**](IntegrationsApi.md#integrations_logs_post) | **POST** /integrations/logs | Receives batched logs from integration applications.


# **integrations_commerce_del**
> integrations_commerce_del(external_business_id => $external_business_id)

Delete commerce integration

Delete commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::IntegrationsApi;
my $api_instance = WWW::OpenAPIClient::IntegrationsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $external_business_id = "external_business_id_example"; # string | External business ID for the integration.

eval {
    $api_instance->integrations_commerce_del(external_business_id => $external_business_id);
};
if ($@) {
    warn "Exception when calling IntegrationsApi->integrations_commerce_del: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **external_business_id** | **string**| External business ID for the integration. | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrations_commerce_get**
> IntegrationMetadata integrations_commerce_get(external_business_id => $external_business_id)

Get commerce integration

Get commerce integration metadata associated with the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::IntegrationsApi;
my $api_instance = WWW::OpenAPIClient::IntegrationsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $external_business_id = "external_business_id_example"; # string | External business ID for the integration.

eval {
    my $result = $api_instance->integrations_commerce_get(external_business_id => $external_business_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling IntegrationsApi->integrations_commerce_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **external_business_id** | **string**| External business ID for the integration. | 

### Return type

[**IntegrationMetadata**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrations_commerce_patch**
> IntegrationMetadata integrations_commerce_patch(external_business_id => $external_business_id, integration_request_patch => $integration_request_patch)

Update commerce integration

Update commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::IntegrationsApi;
my $api_instance = WWW::OpenAPIClient::IntegrationsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $external_business_id = "external_business_id_example"; # string | External business ID for the integration.
my $integration_request_patch = WWW::OpenAPIClient::Object::IntegrationRequestPatch->new(); # IntegrationRequestPatch | Parameters to get create/update the Integration Metadata

eval {
    my $result = $api_instance->integrations_commerce_patch(external_business_id => $external_business_id, integration_request_patch => $integration_request_patch);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling IntegrationsApi->integrations_commerce_patch: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **external_business_id** | **string**| External business ID for the integration. | 
 **integration_request_patch** | [**IntegrationRequestPatch**](IntegrationRequestPatch.md)| Parameters to get create/update the Integration Metadata | [optional] 

### Return type

[**IntegrationMetadata**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrations_commerce_post**
> IntegrationMetadata integrations_commerce_post(integration_request => $integration_request)

Create commerce integration

Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::IntegrationsApi;
my $api_instance = WWW::OpenAPIClient::IntegrationsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $integration_request = WWW::OpenAPIClient::Object::IntegrationRequest->new(); # IntegrationRequest | Parameters to get create/update the Integration Metadata

eval {
    my $result = $api_instance->integrations_commerce_post(integration_request => $integration_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling IntegrationsApi->integrations_commerce_post: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integration_request** | [**IntegrationRequest**](IntegrationRequest.md)| Parameters to get create/update the Integration Metadata | [optional] 

### Return type

[**IntegrationMetadata**](IntegrationMetadata.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrations_get_by_id**
> IntegrationRecord integrations_get_by_id(id => $id)

Get integration metadata

Get integration metadata by ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::IntegrationsApi;
my $api_instance = WWW::OpenAPIClient::IntegrationsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $id = "id_example"; # string | Integration ID.

eval {
    my $result = $api_instance->integrations_get_by_id(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling IntegrationsApi->integrations_get_by_id: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| Integration ID. | 

### Return type

[**IntegrationRecord**](IntegrationRecord.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrations_get_list**
> IntegrationsGetList200Response integrations_get_list(bookmark => $bookmark, page_size => $page_size)

Get integration metadata list

Get integration metadata list. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::IntegrationsApi;
my $api_instance = WWW::OpenAPIClient::IntegrationsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.

eval {
    my $result = $api_instance->integrations_get_list(bookmark => $bookmark, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling IntegrationsApi->integrations_get_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**IntegrationsGetList200Response**](IntegrationsGetList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **integrations_logs_post**
> IntegrationLogsSuccessResponse integrations_logs_post(integration_logs_request => $integration_logs_request)

Receives batched logs from integration applications.

This endpoint receives batched logs from integration applications on partner platforms. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::IntegrationsApi;
my $api_instance = WWW::OpenAPIClient::IntegrationsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $integration_logs_request = WWW::OpenAPIClient::Object::IntegrationLogsRequest->new(); # IntegrationLogsRequest | Ingest log information from external integration application.

eval {
    my $result = $api_instance->integrations_logs_post(integration_logs_request => $integration_logs_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling IntegrationsApi->integrations_logs_post: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integration_logs_request** | [**IntegrationLogsRequest**](IntegrationLogsRequest.md)| Ingest log information from external integration application. | 

### Return type

[**IntegrationLogsSuccessResponse**](IntegrationLogsSuccessResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

