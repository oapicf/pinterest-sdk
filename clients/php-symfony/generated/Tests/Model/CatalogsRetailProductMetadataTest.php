<?php
/**
 * CatalogsRetailProductMetadataTest
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server\Tests\Model
 * @author   openapi-generator contributors
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Please update the test case below to test the model.
 */

namespace OpenAPI\Server\Tests\Model;

use OpenAPI\Server\Model\CatalogsRetailProductMetadata;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * CatalogsRetailProductMetadataTest Class Doc Comment
 *
 * @category    Class
 * @description Retail product metadata entity
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\CatalogsRetailProductMetadata
 */
class CatalogsRetailProductMetadataTest extends TestCase
{
    protected CatalogsRetailProductMetadata|MockObject $object;

    /**
     * Setup before running any test case
     */
    public static function setUpBeforeClass(): void
    {
    }

    /**
     * Setup before running each test case
     */
    public function setUp(): void
    {
        $this->object = $this->getMockBuilder(CatalogsRetailProductMetadata::class)->getMockForAbstractClass();
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
     * @group integration
     * @small
     */
    public function testTestClassExists(): void
    {
        $this->assertTrue(class_exists(CatalogsRetailProductMetadata::class));
        $this->assertInstanceOf(CatalogsRetailProductMetadata::class, $this->object);
    }

    /**
     * Test attribute "itemId"
     *
     * @group unit
     * @small
     */
    public function testPropertyItemId(): void
    {
        $this->markTestSkipped('Test for property itemId not implemented');
    }

    /**
     * Test attribute "itemGroupId"
     *
     * @group unit
     * @small
     */
    public function testPropertyItemGroupId(): void
    {
        $this->markTestSkipped('Test for property itemGroupId not implemented');
    }

    /**
     * Test attribute "availability"
     *
     * @group unit
     * @small
     */
    public function testPropertyAvailability(): void
    {
        $this->markTestSkipped('Test for property availability not implemented');
    }

    /**
     * Test attribute "price"
     *
     * @group unit
     * @small
     */
    public function testPropertyPrice(): void
    {
        $this->markTestSkipped('Test for property price not implemented');
    }

    /**
     * Test attribute "salePrice"
     *
     * @group unit
     * @small
     */
    public function testPropertySalePrice(): void
    {
        $this->markTestSkipped('Test for property salePrice not implemented');
    }

    /**
     * Test attribute "currency"
     *
     * @group unit
     * @small
     */
    public function testPropertyCurrency(): void
    {
        $this->markTestSkipped('Test for property currency not implemented');
    }
}
