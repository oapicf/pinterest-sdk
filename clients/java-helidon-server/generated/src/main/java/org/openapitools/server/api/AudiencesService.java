package org.openapitools.server.api;

import org.openapitools.server.model.AdAccountsAudience;
import org.openapitools.server.model.AdAccountsAudienceCreate;
import org.openapitools.server.model.AdAccountsAudienceUpdate;
import org.openapitools.server.model.AudienceOwnershipType;
import org.openapitools.server.model.AudiencesList200Response;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.PinterestLibError;
import org.openapitools.server.model.PinterestLibPaginationOrder;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Audiences'",
                             version = "7.24.0")
public interface AudiencesService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.post("/", this::audiencesCreate);
        rules.get("/{audience_id}", this::audiencesGet);
        rules.get("/", this::audiencesList);
        rules.patch("/{audience_id}", this::audiencesUpdate);
    }


    /**
     * POST /ad_accounts/{ad_account_id}/audiences : Create audience.
     *
     * @param request the server request
     * @param response the server response
     */
    void audiencesCreate(ServerRequest request, ServerResponse response);
    /**
     * GET /ad_accounts/{ad_account_id}/audiences/{audience_id} : Get audience.
     *
     * @param request the server request
     * @param response the server response
     */
    void audiencesGet(ServerRequest request, ServerResponse response);
    /**
     * GET /ad_accounts/{ad_account_id}/audiences : List audiences.
     *
     * @param request the server request
     * @param response the server response
     */
    void audiencesList(ServerRequest request, ServerResponse response);
    /**
     * PATCH /ad_accounts/{ad_account_id}/audiences/{audience_id} : Update audience.
     *
     * @param request the server request
     * @param response the server response
     */
    void audiencesUpdate(ServerRequest request, ServerResponse response);
}
