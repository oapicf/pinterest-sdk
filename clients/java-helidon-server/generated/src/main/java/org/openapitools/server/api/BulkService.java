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

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Bulk'",
                             version = "7.24.0")
public interface BulkService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.post("/download", this::bulkDownloadCreate);
        rules.get("/{bulk_request_id}", this::bulkRequestGet);
        rules.post("/upsert", this::bulkUpsertCreate);
    }


    /**
     * POST /ad_accounts/{ad_account_id}/bulk/download : Get advertiser entities in bulk.
     *
     * @param request the server request
     * @param response the server response
     */
    void bulkDownloadCreate(ServerRequest request, ServerResponse response);
    /**
     * GET /ad_accounts/{ad_account_id}/bulk/{bulk_request_id} : Download advertiser entities in bulk.
     *
     * @param request the server request
     * @param response the server response
     */
    void bulkRequestGet(ServerRequest request, ServerResponse response);
    /**
     * POST /ad_accounts/{ad_account_id}/bulk/upsert : Create/update ad entities in bulk.
     *
     * @param request the server request
     * @param response the server response
     */
    void bulkUpsertCreate(ServerRequest request, ServerResponse response);
}
