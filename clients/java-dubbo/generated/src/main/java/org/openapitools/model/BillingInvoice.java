package org.openapitools.model;

import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BillingInvoiceDocumentType;
import org.openapitools.model.BillingInvoiceStatus;
import org.openapitools.model.Currency;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * A billing invoice in the advertiser account.
 */
public class BillingInvoice implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The ID of the ad account this invoice belongs to
   */
  @JsonProperty("ad_account_id")
  private String adAccountId;

  /**
   * The name of the ad account this invoice belongs to
   */
  @JsonProperty("ad_account_name")
  private String adAccountName;

  /**
   * The amount billed in this invoice. Denoted in micro currency
   */
  @JsonProperty("amount_billed_micro_currency")
  private Integer amountBilledMicroCurrency;

  /**
   * The discount in this invoice. Denoted in micro currency
   */
  @JsonProperty("amount_discount_micro_currency")
  private Integer amountDiscountMicroCurrency;

  /**
   * The net amount in this invoice. Denoted in micro currency
   */
  @JsonProperty("amount_net_micro_currency")
  private Integer amountNetMicroCurrency;

  /**
   * The tax in this invoice. Denoted in micro currency
   */
  @JsonProperty("amount_tax_micro_currency")
  private Integer amountTaxMicroCurrency;

  /**
   * The country of the bill to address
   */
  @JsonProperty("bill_to_country")
  private String billToCountry;

  /**
   * The end date of the billing period. Format: YYYY-MM-DD
   */
  @JsonProperty("billing_period_end_date")
  private LocalDate billingPeriodEndDate;

  /**
   * The start date of the billing period. Format: YYYY-MM-DD
   */
  @JsonProperty("billing_period_start_date")
  private LocalDate billingPeriodStartDate;

  @JsonProperty("currency")
  private Currency currency;

  /**
   * The type of the document
   */
  @JsonProperty("document_type")
  private BillingInvoiceDocumentType documentType;

  /**
   * Unique identifier for the billing invoice
   */
  @JsonProperty("id")
  private String id;

  /**
   * The date the invoice is due. Format: YYYY-MM-DD
   */
  @JsonProperty("invoice_due_date")
  private LocalDate invoiceDueDate;

  /**
   * The payment terms of the invoice
   */
  @JsonProperty("payment_terms")
  private String paymentTerms;

  /**
   * The status of the invoice
   */
  @JsonProperty("status")
  private BillingInvoiceStatus status;

  /**
   * The ID of the ad account this invoice belongs to
   * @return adAccountId
   */
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * The name of the ad account this invoice belongs to
   * @return adAccountName
   */
  public String getAdAccountName() {
    return adAccountName;
  }

  public void setAdAccountName(String adAccountName) {
    this.adAccountName = adAccountName;
  }

  /**
   * The amount billed in this invoice. Denoted in micro currency
   * @return amountBilledMicroCurrency
   */
  public Integer getAmountBilledMicroCurrency() {
    return amountBilledMicroCurrency;
  }

  public void setAmountBilledMicroCurrency(Integer amountBilledMicroCurrency) {
    this.amountBilledMicroCurrency = amountBilledMicroCurrency;
  }

  /**
   * The discount in this invoice. Denoted in micro currency
   * @return amountDiscountMicroCurrency
   */
  public Integer getAmountDiscountMicroCurrency() {
    return amountDiscountMicroCurrency;
  }

  public void setAmountDiscountMicroCurrency(Integer amountDiscountMicroCurrency) {
    this.amountDiscountMicroCurrency = amountDiscountMicroCurrency;
  }

  /**
   * The net amount in this invoice. Denoted in micro currency
   * @return amountNetMicroCurrency
   */
  public Integer getAmountNetMicroCurrency() {
    return amountNetMicroCurrency;
  }

  public void setAmountNetMicroCurrency(Integer amountNetMicroCurrency) {
    this.amountNetMicroCurrency = amountNetMicroCurrency;
  }

  /**
   * The tax in this invoice. Denoted in micro currency
   * @return amountTaxMicroCurrency
   */
  public Integer getAmountTaxMicroCurrency() {
    return amountTaxMicroCurrency;
  }

  public void setAmountTaxMicroCurrency(Integer amountTaxMicroCurrency) {
    this.amountTaxMicroCurrency = amountTaxMicroCurrency;
  }

  /**
   * The country of the bill to address
   * @return billToCountry
   */
  public String getBillToCountry() {
    return billToCountry;
  }

  public void setBillToCountry(String billToCountry) {
    this.billToCountry = billToCountry;
  }

  /**
   * The end date of the billing period. Format: YYYY-MM-DD
   * @return billingPeriodEndDate
   */
  public LocalDate getBillingPeriodEndDate() {
    return billingPeriodEndDate;
  }

  public void setBillingPeriodEndDate(LocalDate billingPeriodEndDate) {
    this.billingPeriodEndDate = billingPeriodEndDate;
  }

  /**
   * The start date of the billing period. Format: YYYY-MM-DD
   * @return billingPeriodStartDate
   */
  public LocalDate getBillingPeriodStartDate() {
    return billingPeriodStartDate;
  }

  public void setBillingPeriodStartDate(LocalDate billingPeriodStartDate) {
    this.billingPeriodStartDate = billingPeriodStartDate;
  }

  /**
   * 
   * @return currency
   */
  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  /**
   * The type of the document
   * @return documentType
   */
  public BillingInvoiceDocumentType getDocumentType() {
    return documentType;
  }

  public void setDocumentType(BillingInvoiceDocumentType documentType) {
    this.documentType = documentType;
  }

  /**
   * Unique identifier for the billing invoice
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The date the invoice is due. Format: YYYY-MM-DD
   * @return invoiceDueDate
   */
  public LocalDate getInvoiceDueDate() {
    return invoiceDueDate;
  }

  public void setInvoiceDueDate(LocalDate invoiceDueDate) {
    this.invoiceDueDate = invoiceDueDate;
  }

  /**
   * The payment terms of the invoice
   * @return paymentTerms
   */
  public String getPaymentTerms() {
    return paymentTerms;
  }

  public void setPaymentTerms(String paymentTerms) {
    this.paymentTerms = paymentTerms;
  }

  /**
   * The status of the invoice
   * @return status
   */
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
    return Objects.equals(this.adAccountId, billingInvoice.adAccountId) &&
        Objects.equals(this.adAccountName, billingInvoice.adAccountName) &&
        Objects.equals(this.amountBilledMicroCurrency, billingInvoice.amountBilledMicroCurrency) &&
        Objects.equals(this.amountDiscountMicroCurrency, billingInvoice.amountDiscountMicroCurrency) &&
        Objects.equals(this.amountNetMicroCurrency, billingInvoice.amountNetMicroCurrency) &&
        Objects.equals(this.amountTaxMicroCurrency, billingInvoice.amountTaxMicroCurrency) &&
        Objects.equals(this.billToCountry, billingInvoice.billToCountry) &&
        Objects.equals(this.billingPeriodEndDate, billingInvoice.billingPeriodEndDate) &&
        Objects.equals(this.billingPeriodStartDate, billingInvoice.billingPeriodStartDate) &&
        Objects.equals(this.currency, billingInvoice.currency) &&
        Objects.equals(this.documentType, billingInvoice.documentType) &&
        Objects.equals(this.id, billingInvoice.id) &&
        Objects.equals(this.invoiceDueDate, billingInvoice.invoiceDueDate) &&
        Objects.equals(this.paymentTerms, billingInvoice.paymentTerms) &&
        Objects.equals(this.status, billingInvoice.status);
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
