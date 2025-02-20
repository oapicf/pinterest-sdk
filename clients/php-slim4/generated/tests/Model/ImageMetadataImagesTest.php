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
use OpenAPIServer\Model\ImageMetadataImages;

/**
 * ImageMetadataImagesTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\ImageMetadataImages
 */
class ImageMetadataImagesTest extends TestCase
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
     * Test "ImageMetadataImages"
     */
    public function testImageMetadataImages()
    {
        $testImageMetadataImages = new ImageMetadataImages();
        $namespacedClassname = ImageMetadataImages::getModelsNamespace() . '\\ImageMetadataImages';
        $this->assertSame('\\' . ImageMetadataImages::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "ImageMetadataImages" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "_150x150"
     */
    public function testProperty150x150()
    {
        self::markTestIncomplete(
            'Test of "_150x150" property in "ImageMetadataImages" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "_400x300"
     */
    public function testProperty400x300()
    {
        self::markTestIncomplete(
            'Test of "_400x300" property in "ImageMetadataImages" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "_600x"
     */
    public function testProperty600x()
    {
        self::markTestIncomplete(
            'Test of "_600x" property in "ImageMetadataImages" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "_1200x"
     */
    public function testProperty1200x()
    {
        self::markTestIncomplete(
            'Test of "_1200x" property in "ImageMetadataImages" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = ImageMetadataImages::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

