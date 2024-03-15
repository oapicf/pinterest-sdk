package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.AdGroupArrayResponse;
import org.openapitools.server.api.model.AdGroupAudienceSizingRequest;
import org.openapitools.server.api.model.AdGroupAudienceSizingResponse;
import org.openapitools.server.api.model.AdGroupCreateRequest;
import org.openapitools.server.api.model.AdGroupResponse;
import org.openapitools.server.api.model.AdGroupUpdateRequest;
import org.openapitools.server.api.model.AdGroupsAnalyticsResponseInner;
import org.openapitools.server.api.model.AdGroupsList200Response;
import org.openapitools.server.api.model.AdsAnalyticsTargetingType;
import org.openapitools.server.api.model.BidFloor;
import org.openapitools.server.api.model.BidFloorRequest;
import org.openapitools.server.api.model.ConversionReportAttributionType;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.model.Granularity;
import java.time.LocalDate;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.MetricsResponse;

public final class AdGroupsApiException extends MainApiException {
    public AdGroupsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final AdGroupsApiException AdGroups_adGroupsAnalytics_200_Exception = new AdGroupsApiException(200, "Success");
    public static final AdGroupsApiException AdGroups_adGroupsAnalytics_400_Exception = new AdGroupsApiException(400, "Invalid ad account group analytics parameters.");
    public static final AdGroupsApiException AdGroups_adGroupsAudienceSizing_200_Exception = new AdGroupsApiException(200, "Success");
    public static final AdGroupsApiException AdGroups_adGroupsAudienceSizing_400_Exception = new AdGroupsApiException(400, "Invalid ad group audience sizing parameters.");
    public static final AdGroupsApiException AdGroups_adGroupsAudienceSizing_403_Exception = new AdGroupsApiException(403, "No access to requested audience list or product group.");
    public static final AdGroupsApiException AdGroups_adGroupsBidFloorGet_200_Exception = new AdGroupsApiException(200, "Success");
    public static final AdGroupsApiException AdGroups_adGroupsCreate_200_Exception = new AdGroupsApiException(200, "Success");
    public static final AdGroupsApiException AdGroups_adGroupsGet_200_Exception = new AdGroupsApiException(200, "Success");
    public static final AdGroupsApiException AdGroups_adGroupsList_200_Exception = new AdGroupsApiException(200, "Success");
    public static final AdGroupsApiException AdGroups_adGroupsList_400_Exception = new AdGroupsApiException(400, "Invalid ad account group parameters.");
    public static final AdGroupsApiException AdGroups_adGroupsTargetingAnalyticsGet_200_Exception = new AdGroupsApiException(200, "Success");
    public static final AdGroupsApiException AdGroups_adGroupsUpdate_200_Exception = new AdGroupsApiException(200, "Success");
    

}