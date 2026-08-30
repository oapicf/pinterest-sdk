namespace Org.OpenAPITools.Models;

    /// <summary>
    /// The access level a member/partner has to the business. Values are case-sensitive. - EMPLOYEE: Can only view and access ad accounts you assign to them. They cannot see details about other employees, external partners or other ad accounts. - BIZ_ADMIN: Have full control of roles and can add employees, external partners as well as grant ad account access.
    /// </summary>
    /// <value>The access level a member/partner has to the business. Values are case-sensitive. - EMPLOYEE: Can only view and access ad accounts you assign to them. They cannot see details about other employees, external partners or other ad accounts. - BIZ_ADMIN: Have full control of roles and can add employees, external partners as well as grant ad account access.</value>
    public enum MemberBusinessRole
    {
        
        /// <summary>
        /// Enum EMPLOYEEEnum for EMPLOYEE
        /// </summary>
        EMPLOYEEEnum = 1,
        
        /// <summary>
        /// Enum BIZADMINEnum for BIZ_ADMIN
        /// </summary>
        BIZADMINEnum = 2
    }
