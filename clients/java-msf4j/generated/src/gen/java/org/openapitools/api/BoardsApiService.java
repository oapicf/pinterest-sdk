package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

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
import java.util.List;
import org.openapitools.model.PinterestLibError;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-31T04:52:33.064583645Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public abstract class BoardsApiService {
    public abstract Response boardSectionsCreate(String boardId
 ,BoardSection boardSection
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response boardSectionsDelete(String boardId
 ,String sectionId
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response boardSectionsList(String boardId
 ,String adAccountId
 ,String bookmark
 ,Integer pageSize
 ) throws NotFoundException;
    public abstract Response boardSectionsListPins(String boardId
 ,String sectionId
 ,String adAccountId
 ,String bookmark
 ,Integer pageSize
 ) throws NotFoundException;
    public abstract Response boardSectionsUpdate(String boardId
 ,String sectionId
 ,BoardSection boardSection
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response boardsCreate(BoardCreate boardCreate
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response boardsDelete(String boardId
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response boardsGet(String boardId
 ,String adAccountId
 ) throws NotFoundException;
    public abstract Response boardsList(String adAccountId
 ,BoardPrivacyFilter privacy
 ,String bookmark
 ,Integer pageSize
 ) throws NotFoundException;
    public abstract Response boardsListPins(String boardId
 ,String bookmark
 ,Integer pageSize
 ,List<CreativeType> creativeTypes
 ,String adAccountId
 ,Boolean pinMetrics
 ) throws NotFoundException;
    public abstract Response boardsUpdate(String boardId
 ,BoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate
 ,String adAccountId
 ) throws NotFoundException;
}
