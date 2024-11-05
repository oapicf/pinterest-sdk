# OpenAPI\Server\Api\BusinessAccessRelationshipsApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteBusinessMembership**](BusinessAccessRelationshipsApiInterface.md#deleteBusinessMembership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships
[**deleteBusinessPartners**](BusinessAccessRelationshipsApiInterface.md#deleteBusinessPartners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships
[**getBusinessEmployers**](BusinessAccessRelationshipsApiInterface.md#getBusinessEmployers) | **GET** /businesses/employers | List business employers for user
[**getBusinessMembers**](BusinessAccessRelationshipsApiInterface.md#getBusinessMembers) | **GET** /businesses/{business_id}/members | Get business members
[**getBusinessPartners**](BusinessAccessRelationshipsApiInterface.md#getBusinessPartners) | **GET** /businesses/{business_id}/partners | Get business partners
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

## **deleteBusinessMembership**
> OpenAPI\Server\Model\DeletedMembersResponse deleteBusinessMembership($businessId, $membersToDeleteBody)

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
    public function deleteBusinessMembership(string $businessId, MembersToDeleteBody $membersToDeleteBody, int &$responseCode, array &$responseHeaders): array|object|null
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
 **membersToDeleteBody** | [**OpenAPI\Server\Model\MembersToDeleteBody**](../Model/MembersToDeleteBody.md)| List of members with role to delete. |

### Return type

[**OpenAPI\Server\Model\DeletedMembersResponse**](../Model/DeletedMembersResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **deleteBusinessPartners**
> OpenAPI\Server\Model\DeletePartnersResponse deleteBusinessPartners($businessId, $deletePartnersRequest)

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
    public function deleteBusinessPartners(string $businessId, DeletePartnersRequest $deletePartnersRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **deletePartnersRequest** | [**OpenAPI\Server\Model\DeletePartnersRequest**](../Model/DeletePartnersRequest.md)| An object containing a \&quot;partner_ids\&quot; property composed of a list of partner IDs and a \&quot;partners_type\&quot; property specifying the type of partners to delete. |

### Return type

[**OpenAPI\Server\Model\DeletePartnersResponse**](../Model/DeletePartnersResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getBusinessEmployers**
> OpenAPI\Server\Model\GetBusinessEmployers200Response getBusinessEmployers($pageSize, $bookmark)

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
    public function getBusinessEmployers(int $pageSize, ?string $bookmark, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]

### Return type

[**OpenAPI\Server\Model\GetBusinessEmployers200Response**](../Model/GetBusinessEmployers200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getBusinessMembers**
> OpenAPI\Server\Model\GetBusinessMembers200Response getBusinessMembers($businessId, $assetsSummary, $businessRoles, $memberIds, $startIndex, $bookmark, $pageSize)

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
    public function getBusinessMembers(string $businessId, bool $assetsSummary, ?array $businessRoles, ?string $memberIds, int $startIndex, ?string $bookmark, int $pageSize, int &$responseCode, array &$responseHeaders): array|object|null
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
 **businessRoles** | [**OpenAPI\Server\Model\MemberBusinessRole**](../Model/OpenAPI\Server\Model\MemberBusinessRole.md)| A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. | [optional]
 **memberIds** | **string**| A list of business members ids separated by comma. | [optional]
 **startIndex** | **int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**OpenAPI\Server\Model\GetBusinessMembers200Response**](../Model/GetBusinessMembers200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getBusinessPartners**
> OpenAPI\Server\Model\GetBusinessPartners200Response getBusinessPartners($businessId, $assetsSummary, $partnerType, $partnerIds, $startIndex, $pageSize, $bookmark)

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
    public function getBusinessPartners(string $businessId, bool $assetsSummary, ?PartnerType $partnerType, ?string $partnerIds, int $startIndex, int $pageSize, ?string $bookmark, int &$responseCode, array &$responseHeaders): array|object|null
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
 **partnerType** | [**OpenAPI\Server\Model\PartnerType**](../Model/.md)| Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional]
 **partnerIds** | **string**| A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | [optional]
 **startIndex** | **int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]

### Return type

[**OpenAPI\Server\Model\GetBusinessPartners200Response**](../Model/GetBusinessPartners200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **updateBusinessMemberships**
> OpenAPI\Server\Model\UpdateMemberResultsResponseArray updateBusinessMemberships($businessId, $updateMemberBusinessRoleBody)

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
    public function updateBusinessMemberships(string $businessId, array $updateMemberBusinessRoleBody, int &$responseCode, array &$responseHeaders): array|object|null
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
 **updateMemberBusinessRoleBody** | [**OpenAPI\Server\Model\UpdateMemberBusinessRoleBody**](../Model/UpdateMemberBusinessRoleBody.md)| List of objects with the member id and the business_role. |

### Return type

[**OpenAPI\Server\Model\UpdateMemberResultsResponseArray**](../Model/UpdateMemberResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

