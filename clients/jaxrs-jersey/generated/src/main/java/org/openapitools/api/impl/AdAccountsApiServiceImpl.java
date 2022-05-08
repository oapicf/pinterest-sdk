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

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2022-05-08T00:33:19.615491Z[Etc/UTC]")
public class AdAccountsApiServiceImpl extends AdAccountsApiService {
    @Override
    public Response adAccountAnalytics( @Pattern(regexp="^\\d+$")String adAccountId,  @NotNull Date startDate,  @NotNull Date endDate,  @NotNull List<String> columns,  @NotNull Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adAccountsList(String bookmark,  @Min(1) @Max(100)Integer pageSize, Boolean includeSharedAccounts, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adGroupsAnalytics( @Pattern(regexp="^\\d+$")String adAccountId,  @NotNull Date startDate,  @NotNull Date endDate,  @NotNull  @Size(min=1,max=100)List<String> adGroupIds,  @NotNull List<String> columns,  @NotNull Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adGroupsList( @Pattern(regexp="^\\d+$")String adAccountId,  @Size(min=1,max=100)List<String> campaignIds,  @Size(min=1,max=100)List<String> adGroupIds, List<String> entityStatuses,  @Min(1) @Max(100)Integer pageSize, String order, String bookmark, Boolean translateInterestsToNames, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adsAnalytics( @Pattern(regexp="^\\d+$")String adAccountId,  @NotNull Date startDate,  @NotNull Date endDate,  @NotNull  @Size(min=1,max=100)List<String> adIds,  @NotNull List<String> columns,  @NotNull Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response adsList( @Pattern(regexp="^\\d+$")String adAccountId,  @Size(min=1,max=100)List<String> campaignIds,  @Size(min=1,max=100)List<String> adGroupIds,  @Size(min=1,max=100)List<String> adIds, List<String> entityStatuses,  @Min(1) @Max(100)Integer pageSize, String order, String bookmark, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response analyticsCreateReport( @Pattern(regexp="^\\d+$")String adAccountId, AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response analyticsGetReport( @Pattern(regexp="^\\d+$")String adAccountId,  @NotNull String token, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response campaignsAnalytics( @Pattern(regexp="^\\d+$")String adAccountId,  @NotNull Date startDate,  @NotNull Date endDate,  @NotNull  @Size(min=1,max=100)List<String> campaignIds,  @NotNull List<String> columns,  @NotNull Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response campaignsList( @Pattern(regexp="^\\d+$")String adAccountId,  @Size(min=1,max=100)List<String> campaignIds, List<String> entityStatuses,  @Min(1) @Max(100)Integer pageSize, String order, String bookmark, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response productGroupsAnalytics( @Pattern(regexp="^\\d+$")String adAccountId,  @NotNull Date startDate,  @NotNull Date endDate,  @NotNull  @Size(min=1,max=100)List<String> productGroupIds,  @NotNull List<String> columns,  @NotNull Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
