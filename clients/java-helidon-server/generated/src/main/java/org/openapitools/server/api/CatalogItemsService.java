package org.openapitools.server.api;

import org.openapitools.server.model.CatalogsItemsBatch;
import org.openapitools.server.model.CatalogsItemsBatchPostRequest;
import org.openapitools.server.model.CatalogsItemsRequest;
import java.util.HexFormat;
import org.openapitools.server.model.ItemsPost200Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.PinterestLibError;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'CatalogItems'",
                             version = "7.24.0")
public interface CatalogItemsService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.get("/batch/{batch_id}", this::itemsBatchGet);
        rules.post("/batch", this::itemsBatchPost);
        rules.post("/", this::itemsPost);
    }


    /**
     * GET /catalogs/items/batch/{batch_id} : Get item batch status.
     *
     * @param request the server request
     * @param response the server response
     */
    void itemsBatchGet(ServerRequest request, ServerResponse response);
    /**
     * POST /catalogs/items/batch : Operate on item batch.
     *
     * @param request the server request
     * @param response the server response
     */
    void itemsBatchPost(ServerRequest request, ServerResponse response);
    /**
     * POST /catalogs/items : Get catalogs items (POST).
     *
     * @param request the server request
     * @param response the server response
     */
    void itemsPost(ServerRequest request, ServerResponse response);
}
