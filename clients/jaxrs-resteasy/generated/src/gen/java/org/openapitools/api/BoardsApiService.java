package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.Board;
import org.openapitools.model.BoardSection;
import org.openapitools.model.BoardSectionsList200Response;
import org.openapitools.model.BoardUpdate;
import org.openapitools.model.BoardsList200Response;
import org.openapitools.model.BoardsListPins200Response;
import org.openapitools.model.Error;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-11-05T02:20:31.447227872Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public interface BoardsApiService {
      Response boardSectionsCreate(String boardId,BoardSection boardSection,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response boardSectionsDelete(String boardId,String sectionId,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response boardSectionsList(String boardId,String adAccountId,String bookmark,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
      Response boardSectionsListPins(String boardId,String sectionId,String adAccountId,String bookmark,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
      Response boardSectionsUpdate(String boardId,String sectionId,BoardSection boardSection,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response boardsCreate(Board board,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response boardsDelete(String boardId,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response boardsGet(String boardId,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response boardsList(String adAccountId,String bookmark,Integer pageSize,String privacy,SecurityContext securityContext)
      throws NotFoundException;
      Response boardsListPins(String boardId,String bookmark,Integer pageSize,List<String> creativeTypes,String adAccountId,Boolean pinMetrics,SecurityContext securityContext)
      throws NotFoundException;
      Response boardsUpdate(String boardId,BoardUpdate boardUpdate,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
}
