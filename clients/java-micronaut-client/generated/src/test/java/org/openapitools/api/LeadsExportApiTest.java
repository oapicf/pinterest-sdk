package org.openapitools.api;

import org.openapitools.model.LeadsExportResponseData;
import org.openapitools.model.LeadsExports;
import org.openapitools.model.LeadsExportsCreate;
import org.openapitools.model.PinterestLibError;
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
     * **This feature is currently in beta and not available to all apps. If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Create an export of leads collected from a lead ad. This returns a &#x60;leads_export_id&#x60; token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
     */
    @Test
    @Disabled("Not Implemented")
    public void leadsExportCreateTest() {
        // given
        String adAccountId = "example";
        LeadsExportsCreate leadsExportsCreate = new LeadsExportsCreate("687201361754", "2020-12-20", "2020-12-20");

        // when
        LeadsExports body = api.leadsExportCreate(adAccountId, leadsExportsCreate).block();

        // then
        // TODO implement the leadsExportCreateTest()
    }

    
    /**
     * Get the lead export from the lead export create call
     *
     * **This feature is currently in beta and not available to all apps. If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
     */
    @Test
    @Disabled("Not Implemented")
    public void leadsExportGetTest() {
        // given
        String adAccountId = "example";
        String leadsExportId = "example";

        // when
        LeadsExportResponseData body = api.leadsExportGet(adAccountId, leadsExportId).block();

        // then
        // TODO implement the leadsExportGetTest()
    }

    
}
