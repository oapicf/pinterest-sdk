package model

import play.api.libs.json._

/**
  * Budget type. If DAILY, an ad group's daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group `start_time` and `end_time` range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. For CBO campaigns, only \"CBO_ADGROUP\" is allowed. For WEB_SESSIONS campaigns, only \"LIFETIME\" is allowed. For update, only draft ad groups may update budget type.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class BudgetType(
)

object BudgetType {
  implicit lazy val budgetTypeJsonFormat: Format[BudgetType] = Json.format[BudgetType]
}

