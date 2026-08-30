namespace Org.OpenAPITools.Models;


/// <summary>
/// HTTP request details included in the log sent by the client.
/// </summary>
public class IntegrationLogClientRequest 
{
    public string Host { get; set; }
    
    public HttpMethod Method { get; set; }
    public string Path { get; set; }
    public Dictionary<string, string> RequestHeaders { get; set; }
    public Dictionary<string, string> ResponseHeaders { get; set; }
    public int ResponseStatusCode { get; set; }
}


