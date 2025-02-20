<?php

/**
 * AudienceSharingController
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
use OpenAPI\Server\Api\AudienceSharingApiInterface;
use OpenAPI\Server\Model\AdAccountsAudiencesSharedAccountsList200Response;
use OpenAPI\Server\Model\AudienceAccountType;
use OpenAPI\Server\Model\AudiencesList200Response;
use OpenAPI\Server\Model\BusinessSharedAudience;
use OpenAPI\Server\Model\BusinessSharedAudienceResponse;
use OpenAPI\Server\Model\Error;
use OpenAPI\Server\Model\SharedAudience;
use OpenAPI\Server\Model\SharedAudienceResponse;

/**
 * AudienceSharingController Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Server\Controller
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */
class AudienceSharingController extends Controller
{

    /**
     * Operation adAccountsAudiencesSharedAccountsList
     *
     * List accounts with access to an audience owned by an ad account
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function adAccountsAudiencesSharedAccountsListAction(Request $request, $adAccountId)
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
        // Authentication 'pinterest_oauth2' required
        // Oauth required
        $securitypinterest_oauth2 = $request->headers->get('authorization');

        // Read out all input parameter values into variables
        $audienceId = $request->query->get('audienceId');
        $accountType = $request->query->get('accountType');
        $pageSize = $request->query->get('pageSize', 25);
        $bookmark = $request->query->get('bookmark');

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $adAccountId = $this->deserialize($adAccountId, 'string', 'string');
            $audienceId = $this->deserialize($audienceId, 'string', 'string');
            $accountType = $this->deserialize($accountType, '\OpenAPI\Server\Model\OpenAPI\Server\Model\AudienceAccountType', 'string');
            $pageSize = $this->deserialize($pageSize, 'int', 'string');
            $bookmark = $this->deserialize($bookmark, 'string', 'string');
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $asserts[] = new Assert\Length([
            'max' => 18
        ]);
        $asserts[] = new Assert\Regex("/^\\d+$/");
        $response = $this->validate($adAccountId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $asserts[] = new Assert\Length([
            'max' => 18
        ]);
        $asserts[] = new Assert\Regex("/^\\d+$/");
        $response = $this->validate($audienceId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("\OpenAPI\Server\Model\OpenAPI\Server\Model\AudienceAccountType");
        $response = $this->validate($accountType, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("int");
        $asserts[] = new Assert\GreaterThanOrEqual(1);
        $asserts[] = new Assert\LessThanOrEqual(250);
        $response = $this->validate($pageSize, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($bookmark, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            // Set authentication method 'pinterest_oauth2'
            $handler->setpinterest_oauth2($securitypinterest_oauth2);

            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];

            $result = $handler->adAccountsAudiencesSharedAccountsList($adAccountId, $audienceId, $accountType, $pageSize, $bookmark, $responseCode, $responseHeaders);

            $message = match($responseCode) {
                200 => 'Success',
                400 => 'Invalid ad account audiences shared accounts parameters.',
                404 => 'Shared accounts not found.',
                0 => 'Unexpected error.',
                default => 'Unexpected error.',
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
     * Operation businessAccountAudiencesSharedAccountsList
     *
     * List accounts with access to an audience owned by a business
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function businessAccountAudiencesSharedAccountsListAction(Request $request, $businessId)
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
        // Authentication 'pinterest_oauth2' required
        // Oauth required
        $securitypinterest_oauth2 = $request->headers->get('authorization');

        // Read out all input parameter values into variables
        $audienceId = $request->query->get('audienceId');
        $accountType = $request->query->get('accountType');
        $pageSize = $request->query->get('pageSize', 25);
        $bookmark = $request->query->get('bookmark');

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $businessId = $this->deserialize($businessId, 'string', 'string');
            $audienceId = $this->deserialize($audienceId, 'string', 'string');
            $accountType = $this->deserialize($accountType, '\OpenAPI\Server\Model\OpenAPI\Server\Model\AudienceAccountType', 'string');
            $pageSize = $this->deserialize($pageSize, 'int', 'string');
            $bookmark = $this->deserialize($bookmark, 'string', 'string');
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $asserts[] = new Assert\Length([
            'max' => 20
        ]);
        $asserts[] = new Assert\Length([
            'min' => 1
        ]);
        $asserts[] = new Assert\Regex("/^\\d+$/");
        $response = $this->validate($businessId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $asserts[] = new Assert\Length([
            'max' => 18
        ]);
        $asserts[] = new Assert\Regex("/^\\d+$/");
        $response = $this->validate($audienceId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("\OpenAPI\Server\Model\OpenAPI\Server\Model\AudienceAccountType");
        $response = $this->validate($accountType, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("int");
        $asserts[] = new Assert\GreaterThanOrEqual(1);
        $asserts[] = new Assert\LessThanOrEqual(250);
        $response = $this->validate($pageSize, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($bookmark, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            // Set authentication method 'pinterest_oauth2'
            $handler->setpinterest_oauth2($securitypinterest_oauth2);

            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];

            $result = $handler->businessAccountAudiencesSharedAccountsList($businessId, $audienceId, $accountType, $pageSize, $bookmark, $responseCode, $responseHeaders);

            $message = match($responseCode) {
                200 => 'Success',
                400 => 'Invalid business audiences shared accounts parameters.',
                404 => 'Shared accounts not found.',
                0 => 'Unexpected error.',
                default => 'Unexpected error.',
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
     * Operation sharedAudiencesForBusinessList
     *
     * List received audiences for a business
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function sharedAudiencesForBusinessListAction(Request $request, $businessId)
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
        // Authentication 'pinterest_oauth2' required
        // Oauth required
        $securitypinterest_oauth2 = $request->headers->get('authorization');

        // Read out all input parameter values into variables
        $bookmark = $request->query->get('bookmark');
        $order = $request->query->get('order');
        $pageSize = $request->query->get('pageSize', 25);

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $businessId = $this->deserialize($businessId, 'string', 'string');
            $bookmark = $this->deserialize($bookmark, 'string', 'string');
            $order = $this->deserialize($order, 'string', 'string');
            $pageSize = $this->deserialize($pageSize, 'int', 'string');
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $asserts[] = new Assert\Length([
            'max' => 20
        ]);
        $asserts[] = new Assert\Length([
            'min' => 1
        ]);
        $asserts[] = new Assert\Regex("/^\\d+$/");
        $response = $this->validate($businessId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($bookmark, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Choice([ "ASCENDING", "DESCENDING" ]);
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($order, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("int");
        $asserts[] = new Assert\GreaterThanOrEqual(1);
        $asserts[] = new Assert\LessThanOrEqual(250);
        $response = $this->validate($pageSize, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            // Set authentication method 'pinterest_oauth2'
            $handler->setpinterest_oauth2($securitypinterest_oauth2);

            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];

            $result = $handler->sharedAudiencesForBusinessList($businessId, $bookmark, $order, $pageSize, $responseCode, $responseHeaders);

            $message = match($responseCode) {
                200 => 'Success',
                400 => 'Invalid parameters.',
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
     * Operation updateAdAccountToAdAccountSharedAudience
     *
     * Update audience sharing between ad accounts
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function updateAdAccountToAdAccountSharedAudienceAction(Request $request, $adAccountId)
    {
        // Make sure that the client is providing something that we can consume
        $consumes = ['application/json'];
        if (!static::isContentTypeAllowed($request, $consumes)) {
            // We can't consume the content that the client is sending us
            return new Response('', 415);
        }

        // Figure out what data format to return to the client
        $produces = ['application/json'];
        // Figure out what the client accepts
        $clientAccepts = $request->headers->has('Accept')?$request->headers->get('Accept'):'*/*';
        $responseFormat = $this->getOutputFormat($clientAccepts, $produces);
        if ($responseFormat === null) {
            return new Response('', 406);
        }

