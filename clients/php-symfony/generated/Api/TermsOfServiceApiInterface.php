<?php
/**
 * TermsOfServiceApiInterface
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
use OpenAPI\Server\Model\Error;
use OpenAPI\Server\Model\TermsOfService;

/**
 * TermsOfServiceApiInterface Interface Doc Comment
 *
 * @category Interface
 * @package  OpenAPI\Server\Api
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */
interface TermsOfServiceApiInterface
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
     * Operation termsOfServiceGet
     *
     * Get terms of service
     *
     * @param  string $adAccountId  Unique identifier of an ad account. (required)
     * @param  bool $includeHtml  Return HTML in TOS text. (optional, default to false)
     * @param  string|null $tosType  Request type. (optional)
     * @param  int     &$responseCode    The HTTP Response Code
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return array|object|null
     */
    public function termsOfServiceGet(
        string $adAccountId,
        bool $includeHtml,
        ?string $tosType,
        int &$responseCode,
        array &$responseHeaders
    ): array|object|null;
}