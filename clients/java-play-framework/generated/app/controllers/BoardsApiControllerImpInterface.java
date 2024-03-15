package controllers;

import apimodels.Board;
import apimodels.BoardSection;
import apimodels.BoardSectionsList200Response;
import apimodels.BoardUpdate;
import apimodels.BoardsList200Response;
import apimodels.BoardsListPins200Response;
import apimodels.Error;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class BoardsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result boardSectionsCreateHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId, BoardSection boardSection,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        BoardSection obj = boardSectionsCreate(request, boardId, boardSection, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BoardSection boardSectionsCreate(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId, BoardSection boardSection,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result boardSectionsDeleteHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId,  @Pattern(regexp="^\\d+$")String sectionId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        boardSectionsDelete(request, boardId, sectionId, adAccountId);
        return ok();

    }

    public abstract void boardSectionsDelete(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId,  @Pattern(regexp="^\\d+$")String sectionId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result boardSectionsListHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        BoardSectionsList200Response obj = boardSectionsList(request, boardId, adAccountId, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BoardSectionsList200Response boardSectionsList(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception;

    public Result boardSectionsListPinsHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId,  @Pattern(regexp="^\\d+$")String sectionId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        BoardsListPins200Response obj = boardSectionsListPins(request, boardId, sectionId, adAccountId, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BoardsListPins200Response boardSectionsListPins(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId,  @Pattern(regexp="^\\d+$")String sectionId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception;

    public Result boardSectionsUpdateHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId,  @Pattern(regexp="^\\d+$")String sectionId, BoardSection boardSection,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        BoardSection obj = boardSectionsUpdate(request, boardId, sectionId, boardSection, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BoardSection boardSectionsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId,  @Pattern(regexp="^\\d+$")String sectionId, BoardSection boardSection,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result boardsCreateHttp(Http.Request request, Board board,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        Board obj = boardsCreate(request, board, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Board boardsCreate(Http.Request request, Board board,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result boardsDeleteHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        boardsDelete(request, boardId, adAccountId);
        return ok();

    }

    public abstract void boardsDelete(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result boardsGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        Board obj = boardsGet(request, boardId, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Board boardsGet(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

    public Result boardsListHttp(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize, String privacy) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        BoardsList200Response obj = boardsList(request, adAccountId, bookmark, pageSize, privacy);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BoardsList200Response boardsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize, String privacy) throws Exception;

    public Result boardsListPinsHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId, String bookmark,  @Min(1) @Max(250)Integer pageSize, List<String> creativeTypes,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, Boolean pinMetrics) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        BoardsListPins200Response obj = boardsListPins(request, boardId, bookmark, pageSize, creativeTypes, adAccountId, pinMetrics);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BoardsListPins200Response boardsListPins(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId, String bookmark,  @Min(1) @Max(250)Integer pageSize, List<String> creativeTypes,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, Boolean pinMetrics) throws Exception;

    public Result boardsUpdateHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId, BoardUpdate boardUpdate,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        Board obj = boardsUpdate(request, boardId, boardUpdate, adAccountId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Board boardsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId, BoardUpdate boardUpdate,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception;

}
