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
use OpenAPIServer\Model\DeletePartnersRequest;

/**
 * DeletePartnersRequestTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\DeletePartnersRequest
 */
class DeletePartnersRequestTest extends TestCase
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
     * Test "DeletePartnersRequest"
     */
    public function testDeletePartnersRequest()
    {
        $testDeletePartnersRequest = new DeletePartnersRequest();
        $namespacedClassname = DeletePartnersRequest::getModelsNamespace() . '\\DeletePartnersRequest';
        $this->assertSame('\\' . DeletePartnersRequest::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "DeletePartnersRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "partnerIds"
     */
    public function testPropertyPartnerIds()
    {
        self::markTestIncomplete(
            'Test of "partnerIds" property in "DeletePartnersRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "partnerType"
     */
    public function testPropertyPartnerType()
    {
        self::markTestIncomplete(
            'Test of "partnerType" property in "DeletePartnersRequest" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = DeletePartnersRequest::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

