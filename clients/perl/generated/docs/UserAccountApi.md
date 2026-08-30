# WWW::OpenAPIClient::UserAccountApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::UserAccountApi;
```

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**boards_user_follows_list**](UserAccountApi.md#boards_user_follows_list) | **GET** /user_account/following/boards | List following boards
[**follow_user_update**](UserAccountApi.md#follow_user_update) | **POST** /user_account/following/{username} | Follow user
[**followers_list**](UserAccountApi.md#followers_list) | **GET** /user_account/followers | List followers
[**linked_business_accounts_get**](UserAccountApi.md#linked_business_accounts_get) | **GET** /user_account/businesses | List linked businesses
[**unverify_website_delete**](UserAccountApi.md#unverify_website_delete) | **DELETE** /user_account/websites | Unverify website
[**user_account_analytics**](UserAccountApi.md#user_account_analytics) | **GET** /user_account/analytics | Get user account analytics
[**user_account_analytics_top_pins**](UserAccountApi.md#user_account_analytics_top_pins) | **GET** /user_account/analytics/top_pins | Get user account top pins analytics
[**user_account_analytics_top_video_pins**](UserAccountApi.md#user_account_analytics_top_video_pins) | **GET** /user_account/analytics/top_video_pins | Get user account top video pins analytics
[**user_account_followed_interests**](UserAccountApi.md#user_account_followed_interests) | **GET** /users/{username}/interests/follow | List following interests
[**user_account_get**](UserAccountApi.md#user_account_get) | **GET** /user_account | Get user account
[**user_following_get**](UserAccountApi.md#user_following_get) | **GET** /user_account/following | List following
[**user_websites_get**](UserAccountApi.md#user_websites_get) | **GET** /user_account/websites | Get user websites
[**verify_website_update**](UserAccountApi.md#verify_website_update) | **POST** /user_account/websites | Verify website
[**website_verification_get**](UserAccountApi.md#website_verification_get) | **GET** /user_account/websites/verification | Get user verification code for website claiming


# **boards_user_follows_list**
> BoardsList200Response boards_user_follows_list(ad_account_id => $ad_account_id, explicit_following => $explicit_following, bookmark => $bookmark, page_size => $page_size)

List following boards

Get a list of the boards a user follows. The request returns a board summary object array.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UserAccountApi;
my $api_instance = WWW::OpenAPIClient::UserAccountApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
    # Configure OAuth2 access token for authorization: client_credentials
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $explicit_following = false; # boolean | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.

eval {
    my $result = $api_instance->boards_user_follows_list(ad_account_id => $ad_account_id, explicit_following => $explicit_following, bookmark => $bookmark, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UserAccountApi->boards_user_follows_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 
 **explicit_following** | **boolean**| Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [optional] [default to false]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BoardsList200Response**](BoardsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **follow_user_update**
> FollowUser follow_user_update(username => $username, follow_user_create => $follow_user_create)

Follow user

**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Use this request, as a signed-in user, to follow another user.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UserAccountApi;
my $api_instance = WWW::OpenAPIClient::UserAccountApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $username = "username_example"; # string | A valid username
my $follow_user_create = WWW::OpenAPIClient::Object::FollowUserCreate->new(); # FollowUserCreate | 

eval {
    my $result = $api_instance->follow_user_update(username => $username, follow_user_create => $follow_user_create);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UserAccountApi->follow_user_update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **string**| A valid username | 
 **follow_user_create** | [**FollowUserCreate**](FollowUserCreate.md)|  | 

### Return type

[**FollowUser**](FollowUser.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **followers_list**
> FollowersList200Response followers_list(bookmark => $bookmark, page_size => $page_size)

List followers

Get a list of your followers.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UserAccountApi;
my $api_instance = WWW::OpenAPIClient::UserAccountApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
    # Configure OAuth2 access token for authorization: client_credentials
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.

eval {
    my $result = $api_instance->followers_list(bookmark => $bookmark, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UserAccountApi->followers_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**FollowersList200Response**](FollowersList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **linked_business_accounts_get**
> ARRAY[LinkedBusiness] linked_business_accounts_get()

List linked businesses

Get a list of your linked business accounts.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UserAccountApi;
my $api_instance = WWW::OpenAPIClient::UserAccountApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
    # Configure OAuth2 access token for authorization: client_credentials
    access_token => 'YOUR_ACCESS_TOKEN',
);


eval {
    my $result = $api_instance->linked_business_accounts_get();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UserAccountApi->linked_business_accounts_get: $@\n";
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ARRAY[LinkedBusiness]**](LinkedBusiness.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **unverify_website_delete**
> UserWebsite unverify_website_delete(website => $website)

Unverify website

Unverify a website verified by the signed-in user.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UserAccountApi;
my $api_instance = WWW::OpenAPIClient::UserAccountApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $website = "website_example"; # string | Website with path or domain only

eval {
    my $result = $api_instance->unverify_website_delete(website => $website);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UserAccountApi->unverify_website_delete: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **website** | **string**| Website with path or domain only | 

### Return type

[**UserWebsite**](UserWebsite.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_account_analytics**
> HASH[string,AnalyticsMetricsResponse] user_account_analytics(start_date => $start_date, end_date => $end_date, from_claimed_content => $from_claimed_content, pin_format => $pin_format, app_types => $app_types, content_type => $content_type, source => $source, metric_types => $metric_types, split_field => $split_field, ad_account_id => $ad_account_id)

Get user account analytics

Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UserAccountApi;
my $api_instance = WWW::OpenAPIClient::UserAccountApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $start_date = DateTime->from_epoch(epoch => str2time('null')); # DATE | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
my $end_date = DateTime->from_epoch(epoch => str2time('null')); # DATE | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
my $from_claimed_content = 'BOTH'; # string | Filter on Pins that match your claimed domain.
my $pin_format = 'ALL'; # string | Pin formats to get data for, default is all.
my $app_types = 'ALL'; # string | Apps or devices to get data for, default is all.
my $content_type = 'ALL'; # string | Filter to paid or organic data. Default is all.
my $source = 'ALL'; # string | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
my $metric_types = [(new WWW::OpenAPIClient.QuerymetrictypesItems())]; # ARRAY[QuerymetrictypesItems] | Metric types to get data for, default is all.
my $split_field = 'NO_SPLIT'; # string | How to split the data into groups. Not including this param means data won't be split.
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->user_account_analytics(start_date => $start_date, end_date => $end_date, from_claimed_content => $from_claimed_content, pin_format => $pin_format, app_types => $app_types, content_type => $content_type, source => $source, metric_types => $metric_types, split_field => $split_field, ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UserAccountApi->user_account_analytics: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **DATE**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **end_date** | **DATE**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **from_claimed_content** | **string**| Filter on Pins that match your claimed domain. | [optional] [default to &#39;BOTH&#39;]
 **pin_format** | **string**| Pin formats to get data for, default is all. | [optional] [default to &#39;ALL&#39;]
 **app_types** | **string**| Apps or devices to get data for, default is all. | [optional] [default to &#39;ALL&#39;]
 **content_type** | **string**| Filter to paid or organic data. Default is all. | [optional] [default to &#39;ALL&#39;]
 **source** | **string**| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to &#39;ALL&#39;]
 **metric_types** | [**ARRAY[QuerymetrictypesItems]**](QuerymetrictypesItems.md)| Metric types to get data for, default is all. | [optional] 
 **split_field** | **string**| How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [default to &#39;NO_SPLIT&#39;]
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 

### Return type

[**HASH[string,AnalyticsMetricsResponse]**](AnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_account_analytics_top_pins**
> TopPinsAnalyticsResponse user_account_analytics_top_pins(start_date => $start_date, end_date => $end_date, sort_by => $sort_by, from_claimed_content => $from_claimed_content, pin_format => $pin_format, app_types => $app_types, content_type => $content_type, source => $source, metric_types => $metric_types, num_of_pins => $num_of_pins, created_in_last_n_days => $created_in_last_n_days, ad_account_id => $ad_account_id)

Get user account top pins analytics

Gets analytics data about a user's top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UserAccountApi;
my $api_instance = WWW::OpenAPIClient::UserAccountApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
    # Configure OAuth2 access token for authorization: client_credentials
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $start_date = DateTime->from_epoch(epoch => str2time('null')); # DATE | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
my $end_date = DateTime->from_epoch(epoch => str2time('null')); # DATE | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
my $sort_by = new WWW::OpenAPIClient.TopPinsSortBy(); # TopPinsSortBy | Specify sorting order for metrics
my $from_claimed_content = 'BOTH'; # string | Filter on Pins that match your claimed domain.
my $pin_format = 'ALL'; # string | Pin formats to get data for, default is all.
my $app_types = 'ALL'; # string | Apps or devices to get data for, default is all.
my $content_type = 'ALL'; # string | Filter to paid or organic data. Default is all.
my $source = 'ALL'; # string | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
my $metric_types = [(new WWW::OpenAPIClient.QuerymetrictypesItems())]; # ARRAY[QuerymetrictypesItems] | Metric types to get data for, default is all.
my $num_of_pins = 10; # int | Number of pins to include, default is 10. Max is 50.
my $created_in_last_n_days = 3.4; # double | Get metrics for pins created in the last \"n\" days.
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->user_account_analytics_top_pins(start_date => $start_date, end_date => $end_date, sort_by => $sort_by, from_claimed_content => $from_claimed_content, pin_format => $pin_format, app_types => $app_types, content_type => $content_type, source => $source, metric_types => $metric_types, num_of_pins => $num_of_pins, created_in_last_n_days => $created_in_last_n_days, ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UserAccountApi->user_account_analytics_top_pins: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **DATE**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **end_date** | **DATE**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **sort_by** | [**TopPinsSortBy**](.md)| Specify sorting order for metrics | 
 **from_claimed_content** | **string**| Filter on Pins that match your claimed domain. | [optional] [default to &#39;BOTH&#39;]
 **pin_format** | **string**| Pin formats to get data for, default is all. | [optional] [default to &#39;ALL&#39;]
 **app_types** | **string**| Apps or devices to get data for, default is all. | [optional] [default to &#39;ALL&#39;]
 **content_type** | **string**| Filter to paid or organic data. Default is all. | [optional] [default to &#39;ALL&#39;]
 **source** | **string**| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to &#39;ALL&#39;]
 **metric_types** | [**ARRAY[QuerymetrictypesItems]**](QuerymetrictypesItems.md)| Metric types to get data for, default is all. | [optional] 
 **num_of_pins** | **int**| Number of pins to include, default is 10. Max is 50. | [optional] [default to 10]
 **created_in_last_n_days** | **double**| Get metrics for pins created in the last \&quot;n\&quot; days. | [optional] 
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 

### Return type

[**TopPinsAnalyticsResponse**](TopPinsAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_account_analytics_top_video_pins**
> TopVideoPinsAnalyticsResponse user_account_analytics_top_video_pins(start_date => $start_date, end_date => $end_date, sort_by => $sort_by, from_claimed_content => $from_claimed_content, pin_format => $pin_format, app_types => $app_types, content_type => $content_type, source => $source, metric_types => $metric_types, num_of_pins => $num_of_pins, created_in_last_n_days => $created_in_last_n_days, ad_account_id => $ad_account_id)

Get user account top video pins analytics

Gets analytics data about a user's top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UserAccountApi;
my $api_instance = WWW::OpenAPIClient::UserAccountApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
    # Configure OAuth2 access token for authorization: client_credentials
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $start_date = DateTime->from_epoch(epoch => str2time('null')); # DATE | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
my $end_date = DateTime->from_epoch(epoch => str2time('null')); # DATE | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
my $sort_by = new WWW::OpenAPIClient.TopVideoPinsSortBy(); # TopVideoPinsSortBy | Specify sorting order for video metrics
my $from_claimed_content = 'BOTH'; # string | Filter on Pins that match your claimed domain.
my $pin_format = 'ALL'; # string | Pin formats to get data for, default is all.
my $app_types = 'ALL'; # string | Apps or devices to get data for, default is all.
my $content_type = 'ALL'; # string | Filter to paid or organic data. Default is all.
my $source = 'ALL'; # string | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
my $metric_types = [(new WWW::OpenAPIClient.QueryvideopinmetrictypesItems())]; # ARRAY[QueryvideopinmetrictypesItems] | Metric types to get video data for, default is all.
my $num_of_pins = 10; # int | Number of pins to include, default is 10. Max is 50.
my $created_in_last_n_days = 3.4; # double | Get metrics for pins created in the last \"n\" days.
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->user_account_analytics_top_video_pins(start_date => $start_date, end_date => $end_date, sort_by => $sort_by, from_claimed_content => $from_claimed_content, pin_format => $pin_format, app_types => $app_types, content_type => $content_type, source => $source, metric_types => $metric_types, num_of_pins => $num_of_pins, created_in_last_n_days => $created_in_last_n_days, ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UserAccountApi->user_account_analytics_top_video_pins: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **DATE**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **end_date** | **DATE**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **sort_by** | [**TopVideoPinsSortBy**](.md)| Specify sorting order for video metrics | 
 **from_claimed_content** | **string**| Filter on Pins that match your claimed domain. | [optional] [default to &#39;BOTH&#39;]
 **pin_format** | **string**| Pin formats to get data for, default is all. | [optional] [default to &#39;ALL&#39;]
 **app_types** | **string**| Apps or devices to get data for, default is all. | [optional] [default to &#39;ALL&#39;]
 **content_type** | **string**| Filter to paid or organic data. Default is all. | [optional] [default to &#39;ALL&#39;]
 **source** | **string**| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to &#39;ALL&#39;]
 **metric_types** | [**ARRAY[QueryvideopinmetrictypesItems]**](QueryvideopinmetrictypesItems.md)| Metric types to get video data for, default is all. | [optional] 
 **num_of_pins** | **int**| Number of pins to include, default is 10. Max is 50. | [optional] [default to 10]
 **created_in_last_n_days** | **double**| Get metrics for pins created in the last \&quot;n\&quot; days. | [optional] 
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 

### Return type

[**TopVideoPinsAnalyticsResponse**](TopVideoPinsAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_account_followed_interests**
> UserAccountFollowedInterests200Response user_account_followed_interests(username => $username, bookmark => $bookmark, page_size => $page_size)

List following interests

Get a list of a user's following interests in one place.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UserAccountApi;
my $api_instance = WWW::OpenAPIClient::UserAccountApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
    # Configure OAuth2 access token for authorization: client_credentials
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $username = "username_example"; # string | A valid username
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.

eval {
    my $result = $api_instance->user_account_followed_interests(username => $username, bookmark => $bookmark, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UserAccountApi->user_account_followed_interests: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **string**| A valid username | 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**UserAccountFollowedInterests200Response**](UserAccountFollowedInterests200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_account_get**
> Account user_account_get(ad_account_id => $ad_account_id)

Get user account

Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  [Understanding Business Access]: https://developers.pinterest.com/docs/getting-started/using-business-access/ \"Understanding Business Access\" If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See [Understanding Business Access] for more information.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UserAccountApi;
my $api_instance = WWW::OpenAPIClient::UserAccountApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
    # Configure OAuth2 access token for authorization: client_credentials
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->user_account_get(ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UserAccountApi->user_account_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 

### Return type

[**Account**](Account.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_following_get**
> FollowersList200Response user_following_get(ad_account_id => $ad_account_id, explicit_following => $explicit_following, feed_type => $feed_type, bookmark => $bookmark, page_size => $page_size)

List following

Get a list of who a certain user follows.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UserAccountApi;
my $api_instance = WWW::OpenAPIClient::UserAccountApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
    # Configure OAuth2 access token for authorization: client_credentials
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.
my $explicit_following = false; # boolean | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
my $feed_type = new WWW::OpenAPIClient.UserFollowingFeedType(); # UserFollowingFeedType | Thrift param specifying what type of followees will be kept. Default to include all followees.
my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.

eval {
    my $result = $api_instance->user_following_get(ad_account_id => $ad_account_id, explicit_following => $explicit_following, feed_type => $feed_type, bookmark => $bookmark, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UserAccountApi->user_following_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 
 **explicit_following** | **boolean**| Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [optional] [default to false]
 **feed_type** | [**UserFollowingFeedType**](.md)| Thrift param specifying what type of followees will be kept. Default to include all followees. | [optional] 
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**FollowersList200Response**](FollowersList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_websites_get**
> UserWebsitesGet200Response user_websites_get(bookmark => $bookmark, page_size => $page_size)

Get user websites

Get user websites, claimed or not

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UserAccountApi;
my $api_instance = WWW::OpenAPIClient::UserAccountApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $bookmark = "bookmark_example"; # string | Cursor used to fetch the next page of items
my $page_size = 25; # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.

eval {
    my $result = $api_instance->user_websites_get(bookmark => $bookmark, page_size => $page_size);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UserAccountApi->user_websites_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**UserWebsitesGet200Response**](UserWebsitesGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **verify_website_update**
> UserWebsite verify_website_update(user_website_create => $user_website_create, ad_account_id => $ad_account_id)

Verify website

Verify a website as a signed-in user.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UserAccountApi;
my $api_instance = WWW::OpenAPIClient::UserAccountApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $user_website_create = WWW::OpenAPIClient::Object::UserWebsiteCreate->new(); # UserWebsiteCreate | 
my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->verify_website_update(user_website_create => $user_website_create, ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UserAccountApi->verify_website_update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_website_create** | [**UserWebsiteCreate**](UserWebsiteCreate.md)|  | 
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 

### Return type

[**UserWebsite**](UserWebsite.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **website_verification_get**
> UserWebsiteVerification website_verification_get(ad_account_id => $ad_account_id)

Get user verification code for website claiming

Get verification code for user to install on the website to claim it.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::UserAccountApi;
my $api_instance = WWW::OpenAPIClient::UserAccountApi->new(

    # Configure OAuth2 access token for authorization: pinterest_oauth2
    access_token => 'YOUR_ACCESS_TOKEN',
    # Configure OAuth2 access token for authorization: client_credentials
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $ad_account_id = "ad_account_id_example"; # string | Unique identifier of an ad account.

eval {
    my $result = $api_instance->website_verification_get(ad_account_id => $ad_account_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling UserAccountApi->website_verification_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] 

### Return type

[**UserWebsiteVerification**](UserWebsiteVerification.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

