package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CustomerListUploadResponse._

case class CustomerListUploadResponse (
  /* Advertiser ID. */
  adAccountId: String,
/* Customer List Upload creation_time. Epoch (seconds). */
  creationTime: Integer,
/* ID of the customer list associated with this upload. */
  customerListId: String,
/* Error counts by error code */
  errorCounts: Option[List[ErrorDetail]],
/* Customer List Upload ID. */
  id: String,
operation: UserListOperationType,
recordCounts: Option[RecordCounts],
/* Workload processing state */
  state: State,
/* Customer List Upload updated_time. Epoch (seconds). */
  updatedTime: Integer)

object CustomerListUploadResponse {
  import DateTimeCodecs._
  sealed trait State
  case object NOTSTARTED extends State
  case object RUNNING extends State
  case object PAUSED extends State
  case object SUCCEEDED extends State
  case object FAILED extends State

  object State {
    def toState(s: String): Option[State] = s match {
      case "NOTSTARTED" => Some(NOTSTARTED)
      case "RUNNING" => Some(RUNNING)
      case "PAUSED" => Some(PAUSED)
      case "SUCCEEDED" => Some(SUCCEEDED)
      case "FAILED" => Some(FAILED)
      case _ => None
    }

    def fromState(x: State): String = x match {
      case NOTSTARTED => "NOTSTARTED"
      case RUNNING => "RUNNING"
      case PAUSED => "PAUSED"
      case SUCCEEDED => "SUCCEEDED"
      case FAILED => "FAILED"
    }
  }

  implicit val StateEnumEncoder: EncodeJson[State] =
    EncodeJson[State](is => StringEncodeJson(State.fromState(is)))

  implicit val StateEnumDecoder: DecodeJson[State] =
    DecodeJson.optionDecoder[State](n => n.string.flatMap(jStr => State.toState(jStr)), "State failed to de-serialize")

  implicit val CustomerListUploadResponseCodecJson: CodecJson[CustomerListUploadResponse] = CodecJson.derive[CustomerListUploadResponse]
  implicit val CustomerListUploadResponseDecoder: EntityDecoder[CustomerListUploadResponse] = jsonOf[CustomerListUploadResponse]
  implicit val CustomerListUploadResponseEncoder: EntityEncoder[CustomerListUploadResponse] = jsonEncoderOf[CustomerListUploadResponse]
}
