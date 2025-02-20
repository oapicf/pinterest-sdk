/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 */

package org.openapitools.server.model

case class RelatedTerms(
  /* First input term. For example, if you pass \"?terms=clothes,workout\", then id will be \"clothes\" */
  id: Option[String],

  /* Total number of related terms returned */
  relatedTermCount: Option[Int],

  /* The id of the advertiser. */
  relatedTermsList: Option[List[RelatedTermsRelatedTermsListInner]]

 )
