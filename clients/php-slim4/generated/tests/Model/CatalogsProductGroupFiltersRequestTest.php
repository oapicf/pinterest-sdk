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
use OpenAPIServer\Model\CatalogsProductGroupFiltersRequest;

/**
 * CatalogsProductGroupFiltersRequestTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\CatalogsProductGroupFiltersRequest
 */
class CatalogsProductGroupFiltersRequestTest extends TestCase
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
     * Test "CatalogsProductGroupFiltersRequest"
     */
    public function testCatalogsProductGroupFiltersRequest()
    {
        $testCatalogsProductGroupFiltersRequest = new CatalogsProductGroupFiltersRequest();
        $namespacedClassname = CatalogsProductGroupFiltersRequest::getModelsNamespace() . '\\CatalogsProductGroupFiltersRequest';
        $this->assertSame('\\' . CatalogsProductGroupFiltersRequest::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "CatalogsProductGroupFiltersRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "anyOf"
     */
    public function testPropertyAnyOf()
    {
        self::markTestIncomplete(
            'Test of "anyOf" property in "CatalogsProductGroupFiltersRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "allOf"
     */
    public function testPropertyAllOf()
    {
        self::markTestIncomplete(
            'Test of "allOf" property in "CatalogsProductGroupFiltersRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = CatalogsProductGroupFiltersRequest::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

