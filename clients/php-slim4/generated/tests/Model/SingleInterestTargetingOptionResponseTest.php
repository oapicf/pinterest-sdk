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
use OpenAPIServer\Model\SingleInterestTargetingOptionResponse;

/**
 * SingleInterestTargetingOptionResponseTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\SingleInterestTargetingOptionResponse
 */
class SingleInterestTargetingOptionResponseTest extends TestCase
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
     * Test "SingleInterestTargetingOptionResponse"
     */
    public function testSingleInterestTargetingOptionResponse()
    {
        $testSingleInterestTargetingOptionResponse = new SingleInterestTargetingOptionResponse();
        $namespacedClassname = SingleInterestTargetingOptionResponse::getModelsNamespace() . '\\SingleInterestTargetingOptionResponse';
        $this->assertSame('\\' . SingleInterestTargetingOptionResponse::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "SingleInterestTargetingOptionResponse" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "id"
     */
    public function testPropertyId()
    {
        self::markTestIncomplete(
            'Test of "id" property in "SingleInterestTargetingOptionResponse" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "name"
     */
    public function testPropertyName()
    {
        self::markTestIncomplete(
            'Test of "name" property in "SingleInterestTargetingOptionResponse" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "childInterests"
     */
    public function testPropertyChildInterests()
    {
        self::markTestIncomplete(
            'Test of "childInterests" property in "SingleInterestTargetingOptionResponse" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "level"
     */
    public function testPropertyLevel()
    {
        self::markTestIncomplete(
            'Test of "level" property in "SingleInterestTargetingOptionResponse" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = SingleInterestTargetingOptionResponse::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

