package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.openapitools.model.Error;
import org.openapitools.model.TrendType;
import org.openapitools.model.TrendingKeywordsResponse;
import org.openapitools.model.TrendsSupportedRegion;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2025-05-10T05:40:26.530137127Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public interface TrendsApiService {
      public Response trendingKeywordsList(TrendsSupportedRegion region, TrendType trendType, List<String> interests, List<String> genders, List<String> ages, List<@Size(min = 1, max = 100)String> includeKeywords, Boolean normalizeAgainstGroup, Integer limit, SecurityContext securityContext);
}
