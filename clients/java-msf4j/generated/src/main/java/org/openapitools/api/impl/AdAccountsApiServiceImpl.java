package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.openapitools.model.AdsAnalyticsCreateAsyncRequest;
import org.openapitools.model.AdsAnalyticsCreateAsyncResponse;
import org.openapitools.model.AdsAnalyticsGetAsyncResponse;
import java.util.Date;
import org.openapitools.model.Error;
import org.openapitools.model.Granularity;
import org.openapitools.model.Paginated;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2022-05-07T06:39:19.282212Z[Etc/UTC]")
public class AdAccountsApiServiceImpl extends AdAccountsApiService {
    @Override
    public Response adAccountAnalytics(String adAccountId
, Date startDate
, Date endDate
, List<String> columns
, Granularity granularity
, Integer clickWindowDays
, Integer engagementWindowDays
, Integer viewWindowDays
, String conversionReportTime
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adAccountsList(String bookmark
, Integer pageSize
, Boolean includeSharedAccounts
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adGroupsAnalytics(String adAccountId
, Date startDate
, Date endDate
, List<String> adGroupIds
, List<String> columns
, Granularity granularity
, Integer clickWindowDays
, Integer engagementWindowDays
, Integer viewWindowDays
, String conversionReportTime
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adGroupsList(String adAccountId
, List<String> campaignIds
, List<String> adGroupIds
, List<String> entityStatuses
, Integer pageSize
, String order
, String bookmark
, Boolean translateInterestsToNames
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adsAnalytics(String adAccountId
, Date startDate
, Date endDate
, List<String> adIds
, List<String> columns
, Granularity granularity
, Integer clickWindowDays
, Integer engagementWindowDays
, Integer viewWindowDays
, String conversionReportTime
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adsList(String adAccountId
, List<String> campaignIds
, List<String> adGroupIds
, List<String> adIds
, List<String> entityStatuses
, Integer pageSize
, String order
, String bookmark
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response analyticsCreateReport(String adAccountId
, AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response analyticsGetReport(String adAccountId
, String token
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response campaignsAnalytics(String adAccountId
, Date startDate
, Date endDate
, List<String> campaignIds
, List<String> columns
, Granularity granularity
, Integer clickWindowDays
, Integer engagementWindowDays
, Integer viewWindowDays
, String conversionReportTime
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response campaignsList(String adAccountId
, List<String> campaignIds
, List<String> entityStatuses
, Integer pageSize
, String order
, String bookmark
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response productGroupsAnalytics(String adAccountId
, Date startDate
, Date endDate
, List<String> productGroupIds
, List<String> columns
, Granularity granularity
, Integer clickWindowDays
, Integer engagementWindowDays
, Integer viewWindowDays
, String conversionReportTime
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
