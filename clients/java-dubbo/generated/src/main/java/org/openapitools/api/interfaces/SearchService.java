package org.openapitools.api.interfaces;

import org.openapitools.model.BoardsList200Response;
import org.openapitools.model.PinsList200Response;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.SearchPartnerPins200Response;
import org.openapitools.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public interface SearchService {

    /**
     * Search pins by a given search term
     * **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Get the top 10 Pins by a given search term.
     *
     * @param term Search term to look up pins. (required)
     * @param countryCode Two letter country code (ISO 3166-1 alpha-2) (required)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param locale Search locale. (optional)
     * @param limit Max search result size (optional, default to 10)
     * @return SearchPartnerPins200Response
     */
    SearchPartnerPins200Response searchPartnerPins(
        String term,
        String countryCode,
        String bookmark,
        String locale,
        Integer limit
    );

    /**
     * Search user&#39;s boards
     * Search for boards for the \&quot;operation user_account\&quot;. This includes boards of all board types. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information.
     *
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @param query Search query. Can contain pin description keywords or comma-separated pin IDs. (optional)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @return BoardsList200Response
     */
    BoardsList200Response searchUserBoardsGet(
        String adAccountId,
        String query,
        String bookmark,
        Integer pageSize
    );

    /**
     * Search user&#39;s Pins
     * Search for pins for the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information.
     *
     * @param query Search query. Can contain pin description keywords or comma-separated pin IDs. (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @return PinsList200Response
     */
    PinsList200Response searchUserPinsList(
        String query,
        String adAccountId,
        String bookmark
    );
}
