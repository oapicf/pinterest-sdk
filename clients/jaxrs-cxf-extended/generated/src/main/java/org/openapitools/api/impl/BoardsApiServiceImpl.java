package org.openapitools.api.impl;

import org.openapitools.api.*;
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

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * Pinterest REST API
 *
 * <p>Pinterest's REST API
 *
 */
public class BoardsApiServiceImpl implements BoardsApi {
    /**
     * Create board section
     *
     * Create a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     */
    @Override
    public BoardSection boardSectionsCreate(String boardId, BoardSectionCreate boardSectionCreate, String adAccountId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Delete board section
     *
     * Delete a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     */
    @Override
    public BoardSection boardSectionsDelete(String boardId, String sectionId, String adAccountId) {
        // TODO: Implement...
        return null;
    }

    /**
     * List board sections
     *
     * Get a list of all board sections from a board owned by the \&quot;operation user_account\&quot; - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     */
    @Override
    public BoardSectionsList200Response boardSectionsList(String boardId, String adAccountId, String bookmark, Integer pageSize) {
        // TODO: Implement...
        return null;
    }

    /**
     * List Pins on board section
     *
     * Get a list of the Pins on a board section of a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     */
    @Override
    public BoardsListPins200Response boardSectionsListPins(String boardId, String sectionId, String adAccountId, String bookmark, Integer pageSize) {
        // TODO: Implement...
        return null;
    }

    /**
     * Update board section
     *
     * Update a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     */
    @Override
    public BoardSection boardSectionsUpdate(String boardId, String sectionId, BoardSectionUpdateWithRequiredBody boardSectionUpdateWithRequiredBody, String adAccountId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Create board
     *
     * Create a board owned by the \&quot;operation user_account\&quot;. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. * By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     */
    @Override
    public Board boardsCreate(BoardCreate boardCreate, String adAccountId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Delete board
     *
     * Delete a board owned by the \&quot;operation user_account\&quot;. * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. * By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     */
    @Override
    public Board boardsDelete(String boardId, String adAccountId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get board
     *
     * Get a board owned by the operation user_account - or a group board that has been shared with this account. * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. * By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     */
    @Override
    public Board boardsGet(String boardId, String adAccountId) {
        // TODO: Implement...
        return null;
    }

    /**
     * List boards
     *
     * Get a list of the boards owned by the \&quot;operation user_account\&quot; + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. * If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.
     *
     */
    @Override
    public BoardsList200Response boardsList(String adAccountId, BoardPrivacyFilter privacy, String bookmark, Integer pageSize) {
        // TODO: Implement...
        return null;
    }

    /**
     * List Pins on board
     *
     * Get a list of the Pins on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     */
    @Override
    public BoardsListPins200Response boardsListPins(String boardId, List<CreativeType> creativeTypes, String adAccountId, Boolean pinMetrics, String bookmark, Integer pageSize) {
        // TODO: Implement...
        return null;
    }

    /**
     * Update board
     *
     * Update a board owned by the \&quot;operating user_account\&quot;. * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. * By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     */
    @Override
    public BoardWithUpdatePrivacy boardsUpdate(String boardId, BoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate, String adAccountId) {
        // TODO: Implement...
        return null;
    }

}
