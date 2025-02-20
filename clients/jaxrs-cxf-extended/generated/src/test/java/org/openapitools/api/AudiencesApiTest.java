/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.api;

import org.openapitools.model.Audience;
import org.openapitools.model.AudienceCreateCustomRequest;
import org.openapitools.model.AudienceCreateRequest;
import org.openapitools.model.AudienceUpdateRequest;
import org.openapitools.model.AudiencesList200Response;
import org.openapitools.model.Error;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.fasterxml.jackson.jaxrs.xml.JacksonXMLProvider;
import org.apache.cxf.jaxrs.provider.MultipartProvider;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * Pinterest REST API
 *
 * <p>Pinterest's REST API
 *
 * API tests for AudiencesApi.
 */
public class AudiencesApiTest {

    private AudiencesApi api;

    @Before
    public void setup() {
        List<?> providers = Arrays.asList(new JacksonJsonProvider(), new JacksonXMLProvider(), new MultipartProvider());

        api = JAXRSClientFactory.create("https://api.pinterest.com/v5", AudiencesApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);

        ClientConfiguration config = WebClient.getConfig(client);
    }

    
    /**
     * Create audience
     *
     * Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. &lt;p/&gt; For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt;.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void audiencesCreateTest() throws Exception {
        // TODO: assign appropriate parameter values
        String adAccountId = null;
        AudienceCreateRequest audienceCreateRequest = null;

        // TODO: delete this line and uncomment the next
        // Audience response = api.audiencesCreate(adAccountId, audienceCreateRequest);
        // TODO: complete test assertions
    }
    
    /**
     * Create custom audience
     *
     * Create a custom audience and find the audiences you want your ads to reach.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void audiencesCreateCustomTest() throws Exception {
        // TODO: assign appropriate parameter values
        String adAccountId = null;
        AudienceCreateCustomRequest audienceCreateCustomRequest = null;

        // TODO: delete this line and uncomment the next
        // Audience response = api.audiencesCreateCustom(adAccountId, audienceCreateCustomRequest);
        // TODO: complete test assertions
    }
    
    /**
     * Get audience
     *
     * Get a specific audience given the audience ID.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void audiencesGetTest() throws Exception {
        // TODO: assign appropriate parameter values
        String adAccountId = null;
        String audienceId = null;

        // TODO: delete this line and uncomment the next
        // Audience response = api.audiencesGet(adAccountId, audienceId);
        // TODO: complete test assertions
    }
    
    /**
     * List audiences
     *
     * Get list of audiences for the ad account.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void audiencesListTest() throws Exception {
        // TODO: assign appropriate parameter values
        String adAccountId = null;
        String bookmark = null;
        String order = null;
        Integer pageSize = null;
        String ownershipType = null;

        // TODO: delete this line and uncomment the next
        // AudiencesList200Response response = api.audiencesList(adAccountId, bookmark, order, pageSize, ownershipType);
        // TODO: complete test assertions
    }
    
    /**
     * Update audience
     *
     * Update (edit or remove) an existing targeting audience.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void audiencesUpdateTest() throws Exception {
        // TODO: assign appropriate parameter values
        String adAccountId = null;
        String audienceId = null;
        AudienceUpdateRequest audienceUpdateRequest = null;

        // TODO: delete this line and uncomment the next
        // Audience response = api.audiencesUpdate(adAccountId, audienceId, audienceUpdateRequest);
        // TODO: complete test assertions
    }
    
}
