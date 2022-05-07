package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.AnalyticsMetricsResponse;
import java.util.Date;
import org.openapitools.model.Error;
import org.openapitools.model.Pin;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-07T06:42:17.586199Z[Etc/UTC]")
public interface PinsApiService {
      Response pinsAnalytics(String pinId,Date startDate,Date endDate,List<String> metricTypes,String appTypes,String splitField,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response pinsCreate(Pin pin,SecurityContext securityContext)
      throws NotFoundException;
      Response pinsDelete(String pinId,SecurityContext securityContext)
      throws NotFoundException;
      Response pinsGet(String pinId,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
}
