<?php
/**
 * CatalogsProductGroupFiltersRequestAnyOf1Test
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

use OpenAPI\Server\Model\CatalogsProductGroupFiltersRequestAnyOf1;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * CatalogsProductGroupFiltersRequestAnyOf1Test Class Doc Comment
 *
 * @category    Class
 * @description CatalogsProductGroupFiltersRequestAnyOf1
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\CatalogsProductGroupFiltersRequestAnyOf1
 */
class CatalogsProductGroupFiltersRequestAnyOf1Test extends TestCase
{
    protected CatalogsProductGroupFiltersRequestAnyOf1|MockObject $object;

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
        $this->object = $this->getMockBuilder(CatalogsProductGroupFiltersRequestAnyOf1::class)->getMockForAbstractClass();
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
        $this->assertTrue(class_exists(CatalogsProductGroupFiltersRequestAnyOf1::class));
        $this->assertInstanceOf(CatalogsProductGroupFiltersRequestAnyOf1::class, $this->object);
    }

    /**
     * Test attribute "allOf"
     *
     * @group unit
     * @small
     */
    public function testPropertyAllOf(): void
    {
        $this->markTestSkipped('Test for property allOf not implemented');
    }
}
