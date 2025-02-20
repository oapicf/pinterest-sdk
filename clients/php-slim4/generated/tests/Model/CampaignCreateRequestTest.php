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
use OpenAPIServer\Model\CampaignCreateRequest;

/**
 * CampaignCreateRequestTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\CampaignCreateRequest
 */
class CampaignCreateRequestTest extends TestCase
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
     * Test "CampaignCreateRequest"
     */
    public function testCampaignCreateRequest()
    {
        $testCampaignCreateRequest = new CampaignCreateRequest();
        $namespacedClassname = CampaignCreateRequest::getModelsNamespace() . '\\CampaignCreateRequest';
        $this->assertSame('\\' . CampaignCreateRequest::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "CampaignCreateRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "adAccountId"
     */
    public function testPropertyAdAccountId()
    {
        self::markTestIncomplete(
            'Test of "adAccountId" property in "CampaignCreateRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "name"
     */
    public function testPropertyName()
    {
        self::markTestIncomplete(
            'Test of "name" property in "CampaignCreateRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "status"
     */
    public function testPropertyStatus()
    {
        self::markTestIncomplete(
            'Test of "status" property in "CampaignCreateRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "lifetimeSpendCap"
     */
    public function testPropertyLifetimeSpendCap()
    {
        self::markTestIncomplete(
            'Test of "lifetimeSpendCap" property in "CampaignCreateRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "dailySpendCap"
     */
    public function testPropertyDailySpendCap()
    {
        self::markTestIncomplete(
            'Test of "dailySpendCap" property in "CampaignCreateRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "orderLineId"
     */
    public function testPropertyOrderLineId()
    {
        self::markTestIncomplete(
            'Test of "orderLineId" property in "CampaignCreateRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "trackingUrls"
     */
    public function testPropertyTrackingUrls()
    {
        self::markTestIncomplete(
            'Test of "trackingUrls" property in "CampaignCreateRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "startTime"
     */
    public function testPropertyStartTime()
    {
        self::markTestIncomplete(
            'Test of "startTime" property in "CampaignCreateRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "endTime"
     */
    public function testPropertyEndTime()
    {
        self::markTestIncomplete(
            'Test of "endTime" property in "CampaignCreateRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "isFlexibleDailyBudgets"
     */
    public function testPropertyIsFlexibleDailyBudgets()
    {
        self::markTestIncomplete(
            'Test of "isFlexibleDailyBudgets" property in "CampaignCreateRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "defaultAdGroupBudgetInMicroCurrency"
     */
    public function testPropertyDefaultAdGroupBudgetInMicroCurrency()
    {
        self::markTestIncomplete(
            'Test of "defaultAdGroupBudgetInMicroCurrency" property in "CampaignCreateRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "isAutomatedCampaign"
     */
    public function testPropertyIsAutomatedCampaign()
    {
        self::markTestIncomplete(
            'Test of "isAutomatedCampaign" property in "CampaignCreateRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "objectiveType"
     */
    public function testPropertyObjectiveType()
    {
        self::markTestIncomplete(
            'Test of "objectiveType" property in "CampaignCreateRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = CampaignCreateRequest::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

