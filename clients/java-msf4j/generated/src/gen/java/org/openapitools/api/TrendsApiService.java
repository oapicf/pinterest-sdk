package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.Error;
import java.util.List;
import org.openapitools.model.TrendType;
import org.openapitools.model.TrendingKeywordsResponse;
import org.openapitools.model.TrendsSupportedRegion;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-14T23:02:29.393275857Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public abstract class TrendsApiService {
    public abstract Response trendingKeywordsList(TrendsSupportedRegion region
 ,TrendType trendType
 ,List<String> interests
 ,List<String> genders
 ,List<String> ages
 ,Boolean normalizeAgainstGroup
 ,Integer limit
 ) throws NotFoundException;
}
