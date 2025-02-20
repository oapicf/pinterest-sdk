<?php

/**
 * LeadFormsController
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
use OpenAPI\Server\Api\LeadFormsApiInterface;
use OpenAPI\Server\Model\Error;
use OpenAPI\Server\Model\LeadFormArrayResponse;
use OpenAPI\Server\Model\LeadFormCreateRequest;
use OpenAPI\Server\Model\LeadFormResponse;
use OpenAPI\Server\Model\LeadFormTestRequest;
use OpenAPI\Server\Model\LeadFormTestResponse;
use OpenAPI\Server\Model\LeadFormUpdateRequest;
use OpenAPI\Server\Model\LeadFormsList200Response;

/**
 * LeadFormsController Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Server\Controller
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */
class LeadFormsController extends Controller
{

    /**
     * Operation leadFormGet
     *
     * Get lead form by id
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function leadFormGetAction(Request $request, $adAccountId, $leadFormId)
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
            $adAccountId = $this->deserialize($adAccountId, 'string', 'string');
            $leadFormId = $this->deserialize($leadFormId, 'string', 'string');
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
        $asserts[] = new Assert\Regex("/^\\d+$/");
        $response = $this->validate($leadFormId, $asserts);
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

            $result = $handler->leadFormGet($adAccountId, $leadFormId, $responseCode, $responseHeaders);

            $message = match($responseCode) {
                200 => 'Success',
                400 => 'Invalid ad account lead forms parameters.',
                404 => 'The lead form ID for the given ad account ID does not exist.',
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
     * Operation leadFormTestCreate
     *
     * Create lead form test data
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function leadFormTestCreateAction(Request $request, $adAccountId, $leadFormId)
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
        $leadFormTestRequest = $request->getContent();

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $adAccountId = $this->deserialize($adAccountId, 'string', 'string');
            $leadFormId = $this->deserialize($leadFormId, 'string', 'string');
            $inputFormat = $request->getMimeType($request->getContentTypeFormat());
            $leadFormTestRequest = $this->deserialize($leadFormTestRequest, 'OpenAPI\Server\Model\LeadFormTestRequest', $inputFormat);
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
        $asserts[] = new Assert\Regex("/^\\d+$/");
        $response = $this->validate($leadFormId, $asserts);
        if ($response instanceof Response) {
            return $response;
        }
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("OpenAPI\Server\Model\LeadFormTestRequest");
        $asserts[] = new Assert\Valid();
        $response = $this->validate($leadFormTestRequest, $asserts);
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

            $result = $handler->leadFormTestCreate($adAccountId, $leadFormId, $leadFormTestRequest, $responseCode, $responseHeaders);

            $message = match($responseCode) {
                200 => 'Success',
                400 => 'Invalid parameters.',
                404 => 'Lead not found.',
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
     * Operation leadFormsCreate
     *
     * Create lead forms
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function leadFormsCreateAction(Request $request, $adAccountId)
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
        $leadFormCreateRequest = $request->getContent();

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $adAccountId = $this->deserialize($adAccountId, 'string', 'string');
            $inputFormat = $request->getMimeType($request->getContentTypeFormat());
            $leadFormCreateRequest = $this->deserialize($leadFormCreateRequest, 'array<OpenAPI\Server\Model\LeadFormCreateRequest>', $inputFormat);
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
        $asserts[] = new Assert\All([
            new Assert\Type("OpenAPI\Server\Model\LeadFormCreateRequest"),
        ]);
        $asserts[] = new Assert\Valid();
        $asserts[] = new Assert\Count([
            'max' => 30
        ]);
        $asserts[] = new Assert\Count([
            'min' => 1
        ]);
        $response = $this->validate($leadFormCreateRequest, $asserts);
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

            $result = $handler->leadFormsCreate($adAccountId, $leadFormCreateRequest, $responseCode, $responseHeaders);

            $message = match($responseCode) {
                200 => 'Success',
                400 => 'Invalid ad account lead forms parameters.',
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
     * Operation leadFormsList
     *
     * List lead forms
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function leadFormsListAction(Request $request, $adAccountId)
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
        $pageSize = $request->query->get('pageSize', 25);
        $order = $request->query->get('order');
        $bookmark = $request->query->get('bookmark');

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $adAccountId = $this->deserialize($adAccountId, 'string', 'string');
            $pageSize = $this->deserialize($pageSize, 'int', 'string');
            $order = $this->deserialize($order, 'string', 'string');
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
        $asserts[] = new Assert\Type("int");
        $asserts[] = new Assert\GreaterThanOrEqual(1);
        $asserts[] = new Assert\LessThanOrEqual(250);
        $response = $this->validate($pageSize, $asserts);
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

            $result = $handler->leadFormsList($adAccountId, $pageSize, $order, $bookmark, $responseCode, $responseHeaders);

            $message = match($responseCode) {
                200 => 'Success',
                400 => 'Invalid ad account lead forms parameters.',
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
     * Operation leadFormsUpdate
     *
     * Update lead forms
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function leadFormsUpdateAction(Request $request, $adAccountId)
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
        $leadFormUpdateRequest = $request->getContent();

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        try {
            $adAccountId = $this->deserialize($adAccountId, 'string', 'string');
            $inputFormat = $request->getMimeType($request->getContentTypeFormat());
            $leadFormUpdateRequest = $this->deserialize($leadFormUpdateRequest, 'array<OpenAPI\Server\Model\LeadFormUpdateRequest>', $inputFormat);
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
        $asserts[] = new Assert\All([
            new Assert\Type("OpenAPI\Server\Model\LeadFormUpdateRequest"),
        ]);
        $asserts[] = new Assert\Valid();
        $asserts[] = new Assert\Count([
            'max' => 30
        ]);
        $asserts[] = new Assert\Count([
            'min' => 1
        ]);
        $response = $this->validate($leadFormUpdateRequest, $asserts);
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

            $result = $handler->leadFormsUpdate($adAccountId, $leadFormUpdateRequest, $responseCode, $responseHeaders);

            $message = match($responseCode) {
                200 => 'Success',
                400 => 'Invalid ad account lead forms parameters.',
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
     * @return LeadFormsApiInterface
     */
    public function getApiHandler()
    {
        return $this->apiServer->getApiHandler('leadForms');
    }
}
