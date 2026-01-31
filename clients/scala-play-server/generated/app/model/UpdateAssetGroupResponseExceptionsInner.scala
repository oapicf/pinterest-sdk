package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UpdateAssetGroupResponse_exceptions_inner.
  * @param assetGroupId Asset group id of the exception.
  * @param code Error code associated with the error editing asset group.
  * @param message Error message associated with the error editing asset group.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class UpdateAssetGroupResponseExceptionsInner(
  assetGroupId: Option[String],
  code: Option[Int],
  message: Option[String]
)

object UpdateAssetGroupResponseExceptionsInner {
  implicit lazy val updateAssetGroupResponseExceptionsInnerJsonFormat: Format[UpdateAssetGroupResponseExceptionsInner] = Json.format[UpdateAssetGroupResponseExceptionsInner]
}

