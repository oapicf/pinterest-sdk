package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.LeadsExportCreateRequest;
import org.openapitools.model.LeadsExportCreateResponse;
import org.openapitools.model.LeadsExportResponseData;
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
 * API tests for LeadsExportApi
 */
@MicronautTest
public class LeadsExportApiTest {

    @Inject
    LeadsExportApi api;

    
    /**
     * Create a request to export leads collected from a lead ad
     *
     * &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Create an export of leads collected from a lead ad. This returns a lead_export_id  token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.
     */
    @Test
    @Disabled("Not Implemented")
    public void leadsExportCreateTest() {
        // given
        String adAccountId = "example";
        LeadsExportCreateRequest leadsExportCreateRequest = new LeadsExportCreateRequest("2020-12-20", "2020-12-20", "687201361754");

        // when
        LeadsExportCreateResponse body = api.leadsExportCreate(adAccountId, leadsExportCreateRequest).block();

        // then
        // TODO implement the leadsExportCreateTest()
    }

    
    /**
     * Get the lead export from the lead export create call
     *
     * &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.
     */
    @Test
    @Disabled("Not Implemented")
    public void leadsExportGetTest() {
        // given
        String adAccountId = "example";
        String leadsExportId = "123755885175";

        // when
        LeadsExportResponseData body = api.leadsExportGet(adAccountId, leadsExportId).block();

        // then
        // TODO implement the leadsExportGetTest()
    }

    
}
