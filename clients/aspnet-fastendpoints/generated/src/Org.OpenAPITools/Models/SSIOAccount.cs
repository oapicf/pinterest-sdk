namespace Org.OpenAPITools.Models;


/// <summary>
/// Salesforce account details including bill-to information.
/// </summary>
public class SSIOAccount 
{
    public List<SSIOAccountItem> BilltoInfos { get; set; }
    public bool CanEdit { get; set; }
    public string Currency { get; set; }
    public bool Eligible { get; set; }
    public string Error { get; set; }
    public List<SSIOAccountPMPName> PmpNames { get; set; }
}


