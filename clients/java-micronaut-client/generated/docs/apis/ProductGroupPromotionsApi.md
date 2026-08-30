# ProductGroupPromotionsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**productGroupPromotionsCreate**](ProductGroupPromotionsApi.md#productGroupPromotionsCreate) | **POST** /ad_accounts/{ad_account_id}/product_group_promotions | Create product group promotions |
| [**productGroupPromotionsGet**](ProductGroupPromotionsApi.md#productGroupPromotionsGet) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id} | Get a product group promotion by id |
| [**productGroupPromotionsList**](ProductGroupPromotionsApi.md#productGroupPromotionsList) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions | Get product group promotions |
| [**productGroupPromotionsUpdate**](ProductGroupPromotionsApi.md#productGroupPromotionsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/product_group_promotions | Update product group promotions |
| [**productGroupsAnalytics**](ProductGroupPromotionsApi.md#productGroupsAnalytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics |


## Creating ProductGroupPromotionsApi

To initiate an instance of `ProductGroupPromotionsApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.ProductGroupPromotionsApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(ProductGroupPromotionsApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    ProductGroupPromotionsApi productGroupPromotionsApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="productGroupPromotionsCreate"></a>
# **productGroupPromotionsCreate**
```java
Mono<ProductGroupPromotions> ProductGroupPromotionsApi.productGroupPromotionsCreate(adAccountIdproductGroupPromotionsCreate)
```

Create product group promotions

Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a &#39;product group promotion.&#39;)

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **productGroupPromotionsCreate** | [**ProductGroupPromotionsCreate**](ProductGroupPromotionsCreate.md)|  | |


### Return type
[**ProductGroupPromotions**](ProductGroupPromotions.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="productGroupPromotionsGet"></a>
# **productGroupPromotionsGet**
```java
Mono<ProductGroupPromotion> ProductGroupPromotionsApi.productGroupPromotionsGet(adAccountIdproductGroupPromotionId)
```

Get a product group promotion by id

Get a product group promotion by id

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **productGroupPromotionId** | `String`| Unique identifier of a product group promotion | |


### Return type
[**ProductGroupPromotion**](ProductGroupPromotion.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="productGroupPromotionsList"></a>
# **productGroupPromotionsList**
```java
Mono<ProductGroupPromotionsList200Response> ProductGroupPromotionsApi.productGroupPromotionsList(adAccountIdbookmarkpageSizeorderproductGroupPromotionIdsentityStatusesadGroupId)
```

Get product group promotions

List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  **Note:** ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter] |
| **pageSize** | `Integer`| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`] |
| **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional parameter] [enum: `ASCENDING`, `DESCENDING`] |
| **productGroupPromotionIds** | [**List&lt;@Pattern(regexp &#x3D; &quot;^\\d+$&quot;)String&gt;**](String.md)| List of Product group promotion Ids. | [optional parameter] |
| **entityStatuses** | [**List&lt;EntityStatus&gt;**](EntityStatus.md)| Entity status | [optional parameter] [default to `ACTIVE,PAUSED`] |
| **adGroupId** | `String`| Ad group Id. | [optional parameter] |


### Return type
[**ProductGroupPromotionsList200Response**](ProductGroupPromotionsList200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="productGroupPromotionsUpdate"></a>
# **productGroupPromotionsUpdate**
```java
Mono<ProductGroupPromotions> ProductGroupPromotionsApi.productGroupPromotionsUpdate(adAccountIdproductGroupPromotionsUpdateWithRequiredBody)
```

Update product group promotions

Update multiple existing Product Group Promotions (by product_group_id)

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **productGroupPromotionsUpdateWithRequiredBody** | [**ProductGroupPromotionsUpdateWithRequiredBody**](ProductGroupPromotionsUpdateWithRequiredBody.md)|  | |


### Return type
[**ProductGroupPromotions**](ProductGroupPromotions.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="productGroupsAnalytics"></a>
# **productGroupsAnalytics**
```java
Mono<List<ProductGroupAnalyticsItems>> ProductGroupPromotionsApi.productGroupsAnalytics(startDateendDateproductGroupIdscolumnsgranularityadAccountIdclickWindowDaysengagementWindowDaysviewWindowDaysconversionReportTimereportingTimezone)
```

Get product group analytics

Get analytics for the specified product groups in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startDate** | `LocalDate`| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | |
| **endDate** | `LocalDate`| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | |
| **productGroupIds** | [**List&lt;@Pattern(regexp &#x3D; &quot;^\\d+$&quot;)String&gt;**](String.md)| List of Product group Ids to use to filter the results. | |
| **columns** | [**List&lt;ReportingColumnSync&gt;**](ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | |
| **granularity** | [**Granularity**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [enum: `TOTAL`, `DAY`, `HOUR`, `WEEK`, `MONTH`] |
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **clickWindowDays** | `BigDecimal`| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional parameter] [default to `30`] [enum: `0`, `1`, `7`, `14`, `30`, `60`] |
| **engagementWindowDays** | `BigDecimal`| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional parameter] [default to `30`] [enum: `0`, `1`, `7`, `14`, `30`, `60`] |
| **viewWindowDays** | `BigDecimal`| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional parameter] [default to `1`] [enum: `0`, `1`, `7`, `14`, `30`, `60`] |
| **conversionReportTime** | `String`| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional parameter] [default to `TIME_OF_AD_ACTION`] [enum: `TIME_OF_AD_ACTION`, `TIME_OF_CONVERSION`] |
| **reportingTimezone** | [**ReportingTimeZone**](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional parameter] [enum: `PINTEREST_TIME_ZONE`, `AD_ACCOUNT_TIME_ZONE`] |


### Return type
[**List&lt;ProductGroupAnalyticsItems&gt;**](ProductGroupAnalyticsItems.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`
* **[client_credentials](auth.md#client_credentials)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

