package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.Board
import org.openapitools.server.api.model.BoardSection
import org.openapitools.server.api.model.BoardUpdate
import org.openapitools.server.api.model.Error
import org.openapitools.server.api.model.Paginated
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


interface BoardsApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* boardSectionsCreate
     * Create board section */
    suspend fun boardSectionsCreate(boardId:kotlin.String?,boardSection:BoardSection?,context:OperationRequest):Response<BoardSection>
    /* boardSectionsDelete
     * Delete board section */
    suspend fun boardSectionsDelete(boardId:kotlin.String?,sectionId:kotlin.String?,context:OperationRequest):Response<Void>
    /* boardSectionsList
     * List board sections */
    suspend fun boardSectionsList(boardId:kotlin.String?,bookmark:kotlin.String?,pageSize:kotlin.Int?,context:OperationRequest):Response<Paginated>
    /* boardSectionsListPins
     * List Pins on board section */
    suspend fun boardSectionsListPins(boardId:kotlin.String?,sectionId:kotlin.String?,bookmark:kotlin.String?,pageSize:kotlin.Int?,context:OperationRequest):Response<Paginated>
    /* boardSectionsUpdate
     * Update board section */
    suspend fun boardSectionsUpdate(boardId:kotlin.String?,sectionId:kotlin.String?,boardSection:BoardSection?,context:OperationRequest):Response<BoardSection>
    /* boardsCreate
     * Create board */
    suspend fun boardsCreate(board:Board?,context:OperationRequest):Response<Board>
    /* boardsDelete
     * Delete board */
    suspend fun boardsDelete(boardId:kotlin.String?,context:OperationRequest):Response<Void>
    /* boardsGet
     * Get board */
    suspend fun boardsGet(boardId:kotlin.String?,context:OperationRequest):Response<Board>
    /* boardsList
     * List boards */
    suspend fun boardsList(bookmark:kotlin.String?,pageSize:kotlin.Int?,privacy:kotlin.String?,context:OperationRequest):Response<Paginated>
    /* boardsListPins
     * List Pins on board */
    suspend fun boardsListPins(boardId:kotlin.String?,bookmark:kotlin.String?,pageSize:kotlin.Int?,context:OperationRequest):Response<Paginated>
    /* boardsUpdate
     * Update board */
    suspend fun boardsUpdate(boardId:kotlin.String?,boardUpdate:BoardUpdate?,context:OperationRequest):Response<Board>
    companion object {
        const val address = "BoardsApi-service"
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
            for (m in BoardsApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(BoardsApi::class.java, address)
            return routerFactory
        }
    }
}
