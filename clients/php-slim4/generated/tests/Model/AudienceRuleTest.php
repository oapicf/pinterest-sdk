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
use OpenAPIServer\Model\AudienceRule;

/**
 * AudienceRuleTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\AudienceRule
 */
class AudienceRuleTest extends TestCase
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
     * Test "AudienceRule"
     */
    public function testAudienceRule()
    {
        $testAudienceRule = new AudienceRule();
        $namespacedClassname = AudienceRule::getModelsNamespace() . '\\AudienceRule';
        $this->assertSame('\\' . AudienceRule::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "AudienceRule" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "country"
     */
    public function testPropertyCountry()
    {
        self::markTestIncomplete(
            'Test of "country" property in "AudienceRule" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "customerListId"
     */
    public function testPropertyCustomerListId()
    {
        self::markTestIncomplete(
            'Test of "customerListId" property in "AudienceRule" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "engagementDomain"
     */
    public function testPropertyEngagementDomain()
    {
        self::markTestIncomplete(
            'Test of "engagementDomain" property in "AudienceRule" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "engagementType"
     */
    public function testPropertyEngagementType()
    {
        self::markTestIncomplete(
            'Test of "engagementType" property in "AudienceRule" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "event"
     */
    public function testPropertyEvent()
    {
        self::markTestIncomplete(
            'Test of "event" property in "AudienceRule" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "eventData"
     */
    public function testPropertyEventData()
    {
        self::markTestIncomplete(
            'Test of "eventData" property in "AudienceRule" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "percentage"
     */
    public function testPropertyPercentage()
    {
        self::markTestIncomplete(
            'Test of "percentage" property in "AudienceRule" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "pinId"
     */
    public function testPropertyPinId()
    {
        self::markTestIncomplete(
            'Test of "pinId" property in "AudienceRule" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "prefill"
     */
    public function testPropertyPrefill()
    {
        self::markTestIncomplete(
            'Test of "prefill" property in "AudienceRule" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "retentionDays"
     */
    public function testPropertyRetentionDays()
    {
        self::markTestIncomplete(
            'Test of "retentionDays" property in "AudienceRule" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "seedId"
     */
    public function testPropertySeedId()
    {
        self::markTestIncomplete(
            'Test of "seedId" property in "AudienceRule" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "url"
     */
    public function testPropertyUrl()
    {
        self::markTestIncomplete(
            'Test of "url" property in "AudienceRule" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "visitorSourceId"
     */
    public function testPropertyVisitorSourceId()
    {
        self::markTestIncomplete(
            'Test of "visitorSourceId" property in "AudienceRule" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "eventSource"
     */
    public function testPropertyEventSource()
    {
        self::markTestIncomplete(
            'Test of "eventSource" property in "AudienceRule" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "ingestionSource"
     */
    public function testPropertyIngestionSource()
    {
        self::markTestIncomplete(
            'Test of "ingestionSource" property in "AudienceRule" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "engagerType"
     */
    public function testPropertyEngagerType()
    {
        self::markTestIncomplete(
            'Test of "engagerType" property in "AudienceRule" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "campaignId"
     */
    public function testPropertyCampaignId()
    {
        self::markTestIncomplete(
            'Test of "campaignId" property in "AudienceRule" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "adId"
     */
    public function testPropertyAdId()
    {
        self::markTestIncomplete(
            'Test of "adId" property in "AudienceRule" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "objectiveType"
     */
    public function testPropertyObjectiveType()
    {
        self::markTestIncomplete(
            'Test of "objectiveType" property in "AudienceRule" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "adAccountId"
     */
    public function testPropertyAdAccountId()
    {
        self::markTestIncomplete(
            'Test of "adAccountId" property in "AudienceRule" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = AudienceRule::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

