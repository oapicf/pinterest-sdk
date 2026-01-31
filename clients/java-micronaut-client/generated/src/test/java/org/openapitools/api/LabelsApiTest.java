package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.LabelCreateRequest;
import org.openapitools.model.LabelUpdateRequest;
import org.openapitools.model.LabelsList200Response;
import org.openapitools.model.LabelsResponse;
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
 * API tests for LabelsApi
 */
@MicronautTest
public class LabelsApiTest {

    @Inject
    LabelsApi api;

    
    /**
     * Create labels
     *
     * &lt;p&gt; &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt; This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   Apply one or more labels to a campaign.   Currently, you can apply brand and custom labels. Future releases will provide more options.    &lt;b&gt;Note:&lt;/b&gt; You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.  &lt;/p&gt;
     */
    @Test
    @Disabled("Not Implemented")
    public void labelsCreateTest() {
        // given
        String adAccountId = "example";
        LabelCreateRequest labelCreateRequest = new LabelCreateRequest(Arrays.asList(), "626753052072");

        // when
        LabelsResponse body = api.labelsCreate(adAccountId, labelCreateRequest).block();

        // then
        // TODO implement the labelsCreateTest()
    }

    
    /**
     * List labels
     *
     * &lt;p&gt;   &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;   This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   See a list of labels for assets that your account owns, and filter the list by different criteria. &lt;/p&gt;
     */
    @Test
    @Disabled("Not Implemented")
    public void labelsListTest() {
        // given
        String adAccountId = "example";
        List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds = Arrays.asList("example");
        List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> labelIds = Arrays.asList("example");
        List<String> entityStatuses = Arrays.asList("example");
        List<String> labelTypes = Arrays.asList("example");
        Integer pageSize = 25;
        String bookmark = "example";

        // when
        LabelsList200Response body = api.labelsList(adAccountId, campaignIds, labelIds, entityStatuses, labelTypes, pageSize, bookmark).block();

        // then
        // TODO implement the labelsListTest()
    }

    
    /**
     * Update labels
     *
     * &lt;p&gt;   &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;   This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   Change the properties of one or more labels. &lt;/p&gt;
     */
    @Test
    @Disabled("Not Implemented")
    public void labelsUpdateTest() {
        // given
        String adAccountId = "example";
        LabelUpdateRequest labelUpdateRequest = new LabelUpdateRequest(Arrays.asList());

        // when
        LabelsResponse body = api.labelsUpdate(adAccountId, labelUpdateRequest).block();

        // then
        // TODO implement the labelsUpdateTest()
    }

    
}
