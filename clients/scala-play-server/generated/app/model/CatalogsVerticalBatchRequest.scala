package model

import play.api.libs.json._

/**
  * A request object that can have multiple operations on a single batch
  * @param catalogId Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
  * @param items Array with creative assets item operations
  * @param language We recommend using the CatalogsLocale values.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsVerticalBatchRequest(
  catalogId: Option[String],
  catalogType: CatalogsVerticalBatchRequest.CatalogType.Value,
  country: Country,
  items: List[CatalogsCreativeAssetsBatchItem],
  language: CatalogsVerticalBatchRequest.Language.Value
  additionalProperties: 
)

object CatalogsVerticalBatchRequest {
  implicit lazy val catalogsVerticalBatchRequestJsonFormat: Format[CatalogsVerticalBatchRequest] = {
    val realJsonFormat = Json.format[CatalogsVerticalBatchRequest]
    val declaredPropNames = Set("catalogId", "catalogType", "country", "items", "language")
    
    Format(
      Reads {
        case JsObject(xs) =>
          val declaredProps = xs.filterKeys(declaredPropNames)
          val additionalProps = JsObject(xs -- declaredPropNames)
          val restructuredProps = declaredProps + ("additionalProperties" -> additionalProps)
          val newObj = JsObject(restructuredProps)
          realJsonFormat.reads(newObj)
        case _ =>
          JsError("error.expected.jsobject")
      },
      Writes { catalogsVerticalBatchRequest =>
        val jsObj = realJsonFormat.writes(catalogsVerticalBatchRequest)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val CREATIVEASSETS = Value("CREATIVE_ASSETS")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Language extends Enumeration {
    val AfZA = Value("af-ZA")
    val ArSA = Value("ar-SA")
    val BgBG = Value("bg-BG")
    val BnIN = Value("bn-IN")
    val CsCZ = Value("cs-CZ")
    val DaDK = Value("da-DK")
    val De = Value("de")
    val ElGR = Value("el-GR")
    val EnAU = Value("en-AU")
    val EnCA = Value("en-CA")
    val EnGB = Value("en-GB")
    val EnIN = Value("en-IN")
    val EnUS = Value("en-US")
    val Es419 = Value("es-419")
    val EsAR = Value("es-AR")
    val EsES = Value("es-ES")
    val EsMX = Value("es-MX")
    val FiFI = Value("fi-FI")
    val Fr = Value("fr")
    val FrCA = Value("fr-CA")
    val HeIL = Value("he-IL")
    val HiIN = Value("hi-IN")
    val HrHR = Value("hr-HR")
    val HuHU = Value("hu-HU")
    val IdID = Value("id-ID")
    val It = Value("it")
    val Ja = Value("ja")
    val KoKR = Value("ko-KR")
    val MsMY = Value("ms-MY")
    val NbNO = Value("nb-NO")
    val Nl = Value("nl")
    val PlPL = Value("pl-PL")
    val PtBR = Value("pt-BR")
    val PtPT = Value("pt-PT")
    val RoRO = Value("ro-RO")
    val RuRU = Value("ru-RU")
    val SkSK = Value("sk-SK")
    val SvSE = Value("sv-SE")
    val TeIN = Value("te-IN")
    val ThTH = Value("th-TH")
    val TlPH = Value("tl-PH")
    val Tr = Value("tr")
    val UkUA = Value("uk-UA")
    val ViVN = Value("vi-VN")
    val ZhCN = Value("zh-CN")
    val ZhTW = Value("zh-TW")
    val AM = Value("AM")
    val AR = Value("AR")
    val AZ = Value("AZ")
    val BG = Value("BG")
    val BN = Value("BN")
    val BS = Value("BS")
    val CA = Value("CA")
    val CS = Value("CS")
    val DA = Value("DA")
    val DV = Value("DV")
    val DZ = Value("DZ")
    val DE = Value("DE")
    val EL = Value("EL")
    val EN = Value("EN")
    val ES = Value("ES")
    val ET = Value("ET")
    val FA = Value("FA")
    val FI = Value("FI")
    val FR = Value("FR")
    val HE = Value("HE")
    val HI = Value("HI")
    val HR = Value("HR")
    val HU = Value("HU")
    val HY = Value("HY")
    val ID = Value("ID")
    val IN = Value("IN")
    val IS = Value("IS")
    val IT = Value("IT")
    val IW = Value("IW")
    val JA = Value("JA")
    val KA = Value("KA")
    val KM = Value("KM")
    val KO = Value("KO")
    val LO = Value("LO")
    val LT = Value("LT")
    val LV = Value("LV")
    val MK = Value("MK")
    val MN = Value("MN")
    val MS = Value("MS")
    val MY = Value("MY")
    val NB = Value("NB")
    val NE = Value("NE")
    val NL = Value("NL")
    val False = Value("false")
    val PL = Value("PL")
    val PT = Value("PT")
    val RO = Value("RO")
    val RU = Value("RU")
    val SK = Value("SK")
    val SL = Value("SL")
    val SQ = Value("SQ")
    val SR = Value("SR")
    val SV = Value("SV")
    val TL = Value("TL")
    val UK = Value("UK")
    val VI = Value("VI")
    val TE = Value("TE")
    val TH = Value("TH")
    val TR = Value("TR")
    val XX = Value("XX")
    val ZH = Value("ZH")

    type Language = Value
    implicit lazy val LanguageJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

