package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.CreativeType;
import java.util.Date;
import org.openapitools.model.Error;
import java.util.Map;
import org.openapitools.model.Pin;
import org.openapitools.model.PinAnalyticsMetricsResponse;
import org.openapitools.model.PinCreate;
import org.openapitools.model.PinUpdate;
import org.openapitools.model.PinsList200Response;
import org.openapitools.model.PinsSaveRequest;
import org.openapitools.model.PinterestLibError;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-31T04:54:58.059572557Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public interface PinsApiService {
      Response multiPinsAnalytics(List<@Pattern(regexp = "^\\d+$")String> pinIds,Date startDate,Date endDate,List<String> metricTypes,String appTypes,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response pinsAnalytics(String pinId,Date startDate,Date endDate,List<String> metricTypes,String appTypes,String splitField,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response pinsCreate(PinCreate pinCreate,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response pinsDelete(String pinId,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response pinsGet(String pinId,String adAccountId,Boolean pinMetrics,SecurityContext securityContext)
      throws NotFoundException;
      Response pinsList(String pinFilter,Boolean pinMetrics,Boolean includeProtectedPins,String pinType,List<CreativeType> creativeTypes,String adAccountId,String bookmark,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
      Response pinsSave(String pinId,PinsSaveRequest pinsSaveRequest,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response pinsUpdate(String pinId,PinUpdate pinUpdate,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;


}
