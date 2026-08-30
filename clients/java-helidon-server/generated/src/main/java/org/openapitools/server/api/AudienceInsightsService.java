package org.openapitools.server.api;

import org.openapitools.server.model.AudienceInsightType;
import org.openapitools.server.model.AudienceInsights;
import org.openapitools.server.model.AudienceInsightsScopeAndTypeGet200Response;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.openapitools.server.model.PinterestLibError;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'AudienceInsights'",
                             version = "7.24.0")
public interface AudienceInsightsService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.get("/audience_insights", this::audienceInsightsGet);
        rules.get("/insights/audiences", this::audienceInsightsScopeAndTypeGet);
    }


    /**
     * GET /ad_accounts/{ad_account_id}/audience_insights : Get audience insights.
     *
     * @param request the server request
     * @param response the server response
     */
    void audienceInsightsGet(ServerRequest request, ServerResponse response);
    /**
     * GET /ad_accounts/{ad_account_id}/insights/audiences : Get audience insights scope and type.
     *
     * @param request the server request
     * @param response the server response
     */
    void audienceInsightsScopeAndTypeGet(ServerRequest request, ServerResponse response);
}
