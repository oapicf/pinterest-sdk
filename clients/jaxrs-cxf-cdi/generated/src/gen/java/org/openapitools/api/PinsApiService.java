package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.openapitools.model.Error;
import org.joda.time.LocalDate;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-11-05T02:19:42.400563355Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public interface PinsApiService {
      public Response multiPinsAnalytics(List<@Pattern(regexp = "^\\d+$")String> pinIds, LocalDate startDate, LocalDate endDate, List<PinsAnalyticsMetricTypesParameterInner> metricTypes, String appTypes, String adAccountId, SecurityContext securityContext);
      public Response pinsAnalytics(String pinId, LocalDate startDate, LocalDate endDate, List<PinsAnalyticsMetricTypesParameterInner> metricTypes, String appTypes, String splitField, String adAccountId, SecurityContext securityContext);
      public Response pinsCreate(PinCreate pinCreate, String adAccountId, SecurityContext securityContext);
      public Response pinsDelete(String pinId, String adAccountId, SecurityContext securityContext);
      public Response pinsGet(String pinId, Boolean pinMetrics, String adAccountId, SecurityContext securityContext);
      public Response pinsList(String bookmark, Integer pageSize, String pinFilter, Boolean includeProtectedPins, String pinType, List<String> creativeTypes, String adAccountId, Boolean pinMetrics, SecurityContext securityContext);
      public Response pinsSave(String pinId, PinsSaveRequest pinsSaveRequest, String adAccountId, SecurityContext securityContext);
      public Response pinsUpdate(String pinId, PinUpdate pinUpdate, String adAccountId, SecurityContext securityContext);
}
