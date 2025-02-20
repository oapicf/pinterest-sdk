<?php
/**
 * PinCreateTest
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

use OpenAPI\Server\Model\PinCreate;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * PinCreateTest Class Doc Comment
 *
 * @category    Class
 * @description Pin
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\PinCreate
 */
class PinCreateTest extends TestCase
{
    protected PinCreate|MockObject $object;

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
        $this->object = $this->getMockBuilder(PinCreate::class)->getMockForAbstractClass();
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
        $this->assertTrue(class_exists(PinCreate::class));
        $this->assertInstanceOf(PinCreate::class, $this->object);
    }

    /**
     * Test attribute "id"
     *
     * @group unit
     * @small
     */
    public function testPropertyId(): void
    {
        $this->markTestSkipped('Test for property id not implemented');
    }

    /**
     * Test attribute "createdAt"
     *
     * @group unit
     * @small
     */
    public function testPropertyCreatedAt(): void
    {
        $this->markTestSkipped('Test for property createdAt not implemented');
    }

    /**
     * Test attribute "link"
     *
     * @group unit
     * @small
     */
    public function testPropertyLink(): void
    {
        $this->markTestSkipped('Test for property link not implemented');
    }

    /**
     * Test attribute "title"
     *
     * @group unit
     * @small
     */
    public function testPropertyTitle(): void
    {
        $this->markTestSkipped('Test for property title not implemented');
    }

    /**
     * Test attribute "description"
     *
     * @group unit
     * @small
     */
    public function testPropertyDescription(): void
    {
        $this->markTestSkipped('Test for property description not implemented');
    }

    /**
     * Test attribute "dominantColor"
     *
     * @group unit
     * @small
     */
    public function testPropertyDominantColor(): void
    {
        $this->markTestSkipped('Test for property dominantColor not implemented');
    }

    /**
     * Test attribute "altText"
     *
     * @group unit
     * @small
     */
    public function testPropertyAltText(): void
    {
        $this->markTestSkipped('Test for property altText not implemented');
    }

    /**
     * Test attribute "boardId"
     *
     * @group unit
     * @small
     */
    public function testPropertyBoardId(): void
    {
        $this->markTestSkipped('Test for property boardId not implemented');
    }

    /**
     * Test attribute "boardSectionId"
     *
     * @group unit
     * @small
     */
    public function testPropertyBoardSectionId(): void
    {
        $this->markTestSkipped('Test for property boardSectionId not implemented');
    }

    /**
     * Test attribute "boardOwner"
     *
     * @group unit
     * @small
     */
    public function testPropertyBoardOwner(): void
    {
        $this->markTestSkipped('Test for property boardOwner not implemented');
    }

    /**
     * Test attribute "media"
     *
     * @group unit
     * @small
     */
    public function testPropertyMedia(): void
    {
        $this->markTestSkipped('Test for property media not implemented');
    }

    /**
     * Test attribute "mediaSource"
     *
     * @group unit
     * @small
     */
    public function testPropertyMediaSource(): void
    {
        $this->markTestSkipped('Test for property mediaSource not implemented');
    }

    /**
     * Test attribute "parentPinId"
     *
     * @group unit
     * @small
     */
    public function testPropertyParentPinId(): void
    {
        $this->markTestSkipped('Test for property parentPinId not implemented');
    }

    /**
     * Test attribute "note"
     *
     * @group unit
     * @small
     */
    public function testPropertyNote(): void
    {
        $this->markTestSkipped('Test for property note not implemented');
    }
}
