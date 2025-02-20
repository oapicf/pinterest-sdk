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

case class CreateAssetInvitesRequestItem (
  /* Unique identifier of an invite. */
  inviteId: String,
  inviteType: InviteType,
  /* An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.  */
  assetIdToPermissions: Map[String, Seq[Permissions]]
) extends ApiModel

object CreateAssetInvitesRequestItemEnums {

}
