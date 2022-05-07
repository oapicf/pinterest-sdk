package org.openapitools.api;

import org.openapitools.model.AnalyticsMetricsResponse;
import org.openapitools.model.Error;
import java.time.LocalDate;
import org.openapitools.model.Pin;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for PinsApi
 */
@MicronautTest
public class PinsApiTest {

    @Inject
    PinsApi api;

    
    /**
     * Get Pin analytics
     *
     * Get analytics for a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\&quot;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.
     */
    @Test
    public void pinsAnalyticsTest() {
        String pinId = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        List<String> metricTypes = null;
        String appTypes = null;
        String splitField = null;
        String adAccountId = null;
        // Map<String, AnalyticsMetricsResponse> response = api.pinsAnalytics(pinId, startDate, endDate, metricTypes, appTypes, splitField, adAccountId).block();
        // Mono<Map<String, AnalyticsMetricsResponse>> asyncResponse = api.pinsAnalytics(pinId, startDate, endDate, metricTypes, appTypes, splitField, adAccountId);
        // TODO: test validations
    }

    
    /**
     * Create Pin
     *
     * Create a Pin on a board or board section owned by the \&quot;operation user_account\&quot;.  Note: If the current \&quot;operation user_account\&quot; (defined by the access token) has access to another user&#39;s Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account&#39;s permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id&#x3D;12345&amp;...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called &#39;curated content&#39;, please use our &lt;a href&#x3D;&#39;/docs/add-ons/save-button&#39;&gt;Save button&lt;/a&gt; instead. For more tips on creating fresh content for Pinterest, review our &lt;a href&#x3D;&#39;/docs/solutions/content-apps&#39;&gt;Content App Solutions Guide&lt;/a&gt;.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/solutions/content-apps/#creatingvideopins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.
     */
    @Test
    public void pinsCreateTest() {
        Pin pin = null;
        // Pin response = api.pinsCreate(pin).block();
        // Mono<Pin> asyncResponse = api.pinsCreate(pin);
        // TODO: test validations
    }

    
    /**
     * Delete Pin
     *
     * Delete a Pins owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     */
    @Test
    public void pinsDeleteTest() {
        String pinId = null;
        // api.pinsDelete(pinId).block();
        // Mono<Object> asyncResponse = api.pinsDelete(pinId);
        // TODO: test validations
    }

    
    /**
     * Get Pin
     *
     * Get a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
     */
    @Test
    public void pinsGetTest() {
        String pinId = null;
        String adAccountId = null;
        // Pin response = api.pinsGet(pinId, adAccountId).block();
        // Mono<Pin> asyncResponse = api.pinsGet(pinId, adAccountId);
        // TODO: test validations
    }

    
}
