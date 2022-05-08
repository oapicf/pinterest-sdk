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
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Please update the test case below to test the model.
 */
namespace OpenAPIServer\Model;

use PHPUnit\Framework\TestCase;
use OpenAPIServer\Model\AdsAnalyticsCreateAsyncRequestAllOf;

/**
 * AdsAnalyticsCreateAsyncRequestAllOfTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\AdsAnalyticsCreateAsyncRequestAllOf
 */
class AdsAnalyticsCreateAsyncRequestAllOfTest extends TestCase
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
     * Test "AdsAnalyticsCreateAsyncRequestAllOf"
     */
    public function testAdsAnalyticsCreateAsyncRequestAllOf()
    {
        $testAdsAnalyticsCreateAsyncRequestAllOf = new AdsAnalyticsCreateAsyncRequestAllOf();
        $namespacedClassname = AdsAnalyticsCreateAsyncRequestAllOf::getModelsNamespace() . '\\AdsAnalyticsCreateAsyncRequestAllOf';
        $this->assertSame('\\' . AdsAnalyticsCreateAsyncRequestAllOf::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        $this->markTestIncomplete(
            'Test of "AdsAnalyticsCreateAsyncRequestAllOf" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "startDate"
     */
    public function testPropertyStartDate()
    {
        $this->markTestIncomplete(
            'Test of "startDate" property in "AdsAnalyticsCreateAsyncRequestAllOf" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "endDate"
     */
    public function testPropertyEndDate()
    {
        $this->markTestIncomplete(
            'Test of "endDate" property in "AdsAnalyticsCreateAsyncRequestAllOf" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "granularity"
     */
    public function testPropertyGranularity()
    {
        $this->markTestIncomplete(
            'Test of "granularity" property in "AdsAnalyticsCreateAsyncRequestAllOf" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "clickWindowDays"
     */
    public function testPropertyClickWindowDays()
    {
        $this->markTestIncomplete(
            'Test of "clickWindowDays" property in "AdsAnalyticsCreateAsyncRequestAllOf" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "engagementWindowDays"
     */
    public function testPropertyEngagementWindowDays()
    {
        $this->markTestIncomplete(
            'Test of "engagementWindowDays" property in "AdsAnalyticsCreateAsyncRequestAllOf" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "viewWindowDays"
     */
    public function testPropertyViewWindowDays()
    {
        $this->markTestIncomplete(
            'Test of "viewWindowDays" property in "AdsAnalyticsCreateAsyncRequestAllOf" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "conversionReportTime"
     */
    public function testPropertyConversionReportTime()
    {
        $this->markTestIncomplete(
            'Test of "conversionReportTime" property in "AdsAnalyticsCreateAsyncRequestAllOf" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "attributionTypes"
     */
    public function testPropertyAttributionTypes()
    {
        $this->markTestIncomplete(
            'Test of "attributionTypes" property in "AdsAnalyticsCreateAsyncRequestAllOf" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = AdsAnalyticsCreateAsyncRequestAllOf::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}