/*
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

/**
 * Budget type. If DAILY, an ad group\'s daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group `start_time` and `end_time` range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. For CBO campaigns, only "CBO_ADGROUP" is allowed. For WEB_SESSIONS campaigns, only "LIFETIME" is allowed. For update, only draft ad groups may update budget type.
 */
public enum OASBudgetType {
    DAILY,
    LIFETIME,
    CBO_ADGROUP
}

