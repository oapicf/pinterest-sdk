package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.AdAccountCreateSubscriptionRequest;
import org.openapitools.server.api.model.AdAccountCreateSubscriptionResponse;
import org.openapitools.server.api.model.AdAccountGetSubscriptionResponse;
import org.openapitools.server.api.model.AdAccountsSubscriptionsGetList200Response;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;

public final class LeadAdsApiException extends MainApiException {
    public LeadAdsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final LeadAdsApiException LeadAds_adAccountsSubscriptionsDelById_204_Exception = new LeadAdsApiException(204, "Subscription deleted successfully");
    public static final LeadAdsApiException LeadAds_adAccountsSubscriptionsDelById_400_Exception = new LeadAdsApiException(400, "Invalid input parameters.");
    public static final LeadAdsApiException LeadAds_adAccountsSubscriptionsDelById_403_Exception = new LeadAdsApiException(403, "You are not authorized to delete this subscription.");
    public static final LeadAdsApiException LeadAds_adAccountsSubscriptionsDelById_404_Exception = new LeadAdsApiException(404, "Subscription not found.");
    public static final LeadAdsApiException LeadAds_adAccountsSubscriptionsGetById_200_Exception = new LeadAdsApiException(200, "Success");
    public static final LeadAdsApiException LeadAds_adAccountsSubscriptionsGetById_400_Exception = new LeadAdsApiException(400, "Invalid input parameters.");
    public static final LeadAdsApiException LeadAds_adAccountsSubscriptionsGetById_403_Exception = new LeadAdsApiException(403, "Can't access this subscription.");
    public static final LeadAdsApiException LeadAds_adAccountsSubscriptionsGetById_404_Exception = new LeadAdsApiException(404, "Subscription not found.");
    public static final LeadAdsApiException LeadAds_adAccountsSubscriptionsGetList_200_Exception = new LeadAdsApiException(200, "Success");
    public static final LeadAdsApiException LeadAds_adAccountsSubscriptionsGetList_403_Exception = new LeadAdsApiException(403, "Can't access this subscription.");
    public static final LeadAdsApiException LeadAds_adAccountsSubscriptionsPost_200_Exception = new LeadAdsApiException(200, "Success");
    public static final LeadAdsApiException LeadAds_adAccountsSubscriptionsPost_400_Exception = new LeadAdsApiException(400, "Invalid input parameters.");
    public static final LeadAdsApiException LeadAds_adAccountsSubscriptionsPost_403_Exception = new LeadAdsApiException(403, "Can't access this subscription.");
    

}