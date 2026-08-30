namespace Org.OpenAPITools.Models;


/// <summary>
/// A single row in a multi-field customer list (v2 format).
/// </summary>
public class CustomerListRecordRow 
{
    public string Email { get; set; }
    public string ExternalId { get; set; }
    public string HashedPhoneNumber { get; set; }
    public string HashedPinnerId { get; set; }
    public string IpAddress { get; set; }
    public string LiverampEnvelope { get; set; }
    public string Maid { get; set; }
    public string UserAgent { get; set; }
}


