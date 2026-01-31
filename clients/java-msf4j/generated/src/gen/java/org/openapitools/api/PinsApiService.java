package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.CreativeType;
import java.util.Date;
import org.openapitools.model.Error;
import java.util.List;
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

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-31T04:52:33.064583645Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public abstract class PinsApiService {
    public abstract Response multiPinsAnalytics(List<@Pattern(regexp = "^\\d+$")String> pinIds
 ,Date startDate
 ,Date endDate
 ,List<String> metricTypes
 ,String appTypes
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response pinsAnalytics(String pinId
 ,Date startDate
 ,Date endDate
 ,List<String> metricTypes
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
    public abstract Response pinsList(String pinFilter
 ,Boolean pinMetrics
 ,Boolean includeProtectedPins
 ,String pinType
 ,List<CreativeType> creativeTypes
 ,String adAccountId
 ,String bookmark
 ,Integer pageSize
 ) throws NotFoundException;
    public abstract Response pinsSave(String pinId
 ,PinsSaveRequest pinsSaveRequest
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response pinsUpdate(String pinId
 ,PinUpdate pinUpdate
 ,String adAccountId
 ) throws NotFoundException;
}
