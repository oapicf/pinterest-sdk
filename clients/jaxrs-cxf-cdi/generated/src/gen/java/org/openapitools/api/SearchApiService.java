package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-11-05T02:19:42.400563355Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public interface SearchApiService {
      public Response searchPartnerPins(String term, String countryCode, String bookmark, String locale, Integer limit, SecurityContext securityContext);
      public Response searchUserBoardsGet(String adAccountId, String bookmark, Integer pageSize, String query, SecurityContext securityContext);
      public Response searchUserPinsList(String query, String adAccountId, String bookmark, SecurityContext securityContext);
}
