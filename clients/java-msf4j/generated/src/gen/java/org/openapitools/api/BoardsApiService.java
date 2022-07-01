package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2022-07-01T11:59:44.239108Z[Etc/UTC]")
public abstract class BoardsApiService {
    public abstract Response boardSectionsCreate(String boardId
 ,BoardSection boardSection
 ) throws NotFoundException;
    public abstract Response boardSectionsDelete(String boardId
 ,String sectionId
 ) throws NotFoundException;
    public abstract Response boardSectionsList(String boardId
 ,String bookmark
 ,Integer pageSize
 ) throws NotFoundException;
    public abstract Response boardSectionsListPins(String boardId
 ,String sectionId
 ,String bookmark
 ,Integer pageSize
 ) throws NotFoundException;
    public abstract Response boardSectionsUpdate(String boardId
 ,String sectionId
 ,BoardSection boardSection
 ) throws NotFoundException;
    public abstract Response boardsCreate(Board board
 ) throws NotFoundException;
    public abstract Response boardsDelete(String boardId
 ) throws NotFoundException;
    public abstract Response boardsGet(String boardId
 ) throws NotFoundException;
    public abstract Response boardsList(String bookmark
 ,Integer pageSize
 ,String privacy
 ) throws NotFoundException;
    public abstract Response boardsListPins(String boardId
 ,String bookmark
 ,Integer pageSize
 ) throws NotFoundException;
    public abstract Response boardsUpdate(String boardId
 ,BoardUpdate boardUpdate
 ) throws NotFoundException;
}
