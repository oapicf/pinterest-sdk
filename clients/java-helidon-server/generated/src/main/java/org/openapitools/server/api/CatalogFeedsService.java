package org.openapitools.server.api;

import org.openapitools.server.model.CatalogsFeed;
import org.openapitools.server.model.CatalogsFeedCreateRequestSchema;
import org.openapitools.server.model.CatalogsFeedIngestion;
import org.openapitools.server.model.CatalogsFeedUpdateRequestSchema;
import org.openapitools.server.model.CatalogsItemValidationIssue;
import java.util.stream.Collectors;
import org.openapitools.server.model.FeedProcessingResultsList200Response;
import org.openapitools.server.model.FeedsList200Response;
import java.util.HexFormat;
import org.openapitools.server.model.ItemsIssuesList200Response;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.PinterestLibError;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'CatalogFeeds'",
                             version = "7.24.0")
public interface CatalogFeedsService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.get("/feeds/{feed_id}/processing_results", this::feedProcessingResultsList);
        rules.post("/feeds", this::feedsCreate);
        rules.delete("/feeds/{feed_id}", this::feedsDelete);
        rules.get("/feeds/{feed_id}", this::feedsGet);
        rules.post("/feeds/{feed_id}/ingest", this::feedsIngest);
        rules.get("/feeds", this::feedsList);
        rules.patch("/feeds/{feed_id}", this::feedsUpdate);
        rules.get("/processing_results/{processing_result_id}/item_issues", this::itemsIssuesList);
    }


    /**
     * GET /catalogs/feeds/{feed_id}/processing_results : List feed processing results.
     *
     * @param request the server request
     * @param response the server response
     */
    void feedProcessingResultsList(ServerRequest request, ServerResponse response);
    /**
     * POST /catalogs/feeds : Create feed.
     *
     * @param request the server request
     * @param response the server response
     */
    void feedsCreate(ServerRequest request, ServerResponse response);
    /**
     * DELETE /catalogs/feeds/{feed_id} : Delete feed.
     *
     * @param request the server request
     * @param response the server response
     */
    void feedsDelete(ServerRequest request, ServerResponse response);
    /**
     * GET /catalogs/feeds/{feed_id} : Get feed.
     *
     * @param request the server request
     * @param response the server response
     */
    void feedsGet(ServerRequest request, ServerResponse response);
    /**
     * POST /catalogs/feeds/{feed_id}/ingest : Ingest feed items.
     *
     * @param request the server request
     * @param response the server response
     */
    void feedsIngest(ServerRequest request, ServerResponse response);
    /**
     * GET /catalogs/feeds : List feeds.
     *
     * @param request the server request
     * @param response the server response
     */
    void feedsList(ServerRequest request, ServerResponse response);
    /**
     * PATCH /catalogs/feeds/{feed_id} : Update feed.
     *
     * @param request the server request
     * @param response the server response
     */
    void feedsUpdate(ServerRequest request, ServerResponse response);
    /**
     * GET /catalogs/processing_results/{processing_result_id}/item_issues : List item issues.
     *
     * @param request the server request
     * @param response the server response
     */
    void itemsIssuesList(ServerRequest request, ServerResponse response);
}
