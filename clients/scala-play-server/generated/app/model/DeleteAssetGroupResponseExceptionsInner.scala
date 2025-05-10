package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DeleteAssetGroupResponse_exceptions_inner.
  * @param code Error code associated with the error deleting asset group.
  * @param message Error message associated with the error deleting asset group.
  * @param assetGroupId Asset group id of the exception.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class DeleteAssetGroupResponseExceptionsInner(
  code: Option[Int],
  message: Option[String],
  assetGroupId: Option[String]
)

object DeleteAssetGroupResponseExceptionsInner {
  implicit lazy val deleteAssetGroupResponseExceptionsInnerJsonFormat: Format[DeleteAssetGroupResponseExceptionsInner] = Json.format[DeleteAssetGroupResponseExceptionsInner]
}

