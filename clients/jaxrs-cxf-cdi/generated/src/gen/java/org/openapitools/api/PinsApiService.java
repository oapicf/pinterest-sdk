package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.openapitools.model.AnalyticsMetricsResponse;
import org.openapitools.model.Error;
import org.joda.time.LocalDate;
import org.openapitools.model.Pin;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2022-05-08T00:33:08.337307Z[Etc/UTC]")
public interface PinsApiService {
      public Response pinsAnalytics(String pinId, LocalDate startDate, LocalDate endDate, List<String> metricTypes, String appTypes, String splitField, String adAccountId, SecurityContext securityContext);
      public Response pinsCreate(Pin pin, SecurityContext securityContext);
      public Response pinsDelete(String pinId, SecurityContext securityContext);
      public Response pinsGet(String pinId, String adAccountId, SecurityContext securityContext);
}
