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
 * The version of the OpenAPI document: 5.3.0
 */
class ApiClient extends OAGAC\AbstractApiClient
{
    //region adAccountAnalytics
    /**
     * Get ad account analytics
     * @param \App\DTO\AdAccountAnalyticsParameterData $parameters
     * @param iterable|string[][] $security
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
     * @param iterable|string[][] $security
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
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\Collection12();
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
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get ad account analytics
     * @param \App\DTO\AdAccountAnalyticsParameterData $parameters
     * @param iterable|string[][] $security
     * @param string $responseMediaType
     * @return \App\DTO\Collection12
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function adAccountAnalyticsResult(
        \App\DTO\AdAccountAnalyticsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\Collection12
    {
        return $this->getSuccessfulContent(...$this->adAccountAnalytics($parameters, $security, $responseMediaType));
    }
    //endregion

    //region adAccountsList
    /**
     * List ad accounts
     * @param \App\DTO\AdAccountsListParameterData $parameters
     * @param iterable|string[][] $security
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
     * @param iterable|string[][] $security
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
        switch ($response->getStatusCode())
        {
            case 200:
                /* response */
                $responseContent = new Paginated();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List ad accounts
     * @param \App\DTO\AdAccountsListParameterData $parameters
     * @param iterable|string[][] $security
     * @param string $responseMediaType
     * @return Paginated
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function adAccountsListResult(
        \App\DTO\AdAccountsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): Paginated
    {
        return $this->getSuccessfulContent(...$this->adAccountsList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region adGroupsAnalytics
    /**
     * Get ad group analytics
     * @param \App\DTO\AdGroupsAnalyticsParameterData $parameters
     * @param iterable|string[][] $security
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
     * @param iterable|string[][] $security
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
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\Collection25();
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
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get ad group analytics
     * @param \App\DTO\AdGroupsAnalyticsParameterData $parameters
     * @param iterable|string[][] $security
     * @param string $responseMediaType
     * @return \App\DTO\Collection25
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function adGroupsAnalyticsResult(
        \App\DTO\AdGroupsAnalyticsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\Collection25
    {
        return $this->getSuccessfulContent(...$this->adGroupsAnalytics($parameters, $security, $responseMediaType));
    }
    //endregion

    //region adGroupsList
    /**
     * List ad groups
     * @param \App\DTO\AdGroupsListParameterData $parameters
     * @param iterable|string[][] $security
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
     * @param iterable|string[][] $security
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
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new Paginated();
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
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List ad groups
     * @param \App\DTO\AdGroupsListParameterData $parameters
     * @param iterable|string[][] $security
     * @param string $responseMediaType
     * @return Paginated
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function adGroupsListResult(
        \App\DTO\AdGroupsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): Paginated
    {
        return $this->getSuccessfulContent(...$this->adGroupsList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region adsAnalytics
    /**
     * Get ad analytics
     * @param \App\DTO\AdsAnalyticsParameterData $parameters
     * @param iterable|string[][] $security
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
     * @param iterable|string[][] $security
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
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\Collection33();
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
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get ad analytics
     * @param \App\DTO\AdsAnalyticsParameterData $parameters
     * @param iterable|string[][] $security
     * @param string $responseMediaType
     * @return \App\DTO\Collection33
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function adsAnalyticsResult(
        \App\DTO\AdsAnalyticsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\Collection33
    {
        return $this->getSuccessfulContent(...$this->adsAnalytics($parameters, $security, $responseMediaType));
    }
    //endregion

    //region adsList
    /**
     * List ads
     * @param \App\DTO\AdsListParameterData $parameters
     * @param iterable|string[][] $security
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
     * @param iterable|string[][] $security
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
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new Paginated();
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
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List ads
     * @param \App\DTO\AdsListParameterData $parameters
     * @param iterable|string[][] $security
     * @param string $responseMediaType
     * @return Paginated
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function adsListResult(
        \App\DTO\AdsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): Paginated
    {
        return $this->getSuccessfulContent(...$this->adsList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region analyticsCreateReport
    /**
     * Create async request for an account analytics report
     * @param \App\DTO\AnalyticsCreateReportParameterData $parameters
     * @param \App\DTO\AdsAnalyticsCreateAsyncRequest $requestContent
     * @param iterable|string[][] $security
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
     * @param iterable|string[][] $security
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
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create async request for an account analytics report
     * @param \App\DTO\AnalyticsCreateReportParameterData $parameters
     * @param \App\DTO\AdsAnalyticsCreateAsyncRequest $requestContent
     * @param iterable|string[][] $security
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

    //region analyticsGetReport
    /**
     * Get the account analytics report created by the async call
     * @param \App\DTO\AnalyticsGetReportParameterData $parameters
     * @param iterable|string[][] $security
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
     * @param iterable|string[][] $security
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
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get the account analytics report created by the async call
     * @param \App\DTO\AnalyticsGetReportParameterData $parameters
     * @param iterable|string[][] $security
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

    //region boardSectionsCreate
    /**
     * Create board section
     * @param \App\DTO\BoardSectionsCreateParameterData $parameters
     * @param \App\DTO\BoardSection $requestContent
     * @param iterable|string[][] $security
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
        $request = $this->createRequest('POST', '/boards/{board_id}/sections', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create board section
     * @param \App\DTO\BoardSectionsCreateParameterData $parameters
     * @param \App\DTO\BoardSection $requestContent
     * @param iterable|string[][] $security
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
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create board section
     * @param \App\DTO\BoardSectionsCreateParameterData $parameters
     * @param \App\DTO\BoardSection $requestContent
     * @param iterable|string[][] $security
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
     * @param iterable|string[][] $security
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
        $request = $this->createRequest('DELETE', '/boards/{board_id}/sections/{section_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete board section
     * @param \App\DTO\BoardSectionsDeleteParameterData $parameters
     * @param iterable|string[][] $security
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
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete board section
     * @param \App\DTO\BoardSectionsDeleteParameterData $parameters
     * @param iterable|string[][] $security
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
     * @param iterable|string[][] $security
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
     * @param iterable|string[][] $security
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
        switch ($response->getStatusCode())
        {
            case 200:
                /* response */
                $responseContent = new Paginated();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List board sections
     * @param \App\DTO\BoardSectionsListParameterData $parameters
     * @param iterable|string[][] $security
     * @param string $responseMediaType
     * @return Paginated
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function boardSectionsListResult(
        \App\DTO\BoardSectionsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', ]],
        string $responseMediaType = 'application/json'
    ): Paginated
    {
        return $this->getSuccessfulContent(...$this->boardSectionsList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region boardSectionsListPins
    /**
     * List Pins on board section
     * @param \App\DTO\BoardSectionsListPinsParameterData $parameters
     * @param iterable|string[][] $security
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
     * @param iterable|string[][] $security
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
        switch ($response->getStatusCode())
        {
            case 200:
                /* response */
                $responseContent = new Paginated();
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
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List Pins on board section
     * @param \App\DTO\BoardSectionsListPinsParameterData $parameters
     * @param iterable|string[][] $security
     * @param string $responseMediaType
     * @return Paginated
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function boardSectionsListPinsResult(
        \App\DTO\BoardSectionsListPinsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'pins:read', ]],
        string $responseMediaType = 'application/json'
    ): Paginated
    {
        return $this->getSuccessfulContent(...$this->boardSectionsListPins($parameters, $security, $responseMediaType));
    }
    //endregion

    //region boardSectionsUpdate
    /**
     * Update board section
     * @param \App\DTO\BoardSectionsUpdateParameterData $parameters
     * @param \App\DTO\BoardSection $requestContent
     * @param iterable|string[][] $security
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
        $request = $this->createRequest('PATCH', '/boards/{board_id}/sections/{section_id}', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update board section
     * @param \App\DTO\BoardSectionsUpdateParameterData $parameters
     * @param \App\DTO\BoardSection $requestContent
     * @param iterable|string[][] $security
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
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update board section
     * @param \App\DTO\BoardSectionsUpdateParameterData $parameters
     * @param \App\DTO\BoardSection $requestContent
     * @param iterable|string[][] $security
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
     * @param \App\DTO\Board $requestContent
     * @param iterable|string[][] $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function boardsCreateRaw(
        \App\DTO\Board $requestContent,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/boards', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create board
     * @param \App\DTO\Board $requestContent
     * @param iterable|string[][] $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function boardsCreate(
        \App\DTO\Board $requestContent,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->boardsCreateRaw($requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
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
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create board
     * @param \App\DTO\Board $requestContent
     * @param iterable|string[][] $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\Board
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function boardsCreateResult(
        \App\DTO\Board $requestContent,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\Board
    {
        return $this->getSuccessfulContent(...$this->boardsCreate($requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region boardsDelete
    /**
     * Delete board
     * @param \App\DTO\BoardsDeleteParameterData $parameters
     * @param iterable|string[][] $security
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
        $request = $this->createRequest('DELETE', '/boards/{board_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete board
     * @param \App\DTO\BoardsDeleteParameterData $parameters
     * @param iterable|string[][] $security
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
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete board
     * @param \App\DTO\BoardsDeleteParameterData $parameters
     * @param iterable|string[][] $security
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
     * @param iterable|string[][] $security
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
        $request = $this->createRequest('GET', '/boards/{board_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get board
     * @param \App\DTO\BoardsGetParameterData $parameters
     * @param iterable|string[][] $security
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
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get board
     * @param \App\DTO\BoardsGetParameterData $parameters
     * @param iterable|string[][] $security
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
     * @param iterable|string[][] $security
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
     * @param iterable|string[][] $security
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
        switch ($response->getStatusCode())
        {
            case 200:
                /* response */
                $responseContent = new Paginated();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List boards
     * @param \App\DTO\BoardsListParameterData $parameters
     * @param iterable|string[][] $security
     * @param string $responseMediaType
     * @return Paginated
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function boardsListResult(
        \App\DTO\BoardsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', ]],
        string $responseMediaType = 'application/json'
    ): Paginated
    {
        return $this->getSuccessfulContent(...$this->boardsList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region boardsListPins
    /**
     * List Pins on board
     * @param \App\DTO\BoardsListPinsParameterData $parameters
     * @param iterable|string[][] $security
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
     * @param iterable|string[][] $security
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
        switch ($response->getStatusCode())
        {
            case 200:
                /* response */
                $responseContent = new Paginated();
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
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List Pins on board
     * @param \App\DTO\BoardsListPinsParameterData $parameters
     * @param iterable|string[][] $security
     * @param string $responseMediaType
     * @return Paginated
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function boardsListPinsResult(
        \App\DTO\BoardsListPinsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'pins:read', ]],
        string $responseMediaType = 'application/json'
    ): Paginated
    {
        return $this->getSuccessfulContent(...$this->boardsListPins($parameters, $security, $responseMediaType));
    }
    //endregion

    //region boardsUpdate
    /**
     * Update board
     * @param \App\DTO\BoardsUpdateParameterData $parameters
     * @param \App\DTO\BoardUpdate $requestContent
     * @param iterable|string[][] $security
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
        $request = $this->createRequest('PATCH', '/boards/{board_id}', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update board
     * @param \App\DTO\BoardsUpdateParameterData $parameters
     * @param \App\DTO\BoardUpdate $requestContent
     * @param iterable|string[][] $security
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
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update board
     * @param \App\DTO\BoardsUpdateParameterData $parameters
     * @param \App\DTO\BoardUpdate $requestContent
     * @param iterable|string[][] $security
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

    //region campaignsAnalytics
    /**
     * Get campaign analytics
     * @param \App\DTO\CampaignsAnalyticsParameterData $parameters
     * @param iterable|string[][] $security
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
     * @param iterable|string[][] $security
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
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\Collection18();
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
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get campaign analytics
     * @param \App\DTO\CampaignsAnalyticsParameterData $parameters
     * @param iterable|string[][] $security
     * @param string $responseMediaType
     * @return \App\DTO\Collection18
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function campaignsAnalyticsResult(
        \App\DTO\CampaignsAnalyticsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\Collection18
    {
        return $this->getSuccessfulContent(...$this->campaignsAnalytics($parameters, $security, $responseMediaType));
    }
    //endregion

    //region campaignsList
    /**
     * List campaigns
     * @param \App\DTO\CampaignsListParameterData $parameters
     * @param iterable|string[][] $security
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
     * @param iterable|string[][] $security
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
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new Paginated();
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
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List campaigns
     * @param \App\DTO\CampaignsListParameterData $parameters
     * @param iterable|string[][] $security
     * @param string $responseMediaType
     * @return Paginated
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function campaignsListResult(
        \App\DTO\CampaignsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): Paginated
    {
        return $this->getSuccessfulContent(...$this->campaignsList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region catalogsProductGroupsCreate
    /**
     * Create product group
     * @param \App\DTO\CatalogsProductGroupCreateRequest $requestContent
     * @param iterable|string[][] $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function catalogsProductGroupsCreateRaw(
        \App\DTO\CatalogsProductGroupCreateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['catalogs:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/catalogs/product_groups', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create product group
     * @param \App\DTO\CatalogsProductGroupCreateRequest $requestContent
     * @param iterable|string[][] $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function catalogsProductGroupsCreate(
        \App\DTO\CatalogsProductGroupCreateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['catalogs:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->catalogsProductGroupsCreateRaw($requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        switch ($response->getStatusCode())
        {
            case 201:
                /* Success */
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
                /* Forbidden. Account not approved for feed mutations yet. */
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
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create product group
     * @param \App\DTO\CatalogsProductGroupCreateRequest $requestContent
     * @param iterable|string[][] $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return object
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function catalogsProductGroupsCreateResult(
        \App\DTO\CatalogsProductGroupCreateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['catalogs:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): object
    {
        return $this->getSuccessfulContent(...$this->catalogsProductGroupsCreate($requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region catalogsProductGroupsDelete
    /**
     * Delete product group
     * @param \App\DTO\CatalogsProductGroupsDeleteParameterData $parameters
     * @param iterable|string[][] $security
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
        $request = $this->createRequest('DELETE', '/catalogs/product_groups/{product_group_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete product group
     * @param \App\DTO\CatalogsProductGroupsDeleteParameterData $parameters
     * @param iterable|string[][] $security
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
                /* Forbidden. Account not approved for feed mutations yet. */
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
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete product group
     * @param \App\DTO\CatalogsProductGroupsDeleteParameterData $parameters
     * @param iterable|string[][] $security
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

    //region catalogsProductGroupsList
    /**
     * Get product groups list
     * @param \App\DTO\CatalogsProductGroupsListParameterData $parameters
     * @param iterable|string[][] $security
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
     * Get product groups list
     * @param \App\DTO\CatalogsProductGroupsListParameterData $parameters
     * @param iterable|string[][] $security
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
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new Paginated();
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
                /* Forbidden. Account not approved for feed mutations yet. */
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
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get product groups list
     * @param \App\DTO\CatalogsProductGroupsListParameterData $parameters
     * @param iterable|string[][] $security
     * @param string $responseMediaType
     * @return Paginated
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function catalogsProductGroupsListResult(
        \App\DTO\CatalogsProductGroupsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', ]],
        string $responseMediaType = 'application/json'
    ): Paginated
    {
        return $this->getSuccessfulContent(...$this->catalogsProductGroupsList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region catalogsProductGroupsUpdate
    /**
     * Update product group
     * @param \App\DTO\CatalogsProductGroupsUpdateParameterData $parameters
     * @param \App\DTO\CatalogsProductGroupUpdateRequest $requestContent
     * @param iterable|string[][] $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function catalogsProductGroupsUpdateRaw(
        \App\DTO\CatalogsProductGroupsUpdateParameterData $parameters,
        \App\DTO\CatalogsProductGroupUpdateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['catalogs:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('PATCH', '/catalogs/product_groups/{product_group_id}', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update product group
     * @param \App\DTO\CatalogsProductGroupsUpdateParameterData $parameters
     * @param \App\DTO\CatalogsProductGroupUpdateRequest $requestContent
     * @param iterable|string[][] $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function catalogsProductGroupsUpdate(
        \App\DTO\CatalogsProductGroupsUpdateParameterData $parameters,
        \App\DTO\CatalogsProductGroupUpdateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['catalogs:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->catalogsProductGroupsUpdateRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\CatalogsProductGroup();
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
            case 409:
                /* Conflict. Can't update this catalogs product group to this value. */
                $responseContent = new \App\DTO\Error();
                break;
            default:
                /* Unexpected error. */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update product group
     * @param \App\DTO\CatalogsProductGroupsUpdateParameterData $parameters
     * @param \App\DTO\CatalogsProductGroupUpdateRequest $requestContent
     * @param iterable|string[][] $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\CatalogsProductGroup
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function catalogsProductGroupsUpdateResult(
        \App\DTO\CatalogsProductGroupsUpdateParameterData $parameters,
        \App\DTO\CatalogsProductGroupUpdateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['catalogs:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\CatalogsProductGroup
    {
        return $this->getSuccessfulContent(...$this->catalogsProductGroupsUpdate($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region feedProcessingResultsList
    /**
     * List processing results for a given feed
     * @param \App\DTO\FeedProcessingResultsListParameterData $parameters
     * @param iterable|string[][] $security
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
     * @param iterable|string[][] $security
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
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new Paginated();
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
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List processing results for a given feed
     * @param \App\DTO\FeedProcessingResultsListParameterData $parameters
     * @param iterable|string[][] $security
     * @param string $responseMediaType
     * @return Paginated
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function feedProcessingResultsListResult(
        \App\DTO\FeedProcessingResultsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', ]],
        string $responseMediaType = 'application/json'
    ): Paginated
    {
        return $this->getSuccessfulContent(...$this->feedProcessingResultsList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region feedsCreate
    /**
     * Create feed
     * @param \App\DTO\CatalogsFeedsCreateRequest $requestContent
     * @param iterable|string[][] $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function feedsCreateRaw(
        \App\DTO\CatalogsFeedsCreateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', 'catalogs:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/catalogs/feeds', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create feed
     * @param \App\DTO\CatalogsFeedsCreateRequest $requestContent
     * @param iterable|string[][] $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function feedsCreate(
        \App\DTO\CatalogsFeedsCreateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', 'catalogs:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->feedsCreateRaw($requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
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
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create feed
     * @param \App\DTO\CatalogsFeedsCreateRequest $requestContent
     * @param iterable|string[][] $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\CatalogsFeed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function feedsCreateResult(
        \App\DTO\CatalogsFeedsCreateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', 'catalogs:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\CatalogsFeed
    {
        return $this->getSuccessfulContent(...$this->feedsCreate($requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region feedsDelete
    /**
     * Delete feed
     * @param \App\DTO\FeedsDeleteParameterData $parameters
     * @param iterable|string[][] $security
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
        $request = $this->createRequest('DELETE', '/catalogs/feeds/{feed_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete feed
     * @param \App\DTO\FeedsDeleteParameterData $parameters
     * @param iterable|string[][] $security
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
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete feed
     * @param \App\DTO\FeedsDeleteParameterData $parameters
     * @param iterable|string[][] $security
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
     * @param iterable|string[][] $security
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
        $request = $this->createRequest('GET', '/catalogs/feeds/{feed_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get feed
     * @param \App\DTO\FeedsGetParameterData $parameters
     * @param iterable|string[][] $security
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
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get feed
     * @param \App\DTO\FeedsGetParameterData $parameters
     * @param iterable|string[][] $security
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
     * @param iterable|string[][] $security
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
     * @param iterable|string[][] $security
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
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new Paginated();
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
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List feeds
     * @param \App\DTO\FeedsListParameterData $parameters
     * @param iterable|string[][] $security
     * @param string $responseMediaType
     * @return Paginated
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function feedsListResult(
        \App\DTO\FeedsListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', ]],
        string $responseMediaType = 'application/json'
    ): Paginated
    {
        return $this->getSuccessfulContent(...$this->feedsList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region feedsUpdate
    /**
     * Update feed
     * @param \App\DTO\FeedsUpdateParameterData $parameters
     * @param \App\DTO\CatalogsFeedsUpdateRequest $requestContent
     * @param iterable|string[][] $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function feedsUpdateRaw(
        \App\DTO\FeedsUpdateParameterData $parameters,
        \App\DTO\CatalogsFeedsUpdateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', 'catalogs:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('PATCH', '/catalogs/feeds/{feed_id}', $this->getPathParameters($parameters), []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Update feed
     * @param \App\DTO\FeedsUpdateParameterData $parameters
     * @param \App\DTO\CatalogsFeedsUpdateRequest $requestContent
     * @param iterable|string[][] $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function feedsUpdate(
        \App\DTO\FeedsUpdateParameterData $parameters,
        \App\DTO\CatalogsFeedsUpdateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', 'catalogs:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->feedsUpdateRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
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
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Update feed
     * @param \App\DTO\FeedsUpdateParameterData $parameters
     * @param \App\DTO\CatalogsFeedsUpdateRequest $requestContent
     * @param iterable|string[][] $security
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
        \App\DTO\CatalogsFeedsUpdateRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', 'catalogs:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\CatalogsFeed
    {
        return $this->getSuccessfulContent(...$this->feedsUpdate($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region itemsBatchGet
    /**
     * Get catalogs items batch
     * @param \App\DTO\ItemsBatchGetParameterData $parameters
     * @param iterable|string[][] $security
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
        $request = $this->createRequest('GET', '/catalogs/items/batch/{batch_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get catalogs items batch
     * @param \App\DTO\ItemsBatchGetParameterData $parameters
     * @param iterable|string[][] $security
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
        switch ($response->getStatusCode())
        {
            case 200:
                /* Response containing the requested catalogs items batch */
                $responseContent = new \App\DTO\CatalogsItemsBatch();
                break;
            case 401:
                /* Not authorized to access catalogs items batch */
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
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get catalogs items batch
     * @param \App\DTO\ItemsBatchGetParameterData $parameters
     * @param iterable|string[][] $security
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
     * Perform an operation on an item batch
     * @param \App\DTO\CatalogsItemsBatchRequest $requestContent
     * @param iterable|string[][] $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function itemsBatchPostRaw(
        \App\DTO\CatalogsItemsBatchRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', 'catalogs:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/catalogs/items/batch', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Perform an operation on an item batch
     * @param \App\DTO\CatalogsItemsBatchRequest $requestContent
     * @param iterable|string[][] $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function itemsBatchPost(
        \App\DTO\CatalogsItemsBatchRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', 'catalogs:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->itemsBatchPostRaw($requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Response containing the requested catalogs items batch */
                $responseContent = new \App\DTO\CatalogsItemsBatch();
                break;
            case 401:
                /* Not authorized to post catalogs items */
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
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Perform an operation on an item batch
     * @param \App\DTO\CatalogsItemsBatchRequest $requestContent
     * @param iterable|string[][] $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\CatalogsItemsBatch
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function itemsBatchPostResult(
        \App\DTO\CatalogsItemsBatchRequest $requestContent,
        iterable $security = ['pinterest_oauth2' => ['catalogs:read', 'catalogs:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\CatalogsItemsBatch
    {
        return $this->getSuccessfulContent(...$this->itemsBatchPost($requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region itemsGet
    /**
     * Get catalogs items
     * @param \App\DTO\ItemsGetParameterData $parameters
     * @param iterable|string[][] $security
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
     * @param iterable|string[][] $security
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
        switch ($response->getStatusCode())
        {
            case 200:
                /* Response containing the requested catalogs items */
                $responseContent = new \App\DTO\CatalogsItems();
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
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get catalogs items
     * @param \App\DTO\ItemsGetParameterData $parameters
     * @param iterable|string[][] $security
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

    //region mediaCreate
    /**
     * Register media upload
     * @param \App\DTO\MediaUploadRequest $requestContent
     * @param iterable|string[][] $security
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
     * @param iterable|string[][] $security
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
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Register media upload
     * @param \App\DTO\MediaUploadRequest $requestContent
     * @param iterable|string[][] $security
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
     * @param iterable|string[][] $security
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
     * @param iterable|string[][] $security
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
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get media upload details
     * @param \App\DTO\MediaGetParameterData $parameters
     * @param iterable|string[][] $security
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
     * @param iterable|string[][] $security
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
     * @param iterable|string[][] $security
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
        switch ($response->getStatusCode())
        {
            case 200:
                /* response */
                $responseContent = new Paginated();
                break;
            default:
                /* Unexpected error */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * List media uploads
     * @param \App\DTO\MediaListParameterData $parameters
     * @param iterable|string[][] $security
     * @param string $responseMediaType
     * @return Paginated
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function mediaListResult(
        \App\DTO\MediaListParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['pins:read', ]],
        string $responseMediaType = 'application/json'
    ): Paginated
    {
        return $this->getSuccessfulContent(...$this->mediaList($parameters, $security, $responseMediaType));
    }
    //endregion

    //region oauthToken
    /**
     * Generate OAuth access token
     * @param \App\DTO\OauthAccessTokenRequest $requestContent
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function oauthTokenRaw(
        \App\DTO\OauthAccessTokenRequest $requestContent,
        string $requestMediaType = 'application/x-www-form-urlencoded',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/oauth/token', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Generate OAuth access token
     * @param \App\DTO\OauthAccessTokenRequest $requestContent
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function oauthToken(
        \App\DTO\OauthAccessTokenRequest $requestContent,
        string $requestMediaType = 'application/x-www-form-urlencoded',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->oauthTokenRaw($requestContent, $requestMediaType, $responseMediaType);
        $responseContent = null;
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
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Generate OAuth access token
     * @param \App\DTO\OauthAccessTokenRequest $requestContent
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
        string $requestMediaType = 'application/x-www-form-urlencoded',
        string $responseMediaType = 'application/json'
    ): \App\DTO\OauthAccessTokenResponse
    {
        return $this->getSuccessfulContent(...$this->oauthToken($requestContent, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region pinsAnalytics
    /**
     * Get Pin analytics
     * @param \App\DTO\PinsAnalyticsParameterData $parameters
     * @param iterable|string[][] $security
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
     * @param iterable|string[][] $security
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
        switch ($response->getStatusCode())
        {
            case 200:
                /* response */
                $responseContent = new \App\DTO\Collection9();
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
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get Pin analytics
     * @param \App\DTO\PinsAnalyticsParameterData $parameters
     * @param iterable|string[][] $security
     * @param string $responseMediaType
     * @return \App\DTO\Collection9
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function pinsAnalyticsResult(
        \App\DTO\PinsAnalyticsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'pins:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\Collection9
    {
        return $this->getSuccessfulContent(...$this->pinsAnalytics($parameters, $security, $responseMediaType));
    }
    //endregion

    //region pinsCreate
    /**
     * Create Pin
     * @param \App\DTO\Pin $requestContent
     * @param iterable|string[][] $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function pinsCreateRaw(
        \App\DTO\Pin $requestContent,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:write', 'pins:read', 'pins:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/pins', [], []);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Create Pin
     * @param \App\DTO\Pin $requestContent
     * @param iterable|string[][] $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function pinsCreate(
        \App\DTO\Pin $requestContent,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:write', 'pins:read', 'pins:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->pinsCreateRaw($requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
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
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Create Pin
     * @param \App\DTO\Pin $requestContent
     * @param iterable|string[][] $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return \App\DTO\Pin
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function pinsCreateResult(
        \App\DTO\Pin $requestContent,
        iterable $security = ['pinterest_oauth2' => ['boards:read', 'boards:write', 'pins:read', 'pins:write', ]],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/json'
    ): \App\DTO\Pin
    {
        return $this->getSuccessfulContent(...$this->pinsCreate($requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region pinsDelete
    /**
     * Delete Pin
     * @param \App\DTO\PinsDeleteParameterData $parameters
     * @param iterable|string[][] $security
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
        $request = $this->createRequest('DELETE', '/pins/{pin_id}', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Delete Pin
     * @param \App\DTO\PinsDeleteParameterData $parameters
     * @param iterable|string[][] $security
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
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Delete Pin
     * @param \App\DTO\PinsDeleteParameterData $parameters
     * @param iterable|string[][] $security
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
     * @param iterable|string[][] $security
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
     * @param iterable|string[][] $security
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
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get Pin
     * @param \App\DTO\PinsGetParameterData $parameters
     * @param iterable|string[][] $security
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

    //region productGroupsAnalytics
    /**
     * Get product group analytics
     * @param \App\DTO\ProductGroupsAnalyticsParameterData $parameters
     * @param iterable|string[][] $security
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
     * @param iterable|string[][] $security
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
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\Collection37();
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
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get product group analytics
     * @param \App\DTO\ProductGroupsAnalyticsParameterData $parameters
     * @param iterable|string[][] $security
     * @param string $responseMediaType
     * @return \App\DTO\Collection37
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function productGroupsAnalyticsResult(
        \App\DTO\ProductGroupsAnalyticsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['ads:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\Collection37
    {
        return $this->getSuccessfulContent(...$this->productGroupsAnalytics($parameters, $security, $responseMediaType));
    }
    //endregion

    //region userAccountAnalytics
    /**
     * Get user account analytics
     * @param \App\DTO\UserAccountAnalyticsParameterData $parameters
     * @param iterable|string[][] $security
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
     * @param iterable|string[][] $security
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
        switch ($response->getStatusCode())
        {
            case 200:
                /* Success */
                $responseContent = new \App\DTO\Collection9();
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
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get user account analytics
     * @param \App\DTO\UserAccountAnalyticsParameterData $parameters
     * @param iterable|string[][] $security
     * @param string $responseMediaType
     * @return \App\DTO\Collection9
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function userAccountAnalyticsResult(
        \App\DTO\UserAccountAnalyticsParameterData $parameters,
        iterable $security = ['pinterest_oauth2' => ['user_accounts:read', ]],
        string $responseMediaType = 'application/json'
    ): \App\DTO\Collection9
    {
        return $this->getSuccessfulContent(...$this->userAccountAnalytics($parameters, $security, $responseMediaType));
    }
    //endregion

    //region userAccountGet
    /**
     * Get user account
     * @param \App\DTO\UserAccountGetParameterData $parameters
     * @param iterable|string[][] $security
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
     * @param iterable|string[][] $security
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
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get user account
     * @param \App\DTO\UserAccountGetParameterData $parameters
     * @param iterable|string[][] $security
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
}

