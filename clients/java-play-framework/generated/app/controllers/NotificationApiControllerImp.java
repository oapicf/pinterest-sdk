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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-07T04:05:46.315568162Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class NotificationApiControllerImp extends NotificationApiControllerImpInterface {
    @Override
    public NotificationResponse notificationPost(Http.Request request, NotificationPostRequest notificationPostRequest) throws Exception {
        //Do your magic!!!
        return new NotificationResponse();
    }

}
