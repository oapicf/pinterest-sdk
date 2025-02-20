<?php
/**
 * IntegrationLogClientErrorTest
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

use OpenAPI\Server\Model\IntegrationLogClientError;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * IntegrationLogClientErrorTest Class Doc Comment
 *
 * @category    Class
 * @description System error details included in the log sent by the client.
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\IntegrationLogClientError
 */
class IntegrationLogClientErrorTest extends TestCase
{
    protected IntegrationLogClientError|MockObject $object;

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
        $this->object = $this->getMockBuilder(IntegrationLogClientError::class)->getMockForAbstractClass();
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
        $this->assertTrue(class_exists(IntegrationLogClientError::class));
        $this->assertInstanceOf(IntegrationLogClientError::class, $this->object);
    }

    /**
     * Test attribute "cause"
     *
     * @group unit
     * @small
     */
    public function testPropertyCause(): void
    {
        $this->markTestSkipped('Test for property cause not implemented');
    }

    /**
     * Test attribute "columnNumber"
     *
     * @group unit
     * @small
     */
    public function testPropertyColumnNumber(): void
    {
        $this->markTestSkipped('Test for property columnNumber not implemented');
    }

    /**
     * Test attribute "fileName"
     *
     * @group unit
     * @small
     */
    public function testPropertyFileName(): void
    {
        $this->markTestSkipped('Test for property fileName not implemented');
    }

    /**
     * Test attribute "lineNumber"
     *
     * @group unit
     * @small
     */
    public function testPropertyLineNumber(): void
    {
        $this->markTestSkipped('Test for property lineNumber not implemented');
    }

    /**
     * Test attribute "message"
     *
     * @group unit
     * @small
     */
    public function testPropertyMessage(): void
    {
        $this->markTestSkipped('Test for property message not implemented');
    }

    /**
     * Test attribute "messageDetail"
     *
     * @group unit
     * @small
     */
    public function testPropertyMessageDetail(): void
    {
        $this->markTestSkipped('Test for property messageDetail not implemented');
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
     * Test attribute "number"
     *
     * @group unit
     * @small
     */
    public function testPropertyNumber(): void
    {
        $this->markTestSkipped('Test for property number not implemented');
    }

    /**
     * Test attribute "stackTrace"
     *
     * @group unit
     * @small
     */
    public function testPropertyStackTrace(): void
    {
        $this->markTestSkipped('Test for property stackTrace not implemented');
    }
}
