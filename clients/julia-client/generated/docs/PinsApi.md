# PinsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**multi_pins_analytics**](PinsApi.md#multi_pins_analytics) | **GET** /pins/analytics | Get multiple Pin analytics
[**pins_analytics**](PinsApi.md#pins_analytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics
[**pins_create**](PinsApi.md#pins_create) | **POST** /pins | Create Pin
[**pins_delete**](PinsApi.md#pins_delete) | **DELETE** /pins/{pin_id} | Delete Pin
[**pins_get**](PinsApi.md#pins_get) | **GET** /pins/{pin_id} | Get Pin
[**pins_list**](PinsApi.md#pins_list) | **GET** /pins | List Pins
[**pins_save**](PinsApi.md#pins_save) | **POST** /pins/{pin_id}/save | Save Pin
[**pins_update**](PinsApi.md#pins_update) | **PATCH** /pins/{pin_id} | Update Pin


# **multi_pins_analytics**
> `multi_pins_analytics`(_api::`PinsApi`, `pin_ids`::`Vector{String}`, `start_date`::`Date`, `end_date`::`Date`, `metric_types`::`Vector{MultiPinsAnalyticsMetricTypesItem}`; `app_types`=nothing, `ad_account_id`=nothing, _mediaType=nothing) -> `Dict{String, Dict}`, `OpenAPI.Clients.ApiResponse` <br/>
> `multi_pins_analytics`(_api::`PinsApi`, response_stream::`Channel`, `pin_ids`::`Vector{String}`, `start_date`::`Date`, `end_date`::`Date`, `metric_types`::`Vector{MultiPinsAnalyticsMetricTypesItem}`; `app_types`=nothing, `ad_account_id`=nothing, _mediaType=nothing) -> `Channel`{ `Dict{String, Dict}` }, `OpenAPI.Clients.ApiResponse`

Get multiple Pin analytics

**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Get analytics for multiple pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - The maximum number of pins supported in a single request is 100. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PinsApi`** | API context | 
**`pin_ids`** | [**`Vector{String}`**](String.md) | List of Pin IDs. |
**`start_date`** | **`Date`** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |
**`end_date`** | **`Date`** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |
**`metric_types`** | [**`Vector{MultiPinsAnalyticsMetricTypesItem}`**](MultiPinsAnalyticsMetricTypesItem.md) | Pin metric types to get data for. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`app_types`** | **`String`** | Apps or devices to get data for, default is all. | [default to &quot;ALL&quot;]
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]

### Return type

**`Dict{String, Dict}`**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **pins_analytics**
> `pins_analytics`(_api::`PinsApi`, `pin_id`::`String`, `start_date`::`Date`, `end_date`::`Date`, `metric_types`::`Vector{QuerypinanalyticsmetrictypesItems}`; `app_types`=nothing, `split_field`=nothing, `ad_account_id`=nothing, _mediaType=nothing) -> `Dict{String, PinAnalyticsMetricsResponse}`, `OpenAPI.Clients.ApiResponse` <br/>
> `pins_analytics`(_api::`PinsApi`, response_stream::`Channel`, `pin_id`::`String`, `start_date`::`Date`, `end_date`::`Date`, `metric_types`::`Vector{QuerypinanalyticsmetrictypesItems}`; `app_types`=nothing, `split_field`=nothing, `ad_account_id`=nothing, _mediaType=nothing) -> `Channel`{ `Dict{String, PinAnalyticsMetricsResponse}` }, `OpenAPI.Clients.ApiResponse`

Get Pin analytics

Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PinsApi`** | API context | 
**`pin_id`** | **`String`** | Unique identifier of a Pin. |
**`start_date`** | **`Date`** | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |
**`end_date`** | **`Date`** | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |
**`metric_types`** | [**`Vector{QuerypinanalyticsmetrictypesItems}`**](QuerypinanalyticsmetrictypesItems.md) | Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before &#x60;2023-03-20&#x60;, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than &#x60;NO_SPLIT&#x60;. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`app_types`** | **`String`** | Apps or devices to get data for, default is all. | [default to &quot;ALL&quot;]
 **`split_field`** | **`String`** | How to split the data into groups. Not including this param means data won&#39;t be split. | [default to &quot;NO_SPLIT&quot;]
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]

### Return type

[**`Dict{String, PinAnalyticsMetricsResponse}`**](PinAnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **pins_create**
> `pins_create`(_api::`PinsApi`, `pin_create`::`PinCreate`; `ad_account_id`=nothing, _mediaType=nothing) -> `Pin`, `OpenAPI.Clients.ApiResponse` <br/>
> `pins_create`(_api::`PinsApi`, response_stream::`Channel`, `pin_create`::`PinCreate`; `ad_account_id`=nothing, _mediaType=nothing) -> `Channel`{ `Pin` }, `OpenAPI.Clients.ApiResponse`

Create Pin

 Create a Pin on a board or board section owned by the \"operation user_account\".   Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our [Save button](/docs/web-features/add-ons-overview/) instead. For more tips on creating fresh content for Pinterest, review our [Content App Solutions Guide](/docs/api-features/content-overview/).  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-image-pins)** about image Pin creation.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PinsApi`** | API context | 
**`pin_create`** | [**`PinCreate`**](PinCreate.md) |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]

### Return type

[**`Pin`**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **pins_delete**
> `pins_delete`(_api::`PinsApi`, `pin_id`::`String`; `ad_account_id`=nothing, _mediaType=nothing) -> `Pin`, `OpenAPI.Clients.ApiResponse` <br/>
> `pins_delete`(_api::`PinsApi`, response_stream::`Channel`, `pin_id`::`String`; `ad_account_id`=nothing, _mediaType=nothing) -> `Channel`{ `Pin` }, `OpenAPI.Clients.ApiResponse`

Delete Pin

  Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account.   - By default, the \"operation user_account\" is the token user_account.    Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PinsApi`** | API context | 
**`pin_id`** | **`String`** |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]

### Return type

[**`Pin`**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **pins_get**
> `pins_get`(_api::`PinsApi`, `pin_id`::`String`; `ad_account_id`=nothing, `pin_metrics`=nothing, _mediaType=nothing) -> `Pin`, `OpenAPI.Clients.ApiResponse` <br/>
> `pins_get`(_api::`PinsApi`, response_stream::`Channel`, `pin_id`::`String`; `ad_account_id`=nothing, `pin_metrics`=nothing, _mediaType=nothing) -> `Channel`{ `Pin` }, `OpenAPI.Clients.ApiResponse`

Get Pin

  Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account.   - By default, the \"operation user_account\" is the token user_account.    Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PinsApi`** | API context | 
**`pin_id`** | **`String`** |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]
 **`pin_metrics`** | **`Bool`** | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [default to false]

### Return type

[**`Pin`**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **pins_list**
> `pins_list`(_api::`PinsApi`; `pin_filter`=nothing, `pin_metrics`=nothing, `include_protected_pins`=nothing, `pin_type`=nothing, `creative_types`=nothing, `ad_account_id`=nothing, `domain`=nothing, `domains`=nothing, `include_product_tag_obj`=nothing, `bookmark`=nothing, `page_size`=nothing, _mediaType=nothing) -> `PinsList200Response`, `OpenAPI.Clients.ApiResponse` <br/>
> `pins_list`(_api::`PinsApi`, response_stream::`Channel`; `pin_filter`=nothing, `pin_metrics`=nothing, `include_protected_pins`=nothing, `pin_type`=nothing, `creative_types`=nothing, `ad_account_id`=nothing, `domain`=nothing, `domains`=nothing, `include_product_tag_obj`=nothing, `bookmark`=nothing, `page_size`=nothing, _mediaType=nothing) -> `Channel`{ `PinsList200Response` }, `OpenAPI.Clients.ApiResponse`

List Pins

    Get a list of the Pins owned by the \"operation user_account\".     - By default, the \"operation user_account\" is the token user_account.     - All Pins owned by the \"operation user_account\" are included, regardless of who owns the board they are on.      Optional: Business Access: Specify an `ad_account_id` to use the owner of that ad_account as the \"operation user_account\".      Disclaimer: There are known performance issues when filtering by field `creative_type` and including protected pins.     If your request is timing out in this scenario, we encourage you to use [GET List Pins on Board](/docs/api/v5/#operation/boards/list_pins).

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PinsApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`pin_filter`** | [**`PinFilter`**](.md) | The filter to apply to the pins | [default to nothing]
 **`pin_metrics`** | **`Bool`** | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [default to false]
 **`include_protected_pins`** | **`Bool`** | Whether to include protected pins in the results | [default to false]
 **`pin_type`** | [**`PinType`**](.md) | The type of pins to return, currently only enabled for private pins | [default to nothing]
 **`creative_types`** | [**`Vector{CreativeType}`**](CreativeType.md) | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [default to nothing]
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]
 **`domain`** | **`String`** | Only return pins with links that match the exact domain. Domain should not include &#39;www.&#39; prefix. For example, &#39;pinterest.com&#39; is a valid domain, but &#39;www.pinterest.com&#39; is not (will not match any pins). | [default to nothing]
 **`domains`** | [**`Vector{String}`**](String.md) | Only return pins with links whose domain matches any value in the list. Values are joined comma-separated on the wire (e.g. &#x60;?domains&#x3D;instagram.com,jcpenney.com&#x60;). | [default to nothing]
 **`include_product_tag_obj`** | **`Bool`** | Include product tag objects in the response with their associated links. | [default to nothing]
 **`bookmark`** | **`String`** | Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**`PinsList200Response`**](PinsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **pins_save**
> `pins_save`(_api::`PinsApi`, `pin_id`::`String`, `pins_save_request_create`::`PinsSaveRequestCreate`; `ad_account_id`=nothing, _mediaType=nothing) -> `Pin`, `OpenAPI.Clients.ApiResponse` <br/>
> `pins_save`(_api::`PinsApi`, response_stream::`Channel`, `pin_id`::`String`, `pins_save_request_create`::`PinsSaveRequestCreate`; `ad_account_id`=nothing, _mediaType=nothing) -> `Channel`{ `Pin` }, `OpenAPI.Clients.ApiResponse`

Save Pin

Save a Pin on a board or board section owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PinsApi`** | API context | 
**`pin_id`** | **`String`** | Unique identifier of a Pin. |
**`pins_save_request_create`** | [**`PinsSaveRequestCreate`**](PinsSaveRequestCreate.md) |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]

### Return type

[**`Pin`**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **pins_update**
> `pins_update`(_api::`PinsApi`, `pin_id`::`String`, `pin_update`::`PinUpdate`; `ad_account_id`=nothing, _mediaType=nothing) -> `Pin`, `OpenAPI.Clients.ApiResponse` <br/>
> `pins_update`(_api::`PinsApi`, response_stream::`Channel`, `pin_id`::`String`, `pin_update`::`PinUpdate`; `ad_account_id`=nothing, _mediaType=nothing) -> `Channel`{ `Pin` }, `OpenAPI.Clients.ApiResponse`

Update Pin

Update a pin owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PinsApi`** | API context | 
**`pin_id`** | **`String`** |  |
**`pin_update`** | [**`PinUpdate`**](PinUpdate.md) |  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`** | Unique identifier of an ad account. | [default to nothing]

### Return type

[**`Pin`**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

