package org.openapitools.api.interfaces;

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
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public interface BoardsService {

    /**
     * Create board section
     * Create a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     * @param boardId Unique identifier of a board. (required)
     * @param boardSectionCreate  (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return BoardSection
     */
    BoardSection boardSectionsCreate(
        String boardId,
        BoardSectionCreate boardSectionCreate,
        String adAccountId
    );

    /**
     * Delete board section
     * Delete a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     * @param boardId Unique identifier of a board. (required)
     * @param sectionId Unique identifier of a board section. (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return BoardSection
     */
    BoardSection boardSectionsDelete(
        String boardId,
        String sectionId,
        String adAccountId
    );

    /**
     * List board sections
     * Get a list of all board sections from a board owned by the \&quot;operation user_account\&quot; - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     * @param boardId Unique identifier of a board. (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @return BoardSectionsList200Response
     */
    BoardSectionsList200Response boardSectionsList(
        String boardId,
        String adAccountId,
        String bookmark,
        Integer pageSize
    );

    /**
     * List Pins on board section
     * Get a list of the Pins on a board section of a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     * @param boardId Unique identifier of a board. (required)
     * @param sectionId Unique identifier of a board section. (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @return BoardsListPins200Response
     */
    BoardsListPins200Response boardSectionsListPins(
        String boardId,
        String sectionId,
        String adAccountId,
        String bookmark,
        Integer pageSize
    );

    /**
     * Update board section
     * Update a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     * @param boardId Unique identifier of a board. (required)
     * @param sectionId Unique identifier of a board section. (required)
     * @param boardSectionUpdateWithRequiredBody  (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return BoardSection
     */
    BoardSection boardSectionsUpdate(
        String boardId,
        String sectionId,
        BoardSectionUpdateWithRequiredBody boardSectionUpdateWithRequiredBody,
        String adAccountId
    );

    /**
     * Create board
     * Create a board owned by the \&quot;operation user_account\&quot;. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. * By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     * @param boardCreate  (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return Board
     */
    Board boardsCreate(
        BoardCreate boardCreate,
        String adAccountId
    );

    /**
     * Delete board
     * Delete a board owned by the \&quot;operation user_account\&quot;. * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. * By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     * @param boardId  (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return Board
     */
    Board boardsDelete(
        String boardId,
        String adAccountId
    );

    /**
     * Get board
     * Get a board owned by the operation user_account - or a group board that has been shared with this account. * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. * By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     * @param boardId  (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return Board
     */
    Board boardsGet(
        String boardId,
        String adAccountId
    );

    /**
     * List boards
     * Get a list of the boards owned by the \&quot;operation user_account\&quot; + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. * If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.
     *
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @param privacy The privacy level of the board (optional)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @return BoardsList200Response
     */
    BoardsList200Response boardsList(
        String adAccountId,
        BoardPrivacyFilter privacy,
        String bookmark,
        Integer pageSize
    );

    /**
     * List Pins on board
     * Get a list of the Pins on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     * @param boardId Unique identifier of a board. (required)
     * @param creativeTypes Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. (optional)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @param pinMetrics Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional, default to false)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @return BoardsListPins200Response
     */
    BoardsListPins200Response boardsListPins(
        String boardId,
        List<CreativeType> creativeTypes,
        String adAccountId,
        Boolean pinMetrics,
        String bookmark,
        Integer pageSize
    );

    /**
     * Update board
     * Update a board owned by the \&quot;operating user_account\&quot;. * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. * By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     * @param boardId  (required)
     * @param boardWithUpdatePrivacyUpdate  (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return BoardWithUpdatePrivacy
     */
    BoardWithUpdatePrivacy boardsUpdate(
        String boardId,
        BoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate,
        String adAccountId
    );
}
