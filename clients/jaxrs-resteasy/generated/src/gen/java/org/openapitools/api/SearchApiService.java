package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.BoardsList200Response;
import org.openapitools.model.PinsList200Response;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.SearchPartnerPins200Response;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-11-07T04:06:44.072323441Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public interface SearchApiService {
      Response searchPartnerPins(String term,String countryCode,String bookmark,String locale,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response searchUserBoardsGet(String adAccountId,String query,String bookmark,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
      Response searchUserPinsList(String query,String adAccountId,String bookmark,SecurityContext securityContext)
      throws NotFoundException;


}
