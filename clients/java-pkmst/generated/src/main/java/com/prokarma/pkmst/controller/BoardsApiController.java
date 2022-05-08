package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.Board;
import com.prokarma.pkmst.model.BoardSection;
import com.prokarma.pkmst.model.BoardUpdate;
import com.prokarma.pkmst.model.Error;
import com.prokarma.pkmst.model.Paginated;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
/**
 * Api implementation
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2022-05-08T00:31:47.777767Z[Etc/UTC]")
@Controller
public class BoardsApiController implements BoardsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public BoardsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<BoardSection> boardSectionsCreate(@ApiParam(value = "Unique identifier of a board.",required=true ) @PathVariable("board_id") String boardId,
        @ApiParam(value = "Create a board section." ,required=true )   @RequestBody BoardSection boardSection,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardSection>(objectMapper.readValue("", BoardSection.class), HttpStatus.OK);
        }

        return new ResponseEntity<BoardSection>(HttpStatus.OK);
    }

    public ResponseEntity<Void> boardSectionsDelete(@ApiParam(value = "Unique identifier of a board.",required=true ) @PathVariable("board_id") String boardId,
        @ApiParam(value = "Unique identifier of a board section.",required=true ) @PathVariable("section_id") String sectionId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Paginated> boardSectionsList(@ApiParam(value = "Unique identifier of a board.",required=true ) @PathVariable("board_id") String boardId,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Paginated>(HttpStatus.OK);
    }

    public ResponseEntity<Paginated> boardSectionsListPins(@ApiParam(value = "Unique identifier of a board.",required=true ) @PathVariable("board_id") String boardId,
        @ApiParam(value = "Unique identifier of a board section.",required=true ) @PathVariable("section_id") String sectionId,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Paginated>(HttpStatus.OK);
    }

    public ResponseEntity<BoardSection> boardSectionsUpdate(@ApiParam(value = "Unique identifier of a board.",required=true ) @PathVariable("board_id") String boardId,
        @ApiParam(value = "Unique identifier of a board section.",required=true ) @PathVariable("section_id") String sectionId,
        @ApiParam(value = "Update a board section." ,required=true )   @RequestBody BoardSection boardSection,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardSection>(objectMapper.readValue("", BoardSection.class), HttpStatus.OK);
        }

        return new ResponseEntity<BoardSection>(HttpStatus.OK);
    }

    public ResponseEntity<Board> boardsCreate(@ApiParam(value = "Create a board using a single board json object." ,required=true )   @RequestBody Board board,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Board>(objectMapper.readValue("", Board.class), HttpStatus.OK);
        }

        return new ResponseEntity<Board>(HttpStatus.OK);
    }

    public ResponseEntity<Void> boardsDelete(@ApiParam(value = "Unique identifier of a board.",required=true ) @PathVariable("board_id") String boardId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Board> boardsGet(@ApiParam(value = "Unique identifier of a board.",required=true ) @PathVariable("board_id") String boardId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Board>(objectMapper.readValue("", Board.class), HttpStatus.OK);
        }

        return new ResponseEntity<Board>(HttpStatus.OK);
    }

    public ResponseEntity<Paginated> boardsList(@ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @ApiParam(value = "Privacy setting for a board.", allowableValues = "PUBLIC, PROTECTED, SECRET")  @RequestParam(value = "privacy", required = false) String privacy,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Paginated>(HttpStatus.OK);
    }

    public ResponseEntity<Paginated> boardsListPins(@ApiParam(value = "Unique identifier of a board.",required=true ) @PathVariable("board_id") String boardId,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Paginated>(HttpStatus.OK);
    }

    public ResponseEntity<Board> boardsUpdate(@ApiParam(value = "Unique identifier of a board.",required=true ) @PathVariable("board_id") String boardId,
        @ApiParam(value = "Update a board." ,required=true )   @RequestBody BoardUpdate boardUpdate,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Board>(objectMapper.readValue("", Board.class), HttpStatus.OK);
        }

        return new ResponseEntity<Board>(HttpStatus.OK);
    }

}
