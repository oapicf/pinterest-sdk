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
 * The version of the OpenAPI document: 5.12.0
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
use OpenAPIServer\Model\CatalogsProductGroupsList200ResponseAllOfItemsInner;

/**
 * CatalogsProductGroupsList200ResponseAllOfItemsInnerTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\CatalogsProductGroupsList200ResponseAllOfItemsInner
 */
class CatalogsProductGroupsList200ResponseAllOfItemsInnerTest extends TestCase
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
     * Test "CatalogsProductGroupsList200ResponseAllOfItemsInner"
     */
    public function testCatalogsProductGroupsList200ResponseAllOfItemsInner()
    {
        $testCatalogsProductGroupsList200ResponseAllOfItemsInner = new CatalogsProductGroupsList200ResponseAllOfItemsInner();
        $namespacedClassname = CatalogsProductGroupsList200ResponseAllOfItemsInner::getModelsNamespace() . '\\CatalogsProductGroupsList200ResponseAllOfItemsInner';
        $this->assertSame('\\' . CatalogsProductGroupsList200ResponseAllOfItemsInner::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "CatalogsProductGroupsList200ResponseAllOfItemsInner" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "id"
     */
    public function testPropertyId()
    {
        self::markTestIncomplete(
            'Test of "id" property in "CatalogsProductGroupsList200ResponseAllOfItemsInner" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "name"
     */
    public function testPropertyName()
    {
        self::markTestIncomplete(
            'Test of "name" property in "CatalogsProductGroupsList200ResponseAllOfItemsInner" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "description"
     */
    public function testPropertyDescription()
    {
        self::markTestIncomplete(
            'Test of "description" property in "CatalogsProductGroupsList200ResponseAllOfItemsInner" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "filters"
     */
    public function testPropertyFilters()
    {
        self::markTestIncomplete(
            'Test of "filters" property in "CatalogsProductGroupsList200ResponseAllOfItemsInner" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "isFeatured"
     */
    public function testPropertyIsFeatured()
    {
        self::markTestIncomplete(
            'Test of "isFeatured" property in "CatalogsProductGroupsList200ResponseAllOfItemsInner" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "type"
     */
    public function testPropertyType()
    {
        self::markTestIncomplete(
            'Test of "type" property in "CatalogsProductGroupsList200ResponseAllOfItemsInner" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "status"
     */
    public function testPropertyStatus()
    {
        self::markTestIncomplete(
            'Test of "status" property in "CatalogsProductGroupsList200ResponseAllOfItemsInner" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "createdAt"
     */
    public function testPropertyCreatedAt()
    {
        self::markTestIncomplete(
            'Test of "createdAt" property in "CatalogsProductGroupsList200ResponseAllOfItemsInner" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "updatedAt"
     */
    public function testPropertyUpdatedAt()
    {
        self::markTestIncomplete(
            'Test of "updatedAt" property in "CatalogsProductGroupsList200ResponseAllOfItemsInner" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "feedId"
     */
    public function testPropertyFeedId()
    {
        self::markTestIncomplete(
            'Test of "feedId" property in "CatalogsProductGroupsList200ResponseAllOfItemsInner" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "catalogType"
     */
    public function testPropertyCatalogType()
    {
        self::markTestIncomplete(
            'Test of "catalogType" property in "CatalogsProductGroupsList200ResponseAllOfItemsInner" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "catalogId"
     */
    public function testPropertyCatalogId()
    {
        self::markTestIncomplete(
            'Test of "catalogId" property in "CatalogsProductGroupsList200ResponseAllOfItemsInner" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = CatalogsProductGroupsList200ResponseAllOfItemsInner::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}
