# AdAccountsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountAnalytics**](AdAccountsApi.md#adAccountAnalytics) | **GET** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics
[**adAccountsList**](AdAccountsApi.md#adAccountsList) | **GET** /ad_accounts | List ad accounts
[**adGroupsAnalytics**](AdAccountsApi.md#adGroupsAnalytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
[**adGroupsList**](AdAccountsApi.md#adGroupsList) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
[**adsAnalytics**](AdAccountsApi.md#adsAnalytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
[**adsList**](AdAccountsApi.md#adsList) | **GET** /ad_accounts/{ad_account_id}/ads | List ads
[**analyticsCreateReport**](AdAccountsApi.md#analyticsCreateReport) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
[**analyticsGetReport**](AdAccountsApi.md#analyticsGetReport) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
[**campaignsAnalytics**](AdAccountsApi.md#campaignsAnalytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
[**campaignsList**](AdAccountsApi.md#campaignsList) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns
[**productGroupsAnalytics**](AdAccountsApi.md#productGroupsAnalytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics


## Creating AdAccountsApi

To initiate an instance of `AdAccountsApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.AdAccountsApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(AdAccountsApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    AdAccountsApi adAccountsApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a name="adAccountAnalytics"></a>
# **adAccountAnalytics**
```java
Mono<List<Map<String, Object>>> AdAccountsApi.adAccountAnalytics(adAccountIdstartDateendDatecolumnsgranularityclickWindowDaysengagementWindowDaysviewWindowDaysconversionReportTime)
```

Get ad account analytics

Get analytics for the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | `String`| Unique identifier of an ad account. |
 **startDate** | `LocalDate`| Metric report start date (UTC). Format: YYYY-MM-DD |
 **endDate** | `LocalDate`| Metric report end date (UTC). Format: YYYY-MM-DD |
 **columns** | [**List&lt;String&gt;**](String.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | [enum: `AD_ACCOUNT_ID`, `AD_GROUP_ENTITY_STATUS`, `AD_GROUP_ID`, `AD_ID`, `CAMPAIGN_DAILY_SPEND_CAP`, `CAMPAIGN_ENTITY_STATUS`, `CAMPAIGN_ID`, `CAMPAIGN_LIFETIME_SPEND_CAP`, `CAMPAIGN_NAME`, `CHECKOUT_ROAS`, `CLICKTHROUGH_1`, `CLICKTHROUGH_1_GROSS`, `CLICKTHROUGH_2`, `CPC_IN_MICRO_DOLLAR`, `CPM_IN_DOLLAR`, `CPM_IN_MICRO_DOLLAR`, `CTR`, `CTR_2`, `ECPCV_IN_DOLLAR`, `ECPCV_P95_IN_DOLLAR`, `ECPC_IN_DOLLAR`, `ECPC_IN_MICRO_DOLLAR`, `ECPE_IN_DOLLAR`, `ECPM_IN_MICRO_DOLLAR`, `ECPV_IN_DOLLAR`, `ECTR`, `EENGAGEMENT_RATE`, `ENGAGEMENT_1`, `ENGAGEMENT_2`, `ENGAGEMENT_RATE`, `IDEA_PIN_PRODUCT_TAG_VISIT_1`, `IDEA_PIN_PRODUCT_TAG_VISIT_2`, `IMPRESSION_1`, `IMPRESSION_1_GROSS`, `IMPRESSION_2`, `INAPP_CHECKOUT_COST_PER_ACTION`, `OUTBOUND_CLICK_1`, `OUTBOUND_CLICK_2`, `PAGE_VISIT_COST_PER_ACTION`, `PAGE_VISIT_ROAS`, `PAID_IMPRESSION`, `PIN_ID`, `REPIN_1`, `REPIN_2`, `REPIN_RATE`, `SPEND_IN_DOLLAR`, `SPEND_IN_MICRO_DOLLAR`, `TOTAL_CHECKOUT`, `TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_CLICKTHROUGH`, `TOTAL_CLICK_CHECKOUT`, `TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_CLICK_LEAD`, `TOTAL_CLICK_SIGNUP`, `TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_CONVERSIONS`, `TOTAL_CUSTOM`, `TOTAL_ENGAGEMENT`, `TOTAL_ENGAGEMENT_CHECKOUT`, `TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_ENGAGEMENT_LEAD`, `TOTAL_ENGAGEMENT_SIGNUP`, `TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT`, `TOTAL_IMPRESSION_FREQUENCY`, `TOTAL_IMPRESSION_USER`, `TOTAL_LEAD`, `TOTAL_PAGE_VISIT`, `TOTAL_REPIN_RATE`, `TOTAL_SIGNUP`, `TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_VIDEO_3SEC_VIEWS`, `TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND`, `TOTAL_VIDEO_MRC_VIEWS`, `TOTAL_VIDEO_P0_COMBINED`, `TOTAL_VIDEO_P100_COMPLETE`, `TOTAL_VIDEO_P25_COMBINED`, `TOTAL_VIDEO_P50_COMBINED`, `TOTAL_VIDEO_P75_COMBINED`, `TOTAL_VIDEO_P95_COMBINED`, `TOTAL_VIEW_CHECKOUT`, `TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_VIEW_LEAD`, `TOTAL_VIEW_SIGNUP`, `TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_CHECKOUT`, `TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_CLICK_CHECKOUT`, `TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_ENGAGEMENT_CHECKOUT`, `TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_VIEW_CHECKOUT`, `TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `VIDEO_3SEC_VIEWS_2`, `VIDEO_LENGTH`, `VIDEO_MRC_VIEWS_2`, `VIDEO_P0_COMBINED_2`, `VIDEO_P100_COMPLETE_2`, `VIDEO_P25_COMBINED_2`, `VIDEO_P50_COMBINED_2`, `VIDEO_P75_COMBINED_2`, `VIDEO_P95_COMBINED_2`, `WEB_CHECKOUT_COST_PER_ACTION`, `WEB_CHECKOUT_ROAS`]
 **granularity** | [**Granularity**](.md)| Granularity | [enum: `TOTAL`, `DAY`, `HOUR`, `WEEK`, `MONTH`]
 **clickWindowDays** | `Integer`| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional parameter] [default to `30`] [enum: `1`, `7`, `30`, `60`]
 **engagementWindowDays** | `Integer`| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional parameter] [default to `30`] [enum: `1`, `7`, `30`, `60`]
 **viewWindowDays** | `Integer`| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional parameter] [default to `1`] [enum: `1`, `7`, `30`, `60`]
 **conversionReportTime** | `String`| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional parameter] [default to `TIME_OF_AD_ACTION`] [enum: `TIME_OF_AD_ACTION`, `TIME_OF_CONVERSION`]


### Return type
[**List&lt;Map&lt;String, Object&gt;&gt;**](Map.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a name="adAccountsList"></a>
# **adAccountsList**
```java
Mono<Paginated> AdAccountsApi.adAccountsList(bookmarkpageSizeincludeSharedAccounts)
```

List ad accounts

Get a list of the ad_accounts that the \&quot;operation user_account\&quot; has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter]
 **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]
 **includeSharedAccounts** | `Boolean`| Include shared ad accounts | [optional parameter] [default to `true`]


### Return type
[**Paginated**](Paginated.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a name="adGroupsAnalytics"></a>
# **adGroupsAnalytics**
```java
Mono<List<Map<String, Object>>> AdAccountsApi.adGroupsAnalytics(adAccountIdstartDateendDateadGroupIdscolumnsgranularityclickWindowDaysengagementWindowDaysviewWindowDaysconversionReportTime)
```

Get ad group analytics

Get analytics for the specified ad groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | `String`| Unique identifier of an ad account. |
 **startDate** | `LocalDate`| Metric report start date (UTC). Format: YYYY-MM-DD |
 **endDate** | `LocalDate`| Metric report end date (UTC). Format: YYYY-MM-DD |
 **adGroupIds** | [**List&lt;String&gt;**](String.md)| List of Ad group Ids to use to filter the results. |
 **columns** | [**List&lt;String&gt;**](String.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | [enum: `AD_ACCOUNT_ID`, `AD_GROUP_ENTITY_STATUS`, `AD_GROUP_ID`, `AD_ID`, `CAMPAIGN_DAILY_SPEND_CAP`, `CAMPAIGN_ENTITY_STATUS`, `CAMPAIGN_ID`, `CAMPAIGN_LIFETIME_SPEND_CAP`, `CAMPAIGN_NAME`, `CHECKOUT_ROAS`, `CLICKTHROUGH_1`, `CLICKTHROUGH_1_GROSS`, `CLICKTHROUGH_2`, `CPC_IN_MICRO_DOLLAR`, `CPM_IN_DOLLAR`, `CPM_IN_MICRO_DOLLAR`, `CTR`, `CTR_2`, `ECPCV_IN_DOLLAR`, `ECPCV_P95_IN_DOLLAR`, `ECPC_IN_DOLLAR`, `ECPC_IN_MICRO_DOLLAR`, `ECPE_IN_DOLLAR`, `ECPM_IN_MICRO_DOLLAR`, `ECPV_IN_DOLLAR`, `ECTR`, `EENGAGEMENT_RATE`, `ENGAGEMENT_1`, `ENGAGEMENT_2`, `ENGAGEMENT_RATE`, `IDEA_PIN_PRODUCT_TAG_VISIT_1`, `IDEA_PIN_PRODUCT_TAG_VISIT_2`, `IMPRESSION_1`, `IMPRESSION_1_GROSS`, `IMPRESSION_2`, `INAPP_CHECKOUT_COST_PER_ACTION`, `OUTBOUND_CLICK_1`, `OUTBOUND_CLICK_2`, `PAGE_VISIT_COST_PER_ACTION`, `PAGE_VISIT_ROAS`, `PAID_IMPRESSION`, `PIN_ID`, `REPIN_1`, `REPIN_2`, `REPIN_RATE`, `SPEND_IN_DOLLAR`, `SPEND_IN_MICRO_DOLLAR`, `TOTAL_CHECKOUT`, `TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_CLICKTHROUGH`, `TOTAL_CLICK_CHECKOUT`, `TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_CLICK_LEAD`, `TOTAL_CLICK_SIGNUP`, `TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_CONVERSIONS`, `TOTAL_CUSTOM`, `TOTAL_ENGAGEMENT`, `TOTAL_ENGAGEMENT_CHECKOUT`, `TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_ENGAGEMENT_LEAD`, `TOTAL_ENGAGEMENT_SIGNUP`, `TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT`, `TOTAL_IMPRESSION_FREQUENCY`, `TOTAL_IMPRESSION_USER`, `TOTAL_LEAD`, `TOTAL_PAGE_VISIT`, `TOTAL_REPIN_RATE`, `TOTAL_SIGNUP`, `TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_VIDEO_3SEC_VIEWS`, `TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND`, `TOTAL_VIDEO_MRC_VIEWS`, `TOTAL_VIDEO_P0_COMBINED`, `TOTAL_VIDEO_P100_COMPLETE`, `TOTAL_VIDEO_P25_COMBINED`, `TOTAL_VIDEO_P50_COMBINED`, `TOTAL_VIDEO_P75_COMBINED`, `TOTAL_VIDEO_P95_COMBINED`, `TOTAL_VIEW_CHECKOUT`, `TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_VIEW_LEAD`, `TOTAL_VIEW_SIGNUP`, `TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_CHECKOUT`, `TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_CLICK_CHECKOUT`, `TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_ENGAGEMENT_CHECKOUT`, `TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_VIEW_CHECKOUT`, `TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `VIDEO_3SEC_VIEWS_2`, `VIDEO_LENGTH`, `VIDEO_MRC_VIEWS_2`, `VIDEO_P0_COMBINED_2`, `VIDEO_P100_COMPLETE_2`, `VIDEO_P25_COMBINED_2`, `VIDEO_P50_COMBINED_2`, `VIDEO_P75_COMBINED_2`, `VIDEO_P95_COMBINED_2`, `WEB_CHECKOUT_COST_PER_ACTION`, `WEB_CHECKOUT_ROAS`]
 **granularity** | [**Granularity**](.md)| Granularity | [enum: `TOTAL`, `DAY`, `HOUR`, `WEEK`, `MONTH`]
 **clickWindowDays** | `Integer`| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional parameter] [default to `30`] [enum: `1`, `7`, `30`, `60`]
 **engagementWindowDays** | `Integer`| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional parameter] [default to `30`] [enum: `1`, `7`, `30`, `60`]
 **viewWindowDays** | `Integer`| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional parameter] [default to `1`] [enum: `1`, `7`, `30`, `60`]
 **conversionReportTime** | `String`| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional parameter] [default to `TIME_OF_AD_ACTION`] [enum: `TIME_OF_AD_ACTION`, `TIME_OF_CONVERSION`]


### Return type
[**List&lt;Map&lt;String, Object&gt;&gt;**](Map.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a name="adGroupsList"></a>
# **adGroupsList**
```java
Mono<Paginated> AdAccountsApi.adGroupsList(adAccountIdcampaignIdsadGroupIdsentityStatusespageSizeorderbookmarktranslateInterestsToNames)
```

List ad groups

Get a list of the ad groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | `String`| Unique identifier of an ad account. |
 **campaignIds** | [**List&lt;String&gt;**](String.md)| List of Campaign Ids to use to filter the results. | [optional parameter]
 **adGroupIds** | [**List&lt;String&gt;**](String.md)| List of Ad group Ids to use to filter the results. | [optional parameter]
 **entityStatuses** | [**List&lt;String&gt;**](String.md)| Entity status | [optional parameter] [enum: `ACTIVE`, `PAUSED`, `ARCHIVED`]
 **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]
 **order** | `String`| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional parameter] [enum: `ASCENDING`, `DESCENDING`]
 **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter]
 **translateInterestsToNames** | `Boolean`| Return interests as text names (if value is true) rather than topic IDs. | [optional parameter] [default to `false`]


### Return type
[**Paginated**](Paginated.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a name="adsAnalytics"></a>
# **adsAnalytics**
```java
Mono<List<Map<String, Object>>> AdAccountsApi.adsAnalytics(adAccountIdstartDateendDateadIdscolumnsgranularityclickWindowDaysengagementWindowDaysviewWindowDaysconversionReportTime)
```

Get ad analytics

Get analytics for the specified ads in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | `String`| Unique identifier of an ad account. |
 **startDate** | `LocalDate`| Metric report start date (UTC). Format: YYYY-MM-DD |
 **endDate** | `LocalDate`| Metric report end date (UTC). Format: YYYY-MM-DD |
 **adIds** | [**List&lt;String&gt;**](String.md)| List of Ad Ids to use to filter the results. |
 **columns** | [**List&lt;String&gt;**](String.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | [enum: `AD_ACCOUNT_ID`, `AD_GROUP_ENTITY_STATUS`, `AD_GROUP_ID`, `AD_ID`, `CAMPAIGN_DAILY_SPEND_CAP`, `CAMPAIGN_ENTITY_STATUS`, `CAMPAIGN_ID`, `CAMPAIGN_LIFETIME_SPEND_CAP`, `CAMPAIGN_NAME`, `CHECKOUT_ROAS`, `CLICKTHROUGH_1`, `CLICKTHROUGH_1_GROSS`, `CLICKTHROUGH_2`, `CPC_IN_MICRO_DOLLAR`, `CPM_IN_DOLLAR`, `CPM_IN_MICRO_DOLLAR`, `CTR`, `CTR_2`, `ECPCV_IN_DOLLAR`, `ECPCV_P95_IN_DOLLAR`, `ECPC_IN_DOLLAR`, `ECPC_IN_MICRO_DOLLAR`, `ECPE_IN_DOLLAR`, `ECPM_IN_MICRO_DOLLAR`, `ECPV_IN_DOLLAR`, `ECTR`, `EENGAGEMENT_RATE`, `ENGAGEMENT_1`, `ENGAGEMENT_2`, `ENGAGEMENT_RATE`, `IDEA_PIN_PRODUCT_TAG_VISIT_1`, `IDEA_PIN_PRODUCT_TAG_VISIT_2`, `IMPRESSION_1`, `IMPRESSION_1_GROSS`, `IMPRESSION_2`, `INAPP_CHECKOUT_COST_PER_ACTION`, `OUTBOUND_CLICK_1`, `OUTBOUND_CLICK_2`, `PAGE_VISIT_COST_PER_ACTION`, `PAGE_VISIT_ROAS`, `PAID_IMPRESSION`, `PIN_ID`, `REPIN_1`, `REPIN_2`, `REPIN_RATE`, `SPEND_IN_DOLLAR`, `SPEND_IN_MICRO_DOLLAR`, `TOTAL_CHECKOUT`, `TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_CLICKTHROUGH`, `TOTAL_CLICK_CHECKOUT`, `TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_CLICK_LEAD`, `TOTAL_CLICK_SIGNUP`, `TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_CONVERSIONS`, `TOTAL_CUSTOM`, `TOTAL_ENGAGEMENT`, `TOTAL_ENGAGEMENT_CHECKOUT`, `TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_ENGAGEMENT_LEAD`, `TOTAL_ENGAGEMENT_SIGNUP`, `TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT`, `TOTAL_IMPRESSION_FREQUENCY`, `TOTAL_IMPRESSION_USER`, `TOTAL_LEAD`, `TOTAL_PAGE_VISIT`, `TOTAL_REPIN_RATE`, `TOTAL_SIGNUP`, `TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_VIDEO_3SEC_VIEWS`, `TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND`, `TOTAL_VIDEO_MRC_VIEWS`, `TOTAL_VIDEO_P0_COMBINED`, `TOTAL_VIDEO_P100_COMPLETE`, `TOTAL_VIDEO_P25_COMBINED`, `TOTAL_VIDEO_P50_COMBINED`, `TOTAL_VIDEO_P75_COMBINED`, `TOTAL_VIDEO_P95_COMBINED`, `TOTAL_VIEW_CHECKOUT`, `TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_VIEW_LEAD`, `TOTAL_VIEW_SIGNUP`, `TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_CHECKOUT`, `TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_CLICK_CHECKOUT`, `TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_ENGAGEMENT_CHECKOUT`, `TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_VIEW_CHECKOUT`, `TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `VIDEO_3SEC_VIEWS_2`, `VIDEO_LENGTH`, `VIDEO_MRC_VIEWS_2`, `VIDEO_P0_COMBINED_2`, `VIDEO_P100_COMPLETE_2`, `VIDEO_P25_COMBINED_2`, `VIDEO_P50_COMBINED_2`, `VIDEO_P75_COMBINED_2`, `VIDEO_P95_COMBINED_2`, `WEB_CHECKOUT_COST_PER_ACTION`, `WEB_CHECKOUT_ROAS`]
 **granularity** | [**Granularity**](.md)| Granularity | [enum: `TOTAL`, `DAY`, `HOUR`, `WEEK`, `MONTH`]
 **clickWindowDays** | `Integer`| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional parameter] [default to `30`] [enum: `1`, `7`, `30`, `60`]
 **engagementWindowDays** | `Integer`| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional parameter] [default to `30`] [enum: `1`, `7`, `30`, `60`]
 **viewWindowDays** | `Integer`| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional parameter] [default to `1`] [enum: `1`, `7`, `30`, `60`]
 **conversionReportTime** | `String`| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional parameter] [default to `TIME_OF_AD_ACTION`] [enum: `TIME_OF_AD_ACTION`, `TIME_OF_CONVERSION`]


### Return type
[**List&lt;Map&lt;String, Object&gt;&gt;**](Map.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a name="adsList"></a>
# **adsList**
```java
Mono<Paginated> AdAccountsApi.adsList(adAccountIdcampaignIdsadGroupIdsadIdsentityStatusespageSizeorderbookmark)
```

List ads

Get a list of the ads in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | `String`| Unique identifier of an ad account. |
 **campaignIds** | [**List&lt;String&gt;**](String.md)| List of Campaign Ids to use to filter the results. | [optional parameter]
 **adGroupIds** | [**List&lt;String&gt;**](String.md)| List of Ad group Ids to use to filter the results. | [optional parameter]
 **adIds** | [**List&lt;String&gt;**](String.md)| List of Ad Ids to use to filter the results. | [optional parameter]
 **entityStatuses** | [**List&lt;String&gt;**](String.md)| Entity status | [optional parameter] [enum: `ACTIVE`, `PAUSED`, `ARCHIVED`]
 **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]
 **order** | `String`| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional parameter] [enum: `ASCENDING`, `DESCENDING`]
 **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter]


