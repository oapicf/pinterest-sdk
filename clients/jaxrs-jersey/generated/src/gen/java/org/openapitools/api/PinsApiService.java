package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.AnalyticsMetricsResponse;
import java.util.Date;
import org.openapitools.model.Error;
import org.openapitools.model.Pin;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2022-05-08T00:33:19.615491Z[Etc/UTC]")
public abstract class PinsApiService {
    public abstract Response pinsAnalytics(String pinId, @NotNull Date startDate, @NotNull Date endDate, @NotNull List<String> metricTypes,String appTypes,String splitField, @Pattern(regexp="^\\d+$")String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response pinsCreate(Pin pin,SecurityContext securityContext) throws NotFoundException;
    public abstract Response pinsDelete(String pinId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response pinsGet(String pinId, @Pattern(regexp="^\\d+$")String adAccountId,SecurityContext securityContext) throws NotFoundException;
}
