<?php
/**
 * CatalogsVerticalBatchRequestTest
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
 * The version of the OpenAPI document: 5.12.0
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

use OpenAPI\Server\Model\CatalogsVerticalBatchRequest;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * CatalogsVerticalBatchRequestTest Class Doc Comment
 *
 * @category    Class
 * @description A request object that can have multiple operations on a single batch
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\CatalogsVerticalBatchRequest
 */
class CatalogsVerticalBatchRequestTest extends TestCase
{
    protected CatalogsVerticalBatchRequest|MockObject $object;

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
        $this->object = $this->getMockBuilder(CatalogsVerticalBatchRequest::class)->getMockForAbstractClass();
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
        $this->assertTrue(class_exists(CatalogsVerticalBatchRequest::class));
        $this->assertInstanceOf(CatalogsVerticalBatchRequest::class, $this->object);
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
     * Test attribute "language"
     *
     * @group unit
     * @small
     */
    public function testPropertyLanguage(): void
    {
        $this->markTestSkipped('Test for property language not implemented');
    }

    /**
     * Test attribute "items"
     *
     * @group unit
     * @small
     */
    public function testPropertyItems(): void
    {
        $this->markTestSkipped('Test for property items not implemented');
    }

    /**
     * Test attribute "catalogId"
     *
     * @group unit
     * @small
     */
    public function testPropertyCatalogId(): void
    {
        $this->markTestSkipped('Test for property catalogId not implemented');
    }
}