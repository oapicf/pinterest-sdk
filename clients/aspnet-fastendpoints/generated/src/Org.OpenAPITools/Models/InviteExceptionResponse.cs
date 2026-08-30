namespace Org.OpenAPITools.Models;


/// <summary>
/// An exception object if there is an error performing the action. Will only be provided if there is an error.
/// </summary>
public class InviteExceptionResponse 
{
    public int Code { get; set; }
    public string InviteOrRequestId { get; set; }
    public string Message { get; set; }
    public List<string> UsersOrPartnerIds { get; set; }
}


