# AudienceInsightsApi

All URIs are relative to */v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**audienceInsightsGet**](AudienceInsightsApi.md#audienceInsightsGet) | **GET** /ad_accounts/{ad_account_id}/audience_insights | Get audience insights
[**audienceInsightsScopeAndTypeGet**](AudienceInsightsApi.md#audienceInsightsScopeAndTypeGet) | **GET** /ad_accounts/{ad_account_id}/insights/audiences | Get audience insights scope and type



## audienceInsightsGet

Get audience insights

Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the
ad account's engaged audience on Pinterest, the ad account's total audience on Pinterest and Pinterest's
total audience.<p/>
<a href=\"https://help.pinterest.com/en/business/article/audience-insights\" target=\"_blank\">Learn more about Audience Insights</a>.

### Example

```bash
 audienceInsightsGet ad_account_id=value  audience_insight_type=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **audienceInsightType** | [**AudienceInsightType**](.md) | Type of audience insights. | [default to null]

### Return type

[**AudienceInsightsResponse**](AudienceInsightsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## audienceInsightsScopeAndTypeGet

Get audience insights scope and type

Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.

### Example

```bash
 audienceInsightsScopeAndTypeGet ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]

### Return type

[**AudienceDefinitionResponse**](AudienceDefinitionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

