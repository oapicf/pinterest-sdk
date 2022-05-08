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

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2022-05-08T00:33:44.584572Z[Etc/UTC]")
public class AdAccountsApiServiceImpl implements AdAccountsApi {
      public Response adAccountAnalytics(String adAccountId,Date startDate,Date endDate,List<String> columns,Granularity granularity,Integer clickWindowDays,Integer engagementWindowDays,Integer viewWindowDays,String conversionReportTime,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response adAccountsList(String bookmark,Integer pageSize,Boolean includeSharedAccounts,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response adGroupsAnalytics(String adAccountId,Date startDate,Date endDate,List<String> adGroupIds,List<String> columns,Granularity granularity,Integer clickWindowDays,Integer engagementWindowDays,Integer viewWindowDays,String conversionReportTime,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response adGroupsList(String adAccountId,List<String> campaignIds,List<String> adGroupIds,List<String> entityStatuses,Integer pageSize,String order,String bookmark,Boolean translateInterestsToNames,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response adsAnalytics(String adAccountId,Date startDate,Date endDate,List<String> adIds,List<String> columns,Granularity granularity,Integer clickWindowDays,Integer engagementWindowDays,Integer viewWindowDays,String conversionReportTime,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response adsList(String adAccountId,List<String> campaignIds,List<String> adGroupIds,List<String> adIds,List<String> entityStatuses,Integer pageSize,String order,String bookmark,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response analyticsCreateReport(String adAccountId,AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response analyticsGetReport(String adAccountId,String token,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response campaignsAnalytics(String adAccountId,Date startDate,Date endDate,List<String> campaignIds,List<String> columns,Granularity granularity,Integer clickWindowDays,Integer engagementWindowDays,Integer viewWindowDays,String conversionReportTime,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response campaignsList(String adAccountId,List<String> campaignIds,List<String> entityStatuses,Integer pageSize,String order,String bookmark,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response productGroupsAnalytics(String adAccountId,Date startDate,Date endDate,List<String> productGroupIds,List<String> columns,Granularity granularity,Integer clickWindowDays,Integer engagementWindowDays,Integer viewWindowDays,String conversionReportTime,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
