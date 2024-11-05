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
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for BusinessAccessInviteApi
 */
@MicronautTest
public class BusinessAccessInviteApiTest {

    @Inject
    BusinessAccessInviteApi api;

    
    /**
     * Create a request to access an existing partner&#39;s assets.
     *
     * Create a request to access an existing partner&#39;s assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.
     */
    @Test
    @Disabled("Not Implemented")
    public void assetAccessRequestsCreateTest() {
        // given
        String businessId = "729090764583391194";
        CreateAssetAccessRequestBody createAssetAccessRequestBody = new CreateAssetAccessRequestBody(Arrays.asList());

        // when
        CreateAssetAccessRequestResponse body = api.assetAccessRequestsCreate(businessId, createAssetAccessRequestBody).block();

        // then
        // TODO implement the assetAccessRequestsCreateTest()
    }

    
    /**
     * Cancel invites/requests
     *
     * Cancel membership/partnership invites and/or requests.
     */
    @Test
    @Disabled("Not Implemented")
    public void cancelInvitesOrRequestsTest() {
        // given
        String businessId = "729090764583391194";
        CancelInvitesBody cancelInvitesBody = new CancelInvitesBody(Arrays.asList("example"));

        // when
        DeleteInvitesResultsResponseArray body = api.cancelInvitesOrRequests(businessId, cancelInvitesBody).block();

        // then
        // TODO implement the cancelInvitesOrRequestsTest()
    }

    
    /**
     * Update invite/request with an asset permission
     *
     * Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner&#39;s asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \&quot;Create a request to access an existing partner&#39;s assets\&quot; to request access to your   partner&#39;s assets.     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot; - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \&quot;Assign/Update partner asset permissions\&quot; to assign a partner access to   new assets.     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot; - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \&quot;Assign/Update member asset permissions\&quot; to assign a member access to new   assets.     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.
     */
    @Test
    @Disabled("Not Implemented")
    public void createAssetInvitesTest() {
        // given
        String businessId = "729090764583391194";
        CreateAssetInvitesRequest createAssetInvitesRequest = new CreateAssetInvitesRequest(Arrays.asList());

        // when
        UpdateInvitesResultsResponseArray body = api.createAssetInvites(businessId, createAssetInvitesRequest).block();

        // then
        // TODO implement the createAssetInvitesTest()
    }

    
    /**
     * Create invites or requests
     *
     * Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;     - business_role&#x3D;\&quot;EMPLOYEE\&quot; OR business_role&#x3D;\&quot;BIZ_ADMIN\&quot; (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners
     */
    @Test
    @Disabled("Not Implemented")
    public void createMembershipOrPartnershipInvitesTest() {
        // given
        String businessId = "729090764583391194";
        CreateMembershipOrPartnershipInvitesBody createMembershipOrPartnershipInvitesBody = new CreateMembershipOrPartnershipInvitesBody("BIZ_ADMIN", org.openapitools.model.InviteType.fromValue("MEMBER_INVITE"));

        // when
        CreateInvitesResultsResponseArray body = api.createMembershipOrPartnershipInvites(businessId, createMembershipOrPartnershipInvitesBody).block();

        // then
        // TODO implement the createMembershipOrPartnershipInvitesTest()
    }

    
    /**
     * Get invites/requests
     *
     * Get the membership/partnership invites and/or requests for the authorized user.
     */
    @Test
    @Disabled("Not Implemented")
    public void getInvitesTest() {
        // given
        String businessId = "729090764583391194";
        Boolean isMember = true;
        List<String> inviteStatus = Arrays.asList("example");
        InviteType inviteType = InviteType.fromValue("MEMBER_INVITE");
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        GetInvites200Response body = api.getInvites(businessId, isMember, inviteStatus, inviteType, bookmark, pageSize).block();

        // then
        // TODO implement the getInvitesTest()
    }

    
    /**
     * Accept or decline an invite/request
     *
     * Accept or decline invites or requests.
     */
    @Test
    @Disabled("Not Implemented")
    public void respondBusinessAccessInvitesTest() {
        // given
        AuthRespondInvitesBody authRespondInvitesBody = new AuthRespondInvitesBody(Arrays.asList());

        // when
        RespondToInvitesResponseArray body = api.respondBusinessAccessInvites(authRespondInvitesBody).block();

        // then
        // TODO implement the respondBusinessAccessInvitesTest()
    }

    
}
