<?php
/**
 * ResourcesApiInterface
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\Api;

use Symfony\Component\HttpFoundation\File\UploadedFile;
use OpenAPI\Server\Model\AdAccountsCountryResponse;
use OpenAPI\Server\Model\BookClosedResponse;
use OpenAPI\Server\Model\DeliveryMetricsResponse;
use OpenAPI\Server\Model\Error;
use OpenAPI\Server\Model\SingleInterestTargetingOptionResponse;

/**
 * ResourcesApiInterface Interface Doc Comment
 *
 * @category Interface
 * @package  OpenAPI\Server\Api
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */
interface ResourcesApiInterface
{

    /**
     * Sets authentication method pinterest_oauth2
     *
     * @param string|null $value Value of the pinterest_oauth2 authentication method.
     *
     * @return void
     */
    public function setpinterest_oauth2(?string $value): void;

    /**
     * Operation adAccountCountriesGet
     *
     * Get ad accounts countries
     *
     * @param  int     &$responseCode    The HTTP Response Code
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return array|object|null
     */
    public function adAccountCountriesGet(
        int &$responseCode,
        array &$responseHeaders
    ): array|object|null;

    /**
     * Operation deliveryMetricsGet
     *
     * Get available metrics' definitions
     *
     * @param  string|null $reportType  Report type. (optional)
     * @param  int     &$responseCode    The HTTP Response Code
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return array|object|null
     */
    public function deliveryMetricsGet(
        ?string $reportType,
        int &$responseCode,
        array &$responseHeaders
    ): array|object|null;

    /**
     * Operation interestTargetingOptionsGet
     *
     * Get interest details
     *
     * @param  string $interestId  Unique identifier of an interest. (required)
     * @param  int     &$responseCode    The HTTP Response Code
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return array|object|null
     */
    public function interestTargetingOptionsGet(
        string $interestId,
        int &$responseCode,
        array &$responseHeaders
    ): array|object|null;

    /**
     * Operation leadFormQuestionsGet
     *
     * Get lead form questions
     *
     * @param  int     &$responseCode    The HTTP Response Code
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return void
     */
    public function leadFormQuestionsGet(
        int &$responseCode,
        array &$responseHeaders
    ): void;

    /**
     * Operation metricsReadyStateGet
     *
     * Get metrics ready state
     *
     * @param  string $date  Analytics reports request date (UTC). Format: YYYY-MM-DD (required)
     * @param  int     &$responseCode    The HTTP Response Code
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return array|object|null
     */
    public function metricsReadyStateGet(
        string $date,
        int &$responseCode,
        array &$responseHeaders
    ): array|object|null;

    /**
     * Operation targetingOptionsGet
     *
     * Get targeting options
     *
     * @param  string $targetingType  Public targeting type. (required)
     * @param  string|null $clientId  Client ID. (optional)
     * @param  string|null $oauthSignature  Oauth signature (optional)
     * @param  string|null $timestamp  Timestamp (optional)
     * @param  int     &$responseCode    The HTTP Response Code
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return array|object|null
     */
    public function targetingOptionsGet(
        string $targetingType,
        ?string $clientId,
        ?string $oauthSignature,
        ?string $timestamp,
        int &$responseCode,
        array &$responseHeaders
    ): array|object|null;
}