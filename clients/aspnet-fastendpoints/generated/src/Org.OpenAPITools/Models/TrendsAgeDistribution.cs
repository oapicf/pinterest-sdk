namespace Org.OpenAPITools.Models;


/// <summary>
/// This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
/// </summary>
public class TrendsAgeDistribution 
{
    
    public TrendsAgeBucket AgeDistribution { get; set; }
}


