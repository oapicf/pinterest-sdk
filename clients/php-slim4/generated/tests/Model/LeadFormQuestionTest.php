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
use OpenAPIServer\Model\LeadFormQuestion;

/**
 * LeadFormQuestionTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\LeadFormQuestion
 */
class LeadFormQuestionTest extends TestCase
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
     * Test "LeadFormQuestion"
     */
    public function testLeadFormQuestion()
    {
        $testLeadFormQuestion = new LeadFormQuestion();
        $namespacedClassname = LeadFormQuestion::getModelsNamespace() . '\\LeadFormQuestion';
        $this->assertSame('\\' . LeadFormQuestion::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "LeadFormQuestion" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "questionType"
     */
    public function testPropertyQuestionType()
    {
        self::markTestIncomplete(
            'Test of "questionType" property in "LeadFormQuestion" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "customQuestionFieldType"
     */
    public function testPropertyCustomQuestionFieldType()
    {
        self::markTestIncomplete(
            'Test of "customQuestionFieldType" property in "LeadFormQuestion" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "customQuestionLabel"
     */
    public function testPropertyCustomQuestionLabel()
    {
        self::markTestIncomplete(
            'Test of "customQuestionLabel" property in "LeadFormQuestion" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "customQuestionOptions"
     */
    public function testPropertyCustomQuestionOptions()
    {
        self::markTestIncomplete(
            'Test of "customQuestionOptions" property in "LeadFormQuestion" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = LeadFormQuestion::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

