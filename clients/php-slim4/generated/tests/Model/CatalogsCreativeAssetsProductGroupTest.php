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
use OpenAPIServer\Model\CatalogsCreativeAssetsProductGroup;

/**
 * CatalogsCreativeAssetsProductGroupTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\CatalogsCreativeAssetsProductGroup
 */
class CatalogsCreativeAssetsProductGroupTest extends TestCase
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
     * Test "CatalogsCreativeAssetsProductGroup"
     */
    public function testCatalogsCreativeAssetsProductGroup()
    {
        $testCatalogsCreativeAssetsProductGroup = new CatalogsCreativeAssetsProductGroup();
        $namespacedClassname = CatalogsCreativeAssetsProductGroup::getModelsNamespace() . '\\CatalogsCreativeAssetsProductGroup';
        $this->assertSame('\\' . CatalogsCreativeAssetsProductGroup::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "CatalogsCreativeAssetsProductGroup" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "catalogType"
     */
    public function testPropertyCatalogType()
    {
        self::markTestIncomplete(
            'Test of "catalogType" property in "CatalogsCreativeAssetsProductGroup" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "id"
     */
    public function testPropertyId()
    {
        self::markTestIncomplete(
            'Test of "id" property in "CatalogsCreativeAssetsProductGroup" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "name"
     */
    public function testPropertyName()
    {
        self::markTestIncomplete(
            'Test of "name" property in "CatalogsCreativeAssetsProductGroup" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "description"
     */
    public function testPropertyDescription()
    {
        self::markTestIncomplete(
            'Test of "description" property in "CatalogsCreativeAssetsProductGroup" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "filters"
     */
    public function testPropertyFilters()
    {
        self::markTestIncomplete(
            'Test of "filters" property in "CatalogsCreativeAssetsProductGroup" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "createdAt"
     */
    public function testPropertyCreatedAt()
    {
        self::markTestIncomplete(
            'Test of "createdAt" property in "CatalogsCreativeAssetsProductGroup" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "updatedAt"
     */
    public function testPropertyUpdatedAt()
    {
        self::markTestIncomplete(
            'Test of "updatedAt" property in "CatalogsCreativeAssetsProductGroup" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "catalogId"
     */
    public function testPropertyCatalogId()
    {
        self::markTestIncomplete(
            'Test of "catalogId" property in "CatalogsCreativeAssetsProductGroup" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = CatalogsCreativeAssetsProductGroup::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

