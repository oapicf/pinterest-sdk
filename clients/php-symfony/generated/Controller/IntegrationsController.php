<?php

/**
 * IntegrationsController
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

namespace OpenAPI\Server\Controller;

use \Exception;
use JMS\Serializer\Exception\RuntimeException as SerializerRuntimeException;
use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\HttpKernel\Exception\HttpException;
use Symfony\Component\Validator\Constraints as Assert;
use OpenAPI\Server\Api\IntegrationsApiInterface;
use OpenAPI\Server\Model\DetailedError;
use OpenAPI\Server\Model\Error;
use OpenAPI\Server\Model\IntegrationLogsRequest;
use OpenAPI\Server\Model\IntegrationLogsSuccessResponse;
use OpenAPI\Server\Model\IntegrationMetadata;
use OpenAPI\Server\Model\IntegrationRecord;
use OpenAPI\Server\Model\IntegrationRequest;
use OpenAPI\Server\Model\IntegrationRequestPatch;
use OpenAPI\Server\Model\IntegrationsGetList200Response;

/**
 * IntegrationsController Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Server\Controller
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */
class IntegrationsController extends Controller
{

    /**
     * Operation integrationsCommerceDel
     *
     * Delete commerce integration
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function integrationsCommerceDelAction(Request $request, $externalBusinessId)
    {
        // Handle authentication
        // Authentication 'pinterest_oauth2' required
        // Oauth required
        $securitypinterest_oauth2 = $request->headers->get('authorization');

        // Read out all input parameter values into variables

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $externalBusinessId = $this->deserialize($externalBusinessId, 'string', 'string');
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($externalBusinessId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            // Set authentication method 'pinterest_oauth2'
            $handler->setpinterest_oauth2($securitypinterest_oauth2);

            // Make the call to the business logic
            $responseCode = 204;
            $responseHeaders = [];

            $handler->integrationsCommerceDel($externalBusinessId, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Unexpected error.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 204:
                    $message = 'Commerce Integration deleted successfully';
                    break;
                case 0:
                    $message = 'Unexpected error.';
                    break;
            }

            return new Response(
                '',
                $responseCode,
                array_merge(
                    $responseHeaders,
                    [
                        'X-OpenAPI-Message' => $message
                    ]
                )
            );
        } catch (\Throwable $fallthrough) {
            return $this->createErrorResponse(new HttpException(500, 'An unsuspected error occurred.', $fallthrough));
        }
    }

    /**
     * Operation integrationsCommerceGet
     *
     * Get commerce integration
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function integrationsCommerceGetAction(Request $request, $externalBusinessId)
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

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $externalBusinessId = $this->deserialize($externalBusinessId, 'string', 'string');
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($externalBusinessId, $asserts);
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

            $result = $handler->integrationsCommerceGet($externalBusinessId, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Unexpected error.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'Success';
                    break;
                case 404:
                    $message = 'Integration not found.';
                    break;
                case 409:
                    $message = 'Can&#39;t access this integration metadata.';
                    break;
                case 0:
                    $message = 'Unexpected error.';
                    break;
            }

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
     * Operation integrationsCommercePatch
     *
     * Update commerce integration
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function integrationsCommercePatchAction(Request $request, $externalBusinessId)
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
        $integrationRequestPatch = $request->getContent();

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $externalBusinessId = $this->deserialize($externalBusinessId, 'string', 'string');
            $inputFormat = $request->getMimeType($request->getContentType());
            $integrationRequestPatch = $this->deserialize($integrationRequestPatch, 'OpenAPI\Server\Model\IntegrationRequestPatch', $inputFormat);
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($externalBusinessId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\Type("OpenAPI\Server\Model\IntegrationRequestPatch");
        $asserts[] = new Assert\Valid();
        $response = $this->validate($integrationRequestPatch, $asserts);
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

            $result = $handler->integrationsCommercePatch($externalBusinessId, $integrationRequestPatch, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Unexpected error.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'Success';
                    break;
                case 404:
                    $message = 'Integration not found.';
                    break;
                case 409:
                    $message = 'Can&#39;t access this integration metadata.';
                    break;
                case 0:
                    $message = 'Unexpected error.';
                    break;
            }

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
     * Operation integrationsCommercePost
     *
     * Create commerce integration
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function integrationsCommercePostAction(Request $request)
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
        $integrationRequest = $request->getContent();

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $inputFormat = $request->getMimeType($request->getContentType());
            $integrationRequest = $this->deserialize($integrationRequest, 'OpenAPI\Server\Model\IntegrationRequest', $inputFormat);
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\Type("OpenAPI\Server\Model\IntegrationRequest");
        $asserts[] = new Assert\Valid();
        $response = $this->validate($integrationRequest, $asserts);
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

            $result = $handler->integrationsCommercePost($integrationRequest, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Unexpected error.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'Success';
                    break;
                case 404:
                    $message = 'Integration not found.';
                    break;
                case 409:
                    $message = 'Can&#39;t access this integration metadata.';
                    break;
                case 0:
                    $message = 'Unexpected error.';
                    break;
            }

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
     * Operation integrationsGetById
     *
     * Get integration metadata
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function integrationsGetByIdAction(Request $request, $id)
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

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $id = $this->deserialize($id, 'string', 'string');
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($id, $asserts);
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

            $result = $handler->integrationsGetById($id, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Unexpected error.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'Success';
                    break;
                case 404:
                    $message = 'Integration not found.';
                    break;
                case 0:
                    $message = 'Unexpected error.';
                    break;
            }

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
     * Operation integrationsGetList
     *
     * Get integration metadata list
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function integrationsGetListAction(Request $request)
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
        $pageSize = $request->query->get('pageSize', 25);

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $bookmark = $this->deserialize($bookmark, 'string', 'string');
            $pageSize = $this->deserialize($pageSize, 'int', 'string');
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\Type("string");
        $response = $this->validate($bookmark, $asserts);
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

            $result = $handler->integrationsGetList($bookmark, $pageSize, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Unexpected error.';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'Success';
                    break;
                case 0:
                    $message = 'Unexpected error.';
                    break;
            }

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
     * Operation integrationsLogsPost
     *
     * Receives batched logs from integration applications.
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function integrationsLogsPostAction(Request $request)
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
        $integrationLogsRequest = $request->getContent();

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $inputFormat = $request->getMimeType($request->getContentType());
            $integrationLogsRequest = $this->deserialize($integrationLogsRequest, 'OpenAPI\Server\Model\IntegrationLogsRequest', $inputFormat);
        } catch (SerializerRuntimeException $exception) {
            return $this->createBadRequestResponse($exception->getMessage());
        }

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("OpenAPI\Server\Model\IntegrationLogsRequest");
        $asserts[] = new Assert\Valid();
        $response = $this->validate($integrationLogsRequest, $asserts);
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

            $result = $handler->integrationsLogsPost($integrationLogsRequest, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'Unexpected error';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'Success.';
                    break;
                case 400:
                    $message = 'Bad request.';
                    break;
                case 0:
                    $message = 'Unexpected error';
                    break;
            }

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
     * @return IntegrationsApiInterface
     */
    public function getApiHandler()
    {
        return $this->apiServer->getApiHandler('integrations');
    }
}