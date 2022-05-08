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
use OpenAPIServer\Model\CampaignResponseAllOf1;

/**
 * CampaignResponseAllOf1Test Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\CampaignResponseAllOf1
 */
class CampaignResponseAllOf1Test extends TestCase
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
     * Test "CampaignResponseAllOf1"
     */
    public function testCampaignResponseAllOf1()
    {
        $testCampaignResponseAllOf1 = new CampaignResponseAllOf1();
        $namespacedClassname = CampaignResponseAllOf1::getModelsNamespace() . '\\CampaignResponseAllOf1';
        $this->assertSame('\\' . CampaignResponseAllOf1::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        $this->markTestIncomplete(
            'Test of "CampaignResponseAllOf1" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "objectiveType"
     */
    public function testPropertyObjectiveType()
    {
        $this->markTestIncomplete(
            'Test of "objectiveType" property in "CampaignResponseAllOf1" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "createdTime"
     */
    public function testPropertyCreatedTime()
    {
        $this->markTestIncomplete(
            'Test of "createdTime" property in "CampaignResponseAllOf1" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "updatedTime"
     */
    public function testPropertyUpdatedTime()
    {
        $this->markTestIncomplete(
            'Test of "updatedTime" property in "CampaignResponseAllOf1" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "type"
     */
    public function testPropertyType()
    {
        $this->markTestIncomplete(
            'Test of "type" property in "CampaignResponseAllOf1" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = CampaignResponseAllOf1::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}