# BillingApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdsCreditRedeem**](BillingApi.md#AdsCreditRedeem) | **POST** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits
[**AdsCreditsDiscountsGet**](BillingApi.md#AdsCreditsDiscountsGet) | **GET** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts
[**BillingProfilesGet**](BillingApi.md#BillingProfilesGet) | **GET** /ad_accounts/{ad_account_id}/billing_profiles | Get billing profiles
[**SsioAccountsGet**](BillingApi.md#SsioAccountsGet) | **GET** /ad_accounts/{ad_account_id}/ssio/accounts | Get Salesforce account details including bill-to information.
[**SsioInsertionOrderCreate**](BillingApi.md#SsioInsertionOrderCreate) | **POST** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Create insertion order through SSIO.
[**SsioInsertionOrderEdit**](BillingApi.md#SsioInsertionOrderEdit) | **PATCH** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Edit insertion order through SSIO.
[**SsioInsertionOrdersStatusGetByAdAccount**](BillingApi.md#SsioInsertionOrdersStatusGetByAdAccount) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/status | Get insertion order status by ad account id.
[**SsioInsertionOrdersStatusGetByPinOrderId**](BillingApi.md#SsioInsertionOrdersStatusGetByPinOrderId) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status | Get insertion order status by pin order id.
[**SsioOrderLinesGetByAdAccount**](BillingApi.md#SsioOrderLinesGetByAdAccount) | **GET** /ad_accounts/{ad_account_id}/ssio/order_lines | Get Salesforce order lines by ad account id.


# **AdsCreditRedeem**
> AdsCreditRedeemResponse AdsCreditRedeem(ad_account_id, ads_credit_redeem_request)

Redeem ad credits

Redeem ads credit on behalf of the ad account id and apply it towards billing.  <strong>This endpoint might not be available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Example
```R
library(openapi)

# Redeem ad credits
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_ads_credit_redeem_request <- AdsCreditRedeemRequest$new("offerCodeHash_example", "validateOnly_example") # AdsCreditRedeemRequest | Redeem ad credits request.

api_instance <- BillingApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AdsCreditRedeem(var_ad_account_id, var_ads_credit_redeem_requestdata_file = "result.txt")
result <- api_instance$AdsCreditRedeem(var_ad_account_id, var_ads_credit_redeem_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **ads_credit_redeem_request** | [**AdsCreditRedeemRequest**](AdsCreditRedeemRequest.md)| Redeem ad credits request. | 

### Return type

[**AdsCreditRedeemResponse**](AdsCreditRedeemResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully redeemed ad credits. |  -  |
| **400** | Error thrown when unable to redeem offer code. |  -  |
| **0** | Unexpected error |  -  |

# **AdsCreditsDiscountsGet**
> AdsCreditsDiscountsGet200Response AdsCreditsDiscountsGet(ad_account_id, bookmark = var.bookmark, page_size = 25)

Get ads credit discounts

Returns the list of discounts applied to the account.  <strong>This endpoint might not be available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Example
```R
library(openapi)

# Get ads credit discounts
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (Optional)

api_instance <- BillingApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AdsCreditsDiscountsGet(var_ad_account_id, bookmark = var_bookmark, page_size = var_page_sizedata_file = "result.txt")
result <- api_instance$AdsCreditsDiscountsGet(var_ad_account_id, bookmark = var_bookmark, page_size = var_page_size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**AdsCreditsDiscountsGet200Response**](ads_credits_discounts_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error. |  -  |

# **BillingProfilesGet**
> BillingProfilesGet200Response BillingProfilesGet(ad_account_id, is_active, bookmark = var.bookmark, page_size = 25)

Get billing profiles

Get billing profiles in the advertiser account.  <strong>This endpoint might not be available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Example
```R
library(openapi)

# Get billing profiles
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_is_active <- "is_active_example" # character | Return active billing profiles, if false return all billing profiles.
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (Optional)

api_instance <- BillingApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BillingProfilesGet(var_ad_account_id, var_is_active, bookmark = var_bookmark, page_size = var_page_sizedata_file = "result.txt")
result <- api_instance$BillingProfilesGet(var_ad_account_id, var_is_active, bookmark = var_bookmark, page_size = var_page_size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **is_active** | **character**| Return active billing profiles, if false return all billing profiles. | 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**BillingProfilesGet200Response**](billing_profiles_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error. |  -  |

# **SsioAccountsGet**
> SSIOAccountResponse SsioAccountsGet(ad_account_id)

Get Salesforce account details including bill-to information.

Get Salesforce account details including bill-to information to be used in insertion orders process for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example
```R
library(openapi)

# Get Salesforce account details including bill-to information.
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.

api_instance <- BillingApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$SsioAccountsGet(var_ad_account_iddata_file = "result.txt")
result <- api_instance$SsioAccountsGet(var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 

### Return type

[**SSIOAccountResponse**](SSIOAccountResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid request parameter. |  -  |
| **0** | Unexpected error |  -  |

# **SsioInsertionOrderCreate**
> SSIOCreateInsertionOrderResponse SsioInsertionOrderCreate(ad_account_id, ssio_create_insertion_order_request)

Create insertion order through SSIO.

Create insertion order through SSIO for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example
```R
library(openapi)

# Create insertion order through SSIO.
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_ssio_create_insertion_order_request <- SSIOCreateInsertionOrderRequest$new("start_date_example", "po_number_example", "billing_contact_firstname_example", "billing_contact_lastname_example", "billing_contact_email_example", "media_contact_firstname_example", "media_contact_lastname_example", "media_contact_email_example", "pmp_id_example", "order_name_example", "BUDGET", "accepted_terms_id_example", "billto_company_id_example", "billto_business_address_id_example", "billto_billing_address_id_example", Currency$new(), "end_date_example", 123, "agency_link_example", "user_email_example", 123, 123) # SSIOCreateInsertionOrderRequest | Order line to create.

api_instance <- BillingApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$SsioInsertionOrderCreate(var_ad_account_id, var_ssio_create_insertion_order_requestdata_file = "result.txt")
result <- api_instance$SsioInsertionOrderCreate(var_ad_account_id, var_ssio_create_insertion_order_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **ssio_create_insertion_order_request** | [**SSIOCreateInsertionOrderRequest**](SSIOCreateInsertionOrderRequest.md)| Order line to create. | 

### Return type

[**SSIOCreateInsertionOrderResponse**](SSIOCreateInsertionOrderResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid request. |  -  |
| **0** | Unexpected error |  -  |

# **SsioInsertionOrderEdit**
> SSIOEditInsertionOrderResponse SsioInsertionOrderEdit(ad_account_id, ssio_edit_insertion_order_request)

Edit insertion order through SSIO.

Edit insertion order through SSIO for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example
```R
library(openapi)

# Edit insertion order through SSIO.
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_ssio_edit_insertion_order_request <- SSIOEditInsertionOrderRequest$new("start_date_example", "end_date_example", "po_number_example", 123, "billing_contact_firstname_example", "billing_contact_lastname_example", "billing_contact_email_example", "media_contact_firstname_example", "media_contact_lastname_example", "media_contact_email_example", "agency_link_example", "user_email_example", "oracle_line_id_example", "salesforce_order_id_example", "salesforce_order_line_id_example", "ads_manager_order_line_id_example") # SSIOEditInsertionOrderRequest | Order line to create.

api_instance <- BillingApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$SsioInsertionOrderEdit(var_ad_account_id, var_ssio_edit_insertion_order_requestdata_file = "result.txt")
result <- api_instance$SsioInsertionOrderEdit(var_ad_account_id, var_ssio_edit_insertion_order_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **ssio_edit_insertion_order_request** | [**SSIOEditInsertionOrderRequest**](SSIOEditInsertionOrderRequest.md)| Order line to create. | 

### Return type

[**SSIOEditInsertionOrderResponse**](SSIOEditInsertionOrderResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid request. |  -  |
| **0** | Unexpected error |  -  |

# **SsioInsertionOrdersStatusGetByAdAccount**
> SsioInsertionOrdersStatusGetByAdAccount200Response SsioInsertionOrdersStatusGetByAdAccount(ad_account_id, bookmark = var.bookmark, page_size = 25)

Get insertion order status by ad account id.

Get insertion order status for account id <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example
```R
library(openapi)

# Get insertion order status by ad account id.
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (Optional)

api_instance <- BillingApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$SsioInsertionOrdersStatusGetByAdAccount(var_ad_account_id, bookmark = var_bookmark, page_size = var_page_sizedata_file = "result.txt")
result <- api_instance$SsioInsertionOrdersStatusGetByAdAccount(var_ad_account_id, bookmark = var_bookmark, page_size = var_page_size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**SsioInsertionOrdersStatusGetByAdAccount200Response**](ssio_insertion_orders_status_get_by_ad_account_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid request parameter. |  -  |
| **0** | Unexpected error |  -  |

# **SsioInsertionOrdersStatusGetByPinOrderId**
> SSIOInsertionOrderStatusResponse SsioInsertionOrdersStatusGetByPinOrderId(ad_account_id, pin_order_id)

Get insertion order status by pin order id.

Get insertion order status for pin order id <code>pin_order_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example
```R
library(openapi)

# Get insertion order status by pin order id.
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_pin_order_id <- "0Q01N0000015hekSVDFDC" # character | The pin order id associated with the ssio insertion order

api_instance <- BillingApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$SsioInsertionOrdersStatusGetByPinOrderId(var_ad_account_id, var_pin_order_iddata_file = "result.txt")
result <- api_instance$SsioInsertionOrdersStatusGetByPinOrderId(var_ad_account_id, var_pin_order_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **pin_order_id** | **character**| The pin order id associated with the ssio insertion order | 

### Return type

[**SSIOInsertionOrderStatusResponse**](SSIOInsertionOrderStatusResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid request parameter. |  -  |
| **0** | Unexpected error |  -  |

# **SsioOrderLinesGetByAdAccount**
> SsioOrderLinesGetByAdAccount200Response SsioOrderLinesGetByAdAccount(ad_account_id, bookmark = var.bookmark, page_size = 25, pin_order_id = var.pin_order_id)

Get Salesforce order lines by ad account id.

Get Salesforce order lines for account id <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example
```R
library(openapi)

# Get Salesforce order lines by ad account id.
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (Optional)
var_pin_order_id <- "0Q01N0000015hekSVDFDC" # character | The pin order id associated with the ssio insertino order (Optional)

api_instance <- BillingApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$SsioOrderLinesGetByAdAccount(var_ad_account_id, bookmark = var_bookmark, page_size = var_page_size, pin_order_id = var_pin_order_iddata_file = "result.txt")
result <- api_instance$SsioOrderLinesGetByAdAccount(var_ad_account_id, bookmark = var_bookmark, page_size = var_page_size, pin_order_id = var_pin_order_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **pin_order_id** | **character**| The pin order id associated with the ssio insertino order | [optional] 

### Return type

[**SsioOrderLinesGetByAdAccount200Response**](ssio_order_lines_get_by_ad_account_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid request parameter. |  -  |
| **0** | Unexpected error |  -  |

