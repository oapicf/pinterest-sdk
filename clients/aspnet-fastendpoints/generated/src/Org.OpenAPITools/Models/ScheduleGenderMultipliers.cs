namespace Org.OpenAPITools.Models;


/// <summary>
/// This represents a mapping from gender targeting criteria to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
/// </summary>
public class ScheduleGenderMultipliers 
{
    
    public TargetingSpecGender GENDER { get; set; }
}


