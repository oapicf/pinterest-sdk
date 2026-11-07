package org.openapitools.api;

import org.openapitools.model.CustomerList;
import org.openapitools.model.CustomerListCreate;
import org.openapitools.model.CustomerListUpdateWithRequiredBody;
import org.openapitools.model.CustomerListsList200Response;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.PinterestLibPaginationOrder;
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
 * API tests for CustomerListsApi
 */
@MicronautTest
public class CustomerListsApiTest {

    @Inject
    CustomerListsApi api;

    
    /**
     * Create customer lists
     *
     * Create a customer list from your records (hashed or plain-text email addresses, or hashed MAIDs or IDFAs).  A customer list is one of the four types of Pinterest audiences: for more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.  **Please review our [requirements](https://help.pinterest.com/en/business/article/audience-targeting#section-13341) for what type of information is allowed when uploading a customer list.**   When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.   To use your customer list after creating it, convert it into a customer list audience by passing the &#x60;CUSTOMER_LIST&#x60; audience type at the [create audience endpoint](https://developer.pinterest.com/docs/api/v5/audiences-create).
     */
    @Test
    @Disabled("Not Implemented")
    public void customerListsCreateTest() {
        // given
        String adAccountId = "example";
        CustomerListCreate customerListCreate = new CustomerListCreate("The Glengarry Glen Ross leads");

        // when
        CustomerList body = api.customerListsCreate(adAccountId, customerListCreate).block();

        // then
        // TODO implement the customerListsCreateTest()
    }

    
    /**
     * Get customer list
     *
     * Gets a specific customer list given the customer list ID.
     */
    @Test
    @Disabled("Not Implemented")
    public void customerListsGetTest() {
        // given
        String adAccountId = "example";
        String customerListId = "example";

        // when
        CustomerList body = api.customerListsGet(adAccountId, customerListId).block();

        // then
        // TODO implement the customerListsGetTest()
    }

    
    /**
     * Get customer lists
     *
     * Get a set of customer lists including id and name based on the filters provided.  (Customer lists are a type of audience.) For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.
     */
    @Test
    @Disabled("Not Implemented")
    public void customerListsListTest() {
        // given
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;
        PinterestLibPaginationOrder order = PinterestLibPaginationOrder.fromValue("ASCENDING");
        Boolean excludeNca = false;

        // when
        CustomerListsList200Response body = api.customerListsList(adAccountId, bookmark, pageSize, order, excludeNca).block();

        // then
        // TODO implement the customerListsListTest()
    }

    
    /**
     * Update customer list
     *
     * Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)  When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your \&quot;CUSTOMER_LIST\&quot; audience. Your original list of records to add will be deleted when the matching process is complete.  For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.
     */
    @Test
    @Disabled("Not Implemented")
    public void customerListsUpdateTest() {
        // given
        String adAccountId = "example";
        String customerListId = "example";
        CustomerListUpdateWithRequiredBody customerListUpdateWithRequiredBody = new CustomerListUpdateWithRequiredBody(org.openapitools.model.UserListOperationType.fromValue("ADD"));

        // when
        CustomerList body = api.customerListsUpdate(adAccountId, customerListId, customerListUpdateWithRequiredBody).block();

        // then
        // TODO implement the customerListsUpdateTest()
    }

    
}
