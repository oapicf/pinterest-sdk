package org.openapitools.server.api;

import org.openapitools.server.model.Board;
import org.openapitools.server.model.BoardCreate;
import org.openapitools.server.model.BoardPrivacyFilter;
import org.openapitools.server.model.BoardSection;
import org.openapitools.server.model.BoardSectionCreate;
import org.openapitools.server.model.BoardSectionUpdateWithRequiredBody;
import org.openapitools.server.model.BoardSectionsList200Response;
import org.openapitools.server.model.BoardWithUpdatePrivacy;
import org.openapitools.server.model.BoardWithUpdatePrivacyUpdate;
import org.openapitools.server.model.BoardsList200Response;
import org.openapitools.server.model.BoardsListPins200Response;
import java.util.stream.Collectors;
import org.openapitools.server.model.CreativeType;
import java.util.HexFormat;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.openapitools.server.model.PinterestLibError;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Boards'",
                             version = "7.24.0")
public interface BoardsService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.post("/{board_id}/sections", this::boardSectionsCreate);
        rules.delete("/{board_id}/sections/{section_id}", this::boardSectionsDelete);
        rules.get("/{board_id}/sections", this::boardSectionsList);
        rules.get("/{board_id}/sections/{section_id}/pins", this::boardSectionsListPins);
        rules.patch("/{board_id}/sections/{section_id}", this::boardSectionsUpdate);
        rules.post("/", this::boardsCreate);
        rules.delete("/{board_id}", this::boardsDelete);
        rules.get("/{board_id}", this::boardsGet);
        rules.get("/", this::boardsList);
        rules.get("/{board_id}/pins", this::boardsListPins);
        rules.patch("/{board_id}", this::boardsUpdate);
    }


    /**
     * POST /boards/{board_id}/sections : Create board section.
     *
     * @param request the server request
     * @param response the server response
     */
    void boardSectionsCreate(ServerRequest request, ServerResponse response);
    /**
     * DELETE /boards/{board_id}/sections/{section_id} : Delete board section.
     *
     * @param request the server request
     * @param response the server response
     */
    void boardSectionsDelete(ServerRequest request, ServerResponse response);
    /**
     * GET /boards/{board_id}/sections : List board sections.
     *
     * @param request the server request
     * @param response the server response
     */
    void boardSectionsList(ServerRequest request, ServerResponse response);
    /**
     * GET /boards/{board_id}/sections/{section_id}/pins : List Pins on board section.
     *
     * @param request the server request
     * @param response the server response
     */
    void boardSectionsListPins(ServerRequest request, ServerResponse response);
    /**
     * PATCH /boards/{board_id}/sections/{section_id} : Update board section.
     *
     * @param request the server request
     * @param response the server response
     */
    void boardSectionsUpdate(ServerRequest request, ServerResponse response);
    /**
     * POST /boards : Create board.
     *
     * @param request the server request
     * @param response the server response
     */
    void boardsCreate(ServerRequest request, ServerResponse response);
    /**
     * DELETE /boards/{board_id} : Delete board.
     *
     * @param request the server request
     * @param response the server response
     */
    void boardsDelete(ServerRequest request, ServerResponse response);
    /**
     * GET /boards/{board_id} : Get board.
     *
     * @param request the server request
     * @param response the server response
     */
    void boardsGet(ServerRequest request, ServerResponse response);
    /**
     * GET /boards : List boards.
     *
     * @param request the server request
     * @param response the server response
     */
    void boardsList(ServerRequest request, ServerResponse response);
    /**
     * GET /boards/{board_id}/pins : List Pins on board.
     *
     * @param request the server request
     * @param response the server response
     */
    void boardsListPins(ServerRequest request, ServerResponse response);
    /**
     * PATCH /boards/{board_id} : Update board.
     *
     * @param request the server request
     * @param response the server response
     */
    void boardsUpdate(ServerRequest request, ServerResponse response);
}
