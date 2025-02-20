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
use OpenAPIServer\Model\MediaUploadAllOfUploadParameters;

/**
 * MediaUploadAllOfUploadParametersTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\MediaUploadAllOfUploadParameters
 */
class MediaUploadAllOfUploadParametersTest extends TestCase
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
     * Test "MediaUploadAllOfUploadParameters"
     */
    public function testMediaUploadAllOfUploadParameters()
    {
        $testMediaUploadAllOfUploadParameters = new MediaUploadAllOfUploadParameters();
        $namespacedClassname = MediaUploadAllOfUploadParameters::getModelsNamespace() . '\\MediaUploadAllOfUploadParameters';
        $this->assertSame('\\' . MediaUploadAllOfUploadParameters::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "MediaUploadAllOfUploadParameters" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "xAmzDate"
     */
    public function testPropertyXAmzDate()
    {
        self::markTestIncomplete(
            'Test of "xAmzDate" property in "MediaUploadAllOfUploadParameters" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "xAmzSignature"
     */
    public function testPropertyXAmzSignature()
    {
        self::markTestIncomplete(
            'Test of "xAmzSignature" property in "MediaUploadAllOfUploadParameters" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "xAmzSecurityToken"
     */
    public function testPropertyXAmzSecurityToken()
    {
        self::markTestIncomplete(
            'Test of "xAmzSecurityToken" property in "MediaUploadAllOfUploadParameters" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "xAmzAlgorithm"
     */
    public function testPropertyXAmzAlgorithm()
    {
        self::markTestIncomplete(
            'Test of "xAmzAlgorithm" property in "MediaUploadAllOfUploadParameters" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "key"
     */
    public function testPropertyKey()
    {
        self::markTestIncomplete(
            'Test of "key" property in "MediaUploadAllOfUploadParameters" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "policy"
     */
    public function testPropertyPolicy()
    {
        self::markTestIncomplete(
            'Test of "policy" property in "MediaUploadAllOfUploadParameters" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "xAmzCredential"
     */
    public function testPropertyXAmzCredential()
    {
        self::markTestIncomplete(
            'Test of "xAmzCredential" property in "MediaUploadAllOfUploadParameters" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "contentType"
     */
    public function testPropertyContentType()
    {
        self::markTestIncomplete(
            'Test of "contentType" property in "MediaUploadAllOfUploadParameters" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = MediaUploadAllOfUploadParameters::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

