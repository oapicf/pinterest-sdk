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
use OpenAPIServer\Model\CatalogsCreateHotelItem;

/**
 * CatalogsCreateHotelItemTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\CatalogsCreateHotelItem
 */
class CatalogsCreateHotelItemTest extends TestCase
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
     * Test "CatalogsCreateHotelItem"
     */
    public function testCatalogsCreateHotelItem()
    {
        $testCatalogsCreateHotelItem = new CatalogsCreateHotelItem();
        $namespacedClassname = CatalogsCreateHotelItem::getModelsNamespace() . '\\CatalogsCreateHotelItem';
        $this->assertSame('\\' . CatalogsCreateHotelItem::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "CatalogsCreateHotelItem" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "hotelId"
     */
    public function testPropertyHotelId()
    {
        self::markTestIncomplete(
            'Test of "hotelId" property in "CatalogsCreateHotelItem" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "operation"
     */
    public function testPropertyOperation()
    {
        self::markTestIncomplete(
            'Test of "operation" property in "CatalogsCreateHotelItem" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "attributes"
     */
    public function testPropertyAttributes()
    {
        self::markTestIncomplete(
            'Test of "attributes" property in "CatalogsCreateHotelItem" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = CatalogsCreateHotelItem::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}
