# openapi::BudgetType

Budget type. If DAILY, an ad group's daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group `start_time` and `end_time` range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. For CBO campaigns, only \"CBO_ADGROUP\" is allowed. For WEB_SESSIONS campaigns, only \"LIFETIME\" is allowed. For update, only draft ad groups may update budget type.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------


