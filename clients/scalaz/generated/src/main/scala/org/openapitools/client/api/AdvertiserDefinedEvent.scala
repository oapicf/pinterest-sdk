package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdvertiserDefinedEvent._

case class AdvertiserDefinedEvent (
  /* raw string name of the event, usually logged as raw_event_name in our dataset */
  name: Option[String],
/* standard type mapped to ADE for optimization */
  mappedConversionType: Option[MappedConversionType])

object AdvertiserDefinedEvent {
  import DateTimeCodecs._
  sealed trait MappedConversionType
  case object PAGELOAD extends MappedConversionType
  case object UNKNOWN extends MappedConversionType
  case object INITIALIZED extends MappedConversionType
  case object PAGEVISIT extends MappedConversionType
  case object SIGNUP extends MappedConversionType
  case object CHECKOUT extends MappedConversionType
  case object CUSTOM extends MappedConversionType
  case object VIEWCATEGORY extends MappedConversionType
  case object SEARCH extends MappedConversionType
  case object ADDTOCART extends MappedConversionType
  case object WATCHVIDEO extends MappedConversionType
  case object LEAD extends MappedConversionType
  case object APPINSTALL extends MappedConversionType
  case object WEBSESSION extends MappedConversionType
  case object EXTERNALMEASUREMENT extends MappedConversionType
  case object ADDPAYMENTINFO extends MappedConversionType
  case object ADDTOWISHLIST extends MappedConversionType
  case object INITIATECHECKOUT extends MappedConversionType
  case object SUBSCRIBE extends MappedConversionType
  case object VIEWCONTENT extends MappedConversionType
  case object ADVERTISERDEFINEDEVENT extends MappedConversionType
  case object APPOPEN extends MappedConversionType
  case object CONTACT extends MappedConversionType
  case object SCHEDULE extends MappedConversionType
  case object FINDLOCATION extends MappedConversionType
  case object CUSTOMIZEPRODUCT extends MappedConversionType
  case object SUBMITAPPLICATION extends MappedConversionType
  case object STARTTRIAL extends MappedConversionType

  object MappedConversionType {
    def toMappedConversionType(s: String): Option[MappedConversionType] = s match {
      case "PAGELOAD" => Some(PAGELOAD)
      case "UNKNOWN" => Some(UNKNOWN)
      case "INITIALIZED" => Some(INITIALIZED)
      case "PAGEVISIT" => Some(PAGEVISIT)
      case "SIGNUP" => Some(SIGNUP)
      case "CHECKOUT" => Some(CHECKOUT)
      case "CUSTOM" => Some(CUSTOM)
      case "VIEWCATEGORY" => Some(VIEWCATEGORY)
      case "SEARCH" => Some(SEARCH)
      case "ADDTOCART" => Some(ADDTOCART)
      case "WATCHVIDEO" => Some(WATCHVIDEO)
      case "LEAD" => Some(LEAD)
      case "APPINSTALL" => Some(APPINSTALL)
      case "WEBSESSION" => Some(WEBSESSION)
      case "EXTERNALMEASUREMENT" => Some(EXTERNALMEASUREMENT)
      case "ADDPAYMENTINFO" => Some(ADDPAYMENTINFO)
      case "ADDTOWISHLIST" => Some(ADDTOWISHLIST)
      case "INITIATECHECKOUT" => Some(INITIATECHECKOUT)
      case "SUBSCRIBE" => Some(SUBSCRIBE)
      case "VIEWCONTENT" => Some(VIEWCONTENT)
      case "ADVERTISERDEFINEDEVENT" => Some(ADVERTISERDEFINEDEVENT)
      case "APPOPEN" => Some(APPOPEN)
      case "CONTACT" => Some(CONTACT)
      case "SCHEDULE" => Some(SCHEDULE)
      case "FINDLOCATION" => Some(FINDLOCATION)
      case "CUSTOMIZEPRODUCT" => Some(CUSTOMIZEPRODUCT)
      case "SUBMITAPPLICATION" => Some(SUBMITAPPLICATION)
      case "STARTTRIAL" => Some(STARTTRIAL)
      case _ => None
    }

    def fromMappedConversionType(x: MappedConversionType): String = x match {
      case PAGELOAD => "PAGELOAD"
      case UNKNOWN => "UNKNOWN"
      case INITIALIZED => "INITIALIZED"
      case PAGEVISIT => "PAGEVISIT"
      case SIGNUP => "SIGNUP"
      case CHECKOUT => "CHECKOUT"
      case CUSTOM => "CUSTOM"
      case VIEWCATEGORY => "VIEWCATEGORY"
      case SEARCH => "SEARCH"
      case ADDTOCART => "ADDTOCART"
      case WATCHVIDEO => "WATCHVIDEO"
      case LEAD => "LEAD"
      case APPINSTALL => "APPINSTALL"
      case WEBSESSION => "WEBSESSION"
      case EXTERNALMEASUREMENT => "EXTERNALMEASUREMENT"
      case ADDPAYMENTINFO => "ADDPAYMENTINFO"
      case ADDTOWISHLIST => "ADDTOWISHLIST"
      case INITIATECHECKOUT => "INITIATECHECKOUT"
      case SUBSCRIBE => "SUBSCRIBE"
      case VIEWCONTENT => "VIEWCONTENT"
      case ADVERTISERDEFINEDEVENT => "ADVERTISERDEFINEDEVENT"
      case APPOPEN => "APPOPEN"
      case CONTACT => "CONTACT"
      case SCHEDULE => "SCHEDULE"
      case FINDLOCATION => "FINDLOCATION"
      case CUSTOMIZEPRODUCT => "CUSTOMIZEPRODUCT"
      case SUBMITAPPLICATION => "SUBMITAPPLICATION"
      case STARTTRIAL => "STARTTRIAL"
    }
  }

  implicit val MappedConversionTypeEnumEncoder: EncodeJson[MappedConversionType] =
    EncodeJson[MappedConversionType](is => StringEncodeJson(MappedConversionType.fromMappedConversionType(is)))

  implicit val MappedConversionTypeEnumDecoder: DecodeJson[MappedConversionType] =
    DecodeJson.optionDecoder[MappedConversionType](n => n.string.flatMap(jStr => MappedConversionType.toMappedConversionType(jStr)), "MappedConversionType failed to de-serialize")

  implicit val AdvertiserDefinedEventCodecJson: CodecJson[AdvertiserDefinedEvent] = CodecJson.derive[AdvertiserDefinedEvent]
  implicit val AdvertiserDefinedEventDecoder: EntityDecoder[AdvertiserDefinedEvent] = jsonOf[AdvertiserDefinedEvent]
  implicit val AdvertiserDefinedEventEncoder: EntityEncoder[AdvertiserDefinedEvent] = jsonEncoderOf[AdvertiserDefinedEvent]
}
