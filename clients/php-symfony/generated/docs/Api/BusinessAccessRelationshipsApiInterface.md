# OpenAPI\Server\Api\BusinessAccessRelationshipsApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**brandAccountsCreate**](BusinessAccessRelationshipsApiInterface.md#brandAccountsCreate) | **POST** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts | Create a Brand Account
[**brandAccountsUpdate**](BusinessAccessRelationshipsApiInterface.md#brandAccountsUpdate) | **PATCH** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id} | Update a Brand Account
[**deleteBusinessMembership**](BusinessAccessRelationshipsApiInterface.md#deleteBusinessMembership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships
[**deleteBusinessPartners**](BusinessAccessRelationshipsApiInterface.md#deleteBusinessPartners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships
[**getBusinessEmployers**](BusinessAccessRelationshipsApiInterface.md#getBusinessEmployers) | **GET** /businesses/employers | List business employers for user
[**getBusinessMembers**](BusinessAccessRelationshipsApiInterface.md#getBusinessMembers) | **GET** /businesses/{business_id}/members | Get business members
[**getBusinessPartners**](BusinessAccessRelationshipsApiInterface.md#getBusinessPartners) | **GET** /businesses/{business_id}/partners | Get business partners
[**systemUserUpdate**](BusinessAccessRelationshipsApiInterface.md#systemUserUpdate) | **PATCH** /businesses/{business_id}/system_users/{system_user_id} | Update a system user information.
[**updateBusinessMemberships**](BusinessAccessRelationshipsApiInterface.md#updateBusinessMemberships) | **PATCH** /businesses/{business_id}/members | Update member&#39;s business role


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\BusinessAccessRelationshipsApi:
        tags:
            - { name: "open_api_server.api", api: "businessAccessRelationships" }
    # ...
```

## **brandAccountsCreate**
> OpenAPI\Server\Model\BrandAccount brandAccountsCreate($businessHierarchyId, $brandAccountCreate)

Create a Brand Account

Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BusinessAccessRelationshipsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BusinessAccessRelationshipsApiInterface;

class BusinessAccessRelationshipsApi implements BusinessAccessRelationshipsApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: pinterest_oauth2
     */
    public function setpinterest_oauth2($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of BusinessAccessRelationshipsApiInterface#brandAccountsCreate
     */
    public function brandAccountsCreate(string $businessHierarchyId, BrandAccountCreate $brandAccountCreate, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessHierarchyId** | **string**| business hierarchy node id |
 **brandAccountCreate** | [**OpenAPI\Server\Model\BrandAccountCreate**](../Model/BrandAccountCreate.md)|  |

### Return type

[**OpenAPI\Server\Model\BrandAccount**](../Model/BrandAccount.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **brandAccountsUpdate**
> OpenAPI\Server\Model\BrandAccount brandAccountsUpdate($brandAccountId, $businessHierarchyId, $brandAccountUpdate)

Update a Brand Account

Update an existing Brand Account

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BusinessAccessRelationshipsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BusinessAccessRelationshipsApiInterface;

class BusinessAccessRelationshipsApi implements BusinessAccessRelationshipsApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: pinterest_oauth2
     */
    public function setpinterest_oauth2($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of BusinessAccessRelationshipsApiInterface#brandAccountsUpdate
     */
    public function brandAccountsUpdate(string $brandAccountId, string $businessHierarchyId, BrandAccountUpdate $brandAccountUpdate, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **brandAccountId** | **string**|  |
 **businessHierarchyId** | **string**| business hierarchy node id |
 **brandAccountUpdate** | [**OpenAPI\Server\Model\BrandAccountUpdate**](../Model/BrandAccountUpdate.md)|  |

### Return type

[**OpenAPI\Server\Model\BrandAccount**](../Model/BrandAccount.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **deleteBusinessMembership**
> OpenAPI\Server\Model\DeleteBusinessMembership200Response deleteBusinessMembership($businessId, $deleteBusinessMembershipBody)

Terminate business memberships

Terminate memberships between the specified members and your business.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BusinessAccessRelationshipsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BusinessAccessRelationshipsApiInterface;

class BusinessAccessRelationshipsApi implements BusinessAccessRelationshipsApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: pinterest_oauth2
     */
    public function setpinterest_oauth2($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of BusinessAccessRelationshipsApiInterface#deleteBusinessMembership
     */
    public function deleteBusinessMembership(string $businessId, DeleteBusinessMembershipBody $deleteBusinessMembershipBody, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **string**| Business id |
 **deleteBusinessMembershipBody** | [**OpenAPI\Server\Model\DeleteBusinessMembershipBody**](../Model/DeleteBusinessMembershipBody.md)|  |

### Return type

[**OpenAPI\Server\Model\DeleteBusinessMembership200Response**](../Model/DeleteBusinessMembership200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **deleteBusinessPartners**
> OpenAPI\Server\Model\DeleteBusinessPartners deleteBusinessPartners($businessId, $deleteBusinessPartnersDelete)

Terminate business partnerships

Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BusinessAccessRelationshipsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BusinessAccessRelationshipsApiInterface;

class BusinessAccessRelationshipsApi implements BusinessAccessRelationshipsApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: pinterest_oauth2
     */
    public function setpinterest_oauth2($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of BusinessAccessRelationshipsApiInterface#deleteBusinessPartners
     */
    public function deleteBusinessPartners(string $businessId, DeleteBusinessPartnersDelete $deleteBusinessPartnersDelete, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **string**| Unique identifier of the requesting business. |
 **deleteBusinessPartnersDelete** | [**OpenAPI\Server\Model\DeleteBusinessPartnersDelete**](../Model/DeleteBusinessPartnersDelete.md)|  |

### Return type

[**OpenAPI\Server\Model\DeleteBusinessPartners**](../Model/DeleteBusinessPartners.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getBusinessEmployers**
> OpenAPI\Server\Model\GetBusinessEmployers200Response getBusinessEmployers($assetsSummary, $bookmark, $pageSize)

List business employers for user

Get all of the viewing user's business employers.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BusinessAccessRelationshipsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BusinessAccessRelationshipsApiInterface;

class BusinessAccessRelationshipsApi implements BusinessAccessRelationshipsApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: pinterest_oauth2
     */
    public function setpinterest_oauth2($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of BusinessAccessRelationshipsApiInterface#getBusinessEmployers
     */
    public function getBusinessEmployers(bool $assetsSummary, ?string $bookmark, int $pageSize, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsSummary** | **bool**| Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to true]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**OpenAPI\Server\Model\GetBusinessEmployers200Response**](../Model/GetBusinessEmployers200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getBusinessMembers**
> OpenAPI\Server\Model\GetBusinessEmployers200Response getBusinessMembers($businessId, $fetchSystemUsers, $assetsSummary, $businessRoles, $memberIds, $startIndex, $bookmark, $pageSize)

Get business members

Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BusinessAccessRelationshipsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BusinessAccessRelationshipsApiInterface;

class BusinessAccessRelationshipsApi implements BusinessAccessRelationshipsApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: pinterest_oauth2
     */
    public function setpinterest_oauth2($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of BusinessAccessRelationshipsApiInterface#getBusinessMembers
     */
    public function getBusinessMembers(string $businessId, bool $fetchSystemUsers, bool $assetsSummary, ?array $businessRoles, ?string $memberIds, int $startIndex, ?string $bookmark, int $pageSize, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **string**| Unique identifier of the requesting business. |
 **fetchSystemUsers** | **bool**| Fetches system users if True. Fetches regular user employees if False. | [optional] [default to false]
 **assetsSummary** | **bool**| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to false]
 **businessRoles** | [**OpenAPI\Server\Model\MemberBusinessRole**](../Model/OpenAPI\Server\Model\MemberBusinessRole.md)| A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. | [optional]
 **memberIds** | **string**| A list of business members ids separated by comma. | [optional]
 **startIndex** | **int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**OpenAPI\Server\Model\GetBusinessEmployers200Response**](../Model/GetBusinessEmployers200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getBusinessPartners**
> OpenAPI\Server\Model\GetBusinessEmployers200Response getBusinessPartners($businessId, $assetsSummary, $partnerType, $partnerIds, $startIndex, $sortAscending, $bookmark, $pageSize)

Get business partners

Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BusinessAccessRelationshipsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BusinessAccessRelationshipsApiInterface;

class BusinessAccessRelationshipsApi implements BusinessAccessRelationshipsApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: pinterest_oauth2
     */
    public function setpinterest_oauth2($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of BusinessAccessRelationshipsApiInterface#getBusinessPartners
     */
    public function getBusinessPartners(string $businessId, bool $assetsSummary, ?PartnerType $partnerType, ?string $partnerIds, int $startIndex, ?bool $sortAscending, ?string $bookmark, int $pageSize, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **string**| Unique identifier of the requesting business. |
 **assetsSummary** | **bool**| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to false]
 **partnerType** | [**PartnerType**](../Model/.md)| Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional]
 **partnerIds** | **string**| A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | [optional]
 **startIndex** | **int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **sortAscending** | **bool**| Sort ascending. | [optional]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**OpenAPI\Server\Model\GetBusinessEmployers200Response**](../Model/GetBusinessEmployers200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **systemUserUpdate**
> systemUserUpdate($businessId, $systemUserId, $systemUserUpdateWithRequiredBody)

Update a system user information.

Update a system user information such as name.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BusinessAccessRelationshipsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BusinessAccessRelationshipsApiInterface;

class BusinessAccessRelationshipsApi implements BusinessAccessRelationshipsApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: pinterest_oauth2
     */
    public function setpinterest_oauth2($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of BusinessAccessRelationshipsApiInterface#systemUserUpdate
     */
    public function systemUserUpdate(string $businessId, string $systemUserId, SystemUserUpdateWithRequiredBody $systemUserUpdateWithRequiredBody, int &$responseCode, array &$responseHeaders): void
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **string**| Unique identifier of the requesting business. |
 **systemUserId** | **string**| Unique identifier of a system user. |
 **systemUserUpdateWithRequiredBody** | [**OpenAPI\Server\Model\SystemUserUpdateWithRequiredBody**](../Model/SystemUserUpdateWithRequiredBody.md)|  |

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **updateBusinessMemberships**
> OpenAPI\Server\Model\UpdateBusinessMembershipsResponse updateBusinessMemberships($businessId, $businessMembershipMember)

Update member's business role

Update a member's business role within the business.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BusinessAccessRelationshipsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BusinessAccessRelationshipsApiInterface;

class BusinessAccessRelationshipsApi implements BusinessAccessRelationshipsApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: pinterest_oauth2
     */
    public function setpinterest_oauth2($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of BusinessAccessRelationshipsApiInterface#updateBusinessMemberships
     */
    public function updateBusinessMemberships(string $businessId, array $businessMembershipMember, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **string**| Business id |
 **businessMembershipMember** | [**OpenAPI\Server\Model\BusinessMembershipMember**](../Model/BusinessMembershipMember.md)|  |

### Return type

[**OpenAPI\Server\Model\UpdateBusinessMembershipsResponse**](../Model/UpdateBusinessMembershipsResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

