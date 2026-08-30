package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

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

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2026-08-30T09:54:04.171825690Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public interface BoardsApiService {
      public Response boardSectionsCreate(String boardId, BoardSectionCreate boardSectionCreate, String adAccountId, SecurityContext securityContext);
      public Response boardSectionsDelete(String boardId, String sectionId, String adAccountId, SecurityContext securityContext);
      public Response boardSectionsList(String boardId, String adAccountId, String bookmark, Integer pageSize, SecurityContext securityContext);
      public Response boardSectionsListPins(String boardId, String sectionId, String adAccountId, String bookmark, Integer pageSize, SecurityContext securityContext);
      public Response boardSectionsUpdate(String boardId, String sectionId, BoardSectionUpdateWithRequiredBody boardSectionUpdateWithRequiredBody, String adAccountId, SecurityContext securityContext);
      public Response boardsCreate(BoardCreate boardCreate, String adAccountId, SecurityContext securityContext);
      public Response boardsDelete(String boardId, String adAccountId, SecurityContext securityContext);
      public Response boardsGet(String boardId, String adAccountId, SecurityContext securityContext);
      public Response boardsList(String adAccountId, BoardPrivacyFilter privacy, String bookmark, Integer pageSize, SecurityContext securityContext);
      public Response boardsListPins(String boardId, List<CreativeType> creativeTypes, String adAccountId, Boolean pinMetrics, String bookmark, Integer pageSize, SecurityContext securityContext);
      public Response boardsUpdate(String boardId, BoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate, String adAccountId, SecurityContext securityContext);
}
