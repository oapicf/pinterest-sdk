package org.openapitools.server.api.verticle

import org.openapitools.server.api.model.AgeTrendsBucket
import org.openapitools.server.api.model.FeaturedTrend
import org.openapitools.server.api.model.GenderBucket
import org.openapitools.server.api.model.InterestsEnum
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.ProductCategoriesEngagementType
import org.openapitools.server.api.model.ProductCategoryDetailLookbackWindow
import org.openapitools.server.api.model.ProductCategoryDetails
import org.openapitools.server.api.model.ProductCategoryEnum
import org.openapitools.server.api.model.ProductCategoryRegion
import org.openapitools.server.api.model.TrendingProductCategory
import org.openapitools.server.api.model.VerticalProductCategory
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


interface ProductCategoriesApi  {
    fun init(vertx:Vertx,config:JsonObject)
    /* trendsFeaturedTopicsList
     * Get featured topics */
    suspend fun trendsFeaturedTopicsList(region:ProductCategoryRegion?,interest:InterestsEnum?,context:OperationRequest):Response<kotlin.Array<FeaturedTrend>>
    /* trendsProductCategoriesDetailsList
     * Get product category details */
    suspend fun trendsProductCategoriesDetailsList(productCategories:kotlin.Array<ProductCategoryEnum>?,region:ProductCategoryRegion?,lookbackWindow:ProductCategoryDetailLookbackWindow?,engagementType:ProductCategoriesEngagementType?,context:OperationRequest):Response<kotlin.Array<ProductCategoryDetails>>
    /* trendsProductCategoriesTrendingList
     * Get a list of growing Shopping Product Categories */
    suspend fun trendsProductCategoriesTrendingList(region:ProductCategoryRegion?,verticals:kotlin.Array<VerticalProductCategory>?,ages:kotlin.Array<AgeTrendsBucket>?,genders:kotlin.Array<GenderBucket>?,engagementType:ProductCategoriesEngagementType?,context:OperationRequest):Response<kotlin.Array<TrendingProductCategory>>
    companion object {
        const val address = "ProductCategoriesApi-service"
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
            for (m in ProductCategoriesApi::class.java.methods) {
                val methodName = m.name
                val op = operations[methodName]
                if (op != null) {
                    val method = op::class.java.getDeclaredMethod("mountRouteToService",String::class.java,String::class.java)
                    method.isAccessible = true
                    method.invoke(op,address,methodName)
                }
            }
            routerFactory.mountServiceInterface(ProductCategoriesApi::class.java, address)
            return routerFactory
        }
    }
}
