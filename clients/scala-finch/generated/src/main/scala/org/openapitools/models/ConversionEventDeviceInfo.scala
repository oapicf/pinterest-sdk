package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * Object containing information about the device where event occurred.
 * @param batteryUnderscorelevel Battery charge level percentage
 * @param brand Device brand
 * @param carrier User device's mobile carrier.
 * @param cpuUnderscorecores Number of CPU cores
 * @param externalUnderscorestorageUnderscorefreeUnderscorespace External storage size in GB
 * @param externalUnderscorestorageUnderscoresize External storage size in GB
 * @param formUnderscorefactor Device form factor
 * @param kernelUnderscoreversion Kernel version. Examples: Linux: 6.15. Obtain by running: uname -r MacOS: 24.3.0. Obtain by running: sysctl kern.version Android: 6.6. Obtain from OS.uname().release
 * @param languages List of user installed languages. ISO 639-1 format
 * @param locale Device locale BCP-47 format
 * @param model Device model name
 * @param networkUnderscoretype Network type: 4G, 5G, ethernet, wifi In Android: NetworkCapabilities.getNetworkCapabilities()
 * @param osUnderscorefamily OS Family
 * @param osUnderscorename Short name of the OS. This value if specific to os family. Examples: Windows: 10, 11; Android: 16; iOS: 18; MacOS: 15; Linux: Debian, Ubuntu, Arch
 * @param osUnderscorereleaseUnderscorename Marketing name for the release version iOS: Dawn Android: Baklava MacOS: Sequoia Ubuntu Linux: Plucky Puffin
 * @param osUnderscoreversion Full name of the version. Examples: iOS: 18.3 Android: 16.1 MacOS: 15.5 Windows: 24H2 Ubuntu Linux: 25.04
 * @param screenUnderscoredensity Screen density, PPI
 * @param screenUnderscoreheight Screen height in pixels
 * @param screenUnderscorewidth Screen width in pixels
 * @param storageUnderscorefreeUnderscorespace Internal storage size in GB
 * @param storageUnderscoresize Internal storage size in GB
 * @param timezone Device timezone
 * @param timezoneUnderscoreabbr Timezone abbreviation
 * @param _type Device type
 */
case class ConversionEventDeviceInfo(batteryUnderscorelevel: Option[Int],
                brand: Option[String],
                carrier: Option[String],
                cpuUnderscorecores: Option[Int],
                externalUnderscorestorageUnderscorefreeUnderscorespace: Option[Int],
                externalUnderscorestorageUnderscoresize: Option[Int],
                formUnderscorefactor: Option[String],
                kernelUnderscoreversion: Option[String],
                languages: Option[Seq[String]],
                locale: Option[String],
                model: Option[String],
                networkUnderscoretype: Option[String],
                osUnderscorefamily: Option[String],
                osUnderscorename: Option[String],
                osUnderscorereleaseUnderscorename: Option[String],
                osUnderscoreversion: Option[String],
                screenUnderscoredensity: Option[Int],
                screenUnderscoreheight: Option[Int],
                screenUnderscorewidth: Option[Int],
                storageUnderscorefreeUnderscorespace: Option[Int],
                storageUnderscoresize: Option[Int],
                timezone: Option[String],
                timezoneUnderscoreabbr: Option[String],
                _type: Option[String]
                )

object ConversionEventDeviceInfo {
    /**
     * Creates the codec for converting ConversionEventDeviceInfo from and to JSON.
     */
    implicit val decoder: Decoder[ConversionEventDeviceInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ConversionEventDeviceInfo] = deriveEncoder
}
