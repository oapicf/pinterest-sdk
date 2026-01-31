package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsVerticalBatchRequest._

case class CatalogsVerticalBatchRequest (
  catalogType: CatalogType,
country: Country,
/* We recommend using the CatalogsLocale values. */
  language: Language,
/* Array with creative assets item operations */
  items: List[CatalogsCreativeAssetsBatchItem],
/* Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog */
  catalogId: Option[String])

object CatalogsVerticalBatchRequest {
  import DateTimeCodecs._
  sealed trait CatalogType
  case object CREATIVEASSETS extends CatalogType

  object CatalogType {
    def toCatalogType(s: String): Option[CatalogType] = s match {
      case "CREATIVEASSETS" => Some(CREATIVEASSETS)
      case _ => None
    }

    def fromCatalogType(x: CatalogType): String = x match {
      case CREATIVEASSETS => "CREATIVEASSETS"
    }
  }

  implicit val CatalogTypeEnumEncoder: EncodeJson[CatalogType] =
    EncodeJson[CatalogType](is => StringEncodeJson(CatalogType.fromCatalogType(is)))

  implicit val CatalogTypeEnumDecoder: DecodeJson[CatalogType] =
    DecodeJson.optionDecoder[CatalogType](n => n.string.flatMap(jStr => CatalogType.toCatalogType(jStr)), "CatalogType failed to de-serialize")
  sealed trait Language
  case object AfZA extends Language
  case object ArSA extends Language
  case object BgBG extends Language
  case object BnIN extends Language
  case object CsCZ extends Language
  case object DaDK extends Language
  case object De extends Language
  case object ElGR extends Language
  case object EnAU extends Language
  case object EnCA extends Language
  case object EnGB extends Language
  case object EnIN extends Language
  case object EnUS extends Language
  case object Es419 extends Language
  case object EsAR extends Language
  case object EsES extends Language
  case object EsMX extends Language
  case object FiFI extends Language
  case object Fr extends Language
  case object FrCA extends Language
  case object HeIL extends Language
  case object HiIN extends Language
  case object HrHR extends Language
  case object HuHU extends Language
  case object IdID extends Language
  case object It extends Language
  case object Ja extends Language
  case object KoKR extends Language
  case object MsMY extends Language
  case object NbNO extends Language
  case object Nl extends Language
  case object PlPL extends Language
  case object PtBR extends Language
  case object PtPT extends Language
  case object RoRO extends Language
  case object RuRU extends Language
  case object SkSK extends Language
  case object SvSE extends Language
  case object TeIN extends Language
  case object ThTH extends Language
  case object TlPH extends Language
  case object Tr extends Language
  case object UkUA extends Language
  case object ViVN extends Language
  case object ZhCN extends Language
  case object ZhTW extends Language
  case object AM extends Language
  case object AR extends Language
  case object AZ extends Language
  case object BG extends Language
  case object BN extends Language
  case object BS extends Language
  case object CA extends Language
  case object CS extends Language
  case object DA extends Language
  case object DV extends Language
  case object DZ extends Language
  case object DE extends Language
  case object EL extends Language
  case object EN extends Language
  case object ES extends Language
  case object ET extends Language
  case object FA extends Language
  case object FI extends Language
  case object FR extends Language
  case object HE extends Language
  case object HI extends Language
  case object HR extends Language
  case object HU extends Language
  case object HY extends Language
  case object ID extends Language
  case object IN extends Language
  case object IS extends Language
  case object IT extends Language
  case object IW extends Language
  case object JA extends Language
  case object KA extends Language
  case object KM extends Language
  case object KO extends Language
  case object LO extends Language
  case object LT extends Language
  case object LV extends Language
  case object MK extends Language
  case object MN extends Language
  case object MS extends Language
  case object MY extends Language
  case object NB extends Language
  case object NE extends Language
  case object NL extends Language
  case object NO extends Language
  case object PL extends Language
  case object PT extends Language
  case object RO extends Language
  case object RU extends Language
  case object SK extends Language
  case object SL extends Language
  case object SQ extends Language
  case object SR extends Language
  case object SV extends Language
  case object TL extends Language
  case object UK extends Language
  case object VI extends Language
  case object TE extends Language
  case object TH extends Language
  case object TR extends Language
  case object XX extends Language
  case object ZH extends Language

