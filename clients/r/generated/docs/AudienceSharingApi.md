# AudienceSharingApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdAccountsAudiencesSharedAccountsList**](AudienceSharingApi.md#AdAccountsAudiencesSharedAccountsList) | **GET** /ad_accounts/{ad_account_id}/audiences/shared/accounts | List accounts with access to an audience owned by an ad account
[**BusinessAccountAudiencesSharedAccountsList**](AudienceSharingApi.md#BusinessAccountAudiencesSharedAccountsList) | **GET** /businesses/{business_id}/audiences/shared/accounts | List accounts with access to an audience owned by a business
[**SharedAudiencesForBusinessList**](AudienceSharingApi.md#SharedAudiencesForBusinessList) | **GET** /businesses/{business_id}/audiences | List received audiences for a business
[**UpdateAdAccountToAdAccountSharedAudience**](AudienceSharingApi.md#UpdateAdAccountToAdAccountSharedAudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/ad_accounts/shared | Update audience sharing between ad accounts
[**UpdateAdAccountToBusinessSharedAudience**](AudienceSharingApi.md#UpdateAdAccountToBusinessSharedAudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/businesses/shared | Update audience sharing from an ad account to businesses
[**UpdateBusinessToAdAccountSharedAudience**](AudienceSharingApi.md#UpdateBusinessToAdAccountSharedAudience) | **PATCH** /businesses/{business_id}/audiences/ad_accounts/shared | Update audience sharing from a business to ad accounts
[**UpdateBusinessToBusinessSharedAudience**](AudienceSharingApi.md#UpdateBusinessToBusinessSharedAudience) | **PATCH** /businesses/{business_id}/audiences/businesses/shared | Update audience sharing between businesses


# **AdAccountsAudiencesSharedAccountsList**
> AdAccountsAudiencesSharedAccountsList200Response AdAccountsAudiencesSharedAccountsList(ad_account_id, audience_id, account_type, page_size = 25, bookmark = var.bookmark)

List accounts with access to an audience owned by an ad account

List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.

### Example
```R
library(openapi)

# List accounts with access to an audience owned by an ad account
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_audience_id <- "audience_id_example" # character | Unique identifier of the audience to use to filter the results.
var_account_type <- AudienceAccountType$new() # AudienceAccountType | Filter accounts by account type.
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)

api_instance <- AudienceSharingApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AdAccountsAudiencesSharedAccountsList(var_ad_account_id, var_audience_id, var_account_type, page_size = var_page_size, bookmark = var_bookmarkdata_file = "result.txt")
result <- api_instance$AdAccountsAudiencesSharedAccountsList(var_ad_account_id, var_audience_id, var_account_type, page_size = var_page_size, bookmark = var_bookmark)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **audience_id** | **character**| Unique identifier of the audience to use to filter the results. | 
 **account_type** | [**AudienceAccountType**](.md)| Filter accounts by account type. | 
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**AdAccountsAudiencesSharedAccountsList200Response**](ad_accounts_audiences_shared_accounts_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account audiences shared accounts parameters. |  -  |
| **404** | Shared accounts not found. |  -  |
| **0** | Unexpected error. |  -  |

# **BusinessAccountAudiencesSharedAccountsList**
> AdAccountsAudiencesSharedAccountsList200Response BusinessAccountAudiencesSharedAccountsList(business_id, audience_id, account_type, page_size = 25, bookmark = var.bookmark)

List accounts with access to an audience owned by a business

List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.

### Example
```R
library(openapi)

# List accounts with access to an audience owned by a business
#
# prepare function argument(s)
var_business_id <- "729090764583391194" # character | Unique identifier of the requesting business.
var_audience_id <- "audience_id_example" # character | Unique identifier of the audience to use to filter the results.
var_account_type <- AudienceAccountType$new() # AudienceAccountType | Filter accounts by account type.
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)

api_instance <- AudienceSharingApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BusinessAccountAudiencesSharedAccountsList(var_business_id, var_audience_id, var_account_type, page_size = var_page_size, bookmark = var_bookmarkdata_file = "result.txt")
result <- api_instance$BusinessAccountAudiencesSharedAccountsList(var_business_id, var_audience_id, var_account_type, page_size = var_page_size, bookmark = var_bookmark)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Unique identifier of the requesting business. | 
 **audience_id** | **character**| Unique identifier of the audience to use to filter the results. | 
 **account_type** | [**AudienceAccountType**](.md)| Filter accounts by account type. | 
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**AdAccountsAudiencesSharedAccountsList200Response**](ad_accounts_audiences_shared_accounts_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid business audiences shared accounts parameters. |  -  |
| **404** | Shared accounts not found. |  -  |
| **0** | Unexpected error. |  -  |

# **SharedAudiencesForBusinessList**
> AudiencesList200Response SharedAudiencesForBusinessList(business_id, bookmark = var.bookmark, order = var.order, page_size = 25)

List received audiences for a business

Get a list of received audiences for the given business.

### Example
```R
library(openapi)

# List received audiences for a business
#
# prepare function argument(s)
var_business_id <- "729090764583391194" # character | Unique identifier of the requesting business.
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_order <- "ASCENDING" # character | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (Optional)

api_instance <- AudienceSharingApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$SharedAudiencesForBusinessList(var_business_id, bookmark = var_bookmark, order = var_order, page_size = var_page_sizedata_file = "result.txt")
result <- api_instance$SharedAudiencesForBusinessList(var_business_id, bookmark = var_bookmark, order = var_order, page_size = var_page_size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Unique identifier of the requesting business. | 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **order** | Enum [ASCENDING, DESCENDING] | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**AudiencesList200Response**](audiences_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid parameters. |  -  |
| **0** | Unexpected error |  -  |

# **UpdateAdAccountToAdAccountSharedAudience**
> SharedAudienceResponse UpdateAdAccountToAdAccountSharedAudience(ad_account_id, shared_audience)

Update audience sharing between ad accounts

From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same <a href='https://help.pinterest.com/en/business/article/create-and-manage-accounts'>Pinterest Business Hierarchy</a> as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.

### Example
```R
library(openapi)

# Update audience sharing between ad accounts
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_shared_audience <- SharedAudience$new("audience_id_example", OperationType$new(), c("recipient_account_ids_example")) # SharedAudience | 

api_instance <- AudienceSharingApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$UpdateAdAccountToAdAccountSharedAudience(var_ad_account_id, var_shared_audiencedata_file = "result.txt")
result <- api_instance$UpdateAdAccountToAdAccountSharedAudience(var_ad_account_id, var_shared_audience)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **shared_audience** | [**SharedAudience**](SharedAudience.md)|  | 

### Return type

[**SharedAudienceResponse**](SharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account id. |  -  |
| **0** | Unexpected error |  -  |

# **UpdateAdAccountToBusinessSharedAudience**
> BusinessSharedAudienceResponse UpdateAdAccountToBusinessSharedAudience(ad_account_id, business_shared_audience)

Update audience sharing from an ad account to businesses

From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.

### Example
```R
library(openapi)

# Update audience sharing from an ad account to businesses
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_business_shared_audience <- BusinessSharedAudience$new("audience_id_example", OperationType$new(), c("recipient_business_ids_example")) # BusinessSharedAudience | 

api_instance <- AudienceSharingApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$UpdateAdAccountToBusinessSharedAudience(var_ad_account_id, var_business_shared_audiencedata_file = "result.txt")
result <- api_instance$UpdateAdAccountToBusinessSharedAudience(var_ad_account_id, var_business_shared_audience)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **business_shared_audience** | [**BusinessSharedAudience**](BusinessSharedAudience.md)|  | 

### Return type

[**BusinessSharedAudienceResponse**](BusinessSharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account id. |  -  |
| **0** | Unexpected error |  -  |

# **UpdateBusinessToAdAccountSharedAudience**
> SharedAudienceResponse UpdateBusinessToAdAccountSharedAudience(business_id, shared_audience)

Update audience sharing from a business to ad accounts

From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. <ul> <li>If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.</li> <li>If the business is the recipient of the audience, it can share with any of its owned ad accounts.</li> </ul> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.

### Example
```R
library(openapi)

# Update audience sharing from a business to ad accounts
#
# prepare function argument(s)
var_business_id <- "729090764583391194" # character | Unique identifier of the requesting business.
var_shared_audience <- SharedAudience$new("audience_id_example", OperationType$new(), c("recipient_account_ids_example")) # SharedAudience | 

api_instance <- AudienceSharingApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$UpdateBusinessToAdAccountSharedAudience(var_business_id, var_shared_audiencedata_file = "result.txt")
result <- api_instance$UpdateBusinessToAdAccountSharedAudience(var_business_id, var_shared_audience)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Unique identifier of the requesting business. | 
 **shared_audience** | [**SharedAudience**](SharedAudience.md)|  | 

### Return type

[**SharedAudienceResponse**](SharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid parameters. |  -  |
| **0** | Unexpected error |  -  |

# **UpdateBusinessToBusinessSharedAudience**
> BusinessSharedAudienceResponse UpdateBusinessToBusinessSharedAudience(business_id, business_shared_audience)

Update audience sharing between businesses

From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.

### Example
```R
library(openapi)

# Update audience sharing between businesses
#
# prepare function argument(s)
var_business_id <- "729090764583391194" # character | Unique identifier of the requesting business.
var_business_shared_audience <- BusinessSharedAudience$new("audience_id_example", OperationType$new(), c("recipient_business_ids_example")) # BusinessSharedAudience | 

api_instance <- AudienceSharingApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$UpdateBusinessToBusinessSharedAudience(var_business_id, var_business_shared_audiencedata_file = "result.txt")
result <- api_instance$UpdateBusinessToBusinessSharedAudience(var_business_id, var_business_shared_audience)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Unique identifier of the requesting business. | 
 **business_shared_audience** | [**BusinessSharedAudience**](BusinessSharedAudience.md)|  | 

### Return type

[**BusinessSharedAudienceResponse**](BusinessSharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid parameters. |  -  |
| **0** | Unexpected error |  -  |

