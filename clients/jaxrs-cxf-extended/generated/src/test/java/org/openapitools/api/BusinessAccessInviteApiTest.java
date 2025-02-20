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

import org.openapitools.model.AuthRespondInvitesBody;
import org.openapitools.model.CancelInvitesBody;
import org.openapitools.model.CreateAssetAccessRequestBody;
import org.openapitools.model.CreateAssetAccessRequestResponse;
import org.openapitools.model.CreateAssetInvitesRequest;
import org.openapitools.model.CreateInvitesResultsResponseArray;
import org.openapitools.model.CreateMembershipOrPartnershipInvitesBody;
import org.openapitools.model.DeleteInvitesResultsResponseArray;
import org.openapitools.model.Error;
import org.openapitools.model.GetInvites200Response;
import org.openapitools.model.InviteType;
import org.openapitools.model.RespondToInvitesResponseArray;
import org.openapitools.model.UpdateInvitesResultsResponseArray;
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
 * API tests for BusinessAccessInviteApi.
 */
public class BusinessAccessInviteApiTest {

    private BusinessAccessInviteApi api;

    @Before
    public void setup() {
        List<?> providers = Arrays.asList(new JacksonJsonProvider(), new JacksonXMLProvider(), new MultipartProvider());

        api = JAXRSClientFactory.create("https://api.pinterest.com/v5", BusinessAccessInviteApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);

        ClientConfiguration config = WebClient.getConfig(client);
    }

    
    /**
     * Create a request to access an existing partner&#39;s assets.
     *
     * Create a request to access an existing partner&#39;s assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void assetAccessRequestsCreateTest() throws Exception {
        // TODO: assign appropriate parameter values
        String businessId = null;
        CreateAssetAccessRequestBody createAssetAccessRequestBody = null;

        // TODO: delete this line and uncomment the next
        // CreateAssetAccessRequestResponse response = api.assetAccessRequestsCreate(businessId, createAssetAccessRequestBody);
        // TODO: complete test assertions
    }
    
    /**
     * Cancel invites/requests
     *
     * Cancel membership/partnership invites and/or requests.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void cancelInvitesOrRequestsTest() throws Exception {
        // TODO: assign appropriate parameter values
        String businessId = null;
        CancelInvitesBody cancelInvitesBody = null;

        // TODO: delete this line and uncomment the next
        // DeleteInvitesResultsResponseArray response = api.cancelInvitesOrRequests(businessId, cancelInvitesBody);
        // TODO: complete test assertions
    }
    
    /**
     * Update invite/request with an asset permission
     *
     * Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner&#39;s asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \&quot;Create a request to access an existing partner&#39;s assets\&quot; to request access to your   partner&#39;s assets.     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot; - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \&quot;Assign/Update partner asset permissions\&quot; to assign a partner access to   new assets.     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot; - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \&quot;Assign/Update member asset permissions\&quot; to assign a member access to new   assets.     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void createAssetInvitesTest() throws Exception {
        // TODO: assign appropriate parameter values
        String businessId = null;
        CreateAssetInvitesRequest createAssetInvitesRequest = null;

        // TODO: delete this line and uncomment the next
        // UpdateInvitesResultsResponseArray response = api.createAssetInvites(businessId, createAssetInvitesRequest);
        // TODO: complete test assertions
    }
    
    /**
     * Create invites or requests
     *
     * Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;     - business_role&#x3D;\&quot;EMPLOYEE\&quot; OR business_role&#x3D;\&quot;BIZ_ADMIN\&quot; (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void createMembershipOrPartnershipInvitesTest() throws Exception {
        // TODO: assign appropriate parameter values
        String businessId = null;
        CreateMembershipOrPartnershipInvitesBody createMembershipOrPartnershipInvitesBody = null;

        // TODO: delete this line and uncomment the next
        // CreateInvitesResultsResponseArray response = api.createMembershipOrPartnershipInvites(businessId, createMembershipOrPartnershipInvitesBody);
        // TODO: complete test assertions
    }
    
    /**
     * Get invites/requests
     *
     * Get the membership/partnership invites and/or requests for the authorized user.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void getInvitesTest() throws Exception {
        // TODO: assign appropriate parameter values
        String businessId = null;
        Boolean isMember = null;
        List<String> inviteStatus = null;
        InviteType inviteType = null;
        String bookmark = null;
        Integer pageSize = null;

        // TODO: delete this line and uncomment the next
        // GetInvites200Response response = api.getInvites(businessId, isMember, inviteStatus, inviteType, bookmark, pageSize);
        // TODO: complete test assertions
    }
    
    /**
     * Accept or decline an invite/request
     *
     * Accept or decline invites or requests.
     *
     * @throws ApiException if the API call fails
     */
    @Test
    public void respondBusinessAccessInvitesTest() throws Exception {
        // TODO: assign appropriate parameter values
        AuthRespondInvitesBody authRespondInvitesBody = null;

        // TODO: delete this line and uncomment the next
        // RespondToInvitesResponseArray response = api.respondBusinessAccessInvites(authRespondInvitesBody);
        // TODO: complete test assertions
    }
    
}
