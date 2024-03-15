package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.openapitools.model.Board;
import org.openapitools.model.BoardSection;
import org.openapitools.model.BoardSectionsList200Response;
import org.openapitools.model.BoardUpdate;
import org.openapitools.model.BoardsList200Response;
import org.openapitools.model.BoardsListPins200Response;
import org.openapitools.model.Error;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-03-14T23:04:18.835425768Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public interface BoardsApiService {
      public Response boardSectionsCreate(String boardId, BoardSection boardSection, String adAccountId, SecurityContext securityContext);
      public Response boardSectionsDelete(String boardId, String sectionId, String adAccountId, SecurityContext securityContext);
      public Response boardSectionsList(String boardId, String adAccountId, String bookmark, Integer pageSize, SecurityContext securityContext);
      public Response boardSectionsListPins(String boardId, String sectionId, String adAccountId, String bookmark, Integer pageSize, SecurityContext securityContext);
      public Response boardSectionsUpdate(String boardId, String sectionId, BoardSection boardSection, String adAccountId, SecurityContext securityContext);
      public Response boardsCreate(Board board, String adAccountId, SecurityContext securityContext);
      public Response boardsDelete(String boardId, String adAccountId, SecurityContext securityContext);
      public Response boardsGet(String boardId, String adAccountId, SecurityContext securityContext);
      public Response boardsList(String adAccountId, String bookmark, Integer pageSize, String privacy, SecurityContext securityContext);
      public Response boardsListPins(String boardId, String bookmark, Integer pageSize, List<String> creativeTypes, String adAccountId, Boolean pinMetrics, SecurityContext securityContext);
      public Response boardsUpdate(String boardId, BoardUpdate boardUpdate, String adAccountId, SecurityContext securityContext);
}
