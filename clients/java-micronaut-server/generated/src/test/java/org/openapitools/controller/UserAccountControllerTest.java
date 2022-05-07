package org.openapitools.controller;

import org.openapitools.model.Account;
import org.openapitools.model.AnalyticsMetricsResponse;
import org.openapitools.model.Error;
import java.time.LocalDate;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.uri.UriTemplate;
import io.micronaut.http.cookie.Cookie;
import io.micronaut.http.client.multipart.MultipartBody;
import io.micronaut.core.type.Argument;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for UserAccountController
 */
@MicronautTest
public class UserAccountControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client("${context-path}")
    HttpClient client;

    @Inject
    UserAccountController controller;

    /**
     * This test is used to validate the implementation of userAccountAnalytics() method
     *
     * The method should: Get user account analytics
     *
     * Get analytics for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void userAccountAnalyticsMethodTest() {
        // given
        LocalDate startDate = LocalDate.of(2001, 2, 3);
        LocalDate endDate = LocalDate.of(2001, 2, 3);
        String fromClaimedContent = "BOTH";
        String pinFormat = "ALL";
        String appTypes = "ALL";
        List<String> metricTypes = Arrays.asList("example");
        String splitField = "NO_SPLIT";
        String adAccountId = "example";

        // when
        Map<String, AnalyticsMetricsResponse> result = controller.userAccountAnalytics(startDate, endDate, fromClaimedContent, pinFormat, appTypes, metricTypes, splitField, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/user_account/analytics' to the features of userAccountAnalytics() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void userAccountAnalyticsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/user_account/analytics").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");
        request.getParameters()
            .add("start_date", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("end_date", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("from_claimed_content", "BOTH") // The query parameter format should be 
            .add("pin_format", "ALL") // The query parameter format should be 
            .add("app_types", "ALL") // The query parameter format should be 
            .add("metric_types", String.valueOf(Arrays.asList("example"))) // The query parameter format should be csv
            .add("split_field", "NO_SPLIT") // The query parameter format should be 
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Argument.of(Map.class, String.class, AnalyticsMetricsResponse.class));

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of userAccountGet() method
     *
     * The method should: Get user account
     *
     * Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-business-access&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void userAccountGetMethodTest() {
        // given
        String adAccountId = "example";

        // when
        Account result = controller.userAccountGet(adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/user_account' to the features of userAccountGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void userAccountGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/user_account").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");
        request.getParameters()
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Account.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
