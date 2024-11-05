package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.openapitools.model.AdAccountsCountryResponse;
import org.openapitools.model.BookClosedResponse;
import org.openapitools.model.DeliveryMetricsResponse;
import org.openapitools.model.Error;
import org.openapitools.model.SingleInterestTargetingOptionResponse;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-11-05T02:19:42.400563355Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public interface ResourcesApiService {
      public Response adAccountCountriesGet(SecurityContext securityContext);
      public Response deliveryMetricsGet(String reportType, SecurityContext securityContext);
      public Response interestTargetingOptionsGet(String interestId, SecurityContext securityContext);
      public Response leadFormQuestionsGet(SecurityContext securityContext);
      public Response metricsReadyStateGet(String date, SecurityContext securityContext);
      public Response targetingOptionsGet(String targetingType, String clientId, String oauthSignature, String timestamp, String adAccountId, SecurityContext securityContext);
}
