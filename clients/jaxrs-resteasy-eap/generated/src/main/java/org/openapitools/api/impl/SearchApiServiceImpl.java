package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.BoardsList200Response;
import org.openapitools.model.PinsList200Response;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.SearchPartnerPins200Response;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-08-30T09:54:43.403996865Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SearchApiServiceImpl implements SearchApi {
      public Response searchPartnerPins(String term,String countryCode,String bookmark,String locale,Integer limit,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response searchUserBoardsGet(String adAccountId,String query,String bookmark,Integer pageSize,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response searchUserPinsList(String query,String adAccountId,String bookmark,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
