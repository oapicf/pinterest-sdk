/*
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

public class OASOrderLinesApi {
    OASClient client;

    public OASOrderLinesApi(OASClient client) {
        this.client = client;
    }

    public OASOrderLinesApi() {
        this.client = new OASClient();
    }

    public OASClient getClient() {
        return this.client;
    }

    /**
     * Get order line
     * Get a specific existing order line associated with an ad account.
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param orderLineId Unique identifier of an order line. (required)
     * @return OASOrderLine
     * @throws OAS.ApiException if fails to make API call
     */
    public OASOrderLine orderLinesGet(Map<String, Object> params) {
        client.assertNotNull(params.get('adAccountId'), 'adAccountId');
        client.assertNotNull(params.get('orderLineId'), 'orderLineId');
        List<OAS.Param> query = new List<OAS.Param>();
        List<OAS.Param> form = new List<OAS.Param>();

        return (OASOrderLine) client.invoke(
            'GET', '/ad_accounts/{ad_account_id}/order_lines/{order_line_id}', '',
            query, form,
            new Map<String, Object>{
                'ad_account_id' => (String) params.get('adAccountId'),
                'order_line_id' => (String) params.get('orderLineId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String> { 'pinterest_oauth2' },
            OASOrderLine.class
        );
    }
    /**
     * Get order lines
     * List existing order lines associated with an ad account.
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
     * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING”\nby ID. Note that higher-value IDs are associated with more-recently added\nitems. (optional)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @return OASOrderLinesList200Response
     * @throws OAS.ApiException if fails to make API call
     */
    public OASOrderLinesList200Response orderLinesList(Map<String, Object> params) {
        client.assertNotNull(params.get('adAccountId'), 'adAccountId');
        List<OAS.Param> query = new List<OAS.Param>();

        // cast query params to verify their expected type
        query.addAll(client.makeParam('page_size', (Integer) params.get('pageSize')));
        query.addAll(client.makeParam('order', (String) params.get('order')));
        query.addAll(client.makeParam('bookmark', (String) params.get('bookmark')));

        List<OAS.Param> form = new List<OAS.Param>();

        return (OASOrderLinesList200Response) client.invoke(
            'GET', '/ad_accounts/{ad_account_id}/order_lines', '',
            query, form,
            new Map<String, Object>{
                'ad_account_id' => (String) params.get('adAccountId')
            },
            new Map<String, Object>(),
            new List<String>{ 'application/json' },
            new List<String>(),
            new List<String> { 'pinterest_oauth2' },
            OASOrderLinesList200Response.class
        );
    }
}