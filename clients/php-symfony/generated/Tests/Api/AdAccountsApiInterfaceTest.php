<?php
/**
 * AdAccountsApiInterfaceTest
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
 * AdAccountsApiInterfaceTest Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Server\Tests\Api
 * @author   openapi-generator contributors
 * @link     https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Api\AdAccountsApiInterface
 */
class AdAccountsApiInterfaceTest extends WebTestCase
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
     * Test case for adAccountAnalytics
     *
     * Get ad account analytics.
     *
     */
    public function testAdAccountAnalytics(): void
    {
        $client = self::$client;

        $path = '/ad_accounts/{ad_account_id}/analytics';
        $pattern = '{adAccountId}';
        $data = $this->genTestData('^\\d+$');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('GET', $path);
        $this->markTestSkipped('Test for adAccountAnalytics not implemented');
    }

    /**
     * Test case for adAccountTargetingAnalyticsGet
     *
     * Get targeting analytics for an ad account.
     *
     */
    public function testAdAccountTargetingAnalyticsGet(): void
    {
        $client = self::$client;

        $path = '/ad_accounts/{ad_account_id}/targeting_analytics';
        $pattern = '{adAccountId}';
        $data = $this->genTestData('^\\d+$');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('GET', $path);
        $this->markTestSkipped('Test for adAccountTargetingAnalyticsGet not implemented');
    }

    /**
     * Test case for adAccountsCreate
     *
     * Create ad account.
     *
     */
    public function testAdAccountsCreate(): void
    {
        $client = self::$client;

        $path = '/ad_accounts';

        $crawler = $client->request('POST', $path, [], [], ['CONTENT_TYPE' => 'application/json']);
        $this->markTestSkipped('Test for adAccountsCreate not implemented');
    }

    /**
     * Test case for adAccountsGet
     *
     * Get ad account.
     *
     */
    public function testAdAccountsGet(): void
    {
        $client = self::$client;

        $path = '/ad_accounts/{ad_account_id}';
        $pattern = '{adAccountId}';
        $data = $this->genTestData('^\\d+$');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('GET', $path);
        $this->markTestSkipped('Test for adAccountsGet not implemented');
    }

    /**
     * Test case for adAccountsList
     *
     * List ad accounts.
     *
     */
    public function testAdAccountsList(): void
    {
        $client = self::$client;

        $path = '/ad_accounts';

        $crawler = $client->request('GET', $path);
        $this->markTestSkipped('Test for adAccountsList not implemented');
    }

    /**
     * Test case for analyticsCreateMmmReport
     *
     * Create a request for a Marketing Mix Modeling (MMM) report.
     *
     */
    public function testAnalyticsCreateMmmReport(): void
    {
        $client = self::$client;

        $path = '/ad_accounts/{ad_account_id}/mmm_reports';
        $pattern = '{adAccountId}';
        $data = $this->genTestData('^\\d+$');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('POST', $path, [], [], ['CONTENT_TYPE' => 'application/json']);
        $this->markTestSkipped('Test for analyticsCreateMmmReport not implemented');
    }

    /**
     * Test case for analyticsCreateReport
     *
     * Create async request for an account analytics report.
     *
     */
    public function testAnalyticsCreateReport(): void
    {
        $client = self::$client;

        $path = '/ad_accounts/{ad_account_id}/reports';
        $pattern = '{adAccountId}';
        $data = $this->genTestData('^\\d+$');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('POST', $path, [], [], ['CONTENT_TYPE' => 'application/json']);
        $this->markTestSkipped('Test for analyticsCreateReport not implemented');
    }

    /**
     * Test case for analyticsCreateTemplateReport
     *
     * Create async request for an analytics report using a template.
     *
     */
    public function testAnalyticsCreateTemplateReport(): void
    {
        $client = self::$client;

        $path = '/ad_accounts/{ad_account_id}/templates/{template_id}/reports';
        $pattern = '{adAccountId}';
        $data = $this->genTestData('^\\d+$');
        $path = str_replace($pattern, $data, $path);
        $pattern = '{templateId}';
        $data = $this->genTestData('^\\d+$');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('POST', $path);
        $this->markTestSkipped('Test for analyticsCreateTemplateReport not implemented');
    }

    /**
     * Test case for analyticsGetMmmReport
     *
     * Get advertiser Marketing Mix Modeling (MMM) report..
     *
     */
    public function testAnalyticsGetMmmReport(): void
    {
        $client = self::$client;

        $path = '/ad_accounts/{ad_account_id}/mmm_reports';
        $pattern = '{adAccountId}';
        $data = $this->genTestData('^\\d+$');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('GET', $path);
        $this->markTestSkipped('Test for analyticsGetMmmReport not implemented');
    }

    /**
     * Test case for analyticsGetReport
     *
     * Get the account analytics report created by the async call.
     *
     */
    public function testAnalyticsGetReport(): void
    {
        $client = self::$client;

        $path = '/ad_accounts/{ad_account_id}/reports';
        $pattern = '{adAccountId}';
        $data = $this->genTestData('^\\d+$');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('GET', $path);
        $this->markTestSkipped('Test for analyticsGetReport not implemented');
    }

    /**
     * Test case for sandboxDelete
     *
     * Delete ads data for ad account in API Sandbox.
     *
     */
    public function testSandboxDelete(): void
    {
        $client = self::$client;

        $path = '/ad_accounts/{ad_account_id}/sandbox';
        $pattern = '{adAccountId}';
        $data = $this->genTestData('^\\d+$');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('DELETE', $path);
        $this->markTestSkipped('Test for sandboxDelete not implemented');
    }

    /**
     * Test case for templatesList
     *
     * List templates.
     *
     */
    public function testTemplatesList(): void
    {
        $client = self::$client;

        $path = '/ad_accounts/{ad_account_id}/templates';
        $pattern = '{adAccountId}';
        $data = $this->genTestData('^\\d+$');
        $path = str_replace($pattern, $data, $path);

        $crawler = $client->request('GET', $path);
        $this->markTestSkipped('Test for templatesList not implemented');
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