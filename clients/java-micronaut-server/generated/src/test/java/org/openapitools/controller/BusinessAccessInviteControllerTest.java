package org.openapitools.controller;

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
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.uri.UriTemplate;
import io.micronaut.http.cookie.Cookie;
import io.micronaut.http.client.multipart.MultipartBody;
import io.micronaut.core.type.Argument;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for BusinessAccessInviteController
 */
@MicronautTest
public class BusinessAccessInviteControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    BusinessAccessInviteController controller;

    /**
     * This test is used to validate the implementation of assetAccessRequestsCreate() method
     *
     * The method should: Create a request to access an existing partner&#39;s assets.
     *
     * Create a request to access an existing partner&#39;s assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void assetAccessRequestsCreateMethodTest() {
        // given
        String businessId = "729090764583391194";
        CreateAssetAccessRequestBody createAssetAccessRequestBody = new CreateAssetAccessRequestBody(Arrays.asList());

        // when
        CreateAssetAccessRequestResponse result = controller.assetAccessRequestsCreate(businessId, createAssetAccessRequestBody).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{business_id}/requests/assets/access' to the features of assetAccessRequestsCreate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void assetAccessRequestsCreateClientApiTest() throws IOException {
        // given
        CreateAssetAccessRequestBody body = new CreateAssetAccessRequestBody(Arrays.asList());
        String uri = UriTemplate.of("/businesses/{business_id}/requests/assets/access").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("business_id", "729090764583391194");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@68cbf488");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CreateAssetAccessRequestResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of cancelInvitesOrRequests() method
     *
     * The method should: Cancel invites/requests
     *
     * Cancel membership/partnership invites and/or requests.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void cancelInvitesOrRequestsMethodTest() {
        // given
        String businessId = "729090764583391194";
        CancelInvitesBody cancelInvitesBody = new CancelInvitesBody(Arrays.asList("example"));

        // when
        DeleteInvitesResultsResponseArray result = controller.cancelInvitesOrRequests(businessId, cancelInvitesBody).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{business_id}/invites' to the features of cancelInvitesOrRequests() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void cancelInvitesOrRequestsClientApiTest() throws IOException {
        // given
        CancelInvitesBody body = new CancelInvitesBody(Arrays.asList("example"));
        String uri = UriTemplate.of("/businesses/{business_id}/invites").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("business_id", "729090764583391194");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("[Ljava.lang.String;@32906bb");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, DeleteInvitesResultsResponseArray.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of createAssetInvites() method
     *
     * The method should: Update invite/request with an asset permission
     *
     * Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner&#39;s asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \&quot;Create a request to access an existing partner&#39;s assets\&quot; to request access to your   partner&#39;s assets.     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot; - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \&quot;Assign/Update partner asset permissions\&quot; to assign a partner access to   new assets.     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot; - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \&quot;Assign/Update member asset permissions\&quot; to assign a member access to new   assets.     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createAssetInvitesMethodTest() {
        // given
        String businessId = "729090764583391194";
        CreateAssetInvitesRequest createAssetInvitesRequest = new CreateAssetInvitesRequest(Arrays.asList());

        // when
        UpdateInvitesResultsResponseArray result = controller.createAssetInvites(businessId, createAssetInvitesRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{business_id}/invites/assets/access' to the features of createAssetInvites() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createAssetInvitesClientApiTest() throws IOException {
        // given
        CreateAssetInvitesRequest body = new CreateAssetInvitesRequest(Arrays.asList());
        String uri = UriTemplate.of("/businesses/{business_id}/invites/assets/access").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("business_id", "729090764583391194");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@43bd267a");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, UpdateInvitesResultsResponseArray.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of createMembershipOrPartnershipInvites() method
     *
     * The method should: Create invites or requests
     *
     * Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;     - business_role&#x3D;\&quot;EMPLOYEE\&quot; OR business_role&#x3D;\&quot;BIZ_ADMIN\&quot; (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void createMembershipOrPartnershipInvitesMethodTest() {
        // given
        String businessId = "729090764583391194";
        CreateMembershipOrPartnershipInvitesBody createMembershipOrPartnershipInvitesBody = new CreateMembershipOrPartnershipInvitesBody("BIZ_ADMIN", org.openapitools.model.InviteType.fromValue("MEMBER_INVITE"));

        // when
        CreateInvitesResultsResponseArray result = controller.createMembershipOrPartnershipInvites(businessId, createMembershipOrPartnershipInvitesBody).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{business_id}/invites' to the features of createMembershipOrPartnershipInvites() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void createMembershipOrPartnershipInvitesClientApiTest() throws IOException {
        // given
        CreateMembershipOrPartnershipInvitesBody body = new CreateMembershipOrPartnershipInvitesBody("BIZ_ADMIN", org.openapitools.model.InviteType.fromValue("MEMBER_INVITE"));
        String uri = UriTemplate.of("/businesses/{business_id}/invites").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("business_id", "729090764583391194");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@4339a2cf");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, CreateInvitesResultsResponseArray.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getInvites() method
     *
     * The method should: Get invites/requests
     *
     * Get the membership/partnership invites and/or requests for the authorized user.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getInvitesMethodTest() {
        // given
        String businessId = "729090764583391194";
        Boolean isMember = true;
        List<String> inviteStatus = Arrays.asList("example");
        InviteType inviteType = InviteType.fromValue("MEMBER_INVITE");
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        GetInvites200Response result = controller.getInvites(businessId, isMember, inviteStatus, inviteType, bookmark, pageSize).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/{business_id}/invites' to the features of getInvites() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getInvitesClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/businesses/{business_id}/invites").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("business_id", "729090764583391194");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@74e17194");
        request.getParameters()
            .add("is_member", String.valueOf(true)) // The query parameter format should be 
            .add("invite_status", Arrays.asList("example")) // The query format should be multi
            .add("invite_type", String.valueOf(InviteType.fromValue("MEMBER_INVITE"))) // The query parameter format should be 
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetInvites200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of respondBusinessAccessInvites() method
     *
     * The method should: Accept or decline an invite/request
     *
     * Accept or decline invites or requests.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void respondBusinessAccessInvitesMethodTest() {
        // given
        AuthRespondInvitesBody authRespondInvitesBody = new AuthRespondInvitesBody(Arrays.asList());

        // when
        RespondToInvitesResponseArray result = controller.respondBusinessAccessInvites(authRespondInvitesBody).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/businesses/invites' to the features of respondBusinessAccessInvites() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void respondBusinessAccessInvitesClientApiTest() throws IOException {
        // given
        AuthRespondInvitesBody body = new AuthRespondInvitesBody(Arrays.asList());
        String uri = UriTemplate.of("/businesses/invites").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("[Ljava.lang.String;@3fb6ad6d");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, RespondToInvitesResponseArray.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
