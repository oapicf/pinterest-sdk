# pinterestsdk.BusinessAccessRelationshipsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**brand_accounts_create**](BusinessAccessRelationshipsApi.md#brand_accounts_create) | **POST** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts | Create a Brand Account
[**brand_accounts_update**](BusinessAccessRelationshipsApi.md#brand_accounts_update) | **PATCH** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id} | Update a Brand Account
[**delete_business_membership**](BusinessAccessRelationshipsApi.md#delete_business_membership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships
[**delete_business_partners**](BusinessAccessRelationshipsApi.md#delete_business_partners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships
[**get_business_employers**](BusinessAccessRelationshipsApi.md#get_business_employers) | **GET** /businesses/employers | List business employers for user
[**get_business_members**](BusinessAccessRelationshipsApi.md#get_business_members) | **GET** /businesses/{business_id}/members | Get business members
[**get_business_partners**](BusinessAccessRelationshipsApi.md#get_business_partners) | **GET** /businesses/{business_id}/partners | Get business partners
[**system_user_update**](BusinessAccessRelationshipsApi.md#system_user_update) | **PATCH** /businesses/{business_id}/system_users/{system_user_id} | Update a system user information.
[**update_business_memberships**](BusinessAccessRelationshipsApi.md#update_business_memberships) | **PATCH** /businesses/{business_id}/members | Update member&#39;s business role


# **brand_accounts_create**
> BrandAccountsCreate200Response brand_accounts_create(business_hierarchy_id, brand_accounts_create_request)

Create a Brand Account

Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.brand_accounts_create200_response import BrandAccountsCreate200Response
from pinterestsdk.models.brand_accounts_create_request import BrandAccountsCreateRequest
from pinterestsdk.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pinterestsdk.BusinessAccessRelationshipsApi(api_client)
    business_hierarchy_id = '7009386637860' # str | business hierarchy node id
    brand_accounts_create_request = pinterestsdk.BrandAccountsCreateRequest() # BrandAccountsCreateRequest | 

    try:
        # Create a Brand Account
        api_response = api_instance.brand_accounts_create(business_hierarchy_id, brand_accounts_create_request)
        print("The response of BusinessAccessRelationshipsApi->brand_accounts_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BusinessAccessRelationshipsApi->brand_accounts_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_hierarchy_id** | **str**| business hierarchy node id | 
 **brand_accounts_create_request** | [**BrandAccountsCreateRequest**](BrandAccountsCreateRequest.md)|  | 

### Return type

[**BrandAccountsCreate200Response**](BrandAccountsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid parameters. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **brand_accounts_update**
> BrandAccountsCreate200Response brand_accounts_update(business_hierarchy_id, brand_account_id, brand_accounts_update_request)

Update a Brand Account

Update an existing Brand Account

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.brand_accounts_create200_response import BrandAccountsCreate200Response
from pinterestsdk.models.brand_accounts_update_request import BrandAccountsUpdateRequest
from pinterestsdk.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pinterestsdk.BusinessAccessRelationshipsApi(api_client)
    business_hierarchy_id = '7009386637860' # str | business hierarchy node id
    brand_account_id = '729090764583391194' # str | Unique identifier of a brand account.
    brand_accounts_update_request = pinterestsdk.BrandAccountsUpdateRequest() # BrandAccountsUpdateRequest | 

    try:
        # Update a Brand Account
        api_response = api_instance.brand_accounts_update(business_hierarchy_id, brand_account_id, brand_accounts_update_request)
        print("The response of BusinessAccessRelationshipsApi->brand_accounts_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BusinessAccessRelationshipsApi->brand_accounts_update: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_hierarchy_id** | **str**| business hierarchy node id | 
 **brand_account_id** | **str**| Unique identifier of a brand account. | 
 **brand_accounts_update_request** | [**BrandAccountsUpdateRequest**](BrandAccountsUpdateRequest.md)|  | 

### Return type

[**BrandAccountsCreate200Response**](BrandAccountsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid parameters. |  -  |
**401** | Not authenticated to update Brand Account |  -  |
**403** | Not authorized to update Brand Account |  -  |
**404** | Brand account not found |  -  |
**409** | This account is not a brand account. |  -  |
**429** | This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits within a short time window. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_business_membership**
> DeletedMembersResponse delete_business_membership(business_id, members_to_delete_body)

Terminate business memberships

Terminate memberships between the specified members and your business.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.deleted_members_response import DeletedMembersResponse
from pinterestsdk.models.members_to_delete_body import MembersToDeleteBody
from pinterestsdk.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pinterestsdk.BusinessAccessRelationshipsApi(api_client)
    business_id = '729090764583391194' # str | Business id
    members_to_delete_body = pinterestsdk.MembersToDeleteBody() # MembersToDeleteBody | List of members with role to delete.

    try:
        # Terminate business memberships
        api_response = api_instance.delete_business_membership(business_id, members_to_delete_body)
        print("The response of BusinessAccessRelationshipsApi->delete_business_membership:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BusinessAccessRelationshipsApi->delete_business_membership: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **str**| Business id | 
 **members_to_delete_body** | [**MembersToDeleteBody**](MembersToDeleteBody.md)| List of members with role to delete. | 

### Return type

[**DeletedMembersResponse**](DeletedMembersResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_business_partners**
> DeletePartnersResponse delete_business_partners(business_id, delete_partners_request)

Terminate business partnerships

Terminate partnerships between the specified partners and your business.
Note: You may only batch terminate partners of the same partner type.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.delete_partners_request import DeletePartnersRequest
from pinterestsdk.models.delete_partners_response import DeletePartnersResponse
from pinterestsdk.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pinterestsdk.BusinessAccessRelationshipsApi(api_client)
    business_id = '729090764583391194' # str | Unique identifier of the requesting business.
    delete_partners_request = pinterestsdk.DeletePartnersRequest() # DeletePartnersRequest | An object containing a \"partner_ids\" property composed of a list of partner IDs and a \"partners_type\" property specifying the type of partners to delete. 

    try:
        # Terminate business partnerships
        api_response = api_instance.delete_business_partners(business_id, delete_partners_request)
        print("The response of BusinessAccessRelationshipsApi->delete_business_partners:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BusinessAccessRelationshipsApi->delete_business_partners: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **str**| Unique identifier of the requesting business. | 
 **delete_partners_request** | [**DeletePartnersRequest**](DeletePartnersRequest.md)| An object containing a \&quot;partner_ids\&quot; property composed of a list of partner IDs and a \&quot;partners_type\&quot; property specifying the type of partners to delete.  | 

### Return type

[**DeletePartnersResponse**](DeletePartnersResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | A supplied partner id doesn&#39;t exist |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_business_employers**
> GetBusinessEmployers200Response get_business_employers(page_size=page_size, bookmark=bookmark)

List business employers for user

Get all of the viewing user's business employers.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.get_business_employers200_response import GetBusinessEmployers200Response
from pinterestsdk.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pinterestsdk.BusinessAccessRelationshipsApi(api_client)
    page_size = 25 # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)

    try:
        # List business employers for user
        api_response = api_instance.get_business_employers(page_size=page_size, bookmark=bookmark)
        print("The response of BusinessAccessRelationshipsApi->get_business_employers:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BusinessAccessRelationshipsApi->get_business_employers: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**GetBusinessEmployers200Response**](GetBusinessEmployers200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_business_members**
> GetBusinessMembers200Response get_business_members(business_id, fetch_system_users=fetch_system_users, assets_summary=assets_summary, business_roles=business_roles, member_ids=member_ids, start_index=start_index, bookmark=bookmark, page_size=page_size)

Get business members

Get all members of the specified business.
The return response will include the member's business_role and assets they have access to if assets_summary=TRUE

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.get_business_members200_response import GetBusinessMembers200Response
from pinterestsdk.models.member_business_role import MemberBusinessRole
from pinterestsdk.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pinterestsdk.BusinessAccessRelationshipsApi(api_client)
    business_id = '729090764583391194' # str | Unique identifier of the requesting business.
    fetch_system_users = False # bool | Fetches system users if True. Fetches regular user employees if False. (optional) (default to False)
    assets_summary = False # bool | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional) (default to False)
    business_roles = [pinterestsdk.MemberBusinessRole()] # List[MemberBusinessRole] | A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. (optional)
    member_ids = '00101010101,2222220101' # str | A list of business members ids separated by comma. (optional)
    start_index = 0 # int | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)
    page_size = 25 # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)

    try:
        # Get business members
        api_response = api_instance.get_business_members(business_id, fetch_system_users=fetch_system_users, assets_summary=assets_summary, business_roles=business_roles, member_ids=member_ids, start_index=start_index, bookmark=bookmark, page_size=page_size)
        print("The response of BusinessAccessRelationshipsApi->get_business_members:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BusinessAccessRelationshipsApi->get_business_members: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **str**| Unique identifier of the requesting business. | 
 **fetch_system_users** | **bool**| Fetches system users if True. Fetches regular user employees if False. | [optional] [default to False]
 **assets_summary** | **bool**| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to False]
 **business_roles** | [**List[MemberBusinessRole]**](MemberBusinessRole.md)| A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. | [optional] 
 **member_ids** | **str**| A list of business members ids separated by comma. | [optional] 
 **start_index** | **int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**GetBusinessMembers200Response**](GetBusinessMembers200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_business_partners**
> GetBusinessPartners200Response get_business_partners(business_id, assets_summary=assets_summary, partner_type=partner_type, partner_ids=partner_ids, start_index=start_index, page_size=page_size, bookmark=bookmark)

Get business partners

Get all partners of the specified business.

If the assets_summary=TRUE and:
- partner_type=INTERNAL, the business assets returned are your business assets the partner has access to.
- partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you
  access to.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.get_business_partners200_response import GetBusinessPartners200Response
from pinterestsdk.models.partner_type import PartnerType
from pinterestsdk.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pinterestsdk.BusinessAccessRelationshipsApi(api_client)
    business_id = '729090764583391194' # str | Unique identifier of the requesting business.
    assets_summary = False # bool | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional) (default to False)
    partner_type = pinterestsdk.PartnerType() # PartnerType | Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset. (optional)
    partner_ids = '00101010101,2222220101' # str | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. (optional)
    start_index = 0 # int | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
    page_size = 25 # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)

    try:
        # Get business partners
        api_response = api_instance.get_business_partners(business_id, assets_summary=assets_summary, partner_type=partner_type, partner_ids=partner_ids, start_index=start_index, page_size=page_size, bookmark=bookmark)
        print("The response of BusinessAccessRelationshipsApi->get_business_partners:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BusinessAccessRelationshipsApi->get_business_partners: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **str**| Unique identifier of the requesting business. | 
 **assets_summary** | **bool**| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to False]
 **partner_type** | [**PartnerType**](.md)| Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] 
 **partner_ids** | **str**| A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | [optional] 
 **start_index** | **int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**GetBusinessPartners200Response**](GetBusinessPartners200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **system_user_update**
> system_user_update(business_id, system_user_id, system_user_update_request)

Update a system user information.

Update a system user information such as name.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.system_user_update_request import SystemUserUpdateRequest
from pinterestsdk.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pinterestsdk.BusinessAccessRelationshipsApi(api_client)
    business_id = '729090764583391194' # str | Unique identifier of the requesting business.
    system_user_id = '729090764583391194' # str | Unique identifier of a system user.
    system_user_update_request = pinterestsdk.SystemUserUpdateRequest() # SystemUserUpdateRequest | 

    try:
        # Update a system user information.
        api_instance.system_user_update(business_id, system_user_id, system_user_update_request)
    except Exception as e:
        print("Exception when calling BusinessAccessRelationshipsApi->system_user_update: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **str**| Unique identifier of the requesting business. | 
 **system_user_id** | **str**| Unique identifier of a system user. | 
 **system_user_update_request** | [**SystemUserUpdateRequest**](SystemUserUpdateRequest.md)|  | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | System user updated successfully. |  -  |
**400** | Invalid parameters. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_business_memberships**
> UpdateMemberResultsResponseArray update_business_memberships(business_id, update_member_business_role_body)

Update member's business role

Update a member's business role within the business.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.update_member_business_role_body import UpdateMemberBusinessRoleBody
from pinterestsdk.models.update_member_results_response_array import UpdateMemberResultsResponseArray
from pinterestsdk.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pinterestsdk.BusinessAccessRelationshipsApi(api_client)
    business_id = '729090764583391194' # str | Business id
    update_member_business_role_body = [pinterestsdk.UpdateMemberBusinessRoleBody()] # List[UpdateMemberBusinessRoleBody] | List of objects with the member id and the business_role.

    try:
        # Update member's business role
        api_response = api_instance.update_business_memberships(business_id, update_member_business_role_body)
        print("The response of BusinessAccessRelationshipsApi->update_business_memberships:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BusinessAccessRelationshipsApi->update_business_memberships: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **str**| Business id | 
 **update_member_business_role_body** | [**List[UpdateMemberBusinessRoleBody]**](UpdateMemberBusinessRoleBody.md)| List of objects with the member id and the business_role. | 

### Return type

[**UpdateMemberResultsResponseArray**](UpdateMemberResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | response |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

