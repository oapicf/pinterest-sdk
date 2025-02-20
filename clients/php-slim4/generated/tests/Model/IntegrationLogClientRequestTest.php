<?php

/**
 * Pinterest REST API
 * PHP version 7.4
 *
 * @package OpenAPIServer
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */

/**
 * Pinterest's REST API
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Please update the test case below to test the model.
 */
namespace OpenAPIServer\Model;

use PHPUnit\Framework\TestCase;
use OpenAPIServer\Model\IntegrationLogClientRequest;

/**
 * IntegrationLogClientRequestTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\IntegrationLogClientRequest
 */
class IntegrationLogClientRequestTest extends TestCase
{

    /**
     * Setup before running any test cases
     */
    public static function setUpBeforeClass(): void
    {
    }

    /**
     * Setup before running each test case
     */
    public function setUp(): void
    {
    }

    /**
     * Clean up after running each test case
     */
    public function tearDown(): void
    {
    }

    /**
     * Clean up after running all test cases
     */
    public static function tearDownAfterClass(): void
    {
    }

    /**
     * Test "IntegrationLogClientRequest"
     */
    public function testIntegrationLogClientRequest()
    {
        $testIntegrationLogClientRequest = new IntegrationLogClientRequest();
        $namespacedClassname = IntegrationLogClientRequest::getModelsNamespace() . '\\IntegrationLogClientRequest';
        $this->assertSame('\\' . IntegrationLogClientRequest::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "IntegrationLogClientRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "method"
     */
    public function testPropertyMethod()
    {
        self::markTestIncomplete(
            'Test of "method" property in "IntegrationLogClientRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "host"
     */
    public function testPropertyHost()
    {
        self::markTestIncomplete(
            'Test of "host" property in "IntegrationLogClientRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "path"
     */
    public function testPropertyPath()
    {
        self::markTestIncomplete(
            'Test of "path" property in "IntegrationLogClientRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "requestHeaders"
     */
    public function testPropertyRequestHeaders()
    {
        self::markTestIncomplete(
            'Test of "requestHeaders" property in "IntegrationLogClientRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "responseHeaders"
     */
    public function testPropertyResponseHeaders()
    {
        self::markTestIncomplete(
            'Test of "responseHeaders" property in "IntegrationLogClientRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "responseStatusCode"
     */
    public function testPropertyResponseStatusCode()
    {
        self::markTestIncomplete(
            'Test of "responseStatusCode" property in "IntegrationLogClientRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = IntegrationLogClientRequest::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

