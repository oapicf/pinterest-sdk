package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.Account;
import org.openapitools.model.AnalyticsMetricsResponse;
import java.util.Date;
import org.openapitools.model.Error;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2022-05-08T00:31:37.849823Z[Etc/UTC]")
public abstract class UserAccountApiService {
    public abstract Response userAccountAnalytics(Date startDate
 ,Date endDate
 ,String fromClaimedContent
 ,String pinFormat
 ,String appTypes
 ,List<String> metricTypes
 ,String splitField
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response userAccountGet(String adAccountId
 ) throws NotFoundException;
}
