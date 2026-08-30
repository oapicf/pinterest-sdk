namespace Org.OpenAPITools.Models;


/// <summary>
/// AI content disclosure for a single asset of a catalog item.
/// </summary>
public class CatalogsAiContentDisclosure 
{
    public List<CatalogsAiContentDisclosureLabel> Disclosure { get; set; }
    public string Url { get; set; }
}