  object Language {
    def toLanguage(s: String): Option[Language] = s match {
      case "AfZA" => Some(AfZA)
      case "ArSA" => Some(ArSA)
      case "BgBG" => Some(BgBG)
      case "BnIN" => Some(BnIN)
      case "CsCZ" => Some(CsCZ)
      case "DaDK" => Some(DaDK)
      case "De" => Some(De)
      case "ElGR" => Some(ElGR)
      case "EnAU" => Some(EnAU)
      case "EnCA" => Some(EnCA)
      case "EnGB" => Some(EnGB)
      case "EnIN" => Some(EnIN)
      case "EnUS" => Some(EnUS)
      case "Es419" => Some(Es419)
      case "EsAR" => Some(EsAR)
      case "EsES" => Some(EsES)
      case "EsMX" => Some(EsMX)
      case "FiFI" => Some(FiFI)
      case "Fr" => Some(Fr)
      case "FrCA" => Some(FrCA)
      case "HeIL" => Some(HeIL)
      case "HiIN" => Some(HiIN)
      case "HrHR" => Some(HrHR)
      case "HuHU" => Some(HuHU)
      case "IdID" => Some(IdID)
      case "It" => Some(It)
      case "Ja" => Some(Ja)
      case "KoKR" => Some(KoKR)
      case "MsMY" => Some(MsMY)
      case "NbNO" => Some(NbNO)
      case "Nl" => Some(Nl)
      case "PlPL" => Some(PlPL)
      case "PtBR" => Some(PtBR)
      case "PtPT" => Some(PtPT)
      case "RoRO" => Some(RoRO)
      case "RuRU" => Some(RuRU)
      case "SkSK" => Some(SkSK)
      case "SvSE" => Some(SvSE)
      case "TeIN" => Some(TeIN)
      case "ThTH" => Some(ThTH)
      case "TlPH" => Some(TlPH)
      case "Tr" => Some(Tr)
      case "UkUA" => Some(UkUA)
      case "ViVN" => Some(ViVN)
      case "ZhCN" => Some(ZhCN)
      case "ZhTW" => Some(ZhTW)
      case "AM" => Some(AM)
      case "AR" => Some(AR)
      case "AZ" => Some(AZ)
      case "BG" => Some(BG)
      case "BN" => Some(BN)
      case "BS" => Some(BS)
      case "CA" => Some(CA)
      case "CS" => Some(CS)
      case "DA" => Some(DA)
      case "DV" => Some(DV)
      case "DZ" => Some(DZ)
      case "DE" => Some(DE)
      case "EL" => Some(EL)
      case "EN" => Some(EN)
      case "ES" => Some(ES)
      case "ET" => Some(ET)
      case "FA" => Some(FA)
      case "FI" => Some(FI)
      case "FR" => Some(FR)
      case "HE" => Some(HE)
      case "HI" => Some(HI)
      case "HR" => Some(HR)
      case "HU" => Some(HU)
      case "HY" => Some(HY)
      case "ID" => Some(ID)
      case "IN" => Some(IN)
      case "IS" => Some(IS)
      case "IT" => Some(IT)
      case "IW" => Some(IW)
      case "JA" => Some(JA)
      case "KA" => Some(KA)
      case "KM" => Some(KM)
      case "KO" => Some(KO)
      case "LO" => Some(LO)
      case "LT" => Some(LT)
      case "LV" => Some(LV)
      case "MK" => Some(MK)
      case "MN" => Some(MN)
      case "MS" => Some(MS)
      case "MY" => Some(MY)
      case "NB" => Some(NB)
      case "NE" => Some(NE)
      case "NL" => Some(NL)
      case "NO" => Some(NO)
      case "PL" => Some(PL)
      case "PT" => Some(PT)
      case "RO" => Some(RO)
      case "RU" => Some(RU)
      case "SK" => Some(SK)
      case "SL" => Some(SL)
      case "SQ" => Some(SQ)
      case "SR" => Some(SR)
      case "SV" => Some(SV)
      case "TL" => Some(TL)
      case "UK" => Some(UK)
      case "VI" => Some(VI)
      case "TE" => Some(TE)
      case "TH" => Some(TH)
      case "TR" => Some(TR)
      case "XX" => Some(XX)
      case "ZH" => Some(ZH)
      case _ => None
    }

