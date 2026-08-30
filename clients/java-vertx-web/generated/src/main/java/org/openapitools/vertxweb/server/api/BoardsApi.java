package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Board;
import org.openapitools.vertxweb.server.model.BoardCreate;
import org.openapitools.vertxweb.server.model.BoardPrivacyFilter;
import org.openapitools.vertxweb.server.model.BoardSection;
import org.openapitools.vertxweb.server.model.BoardSectionCreate;
import org.openapitools.vertxweb.server.model.BoardSectionUpdateWithRequiredBody;
import org.openapitools.vertxweb.server.model.BoardSectionsList200Response;
import org.openapitools.vertxweb.server.model.BoardWithUpdatePrivacy;
import org.openapitools.vertxweb.server.model.BoardWithUpdatePrivacyUpdate;
import org.openapitools.vertxweb.server.model.BoardsList200Response;
import org.openapitools.vertxweb.server.model.BoardsListPins200Response;
import org.openapitools.vertxweb.server.model.CreativeType;
import org.openapitools.vertxweb.server.model.PinterestLibError;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface BoardsApi  {
    Future<ApiResponse<BoardSection>> boardSectionsCreate(String boardId, BoardSectionCreate boardSectionCreate, String adAccountId);
    Future<ApiResponse<BoardSection>> boardSectionsDelete(String boardId, String sectionId, String adAccountId);
    Future<ApiResponse<BoardSectionsList200Response>> boardSectionsList(String boardId, String adAccountId, String bookmark, Integer pageSize);
    Future<ApiResponse<BoardsListPins200Response>> boardSectionsListPins(String boardId, String sectionId, String adAccountId, String bookmark, Integer pageSize);
    Future<ApiResponse<BoardSection>> boardSectionsUpdate(String boardId, String sectionId, BoardSectionUpdateWithRequiredBody boardSectionUpdateWithRequiredBody, String adAccountId);
    Future<ApiResponse<Board>> boardsCreate(BoardCreate boardCreate, String adAccountId);
    Future<ApiResponse<Board>> boardsDelete(String boardId, String adAccountId);
    Future<ApiResponse<Board>> boardsGet(String boardId, String adAccountId);
    Future<ApiResponse<BoardsList200Response>> boardsList(String adAccountId, BoardPrivacyFilter privacy, String bookmark, Integer pageSize);
    Future<ApiResponse<BoardsListPins200Response>> boardsListPins(String boardId, List<CreativeType> creativeTypes, String adAccountId, Boolean pinMetrics, String bookmark, Integer pageSize);
    Future<ApiResponse<BoardWithUpdatePrivacy>> boardsUpdate(String boardId, BoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate, String adAccountId);
}
