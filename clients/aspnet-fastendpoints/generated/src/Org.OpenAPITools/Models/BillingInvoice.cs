namespace Org.OpenAPITools.Models;


/// <summary>
/// A billing invoice in the advertiser account.
/// </summary>
public class BillingInvoice 
{
    public string AdAccountId { get; set; }
    public string AdAccountName { get; set; }
    public int AmountBilledMicroCurrency { get; set; }
    public int AmountDiscountMicroCurrency { get; set; }
    public int AmountNetMicroCurrency { get; set; }
    public int AmountTaxMicroCurrency { get; set; }
    public string BillToCountry { get; set; }
    public DateTime BillingPeriodEndDate { get; set; }
    public DateTime BillingPeriodStartDate { get; set; }
    
    public Currency Currency { get; set; }
    
    public BillingInvoiceDocumentType DocumentType { get; set; }
    public string Id { get; set; }
    public DateTime InvoiceDueDate { get; set; }
    public string PaymentTerms { get; set; }
    
    public BillingInvoiceStatus Status { get; set; }
}


