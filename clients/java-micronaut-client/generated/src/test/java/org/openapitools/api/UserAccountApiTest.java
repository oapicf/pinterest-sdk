package org.openapitools.api;

import org.openapitools.model.Account;
import org.openapitools.model.AnalyticsMetricsResponse;
import org.openapitools.model.Error;
import java.time.LocalDate;
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
 * API tests for UserAccountApi
 */
@MicronautTest
public class UserAccountApiTest {

    @Inject
    UserAccountApi api;

    
    /**
     * Get user account analytics
     *
     * Get analytics for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
     */
    @Test
    public void userAccountAnalyticsTest() {
        LocalDate startDate = null;
        LocalDate endDate = null;
        String fromClaimedContent = null;
        String pinFormat = null;
        String appTypes = null;
        List<String> metricTypes = null;
        String splitField = null;
        String adAccountId = null;
        // Map<String, AnalyticsMetricsResponse> response = api.userAccountAnalytics(startDate, endDate, fromClaimedContent, pinFormat, appTypes, metricTypes, splitField, adAccountId).block();
        // Mono<Map<String, AnalyticsMetricsResponse>> asyncResponse = api.userAccountAnalytics(startDate, endDate, fromClaimedContent, pinFormat, appTypes, metricTypes, splitField, adAccountId);
        // TODO: test validations
    }

    
    /**
     * Get user account
     *
     * Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-business-access&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.
     */
    @Test
    public void userAccountGetTest() {
        String adAccountId = null;
        // Account response = api.userAccountGet(adAccountId).block();
        // Mono<Account> asyncResponse = api.userAccountGet(adAccountId);
        // TODO: test validations
    }

    
}
