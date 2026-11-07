package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.BrandAccount;
import org.openapitools.model.BrandAccountCreate;
import org.openapitools.model.BrandAccountUpdate;
import org.openapitools.model.PinterestLibError;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-11-07T04:05:33.662988146Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public abstract class BusinessAccessApiService {
    public abstract Response brandAccountsCreate(String businessHierarchyId
 ,BrandAccountCreate brandAccountCreate
 ) throws NotFoundException;
    public abstract Response brandAccountsUpdate(String brandAccountId
 ,String businessHierarchyId
 ,BrandAccountUpdate brandAccountUpdate
 ) throws NotFoundException;
}
