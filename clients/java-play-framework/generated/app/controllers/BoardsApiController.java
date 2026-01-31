package controllers;

import apimodels.Board;
import apimodels.BoardCreate;
import apimodels.BoardPrivacyFilter;
import apimodels.BoardSection;
import apimodels.BoardSectionsList200Response;
import apimodels.BoardWithUpdatePrivacy;
import apimodels.BoardWithUpdatePrivacyUpdate;
import apimodels.BoardsList200Response;
import apimodels.BoardsListPins200Response;
import apimodels.CreativeType;
import apimodels.Error;
import apimodels.PinterestLibError;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BoardsApiController extends Controller {
    private final BoardsApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private BoardsApiController(Config configuration, BoardsApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result boardSectionsCreate(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId) throws Exception {
        JsonNode nodeboardSection = request.body().asJson();
        BoardSection boardSection;
        if (nodeboardSection != null) {
            boardSection = mapper.readValue(nodeboardSection.toString(), BoardSection.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(boardSection);
            }
        } else {
            throw new IllegalArgumentException("'BoardSection' parameter is required");
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.boardSectionsCreateHttp(request, boardId, boardSection, adAccountId);
    }

    @ApiAction
    public Result boardSectionsDelete(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId, @Pattern(regexp="^\\d+$")String sectionId) throws Exception {
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.boardSectionsDeleteHttp(request, boardId, sectionId, adAccountId);
    }

    @ApiAction
    public Result boardSectionsList(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId) throws Exception {
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        String valuebookmark = request.getQueryString("bookmark");
        String bookmark;
        if (valuebookmark != null) {
            bookmark = valuebookmark;
        } else {
            bookmark = null;
        }
        String valuepageSize = request.getQueryString("page_size");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = 25;
        }
        return imp.boardSectionsListHttp(request, boardId, adAccountId, bookmark, pageSize);
    }

    @ApiAction
    public Result boardSectionsListPins(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId, @Pattern(regexp="^\\d+$")String sectionId) throws Exception {
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        String valuebookmark = request.getQueryString("bookmark");
        String bookmark;
        if (valuebookmark != null) {
            bookmark = valuebookmark;
        } else {
            bookmark = null;
        }
        String valuepageSize = request.getQueryString("page_size");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = 25;
        }
        return imp.boardSectionsListPinsHttp(request, boardId, sectionId, adAccountId, bookmark, pageSize);
    }

    @ApiAction
    public Result boardSectionsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId, @Pattern(regexp="^\\d+$")String sectionId) throws Exception {
        JsonNode nodeboardSection = request.body().asJson();
        BoardSection boardSection;
        if (nodeboardSection != null) {
            boardSection = mapper.readValue(nodeboardSection.toString(), BoardSection.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(boardSection);
            }
        } else {
            throw new IllegalArgumentException("'BoardSection' parameter is required");
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.boardSectionsUpdateHttp(request, boardId, sectionId, boardSection, adAccountId);
    }

    @ApiAction
    public Result boardsCreate(Http.Request request) throws Exception {
        JsonNode nodeboardCreate = request.body().asJson();
        BoardCreate boardCreate;
        if (nodeboardCreate != null) {
            boardCreate = mapper.readValue(nodeboardCreate.toString(), BoardCreate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(boardCreate);
            }
        } else {
            throw new IllegalArgumentException("'BoardCreate' parameter is required");
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.boardsCreateHttp(request, boardCreate, adAccountId);
    }

    @ApiAction
    public Result boardsDelete(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId) throws Exception {
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.boardsDeleteHttp(request, boardId, adAccountId);
    }

    @ApiAction
    public Result boardsGet(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId) throws Exception {
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.boardsGetHttp(request, boardId, adAccountId);
    }

    @ApiAction
    public Result boardsList(Http.Request request) throws Exception {
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        String valueprivacy = request.getQueryString("privacy");
        BoardPrivacyFilter privacy;
        if (valueprivacy != null) {
            privacy = valueprivacy;
        } else {
            privacy = null;
        }
        String valuebookmark = request.getQueryString("bookmark");
        String bookmark;
        if (valuebookmark != null) {
            bookmark = valuebookmark;
        } else {
            bookmark = null;
        }
        String valuepageSize = request.getQueryString("page_size");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = 25;
        }
        return imp.boardsListHttp(request, adAccountId, privacy, bookmark, pageSize);
    }

    @ApiAction
    public Result boardsListPins(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId) throws Exception {
        String valuebookmark = request.getQueryString("bookmark");
        String bookmark;
        if (valuebookmark != null) {
            bookmark = valuebookmark;
        } else {
            bookmark = null;
        }
        String valuepageSize = request.getQueryString("page_size");
        Integer pageSize;
        if (valuepageSize != null) {
            pageSize = Integer.parseInt(valuepageSize);
        } else {
            pageSize = 25;
        }
        String[] creativeTypesArray = request.queryString().get("creative_types");
        List<String> creativeTypesList = OpenAPIUtils.parametersToList("multi", creativeTypesArray);
        List<CreativeType> creativeTypes = new ArrayList<>();
        for (String curParam : creativeTypesList) {
            if (!curParam.isEmpty()) {
                //noinspection UseBulkOperation
                creativeTypes.add(curParam);
            }
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        String valuepinMetrics = request.getQueryString("pin_metrics");
        Boolean pinMetrics;
        if (valuepinMetrics != null) {
            pinMetrics = Boolean.valueOf(valuepinMetrics);
        } else {
            pinMetrics = false;
        }
        return imp.boardsListPinsHttp(request, boardId, bookmark, pageSize, creativeTypes, adAccountId, pinMetrics);
    }

    @ApiAction
    public Result boardsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId) throws Exception {
        JsonNode nodeboardWithUpdatePrivacyUpdate = request.body().asJson();
        BoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate;
        if (nodeboardWithUpdatePrivacyUpdate != null) {
            boardWithUpdatePrivacyUpdate = mapper.readValue(nodeboardWithUpdatePrivacyUpdate.toString(), BoardWithUpdatePrivacyUpdate.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(boardWithUpdatePrivacyUpdate);
            }
        } else {
            throw new IllegalArgumentException("'BoardWithUpdatePrivacyUpdate' parameter is required");
        }
        String valueadAccountId = request.getQueryString("ad_account_id");
        String adAccountId;
        if (valueadAccountId != null) {
            adAccountId = valueadAccountId;
        } else {
            adAccountId = null;
        }
        return imp.boardsUpdateHttp(request, boardId, boardWithUpdatePrivacyUpdate, adAccountId);
    }

}
