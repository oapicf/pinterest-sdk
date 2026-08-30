package controllers;

import apimodels.Media;
import apimodels.MediaList200Response;
import apimodels.MediaUpload;
import apimodels.MediaUploadCreate;
import apimodels.PinterestLibError;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class MediaApiControllerImp extends MediaApiControllerImpInterface {
    @Override
    public MediaUpload mediaCreate(Http.Request request, MediaUploadCreate mediaUploadCreate) throws Exception {
        //Do your magic!!!
        return new MediaUpload();
    }

    @Override
    public Media mediaGet(Http.Request request,  @Pattern(regexp="^\\d+$")String mediaId) throws Exception {
        //Do your magic!!!
        return new Media();
    }

    @Override
    public MediaList200Response mediaList(Http.Request request, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new MediaList200Response();
    }

}
