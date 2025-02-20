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
use OpenAPIServer\Model\AdsCreditDiscountsResponse;

/**
 * AdsCreditDiscountsResponseTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\AdsCreditDiscountsResponse
 */
class AdsCreditDiscountsResponseTest extends TestCase
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
     * Test "AdsCreditDiscountsResponse"
     */
    public function testAdsCreditDiscountsResponse()
    {
        $testAdsCreditDiscountsResponse = new AdsCreditDiscountsResponse();
        $namespacedClassname = AdsCreditDiscountsResponse::getModelsNamespace() . '\\AdsCreditDiscountsResponse';
        $this->assertSame('\\' . AdsCreditDiscountsResponse::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "AdsCreditDiscountsResponse" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "active"
     */
    public function testPropertyActive()
    {
        self::markTestIncomplete(
            'Test of "active" property in "AdsCreditDiscountsResponse" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "advertiserId"
     */
    public function testPropertyAdvertiserId()
    {
        self::markTestIncomplete(
            'Test of "advertiserId" property in "AdsCreditDiscountsResponse" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "discountType"
     */
    public function testPropertyDiscountType()
    {
        self::markTestIncomplete(
            'Test of "discountType" property in "AdsCreditDiscountsResponse" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "discountInMicroCurrency"
     */
    public function testPropertyDiscountInMicroCurrency()
    {
        self::markTestIncomplete(
            'Test of "discountInMicroCurrency" property in "AdsCreditDiscountsResponse" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "discountCurrency"
     */
    public function testPropertyDiscountCurrency()
    {
        self::markTestIncomplete(
            'Test of "discountCurrency" property in "AdsCreditDiscountsResponse" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "title"
     */
    public function testPropertyTitle()
    {
        self::markTestIncomplete(
            'Test of "title" property in "AdsCreditDiscountsResponse" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "remainingDiscountInMicroCurrency"
     */
    public function testPropertyRemainingDiscountInMicroCurrency()
    {
        self::markTestIncomplete(
            'Test of "remainingDiscountInMicroCurrency" property in "AdsCreditDiscountsResponse" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = AdsCreditDiscountsResponse::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

