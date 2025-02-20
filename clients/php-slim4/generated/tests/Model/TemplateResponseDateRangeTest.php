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
use OpenAPIServer\Model\TemplateResponseDateRange;

/**
 * TemplateResponseDateRangeTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\TemplateResponseDateRange
 */
class TemplateResponseDateRangeTest extends TestCase
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
     * Test "TemplateResponseDateRange"
     */
    public function testTemplateResponseDateRange()
    {
        $testTemplateResponseDateRange = new TemplateResponseDateRange();
        $namespacedClassname = TemplateResponseDateRange::getModelsNamespace() . '\\TemplateResponseDateRange';
        $this->assertSame('\\' . TemplateResponseDateRange::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "TemplateResponseDateRange" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "dynamicDateRange"
     */
    public function testPropertyDynamicDateRange()
    {
        self::markTestIncomplete(
            'Test of "dynamicDateRange" property in "TemplateResponseDateRange" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "relativeDateRange"
     */
    public function testPropertyRelativeDateRange()
    {
        self::markTestIncomplete(
            'Test of "relativeDateRange" property in "TemplateResponseDateRange" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "absoluteDateRange"
     */
    public function testPropertyAbsoluteDateRange()
    {
        self::markTestIncomplete(
            'Test of "absoluteDateRange" property in "TemplateResponseDateRange" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = TemplateResponseDateRange::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

