/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BillingInvoiceDocumentType;
import org.openapitools.model.BillingInvoiceStatus;
import org.openapitools.model.Currency;



/**
 * A billing invoice in the advertiser account.
 */

@ApiModel(description = "A billing invoice in the advertiser account.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BillingInvoice   {
  
  private String adAccountId;
  private String adAccountName;
  private Integer amountBilledMicroCurrency;
  private Integer amountDiscountMicroCurrency;
  private Integer amountNetMicroCurrency;
  private Integer amountTaxMicroCurrency;
  private String billToCountry;
  private Date billingPeriodEndDate;
  private Date billingPeriodStartDate;
  private Currency currency;
  private BillingInvoiceDocumentType documentType;
  private String id;
  private Date invoiceDueDate;
  private String paymentTerms;
  private BillingInvoiceStatus status;

  /**
   * The ID of the ad account this invoice belongs to
   */
  public BillingInvoice adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  
  @ApiModelProperty(value = "The ID of the ad account this invoice belongs to")
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * The name of the ad account this invoice belongs to
   */
  public BillingInvoice adAccountName(String adAccountName) {
    this.adAccountName = adAccountName;
    return this;
  }

  
  @ApiModelProperty(value = "The name of the ad account this invoice belongs to")
  @JsonProperty("ad_account_name")
  public String getAdAccountName() {
    return adAccountName;
  }
  public void setAdAccountName(String adAccountName) {
    this.adAccountName = adAccountName;
  }

  /**
   * The amount billed in this invoice. Denoted in micro currency
   */
  public BillingInvoice amountBilledMicroCurrency(Integer amountBilledMicroCurrency) {
    this.amountBilledMicroCurrency = amountBilledMicroCurrency;
    return this;
  }

  
  @ApiModelProperty(value = "The amount billed in this invoice. Denoted in micro currency")
  @JsonProperty("amount_billed_micro_currency")
  public Integer getAmountBilledMicroCurrency() {
    return amountBilledMicroCurrency;
  }
  public void setAmountBilledMicroCurrency(Integer amountBilledMicroCurrency) {
    this.amountBilledMicroCurrency = amountBilledMicroCurrency;
  }

  /**
   * The discount in this invoice. Denoted in micro currency
   */
  public BillingInvoice amountDiscountMicroCurrency(Integer amountDiscountMicroCurrency) {
    this.amountDiscountMicroCurrency = amountDiscountMicroCurrency;
    return this;
  }

  
  @ApiModelProperty(value = "The discount in this invoice. Denoted in micro currency")
  @JsonProperty("amount_discount_micro_currency")
  public Integer getAmountDiscountMicroCurrency() {
    return amountDiscountMicroCurrency;
  }
  public void setAmountDiscountMicroCurrency(Integer amountDiscountMicroCurrency) {
    this.amountDiscountMicroCurrency = amountDiscountMicroCurrency;
  }

  /**
   * The net amount in this invoice. Denoted in micro currency
   */
  public BillingInvoice amountNetMicroCurrency(Integer amountNetMicroCurrency) {
    this.amountNetMicroCurrency = amountNetMicroCurrency;
    return this;
  }

  
  @ApiModelProperty(value = "The net amount in this invoice. Denoted in micro currency")
  @JsonProperty("amount_net_micro_currency")
  public Integer getAmountNetMicroCurrency() {
    return amountNetMicroCurrency;
  }
  public void setAmountNetMicroCurrency(Integer amountNetMicroCurrency) {
    this.amountNetMicroCurrency = amountNetMicroCurrency;
  }

  /**
   * The tax in this invoice. Denoted in micro currency
   */
  public BillingInvoice amountTaxMicroCurrency(Integer amountTaxMicroCurrency) {
    this.amountTaxMicroCurrency = amountTaxMicroCurrency;
    return this;
  }

  
  @ApiModelProperty(value = "The tax in this invoice. Denoted in micro currency")
  @JsonProperty("amount_tax_micro_currency")
  public Integer getAmountTaxMicroCurrency() {
    return amountTaxMicroCurrency;
  }
  public void setAmountTaxMicroCurrency(Integer amountTaxMicroCurrency) {
    this.amountTaxMicroCurrency = amountTaxMicroCurrency;
  }

  /**
   * The country of the bill to address
   */
  public BillingInvoice billToCountry(String billToCountry) {
    this.billToCountry = billToCountry;
    return this;
  }

  
  @ApiModelProperty(value = "The country of the bill to address")
  @JsonProperty("bill_to_country")
  public String getBillToCountry() {
    return billToCountry;
  }
  public void setBillToCountry(String billToCountry) {
    this.billToCountry = billToCountry;
  }

  /**
   * The end date of the billing period. Format: YYYY-MM-DD
   */
  public BillingInvoice billingPeriodEndDate(Date billingPeriodEndDate) {
    this.billingPeriodEndDate = billingPeriodEndDate;
    return this;
  }

  
  @ApiModelProperty(value = "The end date of the billing period. Format: YYYY-MM-DD")
  @JsonProperty("billing_period_end_date")
  public Date getBillingPeriodEndDate() {
    return billingPeriodEndDate;
  }
  public void setBillingPeriodEndDate(Date billingPeriodEndDate) {
    this.billingPeriodEndDate = billingPeriodEndDate;
  }

  /**
   * The start date of the billing period. Format: YYYY-MM-DD
   */
  public BillingInvoice billingPeriodStartDate(Date billingPeriodStartDate) {
    this.billingPeriodStartDate = billingPeriodStartDate;
    return this;
  }

  
  @ApiModelProperty(value = "The start date of the billing period. Format: YYYY-MM-DD")
  @JsonProperty("billing_period_start_date")
  public Date getBillingPeriodStartDate() {
    return billingPeriodStartDate;
  }
  public void setBillingPeriodStartDate(Date billingPeriodStartDate) {
    this.billingPeriodStartDate = billingPeriodStartDate;
  }

  /**
   */
  public BillingInvoice currency(Currency currency) {
    this.currency = currency;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("currency")
  public Currency getCurrency() {
    return currency;
  }
  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  /**
   * The type of the document
   */
  public BillingInvoice documentType(BillingInvoiceDocumentType documentType) {
    this.documentType = documentType;
    return this;
  }

  
  @ApiModelProperty(value = "The type of the document")
  @JsonProperty("document_type")
  public BillingInvoiceDocumentType getDocumentType() {
    return documentType;
  }
  public void setDocumentType(BillingInvoiceDocumentType documentType) {
    this.documentType = documentType;
  }

  /**
   * Unique identifier for the billing invoice
   */
  public BillingInvoice id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Unique identifier for the billing invoice")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The date the invoice is due. Format: YYYY-MM-DD
   */
  public BillingInvoice invoiceDueDate(Date invoiceDueDate) {
    this.invoiceDueDate = invoiceDueDate;
    return this;
  }

  
  @ApiModelProperty(value = "The date the invoice is due. Format: YYYY-MM-DD")
  @JsonProperty("invoice_due_date")
  public Date getInvoiceDueDate() {
    return invoiceDueDate;
  }
  public void setInvoiceDueDate(Date invoiceDueDate) {
    this.invoiceDueDate = invoiceDueDate;
  }

  /**
   * The payment terms of the invoice
   */
  public BillingInvoice paymentTerms(String paymentTerms) {
    this.paymentTerms = paymentTerms;
    return this;
  }

  
  @ApiModelProperty(example = "NET 30", value = "The payment terms of the invoice")
  @JsonProperty("payment_terms")
  public String getPaymentTerms() {
    return paymentTerms;
  }
  public void setPaymentTerms(String paymentTerms) {
    this.paymentTerms = paymentTerms;
  }

  /**
   * The status of the invoice
   */
  public BillingInvoice status(BillingInvoiceStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(example = "OPEN", value = "The status of the invoice")
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

