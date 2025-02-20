<?php
/**
 * AdvancedAuctionApiInterface
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
 * The version of the OpenAPI document: 5.14.0
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
use OpenAPI\Server\Model\AdvancedAuctionItems;
use OpenAPI\Server\Model\AdvancedAuctionItemsGetRequest;
use OpenAPI\Server\Model\AdvancedAuctionItemsSubmitRequest;
use OpenAPI\Server\Model\AdvancedAuctionProcessedItems;
use OpenAPI\Server\Model\Error;

/**
 * AdvancedAuctionApiInterface Interface Doc Comment
 *
 * @category Interface
 * @package  OpenAPI\Server\Api
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */
interface AdvancedAuctionApiInterface
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
     * Operation advancedAuctionItemsGetPost
     *
     * Get item bid options (POST)
     *
     * @param  AdvancedAuctionItemsGetRequest $advancedAuctionItemsGetRequest  Request object used to get bid options values for a batch of retail catalog items (required)
     * @param  string|null $adAccountId  Unique identifier of an ad account. (optional)
     * @param  int     &$responseCode    The HTTP Response Code
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return array|object|null
     */
    public function advancedAuctionItemsGetPost(
        AdvancedAuctionItemsGetRequest $advancedAuctionItemsGetRequest,
        ?string $adAccountId,
        int &$responseCode,
        array &$responseHeaders
    ): array|object|null;

    /**
     * Operation advancedAuctionItemsSubmitPost
     *
     * Operate on item level bid options
     *
     * @param  AdvancedAuctionItemsSubmitRequest $advancedAuctionItemsSubmitRequest  Request object used to upsert or delete bid options for a batch of retail catalog items (required)
     * @param  string|null $adAccountId  Unique identifier of an ad account. (optional)
     * @param  int     &$responseCode    The HTTP Response Code
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return array|object|null
     */
    public function advancedAuctionItemsSubmitPost(
        AdvancedAuctionItemsSubmitRequest $advancedAuctionItemsSubmitRequest,
        ?string $adAccountId,
        int &$responseCode,
        array &$responseHeaders
    ): array|object|null;
}
