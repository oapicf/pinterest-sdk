package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DeleteAssetGroupResponse_exceptions_inner.
  * @param code Error code associated with the error deleting asset group.
  * @param message Error message associated with the error deleting asset group.
  * @param assetGroupId Asset group id of the exception.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class DeleteAssetGroupResponseExceptionsInner(
  code: Option[Int],
  message: Option[String],
  assetGroupId: Option[String]
)

object DeleteAssetGroupResponseExceptionsInner {
  implicit lazy val deleteAssetGroupResponseExceptionsInnerJsonFormat: Format[DeleteAssetGroupResponseExceptionsInner] = Json.format[DeleteAssetGroupResponseExceptionsInner]
}

