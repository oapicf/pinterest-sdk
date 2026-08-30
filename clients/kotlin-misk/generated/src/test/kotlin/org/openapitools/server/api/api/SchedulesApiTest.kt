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
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.PinterestLibPaginationOrder
import org.openapitools.server.api.model.Schedule
import org.openapitools.server.api.model.ScheduleBatchUpdate
import org.openapitools.server.api.model.ScheduleCreate
import org.openapitools.server.api.model.ScheduleStatus
import org.openapitools.server.api.model.ScheduleType
import org.openapitools.server.api.model.SchedulesCreate200ResponseInner
import org.openapitools.server.api.model.SchedulesList200Response

@MiskTest(startService = true)
internal class SchedulesApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var schedulesApi: SchedulesApiAction

    /**
     * To test SchedulesApiAction.schedulesCreate
     */
    @Test
    fun `should handle schedulesCreate`() {
        val adAccountId = TODO()
        val scheduleCreate = TODO()
        val response: kotlin.collections.List<SchedulesCreate200ResponseInner> = schedulesApi.schedulesCreate(adAccountId, scheduleCreate)
    }

    /**
     * To test SchedulesApiAction.schedulesList
     */
    @Test
    fun `should handle schedulesList`() {
        val adAccountId = TODO()
        val entityIds = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val order = TODO()
        val scheduleStatuses = TODO()
        val scheduleType = TODO()
        val response: SchedulesList200Response = schedulesApi.schedulesList(adAccountId, entityIds, bookmark, pageSize, order, scheduleStatuses, scheduleType)
    }

    /**
     * To test SchedulesApiAction.schedulesUpdate
     */
    @Test
    fun `should handle schedulesUpdate`() {
        val adAccountId = TODO()
        val scheduleBatchUpdate = TODO()
        val response: kotlin.collections.List<SchedulesCreate200ResponseInner> = schedulesApi.schedulesUpdate(adAccountId, scheduleBatchUpdate)
    }
}
