/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.OrderLine;
import org.openapitools.model.OrderLinesList200Response;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/**
 * Pinterest REST API
 *
 * <p>Pinterest's REST API
 *
 * API tests for OrderLinesApi
 */
public class OrderLinesApiTest {


    private OrderLinesApi api;

    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);

        api = JAXRSClientFactory.create("https://api.pinterest.com/v5", OrderLinesApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);

        ClientConfiguration config = WebClient.getConfig(client);
    }

    
    /**
     * Get order line
     *
     * Get a specific existing order line associated with an ad account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orderLinesGetTest() {
        String adAccountId = null;
        String orderLineId = null;
        //OrderLine response = api.orderLinesGet(adAccountId, orderLineId);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * Get order lines
     *
     * List existing order lines associated with an ad account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orderLinesListTest() {
        String adAccountId = null;
        Integer pageSize = null;
        String order = null;
        String bookmark = null;
        //OrderLinesList200Response response = api.orderLinesList(adAccountId, pageSize, order, bookmark);
        //assertNotNull(response);
        // TODO: test validations


    }
    
}