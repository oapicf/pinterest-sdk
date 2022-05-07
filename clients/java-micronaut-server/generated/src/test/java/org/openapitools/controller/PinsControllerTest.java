package org.openapitools.controller;

import org.openapitools.model.AnalyticsMetricsResponse;
import org.openapitools.model.Error;
import java.time.LocalDate;
import org.openapitools.model.Pin;
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
 * API tests for PinsController
 */
@MicronautTest
public class PinsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client("${context-path}")
    HttpClient client;

    @Inject
    PinsController controller;

    /**
     * This test is used to validate the implementation of pinsAnalytics() method
     *
     * The method should: Get Pin analytics
     *
     * Get analytics for a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\&quot;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void pinsAnalyticsMethodTest() {
        // given
        String pinId = "example";
        LocalDate startDate = LocalDate.of(2001, 2, 3);
        LocalDate endDate = LocalDate.of(2001, 2, 3);
        List<String> metricTypes = Arrays.asList("example");
        String appTypes = "ALL";
        String splitField = "NO_SPLIT";
        String adAccountId = "example";

        // when
        Map<String, AnalyticsMetricsResponse> result = controller.pinsAnalytics(pinId, startDate, endDate, metricTypes, appTypes, splitField, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/pins/{pin_id}/analytics' to the features of pinsAnalytics() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void pinsAnalyticsClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/pins/{pin_id}/analytics").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("pin_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");
        request.getParameters()
            .add("start_date", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("end_date", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
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
     * This test is used to validate the implementation of pinsCreate() method
     *
     * The method should: Create Pin
     *
     * Create a Pin on a board or board section owned by the \&quot;operation user_account\&quot;.  Note: If the current \&quot;operation user_account\&quot; (defined by the access token) has access to another user&#39;s Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account&#39;s permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id&#x3D;12345&amp;...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called &#39;curated content&#39;, please use our &lt;a href&#x3D;&#39;/docs/add-ons/save-button&#39;&gt;Save button&lt;/a&gt; instead. For more tips on creating fresh content for Pinterest, review our &lt;a href&#x3D;&#39;/docs/solutions/content-apps&#39;&gt;Content App Solutions Guide&lt;/a&gt;.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/solutions/content-apps/#creatingvideopins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void pinsCreateMethodTest() {
        // given
        Pin pin = new Pin();

        // when
        Pin result = controller.pinsCreate(pin).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/pins' to the features of pinsCreate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void pinsCreateClientApiTest() throws IOException {
        // given
        Pin body = new Pin();
        String uri = UriTemplate.of("/pins").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .contentType("application/json")
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Pin.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of pinsDelete() method
     *
     * The method should: Delete Pin
     *
     * Delete a Pins owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void pinsDeleteMethodTest() {
        // given
        String pinId = "example";

        // when
        controller.pinsDelete(pinId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/pins/{pin_id}' to the features of pinsDelete() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void pinsDeleteClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/pins/{pin_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("pin_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
            .accept("application/json");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument 

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of pinsGet() method
     *
     * The method should: Get Pin
     *
     * Get a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void pinsGetMethodTest() {
        // given
        String pinId = "example";
        String adAccountId = "example";

        // when
        Pin result = controller.pinsGet(pinId, adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/pins/{pin_id}' to the features of pinsGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void pinsGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/pins/{pin_id}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("pin_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");
        request.getParameters()
            .add("ad_account_id", "example"); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Pin.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
