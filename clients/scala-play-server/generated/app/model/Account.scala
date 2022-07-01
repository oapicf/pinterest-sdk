package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Account.
  * @param accountType Type of account
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
case class Account(
  accountType: Option[Account.AccountType.Value],
  profileImage: Option[String],
  websiteUrl: Option[String],
  username: Option[String]
  additionalProperties: 
)

object Account {
  implicit lazy val accountJsonFormat: Format[Account] = {
    val realJsonFormat = Json.format[Account]
    val declaredPropNames = Set("accountType", "profileImage", "websiteUrl", "username")
    
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
      Writes { account =>
        val jsObj = realJsonFormat.writes(account)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }

  // noinspection TypeAnnotation
  object AccountType extends Enumeration {
    val PINNER = Value("PINNER")
    val BUSINESS = Value("BUSINESS")

    type AccountType = Value
    implicit lazy val AccountTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

