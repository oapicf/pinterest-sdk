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
use OpenAPIServer\Model\UserWebsiteVerificationCode;

/**
 * UserWebsiteVerificationCodeTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\UserWebsiteVerificationCode
 */
class UserWebsiteVerificationCodeTest extends TestCase
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
     * Test "UserWebsiteVerificationCode"
     */
    public function testUserWebsiteVerificationCode()
    {
        $testUserWebsiteVerificationCode = new UserWebsiteVerificationCode();
        $namespacedClassname = UserWebsiteVerificationCode::getModelsNamespace() . '\\UserWebsiteVerificationCode';
        $this->assertSame('\\' . UserWebsiteVerificationCode::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "UserWebsiteVerificationCode" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "verificationCode"
     */
    public function testPropertyVerificationCode()
    {
        self::markTestIncomplete(
            'Test of "verificationCode" property in "UserWebsiteVerificationCode" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "dnsTxtRecord"
     */
    public function testPropertyDnsTxtRecord()
    {
        self::markTestIncomplete(
            'Test of "dnsTxtRecord" property in "UserWebsiteVerificationCode" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "metatag"
     */
    public function testPropertyMetatag()
    {
        self::markTestIncomplete(
            'Test of "metatag" property in "UserWebsiteVerificationCode" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "filename"
     */
    public function testPropertyFilename()
    {
        self::markTestIncomplete(
            'Test of "filename" property in "UserWebsiteVerificationCode" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "fileContent"
     */
    public function testPropertyFileContent()
    {
        self::markTestIncomplete(
            'Test of "fileContent" property in "UserWebsiteVerificationCode" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = UserWebsiteVerificationCode::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