    def fromLanguage(x: Language): String = x match {
      case AfZA => "AfZA"
      case ArSA => "ArSA"
      case BgBG => "BgBG"
      case BnIN => "BnIN"
      case CsCZ => "CsCZ"
      case DaDK => "DaDK"
      case De => "De"
      case ElGR => "ElGR"
      case EnAU => "EnAU"
      case EnCA => "EnCA"
      case EnGB => "EnGB"
      case EnIN => "EnIN"
      case EnUS => "EnUS"
      case Es419 => "Es419"
      case EsAR => "EsAR"
      case EsES => "EsES"
      case EsMX => "EsMX"
      case FiFI => "FiFI"
      case Fr => "Fr"
      case FrCA => "FrCA"
      case HeIL => "HeIL"
      case HiIN => "HiIN"
      case HrHR => "HrHR"
      case HuHU => "HuHU"
      case IdID => "IdID"
      case It => "It"
      case Ja => "Ja"
      case KoKR => "KoKR"
      case MsMY => "MsMY"
      case NbNO => "NbNO"
      case Nl => "Nl"
      case PlPL => "PlPL"
      case PtBR => "PtBR"
      case PtPT => "PtPT"
      case RoRO => "RoRO"
      case RuRU => "RuRU"
      case SkSK => "SkSK"
      case SvSE => "SvSE"
      case TeIN => "TeIN"
      case ThTH => "ThTH"
      case TlPH => "TlPH"
      case Tr => "Tr"
      case UkUA => "UkUA"
      case ViVN => "ViVN"
      case ZhCN => "ZhCN"
      case ZhTW => "ZhTW"
      case AM => "AM"
      case AR => "AR"
      case AZ => "AZ"
      case BG => "BG"
      case BN => "BN"
      case BS => "BS"
      case CA => "CA"
      case CS => "CS"
      case DA => "DA"
      case DV => "DV"
      case DZ => "DZ"
      case DE => "DE"
      case EL => "EL"
      case EN => "EN"
      case ES => "ES"
      case ET => "ET"
      case FA => "FA"
      case FI => "FI"
      case FR => "FR"
      case HE => "HE"
      case HI => "HI"
      case HR => "HR"
      case HU => "HU"
      case HY => "HY"
      case ID => "ID"
      case IN => "IN"
      case IS => "IS"
      case IT => "IT"
      case IW => "IW"
      case JA => "JA"
      case KA => "KA"
      case KM => "KM"
      case KO => "KO"
      case LO => "LO"
      case LT => "LT"
      case LV => "LV"
      case MK => "MK"
      case MN => "MN"
      case MS => "MS"
      case MY => "MY"
      case NB => "NB"
      case NE => "NE"
      case NL => "NL"
      case NO => "NO"
      case PL => "PL"
      case PT => "PT"
      case RO => "RO"
      case RU => "RU"
      case SK => "SK"
      case SL => "SL"
      case SQ => "SQ"
      case SR => "SR"
      case SV => "SV"
      case TL => "TL"
      case UK => "UK"
      case VI => "VI"
      case TE => "TE"
      case TH => "TH"
      case TR => "TR"
      case XX => "XX"
      case ZH => "ZH"
    }
  }

  implicit val LanguageEnumEncoder: EncodeJson[Language] =
    EncodeJson[Language](is => StringEncodeJson(Language.fromLanguage(is)))

  implicit val LanguageEnumDecoder: DecodeJson[Language] =
    DecodeJson.optionDecoder[Language](n => n.string.flatMap(jStr => Language.toLanguage(jStr)), "Language failed to de-serialize")

  implicit val CatalogsVerticalBatchRequestCodecJson: CodecJson[CatalogsVerticalBatchRequest] = CodecJson.derive[CatalogsVerticalBatchRequest]
  implicit val CatalogsVerticalBatchRequestDecoder: EntityDecoder[CatalogsVerticalBatchRequest] = jsonOf[CatalogsVerticalBatchRequest]
  implicit val CatalogsVerticalBatchRequestEncoder: EntityEncoder[CatalogsVerticalBatchRequest] = jsonEncoderOf[CatalogsVerticalBatchRequest]
}
