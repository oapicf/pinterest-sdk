<?php
/**
 * PinAnalyticsMetricsResponseTest
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

use OpenAPI\Server\Model\PinAnalyticsMetricsResponse;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * PinAnalyticsMetricsResponseTest Class Doc Comment
 *
 * @category    Class
 * @description PinAnalyticsMetricsResponse
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\PinAnalyticsMetricsResponse
 */
class PinAnalyticsMetricsResponseTest extends TestCase
{
    protected PinAnalyticsMetricsResponse|MockObject $object;

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
        $this->object = $this->getMockBuilder(PinAnalyticsMetricsResponse::class)->getMockForAbstractClass();
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
        $this->assertTrue(class_exists(PinAnalyticsMetricsResponse::class));
        $this->assertInstanceOf(PinAnalyticsMetricsResponse::class, $this->object);
    }

    /**
     * Test attribute "lifetimeMetrics"
     *
     * @group unit
     * @small
     */
    public function testPropertyLifetimeMetrics(): void
    {
        $this->markTestSkipped('Test for property lifetimeMetrics not implemented');
    }

    /**
     * Test attribute "dailyMetrics"
     *
     * @group unit
     * @small
     */
    public function testPropertyDailyMetrics(): void
    {
        $this->markTestSkipped('Test for property dailyMetrics not implemented');
    }

    /**
     * Test attribute "summaryMetrics"
     *
     * @group unit
     * @small
     */
    public function testPropertySummaryMetrics(): void
    {
        $this->markTestSkipped('Test for property summaryMetrics not implemented');
    }
}
