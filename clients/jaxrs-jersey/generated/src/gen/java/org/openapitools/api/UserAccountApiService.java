package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.Account;
import org.openapitools.model.AnalyticsMetricsResponse;
import java.util.Date;
import org.openapitools.model.Error;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2022-05-07T06:42:01.683468Z[Etc/UTC]")
public abstract class UserAccountApiService {
    public abstract Response userAccountAnalytics( @NotNull Date startDate, @NotNull Date endDate,String fromClaimedContent,String pinFormat,String appTypes,List<String> metricTypes,String splitField, @Pattern(regexp="^\\d+$")String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response userAccountGet( @Pattern(regexp="^\\d+$")String adAccountId,SecurityContext securityContext) throws NotFoundException;
}
