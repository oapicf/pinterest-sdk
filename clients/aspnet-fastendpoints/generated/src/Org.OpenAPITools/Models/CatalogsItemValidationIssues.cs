namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CatalogsItemValidationIssues 
{
    public CatalogsItemValidationErrors Errors { get; set; }
    public string ItemId { get; set; }
    public int ItemNumber { get; set; }
    public CatalogsItemValidationWarnings Warnings { get; set; }
}


