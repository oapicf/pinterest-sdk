<?php
/**
 * UpdateAssetGroupResponseTest
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

use OpenAPI\Server\Model\UpdateAssetGroupResponse;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * UpdateAssetGroupResponseTest Class Doc Comment
 *
 * @category    Class
 * @description UpdateAssetGroupResponse
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\UpdateAssetGroupResponse
 */
class UpdateAssetGroupResponseTest extends TestCase
{
    protected UpdateAssetGroupResponse|MockObject $object;

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
        $this->object = $this->getMockBuilder(UpdateAssetGroupResponse::class)->getMockForAbstractClass();
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
        $this->assertTrue(class_exists(UpdateAssetGroupResponse::class));
        $this->assertInstanceOf(UpdateAssetGroupResponse::class, $this->object);
    }

    /**
     * Test attribute "updatedAssetGroups"
     *
     * @group unit
     * @small
     */
    public function testPropertyUpdatedAssetGroups(): void
    {
        $this->markTestSkipped('Test for property updatedAssetGroups not implemented');
    }

    /**
     * Test attribute "exceptions"
     *
     * @group unit
     * @small
     */
    public function testPropertyExceptions(): void
    {
        $this->markTestSkipped('Test for property exceptions not implemented');
    }
}
