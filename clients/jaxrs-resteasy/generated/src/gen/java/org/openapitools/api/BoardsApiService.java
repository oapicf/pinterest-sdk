package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.Board;
import org.openapitools.model.BoardCreate;
import org.openapitools.model.BoardPrivacyFilter;
import org.openapitools.model.BoardSection;
import org.openapitools.model.BoardSectionCreate;
import org.openapitools.model.BoardSectionUpdateWithRequiredBody;
import org.openapitools.model.BoardSectionsList200Response;
import org.openapitools.model.BoardWithUpdatePrivacy;
import org.openapitools.model.BoardWithUpdatePrivacyUpdate;
import org.openapitools.model.BoardsList200Response;
import org.openapitools.model.BoardsListPins200Response;
import org.openapitools.model.CreativeType;
import org.openapitools.model.PinterestLibError;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-30T09:54:34.006998108Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public interface BoardsApiService {
      Response boardSectionsCreate(String boardId,BoardSectionCreate boardSectionCreate,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response boardSectionsDelete(String boardId,String sectionId,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response boardSectionsList(String boardId,String adAccountId,String bookmark,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
      Response boardSectionsListPins(String boardId,String sectionId,String adAccountId,String bookmark,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
      Response boardSectionsUpdate(String boardId,String sectionId,BoardSectionUpdateWithRequiredBody boardSectionUpdateWithRequiredBody,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response boardsCreate(BoardCreate boardCreate,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response boardsDelete(String boardId,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response boardsGet(String boardId,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;
      Response boardsList(String adAccountId,BoardPrivacyFilter privacy,String bookmark,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
      Response boardsListPins(String boardId,List<CreativeType> creativeTypes,String adAccountId,Boolean pinMetrics,String bookmark,Integer pageSize,SecurityContext securityContext)
      throws NotFoundException;
      Response boardsUpdate(String boardId,BoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate,String adAccountId,SecurityContext securityContext)
      throws NotFoundException;


}
