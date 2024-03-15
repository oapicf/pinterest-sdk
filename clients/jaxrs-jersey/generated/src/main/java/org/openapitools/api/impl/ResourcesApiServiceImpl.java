package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.AdAccountsCountryResponse;
import org.openapitools.model.BookClosedResponse;
import org.openapitools.model.DeliveryMetricsResponse;
import org.openapitools.model.Error;
import org.openapitools.model.SingleInterestTargetingOptionResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-03-14T23:04:30.273794609Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ResourcesApiServiceImpl extends ResourcesApiService {
    @Override
    public Response adAccountCountriesGet(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response deliveryMetricsGet(String reportType, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response interestTargetingOptionsGet( @Pattern(regexp="^\\d+$") @Size(max=18)String interestId, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response leadFormQuestionsGet(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response metricsReadyStateGet( @NotNull  @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")String date, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response targetingOptionsGet(String targetingType,  @Pattern(regexp="^\\d+$") @Size(max=18)String clientId, String oauthSignature,  @Pattern(regexp="\\d+")String timestamp, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
