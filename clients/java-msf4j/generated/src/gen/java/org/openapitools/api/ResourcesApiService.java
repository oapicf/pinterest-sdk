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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-14T23:02:29.393275857Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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
 ) throws NotFoundException;
}
