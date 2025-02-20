<?php
/**
 * TargetingSpecTest
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server\Tests\Model
 * @author   openapi-generator contributors
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Please update the test case below to test the model.
 */

namespace OpenAPI\Server\Tests\Model;

use OpenAPI\Server\Model\TargetingSpec;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * TargetingSpecTest Class Doc Comment
 *
 * @category    Class
 * @description Ad group targeting specification defining the ad group target audience. For example, &#x60;{\&quot;APPTYPE\&quot;:[\&quot;iphone\&quot;], \&quot;GENDER\&quot;:[\&quot;male\&quot;], \&quot;LOCALE\&quot;:[\&quot;en-US\&quot;], \&quot;LOCATION\&quot;:[\&quot;501\&quot;], \&quot;AGE_BUCKET\&quot;:[\&quot;25-34\&quot;]}&#x60;
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\TargetingSpec
 */
class TargetingSpecTest extends TestCase
{
    protected TargetingSpec|MockObject $object;

    /**
     * Setup before running any test case
     */
    public static function setUpBeforeClass(): void
    {
    }

    /**
     * Setup before running each test case
     */
    public function setUp(): void
    {
        $this->object = $this->getMockBuilder(TargetingSpec::class)->getMockForAbstractClass();
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
     * @group integration
     * @small
     */
    public function testTestClassExists(): void
    {
        $this->assertTrue(class_exists(TargetingSpec::class));
        $this->assertInstanceOf(TargetingSpec::class, $this->object);
    }

    /**
     * Test attribute "aGEBUCKET"
     *
     * @group unit
     * @small
     */
    public function testPropertyAGEBUCKET(): void
    {
        $this->markTestSkipped('Test for property aGEBUCKET not implemented');
    }

    /**
     * Test attribute "aPPTYPE"
     *
     * @group unit
     * @small
     */
    public function testPropertyAPPTYPE(): void
    {
        $this->markTestSkipped('Test for property aPPTYPE not implemented');
    }

    /**
     * Test attribute "aUDIENCEEXCLUDE"
     *
     * @group unit
     * @small
     */
    public function testPropertyAUDIENCEEXCLUDE(): void
    {
        $this->markTestSkipped('Test for property aUDIENCEEXCLUDE not implemented');
    }

    /**
     * Test attribute "aUDIENCEINCLUDE"
     *
     * @group unit
     * @small
     */
    public function testPropertyAUDIENCEINCLUDE(): void
    {
        $this->markTestSkipped('Test for property aUDIENCEINCLUDE not implemented');
    }

    /**
     * Test attribute "gENDER"
     *
     * @group unit
     * @small
     */
    public function testPropertyGENDER(): void
    {
        $this->markTestSkipped('Test for property gENDER not implemented');
    }

    /**
     * Test attribute "gEO"
     *
     * @group unit
     * @small
     */
    public function testPropertyGEO(): void
    {
        $this->markTestSkipped('Test for property gEO not implemented');
    }

    /**
     * Test attribute "iNTEREST"
     *
     * @group unit
     * @small
     */
    public function testPropertyINTEREST(): void
    {
        $this->markTestSkipped('Test for property iNTEREST not implemented');
    }

    /**
     * Test attribute "lOCALE"
     *
     * @group unit
     * @small
     */
    public function testPropertyLOCALE(): void
    {
        $this->markTestSkipped('Test for property lOCALE not implemented');
    }

    /**
     * Test attribute "lOCATION"
     *
     * @group unit
     * @small
     */
    public function testPropertyLOCATION(): void
    {
        $this->markTestSkipped('Test for property lOCATION not implemented');
    }

    /**
     * Test attribute "sHOPPINGRETARGETING"
     *
     * @group unit
     * @small
     */
    public function testPropertySHOPPINGRETARGETING(): void
    {
        $this->markTestSkipped('Test for property sHOPPINGRETARGETING not implemented');
    }

    /**
     * Test attribute "tARGETINGSTRATEGY"
     *
     * @group unit
     * @small
     */
    public function testPropertyTARGETINGSTRATEGY(): void
    {
        $this->markTestSkipped('Test for property tARGETINGSTRATEGY not implemented');
    }
}
