package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.AdAccountsCountryResponse;
import org.openapitools.model.BookClosedResponse;
import org.openapitools.model.DeliveryMetricsResponse;
import org.openapitools.model.Error;
import org.openapitools.model.SingleInterestTargetingOptionResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-11-05T02:20:31.447227872Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public interface ResourcesApiService {
      Response adAccountCountriesGet(SecurityContext securityContext)
      throws NotFoundException;
      Response deliveryMetricsGet(String reportType,SecurityContext securityContext)
      throws NotFoundException;
      Response interestTargetingOptionsGet(String interestId,SecurityContext securityContext)
      throws NotFoundException;
      Response leadFormQuestionsGet(SecurityContext securityContext)
      throws NotFoundException;
      Response metricsReadyStateGet(String date,SecurityContext securityContext)
      throws NotFoundException;
      Response targetingOptionsGet(String targetingType,String clientId,String oauthSignature,String timestamp,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
}
