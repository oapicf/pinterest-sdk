package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.Error;
import org.openapitools.model.RelatedTerms;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2025-05-10T05:40:33.668687276Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public abstract class TermsApiService {
    public abstract Response termsRelatedList( @NotNull List<String> terms,SecurityContext securityContext) throws NotFoundException;
    public abstract Response termsSuggestedList( @NotNull String term, @Min(1) @Max(10)Integer limit,SecurityContext securityContext) throws NotFoundException;
}
