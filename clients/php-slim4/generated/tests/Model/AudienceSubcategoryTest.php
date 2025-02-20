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
use OpenAPIServer\Model\AudienceSubcategory;

/**
 * AudienceSubcategoryTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\AudienceSubcategory
 */
class AudienceSubcategoryTest extends TestCase
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
     * Test "AudienceSubcategory"
     */
    public function testAudienceSubcategory()
    {
        $testAudienceSubcategory = new AudienceSubcategory();
        $namespacedClassname = AudienceSubcategory::getModelsNamespace() . '\\AudienceSubcategory';
        $this->assertSame('\\' . AudienceSubcategory::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "AudienceSubcategory" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "key"
     */
    public function testPropertyKey()
    {
        self::markTestIncomplete(
            'Test of "key" property in "AudienceSubcategory" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "name"
     */
    public function testPropertyName()
    {
        self::markTestIncomplete(
            'Test of "name" property in "AudienceSubcategory" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "ratio"
     */
    public function testPropertyRatio()
    {
        self::markTestIncomplete(
            'Test of "ratio" property in "AudienceSubcategory" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "index"
     */
    public function testPropertyIndex()
    {
        self::markTestIncomplete(
            'Test of "index" property in "AudienceSubcategory" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "id"
     */
    public function testPropertyId()
    {
        self::markTestIncomplete(
            'Test of "id" property in "AudienceSubcategory" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = AudienceSubcategory::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

