namespace Org.OpenAPITools.Models;


/// <summary>
/// System error details included in the log sent by the client.
/// </summary>
public class IntegrationLogClientError 
{
    public string Cause { get; set; }
    public int ColumnNumber { get; set; }
    public string FileName { get; set; }
    public int LineNumber { get; set; }
    public string Message { get; set; }
    public string MessageDetail { get; set; }
    public string Name { get; set; }
    public int Number { get; set; }
    public string StackTrace { get; set; }
}


