package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.model.Granularity;
import java.time.LocalDate;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.ProductGroupAnalyticsResponseInner;
import org.openapitools.server.api.model.ProductGroupPromotionCreateRequest;
import org.openapitools.server.api.model.ProductGroupPromotionResponse;
import org.openapitools.server.api.model.ProductGroupPromotionUpdateRequest;
import org.openapitools.server.api.model.ProductGroupPromotionsList200Response;

public final class ProductGroupPromotionsApiException extends MainApiException {
    public ProductGroupPromotionsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final ProductGroupPromotionsApiException ProductGroupPromotions_productGroupPromotionsCreate_200_Exception = new ProductGroupPromotionsApiException(200, "Success");
    public static final ProductGroupPromotionsApiException ProductGroupPromotions_productGroupPromotionsGet_200_Exception = new ProductGroupPromotionsApiException(200, "Success");
    public static final ProductGroupPromotionsApiException ProductGroupPromotions_productGroupPromotionsList_200_Exception = new ProductGroupPromotionsApiException(200, "Success");
    public static final ProductGroupPromotionsApiException ProductGroupPromotions_productGroupPromotionsUpdate_200_Exception = new ProductGroupPromotionsApiException(200, "Success");
    public static final ProductGroupPromotionsApiException ProductGroupPromotions_productGroupsAnalytics_200_Exception = new ProductGroupPromotionsApiException(200, "Success");
    public static final ProductGroupPromotionsApiException ProductGroupPromotions_productGroupsAnalytics_400_Exception = new ProductGroupPromotionsApiException(400, "Invalid ad account ads analytics parameters.");
    

}