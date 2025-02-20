<?php
/**
 * CatalogsVerticalFeedsUpdateRequestTest
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

use OpenAPI\Server\Model\CatalogsVerticalFeedsUpdateRequest;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * CatalogsVerticalFeedsUpdateRequestTest Class Doc Comment
 *
 * @category    Class
 * @description Request object for updating a feed.
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\CatalogsVerticalFeedsUpdateRequest
 */
class CatalogsVerticalFeedsUpdateRequestTest extends TestCase
{
    protected CatalogsVerticalFeedsUpdateRequest|MockObject $object;

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
        $this->object = $this->getMockBuilder(CatalogsVerticalFeedsUpdateRequest::class)->getMockForAbstractClass();
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
        $this->assertTrue(class_exists(CatalogsVerticalFeedsUpdateRequest::class));
        $this->assertInstanceOf(CatalogsVerticalFeedsUpdateRequest::class, $this->object);
    }

    /**
     * Test attribute "defaultCurrency"
     *
     * @group unit
     * @small
     */
    public function testPropertyDefaultCurrency(): void
    {
        $this->markTestSkipped('Test for property defaultCurrency not implemented');
    }

    /**
     * Test attribute "name"
     *
     * @group unit
     * @small
     */
    public function testPropertyName(): void
    {
        $this->markTestSkipped('Test for property name not implemented');
    }

    /**
     * Test attribute "format"
     *
     * @group unit
     * @small
     */
    public function testPropertyFormat(): void
    {
        $this->markTestSkipped('Test for property format not implemented');
    }

    /**
     * Test attribute "credentials"
     *
     * @group unit
     * @small
     */
    public function testPropertyCredentials(): void
    {
        $this->markTestSkipped('Test for property credentials not implemented');
    }

    /**
     * Test attribute "location"
     *
     * @group unit
     * @small
     */
    public function testPropertyLocation(): void
    {
        $this->markTestSkipped('Test for property location not implemented');
    }

    /**
     * Test attribute "preferredProcessingSchedule"
     *
     * @group unit
     * @small
     */
    public function testPropertyPreferredProcessingSchedule(): void
    {
        $this->markTestSkipped('Test for property preferredProcessingSchedule not implemented');
    }

    /**
     * Test attribute "status"
     *
     * @group unit
     * @small
     */
    public function testPropertyStatus(): void
    {
        $this->markTestSkipped('Test for property status not implemented');
    }

    /**
     * Test attribute "catalogType"
     *
     * @group unit
     * @small
     */
    public function testPropertyCatalogType(): void
    {
        $this->markTestSkipped('Test for property catalogType not implemented');
    }

    /**
     * Test attribute "defaultAvailability"
     *
     * @group unit
     * @small
     */
    public function testPropertyDefaultAvailability(): void
    {
        $this->markTestSkipped('Test for property defaultAvailability not implemented');
    }
}
