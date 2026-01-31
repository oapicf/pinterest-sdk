package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import IntegrationRecord._

case class IntegrationRecord (
  additionalId1: Option[String],
connectedAdvertiserId: Option[String],
connectedLbaId: Option[String],
connectedMerchantId: Option[String],
connectedTagId: Option[String],
connectedUserId: Option[String],
createdTime: Option[Integer],
externalBusinessId: Option[String],
id: Option[String],
partnerAccessToken: Option[String],
partnerAccessTokenExpiry: Option[Integer],
partnerMetadata: Option[String],
partnerPrimaryEmail: Option[String],
partnerRefreshToken: Option[String],
partnerRefreshTokenExpiry: Option[Integer],
scopes: Option[String],
updatedTime: Option[Integer])

object IntegrationRecord {
  import DateTimeCodecs._

  implicit val IntegrationRecordCodecJson: CodecJson[IntegrationRecord] = CodecJson.derive[IntegrationRecord]
  implicit val IntegrationRecordDecoder: EntityDecoder[IntegrationRecord] = jsonOf[IntegrationRecord]
  implicit val IntegrationRecordEncoder: EntityEncoder[IntegrationRecord] = jsonEncoderOf[IntegrationRecord]
}