### Return type
[**Paginated**](Paginated.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a name="analyticsCreateReport"></a>
# **analyticsCreateReport**
```java
Mono<AdsAnalyticsCreateAsyncResponse> AdAccountsApi.analyticsCreateReport(adAccountIdadsAnalyticsCreateAsyncRequest)
```

Create async request for an account analytics report

This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | `String`| Unique identifier of an ad account. |
 **adsAnalyticsCreateAsyncRequest** | [**AdsAnalyticsCreateAsyncRequest**](AdsAnalyticsCreateAsyncRequest.md)|  |


### Return type
[**AdsAnalyticsCreateAsyncResponse**](AdsAnalyticsCreateAsyncResponse.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a name="analyticsGetReport"></a>
# **analyticsGetReport**
```java
Mono<AdsAnalyticsGetAsyncResponse> AdAccountsApi.analyticsGetReport(adAccountIdtoken)
```

Get the account analytics report created by the async call

This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report and it&#39;s valid for an hour. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | `String`| Unique identifier of an ad account. |
 **token** | `String`| Token returned from the post request creation call |


### Return type
[**AdsAnalyticsGetAsyncResponse**](AdsAnalyticsGetAsyncResponse.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a name="campaignsAnalytics"></a>
# **campaignsAnalytics**
```java
Mono<List<Map<String, Object>>> AdAccountsApi.campaignsAnalytics(adAccountIdstartDateendDatecampaignIdscolumnsgranularityclickWindowDaysengagementWindowDaysviewWindowDaysconversionReportTime)
```

Get campaign analytics

Get analytics for the specified campaigns in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | `String`| Unique identifier of an ad account. |
 **startDate** | `LocalDate`| Metric report start date (UTC). Format: YYYY-MM-DD |
 **endDate** | `LocalDate`| Metric report end date (UTC). Format: YYYY-MM-DD |
 **campaignIds** | [**List&lt;String&gt;**](String.md)| List of Campaign Ids to use to filter the results. |
 **columns** | [**List&lt;String&gt;**](String.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | [enum: `AD_ACCOUNT_ID`, `AD_GROUP_ENTITY_STATUS`, `AD_GROUP_ID`, `AD_ID`, `CAMPAIGN_DAILY_SPEND_CAP`, `CAMPAIGN_ENTITY_STATUS`, `CAMPAIGN_ID`, `CAMPAIGN_LIFETIME_SPEND_CAP`, `CAMPAIGN_NAME`, `CHECKOUT_ROAS`, `CLICKTHROUGH_1`, `CLICKTHROUGH_1_GROSS`, `CLICKTHROUGH_2`, `CPC_IN_MICRO_DOLLAR`, `CPM_IN_DOLLAR`, `CPM_IN_MICRO_DOLLAR`, `CTR`, `CTR_2`, `ECPCV_IN_DOLLAR`, `ECPCV_P95_IN_DOLLAR`, `ECPC_IN_DOLLAR`, `ECPC_IN_MICRO_DOLLAR`, `ECPE_IN_DOLLAR`, `ECPM_IN_MICRO_DOLLAR`, `ECPV_IN_DOLLAR`, `ECTR`, `EENGAGEMENT_RATE`, `ENGAGEMENT_1`, `ENGAGEMENT_2`, `ENGAGEMENT_RATE`, `IDEA_PIN_PRODUCT_TAG_VISIT_1`, `IDEA_PIN_PRODUCT_TAG_VISIT_2`, `IMPRESSION_1`, `IMPRESSION_1_GROSS`, `IMPRESSION_2`, `INAPP_CHECKOUT_COST_PER_ACTION`, `OUTBOUND_CLICK_1`, `OUTBOUND_CLICK_2`, `PAGE_VISIT_COST_PER_ACTION`, `PAGE_VISIT_ROAS`, `PAID_IMPRESSION`, `PIN_ID`, `REPIN_1`, `REPIN_2`, `REPIN_RATE`, `SPEND_IN_DOLLAR`, `SPEND_IN_MICRO_DOLLAR`, `TOTAL_CHECKOUT`, `TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_CLICKTHROUGH`, `TOTAL_CLICK_CHECKOUT`, `TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_CLICK_LEAD`, `TOTAL_CLICK_SIGNUP`, `TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_CONVERSIONS`, `TOTAL_CUSTOM`, `TOTAL_ENGAGEMENT`, `TOTAL_ENGAGEMENT_CHECKOUT`, `TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_ENGAGEMENT_LEAD`, `TOTAL_ENGAGEMENT_SIGNUP`, `TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT`, `TOTAL_IMPRESSION_FREQUENCY`, `TOTAL_IMPRESSION_USER`, `TOTAL_LEAD`, `TOTAL_PAGE_VISIT`, `TOTAL_REPIN_RATE`, `TOTAL_SIGNUP`, `TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_VIDEO_3SEC_VIEWS`, `TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND`, `TOTAL_VIDEO_MRC_VIEWS`, `TOTAL_VIDEO_P0_COMBINED`, `TOTAL_VIDEO_P100_COMPLETE`, `TOTAL_VIDEO_P25_COMBINED`, `TOTAL_VIDEO_P50_COMBINED`, `TOTAL_VIDEO_P75_COMBINED`, `TOTAL_VIDEO_P95_COMBINED`, `TOTAL_VIEW_CHECKOUT`, `TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_VIEW_LEAD`, `TOTAL_VIEW_SIGNUP`, `TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_CHECKOUT`, `TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_CLICK_CHECKOUT`, `TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_ENGAGEMENT_CHECKOUT`, `TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_VIEW_CHECKOUT`, `TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `VIDEO_3SEC_VIEWS_2`, `VIDEO_LENGTH`, `VIDEO_MRC_VIEWS_2`, `VIDEO_P0_COMBINED_2`, `VIDEO_P100_COMPLETE_2`, `VIDEO_P25_COMBINED_2`, `VIDEO_P50_COMBINED_2`, `VIDEO_P75_COMBINED_2`, `VIDEO_P95_COMBINED_2`, `WEB_CHECKOUT_COST_PER_ACTION`, `WEB_CHECKOUT_ROAS`]
 **granularity** | [**Granularity**](.md)| Granularity | [enum: `TOTAL`, `DAY`, `HOUR`, `WEEK`, `MONTH`]
 **clickWindowDays** | `Integer`| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional parameter] [default to `30`] [enum: `1`, `7`, `30`, `60`]
 **engagementWindowDays** | `Integer`| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional parameter] [default to `30`] [enum: `1`, `7`, `30`, `60`]
 **viewWindowDays** | `Integer`| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional parameter] [default to `1`] [enum: `1`, `7`, `30`, `60`]
 **conversionReportTime** | `String`| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional parameter] [default to `TIME_OF_AD_ACTION`] [enum: `TIME_OF_AD_ACTION`, `TIME_OF_CONVERSION`]


### Return type
[**List&lt;Map&lt;String, Object&gt;&gt;**](Map.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a name="campaignsList"></a>
# **campaignsList**
```java
Mono<Paginated> AdAccountsApi.campaignsList(adAccountIdcampaignIdsentityStatusespageSizeorderbookmark)
```

List campaigns

Get a list of the campaigns in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | `String`| Unique identifier of an ad account. |
 **campaignIds** | [**List&lt;String&gt;**](String.md)| List of Campaign Ids to use to filter the results. | [optional parameter]
 **entityStatuses** | [**List&lt;String&gt;**](String.md)| Entity status | [optional parameter] [enum: `ACTIVE`, `PAUSED`, `ARCHIVED`]
 **pageSize** | `Integer`| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional parameter] [default to `25`]
 **order** | `String`| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional parameter] [enum: `ASCENDING`, `DESCENDING`]
 **bookmark** | `String`| Cursor used to fetch the next page of items | [optional parameter]


### Return type
[**Paginated**](Paginated.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a name="productGroupsAnalytics"></a>
# **productGroupsAnalytics**
```java
Mono<List<Map<String, Object>>> AdAccountsApi.productGroupsAnalytics(adAccountIdstartDateendDateproductGroupIdscolumnsgranularityclickWindowDaysengagementWindowDaysviewWindowDaysconversionReportTime)
```

Get product group analytics

Get analytics for the specified product groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | `String`| Unique identifier of an ad account. |
 **startDate** | `LocalDate`| Metric report start date (UTC). Format: YYYY-MM-DD |
 **endDate** | `LocalDate`| Metric report end date (UTC). Format: YYYY-MM-DD |
 **productGroupIds** | [**List&lt;String&gt;**](String.md)| List of Product group Ids to use to filter the results. |
 **columns** | [**List&lt;String&gt;**](String.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | [enum: `AD_ACCOUNT_ID`, `AD_GROUP_ENTITY_STATUS`, `AD_GROUP_ID`, `AD_ID`, `CAMPAIGN_DAILY_SPEND_CAP`, `CAMPAIGN_ENTITY_STATUS`, `CAMPAIGN_ID`, `CAMPAIGN_LIFETIME_SPEND_CAP`, `CAMPAIGN_NAME`, `CHECKOUT_ROAS`, `CLICKTHROUGH_1`, `CLICKTHROUGH_1_GROSS`, `CLICKTHROUGH_2`, `CPC_IN_MICRO_DOLLAR`, `CPM_IN_DOLLAR`, `CPM_IN_MICRO_DOLLAR`, `CTR`, `CTR_2`, `ECPCV_IN_DOLLAR`, `ECPCV_P95_IN_DOLLAR`, `ECPC_IN_DOLLAR`, `ECPC_IN_MICRO_DOLLAR`, `ECPE_IN_DOLLAR`, `ECPM_IN_MICRO_DOLLAR`, `ECPV_IN_DOLLAR`, `ECTR`, `EENGAGEMENT_RATE`, `ENGAGEMENT_1`, `ENGAGEMENT_2`, `ENGAGEMENT_RATE`, `IDEA_PIN_PRODUCT_TAG_VISIT_1`, `IDEA_PIN_PRODUCT_TAG_VISIT_2`, `IMPRESSION_1`, `IMPRESSION_1_GROSS`, `IMPRESSION_2`, `INAPP_CHECKOUT_COST_PER_ACTION`, `OUTBOUND_CLICK_1`, `OUTBOUND_CLICK_2`, `PAGE_VISIT_COST_PER_ACTION`, `PAGE_VISIT_ROAS`, `PAID_IMPRESSION`, `PIN_ID`, `REPIN_1`, `REPIN_2`, `REPIN_RATE`, `SPEND_IN_DOLLAR`, `SPEND_IN_MICRO_DOLLAR`, `TOTAL_CHECKOUT`, `TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_CLICKTHROUGH`, `TOTAL_CLICK_CHECKOUT`, `TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_CLICK_LEAD`, `TOTAL_CLICK_SIGNUP`, `TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_CONVERSIONS`, `TOTAL_CUSTOM`, `TOTAL_ENGAGEMENT`, `TOTAL_ENGAGEMENT_CHECKOUT`, `TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_ENGAGEMENT_LEAD`, `TOTAL_ENGAGEMENT_SIGNUP`, `TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT`, `TOTAL_IMPRESSION_FREQUENCY`, `TOTAL_IMPRESSION_USER`, `TOTAL_LEAD`, `TOTAL_PAGE_VISIT`, `TOTAL_REPIN_RATE`, `TOTAL_SIGNUP`, `TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_VIDEO_3SEC_VIEWS`, `TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND`, `TOTAL_VIDEO_MRC_VIEWS`, `TOTAL_VIDEO_P0_COMBINED`, `TOTAL_VIDEO_P100_COMPLETE`, `TOTAL_VIDEO_P25_COMBINED`, `TOTAL_VIDEO_P50_COMBINED`, `TOTAL_VIDEO_P75_COMBINED`, `TOTAL_VIDEO_P95_COMBINED`, `TOTAL_VIEW_CHECKOUT`, `TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_VIEW_LEAD`, `TOTAL_VIEW_SIGNUP`, `TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_CHECKOUT`, `TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_CLICK_CHECKOUT`, `TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_ENGAGEMENT_CHECKOUT`, `TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `TOTAL_WEB_VIEW_CHECKOUT`, `TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR`, `VIDEO_3SEC_VIEWS_2`, `VIDEO_LENGTH`, `VIDEO_MRC_VIEWS_2`, `VIDEO_P0_COMBINED_2`, `VIDEO_P100_COMPLETE_2`, `VIDEO_P25_COMBINED_2`, `VIDEO_P50_COMBINED_2`, `VIDEO_P75_COMBINED_2`, `VIDEO_P95_COMBINED_2`, `WEB_CHECKOUT_COST_PER_ACTION`, `WEB_CHECKOUT_ROAS`]
 **granularity** | [**Granularity**](.md)| Granularity | [enum: `TOTAL`, `DAY`, `HOUR`, `WEEK`, `MONTH`]
 **clickWindowDays** | `Integer`| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional parameter] [default to `30`] [enum: `1`, `7`, `30`, `60`]
 **engagementWindowDays** | `Integer`| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional parameter] [default to `30`] [enum: `1`, `7`, `30`, `60`]
 **viewWindowDays** | `Integer`| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional parameter] [default to `1`] [enum: `1`, `7`, `30`, `60`]
 **conversionReportTime** | `String`| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional parameter] [default to `TIME_OF_AD_ACTION`] [enum: `TIME_OF_AD_ACTION`, `TIME_OF_CONVERSION`]


### Return type
[**List&lt;Map&lt;String, Object&gt;&gt;**](Map.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

