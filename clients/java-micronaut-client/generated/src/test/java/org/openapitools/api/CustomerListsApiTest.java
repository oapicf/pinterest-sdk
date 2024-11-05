package org.openapitools.api;

import org.openapitools.model.CustomerList;
import org.openapitools.model.CustomerListRequest;
import org.openapitools.model.CustomerListUpdateRequest;
import org.openapitools.model.CustomerListsList200Response;
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
 * API tests for CustomerListsApi
 */
@MicronautTest
public class CustomerListsApiTest {

    @Inject
    CustomerListsApi api;

    
    /**
     * Create customer lists
     *
     * &lt;p&gt;Create a customer list from your records(hashed or plain-text email addresses, or hashed MAIDs or IDFAs).&lt;/p&gt; &lt;p&gt;A customer list is one of the four types of Pinterest audiences: for more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt; or the &lt;a href&#x3D;\&quot;/docs/api-features/targeting-overview/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audiences&lt;/a&gt; section of the ads management guide.&lt;p/&gt;  &lt;p&gt;&lt;b&gt;Please review our &lt;u&gt;&lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting#section-13341\&quot; target&#x3D;\&quot;_blank\&quot;&gt;requirements&lt;/a&gt;&lt;/u&gt; for what type of information is allowed when uploading a customer list.&lt;/b&gt;&lt;/p&gt; &lt;p&gt;When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.&lt;/p&gt; &lt;p&gt;Note that once you have created your customer list, you must convert it into an audience (of the “ CUSTOMER_LIST” type) using the &lt;a href&#x3D;\&quot;#operation/create_audience_handler\&quot;&gt;create audience endpoint&lt;/a&gt; before it can be used.&lt;/p&gt;
     */
    @Test
    @Disabled("Not Implemented")
    public void customerListsCreateTest() {
        // given
        String adAccountId = "example";
        CustomerListRequest customerListRequest = new CustomerListRequest("The Glengarry Glen Ross leads", "email1@pinterest.com,email2@pinterest.com,..<more records>");

        // when
        CustomerList body = api.customerListsCreate(adAccountId, customerListRequest).block();

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
     * &lt;p&gt;Get a set of customer lists including id and name based on the filters provided.&lt;/p&gt; &lt;p&gt;(Customer lists are a type of audience.) For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt;  or the &lt;a href&#x3D;\&quot;/docs/api-features/targeting-overview/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audiences&lt;/a&gt; section of the ads management guide.&lt;/p&gt;
     */
    @Test
    @Disabled("Not Implemented")
    public void customerListsListTest() {
        // given
        String adAccountId = "example";
        Integer pageSize = 25;
        String order = "ASCENDING";
        String bookmark = "example";

        // when
        CustomerListsList200Response body = api.customerListsList(adAccountId, pageSize, order, bookmark).block();

        // then
        // TODO implement the customerListsListTest()
    }

    
    /**
     * Update customer list
     *
     * &lt;p&gt;Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)&lt;/p&gt; &lt;p&gt;When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your “CUSTOMER_LIST” audience. Your original list of records  to add will be deleted when the matching process is complete.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt; or the &lt;a href&#x3D;\&quot;/docs/api-features/targeting-overview/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audiences&lt;/a&gt; section of the ads management guide.&lt;/p&gt;
     */
    @Test
    @Disabled("Not Implemented")
    public void customerListsUpdateTest() {
        // given
        String adAccountId = "example";
        String customerListId = "example";
        CustomerListUpdateRequest customerListUpdateRequest = new CustomerListUpdateRequest("email2@pinterest.com,email6@pinterest.com,", org.openapitools.model.UserListOperationType.fromValue("ADD"));

        // when
        CustomerList body = api.customerListsUpdate(adAccountId, customerListId, customerListUpdateRequest).block();

        // then
        // TODO implement the customerListsUpdateTest()
    }

    
}
