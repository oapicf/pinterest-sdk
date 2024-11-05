package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.AdAccountsCountryResponse;
import org.openapitools.model.BookClosedResponse;
import org.openapitools.model.DeliveryMetricsResponse;
import org.openapitools.model.Error;
import java.util.List;
import org.openapitools.model.SingleInterestTargetingOptionResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-05T02:04:18.164649512Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public abstract class ResourcesApiService {
    public abstract Response adAccountCountriesGet() throws NotFoundException;
    public abstract Response deliveryMetricsGet(String reportType
 ) throws NotFoundException;
    public abstract Response interestTargetingOptionsGet(String interestId
 ) throws NotFoundException;
    public abstract Response leadFormQuestionsGet() throws NotFoundException;
    public abstract Response metricsReadyStateGet(String date
 ) throws NotFoundException;
    public abstract Response targetingOptionsGet(String targetingType
 ,String clientId
 ,String oauthSignature
 ,String timestamp
 ,String adAccountId
 ) throws NotFoundException;
}
