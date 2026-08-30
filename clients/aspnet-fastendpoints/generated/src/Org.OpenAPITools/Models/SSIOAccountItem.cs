namespace Org.OpenAPITools.Models;


/// <summary>
/// Salesforce account item with billing and terms information.
/// </summary>
public class SSIOAccountItem 
{
    public List<SSIOAccountAddress> Addresses { get; set; }
    public string Id { get; set; }
    public string IoTerms { get; set; }
    public string IoTermsId { get; set; }
    public string IoType { get; set; }
    public string RowTerms { get; set; }
    public string RowTermsId { get; set; }
    public string UsTerms { get; set; }
    public string UsTermsId { get; set; }
}


