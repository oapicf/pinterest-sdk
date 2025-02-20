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
package org.openapitools.client.model

import java.math.BigDecimal
import org.openapitools.client.core.ApiModel

case class QuizPinResult (
  organicPinId: Option[String] = None,
  androidDeepLink: Option[String] = None,
  iosDeepLink: Option[String] = None,
  destinationUrl: Option[String] = None,
  resultId: Option[BigDecimal] = None
) extends ApiModel

