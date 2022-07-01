package controllers;

import apimodels.Board;
import apimodels.BoardSection;
import apimodels.BoardUpdate;
import apimodels.Error;
import apimodels.Paginated;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2022-07-01T11:59:57.602846Z[Etc/UTC]")
public class BoardsApiControllerImp extends BoardsApiControllerImpInterface {
    @Override
    public BoardSection boardSectionsCreate(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId, BoardSection boardSection) throws Exception {
        //Do your magic!!!
        return new BoardSection();
    }

    @Override
    public void boardSectionsDelete(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId,  @Pattern(regexp="^\\d+$")String sectionId) throws Exception {
        //Do your magic!!!
    }

    @Override
    public Paginated boardSectionsList(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId, String bookmark,  @Min(1) @Max(100)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new Paginated();
    }

    @Override
    public Paginated boardSectionsListPins(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId,  @Pattern(regexp="^\\d+$")String sectionId, String bookmark,  @Min(1) @Max(100)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new Paginated();
    }

    @Override
    public BoardSection boardSectionsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId,  @Pattern(regexp="^\\d+$")String sectionId, BoardSection boardSection) throws Exception {
        //Do your magic!!!
        return new BoardSection();
    }

    @Override
    public Board boardsCreate(Http.Request request, Board board) throws Exception {
        //Do your magic!!!
        return new Board();
    }

    @Override
    public void boardsDelete(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId) throws Exception {
        //Do your magic!!!
    }

    @Override
    public Board boardsGet(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId) throws Exception {
        //Do your magic!!!
        return new Board();
    }

    @Override
    public Paginated boardsList(Http.Request request, String bookmark,  @Min(1) @Max(100)Integer pageSize, String privacy) throws Exception {
        //Do your magic!!!
        return new Paginated();
    }

    @Override
    public Paginated boardsListPins(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId, String bookmark,  @Min(1) @Max(100)Integer pageSize) throws Exception {
        //Do your magic!!!
        return new Paginated();
    }

    @Override
    public Board boardsUpdate(Http.Request request,  @Pattern(regexp="^\\d+$")String boardId, BoardUpdate boardUpdate) throws Exception {
        //Do your magic!!!
        return new Board();
    }

}
