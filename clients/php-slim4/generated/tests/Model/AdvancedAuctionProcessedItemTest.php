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
use OpenAPIServer\Model\AdvancedAuctionProcessedItem;

/**
 * AdvancedAuctionProcessedItemTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\AdvancedAuctionProcessedItem
 */
class AdvancedAuctionProcessedItemTest extends TestCase
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
     * Test "AdvancedAuctionProcessedItem"
     */
    public function testAdvancedAuctionProcessedItem()
    {
        $testAdvancedAuctionProcessedItem = new AdvancedAuctionProcessedItem();
        $namespacedClassname = AdvancedAuctionProcessedItem::getModelsNamespace() . '\\AdvancedAuctionProcessedItem';
        $this->assertSame('\\' . AdvancedAuctionProcessedItem::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "AdvancedAuctionProcessedItem" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "operation"
     */
    public function testPropertyOperation()
    {
        self::markTestIncomplete(
            'Test of "operation" property in "AdvancedAuctionProcessedItem" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "itemId"
     */
    public function testPropertyItemId()
    {
        self::markTestIncomplete(
            'Test of "itemId" property in "AdvancedAuctionProcessedItem" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "country"
     */
    public function testPropertyCountry()
    {
        self::markTestIncomplete(
            'Test of "country" property in "AdvancedAuctionProcessedItem" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "language"
     */
    public function testPropertyLanguage()
    {
        self::markTestIncomplete(
            'Test of "language" property in "AdvancedAuctionProcessedItem" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "bidOptions"
     */
    public function testPropertyBidOptions()
    {
        self::markTestIncomplete(
            'Test of "bidOptions" property in "AdvancedAuctionProcessedItem" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "updateMask"
     */
    public function testPropertyUpdateMask()
    {
        self::markTestIncomplete(
            'Test of "updateMask" property in "AdvancedAuctionProcessedItem" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "errors"
     */
    public function testPropertyErrors()
    {
        self::markTestIncomplete(
            'Test of "errors" property in "AdvancedAuctionProcessedItem" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = AdvancedAuctionProcessedItem::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

