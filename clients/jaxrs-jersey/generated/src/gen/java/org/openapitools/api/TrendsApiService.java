package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.Error;
import org.openapitools.model.TrendType;
import org.openapitools.model.TrendingKeywordsResponse;
import org.openapitools.model.TrendsSupportedRegion;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2025-05-10T05:40:33.668687276Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public abstract class TrendsApiService {
    public abstract Response trendingKeywordsList(TrendsSupportedRegion region,TrendType trendType,List<String> interests,List<String> genders,List<String> ages, @Size(min=1,max=50)List<@Size(min = 1, max = 100)String> includeKeywords,Boolean normalizeAgainstGroup, @Min(1) @Max(50)Integer limit,SecurityContext securityContext) throws NotFoundException;
}
