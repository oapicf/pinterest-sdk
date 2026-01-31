package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.Currency;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * BillingInvoiceResponse
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-31T04:52:46.215362801Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BillingInvoiceResponse   {
  @JsonProperty("ad_account_id")
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
  private LocalDate billingPeriodEndDate;

  @JsonProperty("billing_period_start_date")
  private LocalDate billingPeriodStartDate;

  @JsonProperty("currency")
  private Currency currency;

  /**
   * The type of the document
   */
  public enum DocumentTypeEnum {
    INVOICE("INVOICE"),
    
    CREDIT_MEMO("CREDIT_MEMO");

    private String value;

    DocumentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DocumentTypeEnum fromValue(String text) {
      for (DocumentTypeEnum b : DocumentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("document_type")
  private DocumentTypeEnum documentType;

  @JsonProperty("id")
  private String id;

  @JsonProperty("invoice_due_date")
  private LocalDate invoiceDueDate;

  @JsonProperty("payment_terms")
  private String paymentTerms;

  /**
   * The status of the invoice
   */
  public enum StatusEnum {
    OPEN("OPEN"),
    
    CLOSED("CLOSED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  public BillingInvoiceResponse adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  /**
   * The ID of the ad account this invoice belongs to
   * @return adAccountId
   */
  @ApiModelProperty(value = "The ID of the ad account this invoice belongs to")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public BillingInvoiceResponse adAccountName(String adAccountName) {
    this.adAccountName = adAccountName;
    return this;
  }

  /**
   * The name of the ad account this invoice belongs to
   * @return adAccountName
   */
  @ApiModelProperty(value = "The name of the ad account this invoice belongs to")
  public String getAdAccountName() {
    return adAccountName;
  }

  public void setAdAccountName(String adAccountName) {
    this.adAccountName = adAccountName;
  }

  public BillingInvoiceResponse amountBilledMicroCurrency(Integer amountBilledMicroCurrency) {
    this.amountBilledMicroCurrency = amountBilledMicroCurrency;
    return this;
  }

  /**
   * The amount billed in this invoice. Denoted in micro currency
   * @return amountBilledMicroCurrency
   */
  @ApiModelProperty(value = "The amount billed in this invoice. Denoted in micro currency")
  public Integer getAmountBilledMicroCurrency() {
    return amountBilledMicroCurrency;
  }

  public void setAmountBilledMicroCurrency(Integer amountBilledMicroCurrency) {
    this.amountBilledMicroCurrency = amountBilledMicroCurrency;
  }

  public BillingInvoiceResponse amountDiscountMicroCurrency(Integer amountDiscountMicroCurrency) {
    this.amountDiscountMicroCurrency = amountDiscountMicroCurrency;
    return this;
  }

  /**
   * The discount in this invoice. Denoted in micro currency
   * @return amountDiscountMicroCurrency
   */
  @ApiModelProperty(value = "The discount in this invoice. Denoted in micro currency")
  public Integer getAmountDiscountMicroCurrency() {
    return amountDiscountMicroCurrency;
  }

  public void setAmountDiscountMicroCurrency(Integer amountDiscountMicroCurrency) {
    this.amountDiscountMicroCurrency = amountDiscountMicroCurrency;
  }

  public BillingInvoiceResponse amountNetMicroCurrency(Integer amountNetMicroCurrency) {
    this.amountNetMicroCurrency = amountNetMicroCurrency;
    return this;
  }

  /**
   * The net amount in this invoice. Denoted in micro currency
   * @return amountNetMicroCurrency
   */
  @ApiModelProperty(value = "The net amount in this invoice. Denoted in micro currency")
  public Integer getAmountNetMicroCurrency() {
    return amountNetMicroCurrency;
  }

  public void setAmountNetMicroCurrency(Integer amountNetMicroCurrency) {
    this.amountNetMicroCurrency = amountNetMicroCurrency;
  }

  public BillingInvoiceResponse amountTaxMicroCurrency(Integer amountTaxMicroCurrency) {
    this.amountTaxMicroCurrency = amountTaxMicroCurrency;
    return this;
  }

  /**
   * The tax in this invoice. Denoted in micro currency
   * @return amountTaxMicroCurrency
   */
  @ApiModelProperty(value = "The tax in this invoice. Denoted in micro currency")
  public Integer getAmountTaxMicroCurrency() {
    return amountTaxMicroCurrency;
  }

  public void setAmountTaxMicroCurrency(Integer amountTaxMicroCurrency) {
    this.amountTaxMicroCurrency = amountTaxMicroCurrency;
  }

  public BillingInvoiceResponse billToCountry(String billToCountry) {
    this.billToCountry = billToCountry;
    return this;
  }

  /**
   * The country of the bill to address
   * @return billToCountry
   */
  @ApiModelProperty(value = "The country of the bill to address")
  public String getBillToCountry() {
    return billToCountry;
  }

  public void setBillToCountry(String billToCountry) {
    this.billToCountry = billToCountry;
  }

  public BillingInvoiceResponse billingPeriodEndDate(LocalDate billingPeriodEndDate) {
    this.billingPeriodEndDate = billingPeriodEndDate;
    return this;
  }

  /**
   * The end date of the billing period. Format: YYYY-MM-DD
   * @return billingPeriodEndDate
   */
  @ApiModelProperty(value = "The end date of the billing period. Format: YYYY-MM-DD")
  public LocalDate getBillingPeriodEndDate() {
    return billingPeriodEndDate;
  }

  public void setBillingPeriodEndDate(LocalDate billingPeriodEndDate) {
    this.billingPeriodEndDate = billingPeriodEndDate;
  }

  public BillingInvoiceResponse billingPeriodStartDate(LocalDate billingPeriodStartDate) {
    this.billingPeriodStartDate = billingPeriodStartDate;
    return this;
  }

  /**
   * The start date of the billing period. Format: YYYY-MM-DD
   * @return billingPeriodStartDate
   */
  @ApiModelProperty(value = "The start date of the billing period. Format: YYYY-MM-DD")
  public LocalDate getBillingPeriodStartDate() {
    return billingPeriodStartDate;
  }

  public void setBillingPeriodStartDate(LocalDate billingPeriodStartDate) {
    this.billingPeriodStartDate = billingPeriodStartDate;
  }

  public BillingInvoiceResponse currency(Currency currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   */
  @ApiModelProperty(value = "")
  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  public BillingInvoiceResponse documentType(DocumentTypeEnum documentType) {
    this.documentType = documentType;
    return this;
  }

  /**
   * The type of the document
   * @return documentType
   */
  @ApiModelProperty(value = "The type of the document")
  public DocumentTypeEnum getDocumentType() {
    return documentType;
  }

  public void setDocumentType(DocumentTypeEnum documentType) {
    this.documentType = documentType;
  }

  public BillingInvoiceResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the billing invoice
   * @return id
   */
  @ApiModelProperty(value = "Unique identifier for the billing invoice")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BillingInvoiceResponse invoiceDueDate(LocalDate invoiceDueDate) {
    this.invoiceDueDate = invoiceDueDate;
    return this;
  }

  /**
   * The date the invoice is due. Format: YYYY-MM-DD
   * @return invoiceDueDate
   */
  @ApiModelProperty(value = "The date the invoice is due. Format: YYYY-MM-DD")
  public LocalDate getInvoiceDueDate() {
    return invoiceDueDate;
  }

  public void setInvoiceDueDate(LocalDate invoiceDueDate) {
    this.invoiceDueDate = invoiceDueDate;
  }

  public BillingInvoiceResponse paymentTerms(String paymentTerms) {
    this.paymentTerms = paymentTerms;
    return this;
  }

  /**
   * The payment terms of the invoice
   * @return paymentTerms
   */
  @ApiModelProperty(example = "NET 30", value = "The payment terms of the invoice")
  public String getPaymentTerms() {
    return paymentTerms;
  }

  public void setPaymentTerms(String paymentTerms) {
    this.paymentTerms = paymentTerms;
  }

  public BillingInvoiceResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the invoice
   * @return status
   */
  @ApiModelProperty(example = "OPEN", value = "The status of the invoice")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
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
    BillingInvoiceResponse billingInvoiceResponse = (BillingInvoiceResponse) o;
    return Objects.equals(this.adAccountId, billingInvoiceResponse.adAccountId) &&
        Objects.equals(this.adAccountName, billingInvoiceResponse.adAccountName) &&
        Objects.equals(this.amountBilledMicroCurrency, billingInvoiceResponse.amountBilledMicroCurrency) &&
        Objects.equals(this.amountDiscountMicroCurrency, billingInvoiceResponse.amountDiscountMicroCurrency) &&
        Objects.equals(this.amountNetMicroCurrency, billingInvoiceResponse.amountNetMicroCurrency) &&
        Objects.equals(this.amountTaxMicroCurrency, billingInvoiceResponse.amountTaxMicroCurrency) &&
        Objects.equals(this.billToCountry, billingInvoiceResponse.billToCountry) &&
        Objects.equals(this.billingPeriodEndDate, billingInvoiceResponse.billingPeriodEndDate) &&
        Objects.equals(this.billingPeriodStartDate, billingInvoiceResponse.billingPeriodStartDate) &&
        Objects.equals(this.currency, billingInvoiceResponse.currency) &&
        Objects.equals(this.documentType, billingInvoiceResponse.documentType) &&
        Objects.equals(this.id, billingInvoiceResponse.id) &&
        Objects.equals(this.invoiceDueDate, billingInvoiceResponse.invoiceDueDate) &&
        Objects.equals(this.paymentTerms, billingInvoiceResponse.paymentTerms) &&
        Objects.equals(this.status, billingInvoiceResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, adAccountName, amountBilledMicroCurrency, amountDiscountMicroCurrency, amountNetMicroCurrency, amountTaxMicroCurrency, billToCountry, billingPeriodEndDate, billingPeriodStartDate, currency, documentType, id, invoiceDueDate, paymentTerms, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingInvoiceResponse {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

