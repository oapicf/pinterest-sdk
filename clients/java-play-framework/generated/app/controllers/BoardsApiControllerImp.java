package controllers;

import apimodels.Board;
import apimodels.BoardSection;
import apimodels.BoardSectionsList200Response;
import apimodels.BoardUpdate;
import apimodels.BoardsList200Response;
import apimodels.BoardsListPins200Response;
import apimodels.Error;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class BoardsApiControllerImp extends BoardsApiControllerImpInterface {
    @Override
    public BoardSection boardSectionsCreate(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId, BoardSection boardSection,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new BoardSection();
    }

    @Override
    public void boardSectionsDelete(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId,  @Pattern(regexp="^\\d+$")String sectionId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
    }

    @Override
    public BoardSectionsList200Response boardSectionsList(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new BoardSectionsList200Response();
    }

    @Override
    public BoardsListPins200Response boardSectionsListPins(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId,  @Pattern(regexp="^\\d+$")String sectionId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new BoardsListPins200Response();
    }

    @Override
    public BoardSection boardSectionsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId,  @Pattern(regexp="^\\d+$")String sectionId, BoardSection boardSection,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new BoardSection();
    }

    @Override
    public Board boardsCreate(Http.Request request, Board board,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new Board();
    }

    @Override
    public void boardsDelete(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
    }

    @Override
    public Board boardsGet(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new Board();
    }

    @Override
    public BoardsList200Response boardsList(Http.Request request,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, String bookmark,  @Min(1) @Max(250)Integer pageSize, String privacy) throws Exception {
        //Do your magic!!!
        return new BoardsList200Response();
    }

    @Override
    public BoardsListPins200Response boardsListPins(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId, String bookmark,  @Min(1) @Max(250)Integer pageSize, List<String> creativeTypes,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId, Boolean pinMetrics) throws Exception {
        //Do your magic!!!
        return new BoardsListPins200Response();
    }

    @Override
    public Board boardsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId, BoardUpdate boardUpdate,  @Pattern(regexp="^\\d+$") @Size(max=18)String adAccountId) throws Exception {
        //Do your magic!!!
        return new Board();
    }

}
