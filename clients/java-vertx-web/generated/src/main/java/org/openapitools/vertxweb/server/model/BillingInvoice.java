package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.BillingInvoiceDocumentType;
import org.openapitools.vertxweb.server.model.BillingInvoiceStatus;
import org.openapitools.vertxweb.server.model.Currency;

/**
 * A billing invoice in the advertiser account.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BillingInvoice   {
  
  private String adAccountId;
  private String adAccountName;
  private Integer amountBilledMicroCurrency;
  private Integer amountDiscountMicroCurrency;
  private Integer amountNetMicroCurrency;
  private Integer amountTaxMicroCurrency;
  private String billToCountry;
  private LocalDate billingPeriodEndDate;
  private LocalDate billingPeriodStartDate;
  private Currency currency;
  private BillingInvoiceDocumentType documentType;
  private String id;
  private LocalDate invoiceDueDate;
  private String paymentTerms;
  private BillingInvoiceStatus status;

  public BillingInvoice () {

  }

  public BillingInvoice (String adAccountId, String adAccountName, Integer amountBilledMicroCurrency, Integer amountDiscountMicroCurrency, Integer amountNetMicroCurrency, Integer amountTaxMicroCurrency, String billToCountry, LocalDate billingPeriodEndDate, LocalDate billingPeriodStartDate, Currency currency, BillingInvoiceDocumentType documentType, String id, LocalDate invoiceDueDate, String paymentTerms, BillingInvoiceStatus status) {
    this.adAccountId = adAccountId;
    this.adAccountName = adAccountName;
    this.amountBilledMicroCurrency = amountBilledMicroCurrency;
    this.amountDiscountMicroCurrency = amountDiscountMicroCurrency;
    this.amountNetMicroCurrency = amountNetMicroCurrency;
    this.amountTaxMicroCurrency = amountTaxMicroCurrency;
    this.billToCountry = billToCountry;
    this.billingPeriodEndDate = billingPeriodEndDate;
    this.billingPeriodStartDate = billingPeriodStartDate;
    this.currency = currency;
    this.documentType = documentType;
    this.id = id;
    this.invoiceDueDate = invoiceDueDate;
    this.paymentTerms = paymentTerms;
    this.status = status;
  }

    
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

    
  @JsonProperty("ad_account_name")
  public String getAdAccountName() {
    return adAccountName;
  }
  public void setAdAccountName(String adAccountName) {
    this.adAccountName = adAccountName;
  }

    
  @JsonProperty("amount_billed_micro_currency")
  public Integer getAmountBilledMicroCurrency() {
    return amountBilledMicroCurrency;
  }
  public void setAmountBilledMicroCurrency(Integer amountBilledMicroCurrency) {
    this.amountBilledMicroCurrency = amountBilledMicroCurrency;
  }

    
  @JsonProperty("amount_discount_micro_currency")
  public Integer getAmountDiscountMicroCurrency() {
    return amountDiscountMicroCurrency;
  }
  public void setAmountDiscountMicroCurrency(Integer amountDiscountMicroCurrency) {
    this.amountDiscountMicroCurrency = amountDiscountMicroCurrency;
  }

    
  @JsonProperty("amount_net_micro_currency")
  public Integer getAmountNetMicroCurrency() {
    return amountNetMicroCurrency;
  }
  public void setAmountNetMicroCurrency(Integer amountNetMicroCurrency) {
    this.amountNetMicroCurrency = amountNetMicroCurrency;
  }

    
  @JsonProperty("amount_tax_micro_currency")
  public Integer getAmountTaxMicroCurrency() {
    return amountTaxMicroCurrency;
  }
  public void setAmountTaxMicroCurrency(Integer amountTaxMicroCurrency) {
    this.amountTaxMicroCurrency = amountTaxMicroCurrency;
  }

    
  @JsonProperty("bill_to_country")
  public String getBillToCountry() {
    return billToCountry;
  }
  public void setBillToCountry(String billToCountry) {
    this.billToCountry = billToCountry;
  }

    
  @JsonProperty("billing_period_end_date")
  public LocalDate getBillingPeriodEndDate() {
    return billingPeriodEndDate;
  }
  public void setBillingPeriodEndDate(LocalDate billingPeriodEndDate) {
    this.billingPeriodEndDate = billingPeriodEndDate;
  }

    
  @JsonProperty("billing_period_start_date")
  public LocalDate getBillingPeriodStartDate() {
    return billingPeriodStartDate;
  }
  public void setBillingPeriodStartDate(LocalDate billingPeriodStartDate) {
    this.billingPeriodStartDate = billingPeriodStartDate;
  }

    
  @JsonProperty("currency")
  public Currency getCurrency() {
    return currency;
  }
  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

    
  @JsonProperty("document_type")
  public BillingInvoiceDocumentType getDocumentType() {
    return documentType;
  }
  public void setDocumentType(BillingInvoiceDocumentType documentType) {
    this.documentType = documentType;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("invoice_due_date")
  public LocalDate getInvoiceDueDate() {
    return invoiceDueDate;
  }
  public void setInvoiceDueDate(LocalDate invoiceDueDate) {
    this.invoiceDueDate = invoiceDueDate;
  }

    
  @JsonProperty("payment_terms")
  public String getPaymentTerms() {
    return paymentTerms;
  }
  public void setPaymentTerms(String paymentTerms) {
    this.paymentTerms = paymentTerms;
  }

    
  @JsonProperty("status")
  public BillingInvoiceStatus getStatus() {
    return status;
  }
  public void setStatus(BillingInvoiceStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingInvoice billingInvoice = (BillingInvoice) o;
    return Objects.equals(adAccountId, billingInvoice.adAccountId) &&
        Objects.equals(adAccountName, billingInvoice.adAccountName) &&
        Objects.equals(amountBilledMicroCurrency, billingInvoice.amountBilledMicroCurrency) &&
        Objects.equals(amountDiscountMicroCurrency, billingInvoice.amountDiscountMicroCurrency) &&
        Objects.equals(amountNetMicroCurrency, billingInvoice.amountNetMicroCurrency) &&
        Objects.equals(amountTaxMicroCurrency, billingInvoice.amountTaxMicroCurrency) &&
        Objects.equals(billToCountry, billingInvoice.billToCountry) &&
        Objects.equals(billingPeriodEndDate, billingInvoice.billingPeriodEndDate) &&
        Objects.equals(billingPeriodStartDate, billingInvoice.billingPeriodStartDate) &&
        Objects.equals(currency, billingInvoice.currency) &&
        Objects.equals(documentType, billingInvoice.documentType) &&
        Objects.equals(id, billingInvoice.id) &&
        Objects.equals(invoiceDueDate, billingInvoice.invoiceDueDate) &&
        Objects.equals(paymentTerms, billingInvoice.paymentTerms) &&
        Objects.equals(status, billingInvoice.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, adAccountName, amountBilledMicroCurrency, amountDiscountMicroCurrency, amountNetMicroCurrency, amountTaxMicroCurrency, billToCountry, billingPeriodEndDate, billingPeriodStartDate, currency, documentType, id, invoiceDueDate, paymentTerms, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingInvoice {\n");
    
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    adAccountName: ").append(toIndentedString(adAccountName)).append("\n");
    sb.append("    amountBilledMicroCurrency: ").append(toIndentedString(amountBilledMicroCurrency)).append("\n");
    sb.append("    amountDiscountMicroCurrency: ").append(toIndentedString(amountDiscountMicroCurrency)).append("\n");
    sb.append("    amountNetMicroCurrency: ").append(toIndentedString(amountNetMicroCurrency)).append("\n");
    sb.append("    amountTaxMicroCurrency: ").append(toIndentedString(amountTaxMicroCurrency)).append("\n");
    sb.append("    billToCountry: ").append(toIndentedString(billToCountry)).append("\n");
    sb.append("    billingPeriodEndDate: ").append(toIndentedString(billingPeriodEndDate)).append("\n");
    sb.append("    billingPeriodStartDate: ").append(toIndentedString(billingPeriodStartDate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invoiceDueDate: ").append(toIndentedString(invoiceDueDate)).append("\n");
    sb.append("    paymentTerms: ").append(toIndentedString(paymentTerms)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
