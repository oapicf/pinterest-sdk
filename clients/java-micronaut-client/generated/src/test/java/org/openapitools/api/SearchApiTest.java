package org.openapitools.api;

import org.openapitools.model.BoardsList200Response;
import org.openapitools.model.PinsList200Response;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.SearchPartnerPins200Response;
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
 * API tests for SearchApi
 */
@MicronautTest
public class SearchApiTest {

    @Inject
    SearchApi api;

    
    /**
     * Search pins by a given search term
     *
     * **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Get the top 10 Pins by a given search term.
     */
    @Test
    @Disabled("Not Implemented")
    public void searchPartnerPinsTest() {
        // given
        String term = "example";
        String countryCode = "example";
        String bookmark = "example";
        String locale = "example";
        Integer limit = 10;

        // when
        SearchPartnerPins200Response body = api.searchPartnerPins(term, countryCode, bookmark, locale, limit).block();

        // then
        // TODO implement the searchPartnerPinsTest()
    }

    
    /**
     * Search user&#39;s boards
     *
     * Search for boards for the \&quot;operation user_account\&quot;. This includes boards of all board types. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information.
     */
    @Test
    @Disabled("Not Implemented")
    public void searchUserBoardsGetTest() {
        // given
        String adAccountId = "example";
        String query = "example";
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        BoardsList200Response body = api.searchUserBoardsGet(adAccountId, query, bookmark, pageSize).block();

        // then
        // TODO implement the searchUserBoardsGetTest()
    }

    
    /**
     * Search user&#39;s Pins
     *
     * Search for pins for the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information.
     */
    @Test
    @Disabled("Not Implemented")
    public void searchUserPinsListTest() {
        // given
        String query = "example";
        String adAccountId = "example";
        String bookmark = "example";

        // when
        PinsList200Response body = api.searchUserPinsList(query, adAccountId, bookmark).block();

        // then
        // TODO implement the searchUserPinsListTest()
    }

    
}
