package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.CatalogsCreateReportResponse
import org.openapitools.server.api.model.CatalogsReport
import org.openapitools.server.api.model.CatalogsReportParameters
import org.openapitools.server.api.model.CatalogsReportStatsParameters
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.ReportsStats200Response
import io.vertx.core.Vertx
import io.vertx.core.json.JsonObject
import io.vertx.core.json.JsonArray
import com.github.wooyme.openapi.Response
import io.vertx.ext.web.api.OperationRequest
import io.vertx.kotlin.ext.web.api.contract.openapi3.OpenAPI3RouterFactory
import io.vertx.serviceproxy.ServiceBinder
import io.vertx.ext.web.handler.CookieHandler
import io.vertx.ext.web.handler.SessionHandler
import io.vertx.ext.web.sstore.LocalSessionStore
import java.util.List
import java.util.Map


interface CatalogReportsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* reportsCreate
     * Build catalogs report */
    suspend fun reportsCreate(catalogsReportParameters:CatalogsReportParameters?,adAccountId:kotlin.String?,context:OperationRequest):Response<CatalogsCreateReportResponse>
    /* reportsGet
     * Get catalogs report */
    suspend fun reportsGet(token:kotlin.String?,adAccountId:kotlin.String?,context:OperationRequest):Response<CatalogsReport>
    /* reportsStats
     * List report stats */
    suspend fun reportsStats(parameters:CatalogsReportStatsParameters?,adAccountId:kotlin.String?,bookmark:kotlin.String?,pageSize:kotlin.Int?,context:OperationRequest):Response<ReportsStats200Response>
    companion object {
        const val address = "CatalogReportsApi-service"
        suspend fun createRouterFactory(vertx: Vertx,path:String): io.vertx.ext.web.api.contract.openapi3.OpenAPI3RouterFactory {
            val routerFactory = OpenAPI3RouterFactory.createAwait(vertx,path)
            routerFactory.addGlobalHandler(CookieHandler.create())
            routerFactory.addGlobalHandler(SessionHandler.create(LocalSessionStore.create(vertx)))
            routerFactory.setExtraOperationContextPayloadMapper{
                JsonObject().put("files",JsonArray(it.fileUploads().map { it.uploadedFileName() }))
            }
            val opf = routerFactory::class.java.getDeclaredField("operations")
            opf.isAccessible = true
            val operations = opf.get(routerFactory) as Map<String, Any>
            for (m in CatalogReportsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(CatalogReportsApi::class.java, address)
            return routerFactory
        }
    }
}
