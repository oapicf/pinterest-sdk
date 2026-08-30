package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Catalog;
import org.openapitools.vertxweb.server.model.CatalogCreate;
import org.openapitools.vertxweb.server.model.CatalogsAvailableFilterValues;
import org.openapitools.vertxweb.server.model.CatalogsList200Response;
import org.openapitools.vertxweb.server.model.CatalogsLocale;
import org.openapitools.vertxweb.server.model.Country;
import org.openapitools.vertxweb.server.model.PinterestLibError;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface CatalogsApi  {
    Future<ApiResponse<CatalogsAvailableFilterValues>> catalogsAvailableFilterValues(String catalogId, String feedId, Country country, CatalogsLocale language, String adAccountId);
    Future<ApiResponse<Catalog>> catalogsCreate(CatalogCreate catalogCreate, String adAccountId);
    Future<ApiResponse<CatalogsList200Response>> catalogsList(String adAccountId, String bookmark, Integer pageSize);
}
