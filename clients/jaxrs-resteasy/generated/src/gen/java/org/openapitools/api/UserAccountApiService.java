package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.Account;
import org.openapitools.model.AnalyticsMetricsResponse;
import java.util.Date;
import org.openapitools.model.Error;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-07T06:42:17.586199Z[Etc/UTC]")
public interface UserAccountApiService {
      Response userAccountAnalytics(Date startDate,Date endDate,String fromClaimedContent,String pinFormat,String appTypes,List<String> metricTypes,String splitField,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response userAccountGet(String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
}
