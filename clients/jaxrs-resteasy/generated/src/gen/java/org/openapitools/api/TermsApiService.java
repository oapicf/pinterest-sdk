package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.PinterestLibError;
import org.openapitools.model.RelatedTerms;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-11-07T02:51:37.236630265Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public interface TermsApiService {
      Response termsRelatedList(List<String> terms,SecurityContext securityContext)
      throws NotFoundException;
      Response termsSuggestedList(String term,Integer limit,SecurityContext securityContext)
      throws NotFoundException;


}
