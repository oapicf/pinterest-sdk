namespace Org.OpenAPITools.Models;


/// <summary>
/// A Salesforce SSIO order line.
/// </summary>
public class SSIOOrderLine 
{
    public string AcceptedTermsId { get; set; }
    public string AcceptedTermsTime { get; set; }
    public string AdsManagerOrderLineId { get; set; }
    public string AgencyLink { get; set; }
    public string BillToCompanyName { get; set; }
    public string BillingContactEmail { get; set; }
    public string BillingContactFirstname { get; set; }
    public string BillingContactLastname { get; set; }
    public decimal BudgetAmount { get; set; }
    
    public Currency CurrencyInfo { get; set; }
    public DateTime EndDate { get; set; }
    public decimal EstimatedMonthlySpend { get; set; }
    public string LastModifiedDateTime { get; set; }
    public string MediaContactEmail { get; set; }
    public string MediaContactFirstname { get; set; }
    public string MediaContactLastname { get; set; }
    public string OrderName { get; set; }
    public string PinOrderId { get; set; }
    public string PmpName { get; set; }
    public string PoNumber { get; set; }
    public string SalesforceOrderLineId { get; set; }
    public DateTime StartDate { get; set; }
}


