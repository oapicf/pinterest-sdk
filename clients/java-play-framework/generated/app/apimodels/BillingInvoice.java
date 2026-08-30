package apimodels;

import apimodels.BillingInvoiceDocumentType;
import apimodels.BillingInvoiceStatus;
import apimodels.Currency;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * A billing invoice in the advertiser account.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BillingInvoice   {
  @JsonProperty("ad_account_id")
  @Pattern(regexp="^\\d+$")

  private String adAccountId;

  @JsonProperty("ad_account_name")
  
  private String adAccountName;

  @JsonProperty("amount_billed_micro_currency")
  
  private Integer amountBilledMicroCurrency;

  @JsonProperty("amount_discount_micro_currency")
  
  private Integer amountDiscountMicroCurrency;

  @JsonProperty("amount_net_micro_currency")
  
  private Integer amountNetMicroCurrency;

  @JsonProperty("amount_tax_micro_currency")
  
  private Integer amountTaxMicroCurrency;

  @JsonProperty("bill_to_country")
  
  private String billToCountry;

  @JsonProperty("billing_period_end_date")
  @Valid

  private LocalDate billingPeriodEndDate;

  @JsonProperty("billing_period_start_date")
  @Valid

  private LocalDate billingPeriodStartDate;

  @JsonProperty("currency")
  @Valid

  private Currency currency;

  @JsonProperty("document_type")
  @Valid

  private BillingInvoiceDocumentType documentType;

  @JsonProperty("id")
  @Pattern(regexp="^\\d+$")

  private String id;

  @JsonProperty("invoice_due_date")
  @Valid

  private LocalDate invoiceDueDate;

  @JsonProperty("payment_terms")
  
  private String paymentTerms;

  @JsonProperty("status")
  @Valid

  private BillingInvoiceStatus status;

  public BillingInvoice adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

   /**
   * The ID of the ad account this invoice belongs to
   * @return adAccountId
  **/
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public BillingInvoice adAccountName(String adAccountName) {
    this.adAccountName = adAccountName;
    return this;
  }

   /**
   * The name of the ad account this invoice belongs to
   * @return adAccountName
  **/
  public String getAdAccountName() {
    return adAccountName;
  }

  public void setAdAccountName(String adAccountName) {
    this.adAccountName = adAccountName;
  }

  public BillingInvoice amountBilledMicroCurrency(Integer amountBilledMicroCurrency) {
    this.amountBilledMicroCurrency = amountBilledMicroCurrency;
    return this;
  }

   /**
   * The amount billed in this invoice. Denoted in micro currency
   * @return amountBilledMicroCurrency
  **/
  public Integer getAmountBilledMicroCurrency() {
    return amountBilledMicroCurrency;
  }

  public void setAmountBilledMicroCurrency(Integer amountBilledMicroCurrency) {
    this.amountBilledMicroCurrency = amountBilledMicroCurrency;
  }

  public BillingInvoice amountDiscountMicroCurrency(Integer amountDiscountMicroCurrency) {
    this.amountDiscountMicroCurrency = amountDiscountMicroCurrency;
    return this;
  }

   /**
   * The discount in this invoice. Denoted in micro currency
   * @return amountDiscountMicroCurrency
  **/
  public Integer getAmountDiscountMicroCurrency() {
    return amountDiscountMicroCurrency;
  }

  public void setAmountDiscountMicroCurrency(Integer amountDiscountMicroCurrency) {
    this.amountDiscountMicroCurrency = amountDiscountMicroCurrency;
  }

  public BillingInvoice amountNetMicroCurrency(Integer amountNetMicroCurrency) {
    this.amountNetMicroCurrency = amountNetMicroCurrency;
    return this;
  }

   /**
   * The net amount in this invoice. Denoted in micro currency
   * @return amountNetMicroCurrency
  **/
  public Integer getAmountNetMicroCurrency() {
    return amountNetMicroCurrency;
  }

  public void setAmountNetMicroCurrency(Integer amountNetMicroCurrency) {
    this.amountNetMicroCurrency = amountNetMicroCurrency;
  }

  public BillingInvoice amountTaxMicroCurrency(Integer amountTaxMicroCurrency) {
    this.amountTaxMicroCurrency = amountTaxMicroCurrency;
    return this;
  }

   /**
   * The tax in this invoice. Denoted in micro currency
   * @return amountTaxMicroCurrency
  **/
  public Integer getAmountTaxMicroCurrency() {
    return amountTaxMicroCurrency;
  }

  public void setAmountTaxMicroCurrency(Integer amountTaxMicroCurrency) {
    this.amountTaxMicroCurrency = amountTaxMicroCurrency;
  }

  public BillingInvoice billToCountry(String billToCountry) {
    this.billToCountry = billToCountry;
    return this;
  }

   /**
   * The country of the bill to address
   * @return billToCountry
  **/
  public String getBillToCountry() {
    return billToCountry;
  }

  public void setBillToCountry(String billToCountry) {
    this.billToCountry = billToCountry;
  }

  public BillingInvoice billingPeriodEndDate(LocalDate billingPeriodEndDate) {
    this.billingPeriodEndDate = billingPeriodEndDate;
    return this;
  }

   /**
   * The end date of the billing period. Format: YYYY-MM-DD
   * @return billingPeriodEndDate
  **/
  public LocalDate getBillingPeriodEndDate() {
    return billingPeriodEndDate;
  }

  public void setBillingPeriodEndDate(LocalDate billingPeriodEndDate) {
    this.billingPeriodEndDate = billingPeriodEndDate;
  }

  public BillingInvoice billingPeriodStartDate(LocalDate billingPeriodStartDate) {
    this.billingPeriodStartDate = billingPeriodStartDate;
    return this;
  }

   /**
   * The start date of the billing period. Format: YYYY-MM-DD
   * @return billingPeriodStartDate
  **/
  public LocalDate getBillingPeriodStartDate() {
    return billingPeriodStartDate;
  }

  public void setBillingPeriodStartDate(LocalDate billingPeriodStartDate) {
    this.billingPeriodStartDate = billingPeriodStartDate;
  }

  public BillingInvoice currency(Currency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  public BillingInvoice documentType(BillingInvoiceDocumentType documentType) {
    this.documentType = documentType;
    return this;
  }

   /**
   * The type of the document
   * @return documentType
  **/
  public BillingInvoiceDocumentType getDocumentType() {
    return documentType;
  }

  public void setDocumentType(BillingInvoiceDocumentType documentType) {
    this.documentType = documentType;
  }

  public BillingInvoice id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the billing invoice
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BillingInvoice invoiceDueDate(LocalDate invoiceDueDate) {
    this.invoiceDueDate = invoiceDueDate;
    return this;
  }

   /**
   * The date the invoice is due. Format: YYYY-MM-DD
   * @return invoiceDueDate
  **/
  public LocalDate getInvoiceDueDate() {
    return invoiceDueDate;
  }

  public void setInvoiceDueDate(LocalDate invoiceDueDate) {
    this.invoiceDueDate = invoiceDueDate;
  }

  public BillingInvoice paymentTerms(String paymentTerms) {
    this.paymentTerms = paymentTerms;
    return this;
  }

   /**
   * The payment terms of the invoice
   * @return paymentTerms
  **/
  public String getPaymentTerms() {
    return paymentTerms;
  }

  public void setPaymentTerms(String paymentTerms) {
    this.paymentTerms = paymentTerms;
  }

  public BillingInvoice status(BillingInvoiceStatus status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the invoice
   * @return status
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

