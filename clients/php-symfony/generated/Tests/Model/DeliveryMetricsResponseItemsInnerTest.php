<?php
/**
 * DeliveryMetricsResponseItemsInnerTest
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

use OpenAPI\Server\Model\DeliveryMetricsResponseItemsInner;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * DeliveryMetricsResponseItemsInnerTest Class Doc Comment
 *
 * @category    Class
 * @description DeliveryMetricsResponseItemsInner
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\DeliveryMetricsResponseItemsInner
 */
class DeliveryMetricsResponseItemsInnerTest extends TestCase
{
    protected DeliveryMetricsResponseItemsInner|MockObject $object;

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
        $this->object = $this->getMockBuilder(DeliveryMetricsResponseItemsInner::class)->getMockForAbstractClass();
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
        $this->assertTrue(class_exists(DeliveryMetricsResponseItemsInner::class));
        $this->assertInstanceOf(DeliveryMetricsResponseItemsInner::class, $this->object);
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
     * Test attribute "category"
     *
     * @group unit
     * @small
     */
    public function testPropertyCategory(): void
    {
        $this->markTestSkipped('Test for property category not implemented');
    }

    /**
     * Test attribute "definition"
     *
     * @group unit
     * @small
     */
    public function testPropertyDefinition(): void
    {
        $this->markTestSkipped('Test for property definition not implemented');
    }

    /**
     * Test attribute "displayName"
     *
     * @group unit
     * @small
     */
    public function testPropertyDisplayName(): void
    {
        $this->markTestSkipped('Test for property displayName not implemented');
    }
}