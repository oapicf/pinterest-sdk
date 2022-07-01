package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

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
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2022-07-01T12:00:52.037403Z[Etc/UTC]")
public abstract class BoardsApiService {
    public abstract Response boardSectionsCreate( @Pattern(regexp="^\\d+$")String boardId,BoardSection boardSection,SecurityContext securityContext) throws NotFoundException;
    public abstract Response boardSectionsDelete( @Pattern(regexp="^\\d+$")String boardId, @Pattern(regexp="^\\d+$")String sectionId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response boardSectionsList( @Pattern(regexp="^\\d+$")String boardId,String bookmark, @Min(1) @Max(100)Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response boardSectionsListPins( @Pattern(regexp="^\\d+$")String boardId, @Pattern(regexp="^\\d+$")String sectionId,String bookmark, @Min(1) @Max(100)Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response boardSectionsUpdate( @Pattern(regexp="^\\d+$")String boardId, @Pattern(regexp="^\\d+$")String sectionId,BoardSection boardSection,SecurityContext securityContext) throws NotFoundException;
    public abstract Response boardsCreate(Board board,SecurityContext securityContext) throws NotFoundException;
    public abstract Response boardsDelete( @Pattern(regexp="^\\d+$")String boardId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response boardsGet( @Pattern(regexp="^\\d+$")String boardId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response boardsList(String bookmark, @Min(1) @Max(100)Integer pageSize,String privacy,SecurityContext securityContext) throws NotFoundException;
    public abstract Response boardsListPins( @Pattern(regexp="^\\d+$")String boardId,String bookmark, @Min(1) @Max(100)Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response boardsUpdate( @Pattern(regexp="^\\d+$")String boardId,BoardUpdate boardUpdate,SecurityContext securityContext) throws NotFoundException;
}
