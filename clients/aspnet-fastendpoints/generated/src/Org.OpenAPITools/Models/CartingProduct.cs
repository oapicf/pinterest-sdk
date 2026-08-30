namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CartingProduct 
{
    public string CartingProductId { get; set; }
    public bool DisplayPreferredRetailersOnly { get; set; }
    public bool DisplayProductPrice { get; set; }
    public List<CartingRetailer> PreferredRetailers { get; set; }
    public bool RandomizePreferredRetailers { get; set; }
}


