namespace Org.OpenAPITools.Models;


/// <summary>
/// Resource create operation model.
/// </summary>
public class SSIOInsertionOrderCreate 
{
    public string AcceptedTermsId { get; set; }
    public int AcceptedTermsTime { get; set; }
    public string AgencyLink { get; set; }
    public string BillingContactEmail { get; set; }
    public string BillingContactFirstname { get; set; }
    public string BillingContactLastname { get; set; }
    public string BilltoBillingAddressId { get; set; }
    public string BilltoBusinessAddressId { get; set; }
    public string BilltoCompanyId { get; set; }
    public double BudgetAmount { get; set; }
    
    public Currency CurrencyInfo { get; set; }
    public string EndDate { get; set; }
    public double EstimatedMonthlySpend { get; set; }
    public string MediaContactEmail { get; set; }
    public string MediaContactFirstname { get; set; }
    public string MediaContactLastname { get; set; }
    
    public SSIOOrderLineType OrderLineType { get; set; }
    public string OrderName { get; set; }
    public string PmpId { get; set; }
    public string PoNumber { get; set; }
    public string StartDate { get; set; }
    public string UserEmail { get; set; }
}


