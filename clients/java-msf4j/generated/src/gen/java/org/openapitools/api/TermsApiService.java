package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.Error;
import java.util.List;
import org.openapitools.model.RelatedTerms;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-26T05:36:17.223809908Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public abstract class TermsApiService {
    public abstract Response termsRelatedList(List<String> terms
 ) throws NotFoundException;
    public abstract Response termsSuggestedList(String term
 ,Integer limit
 ) throws NotFoundException;
}
