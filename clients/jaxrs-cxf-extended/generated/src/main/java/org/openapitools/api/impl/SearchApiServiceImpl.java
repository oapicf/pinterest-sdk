package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.BoardsList200Response;
import org.openapitools.model.PinsList200Response;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.SearchPartnerPins200Response;

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
public class SearchApiServiceImpl implements SearchApi {
    /**
     * Search pins by a given search term
     *
     * **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Get the top 10 Pins by a given search term.
     *
     */
    @Override
    public SearchPartnerPins200Response searchPartnerPins(String term, String countryCode, String bookmark, String locale, Integer limit) {
        // TODO: Implement...
        return null;
    }

    /**
     * Search user&#39;s boards
     *
     * Search for boards for the \&quot;operation user_account\&quot;. This includes boards of all board types. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information.
     *
     */
    @Override
    public BoardsList200Response searchUserBoardsGet(String adAccountId, String query, String bookmark, Integer pageSize) {
        // TODO: Implement...
        return null;
    }

    /**
     * Search user&#39;s Pins
     *
     * Search for pins for the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information.
     *
     */
    @Override
    public PinsList200Response searchUserPinsList(String query, String adAccountId, String bookmark) {
        // TODO: Implement...
        return null;
    }

}
