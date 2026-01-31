package controllers;

import apimodels.Error;
import apimodels.NotificationPostRequest;
import apimodels.NotificationResponse;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class NotificationApiControllerImp extends NotificationApiControllerImpInterface {
    @Override
    public NotificationResponse notificationPost(Http.Request request, NotificationPostRequest notificationPostRequest) throws Exception {
        //Do your magic!!!
        return new NotificationResponse();
    }

}
