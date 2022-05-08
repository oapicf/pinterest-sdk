package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.Board;
import org.openapitools.model.BoardSection;
import org.openapitools.model.BoardUpdate;
import org.openapitools.model.Error;
import org.openapitools.model.Paginated;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-08T00:33:33.395237Z[Etc/UTC]")
public interface BoardsApiService {
      Response boardSectionsCreate(String boardId,BoardSection boardSection,SecurityContext securityContext)
      throws NotFoundException;
      Response boardSectionsDelete(String boardId,String sectionId,SecurityContext securityContext)
      throws NotFoundException;
      Response boardSectionsList(String boardId,String bookmark,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
      Response boardSectionsListPins(String boardId,String sectionId,String bookmark,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
      Response boardSectionsUpdate(String boardId,String sectionId,BoardSection boardSection,SecurityContext securityContext)
      throws NotFoundException;
      Response boardsCreate(Board board,SecurityContext securityContext)
      throws NotFoundException;
      Response boardsDelete(String boardId,SecurityContext securityContext)
      throws NotFoundException;
      Response boardsGet(String boardId,SecurityContext securityContext)
      throws NotFoundException;
      Response boardsList(String bookmark,Integer pageSize,String privacy,SecurityContext securityContext)
      throws NotFoundException;
      Response boardsListPins(String boardId,String bookmark,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
      Response boardsUpdate(String boardId,BoardUpdate boardUpdate,SecurityContext securityContext)
      throws NotFoundException;
}
