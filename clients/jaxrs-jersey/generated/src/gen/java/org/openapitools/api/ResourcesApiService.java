package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.AdAccountCountriesGet200Response;
import org.openapitools.model.BookClosed;
import org.openapitools.model.DeliveryMetricsGet200Response;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.PublicTargetingType;
import org.openapitools.model.ReportType;
import org.openapitools.model.SingleInterestTargetingOption;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-08-30T09:54:14.357431345Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public abstract class ResourcesApiService {
    public abstract Response adAccountCountriesGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response deliveryMetricsGet(ReportType reportType,SecurityContext securityContext) throws NotFoundException;
    public abstract Response interestTargetingOptionsGet( @Pattern(regexp="^\\d+$") @Size(max=18)String interestId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response leadFormQuestionsGet(SecurityContext securityContext) throws NotFoundException;
    public abstract Response metricsReadyStateGet( @NotNull  @Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")String date,SecurityContext securityContext) throws NotFoundException;
    public abstract Response targetingOptionsGet(PublicTargetingType targetingType, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, @Pattern(regexp="^\\d+$") @Size(max=18)String clientId,String oauthSignature, @Pattern(regexp="\\d+")String timestamp,SecurityContext securityContext) throws NotFoundException;
}
