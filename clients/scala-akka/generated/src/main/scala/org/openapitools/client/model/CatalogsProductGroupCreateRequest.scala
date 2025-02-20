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

import org.openapitools.client.core.ApiModel

case class CatalogsProductGroupCreateRequest (
  name: String,
  description: Option[String] = None,
  /* boolean indicator of whether the product group is being featured or not */
  isFeatured: Option[Boolean] = None,
  filters: CatalogsProductGroupFiltersRequest,
  /* Catalog Feed id pertaining to the catalog product group. */
  feedId: String
) extends ApiModel

