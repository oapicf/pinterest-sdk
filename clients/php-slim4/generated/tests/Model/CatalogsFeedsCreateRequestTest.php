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
use OpenAPIServer\Model\CatalogsFeedsCreateRequest;

/**
 * CatalogsFeedsCreateRequestTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\CatalogsFeedsCreateRequest
 */
class CatalogsFeedsCreateRequestTest extends TestCase
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
     * Test "CatalogsFeedsCreateRequest"
     */
    public function testCatalogsFeedsCreateRequest()
    {
        $testCatalogsFeedsCreateRequest = new CatalogsFeedsCreateRequest();
        $namespacedClassname = CatalogsFeedsCreateRequest::getModelsNamespace() . '\\CatalogsFeedsCreateRequest';
        $this->assertSame('\\' . CatalogsFeedsCreateRequest::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "CatalogsFeedsCreateRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "defaultCurrency"
     */
    public function testPropertyDefaultCurrency()
    {
        self::markTestIncomplete(
            'Test of "defaultCurrency" property in "CatalogsFeedsCreateRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "name"
     */
    public function testPropertyName()
    {
        self::markTestIncomplete(
            'Test of "name" property in "CatalogsFeedsCreateRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "format"
     */
    public function testPropertyFormat()
    {
        self::markTestIncomplete(
            'Test of "format" property in "CatalogsFeedsCreateRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "defaultLocale"
     */
    public function testPropertyDefaultLocale()
    {
        self::markTestIncomplete(
            'Test of "defaultLocale" property in "CatalogsFeedsCreateRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "credentials"
     */
    public function testPropertyCredentials()
    {
        self::markTestIncomplete(
            'Test of "credentials" property in "CatalogsFeedsCreateRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "location"
     */
    public function testPropertyLocation()
    {
        self::markTestIncomplete(
            'Test of "location" property in "CatalogsFeedsCreateRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "preferredProcessingSchedule"
     */
    public function testPropertyPreferredProcessingSchedule()
    {
        self::markTestIncomplete(
            'Test of "preferredProcessingSchedule" property in "CatalogsFeedsCreateRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "defaultCountry"
     */
    public function testPropertyDefaultCountry()
    {
        self::markTestIncomplete(
            'Test of "defaultCountry" property in "CatalogsFeedsCreateRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "defaultAvailability"
     */
    public function testPropertyDefaultAvailability()
    {
        self::markTestIncomplete(
            'Test of "defaultAvailability" property in "CatalogsFeedsCreateRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "status"
     */
    public function testPropertyStatus()
    {
        self::markTestIncomplete(
            'Test of "status" property in "CatalogsFeedsCreateRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = CatalogsFeedsCreateRequest::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

