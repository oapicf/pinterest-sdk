package controllers;

import apimodels.NotificationPostRequest;
import apimodels.NotificationResponse;
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
public class NotificationApiControllerImp extends NotificationApiControllerImpInterface {
    @Override
    public NotificationResponse notificationPost(Http.Request request, NotificationPostRequest notificationPostRequest) throws Exception {
        //Do your magic!!!
        return new NotificationResponse();
    }

}
