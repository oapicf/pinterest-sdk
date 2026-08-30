package org.openapitools.server.api;

import org.openapitools.server.model.BrandAccount;
import org.openapitools.server.model.BrandAccountCreate;
import org.openapitools.server.model.BrandAccountUpdate;
import org.openapitools.server.model.BusinessMembershipMember;
import java.util.stream.Collectors;
import org.openapitools.server.model.DeleteBusinessMembership200Response;
import org.openapitools.server.model.DeleteBusinessMembershipBody;
import org.openapitools.server.model.DeleteBusinessPartners;
import org.openapitools.server.model.DeleteBusinessPartnersDelete;
import org.openapitools.server.model.GenericTypes;
import org.openapitools.server.model.GetBusinessEmployers200Response;
import java.util.HexFormat;
import java.util.List;
import org.openapitools.server.model.MemberBusinessRole;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.PartnerType;
import org.openapitools.server.model.PinterestLibError;
import io.helidon.http.Status;
import org.openapitools.server.model.SystemUserUpdateWithRequiredBody;
import org.openapitools.server.model.UpdateBusinessMembershipsResponse;
import jakarta.validation.Valid;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'BusinessAccessRelationships'",
                             version = "7.24.0")
public interface BusinessAccessRelationshipsService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.post("/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts", this::brandAccountsCreate);
        rules.patch("/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}", this::brandAccountsUpdate);
        rules.delete("/businesses/{business_id}/members", this::deleteBusinessMembership);
        rules.delete("/businesses/{business_id}/partners", this::deleteBusinessPartners);
        rules.get("/businesses/employers", this::getBusinessEmployers);
        rules.get("/businesses/{business_id}/members", this::getBusinessMembers);
        rules.get("/businesses/{business_id}/partners", this::getBusinessPartners);
        rules.patch("/businesses/{business_id}/system_users/{system_user_id}", this::systemUserUpdate);
        rules.patch("/businesses/{business_id}/members", this::updateBusinessMemberships);
    }


    /**
     * POST /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts : Create a Brand Account.
     *
     * @param request the server request
     * @param response the server response
     */
    void brandAccountsCreate(ServerRequest request, ServerResponse response);
    /**
     * PATCH /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id} : Update a Brand Account.
     *
     * @param request the server request
     * @param response the server response
     */
    void brandAccountsUpdate(ServerRequest request, ServerResponse response);
    /**
     * DELETE /businesses/{business_id}/members : Terminate business memberships.
     *
     * @param request the server request
     * @param response the server response
     */
    void deleteBusinessMembership(ServerRequest request, ServerResponse response);
    /**
     * DELETE /businesses/{business_id}/partners : Terminate business partnerships.
     *
     * @param request the server request
     * @param response the server response
     */
    void deleteBusinessPartners(ServerRequest request, ServerResponse response);
    /**
     * GET /businesses/employers : List business employers for user.
     *
     * @param request the server request
     * @param response the server response
     */
    void getBusinessEmployers(ServerRequest request, ServerResponse response);
    /**
     * GET /businesses/{business_id}/members : Get business members.
     *
     * @param request the server request
     * @param response the server response
     */
    void getBusinessMembers(ServerRequest request, ServerResponse response);
    /**
     * GET /businesses/{business_id}/partners : Get business partners.
     *
     * @param request the server request
     * @param response the server response
     */
    void getBusinessPartners(ServerRequest request, ServerResponse response);
    /**
     * PATCH /businesses/{business_id}/system_users/{system_user_id} : Update a system user information..
     *
     * @param request the server request
     * @param response the server response
     */
    void systemUserUpdate(ServerRequest request, ServerResponse response);
    /**
     * PATCH /businesses/{business_id}/members : Update member&#39;s business role.
     *
     * @param request the server request
     * @param response the server response
     */
    void updateBusinessMemberships(ServerRequest request, ServerResponse response);
}
