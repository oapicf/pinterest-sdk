# WWW::OpenAPIClient::SchedulesApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::SchedulesApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**schedules_create**](SchedulesApi.md#schedules_create) | **POST** /ad_accounts/{ad_account_id}/schedules | Create schedules
[**schedules_list**](SchedulesApi.md#schedules_list) | **GET** /ad_accounts/{ad_account_id}/schedules | Get Schedules
[**schedules_update**](SchedulesApi.md#schedules_update) | **PATCH** /ad_accounts/{ad_account_id}/schedules | Update schedules


# **schedules_create**
> ARRAY[SchedulesCreate200ResponseInner] schedules_create(ad_account_id => $ad_account_id, schedule_create => $schedule_create)

Create schedules

Batch create schedules

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SchedulesApi;
my $api_instance = WWW::OpenAPIClient::SchedulesApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | 
my $schedule_create = [WWW::OpenAPIClient::Object::ARRAY[ScheduleCreate]->new()]; # ARRAY[ScheduleCreate] | 

eval {
    my $result = $api_instance->schedules_create(ad_account_id => $ad_account_id, schedule_create => $schedule_create);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling SchedulesApi->schedules_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**|  | 
 **schedule_create** | [**ARRAY[ScheduleCreate]**](ScheduleCreate.md)|  | 

### Return type

[**ARRAY[SchedulesCreate200ResponseInner]**](SchedulesCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **schedules_list**
> SchedulesList200Response schedules_list(ad_account_id => $ad_account_id, entity_ids => $entity_ids, bookmark => $bookmark, page_size => $page_size, order => $order, schedule_statuses => $schedule_statuses, schedule_type => $schedule_type)

Get Schedules

Get schedules for a specific advertiser

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SchedulesApi;
my $api_instance = WWW::OpenAPIClient::SchedulesApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | 
my $entity_ids = [("null")]; # ARRAY[string] | List of Entity IDs, must be associated with the Ad Accound ID provided in the path.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
my $order = new WWW::OpenAPIClient.PinterestLibPaginationOrder(); # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
my $schedule_statuses = [(new WWW::OpenAPIClient.ScheduleStatus())]; # ARRAY[ScheduleStatus] | Filter schedules by status (one or more)
my $schedule_type = new WWW::OpenAPIClient.ScheduleType(); # ScheduleType | Filter schedules by a type

eval {
    my $result = $api_instance->schedules_list(ad_account_id => $ad_account_id, entity_ids => $entity_ids, bookmark => $bookmark, page_size => $page_size, order => $order, schedule_statuses => $schedule_statuses, schedule_type => $schedule_type);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling SchedulesApi->schedules_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**|  | 
 **entity_ids** | [**ARRAY[string]**](string.md)| List of Entity IDs, must be associated with the Ad Accound ID provided in the path. | 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **schedule_statuses** | [**ARRAY[ScheduleStatus]**](ScheduleStatus.md)| Filter schedules by status (one or more) | [optional] 
 **schedule_type** | [**ScheduleType**](.md)| Filter schedules by a type | [optional] 

### Return type

[**SchedulesList200Response**](SchedulesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **schedules_update**
> ARRAY[SchedulesCreate200ResponseInner] schedules_update(ad_account_id => $ad_account_id, schedule_batch_update => $schedule_batch_update)

Update schedules

Update one or more schedules

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SchedulesApi;
my $api_instance = WWW::OpenAPIClient::SchedulesApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | 
my $schedule_batch_update = [WWW::OpenAPIClient::Object::ARRAY[ScheduleBatchUpdate]->new()]; # ARRAY[ScheduleBatchUpdate] | 

eval {
    my $result = $api_instance->schedules_update(ad_account_id => $ad_account_id, schedule_batch_update => $schedule_batch_update);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling SchedulesApi->schedules_update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**|  | 
 **schedule_batch_update** | [**ARRAY[ScheduleBatchUpdate]**](ScheduleBatchUpdate.md)|  | 

### Return type

[**ARRAY[SchedulesCreate200ResponseInner]**](SchedulesCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

