package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.Error;
import org.openapitools.model.SearchPartnerPins200Response;
import org.openapitools.model.SearchUserBoardsGet200Response;
import org.openapitools.model.SearchUserPinsList200Response;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-31T04:52:33.064583645Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public abstract class SearchApiService {
    public abstract Response searchPartnerPins(String term
 ,String countryCode
 ,String bookmark
 ,String locale
 ,Integer limit
 ) throws NotFoundException;
    public abstract Response searchUserBoardsGet(String adAccountId
 ,String bookmark
 ,Integer pageSize
 ,String query
 ) throws NotFoundException;
    public abstract Response searchUserPinsList(String query
 ,String adAccountId
 ,String bookmark
 ) throws NotFoundException;
}
