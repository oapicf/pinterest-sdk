package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.AdsAnalyticsCreateAsyncRequest;
import org.openapitools.server.api.model.AdsAnalyticsCreateAsyncResponse;
import org.openapitools.server.api.model.AdsAnalyticsGetAsyncResponse;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.model.Granularity;
import java.time.LocalDate;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.Paginated;

public final class AdAccountsApiException extends MainApiException {
    public AdAccountsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final AdAccountsApiException AdAccounts_adAccountAnalytics_200_Exception = new AdAccountsApiException(200, "Success");
    public static final AdAccountsApiException AdAccounts_adAccountAnalytics_400_Exception = new AdAccountsApiException(400, "Invalid ad account analytics parameters.");
    public static final AdAccountsApiException AdAccounts_adAccountsList_200_Exception = new AdAccountsApiException(200, "response");
    public static final AdAccountsApiException AdAccounts_adGroupsAnalytics_200_Exception = new AdAccountsApiException(200, "Success");
    public static final AdAccountsApiException AdAccounts_adGroupsAnalytics_400_Exception = new AdAccountsApiException(400, "Invalid ad account group analytics parameters.");
    public static final AdAccountsApiException AdAccounts_adGroupsList_200_Exception = new AdAccountsApiException(200, "Success");
    public static final AdAccountsApiException AdAccounts_adGroupsList_400_Exception = new AdAccountsApiException(400, "Invalid ad account group parameters.");
    public static final AdAccountsApiException AdAccounts_adsAnalytics_200_Exception = new AdAccountsApiException(200, "Success");
    public static final AdAccountsApiException AdAccounts_adsAnalytics_400_Exception = new AdAccountsApiException(400, "Invalid ad account ads analytics parameters.");
    public static final AdAccountsApiException AdAccounts_adsList_200_Exception = new AdAccountsApiException(200, "Success");
    public static final AdAccountsApiException AdAccounts_adsList_400_Exception = new AdAccountsApiException(400, "Invalid ad account ads parameters.");
    public static final AdAccountsApiException AdAccounts_analyticsCreateReport_200_Exception = new AdAccountsApiException(200, "Success");
    public static final AdAccountsApiException AdAccounts_analyticsCreateReport_400_Exception = new AdAccountsApiException(400, "Invalid ad account ads analytics parameters.");
    public static final AdAccountsApiException AdAccounts_analyticsGetReport_200_Exception = new AdAccountsApiException(200, "Success");
    public static final AdAccountsApiException AdAccounts_analyticsGetReport_400_Exception = new AdAccountsApiException(400, "Invalid ad account ads analytics parameters.");
    public static final AdAccountsApiException AdAccounts_campaignsAnalytics_200_Exception = new AdAccountsApiException(200, "Success");
    public static final AdAccountsApiException AdAccounts_campaignsAnalytics_400_Exception = new AdAccountsApiException(400, "Invalid ad account campaign analytics parameters.");
    public static final AdAccountsApiException AdAccounts_campaignsList_200_Exception = new AdAccountsApiException(200, "Success");
    public static final AdAccountsApiException AdAccounts_campaignsList_400_Exception = new AdAccountsApiException(400, "Invalid ad account campaign parameters.");
    public static final AdAccountsApiException AdAccounts_productGroupsAnalytics_200_Exception = new AdAccountsApiException(200, "Success");
    public static final AdAccountsApiException AdAccounts_productGroupsAnalytics_400_Exception = new AdAccountsApiException(400, "Invalid ad account ads analytics parameters.");
    

}