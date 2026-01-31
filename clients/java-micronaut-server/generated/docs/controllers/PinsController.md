# PinsController

All URIs are relative to `"/v5"`

The controller class is defined in **[PinsController.java](../../src/main/java/org/openapitools/controller/PinsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**multiPinsAnalytics**](#multiPinsAnalytics) | **GET** /pins/analytics | Get multiple Pin analytics
[**pinsAnalytics**](#pinsAnalytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics
[**pinsCreate**](#pinsCreate) | **POST** /pins | Create Pin
[**pinsDelete**](#pinsDelete) | **DELETE** /pins/{pin_id} | Delete Pin
[**pinsGet**](#pinsGet) | **GET** /pins/{pin_id} | Get Pin
[**pinsList**](#pinsList) | **GET** /pins | List Pins
[**pinsSave**](#pinsSave) | **POST** /pins/{pin_id}/save | Save Pin
[**pinsUpdate**](#pinsUpdate) | **PATCH** /pins/{pin_id} | Update Pin

<a id="multiPinsAnalytics"></a>
# **multiPinsAnalytics**
```java
Mono<Map<String, Map<String, PinAnalyticsMetricsResponse>>> PinsController.multiPinsAnalytics(pinIdsstartDateendDatemetricTypesappTypesadAccountId)
```

Get multiple Pin analytics

&lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/using-beta-and-restricted-features/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get analytics for multiple pins owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - The maximum number of pins supported in a single request is 100. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&quot;/docs/api/v5/#operation/ad_accounts/list\&quot;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**pinIds** | [**List&lt;@Pattern(regexp &#x3D; &quot;^\\d+$&quot;)String&gt;**](../../docs/models/String.md) | List of Pin IDs. |
**startDate** | `LocalDate` | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |
**endDate** | `LocalDate` | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |
**metricTypes** | [**List&lt;String&gt;**](../../docs/models/String.md) | Pin metric types to get data for. | [enum: `IMPRESSION`, `OUTBOUND_CLICK`, `PIN_CLICK`, `SAVE`, `SAVE_RATE`, `TOTAL_COMMENTS`, `TOTAL_REACTIONS`, `USER_FOLLOW`, `PROFILE_VISIT`, `VIDEO_MRC_VIEW`, `VIDEO_10S_VIEW`, `QUARTILE_95_PERCENT_VIEW`, `VIDEO_V50_WATCH_TIME`, `VIDEO_START`, `VIDEO_AVG_WATCH_TIME`]
**appTypes** | `String` | Apps or devices to get data for, default is all. | [optional parameter] [default to `ALL`] [enum: `ALL`, `MOBILE`, `TABLET`, `WEB`]
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]

### Return type
[**Map&lt;String, Map&lt;String, PinAnalyticsMetricsResponse&gt;&gt;**](../../docs/models/Map.md)

### Authorization
* **pinterest_oauth2**, scopes: `boards:read`, `pins:read`
* **client_credentials**, scopes: `boards:read`, `pins:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="pinsAnalytics"></a>
# **pinsAnalytics**
```java
Mono<Map<String, PinAnalyticsMetricsResponse>> PinsController.pinsAnalytics(pinIdstartDateendDatemetricTypesappTypessplitFieldadAccountId)
```

Get Pin analytics

Get analytics for a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&quot;/docs/api/v5/#operation/ad_accounts/list\&quot;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**pinId** | `String` | Unique identifier of a Pin. |
**startDate** | `LocalDate` | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |
**endDate** | `LocalDate` | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |
**metricTypes** | [**List&lt;String&gt;**](../../docs/models/String.md) | Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt;, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than &lt;code&gt;NO_SPLIT&lt;/code&gt;. | [enum: `IMPRESSION`, `OUTBOUND_CLICK`, `PIN_CLICK`, `SAVE`, `SAVE_RATE`, `TOTAL_COMMENTS`, `TOTAL_REACTIONS`, `USER_FOLLOW`, `PROFILE_VISIT`, `VIDEO_MRC_VIEW`, `VIDEO_10S_VIEW`, `QUARTILE_95_PERCENT_VIEW`, `VIDEO_V50_WATCH_TIME`, `VIDEO_START`, `VIDEO_AVG_WATCH_TIME`]
**appTypes** | `String` | Apps or devices to get data for, default is all. | [optional parameter] [default to `ALL`] [enum: `ALL`, `MOBILE`, `TABLET`, `WEB`]
**splitField** | `String` | How to split the data into groups. Not including this param means data won&#39;t be split. | [optional parameter] [default to `NO_SPLIT`] [enum: `NO_SPLIT`, `APP_TYPE`]
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]

### Return type
[**Map&lt;String, PinAnalyticsMetricsResponse&gt;**](../../docs/models/PinAnalyticsMetricsResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `boards:read`, `pins:read`
* **client_credentials**, scopes: `boards:read`, `pins:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="pinsCreate"></a>
# **pinsCreate**
```java
Mono<Pin> PinsController.pinsCreate(pinCreateadAccountId)
```

Create Pin

  Create a Pin on a board or board section owned by the \&quot;operation user_account\&quot;.   Note: If the current \&quot;operation user_account\&quot; (defined by the access token) has access to another user&#39;s Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account&#39;s permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id&#x3D;12345&amp;...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called &#39;curated content&#39;, please use our [Save button](/docs/web-features/add-ons-overview/) instead. For more tips on creating fresh content for Pinterest, review our [Content App Solutions Guide](/docs/api-features/content-overview/).  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-image-pins)** about image Pin creation.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**pinCreate** | [**PinCreate**](../../docs/models/PinCreate.md) |  |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]

### Return type
[**Pin**](../../docs/models/Pin.md)

### Authorization
* **pinterest_oauth2**, scopes: `boards:read`, `boards:write`, `pins:read`, `pins:write`
* **client_credentials**, scopes: `boards:read`, `boards:write`, `pins:read`, `pins:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="pinsDelete"></a>
# **pinsDelete**
```java
Mono<Object> PinsController.pinsDelete(pinIdadAccountId)
```

Delete Pin

   Delete a Pins owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account.   - By default, the \&quot;operation user_account\&quot; is the token user_account.    Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**pinId** | `String` |  |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]


### Authorization
* **pinterest_oauth2**, scopes: `boards:read`, `boards:write`, `pins:read`, `pins:write`
* **client_credentials**, scopes: `boards:read`, `boards:write`, `pins:read`, `pins:write`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="pinsGet"></a>
# **pinsGet**
```java
Mono<Pin> PinsController.pinsGet(pinIdadAccountIdpinMetrics)
```

Get Pin

   Get a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account.   - By default, the \&quot;operation user_account\&quot; is the token user_account.    Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**pinId** | `String` |  |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]
**pinMetrics** | `Boolean` | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional parameter] [default to `false`]

### Return type
[**Pin**](../../docs/models/Pin.md)

### Authorization
* **pinterest_oauth2**, scopes: `boards:read`, `pins:read`
* **client_credentials**, scopes: `boards:read`, `pins:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="pinsList"></a>
# **pinsList**
```java
Mono<PinsList200Response> PinsController.pinsList(pinFilterpinMetricsincludeProtectedPinspinTypecreativeTypesadAccountIdbookmarkpageSize)
```

List Pins

     Get a list of the Pins owned by the \&quot;operation user_account\&quot;.     - By default, the \&quot;operation user_account\&quot; is the token user_account.     - All Pins owned by the \&quot;operation user_account\&quot; are included, regardless of who owns the board they are on.      Optional: Business Access: Specify an &#x60;ad_account_id&#x60; to use the owner of that ad_account as the \&quot;operation user_account\&quot;.      Disclaimer: There are known performance issues when filtering by field &#x60;creative_type&#x60; and including protected pins.     If your request is timing out in this scenario, we encourage you to use [GET List Pins on Board](/docs/api/v5/#operation/boards/list_pins).

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**pinFilter** | `String` | The filter to apply to the pins | [optional parameter] [enum: `exclude_native`, `exclude_repins`, `has_been_promoted`]
**pinMetrics** | `Boolean` | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional parameter] [default to `false`]
**includeProtectedPins** | `Boolean` | Whether to include protected pins in the results | [optional parameter] [default to `false`]
**pinType** | `String` | The type of pins to return, currently only enabled for private pins | [optional parameter] [enum: `PRIVATE`]
**creativeTypes** | [**List&lt;CreativeType&gt;**](../../docs/models/CreativeType.md) | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional parameter]
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`]

### Return type
[**PinsList200Response**](../../docs/models/PinsList200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `boards:read`, `pins:read`
* **client_credentials**, scopes: `boards:read`, `pins:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="pinsSave"></a>
# **pinsSave**
```java
Mono<Pin> PinsController.pinsSave(pinIdpinsSaveRequestadAccountId)
```

Save Pin

Save a Pin on a board or board section owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**pinId** | `String` | Unique identifier of a Pin. |
**pinsSaveRequest** | [**PinsSaveRequest**](../../docs/models/PinsSaveRequest.md) | Request object used to save an existing pin |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]

### Return type
[**Pin**](../../docs/models/Pin.md)

### Authorization
* **pinterest_oauth2**, scopes: `boards:read`, `boards:write`, `pins:read`, `pins:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="pinsUpdate"></a>
# **pinsUpdate**
```java
Mono<Pin> PinsController.pinsUpdate(pinIdpinUpdateadAccountId)
```

Update Pin

Update a pin owned by the \&quot;operating user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**pinId** | `String` |  |
**pinUpdate** | [**PinUpdate**](../../docs/models/PinUpdate.md) |  |
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]

### Return type
[**Pin**](../../docs/models/Pin.md)

### Authorization
* **pinterest_oauth2**, scopes: `boards:read`, `boards:write`, `pins:read`, `pins:write`
* **client_credentials**, scopes: `boards:read`, `boards:write`, `pins:read`, `pins:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

