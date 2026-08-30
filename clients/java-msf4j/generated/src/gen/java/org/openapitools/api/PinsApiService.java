package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.CreativeType;
import java.util.Date;
import java.util.List;
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

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public abstract class PinsApiService {
    public abstract Response multiPinsAnalytics(List<@Pattern(regexp = "^\\d+$")String> pinIds
 ,Date startDate
 ,Date endDate
 ,List<MultiPinsAnalyticsMetricTypesItem> metricTypes
 ,String appTypes
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response pinsAnalytics(String pinId
 ,Date startDate
 ,Date endDate
 ,List<QuerypinanalyticsmetrictypesItems> metricTypes
 ,String appTypes
 ,String splitField
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response pinsCreate(PinCreate pinCreate
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response pinsDelete(String pinId
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response pinsGet(String pinId
 ,String adAccountId
 ,Boolean pinMetrics
 ) throws NotFoundException;
    public abstract Response pinsList(PinFilter pinFilter
 ,Boolean pinMetrics
 ,Boolean includeProtectedPins
 ,PinType pinType
 ,List<CreativeType> creativeTypes
 ,String adAccountId
 ,String domain
 ,List<String> domains
 ,Boolean includeProductTagObj
 ,String bookmark
 ,Integer pageSize
 ) throws NotFoundException;
    public abstract Response pinsSave(String pinId
 ,PinsSaveRequestCreate pinsSaveRequestCreate
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response pinsUpdate(String pinId
 ,PinUpdate pinUpdate
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response productTagsBulkAdd(String pinId
 ,ProductTagsBulkAddRequest productTagsBulkAddRequest
 ) throws NotFoundException;
    public abstract Response productTagsBulkDelete(String pinId
 ,ProductTagsBulkDeleteRequest productTagsBulkDeleteRequest
 ) throws NotFoundException;
    public abstract Response productTagsList(String pinId
 ) throws NotFoundException;
}
