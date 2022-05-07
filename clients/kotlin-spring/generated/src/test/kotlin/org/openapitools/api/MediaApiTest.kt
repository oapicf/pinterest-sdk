package org.openapitools.api

import org.openapitools.model.Error
import org.openapitools.model.MediaUpload
import org.openapitools.model.MediaUploadDetails
import org.openapitools.model.MediaUploadRequest
import org.openapitools.model.Paginated
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
        val mediaUploadRequest:MediaUploadRequest = TODO()
        val response: ResponseEntity<MediaUpload> = api.mediaCreate(mediaUploadRequest)

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
        val mediaId:kotlin.String = TODO()
        val response: ResponseEntity<MediaUploadDetails> = api.mediaGet(mediaId)

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
        val bookmark:kotlin.String? = TODO()
        val pageSize:kotlin.Int = TODO()
        val response: ResponseEntity<Paginated> = api.mediaList(bookmark, pageSize)

        // TODO: test validations
    }

}
