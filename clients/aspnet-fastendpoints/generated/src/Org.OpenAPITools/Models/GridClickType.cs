namespace Org.OpenAPITools.Models;

    /// <summary>
    /// Where a user is taken after clicking on an ad in grid.  **Note:**  This parameter is read-only and is set to `DIRECT_TO_DESTINATION` by default for direct links supported ads. `grid_click_type` values provided will be ignored.
    /// </summary>
    /// <value>Where a user is taken after clicking on an ad in grid.  **Note:**  This parameter is read-only and is set to `DIRECT_TO_DESTINATION` by default for direct links supported ads. `grid_click_type` values provided will be ignored.</value>
    public enum GridClickType
    {
        
        /// <summary>
        /// Enum CLOSEUPEnum for CLOSEUP
        /// </summary>
        CLOSEUPEnum = 1,
        
        /// <summary>
        /// Enum DIRECTTODESTINATIONEnum for DIRECT_TO_DESTINATION
        /// </summary>
        DIRECTTODESTINATIONEnum = 2
    }
