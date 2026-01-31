package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

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

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-01-31T04:54:42.155723473Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public abstract class BoardsApiService {
    public abstract Response boardSectionsCreate( @Pattern(regexp="^\\d+$")String boardId,BoardSection boardSection, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response boardSectionsDelete( @Pattern(regexp="^\\d+$")String boardId, @Pattern(regexp="^\\d+$")String sectionId, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response boardSectionsList( @Pattern(regexp="^\\d+$")String boardId, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,String bookmark, @Min(1) @Max(250)Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response boardSectionsListPins( @Pattern(regexp="^\\d+$")String boardId, @Pattern(regexp="^\\d+$")String sectionId, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,String bookmark, @Min(1) @Max(250)Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response boardSectionsUpdate( @Pattern(regexp="^\\d+$")String boardId, @Pattern(regexp="^\\d+$")String sectionId,BoardSection boardSection, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response boardsCreate(BoardCreate boardCreate, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response boardsDelete( @Pattern(regexp="^\\d+$")String boardId, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response boardsGet( @Pattern(regexp="^\\d+$")String boardId, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response boardsList( @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,BoardPrivacyFilter privacy,String bookmark, @Min(1) @Max(250)Integer pageSize,SecurityContext securityContext) throws NotFoundException;
    public abstract Response boardsListPins( @Pattern(regexp="^\\d+$")String boardId,String bookmark, @Min(1) @Max(250)Integer pageSize,List<CreativeType> creativeTypes, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,Boolean pinMetrics,SecurityContext securityContext) throws NotFoundException;
    public abstract Response boardsUpdate( @Pattern(regexp="^\\d+$")String boardId,BoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate, @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId,SecurityContext securityContext) throws NotFoundException;
}
