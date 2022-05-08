package controllers;

import apimodels.Error;
import apimodels.MediaUpload;
import apimodels.MediaUploadDetails;
import apimodels.MediaUploadRequest;
import apimodels.Paginated;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2022-05-08T00:31:58.024547Z[Etc/UTC]")
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
    public Paginated mediaList(Http.Request request, String bookmark,  @Min(1) @Max(100)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new Paginated();
    }

}
