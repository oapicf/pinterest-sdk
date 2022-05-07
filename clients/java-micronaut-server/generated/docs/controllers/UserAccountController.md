# UserAccountController

All URIs are relative to `"/v5"`

The controller class is defined in **[UserAccountController.java](../../src/main/java/org/openapitools/controller/UserAccountController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**userAccountAnalytics**](#userAccountAnalytics) | **GET** /user_account/analytics | Get user account analytics
[**userAccountGet**](#userAccountGet) | **GET** /user_account | Get user account

<a name="userAccountAnalytics"></a>
# **userAccountAnalytics**
```java
Mono<Map<String, AnalyticsMetricsResponse>> UserAccountController.userAccountAnalytics(startDateendDatefromClaimedContentpinFormatappTypesmetricTypessplitFieldadAccountId)
```

Get user account analytics

Get analytics for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**startDate** | `LocalDate` | Metric report start date (UTC). Format: YYYY-MM-DD |
**endDate** | `LocalDate` | Metric report end date (UTC). Format: YYYY-MM-DD |
**fromClaimedContent** | `String` | Filter on Pins that match your claimed domain. | [optional parameter] [default to `BOTH`] [enum: `OTHER`, `CLAIMED`, `BOTH`]
**pinFormat** | `String` | Pin formats to get data for, default is all. | [optional parameter] [default to `ALL`] [enum: `ALL`, `PRODUCT`, `REGULAR`, `VIDEO`]
**appTypes** | `String` | Apps or devices to get data for, default is all. | [optional parameter] [default to `ALL`] [enum: `ALL`, `MOBILE`, `TABLET`, `WEB`]
**metricTypes** | [**List&lt;String&gt;**](../../docs/models/String.md) | Metric types to get data for, default is all.  | [optional parameter] [enum: `ENGAGEMENT`, `ENGAGEMENT_RATE`, `IMPRESSION`, `OUTBOUND_CLICK`, `OUTBOUND_CLICK_RATE`, `PIN_CLICK`, `PIN_CLICK_RATE`, `SAVE`, `SAVE_RATE`]
**splitField** | `String` | How to split the data into groups. Not including this param means data won&#39;t be split. | [optional parameter] [default to `NO_SPLIT`] [enum: `NO_SPLIT`, `APP_TYPE`, `OWNED_CONTENT`, `PIN_FORMAT`]
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]

### Return type
[**Map&lt;String, AnalyticsMetricsResponse&gt;**](../../docs/models/AnalyticsMetricsResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `user_accounts:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a name="userAccountGet"></a>
# **userAccountGet**
```java
Mono<Account> UserAccountController.userAccountGet(adAccountId)
```

Get user account

Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-business-access&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. | [optional parameter]

### Return type
[**Account**](../../docs/models/Account.md)

### Authorization
* **pinterest_oauth2**, scopes: `user_accounts:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

