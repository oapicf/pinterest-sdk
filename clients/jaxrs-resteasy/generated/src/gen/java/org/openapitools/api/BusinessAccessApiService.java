package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.BrandAccountsCreate200Response;
import org.openapitools.model.BrandAccountsCreateRequest;
import org.openapitools.model.BrandAccountsUpdateRequest;
import org.openapitools.model.Error;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-31T04:54:58.059572557Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public interface BusinessAccessApiService {
      Response brandAccountsCreate(String businessHierarchyId,BrandAccountsCreateRequest brandAccountsCreateRequest,SecurityContext securityContext)
      throws NotFoundException;
      Response brandAccountsUpdate(String businessHierarchyId,String brandAccountId,BrandAccountsUpdateRequest brandAccountsUpdateRequest,SecurityContext securityContext)
      throws NotFoundException;


}
