namespace Org.OpenAPITools.Models;

    /// <summary>
    /// The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.
    /// </summary>
    /// <value>The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.</value>
    public enum BusinessRoleForInvite
    {
        
        /// <summary>
        /// Enum EMPLOYEEEnum for EMPLOYEE
        /// </summary>
        EMPLOYEEEnum = 1,
        
        /// <summary>
        /// Enum BIZADMINEnum for BIZ_ADMIN
        /// </summary>
        BIZADMINEnum = 2,
        
        /// <summary>
        /// Enum PARTNEREnum for PARTNER
        /// </summary>
        PARTNEREnum = 3
    }
