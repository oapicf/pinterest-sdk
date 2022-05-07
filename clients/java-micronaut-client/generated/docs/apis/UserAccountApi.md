# UserAccountApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userAccountAnalytics**](UserAccountApi.md#userAccountAnalytics) | **GET** /user_account/analytics | Get user account analytics
[**userAccountGet**](UserAccountApi.md#userAccountGet) | **GET** /user_account | Get user account


## Creating UserAccountApi

To initiate an instance of `UserAccountApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.UserAccountApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(UserAccountApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    UserAccountApi userAccountApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a name="userAccountAnalytics"></a>
# **userAccountAnalytics**
```java
Mono<Map<String, AnalyticsMetricsResponse>> UserAccountApi.userAccountAnalytics(startDateendDatefromClaimedContentpinFormatappTypesmetricTypessplitFieldadAccountId)
```

Get user account analytics

Get analytics for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | `LocalDate`| Metric report start date (UTC). Format: YYYY-MM-DD |
 **endDate** | `LocalDate`| Metric report end date (UTC). Format: YYYY-MM-DD |
 **fromClaimedContent** | `String`| Filter on Pins that match your claimed domain. | [optional parameter] [default to `BOTH`] [enum: `OTHER`, `CLAIMED`, `BOTH`]
 **pinFormat** | `String`| Pin formats to get data for, default is all. | [optional parameter] [default to `ALL`] [enum: `ALL`, `PRODUCT`, `REGULAR`, `VIDEO`]
 **appTypes** | `String`| Apps or devices to get data for, default is all. | [optional parameter] [default to `ALL`] [enum: `ALL`, `MOBILE`, `TABLET`, `WEB`]
 **metricTypes** | [**List&lt;String&gt;**](String.md)| Metric types to get data for, default is all.  | [optional parameter] [enum: `ENGAGEMENT`, `ENGAGEMENT_RATE`, `IMPRESSION`, `OUTBOUND_CLICK`, `OUTBOUND_CLICK_RATE`, `PIN_CLICK`, `PIN_CLICK_RATE`, `SAVE`, `SAVE_RATE`]
 **splitField** | `String`| How to split the data into groups. Not including this param means data won&#39;t be split. | [optional parameter] [default to `NO_SPLIT`] [enum: `NO_SPLIT`, `APP_TYPE`, `OWNED_CONTENT`, `PIN_FORMAT`]
 **adAccountId** | `String`| Unique identifier of an ad account. | [optional parameter]


### Return type
[**Map&lt;String, AnalyticsMetricsResponse&gt;**](AnalyticsMetricsResponse.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `user_accounts:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a name="userAccountGet"></a>
# **userAccountGet**
```java
Mono<Account> UserAccountApi.userAccountGet(adAccountId)
```

Get user account

Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-business-access&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | `String`| Unique identifier of an ad account. | [optional parameter]


### Return type
[**Account**](Account.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `user_accounts:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

