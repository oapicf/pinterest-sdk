package org.openapitools.model;

import org.joda.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BillingInvoiceDocumentType;
import org.openapitools.model.BillingInvoiceStatus;
import org.openapitools.model.Currency;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A billing invoice in the advertiser account.
 */
@ApiModel(description="A billing invoice in the advertiser account.")

public class BillingInvoice  {
  
 /**
  * The ID of the ad account this invoice belongs to
  */
  @ApiModelProperty(value = "The ID of the ad account this invoice belongs to")

  private String adAccountId;

 /**
  * The name of the ad account this invoice belongs to
  */
  @ApiModelProperty(value = "The name of the ad account this invoice belongs to")

  private String adAccountName;

 /**
  * The amount billed in this invoice. Denoted in micro currency
  */
  @ApiModelProperty(value = "The amount billed in this invoice. Denoted in micro currency")

  private Integer amountBilledMicroCurrency;

 /**
  * The discount in this invoice. Denoted in micro currency
  */
  @ApiModelProperty(value = "The discount in this invoice. Denoted in micro currency")

  private Integer amountDiscountMicroCurrency;

 /**
  * The net amount in this invoice. Denoted in micro currency
  */
  @ApiModelProperty(value = "The net amount in this invoice. Denoted in micro currency")

  private Integer amountNetMicroCurrency;

 /**
  * The tax in this invoice. Denoted in micro currency
  */
  @ApiModelProperty(value = "The tax in this invoice. Denoted in micro currency")

  private Integer amountTaxMicroCurrency;

 /**
  * The country of the bill to address
  */
  @ApiModelProperty(value = "The country of the bill to address")

  private String billToCountry;

 /**
  * The end date of the billing period. Format: YYYY-MM-DD
  */
  @ApiModelProperty(value = "The end date of the billing period. Format: YYYY-MM-DD")

  private LocalDate billingPeriodEndDate;

 /**
  * The start date of the billing period. Format: YYYY-MM-DD
  */
  @ApiModelProperty(value = "The start date of the billing period. Format: YYYY-MM-DD")

  private LocalDate billingPeriodStartDate;

  @ApiModelProperty(value = "")

  private Currency currency;

 /**
  * The type of the document
  */
  @ApiModelProperty(value = "The type of the document")

  private BillingInvoiceDocumentType documentType;

 /**
  * Unique identifier for the billing invoice
  */
  @ApiModelProperty(value = "Unique identifier for the billing invoice")

  private String id;

 /**
  * The date the invoice is due. Format: YYYY-MM-DD
  */
  @ApiModelProperty(value = "The date the invoice is due. Format: YYYY-MM-DD")

  private LocalDate invoiceDueDate;

 /**
  * The payment terms of the invoice
  */
  @ApiModelProperty(example = "NET 30", value = "The payment terms of the invoice")

  private String paymentTerms;

 /**
  * The status of the invoice
  */
  @ApiModelProperty(example = "OPEN", value = "The status of the invoice")

  private BillingInvoiceStatus status;
 /**
   * The ID of the ad account this invoice belongs to
   * @return adAccountId
  **/
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public BillingInvoice adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

 /**
   * The name of the ad account this invoice belongs to
   * @return adAccountName
  **/
  @JsonProperty("ad_account_name")
  public String getAdAccountName() {
    return adAccountName;
  }

  public void setAdAccountName(String adAccountName) {
    this.adAccountName = adAccountName;
  }

  public BillingInvoice adAccountName(String adAccountName) {
    this.adAccountName = adAccountName;
    return this;
  }

 /**
   * The amount billed in this invoice. Denoted in micro currency
   * @return amountBilledMicroCurrency
  **/
  @JsonProperty("amount_billed_micro_currency")
  public Integer getAmountBilledMicroCurrency() {
    return amountBilledMicroCurrency;
  }

  public void setAmountBilledMicroCurrency(Integer amountBilledMicroCurrency) {
    this.amountBilledMicroCurrency = amountBilledMicroCurrency;
  }

  public BillingInvoice amountBilledMicroCurrency(Integer amountBilledMicroCurrency) {
    this.amountBilledMicroCurrency = amountBilledMicroCurrency;
    return this;
  }

 /**
   * The discount in this invoice. Denoted in micro currency
   * @return amountDiscountMicroCurrency
  **/
  @JsonProperty("amount_discount_micro_currency")
  public Integer getAmountDiscountMicroCurrency() {
    return amountDiscountMicroCurrency;
  }

  public void setAmountDiscountMicroCurrency(Integer amountDiscountMicroCurrency) {
    this.amountDiscountMicroCurrency = amountDiscountMicroCurrency;
  }

  public BillingInvoice amountDiscountMicroCurrency(Integer amountDiscountMicroCurrency) {
    this.amountDiscountMicroCurrency = amountDiscountMicroCurrency;
    return this;
  }

