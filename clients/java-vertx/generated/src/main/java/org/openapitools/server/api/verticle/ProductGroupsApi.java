package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.AdAccountsCatalogsProductGroupsList200Response;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface ProductGroupsApi  {
    //ad_accounts_catalogs_product_groups/list
    void adAccountsCatalogsProductGroupsList(String adAccountId, String feedProfileId, Handler<AsyncResult<AdAccountsCatalogsProductGroupsList200Response>> handler);

}
