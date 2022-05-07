package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import org.openapitools.model.Board;
import org.openapitools.model.BoardSection;
import org.openapitools.model.BoardUpdate;
import org.openapitools.model.Error;
import org.openapitools.model.Paginated;

import java.util.List;

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2022-05-07T06:41:45.100230Z[Etc/UTC]")
public class BoardsApiServiceImpl implements BoardsApiService {
      @Override
      public Response boardSectionsCreate(String boardId, BoardSection boardSection, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response boardSectionsDelete(String boardId, String sectionId, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response boardSectionsList(String boardId, String bookmark, Integer pageSize, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response boardSectionsListPins(String boardId, String sectionId, String bookmark, Integer pageSize, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response boardSectionsUpdate(String boardId, String sectionId, BoardSection boardSection, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response boardsCreate(Board board, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response boardsDelete(String boardId, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response boardsGet(String boardId, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response boardsList(String bookmark, Integer pageSize, String privacy, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response boardsListPins(String boardId, String bookmark, Integer pageSize, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response boardsUpdate(String boardId, BoardUpdate boardUpdate, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
}
