package org.openapitools.server.api;

import org.openapitools.server.model.AdAccountToAdAccountSharedAudience;
import org.openapitools.server.model.AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody;
import org.openapitools.server.model.AdAccountToBusinessSharedAudience;
import org.openapitools.server.model.AdAccountToBusinessSharedAudienceUpdateWithRequiredBody;
import org.openapitools.server.model.AdAccountsAudiencesSharedAccountsList200Response;
import org.openapitools.server.model.AudienceAccountType;
import org.openapitools.server.model.BusinessToAdAccountSharedAudience;
import org.openapitools.server.model.BusinessToAdAccountSharedAudienceUpdateWithRequiredBody;
import org.openapitools.server.model.BusinessToBusinessSharedAudience;
import org.openapitools.server.model.BusinessToBusinessSharedAudienceUpdateWithRequiredBody;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.Order;
import org.openapitools.server.model.PinterestLibError;
import org.openapitools.server.model.SharedAudiencesForBusinessList200Response;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'AudienceSharing'",
                             version = "7.24.0")
public interface AudienceSharingService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.get("/ad_accounts/{ad_account_id}/audiences/shared/accounts", this::adAccountsAudiencesSharedAccountsList);
        rules.get("/businesses/{business_id}/audiences/shared/accounts", this::businessAccountAudiencesSharedAccountsList);
        rules.get("/businesses/{business_id}/audiences", this::sharedAudiencesForBusinessList);
        rules.patch("/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared", this::updateAdAccountToAdAccountSharedAudience);
        rules.patch("/ad_accounts/{ad_account_id}/audiences/businesses/shared", this::updateAdAccountToBusinessSharedAudience);
        rules.patch("/businesses/{business_id}/audiences/ad_accounts/shared", this::updateBusinessToAdAccountSharedAudience);
        rules.patch("/businesses/{business_id}/audiences/businesses/shared", this::updateBusinessToBusinessSharedAudience);
    }


    /**
     * GET /ad_accounts/{ad_account_id}/audiences/shared/accounts : List accounts with access to an audience owned by an ad account.
     *
     * @param request the server request
     * @param response the server response
     */
    void adAccountsAudiencesSharedAccountsList(ServerRequest request, ServerResponse response);
    /**
     * GET /businesses/{business_id}/audiences/shared/accounts : List accounts with access to an audience owned by a business.
     *
     * @param request the server request
     * @param response the server response
     */
    void businessAccountAudiencesSharedAccountsList(ServerRequest request, ServerResponse response);
    /**
     * GET /businesses/{business_id}/audiences : List received audiences for a business.
     *
     * @param request the server request
     * @param response the server response
     */
    void sharedAudiencesForBusinessList(ServerRequest request, ServerResponse response);
    /**
     * PATCH /ad_accounts/{ad_account_id}/audiences/ad_accounts/shared : Update audience sharing between ad accounts.
     *
     * @param request the server request
     * @param response the server response
     */
    void updateAdAccountToAdAccountSharedAudience(ServerRequest request, ServerResponse response);
    /**
     * PATCH /ad_accounts/{ad_account_id}/audiences/businesses/shared : Update audience sharing from an ad account to businesses.
     *
     * @param request the server request
     * @param response the server response
     */
    void updateAdAccountToBusinessSharedAudience(ServerRequest request, ServerResponse response);
    /**
     * PATCH /businesses/{business_id}/audiences/ad_accounts/shared : Update audience sharing from a business to ad accounts.
     *
     * @param request the server request
     * @param response the server response
     */
    void updateBusinessToAdAccountSharedAudience(ServerRequest request, ServerResponse response);
    /**
     * PATCH /businesses/{business_id}/audiences/businesses/shared : Update audience sharing between businesses.
     *
     * @param request the server request
     * @param response the server response
     */
    void updateBusinessToBusinessSharedAudience(ServerRequest request, ServerResponse response);
}
