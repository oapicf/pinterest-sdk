package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UpdateAssetGroupResponse_exceptions_inner.
  * @param code Error code associated with the error editing asset group.
  * @param message Error message associated with the error editing asset group.
  * @param assetGroupId Asset group id of the exception.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class UpdateAssetGroupResponseExceptionsInner(
  code: Option[Int],
  message: Option[String],
  assetGroupId: Option[String]
)

object UpdateAssetGroupResponseExceptionsInner {
  implicit lazy val updateAssetGroupResponseExceptionsInnerJsonFormat: Format[UpdateAssetGroupResponseExceptionsInner] = Json.format[UpdateAssetGroupResponseExceptionsInner]
}

