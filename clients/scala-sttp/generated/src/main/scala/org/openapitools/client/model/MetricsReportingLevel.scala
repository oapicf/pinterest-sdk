/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.model


  /**
   * Level of the reporting request
   */

object MetricsReportingLevel extends Enumeration {
    type MetricsReportingLevel = MetricsReportingLevel.Value
    val ADVERTISER = Value("ADVERTISER")
    val ADVERTISERTARGETING = Value("ADVERTISER_TARGETING")
    val CAMPAIGN = Value("CAMPAIGN")
    val CAMPAIGNTARGETING = Value("CAMPAIGN_TARGETING")
    val ADGROUP = Value("AD_GROUP")
    val ADGROUPTARGETING = Value("AD_GROUP_TARGETING")
    val PINPROMOTION = Value("PIN_PROMOTION")
    val PINPROMOTIONTARGETING = Value("PIN_PROMOTION_TARGETING")
    val KEYWORD = Value("KEYWORD")
    val PRODUCTGROUP = Value("PRODUCT_GROUP")
    val PRODUCTGROUPTARGETING = Value("PRODUCT_GROUP_TARGETING")
    val PRODUCTITEM = Value("PRODUCT_ITEM")
}