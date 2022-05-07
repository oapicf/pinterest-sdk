package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.MediaUpload;
import org.openapitools.model.MediaUploadDetails;
import org.openapitools.model.MediaUploadRequest;
import org.openapitools.model.Paginated;
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
 * API tests for MediaApi
 */
@MicronautTest
public class MediaApiTest {

    @Inject
    MediaApi api;

    
    /**
     * Register media upload
     *
     * Register your intent to upload media  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using &lt;tt&gt;curl&lt;/tt&gt;, for example) to &lt;tt&gt;upload_url&lt;/tt&gt; using the &lt;tt&gt;Content-Type&lt;/tt&gt; header value. Send the media file&#39;s contents as the request&#39;s &lt;tt&gt;file&lt;/tt&gt; parameter and also include all of the parameters from &lt;tt&gt;upload_parameters&lt;/tt&gt;.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/solutions/content-apps/#creatingvideopins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.
     */
    @Test
    public void mediaCreateTest() {
        MediaUploadRequest mediaUploadRequest = null;
        // MediaUpload response = api.mediaCreate(mediaUploadRequest).block();
        // Mono<MediaUpload> asyncResponse = api.mediaCreate(mediaUploadRequest);
        // TODO: test validations
    }

    
    /**
     * Get media upload details
     *
     * Get details for a registered media upload, including its current status.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/solutions/content-apps/#creatingvideopins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.
     */
    @Test
    public void mediaGetTest() {
        String mediaId = null;
        // MediaUploadDetails response = api.mediaGet(mediaId).block();
        // Mono<MediaUploadDetails> asyncResponse = api.mediaGet(mediaId);
        // TODO: test validations
    }

    
    /**
     * List media uploads
     *
     * List media uploads filtered by given parameters.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/solutions/content-apps/#creatingvideopins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.
     */
    @Test
    public void mediaListTest() {
        String bookmark = null;
        Integer pageSize = null;
        // Paginated response = api.mediaList(bookmark, pageSize).block();
        // Mono<Paginated> asyncResponse = api.mediaList(bookmark, pageSize);
        // TODO: test validations
    }

    
}
