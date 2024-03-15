package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.Error;
import org.openapitools.model.PinsList200Response;
import org.openapitools.model.SearchPartnerPins200Response;
import org.openapitools.model.SearchUserBoardsGet200Response;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-14T23:04:42.546429009Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public interface SearchApiService {
      Response searchPartnerPins(String term,String countryCode,String bookmark,String locale,Integer limit,SecurityContext securityContext)
      throws NotFoundException;
      Response searchUserBoardsGet(String adAccountId,String bookmark,Integer pageSize,String query,SecurityContext securityContext)
      throws NotFoundException;
      Response searchUserPinsList(String query,String adAccountId,String bookmark,SecurityContext securityContext)
      throws NotFoundException;
}
