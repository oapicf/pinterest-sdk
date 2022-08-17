# AdGroupsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adGroups/create**](AdGroupsApi.md#adGroups/create) | **POST** /ad_accounts/{ad_account_id}/ad_groups | Create ad groups |
| [**adGroups/get**](AdGroupsApi.md#adGroups/get) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group |
| [**adGroups/list**](AdGroupsApi.md#adGroups/list) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups |
| [**adGroups/update**](AdGroupsApi.md#adGroups/update) | **PATCH** /ad_accounts/{ad_account_id}/ad_groups | Update ad groups |
| [**adGroupsBidFloor/get**](AdGroupsApi.md#adGroupsBidFloor/get) | **POST** /ad_accounts/{ad_account_id}/bid_floor | Get bid floors |


<a name="adGroups/create"></a>
# **adGroups/create**
> AdGroupArrayResponse adGroups/create(ad\_account\_id, AdGroupCreateRequest)

Create ad groups

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/features/ads-management/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt; &lt;p/&gt; Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other). For more information, &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/campaign-structure\&quot; target&#x3D;\&quot;_blank\&quot;&gt; click here&lt;/a&gt;.&lt;/p&gt; &lt;strong&gt;Note:&lt;/strong&gt; - &#39;bid_in_micro_currency&#39; and &#39;budget_in_micro_currency&#39; should be expressed in microcurrency amounts based on the currency field set in the advertiser&#39;s profile. Microcurrency is used to track very small transactions, based on the currency field set in the advertiser&#39;s profile. A microcurrency unit is one one-millionth of the standard unit of currency selected in the advertiser&#39;s profile (e.g. a microdollar is $0.000001.) - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **AdGroupCreateRequest** | [**List**](../Models/AdGroupCreateRequest.md)| List of ad groups to create, size limit [1, 30]. | |

### Return type

[**AdGroupArrayResponse**](../Models/AdGroupArrayResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="adGroups/get"></a>
# **adGroups/get**
> AdGroupResponse adGroups/get(ad\_account\_id, ad\_group\_id)

Get ad group

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/features/ads-management/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt; &lt;p/&gt; Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the &lt;a href&#x3D;\&quot;https://www.pinterest.com/_/_/policy/advertising-guidelines/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Pinterest advertising standards&lt;/a&gt;.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **ad\_group\_id** | **String**| Unique identifier of an ad group. | [default to null] |

### Return type

[**AdGroupResponse**](../Models/AdGroupResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="adGroups/list"></a>
# **adGroups/list**
> ad_groups_list_200_response adGroups/list(ad\_account\_id, campaign\_ids, ad\_group\_ids, entity\_statuses, page\_size, order, bookmark, translate\_interests\_to\_names)

List ad groups

    List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). &lt;p/&gt; &lt;strong&gt;Note:&lt;/strong&gt;&lt;p/&gt; Provide only campaign_id or ad_group_id. Do not provide both.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **campaign\_ids** | [**List**](../Models/String.md)| List of Campaign Ids to use to filter the results. | [optional] [default to null] |
| **ad\_group\_ids** | [**List**](../Models/String.md)| List of Ad group Ids to use to filter the results. | [optional] [default to null] |
| **entity\_statuses** | [**List**](../Models/String.md)| Entity status | [optional] [default to null] [enum: ACTIVE, PAUSED, ARCHIVED] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **order** | **String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null] [enum: ASCENDING, DESCENDING] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **translate\_interests\_to\_names** | **Boolean**| Return interests as text names (if value is true) rather than topic IDs. | [optional] [default to false] |

### Return type

[**ad_groups_list_200_response**](../Models/ad_groups_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="adGroups/update"></a>
# **adGroups/update**
> AdGroupArrayResponse adGroups/update(ad\_account\_id, AdGroupUpdateRequest)

Update ad groups

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/features/ads-management/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt; &lt;p/&gt; Update multiple existing ad groups.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **AdGroupUpdateRequest** | [**List**](../Models/AdGroupUpdateRequest.md)| List of ad groups to update, size limit [1, 30]. | |

### Return type

[**AdGroupArrayResponse**](../Models/AdGroupArrayResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="adGroupsBidFloor/get"></a>
# **adGroupsBidFloor/get**
> BidFloor adGroupsBidFloor/get(ad\_account\_id, BidFloorRequest)

Get bid floors

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/features/ads-management/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt; &lt;p/&gt; List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification. &lt;p/&gt; Microcurrency is used to track very small transactions, based on the currency field set in the advertiser&#39;s profile. A microcurrency unit is one one-millionth of the standard unit of currency selected in the advertiser&#39;s profile (e.g. a microdollar is $0.000001.) &lt;p/&gt; For more on bid floors see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/set-your-bid\&quot;&gt; Set your bid&lt;/a&gt;.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **BidFloorRequest** | [**BidFloorRequest**](../Models/BidFloorRequest.md)| Parameters to get bid_floor info | |

### Return type

[**BidFloor**](../Models/BidFloor.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

