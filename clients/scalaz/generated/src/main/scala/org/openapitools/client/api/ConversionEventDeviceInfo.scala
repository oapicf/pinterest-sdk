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

  implicit val ConversionEventDeviceInfoCodecJson: CodecJson[ConversionEventDeviceInfo] = CodecJson.derive[ConversionEventDeviceInfo]
  implicit val ConversionEventDeviceInfoDecoder: EntityDecoder[ConversionEventDeviceInfo] = jsonOf[ConversionEventDeviceInfo]
  implicit val ConversionEventDeviceInfoEncoder: EntityEncoder[ConversionEventDeviceInfo] = jsonEncoderOf[ConversionEventDeviceInfo]
}
