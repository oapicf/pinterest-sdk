package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.AdAccount;
import org.openapitools.server.api.model.AdAccountAnalyticsResponseInner;
import org.openapitools.server.api.model.AdAccountCreateRequest;
import org.openapitools.server.api.model.AdAccountsList200Response;
import org.openapitools.server.api.model.AdsAnalyticsCreateAsyncRequest;
import org.openapitools.server.api.model.AdsAnalyticsCreateAsyncResponse;
import org.openapitools.server.api.model.AdsAnalyticsGetAsyncResponse;
import org.openapitools.server.api.model.AdsAnalyticsTargetingType;
import org.openapitools.server.api.model.ConversionReportAttributionType;
import org.openapitools.server.api.model.CreateMMMReportRequest;
import org.openapitools.server.api.model.CreateMMMReportResponse;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.model.GetMMMReportResponse;
import org.openapitools.server.api.model.Granularity;
import java.time.LocalDate;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.MetricsResponse;
import org.openapitools.server.api.model.TemplatesList200Response;

public final class AdAccountsApiException extends MainApiException {
    public AdAccountsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final AdAccountsApiException AdAccounts_adAccountAnalytics_200_Exception = new AdAccountsApiException(200, "Success");
    public static final AdAccountsApiException AdAccounts_adAccountAnalytics_400_Exception = new AdAccountsApiException(400, "Invalid ad account analytics parameters.");
    public static final AdAccountsApiException AdAccounts_adAccountTargetingAnalyticsGet_200_Exception = new AdAccountsApiException(200, "Success");
    public static final AdAccountsApiException AdAccounts_adAccountsCreate_200_Exception = new AdAccountsApiException(200, "Success");
    public static final AdAccountsApiException AdAccounts_adAccountsGet_200_Exception = new AdAccountsApiException(200, "Success");
    public static final AdAccountsApiException AdAccounts_adAccountsList_200_Exception = new AdAccountsApiException(200, "response");
    public static final AdAccountsApiException AdAccounts_analyticsCreateMmmReport_200_Exception = new AdAccountsApiException(200, "Success");
    public static final AdAccountsApiException AdAccounts_analyticsCreateMmmReport_400_Exception = new AdAccountsApiException(400, "Invalid ad account ads analytics mmm parameters");
    public static final AdAccountsApiException AdAccounts_analyticsCreateReport_200_Exception = new AdAccountsApiException(200, "Success");
    public static final AdAccountsApiException AdAccounts_analyticsCreateReport_400_Exception = new AdAccountsApiException(400, "Invalid ad account ads analytics parameters.");
    public static final AdAccountsApiException AdAccounts_analyticsCreateTemplateReport_200_Exception = new AdAccountsApiException(200, "Success");
    public static final AdAccountsApiException AdAccounts_analyticsCreateTemplateReport_400_Exception = new AdAccountsApiException(400, "Invalid ad account ads analytics template parameters.");
    public static final AdAccountsApiException AdAccounts_analyticsGetMmmReport_200_Exception = new AdAccountsApiException(200, "Success");
    public static final AdAccountsApiException AdAccounts_analyticsGetMmmReport_400_Exception = new AdAccountsApiException(400, "Invalid ad account ads analytics parameters.");
    public static final AdAccountsApiException AdAccounts_analyticsGetReport_200_Exception = new AdAccountsApiException(200, "Success");
    public static final AdAccountsApiException AdAccounts_analyticsGetReport_400_Exception = new AdAccountsApiException(400, "Invalid ad account ads analytics parameters.");
    public static final AdAccountsApiException AdAccounts_sandboxDelete_200_Exception = new AdAccountsApiException(200, "OK");
    public static final AdAccountsApiException AdAccounts_sandboxDelete_400_Exception = new AdAccountsApiException(400, "Invalid ad account id.");
    public static final AdAccountsApiException AdAccounts_templatesList_200_Exception = new AdAccountsApiException(200, "Success");
    public static final AdAccountsApiException AdAccounts_templatesList_400_Exception = new AdAccountsApiException(400, "Invalid ad account template parameters.");
    

}