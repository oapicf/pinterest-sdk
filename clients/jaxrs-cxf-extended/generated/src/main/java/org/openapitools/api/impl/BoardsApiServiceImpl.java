package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.Board;
import org.openapitools.model.BoardSection;
import org.openapitools.model.BoardUpdate;
import org.openapitools.model.Error;
import org.openapitools.model.Paginated;

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
     * Create a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     */
    @Override
    public BoardSection boardSectionsCreate(String boardId, BoardSection boardSection) {
        // TODO: Implement...
        return null;
    }

    /**
     * Delete board section
     *
     * Delete a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     */
    @Override
    public void boardSectionsDelete(String boardId, String sectionId) {
        // TODO: Implement...

    }

    /**
     * List board sections
     *
     * Get a list of all board sections from a board owned by the \&quot;operation user_account\&quot; - or a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     */
    @Override
    public Paginated boardSectionsList(String boardId, String bookmark, Integer pageSize) {
        // TODO: Implement...
        return null;
    }

    /**
     * List Pins on board section
     *
     * Get a list of the Pins on a board section of a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     */
    @Override
    public Paginated boardSectionsListPins(String boardId, String sectionId, String bookmark, Integer pageSize) {
        // TODO: Implement...
        return null;
    }

    /**
     * Update board section
     *
     * Update a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     */
    @Override
    public BoardSection boardSectionsUpdate(String boardId, String sectionId, BoardSection boardSection) {
        // TODO: Implement...
        return null;
    }

    /**
     * Create board
     *
     * Create a board owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     */
    @Override
    public Board boardsCreate(Board board) {
        // TODO: Implement...
        return null;
    }

    /**
     * Delete board
     *
     * Delete a board owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     */
    @Override
    public void boardsDelete(String boardId) {
        // TODO: Implement...

    }

    /**
     * Get board
     *
     * Get a board owned by the operation user_account - or a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     */
    @Override
    public Board boardsGet(String boardId) {
        // TODO: Implement...
        return null;
    }

    /**
     * List boards
     *
     * Get a list of the boards owned by the \&quot;operation user_account\&quot; + group boards where this account is a collaborator  Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.
     *
     */
    @Override
    public Paginated boardsList(String bookmark, Integer pageSize, String privacy) {
        // TODO: Implement...
        return null;
    }

    /**
     * List Pins on board
     *
     * Get a list of the Pins on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     */
    @Override
    public Paginated boardsListPins(String boardId, String bookmark, Integer pageSize) {
        // TODO: Implement...
        return null;
    }

    /**
     * Update board
     *
     * Update a board owned by the \&quot;operating user_account\&quot;.
     *
     */
    @Override
    public Board boardsUpdate(String boardId, BoardUpdate boardUpdate) {
        // TODO: Implement...
        return null;
    }

}
