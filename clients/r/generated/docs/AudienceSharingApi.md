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
> AdAccountsAudiencesSharedAccountsList200Response AdAccountsAudiencesSharedAccountsList(audience_id, account_type, ad_account_id, bookmark = var.bookmark, page_size = 25)

List accounts with access to an audience owned by an ad account

List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.

### Example
```R
library(openapi)

# List accounts with access to an audience owned by an ad account
#
# prepare function argument(s)
var_audience_id <- "audience_id_example" # character | Unique identifier of the audience to use to filter the results.
var_account_type <- AudienceAccountType$new() # AudienceAccountType | Filter accounts by account type.
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)

api_instance <- AudienceSharingApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AdAccountsAudiencesSharedAccountsList(var_audience_id, var_account_type, var_ad_account_id, bookmark = var_bookmark, page_size = var_page_sizedata_file = "result.txt")
result <- api_instance$AdAccountsAudiencesSharedAccountsList(var_audience_id, var_account_type, var_ad_account_id, bookmark = var_bookmark, page_size = var_page_size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audience_id** | **character**| Unique identifier of the audience to use to filter the results. | 
 **account_type** | [**AudienceAccountType**](.md)| Filter accounts by account type. | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**AdAccountsAudiencesSharedAccountsList200Response**](ad_accounts_audiences_shared_accounts_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **BusinessAccountAudiencesSharedAccountsList**
> AdAccountsAudiencesSharedAccountsList200Response BusinessAccountAudiencesSharedAccountsList(business_id, audience_id, account_type, bookmark = var.bookmark, page_size = 25)

List accounts with access to an audience owned by a business

List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.

### Example
```R
library(openapi)

# List accounts with access to an audience owned by a business
#
# prepare function argument(s)
var_business_id <- "business_id_example" # character | Unique identifier of the requesting business.
var_audience_id <- "audience_id_example" # character | Unique identifier of the audience to use to filter the results.
var_account_type <- AudienceAccountType$new() # AudienceAccountType | Filter accounts by account type.
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)

