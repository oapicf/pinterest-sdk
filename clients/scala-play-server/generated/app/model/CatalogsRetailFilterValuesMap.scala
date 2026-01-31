package model

import play.api.libs.json._

/**
  * A map of filter attributes to their available values.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsRetailFilterValuesMap(
  adImageTags: Option[List[String]],
  adVideoTags: Option[List[String]],
  availability: Option[CatalogsRetailFilterValuesMap.Availability.Value],
  brand: Option[List[String]],
  condition: Option[CatalogsRetailFilterValuesMap.Condition.Value],
  customLabel0: Option[List[String]],
  customLabel1: Option[List[String]],
  customLabel2: Option[List[String]],
  customLabel3: Option[List[String]],
  customLabel4: Option[List[String]],
  gender: Option[CatalogsRetailFilterValuesMap.Gender.Value],
  googleProductCategory0: Option[List[String]],
  googleProductCategory1: Option[List[String]],
  googleProductCategory2: Option[List[String]],
  googleProductCategory3: Option[List[String]],
  googleProductCategory4: Option[List[String]],
  googleProductCategory5: Option[List[String]],
  googleProductCategory6: Option[List[String]],
  mediaType: Option[CatalogsRetailFilterValuesMap.MediaType.Value],
  productType0: Option[List[String]],
  productType1: Option[List[String]],
  productType2: Option[List[String]],
  productType3: Option[List[String]],
  productType4: Option[List[String]]
)

object CatalogsRetailFilterValuesMap {
  implicit lazy val catalogsRetailFilterValuesMapJsonFormat: Format[CatalogsRetailFilterValuesMap] = Json.format[CatalogsRetailFilterValuesMap]

  // noinspection TypeAnnotation
  object Availability extends Enumeration {
    val INSTOCK = Value("IN_STOCK")
    val OUTOFSTOCK = Value("OUT_OF_STOCK")
    val PREORDER = Value("PREORDER")
    val UNAVAILABLE = Value("UNAVAILABLE")

    type Availability = Value
    implicit lazy val AvailabilityJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Condition extends Enumeration {
    val NEW = Value("NEW")
    val USED = Value("USED")
    val REFURBISHED = Value("REFURBISHED")

    type Condition = Value
    implicit lazy val ConditionJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Gender extends Enumeration {
    val FEMALE = Value("FEMALE")
    val MALE = Value("MALE")
    val UNISEX = Value("UNISEX")

    type Gender = Value
    implicit lazy val GenderJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object MediaType extends Enumeration {
    val IMAGE = Value("IMAGE")
    val VIDEO = Value("VIDEO")

    type MediaType = Value
    implicit lazy val MediaTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

