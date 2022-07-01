package org.openapitools.api;

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

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-07-01T12:00:58.963610Z[Etc/UTC]")
public interface AdAccountsApiService {
      Response adAccountAnalytics(String adAccountId,Date startDate,Date endDate,List<String> columns,Granularity granularity,Integer clickWindowDays,Integer engagementWindowDays,Integer viewWindowDays,String conversionReportTime,SecurityContext securityContext)
      throws NotFoundException;
      Response adAccountsList(String bookmark,Integer pageSize,Boolean includeSharedAccounts,SecurityContext securityContext)
      throws NotFoundException;
      Response adGroupsAnalytics(String adAccountId,Date startDate,Date endDate,List<String> adGroupIds,List<String> columns,Granularity granularity,Integer clickWindowDays,Integer engagementWindowDays,Integer viewWindowDays,String conversionReportTime,SecurityContext securityContext)
      throws NotFoundException;
      Response adGroupsList(String adAccountId,List<String> campaignIds,List<String> adGroupIds,List<String> entityStatuses,Integer pageSize,String order,String bookmark,Boolean translateInterestsToNames,SecurityContext securityContext)
      throws NotFoundException;
      Response adsAnalytics(String adAccountId,Date startDate,Date endDate,List<String> adIds,List<String> columns,Granularity granularity,Integer clickWindowDays,Integer engagementWindowDays,Integer viewWindowDays,String conversionReportTime,SecurityContext securityContext)
      throws NotFoundException;
      Response adsList(String adAccountId,List<String> campaignIds,List<String> adGroupIds,List<String> adIds,List<String> entityStatuses,Integer pageSize,String order,String bookmark,SecurityContext securityContext)
      throws NotFoundException;
      Response analyticsCreateReport(String adAccountId,AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response analyticsGetReport(String adAccountId,String token,SecurityContext securityContext)
      throws NotFoundException;
      Response campaignsAnalytics(String adAccountId,Date startDate,Date endDate,List<String> campaignIds,List<String> columns,Granularity granularity,Integer clickWindowDays,Integer engagementWindowDays,Integer viewWindowDays,String conversionReportTime,SecurityContext securityContext)
      throws NotFoundException;
      Response campaignsList(String adAccountId,List<String> campaignIds,List<String> entityStatuses,Integer pageSize,String order,String bookmark,SecurityContext securityContext)
      throws NotFoundException;
      Response productGroupsAnalytics(String adAccountId,Date startDate,Date endDate,List<String> productGroupIds,List<String> columns,Granularity granularity,Integer clickWindowDays,Integer engagementWindowDays,Integer viewWindowDays,String conversionReportTime,SecurityContext securityContext)
      throws NotFoundException;
}
