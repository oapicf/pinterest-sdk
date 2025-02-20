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
use OpenAPIServer\Model\GoogleProductCategory0Filter;

/**
 * GoogleProductCategory0FilterTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\GoogleProductCategory0Filter
 */
class GoogleProductCategory0FilterTest extends TestCase
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
     * Test "GoogleProductCategory0Filter"
     */
    public function testGoogleProductCategory0Filter()
    {
        $testGoogleProductCategory0Filter = new GoogleProductCategory0Filter();
        $namespacedClassname = GoogleProductCategory0Filter::getModelsNamespace() . '\\GoogleProductCategory0Filter';
        $this->assertSame('\\' . GoogleProductCategory0Filter::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "GoogleProductCategory0Filter" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "gOOGLEPRODUCTCATEGORY0"
     */
    public function testPropertyGOOGLEPRODUCTCATEGORY0()
    {
        self::markTestIncomplete(
            'Test of "gOOGLEPRODUCTCATEGORY0" property in "GoogleProductCategory0Filter" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = GoogleProductCategory0Filter::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

