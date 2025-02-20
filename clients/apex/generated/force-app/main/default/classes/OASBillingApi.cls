/*
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

public class OASBillingApi {
    OASClient client;

    public OASBillingApi(OASClient client) {
        this.client = client;
    }

    public OASBillingApi() {
        this.client = new OASClient();
    }

    public OASClient getClient() {
        return this.client;
    }

    /**
     * Redeem ad credits
     * Redeem ads credit on behalf of the ad account id and apply it towards billing.\n\n&lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;\&#39;/docs/getting-started/beta-and-advanced-access/\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param oaSAdsCreditRedeemRequest Redeem ad credits request. (required)
     * @return OASAdsCreditRedeemResponse
     * @throws OAS.ApiException if fails to make API call
     */
    public OASAdsCreditRedeemResponse adsCreditRedeem(Map<String, Object> params) {
        client.assertNotNull(params.get('adAccountId'), 'adAccountId');
        client.assertNotNull(params.get('oaSAdsCreditRedeemRequest'), 'oaSAdsCreditRedeemRequest');
        List<OAS.Param> query = new List<OAS.Param>();
        List<OAS.Param> form = new List<OAS.Param>();

        return (OASAdsCreditRedeemResponse) client.invoke(
            'POST', '/ad_accounts/{ad_account_id}/ads_credit/redeem',
            (OASAdsCreditRedeemRequest) params.get('oaSAdsCreditRedeemRequest'),
            query, form,
            new Map<String, Object>{
                'ad_account_id' => (String) params.get('adAccountId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String> { 'pinterest_oauth2' },
            OASAdsCreditRedeemResponse.class
        );
    }
    /**
     * Get ads credit discounts
     * Returns the list of discounts applied to the account.\n\n&lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;\&#39;/docs/getting-started/beta-and-advanced-access/\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
     * @return OASAdsCreditsDiscountsGet200Response
     * @throws OAS.ApiException if fails to make API call
     */
    public OASAdsCreditsDiscountsGet200Response adsCreditsDiscountsGet(Map<String, Object> params) {
        client.assertNotNull(params.get('adAccountId'), 'adAccountId');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('bookmark', (String) params.get('bookmark')));
        query.addAll(client.makeParam('page_size', (Integer) params.get('pageSize')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASAdsCreditsDiscountsGet200Response) client.invoke(
            'GET', '/ad_accounts/{ad_account_id}/ads_credit/discounts', '',
            query, form,
            new Map<String, Object>{
                'ad_account_id' => (String) params.get('adAccountId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String> { 'pinterest_oauth2' },
            OASAdsCreditsDiscountsGet200Response.class
        );
    }
    /**
     * Get billing profiles
     * Get billing profiles in the advertiser account.\n\n&lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;\&#39;/docs/getting-started/beta-and-advanced-access/\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param isActive Return active billing profiles, if false return all billing profiles. (required)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
     * @return OASBillingProfilesGet200Response
     * @throws OAS.ApiException if fails to make API call
     */
    public OASBillingProfilesGet200Response billingProfilesGet(Map<String, Object> params) {
        client.assertNotNull(params.get('adAccountId'), 'adAccountId');
        client.assertNotNull(params.get('isActive'), 'isActive');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('is_active', (Boolean) params.get('isActive')));
        query.addAll(client.makeParam('bookmark', (String) params.get('bookmark')));
        query.addAll(client.makeParam('page_size', (Integer) params.get('pageSize')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASBillingProfilesGet200Response) client.invoke(
            'GET', '/ad_accounts/{ad_account_id}/billing_profiles', '',
            query, form,
            new Map<String, Object>{
                'ad_account_id' => (String) params.get('adAccountId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String> { 'pinterest_oauth2' },
            OASBillingProfilesGet200Response.class
        );
    }
    /**
     * Get Salesforce account details including bill-to information.
     * Get Salesforce account details including bill-to information to be used in insertion orders process for &lt;code&gt;ad_account_id&lt;/code&gt;.\n- The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
     * @param adAccountId Unique identifier of an ad account. (required)
     * @return OASSSIOAccountResponse
     * @throws OAS.ApiException if fails to make API call
     */
    public OASSSIOAccountResponse ssioAccountsGet(Map<String, Object> params) {
        client.assertNotNull(params.get('adAccountId'), 'adAccountId');
        List<OAS.Param> query = new List<OAS.Param>();
        List<OAS.Param> form = new List<OAS.Param>();

        return (OASSSIOAccountResponse) client.invoke(
            'GET', '/ad_accounts/{ad_account_id}/ssio/accounts', '',
            query, form,
            new Map<String, Object>{
                'ad_account_id' => (String) params.get('adAccountId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String> { 'pinterest_oauth2' },
            OASSSIOAccountResponse.class
        );
    }
    /**
     * Create insertion order through SSIO.
     * Create insertion order through SSIO for &lt;code&gt;ad_account_id&lt;/code&gt;.\n- The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param oaSSSIOCreateInsertionOrderRequest Order line to create. (required)
     * @return OASSSIOCreateInsertionOrderResponse
     * @throws OAS.ApiException if fails to make API call
     */
    public OASSSIOCreateInsertionOrderResponse ssioInsertionOrderCreate(Map<String, Object> params) {
        client.assertNotNull(params.get('adAccountId'), 'adAccountId');
        client.assertNotNull(params.get('oaSSSIOCreateInsertionOrderRequest'), 'oaSSSIOCreateInsertionOrderRequest');
        List<OAS.Param> query = new List<OAS.Param>();
        List<OAS.Param> form = new List<OAS.Param>();

        return (OASSSIOCreateInsertionOrderResponse) client.invoke(
            'POST', '/ad_accounts/{ad_account_id}/ssio/insertion_orders',
            (OASSSIOCreateInsertionOrderRequest) params.get('oaSSSIOCreateInsertionOrderRequest'),
            query, form,
            new Map<String, Object>{
                'ad_account_id' => (String) params.get('adAccountId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String> { 'pinterest_oauth2' },
            OASSSIOCreateInsertionOrderResponse.class
        );
    }
    /**
     * Edit insertion order through SSIO.
     * Edit insertion order through SSIO for &lt;code&gt;ad_account_id&lt;/code&gt;.\n- The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param oaSSSIOEditInsertionOrderRequest Order line to create. (required)
     * @return OASSSIOEditInsertionOrderResponse
     * @throws OAS.ApiException if fails to make API call
     */
    public OASSSIOEditInsertionOrderResponse ssioInsertionOrderEdit(Map<String, Object> params) {
        client.assertNotNull(params.get('adAccountId'), 'adAccountId');
        client.assertNotNull(params.get('oaSSSIOEditInsertionOrderRequest'), 'oaSSSIOEditInsertionOrderRequest');
        List<OAS.Param> query = new List<OAS.Param>();
        List<OAS.Param> form = new List<OAS.Param>();

        return (OASSSIOEditInsertionOrderResponse) client.invoke(
            'PATCH', '/ad_accounts/{ad_account_id}/ssio/insertion_orders',
            (OASSSIOEditInsertionOrderRequest) params.get('oaSSSIOEditInsertionOrderRequest'),
            query, form,
            new Map<String, Object>{
                'ad_account_id' => (String) params.get('adAccountId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>{ 'application/json' },
            new List<String> { 'pinterest_oauth2' },
            OASSSIOEditInsertionOrderResponse.class
        );
    }
    /**
     * Get insertion order status by ad account id.
     * Get insertion order status for account id &lt;code&gt;ad_account_id&lt;/code&gt;.\n- The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
     * @return OASSsioInsertionOrdersStatusGetByAdA
     * @throws OAS.ApiException if fails to make API call
     */
    public OASSsioInsertionOrdersStatusGetByAdA ssioInsertionOrdersStatusGetByAdAccount(Map<String, Object> params) {
        client.assertNotNull(params.get('adAccountId'), 'adAccountId');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('bookmark', (String) params.get('bookmark')));
        query.addAll(client.makeParam('page_size', (Integer) params.get('pageSize')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASSsioInsertionOrdersStatusGetByAdA) client.invoke(
            'GET', '/ad_accounts/{ad_account_id}/ssio/insertion_orders/status', '',
            query, form,
            new Map<String, Object>{
                'ad_account_id' => (String) params.get('adAccountId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String> { 'pinterest_oauth2' },
            OASSsioInsertionOrdersStatusGetByAdA.class
        );
    }
    /**
     * Get insertion order status by pin order id.
     * Get insertion order status for pin order id &lt;code&gt;pin_order_id&lt;/code&gt;.\n- The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param pinOrderId The pin order id associated with the ssio insertion order (required)
     * @return OASSSIOInsertionOrderStatusResponse
     * @throws OAS.ApiException if fails to make API call
     */
    public OASSSIOInsertionOrderStatusResponse ssioInsertionOrdersStatusGetByPinOrderId(Map<String, Object> params) {
        client.assertNotNull(params.get('adAccountId'), 'adAccountId');
        client.assertNotNull(params.get('pinOrderId'), 'pinOrderId');
        List<OAS.Param> query = new List<OAS.Param>();
        List<OAS.Param> form = new List<OAS.Param>();

        return (OASSSIOInsertionOrderStatusResponse) client.invoke(
            'GET', '/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status', '',
            query, form,
            new Map<String, Object>{
                'ad_account_id' => (String) params.get('adAccountId'),
                'pin_order_id' => (String) params.get('pinOrderId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String> { 'pinterest_oauth2' },
            OASSSIOInsertionOrderStatusResponse.class
        );
    }
    /**
     * Get Salesforce order lines by ad account id.
     * Get Salesforce order lines for account id &lt;code&gt;ad_account_id&lt;/code&gt;.\n- The token\&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
     * @param pinOrderId The pin order id associated with the ssio insertino order (optional)
     * @return OASSsioOrderLinesGetByAdAccount200Re
     * @throws OAS.ApiException if fails to make API call
     */
    public OASSsioOrderLinesGetByAdAccount200Re ssioOrderLinesGetByAdAccount(Map<String, Object> params) {
        client.assertNotNull(params.get('adAccountId'), 'adAccountId');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('bookmark', (String) params.get('bookmark')));
        query.addAll(client.makeParam('page_size', (Integer) params.get('pageSize')));
        query.addAll(client.makeParam('pin_order_id', (String) params.get('pinOrderId')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASSsioOrderLinesGetByAdAccount200Re) client.invoke(
            'GET', '/ad_accounts/{ad_account_id}/ssio/order_lines', '',
            query, form,
            new Map<String, Object>{
                'ad_account_id' => (String) params.get('adAccountId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String> { 'pinterest_oauth2' },
            OASSsioOrderLinesGetByAdAccount200Re.class
        );
    }
}
