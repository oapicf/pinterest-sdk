package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DeleteAssetGroupResponse_exceptions_inner.
  * @param assetGroupId Asset group id of the exception.
  * @param code Error code associated with the error deleting asset group.
  * @param message Error message associated with the error deleting asset group.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class DeleteAssetGroupResponseExceptionsInner(
  assetGroupId: Option[String],
  code: Option[Int],
  message: Option[String]
)

object DeleteAssetGroupResponseExceptionsInner {
  implicit lazy val deleteAssetGroupResponseExceptionsInnerJsonFormat: Format[DeleteAssetGroupResponseExceptionsInner] = Json.format[DeleteAssetGroupResponseExceptionsInner]
}

