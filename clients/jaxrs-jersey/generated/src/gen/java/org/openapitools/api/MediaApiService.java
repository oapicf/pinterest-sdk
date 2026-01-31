package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.Error;
import org.openapitools.model.MediaList200Response;
import org.openapitools.model.MediaUpload;
import org.openapitools.model.MediaUploadDetails;
import org.openapitools.model.MediaUploadRequest;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-01-26T05:37:28.314128517Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public abstract class MediaApiService {
    public abstract Response mediaCreate(MediaUploadRequest mediaUploadRequest,SecurityContext securityContext) throws NotFoundException;
    public abstract Response mediaGet( @Pattern(regexp="^\\d+$")String mediaId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response mediaList(String bookmark, @Min(1) @Max(250)Integer pageSize,SecurityContext securityContext) throws NotFoundException;
}
