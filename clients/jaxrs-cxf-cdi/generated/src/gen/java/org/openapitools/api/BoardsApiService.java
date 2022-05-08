package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.openapitools.model.Board;
import org.openapitools.model.BoardSection;
import org.openapitools.model.BoardUpdate;
import org.openapitools.model.Error;
import org.openapitools.model.Paginated;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2022-05-08T00:33:08.337307Z[Etc/UTC]")
public interface BoardsApiService {
      public Response boardSectionsCreate(String boardId, BoardSection boardSection, SecurityContext securityContext);
      public Response boardSectionsDelete(String boardId, String sectionId, SecurityContext securityContext);
      public Response boardSectionsList(String boardId, String bookmark, Integer pageSize, SecurityContext securityContext);
      public Response boardSectionsListPins(String boardId, String sectionId, String bookmark, Integer pageSize, SecurityContext securityContext);
      public Response boardSectionsUpdate(String boardId, String sectionId, BoardSection boardSection, SecurityContext securityContext);
      public Response boardsCreate(Board board, SecurityContext securityContext);
      public Response boardsDelete(String boardId, SecurityContext securityContext);
      public Response boardsGet(String boardId, SecurityContext securityContext);
      public Response boardsList(String bookmark, Integer pageSize, String privacy, SecurityContext securityContext);
      public Response boardsListPins(String boardId, String bookmark, Integer pageSize, SecurityContext securityContext);
      public Response boardsUpdate(String boardId, BoardUpdate boardUpdate, SecurityContext securityContext);
}
