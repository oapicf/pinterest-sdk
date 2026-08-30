# ProductGroupPromotionsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**productGroupPromotionsCreate**](ProductGroupPromotionsApi.md#productGroupPromotionsCreate) | **POST** /ad_accounts/{ad_account_id}/product_group_promotions | Create product group promotions |
| [**productGroupPromotionsGet**](ProductGroupPromotionsApi.md#productGroupPromotionsGet) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id} | Get a product group promotion by id |
| [**productGroupPromotionsList**](ProductGroupPromotionsApi.md#productGroupPromotionsList) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions | Get product group promotions |
| [**productGroupPromotionsUpdate**](ProductGroupPromotionsApi.md#productGroupPromotionsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/product_group_promotions | Update product group promotions |
| [**productGroupsAnalytics**](ProductGroupPromotionsApi.md#productGroupsAnalytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics |


<a id="productGroupPromotionsCreate"></a>
# **productGroupPromotionsCreate**
> ProductGroupPromotions productGroupPromotionsCreate(adAccountId, productGroupPromotionsCreate)

Create product group promotions

Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a &#39;product group promotion.&#39;)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductGroupPromotionsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val productGroupPromotionsCreate : ProductGroupPromotionsCreate =  // ProductGroupPromotionsCreate | 
try {
    val result : ProductGroupPromotions = apiInstance.productGroupPromotionsCreate(adAccountId, productGroupPromotionsCreate)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductGroupPromotionsApi#productGroupPromotionsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductGroupPromotionsApi#productGroupPromotionsCreate")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productGroupPromotionsCreate** | [**ProductGroupPromotionsCreate**](ProductGroupPromotionsCreate.md)|  | |

### Return type

[**ProductGroupPromotions**](ProductGroupPromotions.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="productGroupPromotionsGet"></a>
# **productGroupPromotionsGet**
> ProductGroupPromotion productGroupPromotionsGet(adAccountId, productGroupPromotionId)

Get a product group promotion by id

Get a product group promotion by id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductGroupPromotionsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val productGroupPromotionId : kotlin.String = productGroupPromotionId_example // kotlin.String | Unique identifier of a product group promotion
try {
    val result : ProductGroupPromotion = apiInstance.productGroupPromotionsGet(adAccountId, productGroupPromotionId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductGroupPromotionsApi#productGroupPromotionsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductGroupPromotionsApi#productGroupPromotionsGet")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productGroupPromotionId** | **kotlin.String**| Unique identifier of a product group promotion | |

### Return type

[**ProductGroupPromotion**](ProductGroupPromotion.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="productGroupPromotionsList"></a>
# **productGroupPromotionsList**
> ProductGroupPromotionsList200Response productGroupPromotionsList(adAccountId, bookmark, pageSize, order, productGroupPromotionIds, entityStatuses, adGroupId)

Get product group promotions

List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  **Note:** ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductGroupPromotionsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val bookmark : kotlin.String = bookmark_example // kotlin.String | Cursor used to fetch the next page of items
val pageSize : kotlin.Int = 56 // kotlin.Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
val order : PinterestLibPaginationOrder =  // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
val productGroupPromotionIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of Product group promotion Ids.
val entityStatuses : kotlin.collections.List<EntityStatus> =  // kotlin.collections.List<EntityStatus> | Entity status
val adGroupId : kotlin.String = adGroupId_example // kotlin.String | Ad group Id.
try {
    val result : ProductGroupPromotionsList200Response = apiInstance.productGroupPromotionsList(adAccountId, bookmark, pageSize, order, productGroupPromotionIds, entityStatuses, adGroupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductGroupPromotionsApi#productGroupPromotionsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductGroupPromotionsApi#productGroupPromotionsList")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| **bookmark** | **kotlin.String**| Cursor used to fetch the next page of items | [optional] |
| **pageSize** | **kotlin.Int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |
| **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [enum: ASCENDING, DESCENDING] |
| **productGroupPromotionIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| List of Product group promotion Ids. | [optional] |
| **entityStatuses** | [**kotlin.collections.List&lt;EntityStatus&gt;**](EntityStatus.md)| Entity status | [optional] [default to arrayListOf(EntityStatus.ACTIVE,EntityStatus.PAUSED)] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **adGroupId** | **kotlin.String**| Ad group Id. | [optional] |

### Return type

[**ProductGroupPromotionsList200Response**](ProductGroupPromotionsList200Response.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="productGroupPromotionsUpdate"></a>
# **productGroupPromotionsUpdate**
> ProductGroupPromotions productGroupPromotionsUpdate(adAccountId, productGroupPromotionsUpdateWithRequiredBody)

Update product group promotions

Update multiple existing Product Group Promotions (by product_group_id)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductGroupPromotionsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val productGroupPromotionsUpdateWithRequiredBody : ProductGroupPromotionsUpdateWithRequiredBody =  // ProductGroupPromotionsUpdateWithRequiredBody | 
try {
    val result : ProductGroupPromotions = apiInstance.productGroupPromotionsUpdate(adAccountId, productGroupPromotionsUpdateWithRequiredBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductGroupPromotionsApi#productGroupPromotionsUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductGroupPromotionsApi#productGroupPromotionsUpdate")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productGroupPromotionsUpdateWithRequiredBody** | [**ProductGroupPromotionsUpdateWithRequiredBody**](ProductGroupPromotionsUpdateWithRequiredBody.md)|  | |

### Return type

[**ProductGroupPromotions**](ProductGroupPromotions.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="productGroupsAnalytics"></a>
# **productGroupsAnalytics**
> kotlin.collections.List&lt;ProductGroupAnalyticsItems&gt; productGroupsAnalytics(adAccountId, startDate, endDate, productGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, reportingTimezone)

Get product group analytics

Get analytics for the specified product groups in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductGroupPromotionsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val startDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
val endDate : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
val productGroupIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | List of Product group Ids to use to filter the results.
val columns : kotlin.collections.List<ReportingColumnSync> =  // kotlin.collections.List<ReportingColumnSync> | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
val granularity : Granularity =  // Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
val clickWindowDays : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
val engagementWindowDays : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
val viewWindowDays : java.math.BigDecimal = 8.14 // java.math.BigDecimal | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
val conversionReportTime : kotlin.String = conversionReportTime_example // kotlin.String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
val reportingTimezone : ReportingTimeZone =  // ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
try {
    val result : kotlin.collections.List<ProductGroupAnalyticsItems> = apiInstance.productGroupsAnalytics(adAccountId, startDate, endDate, productGroupIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, reportingTimezone)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductGroupPromotionsApi#productGroupsAnalytics")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductGroupPromotionsApi#productGroupsAnalytics")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| **startDate** | **java.time.LocalDate**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | |
| **endDate** | **java.time.LocalDate**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | |
| **productGroupIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| List of Product group Ids to use to filter the results. | |
| **columns** | [**kotlin.collections.List&lt;ReportingColumnSync&gt;**](ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | |
| **granularity** | [**Granularity**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [enum: TOTAL, DAY, HOUR, WEEK, MONTH] |
| **clickWindowDays** | **java.math.BigDecimal**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to ClickWindowDays._30] [enum: 0, 1, 7, 14, 30, 60] |
| **engagementWindowDays** | **java.math.BigDecimal**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to EngagementWindowDays._30] [enum: 0, 1, 7, 14, 30, 60] |
| **viewWindowDays** | **java.math.BigDecimal**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to ViewWindowDays._1] [enum: 0, 1, 7, 14, 30, 60] |
| **conversionReportTime** | **kotlin.String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to ConversionReportTime.TIME_OF_AD_ACTION] [enum: TIME_OF_AD_ACTION, TIME_OF_CONVERSION] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **reportingTimezone** | [**ReportingTimeZone**](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] [enum: PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE] |

### Return type

[**kotlin.collections.List&lt;ProductGroupAnalyticsItems&gt;**](ProductGroupAnalyticsItems.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```
Configure client_credentials statically:
```kotlin
ApiClient.accessToken = ""
```
Configure client_credentials dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

