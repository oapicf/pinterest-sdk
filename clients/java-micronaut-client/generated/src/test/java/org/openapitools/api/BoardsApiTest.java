package org.openapitools.api;

import org.openapitools.model.Board;
import org.openapitools.model.BoardSection;
import org.openapitools.model.BoardSectionsList200Response;
import org.openapitools.model.BoardUpdate;
import org.openapitools.model.BoardsList200Response;
import org.openapitools.model.BoardsListPins200Response;
import org.openapitools.model.Error;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

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
     * Create a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     */
    @Test
    @Disabled("Not Implemented")
    public void boardSectionsCreateTest() {
        // given
        String boardId = "example";
        BoardSection boardSection = new BoardSection("Salads");
        String adAccountId = "example";

        // when
        BoardSection body = api.boardSectionsCreate(boardId, boardSection, adAccountId).block();

        // then
        // TODO implement the boardSectionsCreateTest()
    }

    
    /**
     * Delete board section
     *
     * Delete a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     */
    @Test
    @Disabled("Not Implemented")
    public void boardSectionsDeleteTest() {
        // given
        String boardId = "example";
        String sectionId = "example";
        String adAccountId = "example";

        // when
        api.boardSectionsDelete(boardId, sectionId, adAccountId).block();

        // then
        // TODO implement the boardSectionsDeleteTest()
    }

    
    /**
     * List board sections
     *
     * Get a list of all board sections from a board owned by the \&quot;operation user_account\&quot; - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     */
    @Test
    @Disabled("Not Implemented")
    public void boardSectionsListTest() {
        // given
        String boardId = "example";
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        BoardSectionsList200Response body = api.boardSectionsList(boardId, adAccountId, bookmark, pageSize).block();

        // then
        // TODO implement the boardSectionsListTest()
    }

    
    /**
     * List Pins on board section
     *
     * Get a list of the Pins on a board section of a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     */
    @Test
    @Disabled("Not Implemented")
    public void boardSectionsListPinsTest() {
        // given
        String boardId = "example";
        String sectionId = "example";
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        BoardsListPins200Response body = api.boardSectionsListPins(boardId, sectionId, adAccountId, bookmark, pageSize).block();

        // then
        // TODO implement the boardSectionsListPinsTest()
    }

    
    /**
     * Update board section
     *
     * Update a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     */
    @Test
    @Disabled("Not Implemented")
    public void boardSectionsUpdateTest() {
        // given
        String boardId = "example";
        String sectionId = "example";
        BoardSection boardSection = new BoardSection("Salads");
        String adAccountId = "example";

        // when
        BoardSection body = api.boardSectionsUpdate(boardId, sectionId, boardSection, adAccountId).block();

        // then
        // TODO implement the boardSectionsUpdateTest()
    }

    
    /**
     * Create board
     *
     * Create a board owned by the \&quot;operation user_account\&quot;. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     */
    @Test
    @Disabled("Not Implemented")
    public void boardsCreateTest() {
        // given
        Board board = new Board("Summer Recipes");
        String adAccountId = "example";

        // when
        Board body = api.boardsCreate(board, adAccountId).block();

        // then
        // TODO implement the boardsCreateTest()
    }

    
    /**
     * Delete board
     *
     * Delete a board owned by the \&quot;operation user_account\&quot;. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     */
    @Test
    @Disabled("Not Implemented")
    public void boardsDeleteTest() {
        // given
        String boardId = "example";
        String adAccountId = "example";

        // when
        api.boardsDelete(boardId, adAccountId).block();

        // then
        // TODO implement the boardsDeleteTest()
    }

    
    /**
     * Get board
     *
     * Get a board owned by the operation user_account - or a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     */
    @Test
    @Disabled("Not Implemented")
    public void boardsGetTest() {
        // given
        String boardId = "example";
        String adAccountId = "example";

        // when
        Board body = api.boardsGet(boardId, adAccountId).block();

        // then
        // TODO implement the boardsGetTest()
    }

    
    /**
     * List boards
     *
     * Get a list of the boards owned by the \&quot;operation user_account\&quot; + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.
     */
    @Test
    @Disabled("Not Implemented")
    public void boardsListTest() {
        // given
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;
        String privacy = "example";

        // when
        BoardsList200Response body = api.boardsList(adAccountId, bookmark, pageSize, privacy).block();

        // then
        // TODO implement the boardsListTest()
    }

    
    /**
     * List Pins on board
     *
     * Get a list of the Pins on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     */
    @Test
    @Disabled("Not Implemented")
    public void boardsListPinsTest() {
        // given
        String boardId = "example";
        String bookmark = "example";
        Integer pageSize = 25;
        List<String> creativeTypes = Arrays.asList("example");
        String adAccountId = "example";
        Boolean pinMetrics = false;

        // when
        BoardsListPins200Response body = api.boardsListPins(boardId, bookmark, pageSize, creativeTypes, adAccountId, pinMetrics).block();

        // then
        // TODO implement the boardsListPinsTest()
    }

    
    /**
     * Update board
     *
     * Update a board owned by the \&quot;operating user_account\&quot;. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     */
    @Test
    @Disabled("Not Implemented")
    public void boardsUpdateTest() {
        // given
        String boardId = "example";
        BoardUpdate boardUpdate = new BoardUpdate();
        String adAccountId = "example";

        // when
        Board body = api.boardsUpdate(boardId, boardUpdate, adAccountId).block();

        // then
        // TODO implement the boardsUpdateTest()
    }

    
}
