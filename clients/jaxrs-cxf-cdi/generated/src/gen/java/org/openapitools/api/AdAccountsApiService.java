package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.openapitools.model.AdsAnalyticsCreateAsyncRequest;
import org.openapitools.model.AdsAnalyticsCreateAsyncResponse;
import org.openapitools.model.AdsAnalyticsGetAsyncResponse;
import org.openapitools.model.Error;
import org.openapitools.model.Granularity;
import org.joda.time.LocalDate;
import org.openapitools.model.Paginated;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2022-05-08T00:33:08.337307Z[Etc/UTC]")
public interface AdAccountsApiService {
      public Response adAccountAnalytics(String adAccountId, LocalDate startDate, LocalDate endDate, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, SecurityContext securityContext);
      public Response adAccountsList(String bookmark, Integer pageSize, Boolean includeSharedAccounts, SecurityContext securityContext);
      public Response adGroupsAnalytics(String adAccountId, LocalDate startDate, LocalDate endDate, List<String> adGroupIds, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, SecurityContext securityContext);
      public Response adGroupsList(String adAccountId, List<String> campaignIds, List<String> adGroupIds, List<String> entityStatuses, Integer pageSize, String order, String bookmark, Boolean translateInterestsToNames, SecurityContext securityContext);
      public Response adsAnalytics(String adAccountId, LocalDate startDate, LocalDate endDate, List<String> adIds, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, SecurityContext securityContext);
      public Response adsList(String adAccountId, List<String> campaignIds, List<String> adGroupIds, List<String> adIds, List<String> entityStatuses, Integer pageSize, String order, String bookmark, SecurityContext securityContext);
      public Response analyticsCreateReport(String adAccountId, AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest, SecurityContext securityContext);
      public Response analyticsGetReport(String adAccountId, String token, SecurityContext securityContext);
      public Response campaignsAnalytics(String adAccountId, LocalDate startDate, LocalDate endDate, List<String> campaignIds, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, SecurityContext securityContext);
      public Response campaignsList(String adAccountId, List<String> campaignIds, List<String> entityStatuses, Integer pageSize, String order, String bookmark, SecurityContext securityContext);
      public Response productGroupsAnalytics(String adAccountId, LocalDate startDate, LocalDate endDate, List<String> productGroupIds, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, SecurityContext securityContext);
}
