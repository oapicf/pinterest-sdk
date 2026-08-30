package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.openapitools.model.AdAccountCountriesGet200Response;
import org.openapitools.model.BookClosed;
import org.openapitools.model.DeliveryMetricsGet200Response;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.PublicTargetingType;
import org.openapitools.model.ReportType;
import org.openapitools.model.SingleInterestTargetingOption;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2026-08-30T09:54:04.171825690Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public interface ResourcesApiService {
      public Response adAccountCountriesGet(SecurityContext securityContext);
      public Response deliveryMetricsGet(ReportType reportType, SecurityContext securityContext);
      public Response interestTargetingOptionsGet(String interestId, SecurityContext securityContext);
      public Response leadFormQuestionsGet(SecurityContext securityContext);
      public Response metricsReadyStateGet(String date, SecurityContext securityContext);
      public Response targetingOptionsGet(PublicTargetingType targetingType, String adAccountId, String clientId, String oauthSignature, String timestamp, SecurityContext securityContext);
}
