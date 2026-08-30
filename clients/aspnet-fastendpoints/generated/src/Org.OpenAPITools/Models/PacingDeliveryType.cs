namespace Org.OpenAPITools.Models;

    /// <summary>
    /// Ad group pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day. When using CBO, only the STANDARD pacing delivery type is allowed.
    /// </summary>
    /// <value>Ad group pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day. When using CBO, only the STANDARD pacing delivery type is allowed.</value>
    public enum PacingDeliveryType
    {
        
        /// <summary>
        /// Enum STANDARDEnum for STANDARD
        /// </summary>
        STANDARDEnum = 1,
        
        /// <summary>
        /// Enum ACCELERATEDEnum for ACCELERATED
        /// </summary>
        ACCELERATEDEnum = 2
    }
