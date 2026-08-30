package org.openapitools.server.api;

import org.openapitools.server.model.AudienceInsightType;
import org.openapitools.server.model.AudienceInsights;
import org.openapitools.server.model.AudienceInsightsScopeAndTypeGet200Response;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.openapitools.server.model.PinterestLibError;
import io.helidon.http.Status;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class AudienceInsightsServiceImpl implements AudienceInsightsService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void audienceInsightsGet(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void audienceInsightsScopeAndTypeGet(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service AudienceInsightsService is down. Goodbye!");
    }

}
