namespace Org.OpenAPITools.Models;


/// <summary>
/// Resource create or update operation model.
/// </summary>
public class BoardWithUpdatePrivacyUpdate 
{
    public string Description { get; set; }
    public string Name { get; set; }
    
    public BoardUpdatePrivacy Privacy { get; set; }
}


