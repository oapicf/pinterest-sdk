package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



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

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-30T09:54:34.006998108Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public interface ResourcesApiService {
      Response adAccountCountriesGet(SecurityContext securityContext)
      throws NotFoundException;
      Response deliveryMetricsGet(ReportType reportType,SecurityContext securityContext)
      throws NotFoundException;
      Response interestTargetingOptionsGet(String interestId,SecurityContext securityContext)
      throws NotFoundException;
      Response leadFormQuestionsGet(SecurityContext securityContext)
      throws NotFoundException;
      Response metricsReadyStateGet(String date,SecurityContext securityContext)
      throws NotFoundException;
      Response targetingOptionsGet(PublicTargetingType targetingType,String adAccountId,String clientId,String oauthSignature,String timestamp,SecurityContext securityContext)
      throws NotFoundException;


}
