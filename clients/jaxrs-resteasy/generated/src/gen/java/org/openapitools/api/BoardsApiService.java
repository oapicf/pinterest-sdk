package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.Board;
import org.openapitools.model.BoardCreate;
import org.openapitools.model.BoardPrivacyFilter;
import org.openapitools.model.BoardSection;
import org.openapitools.model.BoardSectionsList200Response;
import org.openapitools.model.BoardWithUpdatePrivacy;
import org.openapitools.model.BoardWithUpdatePrivacyUpdate;
import org.openapitools.model.BoardsList200Response;
import org.openapitools.model.BoardsListPins200Response;
import org.openapitools.model.CreativeType;
import org.openapitools.model.Error;
import org.openapitools.model.PinterestLibError;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-31T04:54:58.059572557Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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
      Response boardsCreate(BoardCreate boardCreate,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response boardsDelete(String boardId,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response boardsGet(String boardId,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response boardsList(String adAccountId,BoardPrivacyFilter privacy,String bookmark,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
      Response boardsListPins(String boardId,String bookmark,Integer pageSize,List<CreativeType> creativeTypes,String adAccountId,Boolean pinMetrics,SecurityContext securityContext)
      throws NotFoundException;
      Response boardsUpdate(String boardId,BoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;


}
