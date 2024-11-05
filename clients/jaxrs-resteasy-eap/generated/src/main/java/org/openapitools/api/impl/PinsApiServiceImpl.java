package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;


import java.util.Date;
import org.openapitools.model.Error;
import java.util.Map;
import org.openapitools.model.Pin;
import org.openapitools.model.PinAnalyticsMetricsResponse;
import org.openapitools.model.PinCreate;
import org.openapitools.model.PinUpdate;
import org.openapitools.model.PinsAnalyticsMetricTypesParameterInner;
import org.openapitools.model.PinsList200Response;
import org.openapitools.model.PinsSaveRequest;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-11-05T02:20:54.377772266Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class PinsApiServiceImpl implements PinsApi {
      public Response multiPinsAnalytics(List<@Pattern(regexp = "^\\d+$")String> pinIds,Date startDate,Date endDate,List<PinsAnalyticsMetricTypesParameterInner> metricTypes,String appTypes,String adAccountId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response pinsAnalytics(String pinId,Date startDate,Date endDate,List<PinsAnalyticsMetricTypesParameterInner> metricTypes,String appTypes,String splitField,String adAccountId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response pinsCreate(PinCreate pinCreate,String adAccountId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response pinsDelete(String pinId,String adAccountId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response pinsGet(String pinId,Boolean pinMetrics,String adAccountId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response pinsList(String bookmark,Integer pageSize,String pinFilter,Boolean includeProtectedPins,String pinType,List<String> creativeTypes,String adAccountId,Boolean pinMetrics,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response pinsSave(String pinId,PinsSaveRequest pinsSaveRequest,String adAccountId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response pinsUpdate(String pinId,PinUpdate pinUpdate,String adAccountId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
