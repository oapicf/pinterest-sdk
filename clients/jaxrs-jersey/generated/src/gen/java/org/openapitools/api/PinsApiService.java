package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.CreativeType;
import java.util.Date;
import org.openapitools.model.Error;
import java.util.Map;
import org.openapitools.model.Pin;
import org.openapitools.model.PinAnalyticsMetricsResponse;
import org.openapitools.model.PinCreate;
import org.openapitools.model.PinUpdate;
import org.openapitools.model.PinsList200Response;
import org.openapitools.model.PinsSaveRequest;
import org.openapitools.model.PinterestLibError;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-01-31T04:54:42.155723473Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public abstract class PinsApiService {
    public abstract Response multiPinsAnalytics( @NotNull  @Size(min=1,max=100)List<@Pattern(regexp = "^\\d+$")String> pinIds, @NotNull Date startDate, @NotNull Date endDate, @NotNull List<String> metricTypes,String appTypes, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response pinsAnalytics(String pinId, @NotNull Date startDate, @NotNull Date endDate, @NotNull List<String> metricTypes,String appTypes,String splitField, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response pinsCreate(PinCreate pinCreate, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response pinsDelete( @Pattern(regexp="^\\d+$")String pinId, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response pinsGet( @Pattern(regexp="^\\d+$")String pinId, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,Boolean pinMetrics,SecurityContext securityContext) throws NotFoundException;
    public abstract Response pinsList(String pinFilter,Boolean pinMetrics,Boolean includeProtectedPins,String pinType,List<CreativeType> creativeTypes, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,String bookmark, @Min(1) @Max(250)Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response pinsSave(String pinId,PinsSaveRequest pinsSaveRequest, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response pinsUpdate( @Pattern(regexp="^\\d+$")String pinId,PinUpdate pinUpdate, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
}
