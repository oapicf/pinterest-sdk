/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.14.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.apis

import com.google.gson.Gson
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.response.*
import org.openapitools.server.Paths
import io.ktor.server.resources.options
import io.ktor.server.resources.get
import io.ktor.server.resources.post
import io.ktor.server.resources.put
import io.ktor.server.resources.delete
import io.ktor.server.resources.head
import io.ktor.server.resources.patch
import io.ktor.server.routing.*
import org.openapitools.server.infrastructure.ApiPrincipal
import org.openapitools.server.models.AdArrayResponse
import org.openapitools.server.models.AdCreateRequest
import org.openapitools.server.models.AdPreviewRequest
import org.openapitools.server.models.AdPreviewURLResponse
import org.openapitools.server.models.AdResponse
import org.openapitools.server.models.AdUpdateRequest
import org.openapitools.server.models.AdsAnalyticsAdTargetingType
import org.openapitools.server.models.AdsAnalyticsResponseInner
import org.openapitools.server.models.AdsList200Response
import org.openapitools.server.models.ConversionReportAttributionType
import org.openapitools.server.models.Error
import org.openapitools.server.models.Granularity
import org.openapitools.server.models.MetricsResponse

fun Route.AdsApi() {
    val gson = Gson()
    val empty = mutableMapOf<String, Any?>()

    authenticate("pinterest_oauth2") {
    post<Paths.adPreviewsCreate> {
        
        val principal = call.authentication.principal<OAuthAccessTokenResponse>()!!
        
        
        val exampleContentType = "application/json"
            val exampleContentString = """{
              "url" : "https://ads.pinterest.com/ad-preview/58f1a0e9ab0bd0f99462a0e4c5dd7e8297888c8a36331e88f757abe8f0295d31/"
            }"""
            
            when (exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        
    }
    }

    authenticate("pinterest_oauth2") {
    get<Paths.adTargetingAnalyticsGet> {
        
        val principal = call.authentication.principal<OAuthAccessTokenResponse>()!!
        
        
        val exampleContentType = "application/json"
            val exampleContentString = """{
              "data" : [ {
                "targeting_type" : "KEYWORD",
                "targeting_value" : "christmas decor ideas",
                "metrics" : {
                  "AD_GROUP_ID" : 2680067996745,
                  "DATE" : "2022-04-26",
                  "SPEND_IN_DOLLAR" : 240
                }
              }, {
                "targeting_type" : "APPTYPE",
                "targeting_value" : "iphone",
                "metrics" : {
                  "AD_GROUP_ID" : 2680067996745,
                  "DATE" : "2022-04-26",
                  "SPEND_IN_DOLLAR" : 240
                }
              }, {
                "targeting_type" : "APPTYPE",
                "targeting_value" : "ipad",
                "metrics" : {
                  "AD_GROUP_ID" : 2680067996745,
                  "DATE" : "2022-04-26",
                  "SPEND_IN_DOLLAR" : 240
                }
              }, {
                "targeting_type" : "APPTYPE",
                "targeting_value" : "web",
                "metrics" : {
                  "AD_GROUP_ID" : 2680067996745,
                  "DATE" : "2022-04-26",
                  "SPEND_IN_DOLLAR" : 240
                }
              }, {
                "targeting_type" : "APPTYPE",
                "targeting_value" : "web_mobile",
                "metrics" : {
                  "AD_GROUP_ID" : 2680067996745,
                  "DATE" : "2022-04-26",
                  "SPEND_IN_DOLLAR" : 240
                }
              }, {
                "targeting_type" : "APPTYPE",
                "targeting_value" : "android_mobile",
                "metrics" : {
                  "AD_GROUP_ID" : 2680067996745,
                  "DATE" : "2022-04-26",
                  "SPEND_IN_DOLLAR" : 240
                }
              }, {
                "targeting_type" : "APPTYPE",
                "targeting_value" : "android_tablet",
                "metrics" : {
                  "AD_GROUP_ID" : 2680067996745,
                  "DATE" : "2022-04-26",
                  "SPEND_IN_DOLLAR" : 240
                }
              }, {
                "targeting_type" : "GENDER",
                "targeting_value" : "female",
                "metrics" : {
                  "AD_GROUP_ID" : 2680067996745,
                  "DATE" : "2022-04-26",
                  "SPEND_IN_DOLLAR" : 240
                }
              }, {
                "targeting_type" : "LOCATION",
                "targeting_value" : 500,
                "metrics" : {
                  "AD_GROUP_ID" : 2680067996745,
                  "DATE" : "2022-04-26",
                  "SPEND_IN_DOLLAR" : 240
                }
              }, {
                "targeting_type" : "PLACEMENT",
                "targeting_value" : "SEARCH",
                "metrics" : {
                  "AD_GROUP_ID" : 2680067996745,
                  "DATE" : "2022-04-26",
                  "SPEND_IN_DOLLAR" : 240
                }
              }, {
                "targeting_type" : "COUNTRY",
                "targeting_value" : "US",
                "metrics" : {
                  "AD_GROUP_ID" : 2680067996745,
                  "DATE" : "2022-04-26",
                  "SPEND_IN_DOLLAR" : 240
                }
              }, {
                "targeting_type" : "TARGETED_INTEREST",
                "targeting_value" : "Food and Drinks",
                "metrics" : {
                  "AD_GROUP_ID" : 2680067996745,
                  "DATE" : "2022-04-26",
                  "SPEND_IN_DOLLAR" : 240
                }
              }, {
                "targeting_type" : "PINNER_INTEREST",
                "targeting_value" : "Chocolate Cookies",
                "metrics" : {
                  "AD_GROUP_ID" : 2680067996745,
                  "DATE" : "2022-04-26",
                  "SPEND_IN_DOLLAR" : 240
                }
              }, {
                "targeting_type" : "AUDIENCE_INCLUDE",
                "targeting_value" : 254261234567,
                "metrics" : {
                  "AD_GROUP_ID" : 2680067996745,
                  "DATE" : "2022-04-26",
                  "SPEND_IN_DOLLAR" : 240
                }
              }, {
                "targeting_type" : "GEO",
                "targeting_value" : "US:94102",
                "metrics" : {
                  "AD_GROUP_ID" : 2680067996745,
                  "DATE" : "2022-04-26",
                  "SPEND_IN_DOLLAR" : 240
                }
              }, {
                "targeting_type" : "AGE_BUCKET",
                "targeting_value" : "45-49",
                "metrics" : {
                  "AD_GROUP_ID" : 2680067996745,
                  "DATE" : "2022-04-26",
                  "SPEND_IN_DOLLAR" : 240
                }
              }, {
                "targeting_type" : "REGION",
                "targeting_value" : "US-CA",
                "metrics" : {
                  "AD_GROUP_ID" : 2680067996745,
                  "DATE" : "2022-04-26",
                  "SPEND_IN_DOLLAR" : 240
                }
              } ]
            }"""
            
            when (exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        
    }
    }

    authenticate("pinterest_oauth2") {
    get<Paths.adsAnalytics> {
        
        val principal = call.authentication.principal<OAuthAccessTokenResponse>()!!
        
        
        val exampleContentType = "application/json"
            val exampleContentString = """[ {
              "DATE" : "2021-04-01",
              "AD_ID" : "547602124502",
              "SPEND_IN_DOLLAR" : 30,
              "TOTAL_CLICKTHROUGH" : 216
            }, {
              "DATE" : "2021-04-01",
              "AD_ID" : "547602124502",
              "SPEND_IN_DOLLAR" : 30,
              "TOTAL_CLICKTHROUGH" : 216
            } ]"""
            
            when (exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        
    }
    }

    authenticate("pinterest_oauth2") {
    post<Paths.adsCreate> {
        
        val principal = call.authentication.principal<OAuthAccessTokenResponse>()!!
        
        
        val exampleContentType = "application/json"
            val exampleContentString = """{
              "items" : [ {
                "data" : {
                  "is_removable" : false,
                  "updated_time" : 1451431341,
                  "collection_items_destination_url_template" : "collection_items_destination_url_template",
                  "destination_url" : "destination_url",
                  "type" : "pinpromotion",
                  "tracking_urls" : "{}",
                  "ios_deep_link" : "ios_deep_link",
                  "ad_account_id" : "549755885175",
                  "is_pin_deleted" : false,
                  "creative_type" : "REGULAR",
                  "grid_click_type" : "CLOSEUP",
                  "rejection_labels" : [ "rejection_labels", "rejection_labels" ],
                  "id" : "687195134316",
                  "review_status" : "PENDING",
                  "ad_group_id" : "2680059592705",
                  "pin_id" : "394205773611545468",
                  "campaign_id" : "626735565838",
                  "created_time" : 1451431341,
                  "view_tracking_url" : "view_tracking_url",
                  "android_deep_link" : "android_deep_link",
                  "summary_status" : "summary_status",
                  "carousel_android_deep_links" : [ "carousel_android_deep_links", "carousel_android_deep_links" ],
                  "carousel_destination_urls" : [ "carousel_destination_urls", "carousel_destination_urls" ],
                  "carousel_ios_deep_links" : [ "carousel_ios_deep_links", "carousel_ios_deep_links" ],
                  "click_tracking_url" : "click_tracking_url",
                  "quiz_pin_data" : "{}",
                  "name" : "name",
                  "lead_form_id" : "lead_form_id",
                  "customizable_cta_type" : "LEARN_MORE",
                  "rejected_reasons" : [ "HASHTAGS", "HASHTAGS" ],
                  "status" : "ACTIVE"
                },
                "exceptions" : {
                  "code" : 2,
                  "message" : "Advertiser not found."
                }
              }, {
                "data" : {
                  "is_removable" : false,
                  "updated_time" : 1451431341,
                  "collection_items_destination_url_template" : "collection_items_destination_url_template",
                  "destination_url" : "destination_url",
                  "type" : "pinpromotion",
                  "tracking_urls" : "{}",
                  "ios_deep_link" : "ios_deep_link",
                  "ad_account_id" : "549755885175",
                  "is_pin_deleted" : false,
                  "creative_type" : "REGULAR",
                  "grid_click_type" : "CLOSEUP",
                  "rejection_labels" : [ "rejection_labels", "rejection_labels" ],
                  "id" : "687195134316",
                  "review_status" : "PENDING",
                  "ad_group_id" : "2680059592705",
                  "pin_id" : "394205773611545468",
                  "campaign_id" : "626735565838",
                  "created_time" : 1451431341,
                  "view_tracking_url" : "view_tracking_url",
                  "android_deep_link" : "android_deep_link",
                  "summary_status" : "summary_status",
                  "carousel_android_deep_links" : [ "carousel_android_deep_links", "carousel_android_deep_links" ],
                  "carousel_destination_urls" : [ "carousel_destination_urls", "carousel_destination_urls" ],
                  "carousel_ios_deep_links" : [ "carousel_ios_deep_links", "carousel_ios_deep_links" ],
                  "click_tracking_url" : "click_tracking_url",
                  "quiz_pin_data" : "{}",
                  "name" : "name",
                  "lead_form_id" : "lead_form_id",
                  "customizable_cta_type" : "LEARN_MORE",
                  "rejected_reasons" : [ "HASHTAGS", "HASHTAGS" ],
                  "status" : "ACTIVE"
                },
                "exceptions" : {
                  "code" : 2,
                  "message" : "Advertiser not found."
                }
              } ]
            }"""
            
            when (exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        
    }
    }

    authenticate("pinterest_oauth2") {
    get<Paths.adsGet> {
        
        val principal = call.authentication.principal<OAuthAccessTokenResponse>()!!
        
        
        val exampleContentType = "application/json"
            val exampleContentString = """{
              "is_removable" : false,
              "updated_time" : 1451431341,
              "collection_items_destination_url_template" : "collection_items_destination_url_template",
              "destination_url" : "destination_url",
              "type" : "pinpromotion",
              "tracking_urls" : "{}",
              "ios_deep_link" : "ios_deep_link",
              "ad_account_id" : "549755885175",
              "is_pin_deleted" : false,
              "creative_type" : "REGULAR",
              "grid_click_type" : "CLOSEUP",
              "rejection_labels" : [ "rejection_labels", "rejection_labels" ],
              "id" : "687195134316",
              "review_status" : "PENDING",
              "ad_group_id" : "2680059592705",
              "pin_id" : "394205773611545468",
              "campaign_id" : "626735565838",
              "created_time" : 1451431341,
              "view_tracking_url" : "view_tracking_url",
              "android_deep_link" : "android_deep_link",
              "summary_status" : "summary_status",
              "carousel_android_deep_links" : [ "carousel_android_deep_links", "carousel_android_deep_links" ],
              "carousel_destination_urls" : [ "carousel_destination_urls", "carousel_destination_urls" ],
              "carousel_ios_deep_links" : [ "carousel_ios_deep_links", "carousel_ios_deep_links" ],
              "click_tracking_url" : "click_tracking_url",
              "quiz_pin_data" : "{}",
              "name" : "name",
              "lead_form_id" : "lead_form_id",
              "customizable_cta_type" : "LEARN_MORE",
              "rejected_reasons" : [ "HASHTAGS", "HASHTAGS" ],
              "status" : "ACTIVE"
            }"""
            
            when (exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        
    }
    }

    authenticate("pinterest_oauth2") {
    get<Paths.adsList> {
        
        val principal = call.authentication.principal<OAuthAccessTokenResponse>()!!
        
        
        val exampleContentType = "application/json"
            val exampleContentString = """{
              "bookmark" : "bookmark",
              "items" : [ {
                "is_removable" : false,
                "updated_time" : 1451431341,
                "collection_items_destination_url_template" : "collection_items_destination_url_template",
                "destination_url" : "destination_url",
                "type" : "pinpromotion",
                "tracking_urls" : "{}",
                "ios_deep_link" : "ios_deep_link",
                "ad_account_id" : "549755885175",
                "is_pin_deleted" : false,
                "creative_type" : "REGULAR",
                "grid_click_type" : "CLOSEUP",
                "rejection_labels" : [ "rejection_labels", "rejection_labels" ],
                "id" : "687195134316",
                "review_status" : "PENDING",
                "ad_group_id" : "2680059592705",
                "pin_id" : "394205773611545468",
                "campaign_id" : "626735565838",
                "created_time" : 1451431341,
                "view_tracking_url" : "view_tracking_url",
                "android_deep_link" : "android_deep_link",
                "summary_status" : "summary_status",
                "carousel_android_deep_links" : [ "carousel_android_deep_links", "carousel_android_deep_links" ],
                "carousel_destination_urls" : [ "carousel_destination_urls", "carousel_destination_urls" ],
                "carousel_ios_deep_links" : [ "carousel_ios_deep_links", "carousel_ios_deep_links" ],
                "click_tracking_url" : "click_tracking_url",
                "quiz_pin_data" : "{}",
                "name" : "name",
                "lead_form_id" : "lead_form_id",
                "customizable_cta_type" : "LEARN_MORE",
                "rejected_reasons" : [ "HASHTAGS", "HASHTAGS" ],
                "status" : "ACTIVE"
              }, {
                "is_removable" : false,
                "updated_time" : 1451431341,
                "collection_items_destination_url_template" : "collection_items_destination_url_template",
                "destination_url" : "destination_url",
                "type" : "pinpromotion",
                "tracking_urls" : "{}",
                "ios_deep_link" : "ios_deep_link",
                "ad_account_id" : "549755885175",
                "is_pin_deleted" : false,
                "creative_type" : "REGULAR",
                "grid_click_type" : "CLOSEUP",
                "rejection_labels" : [ "rejection_labels", "rejection_labels" ],
                "id" : "687195134316",
                "review_status" : "PENDING",
                "ad_group_id" : "2680059592705",
                "pin_id" : "394205773611545468",
                "campaign_id" : "626735565838",
                "created_time" : 1451431341,
                "view_tracking_url" : "view_tracking_url",
                "android_deep_link" : "android_deep_link",
                "summary_status" : "summary_status",
                "carousel_android_deep_links" : [ "carousel_android_deep_links", "carousel_android_deep_links" ],
                "carousel_destination_urls" : [ "carousel_destination_urls", "carousel_destination_urls" ],
                "carousel_ios_deep_links" : [ "carousel_ios_deep_links", "carousel_ios_deep_links" ],
                "click_tracking_url" : "click_tracking_url",
                "quiz_pin_data" : "{}",
                "name" : "name",
                "lead_form_id" : "lead_form_id",
                "customizable_cta_type" : "LEARN_MORE",
                "rejected_reasons" : [ "HASHTAGS", "HASHTAGS" ],
                "status" : "ACTIVE"
              } ]
            }"""
            
            when (exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        
    }
    }

    authenticate("pinterest_oauth2") {
    patch<Paths.adsUpdate> {
        
        val principal = call.authentication.principal<OAuthAccessTokenResponse>()!!
        
        
        val exampleContentType = "application/json"
            val exampleContentString = """{
              "items" : [ {
                "data" : {
                  "is_removable" : false,
                  "updated_time" : 1451431341,
                  "collection_items_destination_url_template" : "collection_items_destination_url_template",
                  "destination_url" : "destination_url",
                  "type" : "pinpromotion",
                  "tracking_urls" : "{}",
                  "ios_deep_link" : "ios_deep_link",
                  "ad_account_id" : "549755885175",
                  "is_pin_deleted" : false,
                  "creative_type" : "REGULAR",
                  "grid_click_type" : "CLOSEUP",
                  "rejection_labels" : [ "rejection_labels", "rejection_labels" ],
                  "id" : "687195134316",
                  "review_status" : "PENDING",
                  "ad_group_id" : "2680059592705",
                  "pin_id" : "394205773611545468",
                  "campaign_id" : "626735565838",
                  "created_time" : 1451431341,
                  "view_tracking_url" : "view_tracking_url",
                  "android_deep_link" : "android_deep_link",
                  "summary_status" : "summary_status",
                  "carousel_android_deep_links" : [ "carousel_android_deep_links", "carousel_android_deep_links" ],
                  "carousel_destination_urls" : [ "carousel_destination_urls", "carousel_destination_urls" ],
                  "carousel_ios_deep_links" : [ "carousel_ios_deep_links", "carousel_ios_deep_links" ],
                  "click_tracking_url" : "click_tracking_url",
                  "quiz_pin_data" : "{}",
                  "name" : "name",
                  "lead_form_id" : "lead_form_id",
                  "customizable_cta_type" : "LEARN_MORE",
                  "rejected_reasons" : [ "HASHTAGS", "HASHTAGS" ],
                  "status" : "ACTIVE"
                },
                "exceptions" : {
                  "code" : 2,
                  "message" : "Advertiser not found."
                }
              }, {
                "data" : {
                  "is_removable" : false,
                  "updated_time" : 1451431341,
                  "collection_items_destination_url_template" : "collection_items_destination_url_template",
                  "destination_url" : "destination_url",
                  "type" : "pinpromotion",
                  "tracking_urls" : "{}",
                  "ios_deep_link" : "ios_deep_link",
                  "ad_account_id" : "549755885175",
                  "is_pin_deleted" : false,
                  "creative_type" : "REGULAR",
                  "grid_click_type" : "CLOSEUP",
                  "rejection_labels" : [ "rejection_labels", "rejection_labels" ],
                  "id" : "687195134316",
                  "review_status" : "PENDING",
                  "ad_group_id" : "2680059592705",
                  "pin_id" : "394205773611545468",
                  "campaign_id" : "626735565838",
                  "created_time" : 1451431341,
                  "view_tracking_url" : "view_tracking_url",
                  "android_deep_link" : "android_deep_link",
                  "summary_status" : "summary_status",
                  "carousel_android_deep_links" : [ "carousel_android_deep_links", "carousel_android_deep_links" ],
                  "carousel_destination_urls" : [ "carousel_destination_urls", "carousel_destination_urls" ],
                  "carousel_ios_deep_links" : [ "carousel_ios_deep_links", "carousel_ios_deep_links" ],
                  "click_tracking_url" : "click_tracking_url",
                  "quiz_pin_data" : "{}",
                  "name" : "name",
                  "lead_form_id" : "lead_form_id",
                  "customizable_cta_type" : "LEARN_MORE",
                  "rejected_reasons" : [ "HASHTAGS", "HASHTAGS" ],
                  "status" : "ACTIVE"
                },
                "exceptions" : {
                  "code" : 2,
                  "message" : "Advertiser not found."
                }
              } ]
            }"""
            
            when (exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        
    }
    }

}
