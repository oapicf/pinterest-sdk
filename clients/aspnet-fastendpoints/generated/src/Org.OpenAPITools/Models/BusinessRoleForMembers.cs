namespace Org.OpenAPITools.Models;

    /// <summary>
    /// The access level a member has to the business. Values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access.
    /// </summary>
    /// <value>The access level a member has to the business. Values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access.</value>
    public enum BusinessRoleForMembers
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
