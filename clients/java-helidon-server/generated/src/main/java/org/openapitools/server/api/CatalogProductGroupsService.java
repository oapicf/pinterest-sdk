package org.openapitools.server.api;

import org.openapitools.server.model.CatalogsListProductsByFilterRequest;
import org.openapitools.server.model.CatalogsProductGroupPinsList200Response;
import org.openapitools.server.model.CatalogsProductGroupProductCountsVertical;
import org.openapitools.server.model.CatalogsProductGroupsCreateManyRequestItems;
import org.openapitools.server.model.CatalogsProductGroupsCreateRequestSchema;
import org.openapitools.server.model.CatalogsProductGroupsList200Response;
import org.openapitools.server.model.CatalogsProductGroupsUpdateRequestSchema;
import org.openapitools.server.model.CatalogsVerticalProductGroup;
import java.util.stream.Collectors;
import org.openapitools.server.model.GenericTypes;
import java.util.HexFormat;
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
                             trigger = "tag = 'CatalogProductGroups'",
                             version = "7.24.0")
public interface CatalogProductGroupsService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.get("/product_groups/{product_group_id}/products", this::catalogsProductGroupPinsList);
        rules.post("/product_groups", this::catalogsProductGroupsCreate);
        rules.post("/product_groups/multiple", this::catalogsProductGroupsCreateMany);
        rules.delete("/product_groups/{product_group_id}", this::catalogsProductGroupsDelete);
        rules.delete("/product_groups/multiple", this::catalogsProductGroupsDeleteMany);
        rules.get("/product_groups/{product_group_id}", this::catalogsProductGroupsGet);
        rules.get("/product_groups", this::catalogsProductGroupsList);
        rules.get("/product_groups/{product_group_id}/product_counts", this::catalogsProductGroupsProductCountsGet);
        rules.patch("/product_groups/{product_group_id}", this::catalogsProductGroupsUpdate);
        rules.post("/products/get_by_product_group_filters", this::productsByProductGroupFilterList);
    }


    /**
     * GET /catalogs/product_groups/{product_group_id}/products : List products by product group.
     *
     * @param request the server request
     * @param response the server response
     */
    void catalogsProductGroupPinsList(ServerRequest request, ServerResponse response);
    /**
     * POST /catalogs/product_groups : Create product group.
     *
     * @param request the server request
     * @param response the server response
     */
    void catalogsProductGroupsCreate(ServerRequest request, ServerResponse response);
    /**
     * POST /catalogs/product_groups/multiple : Create product groups.
     *
     * @param request the server request
     * @param response the server response
     */
    void catalogsProductGroupsCreateMany(ServerRequest request, ServerResponse response);
    /**
     * DELETE /catalogs/product_groups/{product_group_id} : Delete product group.
     *
     * @param request the server request
     * @param response the server response
     */
    void catalogsProductGroupsDelete(ServerRequest request, ServerResponse response);
    /**
     * DELETE /catalogs/product_groups/multiple : Delete product groups.
     *
     * @param request the server request
     * @param response the server response
     */
    void catalogsProductGroupsDeleteMany(ServerRequest request, ServerResponse response);
    /**
     * GET /catalogs/product_groups/{product_group_id} : Get product group.
     *
     * @param request the server request
     * @param response the server response
     */
    void catalogsProductGroupsGet(ServerRequest request, ServerResponse response);
    /**
     * GET /catalogs/product_groups : List product groups.
     *
     * @param request the server request
     * @param response the server response
     */
    void catalogsProductGroupsList(ServerRequest request, ServerResponse response);
    /**
     * GET /catalogs/product_groups/{product_group_id}/product_counts : Get product counts.
     *
     * @param request the server request
     * @param response the server response
     */
    void catalogsProductGroupsProductCountsGet(ServerRequest request, ServerResponse response);
    /**
     * PATCH /catalogs/product_groups/{product_group_id} : Update single product group.
     *
     * @param request the server request
     * @param response the server response
     */
    void catalogsProductGroupsUpdate(ServerRequest request, ServerResponse response);
    /**
     * POST /catalogs/products/get_by_product_group_filters : List products by filter.
     *
     * @param request the server request
     * @param response the server response
     */
    void productsByProductGroupFilterList(ServerRequest request, ServerResponse response);
}
