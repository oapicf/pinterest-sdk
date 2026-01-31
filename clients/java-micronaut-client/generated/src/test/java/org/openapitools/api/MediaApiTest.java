package org.openapitools.api;

import org.openapitools.model.Media;
import org.openapitools.model.MediaList200Response;
import org.openapitools.model.MediaUpload;
import org.openapitools.model.MediaUploadCreate;
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
 * API tests for MediaApi
 */
@MicronautTest
public class MediaApiTest {

    @Inject
    MediaApi api;

    
    /**
     * Register media upload
     *
     * Register your intent to upload media.  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using &#x60;curl&#x60;, for example) to &#x60;upload_url&#x60; using the &#x60;Content-Type&#x60; header value. Send the media file&#39;s contents as the request&#39;s &#x60;file&#x60; parameter and also include all of the parameters from &#x60;upload_parameters&#x60;.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
     */
    @Test
    @Disabled("Not Implemented")
    public void mediaCreateTest() {
        // given
        MediaUploadCreate mediaUploadCreate = new MediaUploadCreate(org.openapitools.model.MediaUploadType.fromValue("video"));

        // when
        MediaUpload body = api.mediaCreate(mediaUploadCreate).block();

        // then
        // TODO implement the mediaCreateTest()
    }

    
    /**
     * Get media upload details
     *
     * Get details for a registered media upload, including its current status.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
     */
    @Test
    @Disabled("Not Implemented")
    public void mediaGetTest() {
        // given
        String mediaId = "example";

        // when
        Media body = api.mediaGet(mediaId).block();

        // then
        // TODO implement the mediaGetTest()
    }

    
    /**
     * List media uploads
     *
     * List media uploads filtered by given parameters.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.
     */
    @Test
    @Disabled("Not Implemented")
    public void mediaListTest() {
        // given
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        MediaList200Response body = api.mediaList(bookmark, pageSize).block();

        // then
        // TODO implement the mediaListTest()
    }

    
}
