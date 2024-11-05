package controllers;

import apimodels.Error;
import apimodels.MediaList200Response;
import apimodels.MediaUpload;
import apimodels.MediaUploadDetails;
import apimodels.MediaUploadRequest;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class MediaApiControllerImp extends MediaApiControllerImpInterface {
    @Override
    public MediaUpload mediaCreate(Http.Request request, MediaUploadRequest mediaUploadRequest) throws Exception {
        //Do your magic!!!
        return new MediaUpload();
    }

    @Override
    public MediaUploadDetails mediaGet(Http.Request request,  @Pattern(regexp="^\\d+$")String mediaId) throws Exception {
        //Do your magic!!!
        return new MediaUploadDetails();
    }

    @Override
    public MediaList200Response mediaList(Http.Request request, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new MediaList200Response();
    }

}
