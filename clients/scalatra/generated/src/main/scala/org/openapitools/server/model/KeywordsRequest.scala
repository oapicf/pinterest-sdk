/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 */

package org.openapitools.server.model

case class KeywordsRequest(
  /* Keyword JSON array. Each array element has 3 fields */
  keywords: List[KeywordsCommon],

  /* Keyword parent entity ID (advertiser, campaign, ad group). */
  parentId: String

 )