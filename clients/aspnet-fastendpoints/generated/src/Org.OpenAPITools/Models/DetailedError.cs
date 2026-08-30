namespace Org.OpenAPITools.Models;


/// <summary>
/// Used for including extra details to a base error
/// </summary>
public class DetailedError 
{
    public int Code { get; set; }
    public Object Details { get; set; }
    public string Message { get; set; }
}


