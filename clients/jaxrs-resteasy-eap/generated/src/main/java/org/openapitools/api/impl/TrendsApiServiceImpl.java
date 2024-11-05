package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;


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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-11-05T02:20:54.377772266Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TrendsApiServiceImpl implements TrendsApi {
      public Response trendingKeywordsList(TrendsSupportedRegion region,TrendType trendType,List<String> interests,List<String> genders,List<String> ages,List<@Size(min = 1, max = 100)String> includeKeywords,Boolean normalizeAgainstGroup,Integer limit,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