        // Handle authentication
        // Authentication 'pinterest_oauth2' required
        // Oauth required
        $securitypinterest_oauth2 = $request->headers->get('authorization');

        // Read out all input parameter values into variables
        $sharedAudience = $request->getContent();

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $adAccountId = $this->deserialize($adAccountId, 'string', 'string');
            $inputFormat = $request->getMimeType($request->getContentTypeFormat());
            $sharedAudience = $this->deserialize($sharedAudience, 'OpenAPI\Server\Model\SharedAudience', $inputFormat);
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $asserts[] = new Assert\Length([
            'max' => 18
        ]);
        $asserts[] = new Assert\Regex("/^\\d+$/");
        $response = $this->validate($adAccountId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("OpenAPI\Server\Model\SharedAudience");
        $asserts[] = new Assert\Valid();
        $response = $this->validate($sharedAudience, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            // Set authentication method 'pinterest_oauth2'
            $handler->setpinterest_oauth2($securitypinterest_oauth2);

            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];

            $result = $handler->updateAdAccountToAdAccountSharedAudience($adAccountId, $sharedAudience, $responseCode, $responseHeaders);

            $message = match($responseCode) {
                200 => 'Success',
                400 => 'Invalid ad account id.',
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
     * Operation updateAdAccountToBusinessSharedAudience
     *
     * Update audience sharing from an ad account to businesses
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function updateAdAccountToBusinessSharedAudienceAction(Request $request, $adAccountId)
    {
        // Make sure that the client is providing something that we can consume
        $consumes = ['application/json'];
        if (!static::isContentTypeAllowed($request, $consumes)) {
            // We can't consume the content that the client is sending us
            return new Response('', 415);
        }

        // Figure out what data format to return to the client
        $produces = ['application/json'];
        // Figure out what the client accepts
        $clientAccepts = $request->headers->has('Accept')?$request->headers->get('Accept'):'*/*';
        $responseFormat = $this->getOutputFormat($clientAccepts, $produces);
        if ($responseFormat === null) {
            return new Response('', 406);
        }

        // Handle authentication
        // Authentication 'pinterest_oauth2' required
        // Oauth required
        $securitypinterest_oauth2 = $request->headers->get('authorization');

        // Read out all input parameter values into variables
        $businessSharedAudience = $request->getContent();

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $adAccountId = $this->deserialize($adAccountId, 'string', 'string');
            $inputFormat = $request->getMimeType($request->getContentTypeFormat());
            $businessSharedAudience = $this->deserialize($businessSharedAudience, 'OpenAPI\Server\Model\BusinessSharedAudience', $inputFormat);
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $asserts[] = new Assert\Length([
            'max' => 18
        ]);
        $asserts[] = new Assert\Regex("/^\\d+$/");
        $response = $this->validate($adAccountId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("OpenAPI\Server\Model\BusinessSharedAudience");
        $asserts[] = new Assert\Valid();
        $response = $this->validate($businessSharedAudience, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            // Set authentication method 'pinterest_oauth2'
            $handler->setpinterest_oauth2($securitypinterest_oauth2);

            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];

            $result = $handler->updateAdAccountToBusinessSharedAudience($adAccountId, $businessSharedAudience, $responseCode, $responseHeaders);

            $message = match($responseCode) {
                200 => 'Success',
                400 => 'Invalid ad account id.',
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
     * Operation updateBusinessToAdAccountSharedAudience
     *
     * Update audience sharing from a business to ad accounts
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function updateBusinessToAdAccountSharedAudienceAction(Request $request, $businessId)
    {
        // Make sure that the client is providing something that we can consume
        $consumes = ['application/json'];
        if (!static::isContentTypeAllowed($request, $consumes)) {
            // We can't consume the content that the client is sending us
            return new Response('', 415);
        }

        // Figure out what data format to return to the client
        $produces = ['application/json'];
        // Figure out what the client accepts
        $clientAccepts = $request->headers->has('Accept')?$request->headers->get('Accept'):'*/*';
        $responseFormat = $this->getOutputFormat($clientAccepts, $produces);
        if ($responseFormat === null) {
            return new Response('', 406);
        }

        // Handle authentication
        // Authentication 'pinterest_oauth2' required
        // Oauth required
        $securitypinterest_oauth2 = $request->headers->get('authorization');

        // Read out all input parameter values into variables
        $sharedAudience = $request->getContent();

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $businessId = $this->deserialize($businessId, 'string', 'string');
            $inputFormat = $request->getMimeType($request->getContentTypeFormat());
            $sharedAudience = $this->deserialize($sharedAudience, 'OpenAPI\Server\Model\SharedAudience', $inputFormat);
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $asserts[] = new Assert\Length([
            'max' => 20
        ]);
        $asserts[] = new Assert\Length([
            'min' => 1
        ]);
        $asserts[] = new Assert\Regex("/^\\d+$/");
        $response = $this->validate($businessId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("OpenAPI\Server\Model\SharedAudience");
        $asserts[] = new Assert\Valid();
        $response = $this->validate($sharedAudience, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            // Set authentication method 'pinterest_oauth2'
            $handler->setpinterest_oauth2($securitypinterest_oauth2);

            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];

            $result = $handler->updateBusinessToAdAccountSharedAudience($businessId, $sharedAudience, $responseCode, $responseHeaders);

            $message = match($responseCode) {
                200 => 'Success',
                400 => 'Invalid parameters.',
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
     * Operation updateBusinessToBusinessSharedAudience
     *
     * Update audience sharing between businesses
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function updateBusinessToBusinessSharedAudienceAction(Request $request, $businessId)
    {
        // Make sure that the client is providing something that we can consume
        $consumes = ['application/json'];
        if (!static::isContentTypeAllowed($request, $consumes)) {
            // We can't consume the content that the client is sending us
            return new Response('', 415);
        }

        // Figure out what data format to return to the client
        $produces = ['application/json'];
        // Figure out what the client accepts
        $clientAccepts = $request->headers->has('Accept')?$request->headers->get('Accept'):'*/*';
        $responseFormat = $this->getOutputFormat($clientAccepts, $produces);
        if ($responseFormat === null) {
            return new Response('', 406);
        }

        // Handle authentication
        // Authentication 'pinterest_oauth2' required
        // Oauth required
        $securitypinterest_oauth2 = $request->headers->get('authorization');

        // Read out all input parameter values into variables
        $businessSharedAudience = $request->getContent();

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $businessId = $this->deserialize($businessId, 'string', 'string');
            $inputFormat = $request->getMimeType($request->getContentTypeFormat());
            $businessSharedAudience = $this->deserialize($businessSharedAudience, 'OpenAPI\Server\Model\BusinessSharedAudience', $inputFormat);
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $asserts[] = new Assert\Length([
            'max' => 20
        ]);
        $asserts[] = new Assert\Length([
            'min' => 1
        ]);
        $asserts[] = new Assert\Regex("/^\\d+$/");
        $response = $this->validate($businessId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("OpenAPI\Server\Model\BusinessSharedAudience");
        $asserts[] = new Assert\Valid();
        $response = $this->validate($businessSharedAudience, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            // Set authentication method 'pinterest_oauth2'
            $handler->setpinterest_oauth2($securitypinterest_oauth2);

            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];

            $result = $handler->updateBusinessToBusinessSharedAudience($businessId, $businessSharedAudience, $responseCode, $responseHeaders);

            $message = match($responseCode) {
                200 => 'Success',
                400 => 'Invalid parameters.',
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
     * @return AudienceSharingApiInterface
     */
    public function getApiHandler()
    {
        return $this->apiServer->getApiHandler('audienceSharing');
    }
}
