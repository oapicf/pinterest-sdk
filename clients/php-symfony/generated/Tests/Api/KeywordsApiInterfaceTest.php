<?php
/**
 * KeywordsApiInterfaceTest
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
 * The version of the OpenAPI document: 5.14.0
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
 * KeywordsApiInterfaceTest Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Server\Tests\Api
 * @author   openapi-generator contributors
 * @link     https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Api\KeywordsApiInterface
 */
class KeywordsApiInterfaceTest extends WebTestCase
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
     * Test case for countryKeywordsMetricsGet
     *
     * Get country's keyword metrics.
     *
     */
    public function testCountryKeywordsMetricsGet(): void
    {
        $client = self::$client;

        $path = '/ad_accounts/{ad_account_id}/keywords/metrics';
        $pattern = '{adAccountId}';
        $data = $this->genTestData('^\\d+$');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('GET', $path);
        $this->markTestSkipped('Test for countryKeywordsMetricsGet not implemented');
    }

    /**
     * Test case for keywordsCreate
     *
     * Create keywords.
     *
     */
    public function testKeywordsCreate(): void
    {
        $client = self::$client;

        $path = '/ad_accounts/{ad_account_id}/keywords';
        $pattern = '{adAccountId}';
        $data = $this->genTestData('^\\d+$');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('POST', $path, [], [], ['CONTENT_TYPE' => 'application/json']);
        $this->markTestSkipped('Test for keywordsCreate not implemented');
    }

    /**
     * Test case for keywordsGet
     *
     * Get keywords.
     *
     */
    public function testKeywordsGet(): void
    {
        $client = self::$client;

        $path = '/ad_accounts/{ad_account_id}/keywords';
        $pattern = '{adAccountId}';
        $data = $this->genTestData('^\\d+$');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('GET', $path);
        $this->markTestSkipped('Test for keywordsGet not implemented');
    }

    /**
     * Test case for keywordsUpdate
     *
     * Update keywords.
     *
     */
    public function testKeywordsUpdate(): void
    {
        $client = self::$client;

        $path = '/ad_accounts/{ad_account_id}/keywords';
        $pattern = '{adAccountId}';
        $data = $this->genTestData('^\\d+$');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('PATCH', $path, [], [], ['CONTENT_TYPE' => 'application/json']);
        $this->markTestSkipped('Test for keywordsUpdate not implemented');
    }

    /**
     * Test case for trendingKeywordsList
     *
     * List trending keywords.
     *
     */
    public function testTrendingKeywordsList(): void
    {
        $client = self::$client;

        $path = '/trends/keywords/{region}/top/{trend_type}';
        $pattern = '{region}';
        $path = str_replace($pattern, $data, $path);
        $pattern = '{trendType}';
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('GET', $path);
        $this->markTestSkipped('Test for trendingKeywordsList not implemented');
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
