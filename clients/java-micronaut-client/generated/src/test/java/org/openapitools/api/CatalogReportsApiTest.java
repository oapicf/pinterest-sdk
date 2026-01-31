package org.openapitools.api;

import org.openapitools.model.CatalogsCreateReportResponse;
import org.openapitools.model.CatalogsReport;
import org.openapitools.model.CatalogsReportParameters;
import org.openapitools.model.Error;
import org.openapitools.model.ReportsStats200Response;
import org.openapitools.model.ReportsStatsParametersParameter;
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
 * API tests for CatalogReportsApi
 */
@MicronautTest
public class CatalogReportsApiTest {

    @Inject
    CatalogReportsApi api;

    
    /**
     * Build catalogs report
     *
     * Async request to create a report of the catalog owned by the \&quot;operation user_account\&quot;. This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the All Items report type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     */
    @Test
    @Disabled("Not Implemented")
    public void reportsCreateTest() {
        // given
        CatalogsReportParameters catalogsReportParameters = new CatalogsReportParameters(org.openapitools.model.CatalogsType.fromValue("RETAIL"));
        String adAccountId = "example";

        // when
        CatalogsCreateReportResponse body = api.reportsCreate(catalogsReportParameters, adAccountId).block();

        // then
        // TODO implement the reportsCreateTest()
    }

    
    /**
     * Get catalogs report
     *
     * This returns a URL to a report given a token returned from &lt;a href&#x3D;&#39;/docs/api/v5/#operation/reports/create&#39;&gt;Build catalogs report&lt;/a&gt;. You can use the URL to download the report. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.
     */
    @Test
    @Disabled("Not Implemented")
    public void reportsGetTest() {
        // given
        String token = "example";
        String adAccountId = "example";

        // when
        CatalogsReport body = api.reportsGet(token, adAccountId).block();

        // then
        // TODO implement the reportsGetTest()
    }

    
    /**
     * List report stats
     *
     * List aggregated numbers of issues for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account: Owner, Admin, Catalogs Manager.
     */
    @Test
    @Disabled("Not Implemented")
    public void reportsStatsTest() {
        // given
        ReportsStatsParametersParameter parameters = new ReportsStatsParametersParameter(org.openapitools.model.CatalogsType.fromValue("RETAIL"));
        String adAccountId = "example";
        Integer pageSize = 25;
        String bookmark = "example";

        // when
        ReportsStats200Response body = api.reportsStats(parameters, adAccountId, pageSize, bookmark).block();

        // then
        // TODO implement the reportsStatsTest()
    }

    
}
