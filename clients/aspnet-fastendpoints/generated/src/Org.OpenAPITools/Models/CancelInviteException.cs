namespace Org.OpenAPITools.Models;


/// <summary>
/// An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
/// </summary>
public class CancelInviteException 
{
    public string InviteId { get; set; }
    public string Message { get; set; }
}


