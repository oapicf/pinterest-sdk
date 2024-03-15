package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Board;
import org.openapitools.server.api.model.BoardSection;
import org.openapitools.server.api.model.BoardSectionsList200Response;
import org.openapitools.server.api.model.BoardUpdate;
import org.openapitools.server.api.model.BoardsList200Response;
import org.openapitools.server.api.model.BoardsListPins200Response;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;

public final class BoardsApiException extends MainApiException {
    public BoardsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final BoardsApiException Boards_boardSectionsCreate_201_Exception = new BoardsApiException(201, "response");
    public static final BoardsApiException Boards_boardSectionsCreate_400_Exception = new BoardsApiException(400, "Invalid board section parameters.");
    public static final BoardsApiException Boards_boardSectionsCreate_403_Exception = new BoardsApiException(403, "Not authorized to create board sections.");
    public static final BoardsApiException Boards_boardSectionsCreate_409_Exception = new BoardsApiException(409, "Could not get exclusive access to the board to create a new section.");
    public static final BoardsApiException Boards_boardSectionsCreate_500_Exception = new BoardsApiException(500, "Could not create a new board section.");
    public static final BoardsApiException Boards_boardSectionsDelete_204_Exception = new BoardsApiException(204, "Board section deleted successfully");
    public static final BoardsApiException Boards_boardSectionsDelete_403_Exception = new BoardsApiException(403, "Not authorized to delete board section.");
    public static final BoardsApiException Boards_boardSectionsDelete_404_Exception = new BoardsApiException(404, "Board section not found.");
    public static final BoardsApiException Boards_boardSectionsDelete_409_Exception = new BoardsApiException(409, "Board section conflict.");
    public static final BoardsApiException Boards_boardSectionsList_200_Exception = new BoardsApiException(200, "response");
    public static final BoardsApiException Boards_boardSectionsListPins_200_Exception = new BoardsApiException(200, "response");
    public static final BoardsApiException Boards_boardSectionsListPins_403_Exception = new BoardsApiException(403, "Not authorized to access Pins on board section.");
    public static final BoardsApiException Boards_boardSectionsListPins_404_Exception = new BoardsApiException(404, "Board or section not found.");
    public static final BoardsApiException Boards_boardSectionsListPins_409_Exception = new BoardsApiException(409, "Board section conflict.");
    public static final BoardsApiException Boards_boardSectionsUpdate_200_Exception = new BoardsApiException(200, "response");
    public static final BoardsApiException Boards_boardSectionsUpdate_400_Exception = new BoardsApiException(400, "Invalid board section parameters.");
    public static final BoardsApiException Boards_boardSectionsUpdate_403_Exception = new BoardsApiException(403, "Not authorized to update board section.");
    public static final BoardsApiException Boards_boardSectionsUpdate_409_Exception = new BoardsApiException(409, "Board section conflict.");
    public static final BoardsApiException Boards_boardsCreate_201_Exception = new BoardsApiException(201, "response");
    public static final BoardsApiException Boards_boardsCreate_400_Exception = new BoardsApiException(400, "The board name is invalid or duplicated.");
    public static final BoardsApiException Boards_boardsDelete_204_Exception = new BoardsApiException(204, "Board deleted successfully");
    public static final BoardsApiException Boards_boardsDelete_403_Exception = new BoardsApiException(403, "Not authorized to delete the board.");
    public static final BoardsApiException Boards_boardsDelete_404_Exception = new BoardsApiException(404, "Board not found.");
    public static final BoardsApiException Boards_boardsDelete_409_Exception = new BoardsApiException(409, "Could not get exclusive access to delete the board.");
    public static final BoardsApiException Boards_boardsDelete_429_Exception = new BoardsApiException(429, "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.");
    public static final BoardsApiException Boards_boardsGet_200_Exception = new BoardsApiException(200, "response");
    public static final BoardsApiException Boards_boardsGet_404_Exception = new BoardsApiException(404, "Board not found.");
    public static final BoardsApiException Boards_boardsList_200_Exception = new BoardsApiException(200, "response");
    public static final BoardsApiException Boards_boardsListPins_200_Exception = new BoardsApiException(200, "response");
    public static final BoardsApiException Boards_boardsListPins_404_Exception = new BoardsApiException(404, "Board not found.");
    public static final BoardsApiException Boards_boardsUpdate_200_Exception = new BoardsApiException(200, "response");
    public static final BoardsApiException Boards_boardsUpdate_400_Exception = new BoardsApiException(400, "Invalid board parameters.");
    public static final BoardsApiException Boards_boardsUpdate_403_Exception = new BoardsApiException(403, "Not authorized to update the board.");
    public static final BoardsApiException Boards_boardsUpdate_429_Exception = new BoardsApiException(429, "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.");
    

}