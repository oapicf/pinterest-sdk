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
use OpenAPIServer\Model\ConversionEventsUserData;

/**
 * ConversionEventsUserDataTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\ConversionEventsUserData
 */
class ConversionEventsUserDataTest extends TestCase
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
     * Test "ConversionEventsUserData"
     */
    public function testConversionEventsUserData()
    {
        $testConversionEventsUserData = new ConversionEventsUserData();
        $namespacedClassname = ConversionEventsUserData::getModelsNamespace() . '\\ConversionEventsUserData';
        $this->assertSame('\\' . ConversionEventsUserData::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "ConversionEventsUserData" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "ph"
     */
    public function testPropertyPh()
    {
        self::markTestIncomplete(
            'Test of "ph" property in "ConversionEventsUserData" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "ge"
     */
    public function testPropertyGe()
    {
        self::markTestIncomplete(
            'Test of "ge" property in "ConversionEventsUserData" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "db"
     */
    public function testPropertyDb()
    {
        self::markTestIncomplete(
            'Test of "db" property in "ConversionEventsUserData" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "ln"
     */
    public function testPropertyLn()
    {
        self::markTestIncomplete(
            'Test of "ln" property in "ConversionEventsUserData" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "fn"
     */
    public function testPropertyFn()
    {
        self::markTestIncomplete(
            'Test of "fn" property in "ConversionEventsUserData" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "ct"
     */
    public function testPropertyCt()
    {
        self::markTestIncomplete(
            'Test of "ct" property in "ConversionEventsUserData" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "st"
     */
    public function testPropertySt()
    {
        self::markTestIncomplete(
            'Test of "st" property in "ConversionEventsUserData" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "zp"
     */
    public function testPropertyZp()
    {
        self::markTestIncomplete(
            'Test of "zp" property in "ConversionEventsUserData" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "country"
     */
    public function testPropertyCountry()
    {
        self::markTestIncomplete(
            'Test of "country" property in "ConversionEventsUserData" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "externalId"
     */
    public function testPropertyExternalId()
    {
        self::markTestIncomplete(
            'Test of "externalId" property in "ConversionEventsUserData" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "clickId"
     */
    public function testPropertyClickId()
    {
        self::markTestIncomplete(
            'Test of "clickId" property in "ConversionEventsUserData" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "partnerId"
     */
    public function testPropertyPartnerId()
    {
        self::markTestIncomplete(
            'Test of "partnerId" property in "ConversionEventsUserData" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "em"
     */
    public function testPropertyEm()
    {
        self::markTestIncomplete(
            'Test of "em" property in "ConversionEventsUserData" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "hashedMaids"
     */
    public function testPropertyHashedMaids()
    {
        self::markTestIncomplete(
            'Test of "hashedMaids" property in "ConversionEventsUserData" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "clientIpAddress"
     */
    public function testPropertyClientIpAddress()
    {
        self::markTestIncomplete(
            'Test of "clientIpAddress" property in "ConversionEventsUserData" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "clientUserAgent"
     */
    public function testPropertyClientUserAgent()
    {
        self::markTestIncomplete(
            'Test of "clientUserAgent" property in "ConversionEventsUserData" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = ConversionEventsUserData::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

