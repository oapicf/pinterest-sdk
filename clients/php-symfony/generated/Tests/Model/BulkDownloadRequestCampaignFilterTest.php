<?php
/**
 * BulkDownloadRequestCampaignFilterTest
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

use OpenAPI\Server\Model\BulkDownloadRequestCampaignFilter;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * BulkDownloadRequestCampaignFilterTest Class Doc Comment
 *
 * @category    Class
 * @description BulkDownloadRequestCampaignFilter
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\BulkDownloadRequestCampaignFilter
 */
class BulkDownloadRequestCampaignFilterTest extends TestCase
{
    protected BulkDownloadRequestCampaignFilter|MockObject $object;

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
        $this->object = $this->getMockBuilder(BulkDownloadRequestCampaignFilter::class)->getMockForAbstractClass();
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
        $this->assertTrue(class_exists(BulkDownloadRequestCampaignFilter::class));
        $this->assertInstanceOf(BulkDownloadRequestCampaignFilter::class, $this->object);
    }

    /**
     * Test attribute "startTime"
     *
     * @group unit
     * @small
     */
    public function testPropertyStartTime(): void
    {
        $this->markTestSkipped('Test for property startTime not implemented');
    }

    /**
     * Test attribute "endTime"
     *
     * @group unit
     * @small
     */
    public function testPropertyEndTime(): void
    {
        $this->markTestSkipped('Test for property endTime not implemented');
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
     * Test attribute "campaignStatus"
     *
     * @group unit
     * @small
     */
    public function testPropertyCampaignStatus(): void
    {
        $this->markTestSkipped('Test for property campaignStatus not implemented');
    }

    /**
     * Test attribute "objectiveType"
     *
     * @group unit
     * @small
     */
    public function testPropertyObjectiveType(): void
    {
        $this->markTestSkipped('Test for property objectiveType not implemented');
    }
}