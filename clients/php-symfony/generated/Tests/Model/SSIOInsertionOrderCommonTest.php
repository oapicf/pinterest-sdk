<?php
/**
 * SSIOInsertionOrderCommonTest
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

use OpenAPI\Server\Model\SSIOInsertionOrderCommon;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * SSIOInsertionOrderCommonTest Class Doc Comment
 *
 * @category    Class
 * @description SSIOInsertionOrderCommon
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\SSIOInsertionOrderCommon
 */
class SSIOInsertionOrderCommonTest extends TestCase
{
    protected SSIOInsertionOrderCommon|MockObject $object;

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
        $this->object = $this->getMockBuilder(SSIOInsertionOrderCommon::class)->getMockForAbstractClass();
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
        $this->assertTrue(class_exists(SSIOInsertionOrderCommon::class));
        $this->assertInstanceOf(SSIOInsertionOrderCommon::class, $this->object);
    }

    /**
     * Test attribute "startDate"
     *
     * @group unit
     * @small
     */
    public function testPropertyStartDate(): void
    {
        $this->markTestSkipped('Test for property startDate not implemented');
    }

    /**
     * Test attribute "endDate"
     *
     * @group unit
     * @small
     */
    public function testPropertyEndDate(): void
    {
        $this->markTestSkipped('Test for property endDate not implemented');
    }

    /**
     * Test attribute "poNumber"
     *
     * @group unit
     * @small
     */
    public function testPropertyPoNumber(): void
    {
        $this->markTestSkipped('Test for property poNumber not implemented');
    }

    /**
     * Test attribute "budgetAmount"
     *
     * @group unit
     * @small
     */
    public function testPropertyBudgetAmount(): void
    {
        $this->markTestSkipped('Test for property budgetAmount not implemented');
    }

    /**
     * Test attribute "billingContactFirstname"
     *
     * @group unit
     * @small
     */
    public function testPropertyBillingContactFirstname(): void
    {
        $this->markTestSkipped('Test for property billingContactFirstname not implemented');
    }

    /**
     * Test attribute "billingContactLastname"
     *
     * @group unit
     * @small
     */
    public function testPropertyBillingContactLastname(): void
    {
        $this->markTestSkipped('Test for property billingContactLastname not implemented');
    }

    /**
     * Test attribute "billingContactEmail"
     *
     * @group unit
     * @small
     */
    public function testPropertyBillingContactEmail(): void
    {
        $this->markTestSkipped('Test for property billingContactEmail not implemented');
    }

    /**
     * Test attribute "mediaContactFirstname"
     *
     * @group unit
     * @small
     */
    public function testPropertyMediaContactFirstname(): void
    {
        $this->markTestSkipped('Test for property mediaContactFirstname not implemented');
    }

    /**
     * Test attribute "mediaContactLastname"
     *
     * @group unit
     * @small
     */
    public function testPropertyMediaContactLastname(): void
    {
        $this->markTestSkipped('Test for property mediaContactLastname not implemented');
    }

    /**
     * Test attribute "mediaContactEmail"
     *
     * @group unit
     * @small
     */
    public function testPropertyMediaContactEmail(): void
    {
        $this->markTestSkipped('Test for property mediaContactEmail not implemented');
    }

    /**
     * Test attribute "agencyLink"
     *
     * @group unit
     * @small
     */
    public function testPropertyAgencyLink(): void
    {
        $this->markTestSkipped('Test for property agencyLink not implemented');
    }

    /**
     * Test attribute "userEmail"
     *
     * @group unit
     * @small
     */
    public function testPropertyUserEmail(): void
    {
        $this->markTestSkipped('Test for property userEmail not implemented');
    }
}
