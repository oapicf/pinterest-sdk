<?php
/**
 * ImageMetadataTest
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

use OpenAPI\Server\Model\ImageMetadata;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * ImageMetadataTest Class Doc Comment
 *
 * @category    Class
 * @description ImageMetadata
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\ImageMetadata
 */
class ImageMetadataTest extends TestCase
{
    protected ImageMetadata|MockObject $object;

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
        $this->object = $this->getMockBuilder(ImageMetadata::class)->getMockForAbstractClass();
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
        $this->assertTrue(class_exists(ImageMetadata::class));
        $this->assertInstanceOf(ImageMetadata::class, $this->object);
    }

    /**
     * Test attribute "itemType"
     *
     * @group unit
     * @small
     */
    public function testPropertyItemType(): void
    {
        $this->markTestSkipped('Test for property itemType not implemented');
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
     * Test attribute "images"
     *
     * @group unit
     * @small
     */
    public function testPropertyImages(): void
    {
        $this->markTestSkipped('Test for property images not implemented');
    }
}
