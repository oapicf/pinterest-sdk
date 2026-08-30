package org.openapitools.server.api;

import org.openapitools.server.model.BulkDownload;
import org.openapitools.server.model.BulkDownloadCreate;
import org.openapitools.server.model.BulkJobData;
import org.openapitools.server.model.BulkUpsertRequest;
import org.openapitools.server.model.BulkUpsertResponse;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.PinterestLibError;
import io.helidon.http.Status;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;

public class BulkServiceImpl implements BulkService {
    private static final ObjectMapper MAPPER = JsonProvider.objectMapper();


    @Override
    public void bulkDownloadCreate(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void bulkRequestGet(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }

    @Override
    public void bulkUpsertCreate(ServerRequest request, ServerResponse response) {
        ValidatorUtils.Validator validator = ValidatorUtils.validator();

        response.status(Status.NOT_IMPLEMENTED_501).send();
    }


    @Override
    public void afterStop() {
        System.out.println("Service BulkService is down. Goodbye!");
    }

}
