package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import IntegrationRecord._

case class IntegrationRecord (
  id: Option[String],
externalBusinessId: Option[String],
connectedMerchantId: Option[String],
connectedUserId: Option[String],
connectedAdvertiserId: Option[String],
connectedLbaId: Option[String],
connectedTagId: Option[String],
partnerAccessToken: Option[String],
partnerRefreshToken: Option[String],
partnerPrimaryEmail: Option[String],
partnerAccessTokenExpiry: Option[Integer],
partnerRefreshTokenExpiry: Option[Integer],
scopes: Option[String],
partnerMetadata: Option[String],
additionalId1: Option[String],
createdTime: Option[Integer],
updatedTime: Option[Integer])

object IntegrationRecord {
  import DateTimeCodecs._

  implicit val IntegrationRecordCodecJson: CodecJson[IntegrationRecord] = CodecJson.derive[IntegrationRecord]
  implicit val IntegrationRecordDecoder: EntityDecoder[IntegrationRecord] = jsonOf[IntegrationRecord]
  implicit val IntegrationRecordEncoder: EntityEncoder[IntegrationRecord] = jsonEncoderOf[IntegrationRecord]
}
