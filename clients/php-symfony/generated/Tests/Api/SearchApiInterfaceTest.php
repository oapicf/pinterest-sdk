<?php
/**
 * SearchApiInterfaceTest
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server\Tests\Api
 * @author   openapi-generator contributors
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Please update the test case below to test the endpoint.
 */

namespace OpenAPI\Server\Tests\Api;

use Symfony\Bundle\FrameworkBundle\KernelBrowser;
use Symfony\Bundle\FrameworkBundle\Test\WebTestCase;

/**
 * SearchApiInterfaceTest Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Server\Tests\Api
 * @author   openapi-generator contributors
 * @link     https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Api\SearchApiInterface
 */
class SearchApiInterfaceTest extends WebTestCase
{
    private static ?KernelBrowser $client = null;

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
        if (null === self::$client) {
            self::$client = static::createClient();
        }
    }

    /**
     * Clean up after running each test case
     */
    public function tearDown(): void
    {
        static::ensureKernelShutdown();
    }

    /**
     * Clean up after running all test cases
     */
    public static function tearDownAfterClass(): void
    {
    }

    /**
     * Test case for searchPartnerPins
     *
     * Search pins by a given search term.
     *
     */
    public function testSearchPartnerPins(): void
    {
        $client = self::$client;

        $path = '/search/partner/pins';

        $crawler = $client->request('GET', $path);
        $this->markTestSkipped('Test for searchPartnerPins not implemented');
    }

    /**
     * Test case for searchUserBoardsGet
     *
     * Search user's boards.
     *
     */
    public function testSearchUserBoardsGet(): void
    {
        $client = self::$client;

        $path = '/search/boards';

        $crawler = $client->request('GET', $path);
        $this->markTestSkipped('Test for searchUserBoardsGet not implemented');
    }

    /**
     * Test case for searchUserPinsList
     *
     * Search user's Pins.
     *
     */
    public function testSearchUserPinsList(): void
    {
        $client = self::$client;

        $path = '/search/pins';

        $crawler = $client->request('GET', $path);
        $this->markTestSkipped('Test for searchUserPinsList not implemented');
    }

    /**
     * @param string $regexp
     * @return mixed
     */
    protected function genTestData(string $regexp)
    {
        $grammar  = new \Hoa\File\Read('hoa://Library/Regex/Grammar.pp');
        $compiler = \Hoa\Compiler\Llk\Llk::load($grammar);
        $ast      = $compiler->parse($regexp);
        $generator = new \Hoa\Regex\Visitor\Isotropic(new \Hoa\Math\Sampler\Random());

        return $generator->visit($ast);
    }
}