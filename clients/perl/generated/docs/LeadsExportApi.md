# WWW::OpenAPIClient::LeadsExportApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::LeadsExportApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**leads_export_create**](LeadsExportApi.md#leads_export_create) | **POST** /ad_accounts/{ad_account_id}/leads_export | Create a request to export leads collected from a lead ad
[**leads_export_get**](LeadsExportApi.md#leads_export_get) | **GET** /ad_accounts/{ad_account_id}/leads_export/{leads_export_id} | Get the lead export from the lead export create call


# **leads_export_create**
> LeadsExports leads_export_create(ad_account_id => $ad_account_id, leads_exports_create => $leads_exports_create)

Create a request to export leads collected from a lead ad

**This feature is currently in beta and not available to all apps. If you're interested in joining the beta, please reach out to your Pinterest account manager.**  Create an export of leads collected from a lead ad. This returns a `leads_export_id` token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::LeadsExportApi;
my $api_instance = WWW::OpenAPIClient::LeadsExportApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $leads_exports_create = WWW::OpenAPIClient::Object::LeadsExportsCreate->new(); # LeadsExportsCreate | 

eval {
    my $result = $api_instance->leads_export_create(ad_account_id => $ad_account_id, leads_exports_create => $leads_exports_create);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LeadsExportApi->leads_export_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **leads_exports_create** | [**LeadsExportsCreate**](LeadsExportsCreate.md)|  | 

### Return type

[**LeadsExports**](LeadsExports.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **leads_export_get**
> LeadsExportResponseData leads_export_get(ad_account_id => $ad_account_id, leads_export_id => $leads_export_id)

Get the lead export from the lead export create call

**This feature is currently in beta and not available to all apps. If you're interested in joining the beta, please reach out to your Pinterest account manager.**  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::LeadsExportApi;
my $api_instance = WWW::OpenAPIClient::LeadsExportApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $leads_export_id = "leads_export_id_example"; # string | lead_export_id token returned from the create a lead export endpoint

eval {
    my $result = $api_instance->leads_export_get(ad_account_id => $ad_account_id, leads_export_id => $leads_export_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LeadsExportApi->leads_export_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **leads_export_id** | **string**| lead_export_id token returned from the create a lead export endpoint | 

### Return type

[**LeadsExportResponseData**](LeadsExportResponseData.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

