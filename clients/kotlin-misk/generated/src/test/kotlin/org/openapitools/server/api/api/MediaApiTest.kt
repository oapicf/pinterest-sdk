package org.openapitools.server.api.api

import misk.testing.MiskTestModule
import jakarta.inject.Inject
import misk.testing.MiskTest
import misk.testing.MiskTestModule
import org.junit.jupiter.api.Test
import misk.web.HttpCall
import misk.web.PathParam
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestHeader
import org.openapitools.server.api.model.Media
import org.openapitools.server.api.model.MediaList200Response
import org.openapitools.server.api.model.MediaUpload
import org.openapitools.server.api.model.MediaUploadCreate
import org.openapitools.server.api.model.PinterestLibError

@MiskTest(startService = true)
internal class MediaApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var mediaApi: MediaApiAction

    /**
     * To test MediaApiAction.mediaCreate
     */
    @Test
    fun `should handle mediaCreate`() {
        val mediaUploadCreate = TODO()
        val response: MediaUpload = mediaApi.mediaCreate(mediaUploadCreate)
    }

    /**
     * To test MediaApiAction.mediaGet
     */
    @Test
    fun `should handle mediaGet`() {
        val mediaId = TODO()
        val response: Media = mediaApi.mediaGet(mediaId)
    }

    /**
     * To test MediaApiAction.mediaList
     */
    @Test
    fun `should handle mediaList`() {
        val bookmark = TODO()
        val pageSize = TODO()
        val response: MediaList200Response = mediaApi.mediaList(bookmark, pageSize)
    }
}
