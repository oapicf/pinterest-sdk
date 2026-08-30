package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.AdAccountCountriesGet200Response;
import org.openapitools.model.BookClosed;
import org.openapitools.model.DeliveryMetricsGet200Response;
import java.util.List;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.PublicTargetingType;
import org.openapitools.model.ReportType;
import org.openapitools.model.SingleInterestTargetingOption;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public abstract class ResourcesApiService {
    public abstract Response adAccountCountriesGet() throws NotFoundException;
    public abstract Response deliveryMetricsGet(ReportType reportType
 ) throws NotFoundException;
    public abstract Response interestTargetingOptionsGet(String interestId
 ) throws NotFoundException;
    public abstract Response leadFormQuestionsGet() throws NotFoundException;
    public abstract Response metricsReadyStateGet(String date
 ) throws NotFoundException;
    public abstract Response targetingOptionsGet(PublicTargetingType targetingType
 ,String adAccountId
 ,String clientId
 ,String oauthSignature
 ,String timestamp
 ) throws NotFoundException;
}
