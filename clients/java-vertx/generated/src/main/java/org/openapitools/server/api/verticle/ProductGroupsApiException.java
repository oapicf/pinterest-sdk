package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.AdAccountsCatalogsProductGroupsList200Response;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;

public final class ProductGroupsApiException extends MainApiException {
    public ProductGroupsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final ProductGroupsApiException ProductGroups_adAccountsCatalogsProductGroupsList_200_Exception = new ProductGroupsApiException(200, "Success");
    public static final ProductGroupsApiException ProductGroups_adAccountsCatalogsProductGroupsList_400_Exception = new ProductGroupsApiException(400, "Invalid ad account ads parameters.");
    public static final ProductGroupsApiException ProductGroups_adAccountsCatalogsProductGroupsList_401_Exception = new ProductGroupsApiException(401, "Access Denied. This can happen if account is not yet approved to operate as Merchant on Pinterest.");
    public static final ProductGroupsApiException ProductGroups_adAccountsCatalogsProductGroupsList_404_Exception = new ProductGroupsApiException(404, "Merchant data not found.");
    

}