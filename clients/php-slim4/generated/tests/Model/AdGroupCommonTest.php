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
use OpenAPIServer\Model\AdGroupCommon;

/**
 * AdGroupCommonTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\AdGroupCommon
 */
class AdGroupCommonTest extends TestCase
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
     * Test "AdGroupCommon"
     */
    public function testAdGroupCommon()
    {
        $testAdGroupCommon = new AdGroupCommon();
        $namespacedClassname = AdGroupCommon::getModelsNamespace() . '\\AdGroupCommon';
        $this->assertSame('\\' . AdGroupCommon::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "AdGroupCommon" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "name"
     */
    public function testPropertyName()
    {
        self::markTestIncomplete(
            'Test of "name" property in "AdGroupCommon" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "status"
     */
    public function testPropertyStatus()
    {
        self::markTestIncomplete(
            'Test of "status" property in "AdGroupCommon" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "budgetInMicroCurrency"
     */
    public function testPropertyBudgetInMicroCurrency()
    {
        self::markTestIncomplete(
            'Test of "budgetInMicroCurrency" property in "AdGroupCommon" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "bidInMicroCurrency"
     */
    public function testPropertyBidInMicroCurrency()
    {
        self::markTestIncomplete(
            'Test of "bidInMicroCurrency" property in "AdGroupCommon" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "optimizationGoalMetadata"
     */
    public function testPropertyOptimizationGoalMetadata()
    {
        self::markTestIncomplete(
            'Test of "optimizationGoalMetadata" property in "AdGroupCommon" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "budgetType"
     */
    public function testPropertyBudgetType()
    {
        self::markTestIncomplete(
            'Test of "budgetType" property in "AdGroupCommon" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "startTime"
     */
    public function testPropertyStartTime()
    {
        self::markTestIncomplete(
            'Test of "startTime" property in "AdGroupCommon" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "endTime"
     */
    public function testPropertyEndTime()
    {
        self::markTestIncomplete(
            'Test of "endTime" property in "AdGroupCommon" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "targetingSpec"
     */
    public function testPropertyTargetingSpec()
    {
        self::markTestIncomplete(
            'Test of "targetingSpec" property in "AdGroupCommon" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "lifetimeFrequencyCap"
     */
    public function testPropertyLifetimeFrequencyCap()
    {
        self::markTestIncomplete(
            'Test of "lifetimeFrequencyCap" property in "AdGroupCommon" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "trackingUrls"
     */
    public function testPropertyTrackingUrls()
    {
        self::markTestIncomplete(
            'Test of "trackingUrls" property in "AdGroupCommon" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "autoTargetingEnabled"
     */
    public function testPropertyAutoTargetingEnabled()
    {
        self::markTestIncomplete(
            'Test of "autoTargetingEnabled" property in "AdGroupCommon" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "placementGroup"
     */
    public function testPropertyPlacementGroup()
    {
        self::markTestIncomplete(
            'Test of "placementGroup" property in "AdGroupCommon" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "pacingDeliveryType"
     */
    public function testPropertyPacingDeliveryType()
    {
        self::markTestIncomplete(
            'Test of "pacingDeliveryType" property in "AdGroupCommon" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "campaignId"
     */
    public function testPropertyCampaignId()
    {
        self::markTestIncomplete(
            'Test of "campaignId" property in "AdGroupCommon" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "billableEvent"
     */
    public function testPropertyBillableEvent()
    {
        self::markTestIncomplete(
            'Test of "billableEvent" property in "AdGroupCommon" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "bidStrategyType"
     */
    public function testPropertyBidStrategyType()
    {
        self::markTestIncomplete(
            'Test of "bidStrategyType" property in "AdGroupCommon" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "targetingTemplateIds"
     */
    public function testPropertyTargetingTemplateIds()
    {
        self::markTestIncomplete(
            'Test of "targetingTemplateIds" property in "AdGroupCommon" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = AdGroupCommon::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

