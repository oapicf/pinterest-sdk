package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.joda.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.Currency;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BillingInvoiceResponse  {
  
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
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDate billingPeriodEndDate;

 /**
  * The start date of the billing period. Format: YYYY-MM-DD
  */
  @ApiModelProperty(value = "The start date of the billing period. Format: YYYY-MM-DD")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDate billingPeriodStartDate;

  @ApiModelProperty(value = "")
  @Valid
  private Currency currency;

public enum DocumentTypeEnum {

    @JsonProperty("INVOICE") INVOICE(String.valueOf("INVOICE")),
    @JsonProperty("CREDIT_MEMO") CREDIT_MEMO(String.valueOf("CREDIT_MEMO"));

    private String value;

    DocumentTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DocumentTypeEnum fromValue(String value) {
        for (DocumentTypeEnum b : DocumentTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The type of the document
  */
  @ApiModelProperty(value = "The type of the document")
  private DocumentTypeEnum documentType;

 /**
  * Unique identifier for the billing invoice
  */
  @ApiModelProperty(value = "Unique identifier for the billing invoice")
  private String id;

 /**
  * The date the invoice is due. Format: YYYY-MM-DD
  */
  @ApiModelProperty(value = "The date the invoice is due. Format: YYYY-MM-DD")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDate invoiceDueDate;

 /**
  * The payment terms of the invoice
  */
  @ApiModelProperty(example = "NET 30", value = "The payment terms of the invoice")
  private String paymentTerms;

public enum StatusEnum {

    @JsonProperty("OPEN") OPEN(String.valueOf("OPEN")),
    @JsonProperty("CLOSED") CLOSED(String.valueOf("CLOSED"));

    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
        for (StatusEnum b : StatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The status of the invoice
  */
  @ApiModelProperty(example = "OPEN", value = "The status of the invoice")
  private StatusEnum status;
 /**
  * The ID of the ad account this invoice belongs to
  * @return adAccountId
  */
  @JsonProperty("ad_account_id")
 @Pattern(regexp="^\\d+$")  public String getAdAccountId() {
    return adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   */
 public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   */
  public BillingInvoiceResponse adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

 /**
  * The name of the ad account this invoice belongs to
  * @return adAccountName
  */
  @JsonProperty("ad_account_name")
  public String getAdAccountName() {
    return adAccountName;
  }

  /**
   * Sets the <code>adAccountName</code> property.
   */
 public void setAdAccountName(String adAccountName) {
    this.adAccountName = adAccountName;
  }

  /**
   * Sets the <code>adAccountName</code> property.
   */
  public BillingInvoiceResponse adAccountName(String adAccountName) {
    this.adAccountName = adAccountName;
    return this;
  }

 /**
  * The amount billed in this invoice. Denoted in micro currency
  * @return amountBilledMicroCurrency
  */
  @JsonProperty("amount_billed_micro_currency")
  public Integer getAmountBilledMicroCurrency() {
    return amountBilledMicroCurrency;
  }

  /**
   * Sets the <code>amountBilledMicroCurrency</code> property.
   */
 public void setAmountBilledMicroCurrency(Integer amountBilledMicroCurrency) {
    this.amountBilledMicroCurrency = amountBilledMicroCurrency;
  }

  /**
   * Sets the <code>amountBilledMicroCurrency</code> property.
   */
  public BillingInvoiceResponse amountBilledMicroCurrency(Integer amountBilledMicroCurrency) {
    this.amountBilledMicroCurrency = amountBilledMicroCurrency;
    return this;
  }

 /**
  * The discount in this invoice. Denoted in micro currency
  * @return amountDiscountMicroCurrency
  */
  @JsonProperty("amount_discount_micro_currency")
  public Integer getAmountDiscountMicroCurrency() {
    return amountDiscountMicroCurrency;
  }

  /**
   * Sets the <code>amountDiscountMicroCurrency</code> property.
   */
 public void setAmountDiscountMicroCurrency(Integer amountDiscountMicroCurrency) {
    this.amountDiscountMicroCurrency = amountDiscountMicroCurrency;
  }

  /**
   * Sets the <code>amountDiscountMicroCurrency</code> property.
   */
  public BillingInvoiceResponse amountDiscountMicroCurrency(Integer amountDiscountMicroCurrency) {
    this.amountDiscountMicroCurrency = amountDiscountMicroCurrency;
    return this;
  }

 /**
  * The net amount in this invoice. Denoted in micro currency
  * @return amountNetMicroCurrency
  */
  @JsonProperty("amount_net_micro_currency")
  public Integer getAmountNetMicroCurrency() {
    return amountNetMicroCurrency;
  }

  /**
   * Sets the <code>amountNetMicroCurrency</code> property.
   */
 public void setAmountNetMicroCurrency(Integer amountNetMicroCurrency) {
    this.amountNetMicroCurrency = amountNetMicroCurrency;
  }

  /**
   * Sets the <code>amountNetMicroCurrency</code> property.
   */
  public BillingInvoiceResponse amountNetMicroCurrency(Integer amountNetMicroCurrency) {
    this.amountNetMicroCurrency = amountNetMicroCurrency;
    return this;
  }

 /**
  * The tax in this invoice. Denoted in micro currency
  * @return amountTaxMicroCurrency
  */
  @JsonProperty("amount_tax_micro_currency")
  public Integer getAmountTaxMicroCurrency() {
    return amountTaxMicroCurrency;
  }

  /**
   * Sets the <code>amountTaxMicroCurrency</code> property.
   */
 public void setAmountTaxMicroCurrency(Integer amountTaxMicroCurrency) {
    this.amountTaxMicroCurrency = amountTaxMicroCurrency;
  }

  /**
   * Sets the <code>amountTaxMicroCurrency</code> property.
   */
  public BillingInvoiceResponse amountTaxMicroCurrency(Integer amountTaxMicroCurrency) {
    this.amountTaxMicroCurrency = amountTaxMicroCurrency;
    return this;
  }

 /**
  * The country of the bill to address
  * @return billToCountry
  */
  @JsonProperty("bill_to_country")
  public String getBillToCountry() {
    return billToCountry;
  }

  /**
   * Sets the <code>billToCountry</code> property.
   */
 public void setBillToCountry(String billToCountry) {
    this.billToCountry = billToCountry;
  }

  /**
   * Sets the <code>billToCountry</code> property.
   */
  public BillingInvoiceResponse billToCountry(String billToCountry) {
    this.billToCountry = billToCountry;
    return this;
  }

 /**
  * The end date of the billing period. Format: YYYY-MM-DD
  * @return billingPeriodEndDate
  */
  @JsonProperty("billing_period_end_date")
 @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")  public LocalDate getBillingPeriodEndDate() {
    return billingPeriodEndDate;
  }

  /**
   * Sets the <code>billingPeriodEndDate</code> property.
   */
 public void setBillingPeriodEndDate(LocalDate billingPeriodEndDate) {
    this.billingPeriodEndDate = billingPeriodEndDate;
  }

  /**
   * Sets the <code>billingPeriodEndDate</code> property.
   */
  public BillingInvoiceResponse billingPeriodEndDate(LocalDate billingPeriodEndDate) {
    this.billingPeriodEndDate = billingPeriodEndDate;
    return this;
  }

 /**
  * The start date of the billing period. Format: YYYY-MM-DD
  * @return billingPeriodStartDate
  */
  @JsonProperty("billing_period_start_date")
 @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")  public LocalDate getBillingPeriodStartDate() {
    return billingPeriodStartDate;
  }

  /**
   * Sets the <code>billingPeriodStartDate</code> property.
   */
 public void setBillingPeriodStartDate(LocalDate billingPeriodStartDate) {
    this.billingPeriodStartDate = billingPeriodStartDate;
  }

  /**
   * Sets the <code>billingPeriodStartDate</code> property.
   */
  public BillingInvoiceResponse billingPeriodStartDate(LocalDate billingPeriodStartDate) {
    this.billingPeriodStartDate = billingPeriodStartDate;
    return this;
  }

 /**
  * Get currency
  * @return currency
  */
  @JsonProperty("currency")
  public Currency getCurrency() {
    return currency;
  }

  /**
   * Sets the <code>currency</code> property.
   */
 public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  /**
   * Sets the <code>currency</code> property.
   */
  public BillingInvoiceResponse currency(Currency currency) {
    this.currency = currency;
    return this;
  }

 /**
  * The type of the document
  * @return documentType
  */
  @JsonProperty("document_type")
  public String getDocumentType() {
    return documentType == null ? null : documentType.value();
  }

  /**
   * Sets the <code>documentType</code> property.
   */
 public void setDocumentType(DocumentTypeEnum documentType) {
    this.documentType = documentType;
  }

  /**
   * Sets the <code>documentType</code> property.
   */
  public BillingInvoiceResponse documentType(DocumentTypeEnum documentType) {
    this.documentType = documentType;
    return this;
  }

 /**
  * Unique identifier for the billing invoice
  * @return id
  */
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public BillingInvoiceResponse id(String id) {
    this.id = id;
    return this;
  }

 /**
  * The date the invoice is due. Format: YYYY-MM-DD
  * @return invoiceDueDate
  */
  @JsonProperty("invoice_due_date")
 @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")  public LocalDate getInvoiceDueDate() {
    return invoiceDueDate;
  }

  /**
   * Sets the <code>invoiceDueDate</code> property.
   */
 public void setInvoiceDueDate(LocalDate invoiceDueDate) {
    this.invoiceDueDate = invoiceDueDate;
  }

  /**
   * Sets the <code>invoiceDueDate</code> property.
   */
  public BillingInvoiceResponse invoiceDueDate(LocalDate invoiceDueDate) {
    this.invoiceDueDate = invoiceDueDate;
    return this;
  }

 /**
  * The payment terms of the invoice
  * @return paymentTerms
  */
  @JsonProperty("payment_terms")
  public String getPaymentTerms() {
    return paymentTerms;
  }

  /**
   * Sets the <code>paymentTerms</code> property.
   */
 public void setPaymentTerms(String paymentTerms) {
    this.paymentTerms = paymentTerms;
  }

  /**
   * Sets the <code>paymentTerms</code> property.
   */
  public BillingInvoiceResponse paymentTerms(String paymentTerms) {
    this.paymentTerms = paymentTerms;
    return this;
  }

 /**
  * The status of the invoice
  * @return status
  */
  @JsonProperty("status")
  public String getStatus() {
    return status == null ? null : status.value();
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public BillingInvoiceResponse status(StatusEnum status) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

