<?php
declare(strict_types=1);

namespace App;

use Articus\DataTransfer as DT;
use OpenAPIGenerator\APIClient as OAGAC;
use Psr\Http\Client\ClientExceptionInterface;
use Psr\Http\Message\ResponseInterface;

/**
 * Pinterest REST API
 * Pinterest's REST API
 * The version of the OpenAPI document: 5.12.0
 */
class ApiClient extends OAGAC\AbstractApiClient
{
    //region adAccountAnalytics
    /**
     * Get ad account analytics
     * @param \App\DTO\AdAccountAnalyticsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function adAccountAnalyticsRaw(
        \App\DTO\AdAccountAnalyticsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/analytics', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get ad account analytics
     * @param \App\DTO\AdAccountAnalyticsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function adAccountAnalytics(
        \App\DTO\AdAccountAnalyticsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->adAccountAnalyticsRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\Collection47();
                break;
            case 400:
                /* Invalid ad account analytics parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get ad account analytics
     * @param \App\DTO\AdAccountAnalyticsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\Collection47
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function adAccountAnalyticsResult(
        \App\DTO\AdAccountAnalyticsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\Collection47
    {
        return $this->getSuccessfulContent(...$this->adAccountAnalytics($parameters, $security, $responseMediaType));
    }
    //endregion

    //region adAccountCountriesGet
    /**
     * Get ad accounts countries
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function adAccountCountriesGetRaw(
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/resources/ad_account_countries', [], []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get ad accounts countries
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function adAccountCountriesGet(
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->adAccountCountriesGetRaw($security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\AdAccountsCountryResponse();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get ad accounts countries
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\AdAccountsCountryResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function adAccountCountriesGetResult(
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\AdAccountsCountryResponse
    {
        return $this->getSuccessfulContent(...$this->adAccountCountriesGet($security, $responseMediaType));
    }
    //endregion

    //region adAccountTargetingAnalyticsGet
    /**
     * Get targeting analytics for an ad account
     * @param \App\DTO\AdAccountTargetingAnalyticsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function adAccountTargetingAnalyticsGetRaw(
        \App\DTO\AdAccountTargetingAnalyticsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/targeting_analytics', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get targeting analytics for an ad account
     * @param \App\DTO\AdAccountTargetingAnalyticsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function adAccountTargetingAnalyticsGet(
        \App\DTO\AdAccountTargetingAnalyticsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->adAccountTargetingAnalyticsGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\MetricsResponse();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get targeting analytics for an ad account
     * @param \App\DTO\AdAccountTargetingAnalyticsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\MetricsResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function adAccountTargetingAnalyticsGetResult(
        \App\DTO\AdAccountTargetingAnalyticsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\MetricsResponse
    {
        return $this->getSuccessfulContent(...$this->adAccountTargetingAnalyticsGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region adAccountsCatalogsProductGroupsList
    /**
     * Get catalog product groups
     * @param \App\DTO\AdAccountsCatalogsProductGroupsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function adAccountsCatalogsProductGroupsListRaw(
        \App\DTO\AdAccountsCatalogsProductGroupsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/product_groups/catalogs', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get catalog product groups
     * @param \App\DTO\AdAccountsCatalogsProductGroupsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function adAccountsCatalogsProductGroupsList(
        \App\DTO\AdAccountsCatalogsProductGroupsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->adAccountsCatalogsProductGroupsListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\AdAccountsCatalogsProductGroupsList200Response();
                break;
            case 400:
                /* Invalid ad account ads parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            case 401:
                /* Access Denied. This can happen if account is not yet approved to operate as Merchant on Pinterest. */
                $responseContent = new \App\DTO\Error();
                break;
            case 404:
                /* Merchant data not found. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get catalog product groups
     * @param \App\DTO\AdAccountsCatalogsProductGroupsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\AdAccountsCatalogsProductGroupsList200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function adAccountsCatalogsProductGroupsListResult(
        \App\DTO\AdAccountsCatalogsProductGroupsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\AdAccountsCatalogsProductGroupsList200Response
    {
        return $this->getSuccessfulContent(...$this->adAccountsCatalogsProductGroupsList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region adAccountsCreate
    /**
     * Create ad account
     * @param \App\DTO\AdAccountCreateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function adAccountsCreateRaw(
        \App\DTO\AdAccountCreateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/ad_accounts', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create ad account
     * @param \App\DTO\AdAccountCreateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function adAccountsCreate(
        \App\DTO\AdAccountCreateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->adAccountsCreateRaw($requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\AdAccount();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create ad account
     * @param \App\DTO\AdAccountCreateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\AdAccount
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function adAccountsCreateResult(
        \App\DTO\AdAccountCreateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\AdAccount
    {
        return $this->getSuccessfulContent(...$this->adAccountsCreate($requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region adAccountsGet
    /**
     * Get ad account
     * @param \App\DTO\AdAccountsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function adAccountsGetRaw(
        \App\DTO\AdAccountsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get ad account
     * @param \App\DTO\AdAccountsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function adAccountsGet(
        \App\DTO\AdAccountsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->adAccountsGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\AdAccount();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get ad account
     * @param \App\DTO\AdAccountsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\AdAccount
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function adAccountsGetResult(
        \App\DTO\AdAccountsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\AdAccount
    {
        return $this->getSuccessfulContent(...$this->adAccountsGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region adAccountsList
    /**
     * List ad accounts
     * @param \App\DTO\AdAccountsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function adAccountsListRaw(
        \App\DTO\AdAccountsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List ad accounts
     * @param \App\DTO\AdAccountsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function adAccountsList(
        \App\DTO\AdAccountsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->adAccountsListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* response */
                $responseContent = new \App\DTO\AdAccountsList200Response();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List ad accounts
     * @param \App\DTO\AdAccountsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\AdAccountsList200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function adAccountsListResult(
        \App\DTO\AdAccountsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\AdAccountsList200Response
    {
        return $this->getSuccessfulContent(...$this->adAccountsList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region adAccountsSubscriptionsDelById
    /**
     * Delete lead ads subscription
     * @param \App\DTO\AdAccountsSubscriptionsDelByIdParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function adAccountsSubscriptionsDelByIdRaw(
        \App\DTO\AdAccountsSubscriptionsDelByIdParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete lead ads subscription
     * @param \App\DTO\AdAccountsSubscriptionsDelByIdParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function adAccountsSubscriptionsDelById(
        \App\DTO\AdAccountsSubscriptionsDelByIdParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->adAccountsSubscriptionsDelByIdRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 204:
                /* Subscription deleted successfully */
                break;
            case 400:
                /* Invalid input parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            case 403:
                /* You are not authorized to delete this subscription. */
                $responseContent = new \App\DTO\Error();
                break;
            case 404:
                /* Subscription not found. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error. */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete lead ads subscription
     * @param \App\DTO\AdAccountsSubscriptionsDelByIdParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function adAccountsSubscriptionsDelByIdResult(
        \App\DTO\AdAccountsSubscriptionsDelByIdParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $responseMediaType = 'application/json'
    )
    {
        return $this->getSuccessfulContent(...$this->adAccountsSubscriptionsDelById($parameters, $security, $responseMediaType));
    }
    //endregion

    //region adAccountsSubscriptionsGetById
    /**
     * Get lead ads subscription
     * @param \App\DTO\AdAccountsSubscriptionsGetByIdParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function adAccountsSubscriptionsGetByIdRaw(
        \App\DTO\AdAccountsSubscriptionsGetByIdParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get lead ads subscription
     * @param \App\DTO\AdAccountsSubscriptionsGetByIdParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function adAccountsSubscriptionsGetById(
        \App\DTO\AdAccountsSubscriptionsGetByIdParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->adAccountsSubscriptionsGetByIdRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\AdAccountGetSubscriptionResponse();
                break;
            case 400:
                /* Invalid input parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            case 403:
                /* Can't access this subscription. */
                $responseContent = new \App\DTO\Error();
                break;
            case 404:
                /* Subscription not found. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error. */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get lead ads subscription
     * @param \App\DTO\AdAccountsSubscriptionsGetByIdParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\AdAccountGetSubscriptionResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function adAccountsSubscriptionsGetByIdResult(
        \App\DTO\AdAccountsSubscriptionsGetByIdParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\AdAccountGetSubscriptionResponse
    {
        return $this->getSuccessfulContent(...$this->adAccountsSubscriptionsGetById($parameters, $security, $responseMediaType));
    }
    //endregion

    //region adAccountsSubscriptionsGetList
    /**
     * Get lead ads subscriptions
     * @param \App\DTO\AdAccountsSubscriptionsGetListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function adAccountsSubscriptionsGetListRaw(
        \App\DTO\AdAccountsSubscriptionsGetListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/leads/subscriptions', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get lead ads subscriptions
     * @param \App\DTO\AdAccountsSubscriptionsGetListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function adAccountsSubscriptionsGetList(
        \App\DTO\AdAccountsSubscriptionsGetListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->adAccountsSubscriptionsGetListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\AdAccountsSubscriptionsGetList200Response();
                break;
            case 403:
                /* Can't access this subscription. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error. */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get lead ads subscriptions
     * @param \App\DTO\AdAccountsSubscriptionsGetListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\AdAccountsSubscriptionsGetList200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function adAccountsSubscriptionsGetListResult(
        \App\DTO\AdAccountsSubscriptionsGetListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\AdAccountsSubscriptionsGetList200Response
    {
        return $this->getSuccessfulContent(...$this->adAccountsSubscriptionsGetList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region adAccountsSubscriptionsPost
    /**
     * Create lead ads subscription
     * @param \App\DTO\AdAccountsSubscriptionsPostParameterData $parameters
     * @param \App\DTO\AdAccountCreateSubscriptionRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function adAccountsSubscriptionsPostRaw(
        \App\DTO\AdAccountsSubscriptionsPostParameterData $parameters,
        \App\DTO\AdAccountCreateSubscriptionRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/ad_accounts/{ad_account_id}/leads/subscriptions', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create lead ads subscription
     * @param \App\DTO\AdAccountsSubscriptionsPostParameterData $parameters
     * @param \App\DTO\AdAccountCreateSubscriptionRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function adAccountsSubscriptionsPost(
        \App\DTO\AdAccountsSubscriptionsPostParameterData $parameters,
        \App\DTO\AdAccountCreateSubscriptionRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->adAccountsSubscriptionsPostRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\AdAccountCreateSubscriptionResponse();
                break;
            case 400:
                /* Invalid input parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            case 403:
                /* Can't access this subscription. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error. */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create lead ads subscription
     * @param \App\DTO\AdAccountsSubscriptionsPostParameterData $parameters
     * @param \App\DTO\AdAccountCreateSubscriptionRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\AdAccountCreateSubscriptionResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function adAccountsSubscriptionsPostResult(
        \App\DTO\AdAccountsSubscriptionsPostParameterData $parameters,
        \App\DTO\AdAccountCreateSubscriptionRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\AdAccountCreateSubscriptionResponse
    {
        return $this->getSuccessfulContent(...$this->adAccountsSubscriptionsPost($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region adGroupsAnalytics
    /**
     * Get ad group analytics
     * @param \App\DTO\AdGroupsAnalyticsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function adGroupsAnalyticsRaw(
        \App\DTO\AdGroupsAnalyticsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/ad_groups/analytics', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get ad group analytics
     * @param \App\DTO\AdGroupsAnalyticsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function adGroupsAnalytics(
        \App\DTO\AdGroupsAnalyticsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->adGroupsAnalyticsRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\Collection11();
                break;
            case 400:
                /* Invalid ad account group analytics parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get ad group analytics
     * @param \App\DTO\AdGroupsAnalyticsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\Collection11
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function adGroupsAnalyticsResult(
        \App\DTO\AdGroupsAnalyticsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\Collection11
    {
        return $this->getSuccessfulContent(...$this->adGroupsAnalytics($parameters, $security, $responseMediaType));
    }
    //endregion

    //region adGroupsAudienceSizing
    /**
     * Get audience sizing
     * @param \App\DTO\AdGroupsAudienceSizingParameterData $parameters
     * @param \App\DTO\AdGroupAudienceSizingRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function adGroupsAudienceSizingRaw(
        \App\DTO\AdGroupsAudienceSizingParameterData $parameters,
        \App\DTO\AdGroupAudienceSizingRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/ad_groups/audience_sizing', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get audience sizing
     * @param \App\DTO\AdGroupsAudienceSizingParameterData $parameters
     * @param \App\DTO\AdGroupAudienceSizingRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function adGroupsAudienceSizing(
        \App\DTO\AdGroupsAudienceSizingParameterData $parameters,
        \App\DTO\AdGroupAudienceSizingRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->adGroupsAudienceSizingRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\AdGroupAudienceSizingResponse();
                break;
            case 400:
                /* Invalid ad group audience sizing parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            case 403:
                /* No access to requested audience list or product group. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get audience sizing
     * @param \App\DTO\AdGroupsAudienceSizingParameterData $parameters
     * @param \App\DTO\AdGroupAudienceSizingRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\AdGroupAudienceSizingResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function adGroupsAudienceSizingResult(
        \App\DTO\AdGroupsAudienceSizingParameterData $parameters,
        \App\DTO\AdGroupAudienceSizingRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\AdGroupAudienceSizingResponse
    {
        return $this->getSuccessfulContent(...$this->adGroupsAudienceSizing($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region adGroupsBidFloorGet
    /**
     * Get bid floors
     * @param \App\DTO\AdGroupsBidFloorGetParameterData $parameters
     * @param \App\DTO\BidFloorRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function adGroupsBidFloorGetRaw(
        \App\DTO\AdGroupsBidFloorGetParameterData $parameters,
        \App\DTO\BidFloorRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/ad_accounts/{ad_account_id}/bid_floor', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get bid floors
     * @param \App\DTO\AdGroupsBidFloorGetParameterData $parameters
     * @param \App\DTO\BidFloorRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function adGroupsBidFloorGet(
        \App\DTO\AdGroupsBidFloorGetParameterData $parameters,
        \App\DTO\BidFloorRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->adGroupsBidFloorGetRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\BidFloor();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get bid floors
     * @param \App\DTO\AdGroupsBidFloorGetParameterData $parameters
     * @param \App\DTO\BidFloorRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\BidFloor
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function adGroupsBidFloorGetResult(
        \App\DTO\AdGroupsBidFloorGetParameterData $parameters,
        \App\DTO\BidFloorRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\BidFloor
    {
        return $this->getSuccessfulContent(...$this->adGroupsBidFloorGet($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region adGroupsCreate
    /**
     * Create ad groups
     * @param \App\DTO\AdGroupsCreateParameterData $parameters
     * @param \App\DTO\Collection4 $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function adGroupsCreateRaw(
        \App\DTO\AdGroupsCreateParameterData $parameters,
        \App\DTO\Collection4 $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/ad_accounts/{ad_account_id}/ad_groups', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create ad groups
     * @param \App\DTO\AdGroupsCreateParameterData $parameters
     * @param \App\DTO\Collection4 $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function adGroupsCreate(
        \App\DTO\AdGroupsCreateParameterData $parameters,
        \App\DTO\Collection4 $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->adGroupsCreateRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\AdGroupArrayResponse();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create ad groups
     * @param \App\DTO\AdGroupsCreateParameterData $parameters
     * @param \App\DTO\Collection4 $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\AdGroupArrayResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function adGroupsCreateResult(
        \App\DTO\AdGroupsCreateParameterData $parameters,
        \App\DTO\Collection4 $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\AdGroupArrayResponse
    {
        return $this->getSuccessfulContent(...$this->adGroupsCreate($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region adGroupsGet
    /**
     * Get ad group
     * @param \App\DTO\AdGroupsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function adGroupsGetRaw(
        \App\DTO\AdGroupsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get ad group
     * @param \App\DTO\AdGroupsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function adGroupsGet(
        \App\DTO\AdGroupsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->adGroupsGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\AdGroupResponse();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get ad group
     * @param \App\DTO\AdGroupsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\AdGroupResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function adGroupsGetResult(
        \App\DTO\AdGroupsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\AdGroupResponse
    {
        return $this->getSuccessfulContent(...$this->adGroupsGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region adGroupsList
    /**
     * List ad groups
     * @param \App\DTO\AdGroupsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function adGroupsListRaw(
        \App\DTO\AdGroupsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/ad_groups', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List ad groups
     * @param \App\DTO\AdGroupsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function adGroupsList(
        \App\DTO\AdGroupsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->adGroupsListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\AdGroupsList200Response();
                break;
            case 400:
                /* Invalid ad account group parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List ad groups
     * @param \App\DTO\AdGroupsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\AdGroupsList200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function adGroupsListResult(
        \App\DTO\AdGroupsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\AdGroupsList200Response
    {
        return $this->getSuccessfulContent(...$this->adGroupsList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region adGroupsTargetingAnalyticsGet
    /**
     * Get targeting analytics for ad groups
     * @param \App\DTO\AdGroupsTargetingAnalyticsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function adGroupsTargetingAnalyticsGetRaw(
        \App\DTO\AdGroupsTargetingAnalyticsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/ad_groups/targeting_analytics', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get targeting analytics for ad groups
     * @param \App\DTO\AdGroupsTargetingAnalyticsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function adGroupsTargetingAnalyticsGet(
        \App\DTO\AdGroupsTargetingAnalyticsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->adGroupsTargetingAnalyticsGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\MetricsResponse();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get targeting analytics for ad groups
     * @param \App\DTO\AdGroupsTargetingAnalyticsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\MetricsResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function adGroupsTargetingAnalyticsGetResult(
        \App\DTO\AdGroupsTargetingAnalyticsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\MetricsResponse
    {
        return $this->getSuccessfulContent(...$this->adGroupsTargetingAnalyticsGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region adGroupsUpdate
    /**
     * Update ad groups
     * @param \App\DTO\AdGroupsUpdateParameterData $parameters
     * @param \App\DTO\Collection7 $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function adGroupsUpdateRaw(
        \App\DTO\AdGroupsUpdateParameterData $parameters,
        \App\DTO\Collection7 $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('PATCH', '/ad_accounts/{ad_account_id}/ad_groups', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update ad groups
     * @param \App\DTO\AdGroupsUpdateParameterData $parameters
     * @param \App\DTO\Collection7 $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function adGroupsUpdate(
        \App\DTO\AdGroupsUpdateParameterData $parameters,
        \App\DTO\Collection7 $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->adGroupsUpdateRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\AdGroupArrayResponse();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update ad groups
     * @param \App\DTO\AdGroupsUpdateParameterData $parameters
     * @param \App\DTO\Collection7 $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\AdGroupArrayResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function adGroupsUpdateResult(
        \App\DTO\AdGroupsUpdateParameterData $parameters,
        \App\DTO\Collection7 $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\AdGroupArrayResponse
    {
        return $this->getSuccessfulContent(...$this->adGroupsUpdate($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region adPreviewsCreate
    /**
     * Create ad preview with pin or image
     * @param \App\DTO\AdPreviewsCreateParameterData $parameters
     * @param \App\DTO\AdPreviewRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function adPreviewsCreateRaw(
        \App\DTO\AdPreviewsCreateParameterData $parameters,
        \App\DTO\AdPreviewRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/ad_accounts/{ad_account_id}/ad_previews', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create ad preview with pin or image
     * @param \App\DTO\AdPreviewsCreateParameterData $parameters
     * @param \App\DTO\AdPreviewRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function adPreviewsCreate(
        \App\DTO\AdPreviewsCreateParameterData $parameters,
        \App\DTO\AdPreviewRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->adPreviewsCreateRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Successful ad preview creation. */
                $responseContent = new \App\DTO\AdPreviewURLResponse();
                break;
            case 400:
                /* Invalid Pin parameters response */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create ad preview with pin or image
     * @param \App\DTO\AdPreviewsCreateParameterData $parameters
     * @param \App\DTO\AdPreviewRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\AdPreviewURLResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function adPreviewsCreateResult(
        \App\DTO\AdPreviewsCreateParameterData $parameters,
        \App\DTO\AdPreviewRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\AdPreviewURLResponse
    {
        return $this->getSuccessfulContent(...$this->adPreviewsCreate($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region adTargetingAnalyticsGet
    /**
     * Get targeting analytics for ads
     * @param \App\DTO\AdTargetingAnalyticsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function adTargetingAnalyticsGetRaw(
        \App\DTO\AdTargetingAnalyticsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/ads/targeting_analytics', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get targeting analytics for ads
     * @param \App\DTO\AdTargetingAnalyticsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function adTargetingAnalyticsGet(
        \App\DTO\AdTargetingAnalyticsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->adTargetingAnalyticsGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\MetricsResponse();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get targeting analytics for ads
     * @param \App\DTO\AdTargetingAnalyticsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\MetricsResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function adTargetingAnalyticsGetResult(
        \App\DTO\AdTargetingAnalyticsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\MetricsResponse
    {
        return $this->getSuccessfulContent(...$this->adTargetingAnalyticsGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region adsAnalytics
    /**
     * Get ad analytics
     * @param \App\DTO\AdsAnalyticsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function adsAnalyticsRaw(
        \App\DTO\AdsAnalyticsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/ads/analytics', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get ad analytics
     * @param \App\DTO\AdsAnalyticsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function adsAnalytics(
        \App\DTO\AdsAnalyticsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->adsAnalyticsRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\Collection41();
                break;
            case 400:
                /* Invalid ad account ads analytics parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get ad analytics
     * @param \App\DTO\AdsAnalyticsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\Collection41
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function adsAnalyticsResult(
        \App\DTO\AdsAnalyticsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\Collection41
    {
        return $this->getSuccessfulContent(...$this->adsAnalytics($parameters, $security, $responseMediaType));
    }
    //endregion

    //region adsCreate
    /**
     * Create ads
     * @param \App\DTO\AdsCreateParameterData $parameters
     * @param \App\DTO\Collection35 $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function adsCreateRaw(
        \App\DTO\AdsCreateParameterData $parameters,
        \App\DTO\Collection35 $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/ad_accounts/{ad_account_id}/ads', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create ads
     * @param \App\DTO\AdsCreateParameterData $parameters
     * @param \App\DTO\Collection35 $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function adsCreate(
        \App\DTO\AdsCreateParameterData $parameters,
        \App\DTO\Collection35 $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->adsCreateRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\AdArrayResponse();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create ads
     * @param \App\DTO\AdsCreateParameterData $parameters
     * @param \App\DTO\Collection35 $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\AdArrayResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function adsCreateResult(
        \App\DTO\AdsCreateParameterData $parameters,
        \App\DTO\Collection35 $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\AdArrayResponse
    {
        return $this->getSuccessfulContent(...$this->adsCreate($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region adsCreditRedeem
    /**
     * Redeem ad credits
     * @param \App\DTO\AdsCreditRedeemParameterData $parameters
     * @param \App\DTO\AdsCreditRedeemRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function adsCreditRedeemRaw(
        \App\DTO\AdsCreditRedeemParameterData $parameters,
        \App\DTO\AdsCreditRedeemRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', 'billing:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/ad_accounts/{ad_account_id}/ads_credit/redeem', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Redeem ad credits
     * @param \App\DTO\AdsCreditRedeemParameterData $parameters
     * @param \App\DTO\AdsCreditRedeemRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function adsCreditRedeem(
        \App\DTO\AdsCreditRedeemParameterData $parameters,
        \App\DTO\AdsCreditRedeemRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', 'billing:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->adsCreditRedeemRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Successfully redeemed ad credits. */
                $responseContent = new \App\DTO\AdsCreditRedeemResponse();
                break;
            case 400:
                /* Error thrown when unable to redeem offer code. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Redeem ad credits
     * @param \App\DTO\AdsCreditRedeemParameterData $parameters
     * @param \App\DTO\AdsCreditRedeemRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\AdsCreditRedeemResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function adsCreditRedeemResult(
        \App\DTO\AdsCreditRedeemParameterData $parameters,
        \App\DTO\AdsCreditRedeemRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', 'billing:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\AdsCreditRedeemResponse
    {
        return $this->getSuccessfulContent(...$this->adsCreditRedeem($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region adsCreditsDiscountsGet
    /**
     * Get ads credit discounts
     * @param \App\DTO\AdsCreditsDiscountsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function adsCreditsDiscountsGetRaw(
        \App\DTO\AdsCreditsDiscountsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', 'billing:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/ads_credit/discounts', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get ads credit discounts
     * @param \App\DTO\AdsCreditsDiscountsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function adsCreditsDiscountsGet(
        \App\DTO\AdsCreditsDiscountsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', 'billing:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->adsCreditsDiscountsGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\AdsCreditsDiscountsGet200Response();
                break;
            default:
                /* Unexpected error. */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get ads credit discounts
     * @param \App\DTO\AdsCreditsDiscountsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\AdsCreditsDiscountsGet200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function adsCreditsDiscountsGetResult(
        \App\DTO\AdsCreditsDiscountsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', 'billing:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\AdsCreditsDiscountsGet200Response
    {
        return $this->getSuccessfulContent(...$this->adsCreditsDiscountsGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region adsGet
    /**
     * Get ad
     * @param \App\DTO\AdsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function adsGetRaw(
        \App\DTO\AdsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/ads/{ad_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get ad
     * @param \App\DTO\AdsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function adsGet(
        \App\DTO\AdsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->adsGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\AdResponse();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get ad
     * @param \App\DTO\AdsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\AdResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function adsGetResult(
        \App\DTO\AdsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\AdResponse
    {
        return $this->getSuccessfulContent(...$this->adsGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region adsList
    /**
     * List ads
     * @param \App\DTO\AdsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function adsListRaw(
        \App\DTO\AdsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/ads', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List ads
     * @param \App\DTO\AdsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function adsList(
        \App\DTO\AdsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->adsListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\AdsList200Response();
                break;
            case 400:
                /* Invalid ad account ads parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List ads
     * @param \App\DTO\AdsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\AdsList200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function adsListResult(
        \App\DTO\AdsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\AdsList200Response
    {
        return $this->getSuccessfulContent(...$this->adsList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region adsUpdate
    /**
     * Update ads
     * @param \App\DTO\AdsUpdateParameterData $parameters
     * @param \App\DTO\Collection37 $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function adsUpdateRaw(
        \App\DTO\AdsUpdateParameterData $parameters,
        \App\DTO\Collection37 $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('PATCH', '/ad_accounts/{ad_account_id}/ads', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update ads
     * @param \App\DTO\AdsUpdateParameterData $parameters
     * @param \App\DTO\Collection37 $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function adsUpdate(
        \App\DTO\AdsUpdateParameterData $parameters,
        \App\DTO\Collection37 $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->adsUpdateRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\AdArrayResponse();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update ads
     * @param \App\DTO\AdsUpdateParameterData $parameters
     * @param \App\DTO\Collection37 $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\AdArrayResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function adsUpdateResult(
        \App\DTO\AdsUpdateParameterData $parameters,
        \App\DTO\Collection37 $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\AdArrayResponse
    {
        return $this->getSuccessfulContent(...$this->adsUpdate($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region analyticsCreateMmmReport
    /**
     * Create a request for a Marketing Mix Modeling (MMM) report
     * @param \App\DTO\AnalyticsCreateMmmReportParameterData $parameters
     * @param \App\DTO\CreateMMMReportRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function analyticsCreateMmmReportRaw(
        \App\DTO\AnalyticsCreateMmmReportParameterData $parameters,
        \App\DTO\CreateMMMReportRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/ad_accounts/{ad_account_id}/mmm_reports', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create a request for a Marketing Mix Modeling (MMM) report
     * @param \App\DTO\AnalyticsCreateMmmReportParameterData $parameters
     * @param \App\DTO\CreateMMMReportRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function analyticsCreateMmmReport(
        \App\DTO\AnalyticsCreateMmmReportParameterData $parameters,
        \App\DTO\CreateMMMReportRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->analyticsCreateMmmReportRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\CreateMMMReportResponse();
                break;
            case 400:
                /* Invalid ad account ads analytics mmm parameters */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create a request for a Marketing Mix Modeling (MMM) report
     * @param \App\DTO\AnalyticsCreateMmmReportParameterData $parameters
     * @param \App\DTO\CreateMMMReportRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\CreateMMMReportResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function analyticsCreateMmmReportResult(
        \App\DTO\AnalyticsCreateMmmReportParameterData $parameters,
        \App\DTO\CreateMMMReportRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\CreateMMMReportResponse
    {
        return $this->getSuccessfulContent(...$this->analyticsCreateMmmReport($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region analyticsCreateReport
    /**
     * Create async request for an account analytics report
     * @param \App\DTO\AnalyticsCreateReportParameterData $parameters
     * @param \App\DTO\AdsAnalyticsCreateAsyncRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function analyticsCreateReportRaw(
        \App\DTO\AnalyticsCreateReportParameterData $parameters,
        \App\DTO\AdsAnalyticsCreateAsyncRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/ad_accounts/{ad_account_id}/reports', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create async request for an account analytics report
     * @param \App\DTO\AnalyticsCreateReportParameterData $parameters
     * @param \App\DTO\AdsAnalyticsCreateAsyncRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function analyticsCreateReport(
        \App\DTO\AnalyticsCreateReportParameterData $parameters,
        \App\DTO\AdsAnalyticsCreateAsyncRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->analyticsCreateReportRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\AdsAnalyticsCreateAsyncResponse();
                break;
            case 400:
                /* Invalid ad account ads analytics parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create async request for an account analytics report
     * @param \App\DTO\AnalyticsCreateReportParameterData $parameters
     * @param \App\DTO\AdsAnalyticsCreateAsyncRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\AdsAnalyticsCreateAsyncResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function analyticsCreateReportResult(
        \App\DTO\AnalyticsCreateReportParameterData $parameters,
        \App\DTO\AdsAnalyticsCreateAsyncRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\AdsAnalyticsCreateAsyncResponse
    {
        return $this->getSuccessfulContent(...$this->analyticsCreateReport($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region analyticsCreateTemplateReport
    /**
     * Create async request for an analytics report using a template
     * @param \App\DTO\AnalyticsCreateTemplateReportParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function analyticsCreateTemplateReportRaw(
        \App\DTO\AnalyticsCreateTemplateReportParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/ad_accounts/{ad_account_id}/templates/{template_id}/reports', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create async request for an analytics report using a template
     * @param \App\DTO\AnalyticsCreateTemplateReportParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function analyticsCreateTemplateReport(
        \App\DTO\AnalyticsCreateTemplateReportParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->analyticsCreateTemplateReportRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\AdsAnalyticsCreateAsyncResponse();
                break;
            case 400:
                /* Invalid ad account ads analytics template parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create async request for an analytics report using a template
     * @param \App\DTO\AnalyticsCreateTemplateReportParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\AdsAnalyticsCreateAsyncResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function analyticsCreateTemplateReportResult(
        \App\DTO\AnalyticsCreateTemplateReportParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\AdsAnalyticsCreateAsyncResponse
    {
        return $this->getSuccessfulContent(...$this->analyticsCreateTemplateReport($parameters, $security, $responseMediaType));
    }
    //endregion

    //region analyticsGetMmmReport
    /**
     * Get advertiser Marketing Mix Modeling (MMM) report.
     * @param \App\DTO\AnalyticsGetMmmReportParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function analyticsGetMmmReportRaw(
        \App\DTO\AnalyticsGetMmmReportParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/mmm_reports', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get advertiser Marketing Mix Modeling (MMM) report.
     * @param \App\DTO\AnalyticsGetMmmReportParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function analyticsGetMmmReport(
        \App\DTO\AnalyticsGetMmmReportParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->analyticsGetMmmReportRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\GetMMMReportResponse();
                break;
            case 400:
                /* Invalid ad account ads analytics parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get advertiser Marketing Mix Modeling (MMM) report.
     * @param \App\DTO\AnalyticsGetMmmReportParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\GetMMMReportResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function analyticsGetMmmReportResult(
        \App\DTO\AnalyticsGetMmmReportParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\GetMMMReportResponse
    {
        return $this->getSuccessfulContent(...$this->analyticsGetMmmReport($parameters, $security, $responseMediaType));
    }
    //endregion

    //region analyticsGetReport
    /**
     * Get the account analytics report created by the async call
     * @param \App\DTO\AnalyticsGetReportParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function analyticsGetReportRaw(
        \App\DTO\AnalyticsGetReportParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/reports', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get the account analytics report created by the async call
     * @param \App\DTO\AnalyticsGetReportParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function analyticsGetReport(
        \App\DTO\AnalyticsGetReportParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->analyticsGetReportRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\AdsAnalyticsGetAsyncResponse();
                break;
            case 400:
                /* Invalid ad account ads analytics parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get the account analytics report created by the async call
     * @param \App\DTO\AnalyticsGetReportParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\AdsAnalyticsGetAsyncResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function analyticsGetReportResult(
        \App\DTO\AnalyticsGetReportParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\AdsAnalyticsGetAsyncResponse
    {
        return $this->getSuccessfulContent(...$this->analyticsGetReport($parameters, $security, $responseMediaType));
    }
    //endregion

    //region audienceInsightsGet
    /**
     * Get audience insights
     * @param \App\DTO\AudienceInsightsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function audienceInsightsGetRaw(
        \App\DTO\AudienceInsightsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/audience_insights', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get audience insights
     * @param \App\DTO\AudienceInsightsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function audienceInsightsGet(
        \App\DTO\AudienceInsightsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->audienceInsightsGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\AudienceInsightsResponse();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get audience insights
     * @param \App\DTO\AudienceInsightsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\AudienceInsightsResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function audienceInsightsGetResult(
        \App\DTO\AudienceInsightsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\AudienceInsightsResponse
    {
        return $this->getSuccessfulContent(...$this->audienceInsightsGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region audienceInsightsScopeAndTypeGet
    /**
     * Get audience insights scope and type
     * @param \App\DTO\AudienceInsightsScopeAndTypeGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function audienceInsightsScopeAndTypeGetRaw(
        \App\DTO\AudienceInsightsScopeAndTypeGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/insights/audiences', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get audience insights scope and type
     * @param \App\DTO\AudienceInsightsScopeAndTypeGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function audienceInsightsScopeAndTypeGet(
        \App\DTO\AudienceInsightsScopeAndTypeGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->audienceInsightsScopeAndTypeGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\AudienceDefinitionResponse();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get audience insights scope and type
     * @param \App\DTO\AudienceInsightsScopeAndTypeGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\AudienceDefinitionResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function audienceInsightsScopeAndTypeGetResult(
        \App\DTO\AudienceInsightsScopeAndTypeGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\AudienceDefinitionResponse
    {
        return $this->getSuccessfulContent(...$this->audienceInsightsScopeAndTypeGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region audiencesCreate
    /**
     * Create audience
     * @param \App\DTO\AudiencesCreateParameterData $parameters
     * @param \App\DTO\AudienceCreateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function audiencesCreateRaw(
        \App\DTO\AudiencesCreateParameterData $parameters,
        \App\DTO\AudienceCreateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/ad_accounts/{ad_account_id}/audiences', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create audience
     * @param \App\DTO\AudiencesCreateParameterData $parameters
     * @param \App\DTO\AudienceCreateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function audiencesCreate(
        \App\DTO\AudiencesCreateParameterData $parameters,
        \App\DTO\AudienceCreateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->audiencesCreateRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\Audience();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create audience
     * @param \App\DTO\AudiencesCreateParameterData $parameters
     * @param \App\DTO\AudienceCreateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\Audience
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function audiencesCreateResult(
        \App\DTO\AudiencesCreateParameterData $parameters,
        \App\DTO\AudienceCreateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\Audience
    {
        return $this->getSuccessfulContent(...$this->audiencesCreate($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region audiencesCreateCustom
    /**
     * Create custom audience
     * @param \App\DTO\AudiencesCreateCustomParameterData $parameters
     * @param \App\DTO\AudienceCreateCustomRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function audiencesCreateCustomRaw(
        \App\DTO\AudiencesCreateCustomParameterData $parameters,
        \App\DTO\AudienceCreateCustomRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/ad_accounts/{ad_account_id}/audiences/custom', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create custom audience
     * @param \App\DTO\AudiencesCreateCustomParameterData $parameters
     * @param \App\DTO\AudienceCreateCustomRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function audiencesCreateCustom(
        \App\DTO\AudiencesCreateCustomParameterData $parameters,
        \App\DTO\AudienceCreateCustomRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->audiencesCreateCustomRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\Audience();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create custom audience
     * @param \App\DTO\AudiencesCreateCustomParameterData $parameters
     * @param \App\DTO\AudienceCreateCustomRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\Audience
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function audiencesCreateCustomResult(
        \App\DTO\AudiencesCreateCustomParameterData $parameters,
        \App\DTO\AudienceCreateCustomRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\Audience
    {
        return $this->getSuccessfulContent(...$this->audiencesCreateCustom($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region audiencesGet
    /**
     * Get audience
     * @param \App\DTO\AudiencesGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function audiencesGetRaw(
        \App\DTO\AudiencesGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/audiences/{audience_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get audience
     * @param \App\DTO\AudiencesGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function audiencesGet(
        \App\DTO\AudiencesGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->audiencesGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\Audience();
                break;
            case 404:
                /* Audience not found. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error. */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get audience
     * @param \App\DTO\AudiencesGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\Audience
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function audiencesGetResult(
        \App\DTO\AudiencesGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\Audience
    {
        return $this->getSuccessfulContent(...$this->audiencesGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region audiencesList
    /**
     * List audiences
     * @param \App\DTO\AudiencesListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function audiencesListRaw(
        \App\DTO\AudiencesListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/audiences', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List audiences
     * @param \App\DTO\AudiencesListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function audiencesList(
        \App\DTO\AudiencesListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->audiencesListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\AudiencesList200Response();
                break;
            case 400:
                /* Invalid ad account audience parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List audiences
     * @param \App\DTO\AudiencesListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\AudiencesList200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function audiencesListResult(
        \App\DTO\AudiencesListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\AudiencesList200Response
    {
        return $this->getSuccessfulContent(...$this->audiencesList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region audiencesUpdate
    /**
     * Update audience
     * @param \App\DTO\AudiencesUpdateParameterData $parameters
     * @param \App\DTO\AudienceUpdateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function audiencesUpdateRaw(
        \App\DTO\AudiencesUpdateParameterData $parameters,
        \App\DTO\AudienceUpdateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('PATCH', '/ad_accounts/{ad_account_id}/audiences/{audience_id}', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update audience
     * @param \App\DTO\AudiencesUpdateParameterData $parameters
     * @param \App\DTO\AudienceUpdateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function audiencesUpdate(
        \App\DTO\AudiencesUpdateParameterData $parameters,
        \App\DTO\AudienceUpdateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->audiencesUpdateRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\Audience();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update audience
     * @param \App\DTO\AudiencesUpdateParameterData $parameters
     * @param \App\DTO\AudienceUpdateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\Audience
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function audiencesUpdateResult(
        \App\DTO\AudiencesUpdateParameterData $parameters,
        \App\DTO\AudienceUpdateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\Audience
    {
        return $this->getSuccessfulContent(...$this->audiencesUpdate($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region billingProfilesGet
    /**
     * Get billing profiles
     * @param \App\DTO\BillingProfilesGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function billingProfilesGetRaw(
        \App\DTO\BillingProfilesGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', 'billing:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/billing_profiles', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get billing profiles
     * @param \App\DTO\BillingProfilesGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function billingProfilesGet(
        \App\DTO\BillingProfilesGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', 'billing:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->billingProfilesGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\BillingProfilesGet200Response();
                break;
            default:
                /* Unexpected error. */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get billing profiles
     * @param \App\DTO\BillingProfilesGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\BillingProfilesGet200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function billingProfilesGetResult(
        \App\DTO\BillingProfilesGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', 'billing:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\BillingProfilesGet200Response
    {
        return $this->getSuccessfulContent(...$this->billingProfilesGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region boardSectionsCreate
    /**
     * Create board section
     * @param \App\DTO\BoardSectionsCreateParameterData $parameters
     * @param \App\DTO\BoardSection $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function boardSectionsCreateRaw(
        \App\DTO\BoardSectionsCreateParameterData $parameters,
        \App\DTO\BoardSection $requestContent,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/boards/{board_id}/sections', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create board section
     * @param \App\DTO\BoardSectionsCreateParameterData $parameters
     * @param \App\DTO\BoardSection $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function boardSectionsCreate(
        \App\DTO\BoardSectionsCreateParameterData $parameters,
        \App\DTO\BoardSection $requestContent,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->boardSectionsCreateRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 201:
                /* response */
                $responseContent = new \App\DTO\BoardSection();
                break;
            case 400:
                /* Invalid board section parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            case 403:
                /* Not authorized to create board sections. */
                $responseContent = new \App\DTO\Error();
                break;
            case 409:
                /* Could not get exclusive access to the board to create a new section. */
                $responseContent = new \App\DTO\Error();
                break;
            case 500:
                /* Could not create a new board section. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create board section
     * @param \App\DTO\BoardSectionsCreateParameterData $parameters
     * @param \App\DTO\BoardSection $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\BoardSection
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function boardSectionsCreateResult(
        \App\DTO\BoardSectionsCreateParameterData $parameters,
        \App\DTO\BoardSection $requestContent,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\BoardSection
    {
        return $this->getSuccessfulContent(...$this->boardSectionsCreate($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region boardSectionsDelete
    /**
     * Delete board section
     * @param \App\DTO\BoardSectionsDeleteParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function boardSectionsDeleteRaw(
        \App\DTO\BoardSectionsDeleteParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:write', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/boards/{board_id}/sections/{section_id}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete board section
     * @param \App\DTO\BoardSectionsDeleteParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function boardSectionsDelete(
        \App\DTO\BoardSectionsDeleteParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:write', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->boardSectionsDeleteRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 204:
                /* Board section deleted successfully */
                break;
            case 403:
                /* Not authorized to delete board section. */
                $responseContent = new \App\DTO\Error();
                break;
            case 404:
                /* Board section not found. */
                $responseContent = new \App\DTO\Error();
                break;
            case 409:
                /* Board section conflict. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete board section
     * @param \App\DTO\BoardSectionsDeleteParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function boardSectionsDeleteResult(
        \App\DTO\BoardSectionsDeleteParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:write', ]],
        string $responseMediaType = 'application/json'
    )
    {
        return $this->getSuccessfulContent(...$this->boardSectionsDelete($parameters, $security, $responseMediaType));
    }
    //endregion

    //region boardSectionsList
    /**
     * List board sections
     * @param \App\DTO\BoardSectionsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function boardSectionsListRaw(
        \App\DTO\BoardSectionsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/boards/{board_id}/sections', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List board sections
     * @param \App\DTO\BoardSectionsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function boardSectionsList(
        \App\DTO\BoardSectionsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->boardSectionsListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* response */
                $responseContent = new \App\DTO\BoardSectionsList200Response();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List board sections
     * @param \App\DTO\BoardSectionsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\BoardSectionsList200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function boardSectionsListResult(
        \App\DTO\BoardSectionsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\BoardSectionsList200Response
    {
        return $this->getSuccessfulContent(...$this->boardSectionsList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region boardSectionsListPins
    /**
     * List Pins on board section
     * @param \App\DTO\BoardSectionsListPinsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function boardSectionsListPinsRaw(
        \App\DTO\BoardSectionsListPinsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'pins:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/boards/{board_id}/sections/{section_id}/pins', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List Pins on board section
     * @param \App\DTO\BoardSectionsListPinsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function boardSectionsListPins(
        \App\DTO\BoardSectionsListPinsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'pins:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->boardSectionsListPinsRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* response */
                $responseContent = new \App\DTO\BoardsListPins200Response();
                break;
            case 403:
                /* Not authorized to access Pins on board section. */
                $responseContent = new \App\DTO\Error();
                break;
            case 404:
                /* Board or section not found. */
                $responseContent = new \App\DTO\Error();
                break;
            case 409:
                /* Board section conflict. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List Pins on board section
     * @param \App\DTO\BoardSectionsListPinsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\BoardsListPins200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function boardSectionsListPinsResult(
        \App\DTO\BoardSectionsListPinsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'pins:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\BoardsListPins200Response
    {
        return $this->getSuccessfulContent(...$this->boardSectionsListPins($parameters, $security, $responseMediaType));
    }
    //endregion

    //region boardSectionsUpdate
    /**
     * Update board section
     * @param \App\DTO\BoardSectionsUpdateParameterData $parameters
     * @param \App\DTO\BoardSection $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function boardSectionsUpdateRaw(
        \App\DTO\BoardSectionsUpdateParameterData $parameters,
        \App\DTO\BoardSection $requestContent,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('PATCH', '/boards/{board_id}/sections/{section_id}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update board section
     * @param \App\DTO\BoardSectionsUpdateParameterData $parameters
     * @param \App\DTO\BoardSection $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function boardSectionsUpdate(
        \App\DTO\BoardSectionsUpdateParameterData $parameters,
        \App\DTO\BoardSection $requestContent,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->boardSectionsUpdateRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* response */
                $responseContent = new \App\DTO\BoardSection();
                break;
            case 400:
                /* Invalid board section parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            case 403:
                /* Not authorized to update board section. */
                $responseContent = new \App\DTO\Error();
                break;
            case 409:
                /* Board section conflict. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update board section
     * @param \App\DTO\BoardSectionsUpdateParameterData $parameters
     * @param \App\DTO\BoardSection $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\BoardSection
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function boardSectionsUpdateResult(
        \App\DTO\BoardSectionsUpdateParameterData $parameters,
        \App\DTO\BoardSection $requestContent,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\BoardSection
    {
        return $this->getSuccessfulContent(...$this->boardSectionsUpdate($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region boardsCreate
    /**
     * Create board
     * @param \App\DTO\BoardsCreateParameterData $parameters
     * @param \App\DTO\Board $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function boardsCreateRaw(
        \App\DTO\BoardsCreateParameterData $parameters,
        \App\DTO\Board $requestContent,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/boards', [], $this->getQueryParameters($parameters));
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create board
     * @param \App\DTO\BoardsCreateParameterData $parameters
     * @param \App\DTO\Board $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function boardsCreate(
        \App\DTO\BoardsCreateParameterData $parameters,
        \App\DTO\Board $requestContent,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->boardsCreateRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 201:
                /* response */
                $responseContent = new \App\DTO\Board();
                break;
            case 400:
                /* The board name is invalid or duplicated. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create board
     * @param \App\DTO\BoardsCreateParameterData $parameters
     * @param \App\DTO\Board $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\Board
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function boardsCreateResult(
        \App\DTO\BoardsCreateParameterData $parameters,
        \App\DTO\Board $requestContent,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\Board
    {
        return $this->getSuccessfulContent(...$this->boardsCreate($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region boardsDelete
    /**
     * Delete board
     * @param \App\DTO\BoardsDeleteParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function boardsDeleteRaw(
        \App\DTO\BoardsDeleteParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:write', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/boards/{board_id}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete board
     * @param \App\DTO\BoardsDeleteParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function boardsDelete(
        \App\DTO\BoardsDeleteParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:write', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->boardsDeleteRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 204:
                /* Board deleted successfully */
                break;
            case 403:
                /* Not authorized to delete the board. */
                $responseContent = new \App\DTO\Error();
                break;
            case 404:
                /* Board not found. */
                $responseContent = new \App\DTO\Error();
                break;
            case 409:
                /* Could not get exclusive access to delete the board. */
                $responseContent = new \App\DTO\Error();
                break;
            case 429:
                /* This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete board
     * @param \App\DTO\BoardsDeleteParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function boardsDeleteResult(
        \App\DTO\BoardsDeleteParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:write', ]],
        string $responseMediaType = 'application/json'
    )
    {
        return $this->getSuccessfulContent(...$this->boardsDelete($parameters, $security, $responseMediaType));
    }
    //endregion

    //region boardsGet
    /**
     * Get board
     * @param \App\DTO\BoardsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function boardsGetRaw(
        \App\DTO\BoardsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/boards/{board_id}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get board
     * @param \App\DTO\BoardsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function boardsGet(
        \App\DTO\BoardsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->boardsGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* response */
                $responseContent = new \App\DTO\Board();
                break;
            case 404:
                /* Board not found. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get board
     * @param \App\DTO\BoardsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\Board
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function boardsGetResult(
        \App\DTO\BoardsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\Board
    {
        return $this->getSuccessfulContent(...$this->boardsGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region boardsList
    /**
     * List boards
     * @param \App\DTO\BoardsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function boardsListRaw(
        \App\DTO\BoardsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/boards', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List boards
     * @param \App\DTO\BoardsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function boardsList(
        \App\DTO\BoardsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->boardsListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* response */
                $responseContent = new \App\DTO\BoardsList200Response();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List boards
     * @param \App\DTO\BoardsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\BoardsList200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function boardsListResult(
        \App\DTO\BoardsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\BoardsList200Response
    {
        return $this->getSuccessfulContent(...$this->boardsList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region boardsListPins
    /**
     * List Pins on board
     * @param \App\DTO\BoardsListPinsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function boardsListPinsRaw(
        \App\DTO\BoardsListPinsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'pins:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/boards/{board_id}/pins', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List Pins on board
     * @param \App\DTO\BoardsListPinsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function boardsListPins(
        \App\DTO\BoardsListPinsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'pins:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->boardsListPinsRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* response */
                $responseContent = new \App\DTO\BoardsListPins200Response();
                break;
            case 404:
                /* Board not found. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List Pins on board
     * @param \App\DTO\BoardsListPinsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\BoardsListPins200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function boardsListPinsResult(
        \App\DTO\BoardsListPinsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'pins:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\BoardsListPins200Response
    {
        return $this->getSuccessfulContent(...$this->boardsListPins($parameters, $security, $responseMediaType));
    }
    //endregion

    //region boardsUpdate
    /**
     * Update board
     * @param \App\DTO\BoardsUpdateParameterData $parameters
     * @param \App\DTO\BoardUpdate $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function boardsUpdateRaw(
        \App\DTO\BoardsUpdateParameterData $parameters,
        \App\DTO\BoardUpdate $requestContent,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('PATCH', '/boards/{board_id}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update board
     * @param \App\DTO\BoardsUpdateParameterData $parameters
     * @param \App\DTO\BoardUpdate $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function boardsUpdate(
        \App\DTO\BoardsUpdateParameterData $parameters,
        \App\DTO\BoardUpdate $requestContent,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->boardsUpdateRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* response */
                $responseContent = new \App\DTO\Board();
                break;
            case 400:
                /* Invalid board parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            case 403:
                /* Not authorized to update the board. */
                $responseContent = new \App\DTO\Error();
                break;
            case 429:
                /* This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update board
     * @param \App\DTO\BoardsUpdateParameterData $parameters
     * @param \App\DTO\BoardUpdate $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\Board
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function boardsUpdateResult(
        \App\DTO\BoardsUpdateParameterData $parameters,
        \App\DTO\BoardUpdate $requestContent,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\Board
    {
        return $this->getSuccessfulContent(...$this->boardsUpdate($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region boardsUserFollowsList
    /**
     * List following boards
     * @param \App\DTO\BoardsUserFollowsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function boardsUserFollowsListRaw(
        \App\DTO\BoardsUserFollowsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['user_accounts:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/user_account/following/boards', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List following boards
     * @param \App\DTO\BoardsUserFollowsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function boardsUserFollowsList(
        \App\DTO\BoardsUserFollowsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['user_accounts:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->boardsUserFollowsListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\BoardsUserFollowsList200Response();
                break;
            case 400:
                /* Invalid user id */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List following boards
     * @param \App\DTO\BoardsUserFollowsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\BoardsUserFollowsList200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function boardsUserFollowsListResult(
        \App\DTO\BoardsUserFollowsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['user_accounts:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\BoardsUserFollowsList200Response
    {
        return $this->getSuccessfulContent(...$this->boardsUserFollowsList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region bulkDownloadCreate
    /**
     * Get advertiser entities in bulk
     * @param \App\DTO\BulkDownloadCreateParameterData $parameters
     * @param \App\DTO\BulkDownloadRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function bulkDownloadCreateRaw(
        \App\DTO\BulkDownloadCreateParameterData $parameters,
        \App\DTO\BulkDownloadRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/ad_accounts/{ad_account_id}/bulk/download', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get advertiser entities in bulk
     * @param \App\DTO\BulkDownloadCreateParameterData $parameters
     * @param \App\DTO\BulkDownloadRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function bulkDownloadCreate(
        \App\DTO\BulkDownloadCreateParameterData $parameters,
        \App\DTO\BulkDownloadRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->bulkDownloadCreateRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\BulkDownloadResponse();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get advertiser entities in bulk
     * @param \App\DTO\BulkDownloadCreateParameterData $parameters
     * @param \App\DTO\BulkDownloadRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\BulkDownloadResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function bulkDownloadCreateResult(
        \App\DTO\BulkDownloadCreateParameterData $parameters,
        \App\DTO\BulkDownloadRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\BulkDownloadResponse
    {
        return $this->getSuccessfulContent(...$this->bulkDownloadCreate($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region bulkRequestGet
    /**
     * Download advertiser entities in bulk
     * @param \App\DTO\BulkRequestGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function bulkRequestGetRaw(
        \App\DTO\BulkRequestGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/bulk/{bulk_request_id}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Download advertiser entities in bulk
     * @param \App\DTO\BulkRequestGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function bulkRequestGet(
        \App\DTO\BulkRequestGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->bulkRequestGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\BulkUpsertStatusResponse();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Download advertiser entities in bulk
     * @param \App\DTO\BulkRequestGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\BulkUpsertStatusResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function bulkRequestGetResult(
        \App\DTO\BulkRequestGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\BulkUpsertStatusResponse
    {
        return $this->getSuccessfulContent(...$this->bulkRequestGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region bulkUpsertCreate
    /**
     * Create/update ad entities in bulk
     * @param \App\DTO\BulkUpsertCreateParameterData $parameters
     * @param \App\DTO\BulkUpsertRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function bulkUpsertCreateRaw(
        \App\DTO\BulkUpsertCreateParameterData $parameters,
        \App\DTO\BulkUpsertRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/ad_accounts/{ad_account_id}/bulk/upsert', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create/update ad entities in bulk
     * @param \App\DTO\BulkUpsertCreateParameterData $parameters
     * @param \App\DTO\BulkUpsertRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function bulkUpsertCreate(
        \App\DTO\BulkUpsertCreateParameterData $parameters,
        \App\DTO\BulkUpsertRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->bulkUpsertCreateRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\BulkUpsertResponse();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create/update ad entities in bulk
     * @param \App\DTO\BulkUpsertCreateParameterData $parameters
     * @param \App\DTO\BulkUpsertRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\BulkUpsertResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function bulkUpsertCreateResult(
        \App\DTO\BulkUpsertCreateParameterData $parameters,
        \App\DTO\BulkUpsertRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\BulkUpsertResponse
    {
        return $this->getSuccessfulContent(...$this->bulkUpsertCreate($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region campaignTargetingAnalyticsGet
    /**
     * Get targeting analytics for campaigns
     * @param \App\DTO\CampaignTargetingAnalyticsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function campaignTargetingAnalyticsGetRaw(
        \App\DTO\CampaignTargetingAnalyticsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/campaigns/targeting_analytics', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get targeting analytics for campaigns
     * @param \App\DTO\CampaignTargetingAnalyticsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function campaignTargetingAnalyticsGet(
        \App\DTO\CampaignTargetingAnalyticsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->campaignTargetingAnalyticsGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\MetricsResponse();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get targeting analytics for campaigns
     * @param \App\DTO\CampaignTargetingAnalyticsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\MetricsResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function campaignTargetingAnalyticsGetResult(
        \App\DTO\CampaignTargetingAnalyticsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\MetricsResponse
    {
        return $this->getSuccessfulContent(...$this->campaignTargetingAnalyticsGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region campaignsAnalytics
    /**
     * Get campaign analytics
     * @param \App\DTO\CampaignsAnalyticsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function campaignsAnalyticsRaw(
        \App\DTO\CampaignsAnalyticsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/campaigns/analytics', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get campaign analytics
     * @param \App\DTO\CampaignsAnalyticsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function campaignsAnalytics(
        \App\DTO\CampaignsAnalyticsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->campaignsAnalyticsRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\Collection91();
                break;
            case 400:
                /* Invalid ad account campaign analytics parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get campaign analytics
     * @param \App\DTO\CampaignsAnalyticsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\Collection91
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function campaignsAnalyticsResult(
        \App\DTO\CampaignsAnalyticsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\Collection91
    {
        return $this->getSuccessfulContent(...$this->campaignsAnalytics($parameters, $security, $responseMediaType));
    }
    //endregion

    //region campaignsCreate
    /**
     * Create campaigns
     * @param \App\DTO\CampaignsCreateParameterData $parameters
     * @param \App\DTO\Collection84 $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function campaignsCreateRaw(
        \App\DTO\CampaignsCreateParameterData $parameters,
        \App\DTO\Collection84 $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/ad_accounts/{ad_account_id}/campaigns', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create campaigns
     * @param \App\DTO\CampaignsCreateParameterData $parameters
     * @param \App\DTO\Collection84 $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function campaignsCreate(
        \App\DTO\CampaignsCreateParameterData $parameters,
        \App\DTO\Collection84 $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->campaignsCreateRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* response */
                $responseContent = new \App\DTO\CampaignCreateResponse();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create campaigns
     * @param \App\DTO\CampaignsCreateParameterData $parameters
     * @param \App\DTO\Collection84 $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\CampaignCreateResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function campaignsCreateResult(
        \App\DTO\CampaignsCreateParameterData $parameters,
        \App\DTO\Collection84 $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\CampaignCreateResponse
    {
        return $this->getSuccessfulContent(...$this->campaignsCreate($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region campaignsGet
    /**
     * Get campaign
     * @param \App\DTO\CampaignsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function campaignsGetRaw(
        \App\DTO\CampaignsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/campaigns/{campaign_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get campaign
     * @param \App\DTO\CampaignsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function campaignsGet(
        \App\DTO\CampaignsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->campaignsGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\CampaignResponse();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get campaign
     * @param \App\DTO\CampaignsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\CampaignResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function campaignsGetResult(
        \App\DTO\CampaignsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\CampaignResponse
    {
        return $this->getSuccessfulContent(...$this->campaignsGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region campaignsList
    /**
     * List campaigns
     * @param \App\DTO\CampaignsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function campaignsListRaw(
        \App\DTO\CampaignsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/campaigns', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List campaigns
     * @param \App\DTO\CampaignsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function campaignsList(
        \App\DTO\CampaignsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->campaignsListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\CampaignsList200Response();
                break;
            case 400:
                /* Invalid ad account campaign parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List campaigns
     * @param \App\DTO\CampaignsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\CampaignsList200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function campaignsListResult(
        \App\DTO\CampaignsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\CampaignsList200Response
    {
        return $this->getSuccessfulContent(...$this->campaignsList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region campaignsUpdate
    /**
     * Update campaigns
     * @param \App\DTO\CampaignsUpdateParameterData $parameters
     * @param \App\DTO\Collection87 $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function campaignsUpdateRaw(
        \App\DTO\CampaignsUpdateParameterData $parameters,
        \App\DTO\Collection87 $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('PATCH', '/ad_accounts/{ad_account_id}/campaigns', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update campaigns
     * @param \App\DTO\CampaignsUpdateParameterData $parameters
     * @param \App\DTO\Collection87 $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function campaignsUpdate(
        \App\DTO\CampaignsUpdateParameterData $parameters,
        \App\DTO\Collection87 $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->campaignsUpdateRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* response */
                $responseContent = new \App\DTO\CampaignUpdateResponse();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update campaigns
     * @param \App\DTO\CampaignsUpdateParameterData $parameters
     * @param \App\DTO\Collection87 $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\CampaignUpdateResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function campaignsUpdateResult(
        \App\DTO\CampaignsUpdateParameterData $parameters,
        \App\DTO\Collection87 $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\CampaignUpdateResponse
    {
        return $this->getSuccessfulContent(...$this->campaignsUpdate($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region catalogsList
    /**
     * List catalogs
     * @param \App\DTO\CatalogsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function catalogsListRaw(
        \App\DTO\CatalogsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/catalogs', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List catalogs
     * @param \App\DTO\CatalogsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function catalogsList(
        \App\DTO\CatalogsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->catalogsListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\CatalogsList200Response();
                break;
            case 400:
                /* Invalid parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            case 401:
                /* Unauthorized access. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error. */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List catalogs
     * @param \App\DTO\CatalogsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\CatalogsList200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function catalogsListResult(
        \App\DTO\CatalogsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\CatalogsList200Response
    {
        return $this->getSuccessfulContent(...$this->catalogsList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region catalogsProductGroupPinsList
    /**
     * List products for a Product Group
     * @param \App\DTO\CatalogsProductGroupPinsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function catalogsProductGroupPinsListRaw(
        \App\DTO\CatalogsProductGroupPinsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'catalogs:read', 'pins:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/catalogs/product_groups/{product_group_id}/products', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List products for a Product Group
     * @param \App\DTO\CatalogsProductGroupPinsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function catalogsProductGroupPinsList(
        \App\DTO\CatalogsProductGroupPinsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'catalogs:read', 'pins:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->catalogsProductGroupPinsListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\CatalogsProductGroupPinsList200Response();
                break;
            case 400:
                /* Invalid parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            case 401:
                /* Unauthorized access. */
                $responseContent = new \App\DTO\Error();
                break;
            case 404:
                /* Catalogs product group not found. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error. */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List products for a Product Group
     * @param \App\DTO\CatalogsProductGroupPinsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\CatalogsProductGroupPinsList200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function catalogsProductGroupPinsListResult(
        \App\DTO\CatalogsProductGroupPinsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'catalogs:read', 'pins:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\CatalogsProductGroupPinsList200Response
    {
        return $this->getSuccessfulContent(...$this->catalogsProductGroupPinsList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region catalogsProductGroupsCreate
    /**
     * Create product group
     * @param \App\DTO\CatalogsProductGroupsCreateParameterData $parameters
     * @param \App\DTO\CatalogsProductGroupsCreateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function catalogsProductGroupsCreateRaw(
        \App\DTO\CatalogsProductGroupsCreateParameterData $parameters,
        \App\DTO\CatalogsProductGroupsCreateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['catalogs:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/catalogs/product_groups', [], $this->getQueryParameters($parameters));
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create product group
     * @param \App\DTO\CatalogsProductGroupsCreateParameterData $parameters
     * @param \App\DTO\CatalogsProductGroupsCreateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function catalogsProductGroupsCreate(
        \App\DTO\CatalogsProductGroupsCreateParameterData $parameters,
        \App\DTO\CatalogsProductGroupsCreateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['catalogs:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->catalogsProductGroupsCreateRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 201:
                /* Success */
                $responseContent = new \App\DTO\CatalogsProductGroupsCreate201Response();
                break;
            case 400:
                /* Invalid body. */
                $responseContent = new \App\DTO\Error();
                break;
            case 401:
                /* Unauthorized access. */
                $responseContent = new \App\DTO\Error();
                break;
            case 403:
                /* Forbidden. Account not approved for catalog product group mutations yet. */
                $responseContent = new \App\DTO\Error();
                break;
            case 409:
                /* Conflict. Can't create this catalogs product group with this value. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error. */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create product group
     * @param \App\DTO\CatalogsProductGroupsCreateParameterData $parameters
     * @param \App\DTO\CatalogsProductGroupsCreateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\CatalogsProductGroupsCreate201Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function catalogsProductGroupsCreateResult(
        \App\DTO\CatalogsProductGroupsCreateParameterData $parameters,
        \App\DTO\CatalogsProductGroupsCreateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['catalogs:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\CatalogsProductGroupsCreate201Response
    {
        return $this->getSuccessfulContent(...$this->catalogsProductGroupsCreate($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region catalogsProductGroupsDelete
    /**
     * Delete product group
     * @param \App\DTO\CatalogsProductGroupsDeleteParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function catalogsProductGroupsDeleteRaw(
        \App\DTO\CatalogsProductGroupsDeleteParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['catalogs:write', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/catalogs/product_groups/{product_group_id}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete product group
     * @param \App\DTO\CatalogsProductGroupsDeleteParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function catalogsProductGroupsDelete(
        \App\DTO\CatalogsProductGroupsDeleteParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['catalogs:write', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->catalogsProductGroupsDeleteRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 204:
                /* Catalogs Product Group deleted successfully. */
                break;
            case 400:
                /* Invalid catalogs product group id parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            case 401:
                /* Unauthorized access. */
                $responseContent = new \App\DTO\Error();
                break;
            case 403:
                /* Forbidden. Account not approved for catalog product group mutations yet. */
                $responseContent = new \App\DTO\Error();
                break;
            case 404:
                /* Catalogs product group not found. */
                $responseContent = new \App\DTO\Error();
                break;
            case 409:
                /* Conflict. Can't delete this catalogs product group. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error. */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete product group
     * @param \App\DTO\CatalogsProductGroupsDeleteParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function catalogsProductGroupsDeleteResult(
        \App\DTO\CatalogsProductGroupsDeleteParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['catalogs:write', ]],
        string $responseMediaType = 'application/json'
    )
    {
        return $this->getSuccessfulContent(...$this->catalogsProductGroupsDelete($parameters, $security, $responseMediaType));
    }
    //endregion

    //region catalogsProductGroupsGet
    /**
     * Get product group
     * @param \App\DTO\CatalogsProductGroupsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function catalogsProductGroupsGetRaw(
        \App\DTO\CatalogsProductGroupsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/catalogs/product_groups/{product_group_id}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get product group
     * @param \App\DTO\CatalogsProductGroupsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function catalogsProductGroupsGet(
        \App\DTO\CatalogsProductGroupsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->catalogsProductGroupsGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\CatalogsProductGroupsCreate201Response();
                break;
            case 400:
                /* Invalid catalogs product group id parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            case 401:
                /* Unauthorized access. */
                $responseContent = new \App\DTO\Error();
                break;
            case 403:
                /* Forbidden. Account not approved for catalog product group mutations yet. */
                $responseContent = new \App\DTO\Error();
                break;
            case 404:
                /* Catalogs product group not found. */
                $responseContent = new \App\DTO\Error();
                break;
            case 409:
                /* Conflict. Can't get a catalogs product group without an existing catalog. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error. */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get product group
     * @param \App\DTO\CatalogsProductGroupsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\CatalogsProductGroupsCreate201Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function catalogsProductGroupsGetResult(
        \App\DTO\CatalogsProductGroupsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\CatalogsProductGroupsCreate201Response
    {
        return $this->getSuccessfulContent(...$this->catalogsProductGroupsGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region catalogsProductGroupsList
    /**
     * List product groups
     * @param \App\DTO\CatalogsProductGroupsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function catalogsProductGroupsListRaw(
        \App\DTO\CatalogsProductGroupsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/catalogs/product_groups', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List product groups
     * @param \App\DTO\CatalogsProductGroupsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function catalogsProductGroupsList(
        \App\DTO\CatalogsProductGroupsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->catalogsProductGroupsListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\CatalogsProductGroupsList200Response();
                break;
            case 400:
                /* Invalid feed parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            case 401:
                /* Unauthorized access. */
                $responseContent = new \App\DTO\Error();
                break;
            case 403:
                /* Forbidden. Account not approved for catalog product group mutations yet. */
                $responseContent = new \App\DTO\Error();
                break;
            case 404:
                /* Data feed not found. */
                $responseContent = new \App\DTO\Error();
                break;
            case 409:
                /* Conflict. Can't create this catalogs product group with this value. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error. */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List product groups
     * @param \App\DTO\CatalogsProductGroupsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\CatalogsProductGroupsList200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function catalogsProductGroupsListResult(
        \App\DTO\CatalogsProductGroupsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\CatalogsProductGroupsList200Response
    {
        return $this->getSuccessfulContent(...$this->catalogsProductGroupsList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region catalogsProductGroupsProductCountsGet
    /**
     * Get product counts for a Product Group
     * @param \App\DTO\CatalogsProductGroupsProductCountsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function catalogsProductGroupsProductCountsGetRaw(
        \App\DTO\CatalogsProductGroupsProductCountsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/catalogs/product_groups/{product_group_id}/product_counts', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get product counts for a Product Group
     * @param \App\DTO\CatalogsProductGroupsProductCountsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function catalogsProductGroupsProductCountsGet(
        \App\DTO\CatalogsProductGroupsProductCountsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->catalogsProductGroupsProductCountsGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\CatalogsProductGroupProductCounts();
                break;
            case 404:
                /* Product Group Not Found. */
                $responseContent = new \App\DTO\Error();
                break;
            case 409:
                /* Can't access this feature without an existing catalog. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error. */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get product counts for a Product Group
     * @param \App\DTO\CatalogsProductGroupsProductCountsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\CatalogsProductGroupProductCounts
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function catalogsProductGroupsProductCountsGetResult(
        \App\DTO\CatalogsProductGroupsProductCountsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\CatalogsProductGroupProductCounts
    {
        return $this->getSuccessfulContent(...$this->catalogsProductGroupsProductCountsGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region catalogsProductGroupsUpdate
    /**
     * Update product group
     * @param \App\DTO\CatalogsProductGroupsUpdateParameterData $parameters
     * @param \App\DTO\CatalogsProductGroupsUpdateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function catalogsProductGroupsUpdateRaw(
        \App\DTO\CatalogsProductGroupsUpdateParameterData $parameters,
        \App\DTO\CatalogsProductGroupsUpdateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['catalogs:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('PATCH', '/catalogs/product_groups/{product_group_id}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update product group
     * @param \App\DTO\CatalogsProductGroupsUpdateParameterData $parameters
     * @param \App\DTO\CatalogsProductGroupsUpdateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function catalogsProductGroupsUpdate(
        \App\DTO\CatalogsProductGroupsUpdateParameterData $parameters,
        \App\DTO\CatalogsProductGroupsUpdateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['catalogs:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->catalogsProductGroupsUpdateRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\CatalogsProductGroupsCreate201Response();
                break;
            case 400:
                /* Invalid parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            case 401:
                /* Unauthorized access. */
                $responseContent = new \App\DTO\Error();
                break;
            case 403:
                /* Forbidden. Account not approved for catalog product group mutations yet. */
                $responseContent = new \App\DTO\Error();
                break;
            case 404:
                /* Catalogs product group not found. */
                $responseContent = new \App\DTO\Error();
                break;
            case 409:
                /* Conflict. Can't update this catalogs product group to this value. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error. */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update product group
     * @param \App\DTO\CatalogsProductGroupsUpdateParameterData $parameters
     * @param \App\DTO\CatalogsProductGroupsUpdateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\CatalogsProductGroupsCreate201Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function catalogsProductGroupsUpdateResult(
        \App\DTO\CatalogsProductGroupsUpdateParameterData $parameters,
        \App\DTO\CatalogsProductGroupsUpdateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['catalogs:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\CatalogsProductGroupsCreate201Response
    {
        return $this->getSuccessfulContent(...$this->catalogsProductGroupsUpdate($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region conversionTagsCreate
    /**
     * Create conversion tag
     * @param \App\DTO\ConversionTagsCreateParameterData $parameters
     * @param \App\DTO\ConversionTagCreate $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function conversionTagsCreateRaw(
        \App\DTO\ConversionTagsCreateParameterData $parameters,
        \App\DTO\ConversionTagCreate $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/ad_accounts/{ad_account_id}/conversion_tags', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create conversion tag
     * @param \App\DTO\ConversionTagsCreateParameterData $parameters
     * @param \App\DTO\ConversionTagCreate $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function conversionTagsCreate(
        \App\DTO\ConversionTagsCreateParameterData $parameters,
        \App\DTO\ConversionTagCreate $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->conversionTagsCreateRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\ConversionTagResponse();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create conversion tag
     * @param \App\DTO\ConversionTagsCreateParameterData $parameters
     * @param \App\DTO\ConversionTagCreate $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\ConversionTagResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function conversionTagsCreateResult(
        \App\DTO\ConversionTagsCreateParameterData $parameters,
        \App\DTO\ConversionTagCreate $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\ConversionTagResponse
    {
        return $this->getSuccessfulContent(...$this->conversionTagsCreate($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region conversionTagsGet
    /**
     * Get conversion tag
     * @param \App\DTO\ConversionTagsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function conversionTagsGetRaw(
        \App\DTO\ConversionTagsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get conversion tag
     * @param \App\DTO\ConversionTagsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function conversionTagsGet(
        \App\DTO\ConversionTagsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->conversionTagsGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\ConversionTagResponse();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get conversion tag
     * @param \App\DTO\ConversionTagsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ConversionTagResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function conversionTagsGetResult(
        \App\DTO\ConversionTagsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ConversionTagResponse
    {
        return $this->getSuccessfulContent(...$this->conversionTagsGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region conversionTagsList
    /**
     * Get conversion tags
     * @param \App\DTO\ConversionTagsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function conversionTagsListRaw(
        \App\DTO\ConversionTagsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/conversion_tags', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get conversion tags
     * @param \App\DTO\ConversionTagsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function conversionTagsList(
        \App\DTO\ConversionTagsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->conversionTagsListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\ConversionTagListResponse();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get conversion tags
     * @param \App\DTO\ConversionTagsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ConversionTagListResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function conversionTagsListResult(
        \App\DTO\ConversionTagsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ConversionTagListResponse
    {
        return $this->getSuccessfulContent(...$this->conversionTagsList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region countryKeywordsMetricsGet
    /**
     * Get country's keyword metrics
     * @param \App\DTO\CountryKeywordsMetricsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function countryKeywordsMetricsGetRaw(
        \App\DTO\CountryKeywordsMetricsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/keywords/metrics', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get country's keyword metrics
     * @param \App\DTO\CountryKeywordsMetricsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function countryKeywordsMetricsGet(
        \App\DTO\CountryKeywordsMetricsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->countryKeywordsMetricsGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\KeywordsMetricsArrayResponse();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get country's keyword metrics
     * @param \App\DTO\CountryKeywordsMetricsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\KeywordsMetricsArrayResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function countryKeywordsMetricsGetResult(
        \App\DTO\CountryKeywordsMetricsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\KeywordsMetricsArrayResponse
    {
        return $this->getSuccessfulContent(...$this->countryKeywordsMetricsGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region customerListsCreate
    /**
     * Create customer lists
     * @param \App\DTO\CustomerListsCreateParameterData $parameters
     * @param \App\DTO\CustomerListRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function customerListsCreateRaw(
        \App\DTO\CustomerListsCreateParameterData $parameters,
        \App\DTO\CustomerListRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/ad_accounts/{ad_account_id}/customer_lists', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create customer lists
     * @param \App\DTO\CustomerListsCreateParameterData $parameters
     * @param \App\DTO\CustomerListRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function customerListsCreate(
        \App\DTO\CustomerListsCreateParameterData $parameters,
        \App\DTO\CustomerListRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->customerListsCreateRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\CustomerList();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create customer lists
     * @param \App\DTO\CustomerListsCreateParameterData $parameters
     * @param \App\DTO\CustomerListRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\CustomerList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function customerListsCreateResult(
        \App\DTO\CustomerListsCreateParameterData $parameters,
        \App\DTO\CustomerListRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\CustomerList
    {
        return $this->getSuccessfulContent(...$this->customerListsCreate($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region customerListsGet
    /**
     * Get customer list
     * @param \App\DTO\CustomerListsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function customerListsGetRaw(
        \App\DTO\CustomerListsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get customer list
     * @param \App\DTO\CustomerListsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function customerListsGet(
        \App\DTO\CustomerListsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->customerListsGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\CustomerList();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get customer list
     * @param \App\DTO\CustomerListsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\CustomerList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function customerListsGetResult(
        \App\DTO\CustomerListsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\CustomerList
    {
        return $this->getSuccessfulContent(...$this->customerListsGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region customerListsList
    /**
     * Get customer lists
     * @param \App\DTO\CustomerListsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function customerListsListRaw(
        \App\DTO\CustomerListsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/customer_lists', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get customer lists
     * @param \App\DTO\CustomerListsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function customerListsList(
        \App\DTO\CustomerListsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->customerListsListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\CustomerListsList200Response();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get customer lists
     * @param \App\DTO\CustomerListsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\CustomerListsList200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function customerListsListResult(
        \App\DTO\CustomerListsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\CustomerListsList200Response
    {
        return $this->getSuccessfulContent(...$this->customerListsList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region customerListsUpdate
    /**
     * Update customer list
     * @param \App\DTO\CustomerListsUpdateParameterData $parameters
     * @param \App\DTO\CustomerListUpdateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function customerListsUpdateRaw(
        \App\DTO\CustomerListsUpdateParameterData $parameters,
        \App\DTO\CustomerListUpdateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('PATCH', '/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update customer list
     * @param \App\DTO\CustomerListsUpdateParameterData $parameters
     * @param \App\DTO\CustomerListUpdateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function customerListsUpdate(
        \App\DTO\CustomerListsUpdateParameterData $parameters,
        \App\DTO\CustomerListUpdateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->customerListsUpdateRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\CustomerList();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update customer list
     * @param \App\DTO\CustomerListsUpdateParameterData $parameters
     * @param \App\DTO\CustomerListUpdateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\CustomerList
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function customerListsUpdateResult(
        \App\DTO\CustomerListsUpdateParameterData $parameters,
        \App\DTO\CustomerListUpdateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\CustomerList
    {
        return $this->getSuccessfulContent(...$this->customerListsUpdate($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region deliveryMetricsGet
    /**
     * Get available metrics' definitions
     * @param \App\DTO\DeliveryMetricsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function deliveryMetricsGetRaw(
        \App\DTO\DeliveryMetricsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', 'pins:read', 'user_accounts:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/resources/delivery_metrics', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get available metrics' definitions
     * @param \App\DTO\DeliveryMetricsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function deliveryMetricsGet(
        \App\DTO\DeliveryMetricsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', 'pins:read', 'user_accounts:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->deliveryMetricsGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\DeliveryMetricsResponse();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get available metrics' definitions
     * @param \App\DTO\DeliveryMetricsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\DeliveryMetricsResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function deliveryMetricsGetResult(
        \App\DTO\DeliveryMetricsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', 'pins:read', 'user_accounts:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\DeliveryMetricsResponse
    {
        return $this->getSuccessfulContent(...$this->deliveryMetricsGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region eventsCreate
    /**
     * Send conversions
     * @param \App\DTO\EventsCreateParameterData $parameters
     * @param \App\DTO\ConversionEvents $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function eventsCreateRaw(
        \App\DTO\EventsCreateParameterData $parameters,
        \App\DTO\ConversionEvents $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/ad_accounts/{ad_account_id}/events', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Send conversions
     * @param \App\DTO\EventsCreateParameterData $parameters
     * @param \App\DTO\ConversionEvents $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function eventsCreate(
        \App\DTO\EventsCreateParameterData $parameters,
        \App\DTO\ConversionEvents $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->eventsCreateRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\ConversionApiResponse();
                break;
            case 400:
                /* The request was invalid. */
                $responseContent = new \App\DTO\Error();
                break;
            case 401:
                /* Not authorized to send conversion events */
                $responseContent = new \App\DTO\Error();
                break;
            case 403:
                /* Unauthorized access. */
                $responseContent = new \App\DTO\Error();
                break;
            case 422:
                /* Not all events were successfully processed. */
                $responseContent = new \App\DTO\DetailedError();
                break;
            case 429:
                /* This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits within a short time window. */
                $responseContent = new \App\DTO\Error();
                break;
            case 503:
                /* The endpoint has been ramped down and is currently not accepting any traffic. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected errors */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Send conversions
     * @param \App\DTO\EventsCreateParameterData $parameters
     * @param \App\DTO\ConversionEvents $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\ConversionApiResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function eventsCreateResult(
        \App\DTO\EventsCreateParameterData $parameters,
        \App\DTO\ConversionEvents $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\ConversionApiResponse
    {
        return $this->getSuccessfulContent(...$this->eventsCreate($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region feedProcessingResultsList
    /**
     * List processing results for a given feed
     * @param \App\DTO\FeedProcessingResultsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function feedProcessingResultsListRaw(
        \App\DTO\FeedProcessingResultsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/catalogs/feeds/{feed_id}/processing_results', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List processing results for a given feed
     * @param \App\DTO\FeedProcessingResultsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function feedProcessingResultsList(
        \App\DTO\FeedProcessingResultsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->feedProcessingResultsListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\FeedProcessingResultsList200Response();
                break;
            case 400:
                /* Invalid parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            case 401:
                /* Unauthorized access. */
                $responseContent = new \App\DTO\Error();
                break;
            case 404:
                /* Feed not found. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error. */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List processing results for a given feed
     * @param \App\DTO\FeedProcessingResultsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\FeedProcessingResultsList200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function feedProcessingResultsListResult(
        \App\DTO\FeedProcessingResultsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\FeedProcessingResultsList200Response
    {
        return $this->getSuccessfulContent(...$this->feedProcessingResultsList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region feedsCreate
    /**
     * Create feed
     * @param \App\DTO\FeedsCreateParameterData $parameters
     * @param \App\DTO\FeedsCreateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function feedsCreateRaw(
        \App\DTO\FeedsCreateParameterData $parameters,
        \App\DTO\FeedsCreateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', 'catalogs:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/catalogs/feeds', [], $this->getQueryParameters($parameters));
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create feed
     * @param \App\DTO\FeedsCreateParameterData $parameters
     * @param \App\DTO\FeedsCreateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function feedsCreate(
        \App\DTO\FeedsCreateParameterData $parameters,
        \App\DTO\FeedsCreateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', 'catalogs:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->feedsCreateRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 201:
                /* Success */
                $responseContent = new \App\DTO\CatalogsFeed();
                break;
            case 400:
                /* Invalid feed parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            case 401:
                /* Unauthorized access. */
                $responseContent = new \App\DTO\Error();
                break;
            case 403:
                /* Business account required. */
                $responseContent = new \App\DTO\Error();
                break;
            case 409:
                /* User website required. */
                $responseContent = new \App\DTO\Error();
                break;
            case 422:
                /* Unique feed name is required. */
                $responseContent = new \App\DTO\Error();
                break;
            case 501:
                /* Not implemented (absent \"default_country\" or \"default_locale\"). */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create feed
     * @param \App\DTO\FeedsCreateParameterData $parameters
     * @param \App\DTO\FeedsCreateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\CatalogsFeed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function feedsCreateResult(
        \App\DTO\FeedsCreateParameterData $parameters,
        \App\DTO\FeedsCreateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', 'catalogs:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\CatalogsFeed
    {
        return $this->getSuccessfulContent(...$this->feedsCreate($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region feedsDelete
    /**
     * Delete feed
     * @param \App\DTO\FeedsDeleteParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function feedsDeleteRaw(
        \App\DTO\FeedsDeleteParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', 'catalogs:write', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/catalogs/feeds/{feed_id}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete feed
     * @param \App\DTO\FeedsDeleteParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function feedsDelete(
        \App\DTO\FeedsDeleteParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', 'catalogs:write', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->feedsDeleteRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 204:
                /* Feed deleted successfully. */
                break;
            case 400:
                /* Invalid feed parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            case 403:
                /* Forbidden. Account not approved for feed mutations yet. */
                $responseContent = new \App\DTO\Error();
                break;
            case 404:
                /* Data feed not found. */
                $responseContent = new \App\DTO\Error();
                break;
            case 409:
                /* Conflict. Can't delete a feed with active promotions. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete feed
     * @param \App\DTO\FeedsDeleteParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function feedsDeleteResult(
        \App\DTO\FeedsDeleteParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', 'catalogs:write', ]],
        string $responseMediaType = 'application/json'
    )
    {
        return $this->getSuccessfulContent(...$this->feedsDelete($parameters, $security, $responseMediaType));
    }
    //endregion

    //region feedsGet
    /**
     * Get feed
     * @param \App\DTO\FeedsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function feedsGetRaw(
        \App\DTO\FeedsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/catalogs/feeds/{feed_id}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get feed
     * @param \App\DTO\FeedsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function feedsGet(
        \App\DTO\FeedsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->feedsGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\CatalogsFeed();
                break;
            case 400:
                /* Invalid feed parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            case 401:
                /* Unauthorized access. */
                $responseContent = new \App\DTO\Error();
                break;
            case 404:
                /* Data feed not found. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error. */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get feed
     * @param \App\DTO\FeedsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\CatalogsFeed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function feedsGetResult(
        \App\DTO\FeedsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\CatalogsFeed
    {
        return $this->getSuccessfulContent(...$this->feedsGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region feedsList
    /**
     * List feeds
     * @param \App\DTO\FeedsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function feedsListRaw(
        \App\DTO\FeedsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/catalogs/feeds', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List feeds
     * @param \App\DTO\FeedsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function feedsList(
        \App\DTO\FeedsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->feedsListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\FeedsList200Response();
                break;
            case 400:
                /* Invalid parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            case 401:
                /* Unauthorized access. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error. */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List feeds
     * @param \App\DTO\FeedsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\FeedsList200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function feedsListResult(
        \App\DTO\FeedsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\FeedsList200Response
    {
        return $this->getSuccessfulContent(...$this->feedsList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region feedsUpdate
    /**
     * Update feed
     * @param \App\DTO\FeedsUpdateParameterData $parameters
     * @param \App\DTO\FeedsUpdateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function feedsUpdateRaw(
        \App\DTO\FeedsUpdateParameterData $parameters,
        \App\DTO\FeedsUpdateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', 'catalogs:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('PATCH', '/catalogs/feeds/{feed_id}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update feed
     * @param \App\DTO\FeedsUpdateParameterData $parameters
     * @param \App\DTO\FeedsUpdateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function feedsUpdate(
        \App\DTO\FeedsUpdateParameterData $parameters,
        \App\DTO\FeedsUpdateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', 'catalogs:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->feedsUpdateRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\CatalogsFeed();
                break;
            case 400:
                /* Invalid feed parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            case 403:
                /* Forbidden. Account not approved for feed mutations yet. */
                $responseContent = new \App\DTO\Error();
                break;
            case 404:
                /* Data feed not found. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update feed
     * @param \App\DTO\FeedsUpdateParameterData $parameters
     * @param \App\DTO\FeedsUpdateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\CatalogsFeed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function feedsUpdateResult(
        \App\DTO\FeedsUpdateParameterData $parameters,
        \App\DTO\FeedsUpdateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', 'catalogs:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\CatalogsFeed
    {
        return $this->getSuccessfulContent(...$this->feedsUpdate($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region followUserUpdate
    /**
     * Follow user
     * @param \App\DTO\FollowUserUpdateParameterData $parameters
     * @param \App\DTO\FollowUserRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function followUserUpdateRaw(
        \App\DTO\FollowUserUpdateParameterData $parameters,
        \App\DTO\FollowUserRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['user_accounts:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/user_account/following/{username}', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Follow user
     * @param \App\DTO\FollowUserUpdateParameterData $parameters
     * @param \App\DTO\FollowUserRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function followUserUpdate(
        \App\DTO\FollowUserUpdateParameterData $parameters,
        \App\DTO\FollowUserRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['user_accounts:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->followUserUpdateRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\UserSummary();
                break;
            case 404:
                /* User not found */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Follow user
     * @param \App\DTO\FollowUserUpdateParameterData $parameters
     * @param \App\DTO\FollowUserRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\UserSummary
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function followUserUpdateResult(
        \App\DTO\FollowUserUpdateParameterData $parameters,
        \App\DTO\FollowUserRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['user_accounts:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\UserSummary
    {
        return $this->getSuccessfulContent(...$this->followUserUpdate($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region followersList
    /**
     * List followers
     * @param \App\DTO\FollowersListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function followersListRaw(
        \App\DTO\FollowersListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['user_accounts:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/user_account/followers', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List followers
     * @param \App\DTO\FollowersListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function followersList(
        \App\DTO\FollowersListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['user_accounts:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->followersListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\FollowersList200Response();
                break;
            case 400:
                /* Invalid user id */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List followers
     * @param \App\DTO\FollowersListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\FollowersList200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function followersListResult(
        \App\DTO\FollowersListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['user_accounts:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\FollowersList200Response
    {
        return $this->getSuccessfulContent(...$this->followersList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region integrationsCommerceDel
    /**
     * Delete commerce integration
     * @param \App\DTO\IntegrationsCommerceDelParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function integrationsCommerceDelRaw(
        \App\DTO\IntegrationsCommerceDelParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/integrations/commerce/{external_business_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete commerce integration
     * @param \App\DTO\IntegrationsCommerceDelParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function integrationsCommerceDel(
        \App\DTO\IntegrationsCommerceDelParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->integrationsCommerceDelRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 204:
                /* Commerce Integration deleted successfully */
                break;
            default:
                /* Unexpected error. */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete commerce integration
     * @param \App\DTO\IntegrationsCommerceDelParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function integrationsCommerceDelResult(
        \App\DTO\IntegrationsCommerceDelParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $responseMediaType = 'application/json'
    )
    {
        return $this->getSuccessfulContent(...$this->integrationsCommerceDel($parameters, $security, $responseMediaType));
    }
    //endregion

    //region integrationsCommerceGet
    /**
     * Get commerce integration
     * @param \App\DTO\IntegrationsCommerceGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function integrationsCommerceGetRaw(
        \App\DTO\IntegrationsCommerceGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/integrations/commerce/{external_business_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get commerce integration
     * @param \App\DTO\IntegrationsCommerceGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function integrationsCommerceGet(
        \App\DTO\IntegrationsCommerceGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->integrationsCommerceGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\IntegrationMetadata();
                break;
            case 404:
                /* Integration not found. */
                $responseContent = new \App\DTO\Error();
                break;
            case 409:
                /* Can't access this integration metadata. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error. */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get commerce integration
     * @param \App\DTO\IntegrationsCommerceGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\IntegrationMetadata
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function integrationsCommerceGetResult(
        \App\DTO\IntegrationsCommerceGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\IntegrationMetadata
    {
        return $this->getSuccessfulContent(...$this->integrationsCommerceGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region integrationsCommercePatch
    /**
     * Update commerce integration
     * @param \App\DTO\IntegrationsCommercePatchParameterData $parameters
     * @param \App\DTO\IntegrationRequestPatch $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function integrationsCommercePatchRaw(
        \App\DTO\IntegrationsCommercePatchParameterData $parameters,
        \App\DTO\IntegrationRequestPatch $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('PATCH', '/integrations/commerce/{external_business_id}', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update commerce integration
     * @param \App\DTO\IntegrationsCommercePatchParameterData $parameters
     * @param \App\DTO\IntegrationRequestPatch $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function integrationsCommercePatch(
        \App\DTO\IntegrationsCommercePatchParameterData $parameters,
        \App\DTO\IntegrationRequestPatch $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->integrationsCommercePatchRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\IntegrationMetadata();
                break;
            case 404:
                /* Integration not found. */
                $responseContent = new \App\DTO\Error();
                break;
            case 409:
                /* Can't access this integration metadata. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error. */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update commerce integration
     * @param \App\DTO\IntegrationsCommercePatchParameterData $parameters
     * @param \App\DTO\IntegrationRequestPatch $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\IntegrationMetadata
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function integrationsCommercePatchResult(
        \App\DTO\IntegrationsCommercePatchParameterData $parameters,
        \App\DTO\IntegrationRequestPatch $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\IntegrationMetadata
    {
        return $this->getSuccessfulContent(...$this->integrationsCommercePatch($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region integrationsCommercePost
    /**
     * Create commerce integration
     * @param \App\DTO\IntegrationRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function integrationsCommercePostRaw(
        \App\DTO\IntegrationRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/integrations/commerce', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create commerce integration
     * @param \App\DTO\IntegrationRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function integrationsCommercePost(
        \App\DTO\IntegrationRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->integrationsCommercePostRaw($requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\IntegrationMetadata();
                break;
            case 404:
                /* Integration not found. */
                $responseContent = new \App\DTO\Error();
                break;
            case 409:
                /* Can't access this integration metadata. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error. */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create commerce integration
     * @param \App\DTO\IntegrationRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\IntegrationMetadata
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function integrationsCommercePostResult(
        \App\DTO\IntegrationRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\IntegrationMetadata
    {
        return $this->getSuccessfulContent(...$this->integrationsCommercePost($requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region integrationsGetById
    /**
     * Get integration metadata
     * @param \App\DTO\IntegrationsGetByIdParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function integrationsGetByIdRaw(
        \App\DTO\IntegrationsGetByIdParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/integrations/{id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get integration metadata
     * @param \App\DTO\IntegrationsGetByIdParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function integrationsGetById(
        \App\DTO\IntegrationsGetByIdParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->integrationsGetByIdRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\IntegrationRecord();
                break;
            case 404:
                /* Integration not found. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error. */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get integration metadata
     * @param \App\DTO\IntegrationsGetByIdParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\IntegrationRecord
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function integrationsGetByIdResult(
        \App\DTO\IntegrationsGetByIdParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\IntegrationRecord
    {
        return $this->getSuccessfulContent(...$this->integrationsGetById($parameters, $security, $responseMediaType));
    }
    //endregion

    //region integrationsGetList
    /**
     * Get integration metadata list
     * @param \App\DTO\IntegrationsGetListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function integrationsGetListRaw(
        \App\DTO\IntegrationsGetListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/integrations', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get integration metadata list
     * @param \App\DTO\IntegrationsGetListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function integrationsGetList(
        \App\DTO\IntegrationsGetListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->integrationsGetListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\IntegrationsGetList200Response();
                break;
            default:
                /* Unexpected error. */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get integration metadata list
     * @param \App\DTO\IntegrationsGetListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\IntegrationsGetList200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function integrationsGetListResult(
        \App\DTO\IntegrationsGetListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\IntegrationsGetList200Response
    {
        return $this->getSuccessfulContent(...$this->integrationsGetList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region integrationsLogsPost
    /**
     * Receives batched logs from integration applications.
     * @param \App\DTO\IntegrationLogsRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function integrationsLogsPostRaw(
        \App\DTO\IntegrationLogsRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/integrations/logs', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Receives batched logs from integration applications.
     * @param \App\DTO\IntegrationLogsRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function integrationsLogsPost(
        \App\DTO\IntegrationLogsRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->integrationsLogsPostRaw($requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success. */
                $responseContent = new \App\DTO\IntegrationLogsSuccessResponse();
                break;
            case 400:
                /* Bad request. */
                $responseContent = new \App\DTO\DetailedError();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Receives batched logs from integration applications.
     * @param \App\DTO\IntegrationLogsRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\IntegrationLogsSuccessResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function integrationsLogsPostResult(
        \App\DTO\IntegrationLogsRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\IntegrationLogsSuccessResponse
    {
        return $this->getSuccessfulContent(...$this->integrationsLogsPost($requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region interestTargetingOptionsGet
    /**
     * Get interest details
     * @param \App\DTO\InterestTargetingOptionsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function interestTargetingOptionsGetRaw(
        \App\DTO\InterestTargetingOptionsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/resources/targeting/interests/{interest_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get interest details
     * @param \App\DTO\InterestTargetingOptionsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function interestTargetingOptionsGet(
        \App\DTO\InterestTargetingOptionsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->interestTargetingOptionsGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\SingleInterestTargetingOptionResponse();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get interest details
     * @param \App\DTO\InterestTargetingOptionsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\SingleInterestTargetingOptionResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function interestTargetingOptionsGetResult(
        \App\DTO\InterestTargetingOptionsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\SingleInterestTargetingOptionResponse
    {
        return $this->getSuccessfulContent(...$this->interestTargetingOptionsGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region itemsBatchGet
    /**
     * Get catalogs item batch status
     * @param \App\DTO\ItemsBatchGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function itemsBatchGetRaw(
        \App\DTO\ItemsBatchGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/catalogs/items/batch/{batch_id}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get catalogs item batch status
     * @param \App\DTO\ItemsBatchGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function itemsBatchGet(
        \App\DTO\ItemsBatchGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->itemsBatchGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Response containing the requested catalogs items batch */
                $responseContent = new \App\DTO\CatalogsItemsBatch();
                break;
            case 401:
                /* Not authenticated to access catalogs items batch */
                $responseContent = new \App\DTO\Error();
                break;
            case 403:
                /* Not authorized to access catalogs items batch */
                $responseContent = new \App\DTO\Error();
                break;
            case 404:
                /* Catalogs items batch not found */
                $responseContent = new \App\DTO\Error();
                break;
            case 405:
                /* Method Not Allowed. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get catalogs item batch status
     * @param \App\DTO\ItemsBatchGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\CatalogsItemsBatch
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function itemsBatchGetResult(
        \App\DTO\ItemsBatchGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\CatalogsItemsBatch
    {
        return $this->getSuccessfulContent(...$this->itemsBatchGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region itemsBatchPost
    /**
     * Operate on item batch
     * @param \App\DTO\ItemsBatchPostParameterData $parameters
     * @param \App\DTO\ItemsBatchPostRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function itemsBatchPostRaw(
        \App\DTO\ItemsBatchPostParameterData $parameters,
        \App\DTO\ItemsBatchPostRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', 'catalogs:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/catalogs/items/batch', [], $this->getQueryParameters($parameters));
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Operate on item batch
     * @param \App\DTO\ItemsBatchPostParameterData $parameters
     * @param \App\DTO\ItemsBatchPostRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function itemsBatchPost(
        \App\DTO\ItemsBatchPostParameterData $parameters,
        \App\DTO\ItemsBatchPostRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', 'catalogs:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->itemsBatchPostRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Response containing the requested catalogs items batch */
                $responseContent = new \App\DTO\CatalogsItemsBatch();
                break;
            case 400:
                /* Invalid request parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            case 401:
                /* Not authenticated to post catalogs items */
                $responseContent = new \App\DTO\Error();
                break;
            case 403:
                /* Not authorized to post catalogs items */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Operate on item batch
     * @param \App\DTO\ItemsBatchPostParameterData $parameters
     * @param \App\DTO\ItemsBatchPostRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\CatalogsItemsBatch
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function itemsBatchPostResult(
        \App\DTO\ItemsBatchPostParameterData $parameters,
        \App\DTO\ItemsBatchPostRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', 'catalogs:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\CatalogsItemsBatch
    {
        return $this->getSuccessfulContent(...$this->itemsBatchPost($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region itemsGet
    /**
     * Get catalogs items
     * @param \App\DTO\ItemsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function itemsGetRaw(
        \App\DTO\ItemsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/catalogs/items', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get catalogs items
     * @param \App\DTO\ItemsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function itemsGet(
        \App\DTO\ItemsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->itemsGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Response containing the requested catalogs items */
                $responseContent = new \App\DTO\CatalogsItems();
                break;
            case 400:
                /* Invalid request parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            case 401:
                /* Not authorized to access catalogs items */
                $responseContent = new \App\DTO\Error();
                break;
            case 403:
                /* Not authorized to access catalogs items */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get catalogs items
     * @param \App\DTO\ItemsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\CatalogsItems
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function itemsGetResult(
        \App\DTO\ItemsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\CatalogsItems
    {
        return $this->getSuccessfulContent(...$this->itemsGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region itemsIssuesList
    /**
     * List item issues for a given processing result
     * @param \App\DTO\ItemsIssuesListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function itemsIssuesListRaw(
        \App\DTO\ItemsIssuesListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/catalogs/processing_results/{processing_result_id}/item_issues', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List item issues for a given processing result
     * @param \App\DTO\ItemsIssuesListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function itemsIssuesList(
        \App\DTO\ItemsIssuesListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->itemsIssuesListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\ItemsIssuesList200Response();
                break;
            case 401:
                /* Unauthorized access. */
                $responseContent = new \App\DTO\Error();
                break;
            case 404:
                /* Processing Result not found. */
                $responseContent = new \App\DTO\Error();
                break;
            case 501:
                /* Not implemented. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error. */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List item issues for a given processing result
     * @param \App\DTO\ItemsIssuesListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ItemsIssuesList200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function itemsIssuesListResult(
        \App\DTO\ItemsIssuesListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ItemsIssuesList200Response
    {
        return $this->getSuccessfulContent(...$this->itemsIssuesList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region keywordsCreate
    /**
     * Create keywords
     * @param \App\DTO\KeywordsCreateParameterData $parameters
     * @param \App\DTO\KeywordsRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function keywordsCreateRaw(
        \App\DTO\KeywordsCreateParameterData $parameters,
        \App\DTO\KeywordsRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/ad_accounts/{ad_account_id}/keywords', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create keywords
     * @param \App\DTO\KeywordsCreateParameterData $parameters
     * @param \App\DTO\KeywordsRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function keywordsCreate(
        \App\DTO\KeywordsCreateParameterData $parameters,
        \App\DTO\KeywordsRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->keywordsCreateRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\KeywordsResponse();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create keywords
     * @param \App\DTO\KeywordsCreateParameterData $parameters
     * @param \App\DTO\KeywordsRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\KeywordsResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function keywordsCreateResult(
        \App\DTO\KeywordsCreateParameterData $parameters,
        \App\DTO\KeywordsRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\KeywordsResponse
    {
        return $this->getSuccessfulContent(...$this->keywordsCreate($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region keywordsGet
    /**
     * Get keywords
     * @param \App\DTO\KeywordsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function keywordsGetRaw(
        \App\DTO\KeywordsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/keywords', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get keywords
     * @param \App\DTO\KeywordsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function keywordsGet(
        \App\DTO\KeywordsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->keywordsGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\KeywordsGet200Response();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get keywords
     * @param \App\DTO\KeywordsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\KeywordsGet200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function keywordsGetResult(
        \App\DTO\KeywordsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\KeywordsGet200Response
    {
        return $this->getSuccessfulContent(...$this->keywordsGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region keywordsUpdate
    /**
     * Update keywords
     * @param \App\DTO\KeywordsUpdateParameterData $parameters
     * @param \App\DTO\KeywordUpdateBody $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function keywordsUpdateRaw(
        \App\DTO\KeywordsUpdateParameterData $parameters,
        \App\DTO\KeywordUpdateBody $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('PATCH', '/ad_accounts/{ad_account_id}/keywords', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update keywords
     * @param \App\DTO\KeywordsUpdateParameterData $parameters
     * @param \App\DTO\KeywordUpdateBody $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function keywordsUpdate(
        \App\DTO\KeywordsUpdateParameterData $parameters,
        \App\DTO\KeywordUpdateBody $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->keywordsUpdateRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\KeywordsResponse();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update keywords
     * @param \App\DTO\KeywordsUpdateParameterData $parameters
     * @param \App\DTO\KeywordUpdateBody $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\KeywordsResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function keywordsUpdateResult(
        \App\DTO\KeywordsUpdateParameterData $parameters,
        \App\DTO\KeywordUpdateBody $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\KeywordsResponse
    {
        return $this->getSuccessfulContent(...$this->keywordsUpdate($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region leadFormGet
    /**
     * Get lead form by id
     * @param \App\DTO\LeadFormGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function leadFormGetRaw(
        \App\DTO\LeadFormGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get lead form by id
     * @param \App\DTO\LeadFormGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function leadFormGet(
        \App\DTO\LeadFormGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->leadFormGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\LeadFormResponse();
                break;
            case 400:
                /* Invalid ad account lead forms parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            case 404:
                /* The lead form ID for the given ad account ID does not exist. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get lead form by id
     * @param \App\DTO\LeadFormGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\LeadFormResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function leadFormGetResult(
        \App\DTO\LeadFormGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\LeadFormResponse
    {
        return $this->getSuccessfulContent(...$this->leadFormGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region leadFormQuestionsGet
    /**
     * Get lead form questions
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function leadFormQuestionsGetRaw(
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/resources/lead_form_questions', [], []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get lead form questions
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function leadFormQuestionsGet(
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->leadFormQuestionsGetRaw($security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get lead form questions
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function leadFormQuestionsGetResult(
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    )
    {
        return $this->getSuccessfulContent(...$this->leadFormQuestionsGet($security, $responseMediaType));
    }
    //endregion

    //region leadFormTestCreate
    /**
     * Create lead form test data
     * @param \App\DTO\LeadFormTestCreateParameterData $parameters
     * @param \App\DTO\LeadFormTestRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function leadFormTestCreateRaw(
        \App\DTO\LeadFormTestCreateParameterData $parameters,
        \App\DTO\LeadFormTestRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create lead form test data
     * @param \App\DTO\LeadFormTestCreateParameterData $parameters
     * @param \App\DTO\LeadFormTestRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function leadFormTestCreate(
        \App\DTO\LeadFormTestCreateParameterData $parameters,
        \App\DTO\LeadFormTestRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->leadFormTestCreateRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\LeadFormTestResponse();
                break;
            case 400:
                /* Invalid parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            case 404:
                /* Lead not found. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create lead form test data
     * @param \App\DTO\LeadFormTestCreateParameterData $parameters
     * @param \App\DTO\LeadFormTestRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\LeadFormTestResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function leadFormTestCreateResult(
        \App\DTO\LeadFormTestCreateParameterData $parameters,
        \App\DTO\LeadFormTestRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\LeadFormTestResponse
    {
        return $this->getSuccessfulContent(...$this->leadFormTestCreate($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region leadFormsList
    /**
     * Get lead forms
     * @param \App\DTO\LeadFormsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function leadFormsListRaw(
        \App\DTO\LeadFormsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/lead_forms', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get lead forms
     * @param \App\DTO\LeadFormsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function leadFormsList(
        \App\DTO\LeadFormsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->leadFormsListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\LeadFormsList200Response();
                break;
            case 400:
                /* Invalid ad account lead forms parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get lead forms
     * @param \App\DTO\LeadFormsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\LeadFormsList200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function leadFormsListResult(
        \App\DTO\LeadFormsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\LeadFormsList200Response
    {
        return $this->getSuccessfulContent(...$this->leadFormsList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region linkedBusinessAccountsGet
    /**
     * List linked businesses
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function linkedBusinessAccountsGetRaw(
        iterable $security = ['pinterest_oauth2' => ['user_accounts:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/user_account/businesses', [], []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List linked businesses
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function linkedBusinessAccountsGet(
        iterable $security = ['pinterest_oauth2' => ['user_accounts:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->linkedBusinessAccountsGetRaw($security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\Collection177();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List linked businesses
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\Collection177
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function linkedBusinessAccountsGetResult(
        iterable $security = ['pinterest_oauth2' => ['user_accounts:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\Collection177
    {
        return $this->getSuccessfulContent(...$this->linkedBusinessAccountsGet($security, $responseMediaType));
    }
    //endregion

    //region mediaCreate
    /**
     * Register media upload
     * @param \App\DTO\MediaUploadRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function mediaCreateRaw(
        \App\DTO\MediaUploadRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['pins:read', 'pins:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/media', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Register media upload
     * @param \App\DTO\MediaUploadRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function mediaCreate(
        \App\DTO\MediaUploadRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['pins:read', 'pins:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->mediaCreateRaw($requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 201:
                /* response */
                $responseContent = new \App\DTO\MediaUpload();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Register media upload
     * @param \App\DTO\MediaUploadRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\MediaUpload
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function mediaCreateResult(
        \App\DTO\MediaUploadRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['pins:read', 'pins:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\MediaUpload
    {
        return $this->getSuccessfulContent(...$this->mediaCreate($requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region mediaGet
    /**
     * Get media upload details
     * @param \App\DTO\MediaGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function mediaGetRaw(
        \App\DTO\MediaGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['pins:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/media/{media_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get media upload details
     * @param \App\DTO\MediaGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function mediaGet(
        \App\DTO\MediaGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['pins:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->mediaGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* response */
                $responseContent = new \App\DTO\MediaUploadDetails();
                break;
            case 404:
                /* Media upload not found */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get media upload details
     * @param \App\DTO\MediaGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\MediaUploadDetails
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function mediaGetResult(
        \App\DTO\MediaGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['pins:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\MediaUploadDetails
    {
        return $this->getSuccessfulContent(...$this->mediaGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region mediaList
    /**
     * List media uploads
     * @param \App\DTO\MediaListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function mediaListRaw(
        \App\DTO\MediaListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['pins:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/media', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List media uploads
     * @param \App\DTO\MediaListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function mediaList(
        \App\DTO\MediaListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['pins:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->mediaListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* response */
                $responseContent = new \App\DTO\MediaList200Response();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List media uploads
     * @param \App\DTO\MediaListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\MediaList200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function mediaListResult(
        \App\DTO\MediaListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['pins:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\MediaList200Response
    {
        return $this->getSuccessfulContent(...$this->mediaList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region metricsReadyStateGet
    /**
     * Get metrics ready state
     * @param \App\DTO\MetricsReadyStateGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function metricsReadyStateGetRaw(
        \App\DTO\MetricsReadyStateGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/resources/metrics_ready_state', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get metrics ready state
     * @param \App\DTO\MetricsReadyStateGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function metricsReadyStateGet(
        \App\DTO\MetricsReadyStateGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->metricsReadyStateGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\BookClosedResponse();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get metrics ready state
     * @param \App\DTO\MetricsReadyStateGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\BookClosedResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function metricsReadyStateGetResult(
        \App\DTO\MetricsReadyStateGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\BookClosedResponse
    {
        return $this->getSuccessfulContent(...$this->metricsReadyStateGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region oauthToken
    /**
     * Generate OAuth access token
     * @param \App\DTO\OauthAccessTokenRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function oauthTokenRaw(
        \App\DTO\OauthAccessTokenRequest $requestContent,
        iterable $security = ['basic' => []],
        string $requestMediaType = 'application/x-www-form-urlencoded',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/oauth/token', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Generate OAuth access token
     * @param \App\DTO\OauthAccessTokenRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function oauthToken(
        \App\DTO\OauthAccessTokenRequest $requestContent,
        iterable $security = ['basic' => []],
        string $requestMediaType = 'application/x-www-form-urlencoded',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->oauthTokenRaw($requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* response */
                $responseContent = new \App\DTO\OauthAccessTokenResponse();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Generate OAuth access token
     * @param \App\DTO\OauthAccessTokenRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\OauthAccessTokenResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function oauthTokenResult(
        \App\DTO\OauthAccessTokenRequest $requestContent,
        iterable $security = ['basic' => []],
        string $requestMediaType = 'application/x-www-form-urlencoded',
        string $responseMediaType = 'application/json'
    ): \App\DTO\OauthAccessTokenResponse
    {
        return $this->getSuccessfulContent(...$this->oauthToken($requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region ocpmEligibleConversionTagsGet
    /**
     * Get Ocpm eligible conversion tags
     * @param \App\DTO\OcpmEligibleConversionTagsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function ocpmEligibleConversionTagsGetRaw(
        \App\DTO\OcpmEligibleConversionTagsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get Ocpm eligible conversion tags
     * @param \App\DTO\OcpmEligibleConversionTagsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function ocpmEligibleConversionTagsGet(
        \App\DTO\OcpmEligibleConversionTagsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->ocpmEligibleConversionTagsGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\Collection97();
                break;
            default:
                /* Unexpected errors */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get Ocpm eligible conversion tags
     * @param \App\DTO\OcpmEligibleConversionTagsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\Collection97
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function ocpmEligibleConversionTagsGetResult(
        \App\DTO\OcpmEligibleConversionTagsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\Collection97
    {
        return $this->getSuccessfulContent(...$this->ocpmEligibleConversionTagsGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region orderLinesGet
    /**
     * Get order line
     * @param \App\DTO\OrderLinesGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function orderLinesGetRaw(
        \App\DTO\OrderLinesGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/order_lines/{order_line_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get order line
     * @param \App\DTO\OrderLinesGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function orderLinesGet(
        \App\DTO\OrderLinesGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->orderLinesGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\OrderLine();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get order line
     * @param \App\DTO\OrderLinesGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\OrderLine
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function orderLinesGetResult(
        \App\DTO\OrderLinesGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\OrderLine
    {
        return $this->getSuccessfulContent(...$this->orderLinesGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region orderLinesList
    /**
     * Get order lines
     * @param \App\DTO\OrderLinesListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function orderLinesListRaw(
        \App\DTO\OrderLinesListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/order_lines', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get order lines
     * @param \App\DTO\OrderLinesListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function orderLinesList(
        \App\DTO\OrderLinesListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->orderLinesListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\OrderLinesList200Response();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get order lines
     * @param \App\DTO\OrderLinesListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\OrderLinesList200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function orderLinesListResult(
        \App\DTO\OrderLinesListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\OrderLinesList200Response
    {
        return $this->getSuccessfulContent(...$this->orderLinesList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region pageVisitConversionTagsGet
    /**
     * Get page visit conversion tags
     * @param \App\DTO\PageVisitConversionTagsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function pageVisitConversionTagsGetRaw(
        \App\DTO\PageVisitConversionTagsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/conversion_tags/page_visit', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get page visit conversion tags
     * @param \App\DTO\PageVisitConversionTagsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function pageVisitConversionTagsGet(
        \App\DTO\PageVisitConversionTagsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->pageVisitConversionTagsGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\PageVisitConversionTagsGet200Response();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get page visit conversion tags
     * @param \App\DTO\PageVisitConversionTagsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PageVisitConversionTagsGet200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function pageVisitConversionTagsGetResult(
        \App\DTO\PageVisitConversionTagsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PageVisitConversionTagsGet200Response
    {
        return $this->getSuccessfulContent(...$this->pageVisitConversionTagsGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region pinsAnalytics
    /**
     * Get Pin analytics
     * @param \App\DTO\PinsAnalyticsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function pinsAnalyticsRaw(
        \App\DTO\PinsAnalyticsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'pins:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/pins/{pin_id}/analytics', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get Pin analytics
     * @param \App\DTO\PinsAnalyticsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function pinsAnalytics(
        \App\DTO\PinsAnalyticsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'pins:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->pinsAnalyticsRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* response */
                $responseContent = new \App\DTO\Collection151();
                break;
            case 400:
                /* Invalid pins analytics parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            case 403:
                /* Not authorized to access board or Pin. */
                $responseContent = new \App\DTO\Error();
                break;
            case 404:
                /* Pin not found. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get Pin analytics
     * @param \App\DTO\PinsAnalyticsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\Collection151
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function pinsAnalyticsResult(
        \App\DTO\PinsAnalyticsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'pins:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\Collection151
    {
        return $this->getSuccessfulContent(...$this->pinsAnalytics($parameters, $security, $responseMediaType));
    }
    //endregion

    //region pinsCreate
    /**
     * Create Pin
     * @param \App\DTO\PinsCreateParameterData $parameters
     * @param \App\DTO\PinCreate $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function pinsCreateRaw(
        \App\DTO\PinsCreateParameterData $parameters,
        \App\DTO\PinCreate $requestContent,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:write', 'pins:read', 'pins:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/pins', [], $this->getQueryParameters($parameters));
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create Pin
     * @param \App\DTO\PinsCreateParameterData $parameters
     * @param \App\DTO\PinCreate $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function pinsCreate(
        \App\DTO\PinsCreateParameterData $parameters,
        \App\DTO\PinCreate $requestContent,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:write', 'pins:read', 'pins:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->pinsCreateRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 201:
                /* Successful pin creation. */
                $responseContent = new \App\DTO\Pin();
                break;
            case 400:
                /* Invalid Pin parameters response */
                $responseContent = new \App\DTO\Error();
                break;
            case 403:
                /* The Pin's image is too small, too large or is broken */
                $responseContent = new \App\DTO\Error();
                break;
            case 404:
                /* Board or section not found */
                $responseContent = new \App\DTO\Error();
                break;
            case 429:
                /* This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create Pin
     * @param \App\DTO\PinsCreateParameterData $parameters
     * @param \App\DTO\PinCreate $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\Pin
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function pinsCreateResult(
        \App\DTO\PinsCreateParameterData $parameters,
        \App\DTO\PinCreate $requestContent,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:write', 'pins:read', 'pins:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\Pin
    {
        return $this->getSuccessfulContent(...$this->pinsCreate($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region pinsDelete
    /**
     * Delete Pin
     * @param \App\DTO\PinsDeleteParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function pinsDeleteRaw(
        \App\DTO\PinsDeleteParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:write', 'pins:read', 'pins:write', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/pins/{pin_id}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete Pin
     * @param \App\DTO\PinsDeleteParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function pinsDelete(
        \App\DTO\PinsDeleteParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:write', 'pins:read', 'pins:write', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->pinsDeleteRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 204:
                /* Successfully deleted Pin */
                break;
            case 403:
                /* Not authorized to access board or Pin. */
                $responseContent = new \App\DTO\Error();
                break;
            case 404:
                /* Pin not found. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete Pin
     * @param \App\DTO\PinsDeleteParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function pinsDeleteResult(
        \App\DTO\PinsDeleteParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:write', 'pins:read', 'pins:write', ]],
        string $responseMediaType = 'application/json'
    )
    {
        return $this->getSuccessfulContent(...$this->pinsDelete($parameters, $security, $responseMediaType));
    }
    //endregion

    //region pinsGet
    /**
     * Get Pin
     * @param \App\DTO\PinsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function pinsGetRaw(
        \App\DTO\PinsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'pins:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/pins/{pin_id}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get Pin
     * @param \App\DTO\PinsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function pinsGet(
        \App\DTO\PinsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'pins:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->pinsGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* response */
                $responseContent = new \App\DTO\Pin();
                break;
            case 403:
                /* Not authorized to access board or Pin. */
                $responseContent = new \App\DTO\Error();
                break;
            case 404:
                /* Pin not found. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get Pin
     * @param \App\DTO\PinsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\Pin
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function pinsGetResult(
        \App\DTO\PinsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'pins:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\Pin
    {
        return $this->getSuccessfulContent(...$this->pinsGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region pinsList
    /**
     * List Pins
     * @param \App\DTO\PinsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function pinsListRaw(
        \App\DTO\PinsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'pins:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/pins', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List Pins
     * @param \App\DTO\PinsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function pinsList(
        \App\DTO\PinsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'pins:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->pinsListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\PinsList200Response();
                break;
            case 400:
                /* Invalid pin filter value */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List Pins
     * @param \App\DTO\PinsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PinsList200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function pinsListResult(
        \App\DTO\PinsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'pins:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PinsList200Response
    {
        return $this->getSuccessfulContent(...$this->pinsList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region pinsSave
    /**
     * Save Pin
     * @param \App\DTO\PinsSaveParameterData $parameters
     * @param \App\DTO\PinsSaveRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function pinsSaveRaw(
        \App\DTO\PinsSaveParameterData $parameters,
        \App\DTO\PinsSaveRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:write', 'pins:read', 'pins:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/pins/{pin_id}/save', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Save Pin
     * @param \App\DTO\PinsSaveParameterData $parameters
     * @param \App\DTO\PinsSaveRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function pinsSave(
        \App\DTO\PinsSaveParameterData $parameters,
        \App\DTO\PinsSaveRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:write', 'pins:read', 'pins:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->pinsSaveRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 201:
                /* Successfully saved pin. */
                $responseContent = new \App\DTO\Pin();
                break;
            case 403:
                /* Not authorized to access Board or Pin. */
                $responseContent = new \App\DTO\Error();
                break;
            case 404:
                /* Board or Pin not found. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Save Pin
     * @param \App\DTO\PinsSaveParameterData $parameters
     * @param \App\DTO\PinsSaveRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\Pin
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function pinsSaveResult(
        \App\DTO\PinsSaveParameterData $parameters,
        \App\DTO\PinsSaveRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:write', 'pins:read', 'pins:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\Pin
    {
        return $this->getSuccessfulContent(...$this->pinsSave($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region pinsUpdate
    /**
     * Update Pin
     * @param \App\DTO\PinsUpdateParameterData $parameters
     * @param \App\DTO\PinUpdate $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function pinsUpdateRaw(
        \App\DTO\PinsUpdateParameterData $parameters,
        \App\DTO\PinUpdate $requestContent,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:write', 'pins:read', 'pins:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('PATCH', '/pins/{pin_id}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update Pin
     * @param \App\DTO\PinsUpdateParameterData $parameters
     * @param \App\DTO\PinUpdate $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function pinsUpdate(
        \App\DTO\PinsUpdateParameterData $parameters,
        \App\DTO\PinUpdate $requestContent,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:write', 'pins:read', 'pins:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->pinsUpdateRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* response */
                $responseContent = new \App\DTO\Pin();
                break;
            case 403:
                /* Not authorized to update Pin. */
                $responseContent = new \App\DTO\Error();
                break;
            case 404:
                /* Pin not found. */
                $responseContent = new \App\DTO\Error();
                break;
            case 429:
                /* This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update Pin
     * @param \App\DTO\PinsUpdateParameterData $parameters
     * @param \App\DTO\PinUpdate $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\Pin
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function pinsUpdateResult(
        \App\DTO\PinsUpdateParameterData $parameters,
        \App\DTO\PinUpdate $requestContent,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:write', 'pins:read', 'pins:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\Pin
    {
        return $this->getSuccessfulContent(...$this->pinsUpdate($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region productGroupPromotionsCreate
    /**
     * Create product group promotions
     * @param \App\DTO\ProductGroupPromotionsCreateParameterData $parameters
     * @param \App\DTO\ProductGroupPromotionCreateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function productGroupPromotionsCreateRaw(
        \App\DTO\ProductGroupPromotionsCreateParameterData $parameters,
        \App\DTO\ProductGroupPromotionCreateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/ad_accounts/{ad_account_id}/product_group_promotions', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create product group promotions
     * @param \App\DTO\ProductGroupPromotionsCreateParameterData $parameters
     * @param \App\DTO\ProductGroupPromotionCreateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function productGroupPromotionsCreate(
        \App\DTO\ProductGroupPromotionsCreateParameterData $parameters,
        \App\DTO\ProductGroupPromotionCreateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->productGroupPromotionsCreateRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\ProductGroupPromotionResponse();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create product group promotions
     * @param \App\DTO\ProductGroupPromotionsCreateParameterData $parameters
     * @param \App\DTO\ProductGroupPromotionCreateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\ProductGroupPromotionResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function productGroupPromotionsCreateResult(
        \App\DTO\ProductGroupPromotionsCreateParameterData $parameters,
        \App\DTO\ProductGroupPromotionCreateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\ProductGroupPromotionResponse
    {
        return $this->getSuccessfulContent(...$this->productGroupPromotionsCreate($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region productGroupPromotionsGet
    /**
     * Get a product group promotion by id
     * @param \App\DTO\ProductGroupPromotionsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function productGroupPromotionsGetRaw(
        \App\DTO\ProductGroupPromotionsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get a product group promotion by id
     * @param \App\DTO\ProductGroupPromotionsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function productGroupPromotionsGet(
        \App\DTO\ProductGroupPromotionsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->productGroupPromotionsGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\ProductGroupPromotionResponse();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get a product group promotion by id
     * @param \App\DTO\ProductGroupPromotionsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ProductGroupPromotionResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function productGroupPromotionsGetResult(
        \App\DTO\ProductGroupPromotionsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ProductGroupPromotionResponse
    {
        return $this->getSuccessfulContent(...$this->productGroupPromotionsGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region productGroupPromotionsList
    /**
     * Get product group promotions
     * @param \App\DTO\ProductGroupPromotionsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function productGroupPromotionsListRaw(
        \App\DTO\ProductGroupPromotionsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/product_group_promotions', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get product group promotions
     * @param \App\DTO\ProductGroupPromotionsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function productGroupPromotionsList(
        \App\DTO\ProductGroupPromotionsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->productGroupPromotionsListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\ProductGroupPromotionsList200Response();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get product group promotions
     * @param \App\DTO\ProductGroupPromotionsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\ProductGroupPromotionsList200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function productGroupPromotionsListResult(
        \App\DTO\ProductGroupPromotionsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ProductGroupPromotionsList200Response
    {
        return $this->getSuccessfulContent(...$this->productGroupPromotionsList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region productGroupPromotionsUpdate
    /**
     * Update product group promotions
     * @param \App\DTO\ProductGroupPromotionsUpdateParameterData $parameters
     * @param \App\DTO\ProductGroupPromotionUpdateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function productGroupPromotionsUpdateRaw(
        \App\DTO\ProductGroupPromotionsUpdateParameterData $parameters,
        \App\DTO\ProductGroupPromotionUpdateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('PATCH', '/ad_accounts/{ad_account_id}/product_group_promotions', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update product group promotions
     * @param \App\DTO\ProductGroupPromotionsUpdateParameterData $parameters
     * @param \App\DTO\ProductGroupPromotionUpdateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function productGroupPromotionsUpdate(
        \App\DTO\ProductGroupPromotionsUpdateParameterData $parameters,
        \App\DTO\ProductGroupPromotionUpdateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->productGroupPromotionsUpdateRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\ProductGroupPromotionResponse();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update product group promotions
     * @param \App\DTO\ProductGroupPromotionsUpdateParameterData $parameters
     * @param \App\DTO\ProductGroupPromotionUpdateRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\ProductGroupPromotionResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function productGroupPromotionsUpdateResult(
        \App\DTO\ProductGroupPromotionsUpdateParameterData $parameters,
        \App\DTO\ProductGroupPromotionUpdateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\ProductGroupPromotionResponse
    {
        return $this->getSuccessfulContent(...$this->productGroupPromotionsUpdate($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region productGroupsAnalytics
    /**
     * Get product group analytics
     * @param \App\DTO\ProductGroupsAnalyticsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function productGroupsAnalyticsRaw(
        \App\DTO\ProductGroupsAnalyticsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/product_groups/analytics', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get product group analytics
     * @param \App\DTO\ProductGroupsAnalyticsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function productGroupsAnalytics(
        \App\DTO\ProductGroupsAnalyticsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->productGroupsAnalyticsRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\Collection130();
                break;
            case 400:
                /* Invalid ad account ads analytics parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get product group analytics
     * @param \App\DTO\ProductGroupsAnalyticsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\Collection130
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function productGroupsAnalyticsResult(
        \App\DTO\ProductGroupsAnalyticsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\Collection130
    {
        return $this->getSuccessfulContent(...$this->productGroupsAnalytics($parameters, $security, $responseMediaType));
    }
    //endregion

    //region productsByProductGroupFilterList
    /**
     * List filtered products
     * @param \App\DTO\ProductsByProductGroupFilterListParameterData $parameters
     * @param \App\DTO\CatalogsListProductsByFilterRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function productsByProductGroupFilterListRaw(
        \App\DTO\ProductsByProductGroupFilterListParameterData $parameters,
        \App\DTO\CatalogsListProductsByFilterRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'catalogs:read', 'pins:read', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/catalogs/products/get_by_product_group_filters', [], $this->getQueryParameters($parameters));
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List filtered products
     * @param \App\DTO\ProductsByProductGroupFilterListParameterData $parameters
     * @param \App\DTO\CatalogsListProductsByFilterRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function productsByProductGroupFilterList(
        \App\DTO\ProductsByProductGroupFilterListParameterData $parameters,
        \App\DTO\CatalogsListProductsByFilterRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'catalogs:read', 'pins:read', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->productsByProductGroupFilterListRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\CatalogsProductGroupPinsList200Response();
                break;
            case 401:
                /* Unauthorized access. */
                $responseContent = new \App\DTO\Error();
                break;
            case 409:
                /* Conflict. Can't get products. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error. */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List filtered products
     * @param \App\DTO\ProductsByProductGroupFilterListParameterData $parameters
     * @param \App\DTO\CatalogsListProductsByFilterRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\CatalogsProductGroupPinsList200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function productsByProductGroupFilterListResult(
        \App\DTO\ProductsByProductGroupFilterListParameterData $parameters,
        \App\DTO\CatalogsListProductsByFilterRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'catalogs:read', 'pins:read', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\CatalogsProductGroupPinsList200Response
    {
        return $this->getSuccessfulContent(...$this->productsByProductGroupFilterList($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region sandboxDelete
    /**
     * Delete ads data for ad account in API Sandbox
     * @param \App\DTO\SandboxDeleteParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function sandboxDeleteRaw(
        \App\DTO\SandboxDeleteParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/ad_accounts/{ad_account_id}/sandbox', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete ads data for ad account in API Sandbox
     * @param \App\DTO\SandboxDeleteParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function sandboxDelete(
        \App\DTO\SandboxDeleteParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->sandboxDeleteRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK */
                break;
            case 400:
                /* Invalid ad account id. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete ads data for ad account in API Sandbox
     * @param \App\DTO\SandboxDeleteParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return string
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function sandboxDeleteResult(
        \App\DTO\SandboxDeleteParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $responseMediaType = 'application/json'
    ): string
    {
        return $this->getSuccessfulContent(...$this->sandboxDelete($parameters, $security, $responseMediaType));
    }
    //endregion

    //region searchPartnerPins
    /**
     * Search pins by a given search term
     * @param \App\DTO\SearchPartnerPinsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function searchPartnerPinsRaw(
        \App\DTO\SearchPartnerPinsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'pins:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/search/partner/pins', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Search pins by a given search term
     * @param \App\DTO\SearchPartnerPinsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function searchPartnerPins(
        \App\DTO\SearchPartnerPinsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'pins:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->searchPartnerPinsRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\SearchPartnerPins200Response();
                break;
            case 400:
                /* Invalid pins */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Search pins by a given search term
     * @param \App\DTO\SearchPartnerPinsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\SearchPartnerPins200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function searchPartnerPinsResult(
        \App\DTO\SearchPartnerPinsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'pins:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\SearchPartnerPins200Response
    {
        return $this->getSuccessfulContent(...$this->searchPartnerPins($parameters, $security, $responseMediaType));
    }
    //endregion

    //region searchUserBoardsGet
    /**
     * Search user's boards
     * @param \App\DTO\SearchUserBoardsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function searchUserBoardsGetRaw(
        \App\DTO\SearchUserBoardsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:read_secret', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/search/boards', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Search user's boards
     * @param \App\DTO\SearchUserBoardsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function searchUserBoardsGet(
        \App\DTO\SearchUserBoardsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:read_secret', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->searchUserBoardsGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* response */
                $responseContent = new \App\DTO\SearchUserBoardsGet200Response();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Search user's boards
     * @param \App\DTO\SearchUserBoardsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\SearchUserBoardsGet200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function searchUserBoardsGetResult(
        \App\DTO\SearchUserBoardsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:read_secret', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\SearchUserBoardsGet200Response
    {
        return $this->getSuccessfulContent(...$this->searchUserBoardsGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region searchUserPinsList
    /**
     * Search user's Pins
     * @param \App\DTO\SearchUserPinsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function searchUserPinsListRaw(
        \App\DTO\SearchUserPinsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:read_secret', 'pins:read', 'pins:read_secret', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/search/pins', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Search user's Pins
     * @param \App\DTO\SearchUserPinsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function searchUserPinsList(
        \App\DTO\SearchUserPinsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:read_secret', 'pins:read', 'pins:read_secret', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->searchUserPinsListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\PinsList200Response();
                break;
            case 404:
                /* User not found */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Search user's Pins
     * @param \App\DTO\SearchUserPinsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\PinsList200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function searchUserPinsListResult(
        \App\DTO\SearchUserPinsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:read_secret', 'pins:read', 'pins:read_secret', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\PinsList200Response
    {
        return $this->getSuccessfulContent(...$this->searchUserPinsList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region ssioAccountsGet
    /**
     * Get Salesforce account details including bill-to information.
     * @param \App\DTO\SsioAccountsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function ssioAccountsGetRaw(
        \App\DTO\SsioAccountsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/ssio/accounts', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get Salesforce account details including bill-to information.
     * @param \App\DTO\SsioAccountsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function ssioAccountsGet(
        \App\DTO\SsioAccountsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->ssioAccountsGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\SSIOAccountResponse();
                break;
            case 400:
                /* Invalid request parameter. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get Salesforce account details including bill-to information.
     * @param \App\DTO\SsioAccountsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\SSIOAccountResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function ssioAccountsGetResult(
        \App\DTO\SsioAccountsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\SSIOAccountResponse
    {
        return $this->getSuccessfulContent(...$this->ssioAccountsGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region ssioInsertionOrderCreate
    /**
     * Create insertion order through SSIO.
     * @param \App\DTO\SsioInsertionOrderCreateParameterData $parameters
     * @param \App\DTO\SSIOCreateInsertionOrderRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function ssioInsertionOrderCreateRaw(
        \App\DTO\SsioInsertionOrderCreateParameterData $parameters,
        \App\DTO\SSIOCreateInsertionOrderRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/ad_accounts/{ad_account_id}/ssio/insertion_orders', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create insertion order through SSIO.
     * @param \App\DTO\SsioInsertionOrderCreateParameterData $parameters
     * @param \App\DTO\SSIOCreateInsertionOrderRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function ssioInsertionOrderCreate(
        \App\DTO\SsioInsertionOrderCreateParameterData $parameters,
        \App\DTO\SSIOCreateInsertionOrderRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->ssioInsertionOrderCreateRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\SSIOCreateInsertionOrderResponse();
                break;
            case 400:
                /* Invalid request. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create insertion order through SSIO.
     * @param \App\DTO\SsioInsertionOrderCreateParameterData $parameters
     * @param \App\DTO\SSIOCreateInsertionOrderRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\SSIOCreateInsertionOrderResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function ssioInsertionOrderCreateResult(
        \App\DTO\SsioInsertionOrderCreateParameterData $parameters,
        \App\DTO\SSIOCreateInsertionOrderRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\SSIOCreateInsertionOrderResponse
    {
        return $this->getSuccessfulContent(...$this->ssioInsertionOrderCreate($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region ssioInsertionOrderEdit
    /**
     * Edit insertion order through SSIO.
     * @param \App\DTO\SsioInsertionOrderEditParameterData $parameters
     * @param \App\DTO\SSIOEditInsertionOrderRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function ssioInsertionOrderEditRaw(
        \App\DTO\SsioInsertionOrderEditParameterData $parameters,
        \App\DTO\SSIOEditInsertionOrderRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('PATCH', '/ad_accounts/{ad_account_id}/ssio/insertion_orders', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Edit insertion order through SSIO.
     * @param \App\DTO\SsioInsertionOrderEditParameterData $parameters
     * @param \App\DTO\SSIOEditInsertionOrderRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function ssioInsertionOrderEdit(
        \App\DTO\SsioInsertionOrderEditParameterData $parameters,
        \App\DTO\SSIOEditInsertionOrderRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->ssioInsertionOrderEditRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\SSIOEditInsertionOrderResponse();
                break;
            case 400:
                /* Invalid request. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Edit insertion order through SSIO.
     * @param \App\DTO\SsioInsertionOrderEditParameterData $parameters
     * @param \App\DTO\SSIOEditInsertionOrderRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\SSIOEditInsertionOrderResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function ssioInsertionOrderEditResult(
        \App\DTO\SsioInsertionOrderEditParameterData $parameters,
        \App\DTO\SSIOEditInsertionOrderRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['ads:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\SSIOEditInsertionOrderResponse
    {
        return $this->getSuccessfulContent(...$this->ssioInsertionOrderEdit($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region ssioInsertionOrdersStatusGetByAdAccount
    /**
     * Get insertion order status by ad account id.
     * @param \App\DTO\SsioInsertionOrdersStatusGetByAdAccountParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function ssioInsertionOrdersStatusGetByAdAccountRaw(
        \App\DTO\SsioInsertionOrdersStatusGetByAdAccountParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/ssio/insertion_orders/status', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get insertion order status by ad account id.
     * @param \App\DTO\SsioInsertionOrdersStatusGetByAdAccountParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function ssioInsertionOrdersStatusGetByAdAccount(
        \App\DTO\SsioInsertionOrdersStatusGetByAdAccountParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->ssioInsertionOrdersStatusGetByAdAccountRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\SsioInsertionOrdersStatusGetByAdAccount200Response();
                break;
            case 400:
                /* Invalid request parameter. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get insertion order status by ad account id.
     * @param \App\DTO\SsioInsertionOrdersStatusGetByAdAccountParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\SsioInsertionOrdersStatusGetByAdAccount200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function ssioInsertionOrdersStatusGetByAdAccountResult(
        \App\DTO\SsioInsertionOrdersStatusGetByAdAccountParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\SsioInsertionOrdersStatusGetByAdAccount200Response
    {
        return $this->getSuccessfulContent(...$this->ssioInsertionOrdersStatusGetByAdAccount($parameters, $security, $responseMediaType));
    }
    //endregion

    //region ssioInsertionOrdersStatusGetByPinOrderId
    /**
     * Get insertion order status by pin order id.
     * @param \App\DTO\SsioInsertionOrdersStatusGetByPinOrderIdParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function ssioInsertionOrdersStatusGetByPinOrderIdRaw(
        \App\DTO\SsioInsertionOrdersStatusGetByPinOrderIdParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get insertion order status by pin order id.
     * @param \App\DTO\SsioInsertionOrdersStatusGetByPinOrderIdParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function ssioInsertionOrdersStatusGetByPinOrderId(
        \App\DTO\SsioInsertionOrdersStatusGetByPinOrderIdParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->ssioInsertionOrdersStatusGetByPinOrderIdRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\SSIOInsertionOrderStatusResponse();
                break;
            case 400:
                /* Invalid request parameter. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get insertion order status by pin order id.
     * @param \App\DTO\SsioInsertionOrdersStatusGetByPinOrderIdParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\SSIOInsertionOrderStatusResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function ssioInsertionOrdersStatusGetByPinOrderIdResult(
        \App\DTO\SsioInsertionOrdersStatusGetByPinOrderIdParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\SSIOInsertionOrderStatusResponse
    {
        return $this->getSuccessfulContent(...$this->ssioInsertionOrdersStatusGetByPinOrderId($parameters, $security, $responseMediaType));
    }
    //endregion

    //region ssioOrderLinesGetByAdAccount
    /**
     * Get Salesforce order lines by ad account id.
     * @param \App\DTO\SsioOrderLinesGetByAdAccountParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function ssioOrderLinesGetByAdAccountRaw(
        \App\DTO\SsioOrderLinesGetByAdAccountParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/ssio/order_lines', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get Salesforce order lines by ad account id.
     * @param \App\DTO\SsioOrderLinesGetByAdAccountParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function ssioOrderLinesGetByAdAccount(
        \App\DTO\SsioOrderLinesGetByAdAccountParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->ssioOrderLinesGetByAdAccountRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\SsioOrderLinesGetByAdAccount200Response();
                break;
            case 400:
                /* Invalid request parameter. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get Salesforce order lines by ad account id.
     * @param \App\DTO\SsioOrderLinesGetByAdAccountParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\SsioOrderLinesGetByAdAccount200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function ssioOrderLinesGetByAdAccountResult(
        \App\DTO\SsioOrderLinesGetByAdAccountParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\SsioOrderLinesGetByAdAccount200Response
    {
        return $this->getSuccessfulContent(...$this->ssioOrderLinesGetByAdAccount($parameters, $security, $responseMediaType));
    }
    //endregion

    //region targetingOptionsGet
    /**
     * Get targeting options
     * @param \App\DTO\TargetingOptionsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function targetingOptionsGetRaw(
        \App\DTO\TargetingOptionsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/resources/targeting/{targeting_type}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get targeting options
     * @param \App\DTO\TargetingOptionsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function targetingOptionsGet(
        \App\DTO\TargetingOptionsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->targetingOptionsGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\Collection155();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get targeting options
     * @param \App\DTO\TargetingOptionsGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\Collection155
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function targetingOptionsGetResult(
        \App\DTO\TargetingOptionsGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\Collection155
    {
        return $this->getSuccessfulContent(...$this->targetingOptionsGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region templatesList
    /**
     * List templates
     * @param \App\DTO\TemplatesListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function templatesListRaw(
        \App\DTO\TemplatesListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/templates', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List templates
     * @param \App\DTO\TemplatesListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function templatesList(
        \App\DTO\TemplatesListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->templatesListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\TemplatesList200Response();
                break;
            case 400:
                /* Invalid ad account template parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List templates
     * @param \App\DTO\TemplatesListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\TemplatesList200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function templatesListResult(
        \App\DTO\TemplatesListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\TemplatesList200Response
    {
        return $this->getSuccessfulContent(...$this->templatesList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region termsOfServiceGet
    /**
     * Get terms of service
     * @param \App\DTO\TermsOfServiceGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function termsOfServiceGetRaw(
        \App\DTO\TermsOfServiceGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/ad_accounts/{ad_account_id}/terms_of_service', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get terms of service
     * @param \App\DTO\TermsOfServiceGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function termsOfServiceGet(
        \App\DTO\TermsOfServiceGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->termsOfServiceGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\TermsOfService();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get terms of service
     * @param \App\DTO\TermsOfServiceGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\TermsOfService
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function termsOfServiceGetResult(
        \App\DTO\TermsOfServiceGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\TermsOfService
    {
        return $this->getSuccessfulContent(...$this->termsOfServiceGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region termsRelatedList
    /**
     * List related terms
     * @param \App\DTO\TermsRelatedListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function termsRelatedListRaw(
        \App\DTO\TermsRelatedListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/terms/related', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List related terms
     * @param \App\DTO\TermsRelatedListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function termsRelatedList(
        \App\DTO\TermsRelatedListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->termsRelatedListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\RelatedTerms();
                break;
            case 400:
                /* Invalid terms related parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List related terms
     * @param \App\DTO\TermsRelatedListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\RelatedTerms
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function termsRelatedListResult(
        \App\DTO\TermsRelatedListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\RelatedTerms
    {
        return $this->getSuccessfulContent(...$this->termsRelatedList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region termsSuggestedList
    /**
     * List suggested terms
     * @param \App\DTO\TermsSuggestedListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function termsSuggestedListRaw(
        \App\DTO\TermsSuggestedListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/terms/suggested', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List suggested terms
     * @param \App\DTO\TermsSuggestedListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function termsSuggestedList(
        \App\DTO\TermsSuggestedListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->termsSuggestedListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\Collection159();
                break;
            case 400:
                /* Invalid terms suggested parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List suggested terms
     * @param \App\DTO\TermsSuggestedListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\Collection159
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function termsSuggestedListResult(
        \App\DTO\TermsSuggestedListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\Collection159
    {
        return $this->getSuccessfulContent(...$this->termsSuggestedList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region trendingKeywordsList
    /**
     * List trending keywords
     * @param \App\DTO\TrendingKeywordsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function trendingKeywordsListRaw(
        \App\DTO\TrendingKeywordsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['user_accounts:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/trends/keywords/{region}/top/{trend_type}', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List trending keywords
     * @param \App\DTO\TrendingKeywordsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function trendingKeywordsList(
        \App\DTO\TrendingKeywordsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['user_accounts:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->trendingKeywordsListRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\TrendingKeywordsResponse();
                break;
            case 400:
                /* Invalid trending keywords request parameters */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List trending keywords
     * @param \App\DTO\TrendingKeywordsListParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\TrendingKeywordsResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function trendingKeywordsListResult(
        \App\DTO\TrendingKeywordsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['user_accounts:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\TrendingKeywordsResponse
    {
        return $this->getSuccessfulContent(...$this->trendingKeywordsList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region unverifyWebsiteDelete
    /**
     * Unverify website
     * @param \App\DTO\UnverifyWebsiteDeleteParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function unverifyWebsiteDeleteRaw(
        \App\DTO\UnverifyWebsiteDeleteParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['user_accounts:write', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('DELETE', '/user_account/websites', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Unverify website
     * @param \App\DTO\UnverifyWebsiteDeleteParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function unverifyWebsiteDelete(
        \App\DTO\UnverifyWebsiteDeleteParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['user_accounts:write', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->unverifyWebsiteDeleteRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 204:
                /* Successfully unverified website */
                break;
            case 404:
                /* Website not in user list. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Unverify website
     * @param \App\DTO\UnverifyWebsiteDeleteParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function unverifyWebsiteDeleteResult(
        \App\DTO\UnverifyWebsiteDeleteParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['user_accounts:write', ]],
        string $responseMediaType = 'application/json'
    )
    {
        return $this->getSuccessfulContent(...$this->unverifyWebsiteDelete($parameters, $security, $responseMediaType));
    }
    //endregion

    //region userAccountAnalytics
    /**
     * Get user account analytics
     * @param \App\DTO\UserAccountAnalyticsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function userAccountAnalyticsRaw(
        \App\DTO\UserAccountAnalyticsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['user_accounts:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/user_account/analytics', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get user account analytics
     * @param \App\DTO\UserAccountAnalyticsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function userAccountAnalytics(
        \App\DTO\UserAccountAnalyticsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['user_accounts:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->userAccountAnalyticsRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\Collection169();
                break;
            case 400:
                /* Invalid user accounts analytics parameters. */
                $responseContent = new \App\DTO\Error();
                break;
            case 403:
                /* Not authorized to access the user account analytics. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get user account analytics
     * @param \App\DTO\UserAccountAnalyticsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\Collection169
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function userAccountAnalyticsResult(
        \App\DTO\UserAccountAnalyticsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['user_accounts:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\Collection169
    {
        return $this->getSuccessfulContent(...$this->userAccountAnalytics($parameters, $security, $responseMediaType));
    }
    //endregion

    //region userAccountAnalyticsTopPins
    /**
     * Get user account top pins analytics
     * @param \App\DTO\UserAccountAnalyticsTopPinsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function userAccountAnalyticsTopPinsRaw(
        \App\DTO\UserAccountAnalyticsTopPinsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['pins:read', 'user_accounts:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/user_account/analytics/top_pins', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get user account top pins analytics
     * @param \App\DTO\UserAccountAnalyticsTopPinsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function userAccountAnalyticsTopPins(
        \App\DTO\UserAccountAnalyticsTopPinsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['pins:read', 'user_accounts:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->userAccountAnalyticsTopPinsRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\TopPinsAnalyticsResponse();
                break;
            case 403:
                /* Not authorized to access the user account analytics. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get user account top pins analytics
     * @param \App\DTO\UserAccountAnalyticsTopPinsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\TopPinsAnalyticsResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function userAccountAnalyticsTopPinsResult(
        \App\DTO\UserAccountAnalyticsTopPinsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['pins:read', 'user_accounts:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\TopPinsAnalyticsResponse
    {
        return $this->getSuccessfulContent(...$this->userAccountAnalyticsTopPins($parameters, $security, $responseMediaType));
    }
    //endregion

    //region userAccountAnalyticsTopVideoPins
    /**
     * Get user account top video pins analytics
     * @param \App\DTO\UserAccountAnalyticsTopVideoPinsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function userAccountAnalyticsTopVideoPinsRaw(
        \App\DTO\UserAccountAnalyticsTopVideoPinsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['pins:read', 'user_accounts:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/user_account/analytics/top_video_pins', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get user account top video pins analytics
     * @param \App\DTO\UserAccountAnalyticsTopVideoPinsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function userAccountAnalyticsTopVideoPins(
        \App\DTO\UserAccountAnalyticsTopVideoPinsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['pins:read', 'user_accounts:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->userAccountAnalyticsTopVideoPinsRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\TopVideoPinsAnalyticsResponse();
                break;
            case 403:
                /* Not authorized to access the user account analytics. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get user account top video pins analytics
     * @param \App\DTO\UserAccountAnalyticsTopVideoPinsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\TopVideoPinsAnalyticsResponse
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function userAccountAnalyticsTopVideoPinsResult(
        \App\DTO\UserAccountAnalyticsTopVideoPinsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['pins:read', 'user_accounts:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\TopVideoPinsAnalyticsResponse
    {
        return $this->getSuccessfulContent(...$this->userAccountAnalyticsTopVideoPins($parameters, $security, $responseMediaType));
    }
    //endregion

    //region userAccountFollowedInterests
    /**
     * List following interests
     * @param \App\DTO\UserAccountFollowedInterestsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function userAccountFollowedInterestsRaw(
        \App\DTO\UserAccountFollowedInterestsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['user_accounts:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/users/{username}/interests/follow', $this->getPathParameters($parameters), $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List following interests
     * @param \App\DTO\UserAccountFollowedInterestsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function userAccountFollowedInterests(
        \App\DTO\UserAccountFollowedInterestsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['user_accounts:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->userAccountFollowedInterestsRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\UserAccountFollowedInterests200Response();
                break;
            case 400:
                /* Invalid parameters */
                $responseContent = new \App\DTO\Error();
                break;
            case 401:
                /* Authorization failed */
                $responseContent = new \App\DTO\Error();
                break;
            case 404:
                /* User not found */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List following interests
     * @param \App\DTO\UserAccountFollowedInterestsParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\UserAccountFollowedInterests200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function userAccountFollowedInterestsResult(
        \App\DTO\UserAccountFollowedInterestsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['user_accounts:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\UserAccountFollowedInterests200Response
    {
        return $this->getSuccessfulContent(...$this->userAccountFollowedInterests($parameters, $security, $responseMediaType));
    }
    //endregion

    //region userAccountGet
    /**
     * Get user account
     * @param \App\DTO\UserAccountGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function userAccountGetRaw(
        \App\DTO\UserAccountGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['user_accounts:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/user_account', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get user account
     * @param \App\DTO\UserAccountGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function userAccountGet(
        \App\DTO\UserAccountGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['user_accounts:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->userAccountGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* response */
                $responseContent = new \App\DTO\Account();
                break;
            case 403:
                /* Not authorized to access the user account. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get user account
     * @param \App\DTO\UserAccountGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\Account
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function userAccountGetResult(
        \App\DTO\UserAccountGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['user_accounts:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\Account
    {
        return $this->getSuccessfulContent(...$this->userAccountGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region userFollowingGet
    /**
     * List following
     * @param \App\DTO\UserFollowingGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function userFollowingGetRaw(
        \App\DTO\UserFollowingGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['user_accounts:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/user_account/following', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * List following
     * @param \App\DTO\UserFollowingGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function userFollowingGet(
        \App\DTO\UserFollowingGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['user_accounts:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->userFollowingGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* response */
                $responseContent = new \App\DTO\UserFollowingGet200Response();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List following
     * @param \App\DTO\UserFollowingGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\UserFollowingGet200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function userFollowingGetResult(
        \App\DTO\UserFollowingGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['user_accounts:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\UserFollowingGet200Response
    {
        return $this->getSuccessfulContent(...$this->userFollowingGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region userWebsitesGet
    /**
     * Get user websites
     * @param \App\DTO\UserWebsitesGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function userWebsitesGetRaw(
        \App\DTO\UserWebsitesGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['user_accounts:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/user_account/websites', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get user websites
     * @param \App\DTO\UserWebsitesGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function userWebsitesGet(
        \App\DTO\UserWebsitesGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['user_accounts:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->userWebsitesGetRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\UserWebsitesGet200Response();
                break;
            case 403:
                /* Not authorized to access the user website list. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get user websites
     * @param \App\DTO\UserWebsitesGetParameterData $parameters
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\UserWebsitesGet200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function userWebsitesGetResult(
        \App\DTO\UserWebsitesGetParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['user_accounts:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\UserWebsitesGet200Response
    {
        return $this->getSuccessfulContent(...$this->userWebsitesGet($parameters, $security, $responseMediaType));
    }
    //endregion

    //region verifyWebsiteUpdate
    /**
     * Verify website
     * @param \App\DTO\UserWebsiteVerifyRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function verifyWebsiteUpdateRaw(
        \App\DTO\UserWebsiteVerifyRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['user_accounts:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/user_account/websites', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Verify website
     * @param \App\DTO\UserWebsiteVerifyRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function verifyWebsiteUpdate(
        \App\DTO\UserWebsiteVerifyRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['user_accounts:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->verifyWebsiteUpdateRaw($requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\UserWebsiteSummary();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Verify website
     * @param \App\DTO\UserWebsiteVerifyRequest $requestContent
     * @param iterable<string, string[]> $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\UserWebsiteSummary
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function verifyWebsiteUpdateResult(
        \App\DTO\UserWebsiteVerifyRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['user_accounts:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\UserWebsiteSummary
    {
        return $this->getSuccessfulContent(...$this->verifyWebsiteUpdate($requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region websiteVerificationGet
    /**
     * Get user verification code for website claiming
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function websiteVerificationGetRaw(
        iterable $security = ['pinterest_oauth2' => ['user_accounts:read', ]],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/user_account/websites/verification', [], []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get user verification code for website claiming
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function websiteVerificationGet(
        iterable $security = ['pinterest_oauth2' => ['user_accounts:read', ]],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->websiteVerificationGetRaw($security, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\UserWebsiteVerificationCode();
                break;
            case 403:
                /* Not authorized to access the user verification code for website claiming. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get user verification code for website claiming
     * @param iterable<string, string[]> $security
     * @param string $responseMediaType
     * @return \App\DTO\UserWebsiteVerificationCode
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function websiteVerificationGetResult(
        iterable $security = ['pinterest_oauth2' => ['user_accounts:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\UserWebsiteVerificationCode
    {
        return $this->getSuccessfulContent(...$this->websiteVerificationGet($security, $responseMediaType));
    }
    //endregion
}

