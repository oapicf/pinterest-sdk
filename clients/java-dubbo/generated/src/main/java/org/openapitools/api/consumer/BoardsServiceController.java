package org.openapitools.api.consumer;

import org.openapitools.model.Board;
import org.openapitools.model.BoardCreate;
import org.openapitools.model.BoardPrivacyFilter;
import org.openapitools.model.BoardSection;
import org.openapitools.model.BoardSectionCreate;
import org.openapitools.model.BoardSectionUpdateWithRequiredBody;
import org.openapitools.model.BoardSectionsList200Response;
import org.openapitools.model.BoardWithUpdatePrivacy;
import org.openapitools.model.BoardWithUpdatePrivacyUpdate;
import org.openapitools.model.BoardsList200Response;
import org.openapitools.model.BoardsListPins200Response;
import org.openapitools.model.CreativeType;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.*;
import org.openapitools.api.interfaces.BoardsService;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

@RestController
@RequestMapping("/boards")
public class BoardsServiceController {

    @DubboReference
    private BoardsService boardsService;

    @RequestMapping(method = RequestMethod.POST, value = "/{board_id}/sections")
    public BoardSection boardSectionsCreate(
        @RequestParam(name = "boardId") String boardId,
        @RequestParam(name = "boardSectionCreate") BoardSectionCreate boardSectionCreate,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return boardsService.boardSectionsCreate(boardId, boardSectionCreate, adAccountId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{board_id}/sections/{section_id}")
    public BoardSection boardSectionsDelete(
        @RequestParam(name = "boardId") String boardId,
        @RequestParam(name = "sectionId") String sectionId,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return boardsService.boardSectionsDelete(boardId, sectionId, adAccountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{board_id}/sections")
    public BoardSectionsList200Response boardSectionsList(
        @RequestParam(name = "boardId") String boardId,
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return boardsService.boardSectionsList(boardId, adAccountId, bookmark, pageSize);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{board_id}/sections/{section_id}/pins")
    public BoardsListPins200Response boardSectionsListPins(
        @RequestParam(name = "boardId") String boardId,
        @RequestParam(name = "sectionId") String sectionId,
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return boardsService.boardSectionsListPins(boardId, sectionId, adAccountId, bookmark, pageSize);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/{board_id}/sections/{section_id}")
    public BoardSection boardSectionsUpdate(
        @RequestParam(name = "boardId") String boardId,
        @RequestParam(name = "sectionId") String sectionId,
        @RequestParam(name = "boardSectionUpdateWithRequiredBody") BoardSectionUpdateWithRequiredBody boardSectionUpdateWithRequiredBody,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return boardsService.boardSectionsUpdate(boardId, sectionId, boardSectionUpdateWithRequiredBody, adAccountId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/")
    public Board boardsCreate(
        @RequestParam(name = "boardCreate") BoardCreate boardCreate,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return boardsService.boardsCreate(boardCreate, adAccountId);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{board_id}")
    public Board boardsDelete(
        @RequestParam(name = "boardId") String boardId,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return boardsService.boardsDelete(boardId, adAccountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{board_id}")
    public Board boardsGet(
        @RequestParam(name = "boardId") String boardId,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return boardsService.boardsGet(boardId, adAccountId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public BoardsList200Response boardsList(
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "privacy") BoardPrivacyFilter privacy,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return boardsService.boardsList(adAccountId, privacy, bookmark, pageSize);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{board_id}/pins")
    public BoardsListPins200Response boardsListPins(
        @RequestParam(name = "boardId") String boardId,
        @RequestParam(name = "creativeTypes") List<CreativeType> creativeTypes,
        @RequestParam(name = "adAccountId") String adAccountId,
        @RequestParam(name = "pinMetrics", defaultValue = "false") Boolean pinMetrics,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return boardsService.boardsListPins(boardId, creativeTypes, adAccountId, pinMetrics, bookmark, pageSize);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/{board_id}")
    public BoardWithUpdatePrivacy boardsUpdate(
        @RequestParam(name = "boardId") String boardId,
        @RequestParam(name = "boardWithUpdatePrivacyUpdate") BoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate,
        @RequestParam(name = "adAccountId") String adAccountId
    ) {
        return boardsService.boardsUpdate(boardId, boardWithUpdatePrivacyUpdate, adAccountId);
    }
}
