<?php

/**
 * OauthController
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server\Controller
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

namespace OpenAPI\Server\Controller;

use \Exception;
use JMS\Serializer\Exception\RuntimeException as SerializerRuntimeException;
use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\HttpKernel\Exception\HttpException;
use Symfony\Component\Validator\Constraints as Assert;
use OpenAPI\Server\Api\OauthApiInterface;
use OpenAPI\Server\Model\Error;
use OpenAPI\Server\Model\OauthAccessTokenResponse;

/**
 * OauthController Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Server\Controller
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */
class OauthController extends Controller
{

    /**
     * Operation oauthToken
     *
     * Generate OAuth access token
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function oauthTokenAction(Request $request)
    {
        // Figure out what data format to return to the client
        $produces = ['application/json'];
        // Figure out what the client accepts
        $clientAccepts = $request->headers->has('Accept')?$request->headers->get('Accept'):'*/*';
        $responseFormat = $this->getOutputFormat($clientAccepts, $produces);
        if ($responseFormat === null) {
            return new Response('', 406);
        }

        // Handle authentication
        // Authentication 'basic' required
        // HTTP basic authentication required
        $securitybasic = $request->headers->get('authorization');

        // Read out all input parameter values into variables
        $grantType = $request->request->get('grantType');

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $grantType = $this->deserialize($grantType, 'string', 'string');
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Choice([ "authorization_code", "refresh_token", "client_credentials" ]);
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($grantType, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            // Set authentication method 'basic'
            $handler->setbasic($securitybasic);

            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];

            $result = $handler->oauthToken($grantType, $responseCode, $responseHeaders);

            $message = match($responseCode) {
                200 => 'response',
                0 => 'Unexpected error',
                default => 'Unexpected error',
            };

            return new Response(
                $result !== null ?$this->serialize($result, $responseFormat):'',
                $responseCode,
                array_merge(
                    $responseHeaders,
                    [
                        'Content-Type' => $responseFormat,
                        'X-OpenAPI-Message' => $message
                    ]
                )
            );
        } catch (\Throwable $fallthrough) {
            return $this->createErrorResponse(new HttpException(500, 'An unsuspected error occurred.', $fallthrough));
        }
    }

    /**
     * Returns the handler for this API controller.
     * @return OauthApiInterface
     */
    public function getApiHandler()
    {
        return $this->apiServer->getApiHandler('oauth');
    }
}
