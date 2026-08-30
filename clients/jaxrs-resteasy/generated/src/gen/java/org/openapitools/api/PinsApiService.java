package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.CreativeType;
import java.util.Date;
import java.util.Map;
import org.openapitools.model.MultiPinsAnalyticsMetricTypesItem;
import org.openapitools.model.Pin;
import org.openapitools.model.PinAnalyticsMetricsResponse;
import org.openapitools.model.PinCreate;
import org.openapitools.model.PinFilter;
import org.openapitools.model.PinType;
import org.openapitools.model.PinUpdate;
import org.openapitools.model.PinsList200Response;
import org.openapitools.model.PinsSaveRequestCreate;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.ProductTagsBulkAddRequest;
import org.openapitools.model.ProductTagsBulkDeleteRequest;
import org.openapitools.model.ProductTagsError;
import org.openapitools.model.ProductTagsResponse;
import org.openapitools.model.QuerypinanalyticsmetrictypesItems;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-30T09:54:34.006998108Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public interface PinsApiService {
      Response multiPinsAnalytics(List<@Pattern(regexp = "^\\d+$")String> pinIds,Date startDate,Date endDate,List<MultiPinsAnalyticsMetricTypesItem> metricTypes,String appTypes,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response pinsAnalytics(String pinId,Date startDate,Date endDate,List<QuerypinanalyticsmetrictypesItems> metricTypes,String appTypes,String splitField,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response pinsCreate(PinCreate pinCreate,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response pinsDelete(String pinId,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response pinsGet(String pinId,String adAccountId,Boolean pinMetrics,SecurityContext securityContext)
      throws NotFoundException;
      Response pinsList(PinFilter pinFilter,Boolean pinMetrics,Boolean includeProtectedPins,PinType pinType,List<CreativeType> creativeTypes,String adAccountId,String domain,List<String> domains,Boolean includeProductTagObj,String bookmark,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
      Response pinsSave(String pinId,PinsSaveRequestCreate pinsSaveRequestCreate,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response pinsUpdate(String pinId,PinUpdate pinUpdate,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response productTagsBulkAdd(String pinId,ProductTagsBulkAddRequest productTagsBulkAddRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response productTagsBulkDelete(String pinId,ProductTagsBulkDeleteRequest productTagsBulkDeleteRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response productTagsList(String pinId,SecurityContext securityContext)
      throws NotFoundException;


}
