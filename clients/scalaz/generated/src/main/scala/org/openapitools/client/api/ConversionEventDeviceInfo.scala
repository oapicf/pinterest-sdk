package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionEventDeviceInfo._

case class ConversionEventDeviceInfo (
  /* Battery charge level percentage */
  batteryLevel: Option[Integer],
/* Device brand */
  brand: Option[String],
/* User device's mobile carrier. */
  carrier: Option[String],
/* Number of CPU cores */
  cpuCores: Option[Integer],
/* External storage size in GB */
  externalStorageFreeSpace: Option[Integer],
/* External storage size in GB */
  externalStorageSize: Option[Integer],
/* Device form factor */
  formFactor: Option[FormFactor],
/* Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release */
  kernelVersion: Option[String],
/* List of user installed languages. ISO 639-1 format */
  languages: Option[List[String]],
/* Device locale BCP-47 format */
  locale: Option[String],
/* Device model name */
  model: Option[String],
/* Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities() */
  networkType: Option[NetworkType],
/* OS Family */
  osFamily: Option[OsFamily],
/* Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch */
  osName: Option[String],
/* Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin */
  osReleaseName: Option[String],
/* Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04 */
  osVersion: Option[String],
/* Screen density, PPI */
  screenDensity: Option[Integer],
/* Screen height in pixels */
  screenHeight: Option[Integer],
/* Screen width in pixels */
  screenWidth: Option[Integer],
/* Internal storage size in GB */
  storageFreeSpace: Option[Integer],
/* Internal storage size in GB */
  storageSize: Option[Integer],
/* Device timezone */
  timezone: Option[String],
/* Timezone abbreviation */
  timezoneAbbr: Option[String],
/* Device type */
  `type`: Option[String])

object ConversionEventDeviceInfo {
  import DateTimeCodecs._
  sealed trait FormFactor
  case object Desktop extends FormFactor
  case object Laptop extends FormFactor
  case object Cellphone extends FormFactor
  case object Tablet extends FormFactor
  case object Smartwatch extends FormFactor
  case object Tv extends FormFactor
  case object Vr extends FormFactor
  case object Console extends FormFactor
  case object Other extends FormFactor

  object FormFactor {
    def toFormFactor(s: String): Option[FormFactor] = s match {
      case "Desktop" => Some(Desktop)
      case "Laptop" => Some(Laptop)
      case "Cellphone" => Some(Cellphone)
      case "Tablet" => Some(Tablet)
      case "Smartwatch" => Some(Smartwatch)
      case "Tv" => Some(Tv)
      case "Vr" => Some(Vr)
      case "Console" => Some(Console)
      case "Other" => Some(Other)
      case _ => None
    }

    def fromFormFactor(x: FormFactor): String = x match {
      case Desktop => "Desktop"
      case Laptop => "Laptop"
      case Cellphone => "Cellphone"
      case Tablet => "Tablet"
      case Smartwatch => "Smartwatch"
      case Tv => "Tv"
      case Vr => "Vr"
      case Console => "Console"
      case Other => "Other"
    }
  }

  implicit val FormFactorEnumEncoder: EncodeJson[FormFactor] =
    EncodeJson[FormFactor](is => StringEncodeJson(FormFactor.fromFormFactor(is)))

  implicit val FormFactorEnumDecoder: DecodeJson[FormFactor] =
    DecodeJson.optionDecoder[FormFactor](n => n.string.flatMap(jStr => FormFactor.toFormFactor(jStr)), "FormFactor failed to de-serialize")
  sealed trait NetworkType
  case object Wifi extends NetworkType
  case object Cellular2g extends NetworkType
  case object Cellular3g extends NetworkType
  case object Cellular4g extends NetworkType
  case object Cellular5g extends NetworkType
  case object Cellular6g extends NetworkType
  case object Ethernet extends NetworkType
  case object Unknown extends NetworkType

  object NetworkType {
    def toNetworkType(s: String): Option[NetworkType] = s match {
      case "Wifi" => Some(Wifi)
      case "Cellular2g" => Some(Cellular2g)
      case "Cellular3g" => Some(Cellular3g)
      case "Cellular4g" => Some(Cellular4g)
      case "Cellular5g" => Some(Cellular5g)
      case "Cellular6g" => Some(Cellular6g)
      case "Ethernet" => Some(Ethernet)
      case "Unknown" => Some(Unknown)
      case _ => None
    }

    def fromNetworkType(x: NetworkType): String = x match {
      case Wifi => "Wifi"
      case Cellular2g => "Cellular2g"
      case Cellular3g => "Cellular3g"
      case Cellular4g => "Cellular4g"
      case Cellular5g => "Cellular5g"
      case Cellular6g => "Cellular6g"
      case Ethernet => "Ethernet"
      case Unknown => "Unknown"
    }
  }

  implicit val NetworkTypeEnumEncoder: EncodeJson[NetworkType] =
    EncodeJson[NetworkType](is => StringEncodeJson(NetworkType.fromNetworkType(is)))

  implicit val NetworkTypeEnumDecoder: DecodeJson[NetworkType] =
    DecodeJson.optionDecoder[NetworkType](n => n.string.flatMap(jStr => NetworkType.toNetworkType(jStr)), "NetworkType failed to de-serialize")
  sealed trait OsFamily
  case object Ios extends OsFamily
  case object Android extends OsFamily
  case object Macos extends OsFamily
  case object Windows extends OsFamily
  case object Linux extends OsFamily
  case object Bsd extends OsFamily
  case object Other extends OsFamily

  object OsFamily {
    def toOsFamily(s: String): Option[OsFamily] = s match {
      case "Ios" => Some(Ios)
      case "Android" => Some(Android)
      case "Macos" => Some(Macos)
      case "Windows" => Some(Windows)
      case "Linux" => Some(Linux)
      case "Bsd" => Some(Bsd)
      case "Other" => Some(Other)
      case _ => None
    }

    def fromOsFamily(x: OsFamily): String = x match {
      case Ios => "Ios"
      case Android => "Android"
      case Macos => "Macos"
      case Windows => "Windows"
      case Linux => "Linux"
      case Bsd => "Bsd"
      case Other => "Other"
    }
  }

  implicit val OsFamilyEnumEncoder: EncodeJson[OsFamily] =
    EncodeJson[OsFamily](is => StringEncodeJson(OsFamily.fromOsFamily(is)))

  implicit val OsFamilyEnumDecoder: DecodeJson[OsFamily] =
    DecodeJson.optionDecoder[OsFamily](n => n.string.flatMap(jStr => OsFamily.toOsFamily(jStr)), "OsFamily failed to de-serialize")

  implicit val ConversionEventDeviceInfoCodecJson: CodecJson[ConversionEventDeviceInfo] = CodecJson.derive[ConversionEventDeviceInfo]
  implicit val ConversionEventDeviceInfoDecoder: EntityDecoder[ConversionEventDeviceInfo] = jsonOf[ConversionEventDeviceInfo]
  implicit val ConversionEventDeviceInfoEncoder: EntityEncoder[ConversionEventDeviceInfo] = jsonEncoderOf[ConversionEventDeviceInfo]
}
