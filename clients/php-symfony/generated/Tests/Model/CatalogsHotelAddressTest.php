<?php
/**
 * CatalogsHotelAddressTest
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

use OpenAPI\Server\Model\CatalogsHotelAddress;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * CatalogsHotelAddressTest Class Doc Comment
 *
 * @category    Class
 * @description CatalogsHotelAddress
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\CatalogsHotelAddress
 */
class CatalogsHotelAddressTest extends TestCase
{
    protected CatalogsHotelAddress|MockObject $object;

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
        $this->object = $this->getMockBuilder(CatalogsHotelAddress::class)->getMockForAbstractClass();
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
        $this->assertTrue(class_exists(CatalogsHotelAddress::class));
        $this->assertInstanceOf(CatalogsHotelAddress::class, $this->object);
    }

    /**
     * Test attribute "addr1"
     *
     * @group unit
     * @small
     */
    public function testPropertyAddr1(): void
    {
        $this->markTestSkipped('Test for property addr1 not implemented');
    }

    /**
     * Test attribute "city"
     *
     * @group unit
     * @small
     */
    public function testPropertyCity(): void
    {
        $this->markTestSkipped('Test for property city not implemented');
    }

    /**
     * Test attribute "region"
     *
     * @group unit
     * @small
     */
    public function testPropertyRegion(): void
    {
        $this->markTestSkipped('Test for property region not implemented');
    }

    /**
     * Test attribute "country"
     *
     * @group unit
     * @small
     */
    public function testPropertyCountry(): void
    {
        $this->markTestSkipped('Test for property country not implemented');
    }

    /**
     * Test attribute "postalCode"
     *
     * @group unit
     * @small
     */
    public function testPropertyPostalCode(): void
    {
        $this->markTestSkipped('Test for property postalCode not implemented');
    }
}
