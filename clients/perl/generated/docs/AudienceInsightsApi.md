# WWW::OpenAPIClient::AudienceInsightsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::AudienceInsightsApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**audience_insights_get**](AudienceInsightsApi.md#audience_insights_get) | **GET** /ad_accounts/{ad_account_id}/audience_insights | Get audience insights
[**audience_insights_scope_and_type_get**](AudienceInsightsApi.md#audience_insights_scope_and_type_get) | **GET** /ad_accounts/{ad_account_id}/insights/audiences | Get audience insights scope and type


# **audience_insights_get**
> AudienceInsightsResponse audience_insights_get(ad_account_id => $ad_account_id, audience_insight_type => $audience_insight_type)

Get audience insights

Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account's engaged audience on Pinterest, the ad account's total audience on Pinterest and Pinterest's total audience.<p/> <a href=\"https://help.pinterest.com/en/business/article/audience-insights\" target=\"_blank\">Learn more about Audience Insights</a>.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AudienceInsightsApi;
my $api_instance = WWW::OpenAPIClient::AudienceInsightsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $audience_insight_type = new WWW::OpenAPIClient.AudienceInsightType(); # AudienceInsightType | Type of audience insights.

eval {
    my $result = $api_instance->audience_insights_get(ad_account_id => $ad_account_id, audience_insight_type => $audience_insight_type);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AudienceInsightsApi->audience_insights_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 
 **audience_insight_type** | [**AudienceInsightType**](.md)| Type of audience insights. | 

### Return type

[**AudienceInsightsResponse**](AudienceInsightsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **audience_insights_scope_and_type_get**
> AudienceDefinitionResponse audience_insights_scope_and_type_get(ad_account_id => $ad_account_id)

Get audience insights scope and type

Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AudienceInsightsApi;
my $api_instance = WWW::OpenAPIClient::AudienceInsightsApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->audience_insights_scope_and_type_get(ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AudienceInsightsApi->audience_insights_scope_and_type_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | 

### Return type

[**AudienceDefinitionResponse**](AudienceDefinitionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

