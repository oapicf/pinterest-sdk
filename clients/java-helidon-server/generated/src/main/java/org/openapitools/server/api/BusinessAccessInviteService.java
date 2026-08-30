package org.openapitools.server.api;

import org.openapitools.server.model.AuthRespondInvitesBody;
import org.openapitools.server.model.CancelInvitesRequest;
import org.openapitools.server.model.CancelInvitesResponse;
import java.util.stream.Collectors;
import org.openapitools.server.model.CreateAssetAccessRequestBody;
import org.openapitools.server.model.CreateAssetAccessRequestResponse;
import org.openapitools.server.model.CreateAssetInvitesRequest;
import org.openapitools.server.model.CreateInvitesResultsResponseArray;
import org.openapitools.server.model.CreateMembershipOrPartnershipInvitesBody;
import org.openapitools.server.model.GetInvites200Response;
import java.util.HexFormat;
import org.openapitools.server.model.InviteFilterStatus;
import org.openapitools.server.model.InviteType;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.PinterestLibError;
import org.openapitools.server.model.RespondToInvitesResponseArray;
import io.helidon.http.Status;
import org.openapitools.server.model.UpdateInvitesResultsResponseArray;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'BusinessAccessInvite'",
                             version = "7.24.0")
public interface BusinessAccessInviteService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.post("/{business_id}/requests/assets/access", this::assetAccessRequestsCreate);
        rules.delete("/{business_id}/invites", this::cancelInvitesOrRequests);
        rules.post("/{business_id}/invites/assets/access", this::createAssetInvites);
        rules.post("/{business_id}/invites", this::createMembershipOrPartnershipInvites);
        rules.get("/{business_id}/invites", this::getInvites);
        rules.patch("/invites", this::respondBusinessAccessInvites);
    }


    /**
     * POST /businesses/{business_id}/requests/assets/access : Create a request to access an existing partner&#39;s assets..
     *
     * @param request the server request
     * @param response the server response
     */
    void assetAccessRequestsCreate(ServerRequest request, ServerResponse response);
    /**
     * DELETE /businesses/{business_id}/invites : Cancel invites/requests.
     *
     * @param request the server request
     * @param response the server response
     */
    void cancelInvitesOrRequests(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{business_id}/invites/assets/access : Update invite/request with an asset permission.
     *
     * @param request the server request
     * @param response the server response
     */
    void createAssetInvites(ServerRequest request, ServerResponse response);
    /**
     * POST /businesses/{business_id}/invites : Create invites or requests.
     *
     * @param request the server request
     * @param response the server response
     */
    void createMembershipOrPartnershipInvites(ServerRequest request, ServerResponse response);
    /**
     * GET /businesses/{business_id}/invites : Get invites/requests.
     *
     * @param request the server request
     * @param response the server response
     */
    void getInvites(ServerRequest request, ServerResponse response);
    /**
     * PATCH /businesses/invites : Accept or decline an invite/request.
     *
     * @param request the server request
     * @param response the server response
     */
    void respondBusinessAccessInvites(ServerRequest request, ServerResponse response);
}
