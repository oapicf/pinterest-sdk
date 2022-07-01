package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

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

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2022-07-01T11:59:44.239108Z[Etc/UTC]")
public abstract class AdAccountsApiService {
    public abstract Response adAccountAnalytics(String adAccountId
 ,Date startDate
 ,Date endDate
 ,List<String> columns
 ,Granularity granularity
 ,Integer clickWindowDays
 ,Integer engagementWindowDays
 ,Integer viewWindowDays
 ,String conversionReportTime
 ) throws NotFoundException;
    public abstract Response adAccountsList(String bookmark
 ,Integer pageSize
 ,Boolean includeSharedAccounts
 ) throws NotFoundException;
    public abstract Response adGroupsAnalytics(String adAccountId
 ,Date startDate
 ,Date endDate
 ,List<String> adGroupIds
 ,List<String> columns
 ,Granularity granularity
 ,Integer clickWindowDays
 ,Integer engagementWindowDays
 ,Integer viewWindowDays
 ,String conversionReportTime
 ) throws NotFoundException;
    public abstract Response adGroupsList(String adAccountId
 ,List<String> campaignIds
 ,List<String> adGroupIds
 ,List<String> entityStatuses
 ,Integer pageSize
 ,String order
 ,String bookmark
 ,Boolean translateInterestsToNames
 ) throws NotFoundException;
    public abstract Response adsAnalytics(String adAccountId
 ,Date startDate
 ,Date endDate
 ,List<String> adIds
 ,List<String> columns
 ,Granularity granularity
 ,Integer clickWindowDays
 ,Integer engagementWindowDays
 ,Integer viewWindowDays
 ,String conversionReportTime
 ) throws NotFoundException;
    public abstract Response adsList(String adAccountId
 ,List<String> campaignIds
 ,List<String> adGroupIds
 ,List<String> adIds
 ,List<String> entityStatuses
 ,Integer pageSize
 ,String order
 ,String bookmark
 ) throws NotFoundException;
    public abstract Response analyticsCreateReport(String adAccountId
 ,AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest
 ) throws NotFoundException;
    public abstract Response analyticsGetReport(String adAccountId
 ,String token
 ) throws NotFoundException;
    public abstract Response campaignsAnalytics(String adAccountId
 ,Date startDate
 ,Date endDate
 ,List<String> campaignIds
 ,List<String> columns
 ,Granularity granularity
 ,Integer clickWindowDays
 ,Integer engagementWindowDays
 ,Integer viewWindowDays
 ,String conversionReportTime
 ) throws NotFoundException;
    public abstract Response campaignsList(String adAccountId
 ,List<String> campaignIds
 ,List<String> entityStatuses
 ,Integer pageSize
 ,String order
 ,String bookmark
 ) throws NotFoundException;
    public abstract Response productGroupsAnalytics(String adAccountId
 ,Date startDate
 ,Date endDate
 ,List<String> productGroupIds
 ,List<String> columns
 ,Granularity granularity
 ,Integer clickWindowDays
 ,Integer engagementWindowDays
 ,Integer viewWindowDays
 ,String conversionReportTime
 ) throws NotFoundException;
}
