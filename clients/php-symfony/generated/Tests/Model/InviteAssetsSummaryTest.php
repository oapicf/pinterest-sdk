<?php
/**
 * InviteAssetsSummaryTest
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

use OpenAPI\Server\Model\InviteAssetsSummary;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * InviteAssetsSummaryTest Class Doc Comment
 *
 * @category    Class
 * @description Ad accounts and profiles the member/partner will be granted access to with this invite/request.
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\InviteAssetsSummary
 */
class InviteAssetsSummaryTest extends TestCase
{
    protected InviteAssetsSummary|MockObject $object;

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
        $this->object = $this->getMockBuilder(InviteAssetsSummary::class)->getMockForAbstractClass();
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
        $this->assertTrue(class_exists(InviteAssetsSummary::class));
        $this->assertInstanceOf(InviteAssetsSummary::class, $this->object);
    }

    /**
     * Test attribute "adAccounts"
     *
     * @group unit
     * @small
     */
    public function testPropertyAdAccounts(): void
    {
        $this->markTestSkipped('Test for property adAccounts not implemented');
    }

    /**
     * Test attribute "profiles"
     *
     * @group unit
     * @small
     */
    public function testPropertyProfiles(): void
    {
        $this->markTestSkipped('Test for property profiles not implemented');
    }
}
