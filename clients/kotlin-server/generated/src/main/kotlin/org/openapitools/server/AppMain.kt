package org.openapitools.server

import io.ktor.server.application.*
import io.ktor.serialization.gson.*
import io.ktor.http.*
import io.ktor.server.resources.*
import io.ktor.server.plugins.autohead.*
import io.ktor.server.plugins.compression.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.plugins.defaultheaders.*
import io.ktor.server.plugins.hsts.*
import com.codahale.metrics.Slf4jReporter
import io.ktor.server.metrics.dropwizard.*
import java.util.concurrent.TimeUnit
import io.ktor.server.routing.*
import com.typesafe.config.ConfigFactory
import io.ktor.client.HttpClient
import io.ktor.client.engine.apache.Apache
import io.ktor.server.config.HoconApplicationConfig
import io.ktor.server.auth.*
import org.openapitools.server.infrastructure.*
import org.openapitools.server.apis.AdAccountsApi
import org.openapitools.server.apis.AdGroupsApi
import org.openapitools.server.apis.AdsApi
import org.openapitools.server.apis.AdvancedAuctionApi
import org.openapitools.server.apis.AudienceInsightsApi
import org.openapitools.server.apis.AudienceSharingApi
import org.openapitools.server.apis.AudiencesApi
import org.openapitools.server.apis.BillingApi
import org.openapitools.server.apis.BoardsApi
import org.openapitools.server.apis.BulkApi
import org.openapitools.server.apis.BusinessAccessAssetsApi
import org.openapitools.server.apis.BusinessAccessInviteApi
import org.openapitools.server.apis.BusinessAccessRelationshipsApi
import org.openapitools.server.apis.CampaignsApi
import org.openapitools.server.apis.CatalogsApi
import org.openapitools.server.apis.ConversionEventsApi
import org.openapitools.server.apis.ConversionTagsApi
import org.openapitools.server.apis.CustomerListsApi
import org.openapitools.server.apis.IntegrationsApi
import org.openapitools.server.apis.KeywordsApi
import org.openapitools.server.apis.LeadAdsApi
import org.openapitools.server.apis.LeadFormsApi
import org.openapitools.server.apis.LeadsExportApi
import org.openapitools.server.apis.MediaApi
import org.openapitools.server.apis.OauthApi
import org.openapitools.server.apis.OrderLinesApi
import org.openapitools.server.apis.PinsApi
import org.openapitools.server.apis.ProductGroupPromotionsApi
import org.openapitools.server.apis.ResourcesApi
import org.openapitools.server.apis.SearchApi
import org.openapitools.server.apis.TargetingTemplateApi
import org.openapitools.server.apis.TermsApi
import org.openapitools.server.apis.TermsOfServiceApi
import org.openapitools.server.apis.UserAccountApi


internal val settings = HoconApplicationConfig(ConfigFactory.defaultApplication(HTTP::class.java.classLoader))

object HTTP {
    val client = HttpClient(Apache)
}

fun Application.main() {
    install(DefaultHeaders)
    install(DropwizardMetrics) {
        val reporter = Slf4jReporter.forRegistry(registry)
            .outputTo(this@main.log)
            .convertRatesTo(TimeUnit.SECONDS)
            .convertDurationsTo(TimeUnit.MILLISECONDS)
            .build()
        reporter.start(10, TimeUnit.SECONDS)
    }
    install(ContentNegotiation) {
        register(ContentType.Application.Json, GsonConverter())
    }
    install(AutoHeadResponse) // see https://ktor.io/docs/autoheadresponse.html
    install(Compression, ApplicationCompressionConfiguration()) // see https://ktor.io/docs/compression.html
    install(HSTS, ApplicationHstsConfiguration()) // see https://ktor.io/docs/hsts.html
    install(Resources)
    install(Authentication) {
        oauth("pinterest_oauth2") {
            client = HttpClient(Apache)
            providerLookup = { applicationAuthProvider(this@main.environment.config) }
            urlProvider = { _ ->
                // TODO: define a callback url here.
                "/"
            }
        }
        basic("basic") {
        validate { credentials ->
            // TODO: "Apply your basic authentication functionality."
            // Accessible in-method via call.principal<UserIdPrincipal>()
            if (credentials.name == "Swagger" && "Codegen" == credentials.password) {
                UserIdPrincipal(credentials.name)
            } else {
                null
            }
        }
        oauth("client_credentials") {
            client = HttpClient(Apache)
            providerLookup = { applicationAuthProvider(this@main.environment.config) }
            urlProvider = { _ ->
                // TODO: define a callback url here.
                "/"
            }
        }
    }
    install(Routing) {
        AdAccountsApi()
        AdGroupsApi()
        AdsApi()
        AdvancedAuctionApi()
        AudienceInsightsApi()
        AudienceSharingApi()
        AudiencesApi()
        BillingApi()
        BoardsApi()
        BulkApi()
        BusinessAccessAssetsApi()
        BusinessAccessInviteApi()
        BusinessAccessRelationshipsApi()
        CampaignsApi()
        CatalogsApi()
        ConversionEventsApi()
        ConversionTagsApi()
        CustomerListsApi()
        IntegrationsApi()
        KeywordsApi()
        LeadAdsApi()
        LeadFormsApi()
        LeadsExportApi()
        MediaApi()
        OauthApi()
        OrderLinesApi()
        PinsApi()
        ProductGroupPromotionsApi()
        ResourcesApi()
        SearchApi()
        TargetingTemplateApi()
        TermsApi()
        TermsOfServiceApi()
        UserAccountApi()
    }

}
