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
use OpenAPIServer\Model\ConversionEventResponse;

/**
 * ConversionEventResponseTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\ConversionEventResponse
 */
class ConversionEventResponseTest extends TestCase
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
     * Test "ConversionEventResponse"
     */
    public function testConversionEventResponse()
    {
        $testConversionEventResponse = new ConversionEventResponse();
        $namespacedClassname = ConversionEventResponse::getModelsNamespace() . '\\ConversionEventResponse';
        $this->assertSame('\\' . ConversionEventResponse::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "ConversionEventResponse" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "conversionEvent"
     */
    public function testPropertyConversionEvent()
    {
        self::markTestIncomplete(
            'Test of "conversionEvent" property in "ConversionEventResponse" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "conversionTagId"
     */
    public function testPropertyConversionTagId()
    {
        self::markTestIncomplete(
            'Test of "conversionTagId" property in "ConversionEventResponse" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "adAccountId"
     */
    public function testPropertyAdAccountId()
    {
        self::markTestIncomplete(
            'Test of "adAccountId" property in "ConversionEventResponse" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "createdTime"
     */
    public function testPropertyCreatedTime()
    {
        self::markTestIncomplete(
            'Test of "createdTime" property in "ConversionEventResponse" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = ConversionEventResponse::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