 /**
   * The net amount in this invoice. Denoted in micro currency
   * @return amountNetMicroCurrency
  **/
  @JsonProperty("amount_net_micro_currency")
  public Integer getAmountNetMicroCurrency() {
    return amountNetMicroCurrency;
  }

  public void setAmountNetMicroCurrency(Integer amountNetMicroCurrency) {
    this.amountNetMicroCurrency = amountNetMicroCurrency;
  }

  public BillingInvoice amountNetMicroCurrency(Integer amountNetMicroCurrency) {
    this.amountNetMicroCurrency = amountNetMicroCurrency;
    return this;
  }

 /**
   * The tax in this invoice. Denoted in micro currency
   * @return amountTaxMicroCurrency
  **/
  @JsonProperty("amount_tax_micro_currency")
  public Integer getAmountTaxMicroCurrency() {
    return amountTaxMicroCurrency;
  }

  public void setAmountTaxMicroCurrency(Integer amountTaxMicroCurrency) {
    this.amountTaxMicroCurrency = amountTaxMicroCurrency;
  }

  public BillingInvoice amountTaxMicroCurrency(Integer amountTaxMicroCurrency) {
    this.amountTaxMicroCurrency = amountTaxMicroCurrency;
    return this;
  }

 /**
   * The country of the bill to address
   * @return billToCountry
  **/
  @JsonProperty("bill_to_country")
  public String getBillToCountry() {
    return billToCountry;
  }

  public void setBillToCountry(String billToCountry) {
    this.billToCountry = billToCountry;
  }

  public BillingInvoice billToCountry(String billToCountry) {
    this.billToCountry = billToCountry;
    return this;
  }

 /**
   * The end date of the billing period. Format: YYYY-MM-DD
   * @return billingPeriodEndDate
  **/
  @JsonProperty("billing_period_end_date")
  public LocalDate getBillingPeriodEndDate() {
    return billingPeriodEndDate;
  }

  public void setBillingPeriodEndDate(LocalDate billingPeriodEndDate) {
    this.billingPeriodEndDate = billingPeriodEndDate;
  }

  public BillingInvoice billingPeriodEndDate(LocalDate billingPeriodEndDate) {
    this.billingPeriodEndDate = billingPeriodEndDate;
    return this;
  }

 /**
   * The start date of the billing period. Format: YYYY-MM-DD
   * @return billingPeriodStartDate
  **/
  @JsonProperty("billing_period_start_date")
  public LocalDate getBillingPeriodStartDate() {
    return billingPeriodStartDate;
  }

  public void setBillingPeriodStartDate(LocalDate billingPeriodStartDate) {
    this.billingPeriodStartDate = billingPeriodStartDate;
  }

  public BillingInvoice billingPeriodStartDate(LocalDate billingPeriodStartDate) {
    this.billingPeriodStartDate = billingPeriodStartDate;
    return this;
  }

 /**
   * Get currency
   * @return currency
  **/
  @JsonProperty("currency")
  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  public BillingInvoice currency(Currency currency) {
    this.currency = currency;
    return this;
  }

 /**
   * The type of the document
   * @return documentType
  **/
  @JsonProperty("document_type")
  public BillingInvoiceDocumentType getDocumentType() {
    return documentType;
  }

  public void setDocumentType(BillingInvoiceDocumentType documentType) {
    this.documentType = documentType;
  }

  public BillingInvoice documentType(BillingInvoiceDocumentType documentType) {
    this.documentType = documentType;
    return this;
  }

 /**
   * Unique identifier for the billing invoice
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BillingInvoice id(String id) {
    this.id = id;
    return this;
  }

 /**
   * The date the invoice is due. Format: YYYY-MM-DD
   * @return invoiceDueDate
  **/
  @JsonProperty("invoice_due_date")
  public LocalDate getInvoiceDueDate() {
    return invoiceDueDate;
  }

  public void setInvoiceDueDate(LocalDate invoiceDueDate) {
    this.invoiceDueDate = invoiceDueDate;
  }

  public BillingInvoice invoiceDueDate(LocalDate invoiceDueDate) {
    this.invoiceDueDate = invoiceDueDate;
    return this;
  }

 /**
   * The payment terms of the invoice
   * @return paymentTerms
  **/
  @JsonProperty("payment_terms")
  public String getPaymentTerms() {
    return paymentTerms;
  }

  public void setPaymentTerms(String paymentTerms) {
    this.paymentTerms = paymentTerms;
  }

  public BillingInvoice paymentTerms(String paymentTerms) {
    this.paymentTerms = paymentTerms;
    return this;
  }

 /**
   * The status of the invoice
   * @return status
  **/
  @JsonProperty("status")
  public BillingInvoiceStatus getStatus() {
    return status;
  }

  public void setStatus(BillingInvoiceStatus status) {
    this.status = status;
  }

  public BillingInvoice status(BillingInvoiceStatus status) {
    this.status = status;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

