package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UpdateAssetGroupResponse_exceptions_inner.
  * @param code Error code associated with the error editing asset group.
  * @param message Error message associated with the error editing asset group.
  * @param assetGroupId Asset group id of the exception.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class UpdateAssetGroupResponseExceptionsInner(
  code: Option[Int],
  message: Option[String],
  assetGroupId: Option[String]
)

object UpdateAssetGroupResponseExceptionsInner {
  implicit lazy val updateAssetGroupResponseExceptionsInnerJsonFormat: Format[UpdateAssetGroupResponseExceptionsInner] = Json.format[UpdateAssetGroupResponseExceptionsInner]
}

