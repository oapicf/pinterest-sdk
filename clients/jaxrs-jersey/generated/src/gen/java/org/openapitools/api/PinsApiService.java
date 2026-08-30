package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.CreativeType;
import java.util.Date;
import java.util.Map;
import org.openapitools.model.MultiPinsAnalyticsMetricTypesItem;
import org.openapitools.model.Pin;
import org.openapitools.model.PinAnalyticsMetricsResponse;
import org.openapitools.model.PinCreate;
import org.openapitools.model.PinFilter;
import org.openapitools.model.PinType;
import org.openapitools.model.PinUpdate;
import org.openapitools.model.PinsList200Response;
import org.openapitools.model.PinsSaveRequestCreate;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.ProductTagsBulkAddRequest;
import org.openapitools.model.ProductTagsBulkDeleteRequest;
import org.openapitools.model.ProductTagsError;
import org.openapitools.model.ProductTagsResponse;
import org.openapitools.model.QuerypinanalyticsmetrictypesItems;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-08-30T09:54:14.357431345Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public abstract class PinsApiService {
    public abstract Response multiPinsAnalytics( @NotNull  @Size(min=1,max=100)List<@Pattern(regexp = "^\\d+$")String> pinIds, @NotNull Date startDate, @NotNull Date endDate, @NotNull List<MultiPinsAnalyticsMetricTypesItem> metricTypes,String appTypes, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response pinsAnalytics(String pinId, @NotNull Date startDate, @NotNull Date endDate, @NotNull List<QuerypinanalyticsmetrictypesItems> metricTypes,String appTypes,String splitField, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response pinsCreate(PinCreate pinCreate, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response pinsDelete( @Pattern(regexp="^\\d+$")String pinId, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response pinsGet( @Pattern(regexp="^\\d+$")String pinId, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,Boolean pinMetrics,SecurityContext securityContext) throws NotFoundException;
    public abstract Response pinsList(PinFilter pinFilter,Boolean pinMetrics,Boolean includeProtectedPins,PinType pinType,List<CreativeType> creativeTypes, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,String domain, @Size(min=1,max=100)List<String> domains,Boolean includeProductTagObj,String bookmark, @Min(1) @Max(250)Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response pinsSave(String pinId,PinsSaveRequestCreate pinsSaveRequestCreate, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response pinsUpdate( @Pattern(regexp="^\\d+$")String pinId,PinUpdate pinUpdate, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response productTagsBulkAdd( @Pattern(regexp="^\\d+$")String pinId,ProductTagsBulkAddRequest productTagsBulkAddRequest,SecurityContext securityContext) throws NotFoundException;
    public abstract Response productTagsBulkDelete( @Pattern(regexp="^\\d+$")String pinId,ProductTagsBulkDeleteRequest productTagsBulkDeleteRequest,SecurityContext securityContext) throws NotFoundException;
    public abstract Response productTagsList( @Pattern(regexp="^\\d+$")String pinId,SecurityContext securityContext) throws NotFoundException;
}
