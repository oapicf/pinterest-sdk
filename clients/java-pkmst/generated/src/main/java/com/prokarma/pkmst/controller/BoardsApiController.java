package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.Board;
import com.prokarma.pkmst.model.BoardCreate;
import com.prokarma.pkmst.model.BoardPrivacyFilter;
import com.prokarma.pkmst.model.BoardSection;
import com.prokarma.pkmst.model.BoardSectionCreate;
import com.prokarma.pkmst.model.BoardSectionUpdateWithRequiredBody;
import com.prokarma.pkmst.model.BoardSectionsList200Response;
import com.prokarma.pkmst.model.BoardWithUpdatePrivacy;
import com.prokarma.pkmst.model.BoardWithUpdatePrivacyUpdate;
import com.prokarma.pkmst.model.BoardsList200Response;
import com.prokarma.pkmst.model.BoardsListPins200Response;
import com.prokarma.pkmst.model.CreativeType;
import java.util.List;
import com.prokarma.pkmst.model.PinterestLibError;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Controller
public class BoardsApiController implements BoardsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public BoardsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<BoardSection> boardSectionsCreate(@ApiParam(value = "Unique identifier of a board.",required=true ) @PathVariable("board_id") String boardId,
        @ApiParam(value = "" ,required=true )   @RequestBody BoardSectionCreate boardSectionCreate,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardSection>(objectMapper.readValue("", BoardSection.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardSection>(objectMapper.readValue("", BoardSection.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardSection>(objectMapper.readValue("", BoardSection.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardSection>(objectMapper.readValue("", BoardSection.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardSection>(objectMapper.readValue("", BoardSection.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardSection>(objectMapper.readValue("", BoardSection.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardSection>(objectMapper.readValue("", BoardSection.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardSection>(objectMapper.readValue("", BoardSection.class), HttpStatus.OK);
        }

        return new ResponseEntity<BoardSection>(HttpStatus.OK);
    }

    public ResponseEntity<BoardSection> boardSectionsDelete(@ApiParam(value = "Unique identifier of a board.",required=true ) @PathVariable("board_id") String boardId,
        @ApiParam(value = "Unique identifier of a board section.",required=true ) @PathVariable("section_id") String sectionId,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardSection>(objectMapper.readValue("", BoardSection.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardSection>(objectMapper.readValue("", BoardSection.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardSection>(objectMapper.readValue("", BoardSection.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardSection>(objectMapper.readValue("", BoardSection.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardSection>(objectMapper.readValue("", BoardSection.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardSection>(objectMapper.readValue("", BoardSection.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardSection>(objectMapper.readValue("", BoardSection.class), HttpStatus.OK);
        }

        return new ResponseEntity<BoardSection>(HttpStatus.OK);
    }

    public ResponseEntity<BoardSectionsList200Response> boardSectionsList(@ApiParam(value = "Unique identifier of a board.",required=true ) @PathVariable("board_id") String boardId,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardSectionsList200Response>(objectMapper.readValue("", BoardSectionsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardSectionsList200Response>(objectMapper.readValue("", BoardSectionsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardSectionsList200Response>(objectMapper.readValue("", BoardSectionsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardSectionsList200Response>(objectMapper.readValue("", BoardSectionsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardSectionsList200Response>(objectMapper.readValue("", BoardSectionsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardSectionsList200Response>(objectMapper.readValue("", BoardSectionsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardSectionsList200Response>(objectMapper.readValue("", BoardSectionsList200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<BoardSectionsList200Response>(HttpStatus.OK);
    }

    public ResponseEntity<BoardsListPins200Response> boardSectionsListPins(@ApiParam(value = "Unique identifier of a board.",required=true ) @PathVariable("board_id") String boardId,
        @ApiParam(value = "Unique identifier of a board section.",required=true ) @PathVariable("section_id") String sectionId,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardsListPins200Response>(objectMapper.readValue("", BoardsListPins200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardsListPins200Response>(objectMapper.readValue("", BoardsListPins200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardsListPins200Response>(objectMapper.readValue("", BoardsListPins200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardsListPins200Response>(objectMapper.readValue("", BoardsListPins200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardsListPins200Response>(objectMapper.readValue("", BoardsListPins200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardsListPins200Response>(objectMapper.readValue("", BoardsListPins200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardsListPins200Response>(objectMapper.readValue("", BoardsListPins200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<BoardsListPins200Response>(HttpStatus.OK);
    }

    public ResponseEntity<BoardSection> boardSectionsUpdate(@ApiParam(value = "Unique identifier of a board.",required=true ) @PathVariable("board_id") String boardId,
        @ApiParam(value = "Unique identifier of a board section.",required=true ) @PathVariable("section_id") String sectionId,
        @ApiParam(value = "" ,required=true )   @RequestBody BoardSectionUpdateWithRequiredBody boardSectionUpdateWithRequiredBody,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardSection>(objectMapper.readValue("", BoardSection.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardSection>(objectMapper.readValue("", BoardSection.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardSection>(objectMapper.readValue("", BoardSection.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardSection>(objectMapper.readValue("", BoardSection.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardSection>(objectMapper.readValue("", BoardSection.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardSection>(objectMapper.readValue("", BoardSection.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardSection>(objectMapper.readValue("", BoardSection.class), HttpStatus.OK);
        }

        return new ResponseEntity<BoardSection>(HttpStatus.OK);
    }

    public ResponseEntity<Board> boardsCreate(@ApiParam(value = "" ,required=true )   @RequestBody BoardCreate boardCreate,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Board>(objectMapper.readValue("", Board.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Board>(objectMapper.readValue("", Board.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Board>(objectMapper.readValue("", Board.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Board>(objectMapper.readValue("", Board.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Board>(objectMapper.readValue("", Board.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Board>(objectMapper.readValue("", Board.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Board>(objectMapper.readValue("", Board.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Board>(objectMapper.readValue("", Board.class), HttpStatus.OK);
        }

        return new ResponseEntity<Board>(HttpStatus.OK);
    }

    public ResponseEntity<Board> boardsDelete(@ApiParam(value = "",required=true ) @PathVariable("board_id") String boardId,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Board>(objectMapper.readValue("", Board.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Board>(objectMapper.readValue("", Board.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Board>(objectMapper.readValue("", Board.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Board>(objectMapper.readValue("", Board.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Board>(objectMapper.readValue("", Board.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Board>(objectMapper.readValue("", Board.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Board>(objectMapper.readValue("", Board.class), HttpStatus.OK);
        }

        return new ResponseEntity<Board>(HttpStatus.OK);
    }

    public ResponseEntity<Board> boardsGet(@ApiParam(value = "",required=true ) @PathVariable("board_id") String boardId,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Board>(objectMapper.readValue("", Board.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Board>(objectMapper.readValue("", Board.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Board>(objectMapper.readValue("", Board.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Board>(objectMapper.readValue("", Board.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Board>(objectMapper.readValue("", Board.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Board>(objectMapper.readValue("", Board.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Board>(objectMapper.readValue("", Board.class), HttpStatus.OK);
        }

        return new ResponseEntity<Board>(HttpStatus.OK);
    }

    public ResponseEntity<BoardsList200Response> boardsList(@ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @ApiParam(value = "The privacy level of the board", allowableValues = "ALL, PUBLIC, PROTECTED, SECRET, PUBLIC_AND_SECRET")  @RequestParam(value = "privacy", required = false) BoardPrivacyFilter privacy,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardsList200Response>(objectMapper.readValue("", BoardsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardsList200Response>(objectMapper.readValue("", BoardsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardsList200Response>(objectMapper.readValue("", BoardsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardsList200Response>(objectMapper.readValue("", BoardsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardsList200Response>(objectMapper.readValue("", BoardsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardsList200Response>(objectMapper.readValue("", BoardsList200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardsList200Response>(objectMapper.readValue("", BoardsList200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<BoardsList200Response>(HttpStatus.OK);
    }

    public ResponseEntity<BoardsListPins200Response> boardsListPins(@ApiParam(value = "Unique identifier of a board.",required=true ) @PathVariable("board_id") String boardId,
        @ApiParam(value = "Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.")  @RequestParam(value = "creative_types", required = false) List<CreativeType> creativeTypes,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @ApiParam(value = "Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.", defaultValue = "false")  @RequestParam(value = "pin_metrics", required = false, defaultValue="false") Boolean pinMetrics,
        @ApiParam(value = "Cursor used to fetch the next page of items")  @RequestParam(value = "bookmark", required = false) String bookmark,
        @ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue = "25")  @RequestParam(value = "page_size", required = false, defaultValue="25") Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardsListPins200Response>(objectMapper.readValue("", BoardsListPins200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardsListPins200Response>(objectMapper.readValue("", BoardsListPins200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardsListPins200Response>(objectMapper.readValue("", BoardsListPins200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardsListPins200Response>(objectMapper.readValue("", BoardsListPins200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardsListPins200Response>(objectMapper.readValue("", BoardsListPins200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardsListPins200Response>(objectMapper.readValue("", BoardsListPins200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardsListPins200Response>(objectMapper.readValue("", BoardsListPins200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<BoardsListPins200Response>(HttpStatus.OK);
    }

    public ResponseEntity<BoardWithUpdatePrivacy> boardsUpdate(@ApiParam(value = "",required=true ) @PathVariable("board_id") String boardId,
        @ApiParam(value = "" ,required=true )   @RequestBody BoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate,
        @ApiParam(value = "Unique identifier of an ad account.")  @RequestParam(value = "ad_account_id", required = false) String adAccountId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardWithUpdatePrivacy>(objectMapper.readValue("", BoardWithUpdatePrivacy.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardWithUpdatePrivacy>(objectMapper.readValue("", BoardWithUpdatePrivacy.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardWithUpdatePrivacy>(objectMapper.readValue("", BoardWithUpdatePrivacy.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardWithUpdatePrivacy>(objectMapper.readValue("", BoardWithUpdatePrivacy.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardWithUpdatePrivacy>(objectMapper.readValue("", BoardWithUpdatePrivacy.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardWithUpdatePrivacy>(objectMapper.readValue("", BoardWithUpdatePrivacy.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<BoardWithUpdatePrivacy>(objectMapper.readValue("", BoardWithUpdatePrivacy.class), HttpStatus.OK);
        }

        return new ResponseEntity<BoardWithUpdatePrivacy>(HttpStatus.OK);
    }

}
