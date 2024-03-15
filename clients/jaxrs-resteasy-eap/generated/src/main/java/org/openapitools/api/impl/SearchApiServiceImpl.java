package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.Error;
import org.openapitools.model.PinsList200Response;
import org.openapitools.model.SearchPartnerPins200Response;
import org.openapitools.model.SearchUserBoardsGet200Response;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-03-14T23:04:54.712028318Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class SearchApiServiceImpl implements SearchApi {
      public Response searchPartnerPins(String term,String countryCode,String bookmark,String locale,Integer limit,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response searchUserBoardsGet(String adAccountId,String bookmark,Integer pageSize,String query,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response searchUserPinsList(String query,String adAccountId,String bookmark,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