api_instance <- AudienceSharingApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BusinessAccountAudiencesSharedAccountsList(var_business_id, var_audience_id, var_account_type, bookmark = var_bookmark, page_size = var_page_sizedata_file = "result.txt")
result <- api_instance$BusinessAccountAudiencesSharedAccountsList(var_business_id, var_audience_id, var_account_type, bookmark = var_bookmark, page_size = var_page_size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Unique identifier of the requesting business. | 
 **audience_id** | **character**| Unique identifier of the audience to use to filter the results. | 
 **account_type** | [**AudienceAccountType**](.md)| Filter accounts by account type. | 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

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
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **SharedAudiencesForBusinessList**
> SharedAudiencesForBusinessList200Response SharedAudiencesForBusinessList(business_id, order = var.order, bookmark = var.bookmark, page_size = 25)

List received audiences for a business

Get a list of received audiences for the given business.

### Example
```R
library(openapi)

# List received audiences for a business
#
# prepare function argument(s)
var_business_id <- "business_id_example" # character | Unique identifier of the requesting business.
var_order <- Order$new() # Order | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)

api_instance <- AudienceSharingApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$SharedAudiencesForBusinessList(var_business_id, order = var_order, bookmark = var_bookmark, page_size = var_page_sizedata_file = "result.txt")
result <- api_instance$SharedAudiencesForBusinessList(var_business_id, order = var_order, bookmark = var_bookmark, page_size = var_page_size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Unique identifier of the requesting business. | 
 **order** | [**Order**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**SharedAudiencesForBusinessList200Response**](shared_audiences_for_business_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **UpdateAdAccountToAdAccountSharedAudience**
> AdAccountToAdAccountSharedAudience UpdateAdAccountToAdAccountSharedAudience(ad_account_id, ad_account_to_ad_account_shared_audience_update_with_required_body)

Update audience sharing between ad accounts

From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same [Pinterest Business Hierarchy](https://help.pinterest.com/en/business/article/create-and-manage-accounts) as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).

### Example
```R
library(openapi)

# Update audience sharing between ad accounts
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_ad_account_to_ad_account_shared_audience_update_with_required_body <- AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody$new("audience_id_example", OperationType$new(), c("recipient_account_ids_example")) # AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody | 

api_instance <- AudienceSharingApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$UpdateAdAccountToAdAccountSharedAudience(var_ad_account_id, var_ad_account_to_ad_account_shared_audience_update_with_required_bodydata_file = "result.txt")
result <- api_instance$UpdateAdAccountToAdAccountSharedAudience(var_ad_account_id, var_ad_account_to_ad_account_shared_audience_update_with_required_body)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **ad_account_to_ad_account_shared_audience_update_with_required_body** | [**AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody**](AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody.md)|  | 

### Return type

[**AdAccountToAdAccountSharedAudience**](AdAccountToAdAccountSharedAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **UpdateAdAccountToBusinessSharedAudience**
> AdAccountToBusinessSharedAudience UpdateAdAccountToBusinessSharedAudience(ad_account_id, ad_account_to_business_shared_audience_update_with_required_body)

Update audience sharing from an ad account to businesses

From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).

### Example
```R
library(openapi)

# Update audience sharing from an ad account to businesses
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_ad_account_to_business_shared_audience_update_with_required_body <- AdAccountToBusinessSharedAudienceUpdateWithRequiredBody$new("audience_id_example", OperationType$new(), c("recipient_business_ids_example")) # AdAccountToBusinessSharedAudienceUpdateWithRequiredBody | 

api_instance <- AudienceSharingApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$UpdateAdAccountToBusinessSharedAudience(var_ad_account_id, var_ad_account_to_business_shared_audience_update_with_required_bodydata_file = "result.txt")
result <- api_instance$UpdateAdAccountToBusinessSharedAudience(var_ad_account_id, var_ad_account_to_business_shared_audience_update_with_required_body)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **ad_account_to_business_shared_audience_update_with_required_body** | [**AdAccountToBusinessSharedAudienceUpdateWithRequiredBody**](AdAccountToBusinessSharedAudienceUpdateWithRequiredBody.md)|  | 

### Return type

[**AdAccountToBusinessSharedAudience**](AdAccountToBusinessSharedAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **UpdateBusinessToAdAccountSharedAudience**
> BusinessToAdAccountSharedAudience UpdateBusinessToAdAccountSharedAudience(business_id, business_to_ad_account_shared_audience_update_with_required_body)

Update audience sharing from a business to ad accounts

From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience.  - If the business is the owner of the audience, it can share with any ad account within the same business hierarchy. - If the business is the recipient of the audience, it can share with any of its owned ad accounts.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).

### Example
```R
library(openapi)

# Update audience sharing from a business to ad accounts
#
# prepare function argument(s)
var_business_id <- "business_id_example" # character | Unique identifier of the requesting business.
var_business_to_ad_account_shared_audience_update_with_required_body <- BusinessToAdAccountSharedAudienceUpdateWithRequiredBody$new("audience_id_example", OperationType$new(), c("recipient_account_ids_example")) # BusinessToAdAccountSharedAudienceUpdateWithRequiredBody | 

api_instance <- AudienceSharingApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$UpdateBusinessToAdAccountSharedAudience(var_business_id, var_business_to_ad_account_shared_audience_update_with_required_bodydata_file = "result.txt")
result <- api_instance$UpdateBusinessToAdAccountSharedAudience(var_business_id, var_business_to_ad_account_shared_audience_update_with_required_body)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Unique identifier of the requesting business. | 
 **business_to_ad_account_shared_audience_update_with_required_body** | [**BusinessToAdAccountSharedAudienceUpdateWithRequiredBody**](BusinessToAdAccountSharedAudienceUpdateWithRequiredBody.md)|  | 

### Return type

[**BusinessToAdAccountSharedAudience**](BusinessToAdAccountSharedAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **UpdateBusinessToBusinessSharedAudience**
> BusinessToBusinessSharedAudience UpdateBusinessToBusinessSharedAudience(business_id, business_to_business_shared_audience_update_with_required_body)

Update audience sharing between businesses

From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).

### Example
```R
library(openapi)

# Update audience sharing between businesses
#
# prepare function argument(s)
var_business_id <- "business_id_example" # character | Unique identifier of the requesting business.
var_business_to_business_shared_audience_update_with_required_body <- BusinessToBusinessSharedAudienceUpdateWithRequiredBody$new("audience_id_example", OperationType$new(), c("recipient_business_ids_example")) # BusinessToBusinessSharedAudienceUpdateWithRequiredBody | 

api_instance <- AudienceSharingApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$UpdateBusinessToBusinessSharedAudience(var_business_id, var_business_to_business_shared_audience_update_with_required_bodydata_file = "result.txt")
result <- api_instance$UpdateBusinessToBusinessSharedAudience(var_business_id, var_business_to_business_shared_audience_update_with_required_body)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Unique identifier of the requesting business. | 
 **business_to_business_shared_audience_update_with_required_body** | [**BusinessToBusinessSharedAudienceUpdateWithRequiredBody**](BusinessToBusinessSharedAudienceUpdateWithRequiredBody.md)|  | 

### Return type

[**BusinessToBusinessSharedAudience**](BusinessToBusinessSharedAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

