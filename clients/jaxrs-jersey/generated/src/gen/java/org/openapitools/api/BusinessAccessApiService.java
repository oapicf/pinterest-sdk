package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.BrandAccount;
import org.openapitools.model.BrandAccountCreate;
import org.openapitools.model.BrandAccountUpdate;
import org.openapitools.model.PinterestLibError;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-08-30T09:54:14.357431345Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public abstract class BusinessAccessApiService {
    public abstract Response brandAccountsCreate( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessHierarchyId,BrandAccountCreate brandAccountCreate,SecurityContext securityContext) throws NotFoundException;
    public abstract Response brandAccountsUpdate(String brandAccountId, @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessHierarchyId,BrandAccountUpdate brandAccountUpdate,SecurityContext securityContext) throws NotFoundException;
}
