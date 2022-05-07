package org.openapitools.api;

import org.openapitools.model.Board;
import org.openapitools.model.BoardSection;
import org.openapitools.model.BoardUpdate;
import org.openapitools.model.Error;
import org.openapitools.model.Paginated;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for BoardsApi
 */
@MicronautTest
public class BoardsApiTest {

    @Inject
    BoardsApi api;

    
    /**
     * Create board section
     *
     * Create a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     */
    @Test
    public void boardSectionsCreateTest() {
        String boardId = null;
        BoardSection boardSection = null;
        // BoardSection response = api.boardSectionsCreate(boardId, boardSection).block();
        // Mono<BoardSection> asyncResponse = api.boardSectionsCreate(boardId, boardSection);
        // TODO: test validations
    }

    
    /**
     * Delete board section
     *
     * Delete a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     */
    @Test
    public void boardSectionsDeleteTest() {
        String boardId = null;
        String sectionId = null;
        // api.boardSectionsDelete(boardId, sectionId).block();
        // Mono<Object> asyncResponse = api.boardSectionsDelete(boardId, sectionId);
        // TODO: test validations
    }

    
    /**
     * List board sections
     *
     * Get a list of all board sections from a board owned by the \&quot;operation user_account\&quot; - or a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     */
    @Test
    public void boardSectionsListTest() {
        String boardId = null;
        String bookmark = null;
        Integer pageSize = null;
        // Paginated response = api.boardSectionsList(boardId, bookmark, pageSize).block();
        // Mono<Paginated> asyncResponse = api.boardSectionsList(boardId, bookmark, pageSize);
        // TODO: test validations
    }

    
    /**
     * List Pins on board section
     *
     * Get a list of the Pins on a board section of a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     */
    @Test
    public void boardSectionsListPinsTest() {
        String boardId = null;
        String sectionId = null;
        String bookmark = null;
        Integer pageSize = null;
        // Paginated response = api.boardSectionsListPins(boardId, sectionId, bookmark, pageSize).block();
        // Mono<Paginated> asyncResponse = api.boardSectionsListPins(boardId, sectionId, bookmark, pageSize);
        // TODO: test validations
    }

    
    /**
     * Update board section
     *
     * Update a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     */
    @Test
    public void boardSectionsUpdateTest() {
        String boardId = null;
        String sectionId = null;
        BoardSection boardSection = null;
        // BoardSection response = api.boardSectionsUpdate(boardId, sectionId, boardSection).block();
        // Mono<BoardSection> asyncResponse = api.boardSectionsUpdate(boardId, sectionId, boardSection);
        // TODO: test validations
    }

    
    /**
     * Create board
     *
     * Create a board owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     */
    @Test
    public void boardsCreateTest() {
        Board board = null;
        // Board response = api.boardsCreate(board).block();
        // Mono<Board> asyncResponse = api.boardsCreate(board);
        // TODO: test validations
    }

    
    /**
     * Delete board
     *
     * Delete a board owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     */
    @Test
    public void boardsDeleteTest() {
        String boardId = null;
        // api.boardsDelete(boardId).block();
        // Mono<Object> asyncResponse = api.boardsDelete(boardId);
        // TODO: test validations
    }

    
    /**
     * Get board
     *
     * Get a board owned by the operation user_account - or a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     */
    @Test
    public void boardsGetTest() {
        String boardId = null;
        // Board response = api.boardsGet(boardId).block();
        // Mono<Board> asyncResponse = api.boardsGet(boardId);
        // TODO: test validations
    }

    
    /**
     * List boards
     *
     * Get a list of the boards owned by the \&quot;operation user_account\&quot; + group boards where this account is a collaborator  Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.
     */
    @Test
    public void boardsListTest() {
        String bookmark = null;
        Integer pageSize = null;
        String privacy = null;
        // Paginated response = api.boardsList(bookmark, pageSize, privacy).block();
        // Mono<Paginated> asyncResponse = api.boardsList(bookmark, pageSize, privacy);
        // TODO: test validations
    }

    
    /**
     * List Pins on board
     *
     * Get a list of the Pins on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     */
    @Test
    public void boardsListPinsTest() {
        String boardId = null;
        String bookmark = null;
        Integer pageSize = null;
        // Paginated response = api.boardsListPins(boardId, bookmark, pageSize).block();
        // Mono<Paginated> asyncResponse = api.boardsListPins(boardId, bookmark, pageSize);
        // TODO: test validations
    }

    
    /**
     * Update board
     *
     * Update a board owned by the \&quot;operating user_account\&quot;.
     */
    @Test
    public void boardsUpdateTest() {
        String boardId = null;
        BoardUpdate boardUpdate = null;
        // Board response = api.boardsUpdate(boardId, boardUpdate).block();
        // Mono<Board> asyncResponse = api.boardsUpdate(boardId, boardUpdate);
        // TODO: test validations
    }

    
}
