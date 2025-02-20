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
use OpenAPIServer\Model\KeywordMetrics;

/**
 * KeywordMetricsTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\KeywordMetrics
 */
class KeywordMetricsTest extends TestCase
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
     * Test "KeywordMetrics"
     */
    public function testKeywordMetrics()
    {
        $testKeywordMetrics = new KeywordMetrics();
        $namespacedClassname = KeywordMetrics::getModelsNamespace() . '\\KeywordMetrics';
        $this->assertSame('\\' . KeywordMetrics::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "KeywordMetrics" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "avgCpcInMicroCurrency"
     */
    public function testPropertyAvgCpcInMicroCurrency()
    {
        self::markTestIncomplete(
            'Test of "avgCpcInMicroCurrency" property in "KeywordMetrics" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "keywordQueryVolume"
     */
    public function testPropertyKeywordQueryVolume()
    {
        self::markTestIncomplete(
            'Test of "keywordQueryVolume" property in "KeywordMetrics" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = KeywordMetrics::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

