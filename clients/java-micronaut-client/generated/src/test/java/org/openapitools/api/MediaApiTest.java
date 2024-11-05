package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.MediaList200Response;
import org.openapitools.model.MediaUpload;
import org.openapitools.model.MediaUploadDetails;
import org.openapitools.model.MediaUploadRequest;
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
     * Register your intent to upload media  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using &lt;tt&gt;curl&lt;/tt&gt;, for example) to &lt;tt&gt;upload_url&lt;/tt&gt; using the &lt;tt&gt;Content-Type&lt;/tt&gt; header value. Send the media file&#39;s contents as the request&#39;s &lt;tt&gt;file&lt;/tt&gt; parameter and also include all of the parameters from &lt;tt&gt;upload_parameters&lt;/tt&gt;.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/api-features/creating-boards-and-pins/#creating-video-pins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.
     */
    @Test
    @Disabled("Not Implemented")
    public void mediaCreateTest() {
        // given
        MediaUploadRequest mediaUploadRequest = new MediaUploadRequest(org.openapitools.model.MediaUploadType.fromValue("video"));

        // when
        MediaUpload body = api.mediaCreate(mediaUploadRequest).block();

        // then
        // TODO implement the mediaCreateTest()
    }

    
    /**
     * Get media upload details
     *
     * Get details for a registered media upload, including its current status.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/api-features/creating-boards-and-pins/#creating-video-pins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.
     */
    @Test
    @Disabled("Not Implemented")
    public void mediaGetTest() {
        // given
        String mediaId = "example";

        // when
        MediaUploadDetails body = api.mediaGet(mediaId).block();

        // then
        // TODO implement the mediaGetTest()
    }

    
    /**
     * List media uploads
     *
     * List media uploads filtered by given parameters.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/api-features/creating-boards-and-pins/#creating-video-pins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.
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
