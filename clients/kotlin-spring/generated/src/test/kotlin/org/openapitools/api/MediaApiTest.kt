package org.openapitools.api

import org.openapitools.model.Media
import org.openapitools.model.MediaList200Response
import org.openapitools.model.MediaUpload
import org.openapitools.model.MediaUploadCreate
import org.openapitools.model.PinterestLibError
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class MediaApiTest {

    private val api: MediaApiController = MediaApiController()

    /**
     * To test MediaApiController.mediaCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun mediaCreateTest() {
        val mediaUploadCreate: MediaUploadCreate = TODO()
        
        val response: ResponseEntity<MediaUpload> = api.mediaCreate(mediaUploadCreate)

        // TODO: test validations
    }

    /**
     * To test MediaApiController.mediaGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun mediaGetTest() {
        val mediaId: kotlin.String = TODO()
        
        val response: ResponseEntity<Media> = api.mediaGet(mediaId)

        // TODO: test validations
    }

    /**
     * To test MediaApiController.mediaList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun mediaListTest() {
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        
        val response: ResponseEntity<MediaList200Response> = api.mediaList(bookmark, pageSize)

        // TODO: test validations
    }
}
