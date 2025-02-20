/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.api;

import org.openapitools.model.Board;
import org.openapitools.model.BoardSection;
import org.openapitools.model.BoardSectionsList200Response;
import org.openapitools.model.BoardUpdate;
import org.openapitools.model.BoardsList200Response;
import org.openapitools.model.BoardsListPins200Response;
import org.openapitools.model.Error;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/**
 * Pinterest REST API
 *
 * <p>Pinterest's REST API
 *
 * API tests for BoardsApi
 */
public class BoardsApiTest {


    private BoardsApi api;

    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);

        api = JAXRSClientFactory.create("https://api.pinterest.com/v5", BoardsApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);

        ClientConfiguration config = WebClient.getConfig(client);
    }

    
    /**
     * Create board section
     *
     * Create a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void boardSectionsCreateTest() {
        String boardId = null;
        BoardSection boardSection = null;
        String adAccountId = null;
        //BoardSection response = api.boardSectionsCreate(boardId, boardSection, adAccountId);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * Delete board section
     *
     * Delete a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void boardSectionsDeleteTest() {
        String boardId = null;
        String sectionId = null;
        String adAccountId = null;
        //api.boardSectionsDelete(boardId, sectionId, adAccountId);
        
        // TODO: test validations


    }
    
    /**
     * List board sections
     *
     * Get a list of all board sections from a board owned by the \&quot;operation user_account\&quot; - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void boardSectionsListTest() {
        String boardId = null;
        String adAccountId = null;
        String bookmark = null;
        Integer pageSize = null;
        //BoardSectionsList200Response response = api.boardSectionsList(boardId, adAccountId, bookmark, pageSize);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * List Pins on board section
     *
     * Get a list of the Pins on a board section of a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void boardSectionsListPinsTest() {
        String boardId = null;
        String sectionId = null;
        String adAccountId = null;
        String bookmark = null;
        Integer pageSize = null;
        //BoardsListPins200Response response = api.boardSectionsListPins(boardId, sectionId, adAccountId, bookmark, pageSize);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * Update board section
     *
     * Update a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void boardSectionsUpdateTest() {
        String boardId = null;
        String sectionId = null;
        BoardSection boardSection = null;
        String adAccountId = null;
        //BoardSection response = api.boardSectionsUpdate(boardId, sectionId, boardSection, adAccountId);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * Create board
     *
     * Create a board owned by the \&quot;operation user_account\&quot;. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void boardsCreateTest() {
        Board board = null;
        String adAccountId = null;
        //Board response = api.boardsCreate(board, adAccountId);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * Delete board
     *
     * Delete a board owned by the \&quot;operation user_account\&quot;. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void boardsDeleteTest() {
        String boardId = null;
        String adAccountId = null;
        //api.boardsDelete(boardId, adAccountId);
        
        // TODO: test validations


    }
    
    /**
     * Get board
     *
     * Get a board owned by the operation user_account - or a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void boardsGetTest() {
        String boardId = null;
        String adAccountId = null;
        //Board response = api.boardsGet(boardId, adAccountId);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * List boards
     *
     * Get a list of the boards owned by the \&quot;operation user_account\&quot; + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void boardsListTest() {
        String adAccountId = null;
        String bookmark = null;
        Integer pageSize = null;
        String privacy = null;
        //BoardsList200Response response = api.boardsList(adAccountId, bookmark, pageSize, privacy);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * List Pins on board
     *
     * Get a list of the Pins on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void boardsListPinsTest() {
        String boardId = null;
        String bookmark = null;
        Integer pageSize = null;
        List<String> creativeTypes = null;
        String adAccountId = null;
        Boolean pinMetrics = null;
        //BoardsListPins200Response response = api.boardsListPins(boardId, bookmark, pageSize, creativeTypes, adAccountId, pinMetrics);
        //assertNotNull(response);
        // TODO: test validations


    }
    
    /**
     * Update board
     *
     * Update a board owned by the \&quot;operating user_account\&quot;. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void boardsUpdateTest() {
        String boardId = null;
        BoardUpdate boardUpdate = null;
        String adAccountId = null;
        //Board response = api.boardsUpdate(boardId, boardUpdate, adAccountId);
        //assertNotNull(response);
        // TODO: test validations


    }
    
}
