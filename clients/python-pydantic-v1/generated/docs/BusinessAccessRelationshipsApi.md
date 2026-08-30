# openapi_client.BusinessAccessRelationshipsApi

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
> BrandAccount brand_accounts_create(business_hierarchy_id, brand_account_create)

Create a Brand Account

Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.brand_account import BrandAccount
from openapi_client.models.brand_account_create import BrandAccountCreate
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.BusinessAccessRelationshipsApi(api_client)
    business_hierarchy_id = 'business_hierarchy_id_example' # str | business hierarchy node id
    brand_account_create = openapi_client.BrandAccountCreate() # BrandAccountCreate | 

    try:
        # Create a Brand Account
        api_response = api_instance.brand_accounts_create(business_hierarchy_id, brand_account_create)
        print("The response of BusinessAccessRelationshipsApi->brand_accounts_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BusinessAccessRelationshipsApi->brand_accounts_create: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_hierarchy_id** | **str**| business hierarchy node id | 
 **brand_account_create** | [**BrandAccountCreate**](BrandAccountCreate.md)|  | 

### Return type

[**BrandAccount**](BrandAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**201** | Resource create operation completed successfully. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **brand_accounts_update**
> BrandAccount brand_accounts_update(brand_account_id, business_hierarchy_id, brand_account_update)

Update a Brand Account

Update an existing Brand Account

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.brand_account import BrandAccount
from openapi_client.models.brand_account_update import BrandAccountUpdate
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.BusinessAccessRelationshipsApi(api_client)
    brand_account_id = 'brand_account_id_example' # str | 
    business_hierarchy_id = 'business_hierarchy_id_example' # str | business hierarchy node id
    brand_account_update = openapi_client.BrandAccountUpdate() # BrandAccountUpdate | 

    try:
        # Update a Brand Account
        api_response = api_instance.brand_accounts_update(brand_account_id, business_hierarchy_id, brand_account_update)
        print("The response of BusinessAccessRelationshipsApi->brand_accounts_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BusinessAccessRelationshipsApi->brand_accounts_update: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brand_account_id** | **str**|  | 
 **business_hierarchy_id** | **str**| business hierarchy node id | 
 **brand_account_update** | [**BrandAccountUpdate**](BrandAccountUpdate.md)|  | 

### Return type

[**BrandAccount**](BrandAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**409** | The request could not be processed because of a conflict in the current state of the resource. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_business_membership**
> DeleteBusinessMembership200Response delete_business_membership(business_id, delete_business_membership_body)

Terminate business memberships

Terminate memberships between the specified members and your business.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.delete_business_membership200_response import DeleteBusinessMembership200Response
from openapi_client.models.delete_business_membership_body import DeleteBusinessMembershipBody
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.BusinessAccessRelationshipsApi(api_client)
    business_id = 'business_id_example' # str | Business id
    delete_business_membership_body = openapi_client.DeleteBusinessMembershipBody() # DeleteBusinessMembershipBody | 

    try:
        # Terminate business memberships
        api_response = api_instance.delete_business_membership(business_id, delete_business_membership_body)
        print("The response of BusinessAccessRelationshipsApi->delete_business_membership:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BusinessAccessRelationshipsApi->delete_business_membership: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **str**| Business id | 
 **delete_business_membership_body** | [**DeleteBusinessMembershipBody**](DeleteBusinessMembershipBody.md)|  | 

### Return type

[**DeleteBusinessMembership200Response**](DeleteBusinessMembership200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_business_partners**
> DeleteBusinessPartners delete_business_partners(business_id, delete_business_partners_delete)

Terminate business partnerships

Terminate partnerships between the specified partners and your business.
Note: You may only batch terminate partners of the same partner type.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.delete_business_partners import DeleteBusinessPartners
from openapi_client.models.delete_business_partners_delete import DeleteBusinessPartnersDelete
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.BusinessAccessRelationshipsApi(api_client)
    business_id = 'business_id_example' # str | Unique identifier of the requesting business.
    delete_business_partners_delete = openapi_client.DeleteBusinessPartnersDelete() # DeleteBusinessPartnersDelete | 

    try:
        # Terminate business partnerships
        api_response = api_instance.delete_business_partners(business_id, delete_business_partners_delete)
        print("The response of BusinessAccessRelationshipsApi->delete_business_partners:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BusinessAccessRelationshipsApi->delete_business_partners: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **str**| Unique identifier of the requesting business. | 
 **delete_business_partners_delete** | [**DeleteBusinessPartnersDelete**](DeleteBusinessPartnersDelete.md)|  | 

### Return type

[**DeleteBusinessPartners**](DeleteBusinessPartners.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_business_employers**
> GetBusinessEmployers200Response get_business_employers(assets_summary=assets_summary, bookmark=bookmark, page_size=page_size)

List business employers for user

Get all of the viewing user's business employers.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.get_business_employers200_response import GetBusinessEmployers200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.BusinessAccessRelationshipsApi(api_client)
    assets_summary = True # bool | Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional) (default to True)
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)
    page_size = 25 # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

    try:
        # List business employers for user
        api_response = api_instance.get_business_employers(assets_summary=assets_summary, bookmark=bookmark, page_size=page_size)
        print("The response of BusinessAccessRelationshipsApi->get_business_employers:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BusinessAccessRelationshipsApi->get_business_employers: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assets_summary** | **bool**| Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to True]
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

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
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_business_members**
> GetBusinessEmployers200Response get_business_members(business_id, fetch_system_users=fetch_system_users, assets_summary=assets_summary, business_roles=business_roles, member_ids=member_ids, start_index=start_index, bookmark=bookmark, page_size=page_size)

Get business members

Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.get_business_employers200_response import GetBusinessEmployers200Response
from openapi_client.models.member_business_role import MemberBusinessRole
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.BusinessAccessRelationshipsApi(api_client)
    business_id = 'business_id_example' # str | Unique identifier of the requesting business.
    fetch_system_users = False # bool | Fetches system users if True. Fetches regular user employees if False. (optional) (default to False)
    assets_summary = False # bool | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional) (default to False)
    business_roles = [openapi_client.MemberBusinessRole()] # List[MemberBusinessRole] | A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. (optional)
    member_ids = 'member_ids_example' # str | A list of business members ids separated by comma. (optional)
    start_index = 0 # int | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)
    page_size = 25 # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

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
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

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
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_business_partners**
> GetBusinessEmployers200Response get_business_partners(business_id, assets_summary=assets_summary, partner_type=partner_type, partner_ids=partner_ids, start_index=start_index, sort_ascending=sort_ascending, bookmark=bookmark, page_size=page_size)

Get business partners

Get all partners of the specified business.

If the assets_summary=TRUE and:
- partner_type=INTERNAL, the business assets returned are your business assets the partner has access to.
- partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you
  access to.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.get_business_employers200_response import GetBusinessEmployers200Response
from openapi_client.models.partner_type import PartnerType
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.BusinessAccessRelationshipsApi(api_client)
    business_id = 'business_id_example' # str | Unique identifier of the requesting business.
    assets_summary = False # bool | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional) (default to False)
    partner_type = openapi_client.PartnerType() # PartnerType | Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset. (optional)
    partner_ids = 'partner_ids_example' # str | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. (optional)
    start_index = 0 # int | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
    sort_ascending = True # bool | Sort ascending. (optional)
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)
    page_size = 25 # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

    try:
        # Get business partners
        api_response = api_instance.get_business_partners(business_id, assets_summary=assets_summary, partner_type=partner_type, partner_ids=partner_ids, start_index=start_index, sort_ascending=sort_ascending, bookmark=bookmark, page_size=page_size)
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
 **partner_type** | [**PartnerType**](.md)| Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] 
 **partner_ids** | **str**| A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | [optional] 
 **start_index** | **int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **sort_ascending** | **bool**| Sort ascending. | [optional] 
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

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
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **system_user_update**
> system_user_update(business_id, system_user_id, system_user_update_with_required_body)

Update a system user information.

Update a system user information such as name.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.system_user_update_with_required_body import SystemUserUpdateWithRequiredBody
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.BusinessAccessRelationshipsApi(api_client)
    business_id = 'business_id_example' # str | Unique identifier of the requesting business.
    system_user_id = 'system_user_id_example' # str | Unique identifier of a system user.
    system_user_update_with_required_body = openapi_client.SystemUserUpdateWithRequiredBody() # SystemUserUpdateWithRequiredBody | 

    try:
        # Update a system user information.
        api_instance.system_user_update(business_id, system_user_id, system_user_update_with_required_body)
    except Exception as e:
        print("Exception when calling BusinessAccessRelationshipsApi->system_user_update: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **str**| Unique identifier of the requesting business. | 
 **system_user_id** | **str**| Unique identifier of a system user. | 
 **system_user_update_with_required_body** | [**SystemUserUpdateWithRequiredBody**](SystemUserUpdateWithRequiredBody.md)|  | 

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
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_business_memberships**
> UpdateBusinessMembershipsResponse update_business_memberships(business_id, business_membership_member)

Update member's business role

Update a member's business role within the business.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.business_membership_member import BusinessMembershipMember
from openapi_client.models.update_business_memberships_response import UpdateBusinessMembershipsResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.BusinessAccessRelationshipsApi(api_client)
    business_id = 'business_id_example' # str | Business id
    business_membership_member = [openapi_client.BusinessMembershipMember()] # List[BusinessMembershipMember] | 

    try:
        # Update member's business role
        api_response = api_instance.update_business_memberships(business_id, business_membership_member)
        print("The response of BusinessAccessRelationshipsApi->update_business_memberships:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BusinessAccessRelationshipsApi->update_business_memberships: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **str**| Business id | 
 **business_membership_member** | [**List[BusinessMembershipMember]**](BusinessMembershipMember.md)|  | 

### Return type

[**UpdateBusinessMembershipsResponse**](UpdateBusinessMembershipsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

