<?php
/**
 * KeywordTest
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

use OpenAPI\Server\Model\Keyword;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * KeywordTest Class Doc Comment
 *
 * @category    Class
 * @description Keyword
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\Keyword
 */
class KeywordTest extends TestCase
{
    protected Keyword|MockObject $object;

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
        $this->object = $this->getMockBuilder(Keyword::class)->getMockForAbstractClass();
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
        $this->assertTrue(class_exists(Keyword::class));
        $this->assertInstanceOf(Keyword::class, $this->object);
    }

    /**
     * Test attribute "bid"
     *
     * @group unit
     * @small
     */
    public function testPropertyBid(): void
    {
        $this->markTestSkipped('Test for property bid not implemented');
    }

    /**
     * Test attribute "matchType"
     *
     * @group unit
     * @small
     */
    public function testPropertyMatchType(): void
    {
        $this->markTestSkipped('Test for property matchType not implemented');
    }

    /**
     * Test attribute "value"
     *
     * @group unit
     * @small
     */
    public function testPropertyValue(): void
    {
        $this->markTestSkipped('Test for property value not implemented');
    }

    /**
     * Test attribute "archived"
     *
     * @group unit
     * @small
     */
    public function testPropertyArchived(): void
    {
        $this->markTestSkipped('Test for property archived not implemented');
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
     * Test attribute "parentId"
     *
     * @group unit
     * @small
     */
    public function testPropertyParentId(): void
    {
        $this->markTestSkipped('Test for property parentId not implemented');
    }

    /**
     * Test attribute "parentType"
     *
     * @group unit
     * @small
     */
    public function testPropertyParentType(): void
    {
        $this->markTestSkipped('Test for property parentType not implemented');
    }

    /**
     * Test attribute "type"
     *
     * @group unit
     * @small
     */
    public function testPropertyType(): void
    {
        $this->markTestSkipped('Test for property type not implemented');
    }
}
