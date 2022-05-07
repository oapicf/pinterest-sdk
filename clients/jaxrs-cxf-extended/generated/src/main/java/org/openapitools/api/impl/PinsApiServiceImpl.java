package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.AnalyticsMetricsResponse;
import org.openapitools.model.Error;
import org.joda.time.LocalDate;
import org.openapitools.model.Pin;

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
public class PinsApiServiceImpl implements PinsApi {
    /**
     * Get Pin analytics
     *
     * Get analytics for a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\&quot;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.
     *
     */
    @Override
    public Map<String, AnalyticsMetricsResponse> pinsAnalytics(String pinId, LocalDate startDate, LocalDate endDate, List<String> metricTypes, String appTypes, String splitField, String adAccountId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Create Pin
     *
     * Create a Pin on a board or board section owned by the \&quot;operation user_account\&quot;.  Note: If the current \&quot;operation user_account\&quot; (defined by the access token) has access to another user&#39;s Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account&#39;s permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id&#x3D;12345&amp;...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called &#39;curated content&#39;, please use our &lt;a href&#x3D;&#39;/docs/add-ons/save-button&#39;&gt;Save button&lt;/a&gt; instead. For more tips on creating fresh content for Pinterest, review our &lt;a href&#x3D;&#39;/docs/solutions/content-apps&#39;&gt;Content App Solutions Guide&lt;/a&gt;.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/solutions/content-apps/#creatingvideopins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.
     *
     */
    @Override
    public Pin pinsCreate(Pin pin) {
        // TODO: Implement...
        return null;
    }

    /**
     * Delete Pin
     *
     * Delete a Pins owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     */
    @Override
    public void pinsDelete(String pinId) {
        // TODO: Implement...

    }

    /**
     * Get Pin
     *
     * Get a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
     *
     */
    @Override
    public Pin pinsGet(String pinId, String adAccountId) {
        // TODO: Implement...
        return null;
    }

}
