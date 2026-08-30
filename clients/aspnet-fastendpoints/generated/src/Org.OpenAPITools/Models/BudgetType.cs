namespace Org.OpenAPITools.Models;

    /// <summary>
    /// Budget type. If DAILY, an ad group's daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group `start_time` and `end_time` range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. For CBO campaigns, only \"CBO_ADGROUP\" is allowed. For WEB_SESSIONS campaigns, only \"LIFETIME\" is allowed. For update, only draft ad groups may update budget type.
    /// </summary>
    /// <value>Budget type. If DAILY, an ad group's daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group `start_time` and `end_time` range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. For CBO campaigns, only \"CBO_ADGROUP\" is allowed. For WEB_SESSIONS campaigns, only \"LIFETIME\" is allowed. For update, only draft ad groups may update budget type.</value>
    public enum BudgetType
    {
        
        /// <summary>
        /// Enum DAILYEnum for DAILY
        /// </summary>
        DAILYEnum = 1,
        
        /// <summary>
        /// Enum LIFETIMEEnum for LIFETIME
        /// </summary>
        LIFETIMEEnum = 2,
        
        /// <summary>
        /// Enum CBOADGROUPEnum for CBO_ADGROUP
        /// </summary>
        CBOADGROUPEnum = 3
    }
