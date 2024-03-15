package org.openapitools.controllers;

import io.swagger.inflector.models.RequestContext;
import io.swagger.inflector.models.ResponseContext;
import javax.ws.rs.core.Response.Status;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import java.io.File;
import java.util.List;

import org.openapitools.model.*;

import org.openapitools.model.Board;
import org.openapitools.model.BoardSection;
import org.openapitools.model.BoardSectionsList200Response;
import org.openapitools.model.BoardUpdate;
import org.openapitools.model.BoardsList200Response;
import org.openapitools.model.BoardsListPins200Response;
import org.openapitools.model.Error;
import java.util.List;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-14T23:01:39.171456580Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class BoardsController  {
  /**
   * Uncomment and implement as you see fit.  These operations will map
   * Directly to operation calls from the routing logic.  Because the inflector
   * Code allows you to implement logic incrementally, they are disabled.
   **/

  /*
    public ResponseContext boardSectionsCreate(RequestContext request , String boardId, BoardSection boardSection, String adAccountId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext boardSectionsDelete(RequestContext request , String boardId, String sectionId, String adAccountId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext boardSectionsList(RequestContext request , String boardId, String adAccountId, String bookmark, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext boardSectionsListPins(RequestContext request , String boardId, String sectionId, String adAccountId, String bookmark, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext boardSectionsUpdate(RequestContext request , String boardId, String sectionId, BoardSection boardSection, String adAccountId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext boardsCreate(RequestContext request , Board board, String adAccountId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext boardsDelete(RequestContext request , String boardId, String adAccountId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext boardsGet(RequestContext request , String boardId, String adAccountId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext boardsList(RequestContext request , String adAccountId, String bookmark, Integer pageSize, String privacy) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext boardsListPins(RequestContext request , String boardId, String bookmark, Integer pageSize, List<String> creativeTypes, String adAccountId, Boolean pinMetrics) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext boardsUpdate(RequestContext request , String boardId, BoardUpdate boardUpdate, String adAccountId) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

}
