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
use OpenAPIServer\Model\CatalogsItemsBatchRequest;

/**
 * CatalogsItemsBatchRequestTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\CatalogsItemsBatchRequest
 */
class CatalogsItemsBatchRequestTest extends TestCase
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
     * Test "CatalogsItemsBatchRequest"
     */
    public function testCatalogsItemsBatchRequest()
    {
        $testCatalogsItemsBatchRequest = new CatalogsItemsBatchRequest();
        $namespacedClassname = CatalogsItemsBatchRequest::getModelsNamespace() . '\\CatalogsItemsBatchRequest';
        $this->assertSame('\\' . CatalogsItemsBatchRequest::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "CatalogsItemsBatchRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "country"
     */
    public function testPropertyCountry()
    {
        self::markTestIncomplete(
            'Test of "country" property in "CatalogsItemsBatchRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "language"
     */
    public function testPropertyLanguage()
    {
        self::markTestIncomplete(
            'Test of "language" property in "CatalogsItemsBatchRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "operation"
     */
    public function testPropertyOperation()
    {
        self::markTestIncomplete(
            'Test of "operation" property in "CatalogsItemsBatchRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "items"
     */
    public function testPropertyItems()
    {
        self::markTestIncomplete(
            'Test of "items" property in "CatalogsItemsBatchRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = CatalogsItemsBatchRequest::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

