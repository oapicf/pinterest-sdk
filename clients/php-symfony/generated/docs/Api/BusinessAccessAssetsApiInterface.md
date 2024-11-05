# OpenAPI\Server\Api\BusinessAccessAssetsApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assetGroupCreate**](BusinessAccessAssetsApiInterface.md#assetGroupCreate) | **POST** /businesses/{business_id}/asset_groups | Create a new asset group.
[**assetGroupDelete**](BusinessAccessAssetsApiInterface.md#assetGroupDelete) | **DELETE** /businesses/{business_id}/asset_groups | Delete asset groups.
[**assetGroupUpdate**](BusinessAccessAssetsApiInterface.md#assetGroupUpdate) | **PATCH** /businesses/{business_id}/asset_groups | Update asset groups.
[**businessAssetMembersGet**](BusinessAccessAssetsApiInterface.md#businessAssetMembersGet) | **GET** /businesses/{business_id}/assets/{asset_id}/members | Get members with access to asset
[**businessAssetPartnersGet**](BusinessAccessAssetsApiInterface.md#businessAssetPartnersGet) | **GET** /businesses/{business_id}/assets/{asset_id}/partners | Get partners with access to asset
[**businessAssetsGet**](BusinessAccessAssetsApiInterface.md#businessAssetsGet) | **GET** /businesses/{business_id}/assets | List business assets
[**businessMemberAssetsGet**](BusinessAccessAssetsApiInterface.md#businessMemberAssetsGet) | **GET** /businesses/{business_id}/members/{member_id}/assets | Get assets assigned to a member
[**businessMembersAssetAccessDelete**](BusinessAccessAssetsApiInterface.md#businessMembersAssetAccessDelete) | **DELETE** /businesses/{business_id}/members/assets/access | Delete member access to asset
[**businessMembersAssetAccessUpdate**](BusinessAccessAssetsApiInterface.md#businessMembersAssetAccessUpdate) | **PATCH** /businesses/{business_id}/members/assets/access | Assign/Update member asset permissions
[**businessPartnerAssetAccessGet**](BusinessAccessAssetsApiInterface.md#businessPartnerAssetAccessGet) | **GET** /businesses/{business_id}/partners/{partner_id}/assets | Get assets assigned to a partner or assets assigned by a partner
[**deletePartnerAssetAccessHandlerImpl**](BusinessAccessAssetsApiInterface.md#deletePartnerAssetAccessHandlerImpl) | **DELETE** /businesses/{business_id}/partners/assets | Delete partner access to asset
[**updatePartnerAssetAccessHandlerImpl**](BusinessAccessAssetsApiInterface.md#updatePartnerAssetAccessHandlerImpl) | **PATCH** /businesses/{business_id}/partners/assets | Assign/Update partner asset permissions


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\BusinessAccessAssetsApi:
        tags:
            - { name: "open_api_server.api", api: "businessAccessAssets" }
    # ...
```

## **assetGroupCreate**
> OpenAPI\Server\Model\CreateAssetGroupResponse assetGroupCreate($businessId, $createAssetGroupBody)

Create a new asset group.

Create a new asset group with the specified parameters. - An <a href=\"https://help.pinterest.com/en/business/article/asset-groups\">asset group</a> is a custom group of assets based on how you’d like to manage your accounts.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BusinessAccessAssetsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BusinessAccessAssetsApiInterface;

class BusinessAccessAssetsApi implements BusinessAccessAssetsApiInterface
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
     * Implementation of BusinessAccessAssetsApiInterface#assetGroupCreate
     */
    public function assetGroupCreate(string $businessId, CreateAssetGroupBody $createAssetGroupBody, int &$responseCode, array &$responseHeaders): array|object|null
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
 **createAssetGroupBody** | [**OpenAPI\Server\Model\CreateAssetGroupBody**](../Model/CreateAssetGroupBody.md)|  |

### Return type

[**OpenAPI\Server\Model\CreateAssetGroupResponse**](../Model/CreateAssetGroupResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **assetGroupDelete**
> OpenAPI\Server\Model\DeleteAssetGroupResponse assetGroupDelete($businessId, $deleteAssetGroupBody)

Delete asset groups.

Delete a batch of asset groups.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BusinessAccessAssetsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BusinessAccessAssetsApiInterface;

class BusinessAccessAssetsApi implements BusinessAccessAssetsApiInterface
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
     * Implementation of BusinessAccessAssetsApiInterface#assetGroupDelete
     */
    public function assetGroupDelete(string $businessId, DeleteAssetGroupBody $deleteAssetGroupBody, int &$responseCode, array &$responseHeaders): array|object|null
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
 **deleteAssetGroupBody** | [**OpenAPI\Server\Model\DeleteAssetGroupBody**](../Model/DeleteAssetGroupBody.md)|  |

### Return type

[**OpenAPI\Server\Model\DeleteAssetGroupResponse**](../Model/DeleteAssetGroupResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **assetGroupUpdate**
> OpenAPI\Server\Model\UpdateAssetGroupResponse assetGroupUpdate($businessId, $updateAssetGroupBody)

Update asset groups.

Update a batch of asset groups with the specified parameters.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BusinessAccessAssetsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BusinessAccessAssetsApiInterface;

class BusinessAccessAssetsApi implements BusinessAccessAssetsApiInterface
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
     * Implementation of BusinessAccessAssetsApiInterface#assetGroupUpdate
     */
    public function assetGroupUpdate(string $businessId, UpdateAssetGroupBody $updateAssetGroupBody, int &$responseCode, array &$responseHeaders): array|object|null
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
 **updateAssetGroupBody** | [**OpenAPI\Server\Model\UpdateAssetGroupBody**](../Model/UpdateAssetGroupBody.md)|  |

### Return type

[**OpenAPI\Server\Model\UpdateAssetGroupResponse**](../Model/UpdateAssetGroupResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **businessAssetMembersGet**
> OpenAPI\Server\Model\BusinessAssetMembersGet200Response businessAssetMembersGet($businessId, $assetId, $bookmark, $pageSize, $startIndex)

Get members with access to asset

Get all the members the requesting business has granted access to on the given asset.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BusinessAccessAssetsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BusinessAccessAssetsApiInterface;

class BusinessAccessAssetsApi implements BusinessAccessAssetsApiInterface
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
     * Implementation of BusinessAccessAssetsApiInterface#businessAssetMembersGet
     */
    public function businessAssetMembersGet(string $businessId, string $assetId, ?string $bookmark, int $pageSize, int $startIndex, int &$responseCode, array &$responseHeaders): array|object|null
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
 **assetId** | **string**| Unique identifier of a business asset. |
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **startIndex** | **int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]

### Return type

[**OpenAPI\Server\Model\BusinessAssetMembersGet200Response**](../Model/BusinessAssetMembersGet200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **businessAssetPartnersGet**
> OpenAPI\Server\Model\BusinessAssetPartnersGet200Response businessAssetPartnersGet($businessId, $assetId, $startIndex, $bookmark, $pageSize)

Get partners with access to asset

Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BusinessAccessAssetsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BusinessAccessAssetsApiInterface;

class BusinessAccessAssetsApi implements BusinessAccessAssetsApiInterface
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
     * Implementation of BusinessAccessAssetsApiInterface#businessAssetPartnersGet
     */
    public function businessAssetPartnersGet(string $businessId, string $assetId, int $startIndex, ?string $bookmark, int $pageSize, int &$responseCode, array &$responseHeaders): array|object|null
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
 **assetId** | **string**| Unique identifier of a business asset. |
 **startIndex** | **int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**OpenAPI\Server\Model\BusinessAssetPartnersGet200Response**](../Model/BusinessAssetPartnersGet200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **businessAssetsGet**
> OpenAPI\Server\Model\BusinessAssetsGet200Response businessAssetsGet($businessId, $permissions, $childAssetId, $assetGroupId, $assetType, $startIndex, $bookmark, $pageSize)

List business assets

Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BusinessAccessAssetsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BusinessAccessAssetsApiInterface;

class BusinessAccessAssetsApi implements BusinessAccessAssetsApiInterface
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
     * Implementation of BusinessAccessAssetsApiInterface#businessAssetsGet
     */
    public function businessAssetsGet(string $businessId, ?array $permissions, ?string $childAssetId, ?string $assetGroupId, string $assetType, int $startIndex, ?string $bookmark, int $pageSize, int &$responseCode, array &$responseHeaders): array|object|null
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
 **permissions** | [**OpenAPI\Server\Model\PermissionsWithOwner**](../Model/OpenAPI\Server\Model\PermissionsWithOwner.md)| A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. | [optional]
 **childAssetId** | **string**| A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. | [optional]
 **assetGroupId** | **string**| An asset group unique identifier. Used to fetch assets contained within the specified asset group. | [optional]
 **assetType** | **string**| A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to &#39;AD_ACCOUNT&#39;]
 **startIndex** | **int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**OpenAPI\Server\Model\BusinessAssetsGet200Response**](../Model/BusinessAssetsGet200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **businessMemberAssetsGet**
> OpenAPI\Server\Model\BusinessMemberAssetsGet200Response businessMemberAssetsGet($businessId, $memberId, $assetType, $startIndex, $bookmark, $pageSize)

Get assets assigned to a member

Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BusinessAccessAssetsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BusinessAccessAssetsApiInterface;

class BusinessAccessAssetsApi implements BusinessAccessAssetsApiInterface
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
     * Implementation of BusinessAccessAssetsApiInterface#businessMemberAssetsGet
     */
    public function businessMemberAssetsGet(string $businessId, string $memberId, string $assetType, int $startIndex, ?string $bookmark, int $pageSize, int &$responseCode, array &$responseHeaders): array|object|null
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
 **memberId** | **string**| The member id to fetch assets for. |
 **assetType** | **string**| A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to &#39;AD_ACCOUNT&#39;]
 **startIndex** | **int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**OpenAPI\Server\Model\BusinessMemberAssetsGet200Response**](../Model/BusinessMemberAssetsGet200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **businessMembersAssetAccessDelete**
> OpenAPI\Server\Model\DeleteMemberAccessResultsResponseArray businessMembersAssetAccessDelete($businessId, $businessMembersAssetAccessDeleteRequest)

Delete member access to asset

Terminate multiple members' access to an asset.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BusinessAccessAssetsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BusinessAccessAssetsApiInterface;

class BusinessAccessAssetsApi implements BusinessAccessAssetsApiInterface
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
     * Implementation of BusinessAccessAssetsApiInterface#businessMembersAssetAccessDelete
     */
    public function businessMembersAssetAccessDelete(string $businessId, BusinessMembersAssetAccessDeleteRequest $businessMembersAssetAccessDeleteRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **businessMembersAssetAccessDeleteRequest** | [**OpenAPI\Server\Model\BusinessMembersAssetAccessDeleteRequest**](../Model/BusinessMembersAssetAccessDeleteRequest.md)| List member assset permissions to delete. |

### Return type

[**OpenAPI\Server\Model\DeleteMemberAccessResultsResponseArray**](../Model/DeleteMemberAccessResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **businessMembersAssetAccessUpdate**
> OpenAPI\Server\Model\UpdateMemberAssetsResultsResponseArray businessMembersAssetAccessUpdate($businessId, $updateMemberAssetAccessBody)

Assign/Update member asset permissions

Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BusinessAccessAssetsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BusinessAccessAssetsApiInterface;

class BusinessAccessAssetsApi implements BusinessAccessAssetsApiInterface
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
     * Implementation of BusinessAccessAssetsApiInterface#businessMembersAssetAccessUpdate
     */
    public function businessMembersAssetAccessUpdate(string $businessId, UpdateMemberAssetAccessBody $updateMemberAssetAccessBody, int &$responseCode, array &$responseHeaders): array|object|null
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
 **updateMemberAssetAccessBody** | [**OpenAPI\Server\Model\UpdateMemberAssetAccessBody**](../Model/UpdateMemberAssetAccessBody.md)| List of member asset permissions to create or update. |

### Return type

[**OpenAPI\Server\Model\UpdateMemberAssetsResultsResponseArray**](../Model/UpdateMemberAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **businessPartnerAssetAccessGet**
> OpenAPI\Server\Model\BusinessPartnerAssetAccessGet200Response businessPartnerAssetAccessGet($businessId, $partnerId, $partnerType, $assetType, $startIndex, $pageSize, $bookmark)

Get assets assigned to a partner or assets assigned by a partner

Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BusinessAccessAssetsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BusinessAccessAssetsApiInterface;

class BusinessAccessAssetsApi implements BusinessAccessAssetsApiInterface
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
     * Implementation of BusinessAccessAssetsApiInterface#businessPartnerAssetAccessGet
     */
    public function businessPartnerAssetAccessGet(string $businessId, string $partnerId, ?$partnerType, string $assetType, int $startIndex, int $pageSize, ?string $bookmark, int &$responseCode, array &$responseHeaders): array|object|null
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
 **partnerId** | **string**| The partner id to be bound to the Business |
 **partnerType** | [**PartnerType**](../Model/.md)| Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional]
 **assetType** | **string**| A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to &#39;AD_ACCOUNT&#39;]
 **startIndex** | **int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]

### Return type

[**OpenAPI\Server\Model\BusinessPartnerAssetAccessGet200Response**](../Model/BusinessPartnerAssetAccessGet200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **deletePartnerAssetAccessHandlerImpl**
> OpenAPI\Server\Model\DeletePartnerAssetsResultsResponseArray deletePartnerAssetAccessHandlerImpl($businessId, $deletePartnerAssetAccessBody)

Delete partner access to asset

Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BusinessAccessAssetsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BusinessAccessAssetsApiInterface;

class BusinessAccessAssetsApi implements BusinessAccessAssetsApiInterface
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
     * Implementation of BusinessAccessAssetsApiInterface#deletePartnerAssetAccessHandlerImpl
     */
    public function deletePartnerAssetAccessHandlerImpl(string $businessId, DeletePartnerAssetAccessBody $deletePartnerAssetAccessBody, int &$responseCode, array &$responseHeaders): array|object|null
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
 **deletePartnerAssetAccessBody** | [**OpenAPI\Server\Model\DeletePartnerAssetAccessBody**](../Model/DeletePartnerAssetAccessBody.md)|  |

### Return type

[**OpenAPI\Server\Model\DeletePartnerAssetsResultsResponseArray**](../Model/DeletePartnerAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **updatePartnerAssetAccessHandlerImpl**
> OpenAPI\Server\Model\UpdatePartnerAssetsResultsResponseArray updatePartnerAssetAccessHandlerImpl($businessId, $updatePartnerAssetAccessBody)

Assign/Update partner asset permissions

Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BusinessAccessAssetsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BusinessAccessAssetsApiInterface;

class BusinessAccessAssetsApi implements BusinessAccessAssetsApiInterface
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
     * Implementation of BusinessAccessAssetsApiInterface#updatePartnerAssetAccessHandlerImpl
     */
    public function updatePartnerAssetAccessHandlerImpl(string $businessId, UpdatePartnerAssetAccessBody $updatePartnerAssetAccessBody, int &$responseCode, array &$responseHeaders): array|object|null
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
 **updatePartnerAssetAccessBody** | [**OpenAPI\Server\Model\UpdatePartnerAssetAccessBody**](../Model/UpdatePartnerAssetAccessBody.md)| A list of assets and permissions to assign to your partners. |

### Return type

[**OpenAPI\Server\Model\UpdatePartnerAssetsResultsResponseArray**](../Model/UpdatePartnerAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

