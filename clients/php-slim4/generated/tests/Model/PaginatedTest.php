<?php

/**
 * Pinterest REST API
 * PHP version 7.4
 *
 * @package OpenAPIServer
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */

/**
 * Pinterest's REST API
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Please update the test case below to test the model.
 */
namespace OpenAPIServer\Model;

use PHPUnit\Framework\TestCase;
use OpenAPIServer\Model\Paginated;

/**
 * PaginatedTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\Paginated
 */
class PaginatedTest extends TestCase
{

    /**
     * Setup before running any test cases
     */
    public static function setUpBeforeClass(): void
    {
    }

    /**
     * Setup before running each test case
     */
    public function setUp(): void
    {
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
     * Test "Paginated"
     */
    public function testPaginated()
    {
        $testPaginated = new Paginated();
        $namespacedClassname = Paginated::getModelsNamespace() . '\\Paginated';
        $this->assertSame('\\' . Paginated::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "Paginated" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "items"
     */
    public function testPropertyItems()
    {
        self::markTestIncomplete(
            'Test of "items" property in "Paginated" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "bookmark"
     */
    public function testPropertyBookmark()
    {
        self::markTestIncomplete(
            'Test of "bookmark" property in "Paginated" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = Paginated::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

