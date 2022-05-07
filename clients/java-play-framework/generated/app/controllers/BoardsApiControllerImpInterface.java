package controllers;

import apimodels.Board;
import apimodels.BoardSection;
import apimodels.BoardUpdate;
import apimodels.Error;
import apimodels.Paginated;

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

@SuppressWarnings("RedundantThrows")
public abstract class BoardsApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result boardSectionsCreateHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId, BoardSection boardSection) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        BoardSection obj = boardSectionsCreate(request, boardId, boardSection);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BoardSection boardSectionsCreate(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId, BoardSection boardSection) throws Exception;

    public Result boardSectionsDeleteHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId,  @Pattern(regexp="^\\d+$")String sectionId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        boardSectionsDelete(request, boardId, sectionId);
        return ok();

    }

    public abstract void boardSectionsDelete(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId,  @Pattern(regexp="^\\d+$")String sectionId) throws Exception;

    public Result boardSectionsListHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId, String bookmark,  @Min(1) @Max(100)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        Paginated obj = boardSectionsList(request, boardId, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Paginated boardSectionsList(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId, String bookmark,  @Min(1) @Max(100)Integer pageSize) throws Exception;

    public Result boardSectionsListPinsHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId,  @Pattern(regexp="^\\d+$")String sectionId, String bookmark,  @Min(1) @Max(100)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        Paginated obj = boardSectionsListPins(request, boardId, sectionId, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Paginated boardSectionsListPins(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId,  @Pattern(regexp="^\\d+$")String sectionId, String bookmark,  @Min(1) @Max(100)Integer pageSize) throws Exception;

    public Result boardSectionsUpdateHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId,  @Pattern(regexp="^\\d+$")String sectionId, BoardSection boardSection) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        BoardSection obj = boardSectionsUpdate(request, boardId, sectionId, boardSection);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract BoardSection boardSectionsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId,  @Pattern(regexp="^\\d+$")String sectionId, BoardSection boardSection) throws Exception;

    public Result boardsCreateHttp(Http.Request request, Board board) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        Board obj = boardsCreate(request, board);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Board boardsCreate(Http.Request request, Board board) throws Exception;

    public Result boardsDeleteHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        boardsDelete(request, boardId);
        return ok();

    }

    public abstract void boardsDelete(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId) throws Exception;

    public Result boardsGetHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        Board obj = boardsGet(request, boardId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Board boardsGet(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId) throws Exception;

    public Result boardsListHttp(Http.Request request, String bookmark,  @Min(1) @Max(100)Integer pageSize, String privacy) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        Paginated obj = boardsList(request, bookmark, pageSize, privacy);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Paginated boardsList(Http.Request request, String bookmark,  @Min(1) @Max(100)Integer pageSize, String privacy) throws Exception;

    public Result boardsListPinsHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId, String bookmark,  @Min(1) @Max(100)Integer pageSize) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        Paginated obj = boardsListPins(request, boardId, bookmark, pageSize);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Paginated boardsListPins(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId, String bookmark,  @Min(1) @Max(100)Integer pageSize) throws Exception;

    public Result boardsUpdateHttp(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId, BoardUpdate boardUpdate) throws Exception {
        if (!securityAPIUtils.isRequestTokenValid(request, "pinterest_oauth2")) {
            return unauthorized();
        }

        Board obj = boardsUpdate(request, boardId, boardUpdate);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Board boardsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId, BoardUpdate boardUpdate) throws Exception;

}
