package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.Currency;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("BillingInvoiceResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BillingInvoiceResponse   {
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
  public enum DocumentTypeEnum {

    INVOICE(String.valueOf("INVOICE")), CREDIT_MEMO(String.valueOf("CREDIT_MEMO"));


    private String value;

    DocumentTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static DocumentTypeEnum fromString(String s) {
        for (DocumentTypeEnum b : DocumentTypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static DocumentTypeEnum fromValue(String value) {
        for (DocumentTypeEnum b : DocumentTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private DocumentTypeEnum documentType;
  private String id;
  private LocalDate invoiceDueDate;
  private String paymentTerms;
  public enum StatusEnum {

    OPEN(String.valueOf("OPEN")), CLOSED(String.valueOf("CLOSED"));


    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static StatusEnum fromString(String s) {
        for (StatusEnum b : StatusEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
        for (StatusEnum b : StatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private StatusEnum status;

  public BillingInvoiceResponse() {
  }

  /**
   * The ID of the ad account this invoice belongs to
   **/
  public BillingInvoiceResponse adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  
  @ApiModelProperty(value = "The ID of the ad account this invoice belongs to")
  @JsonProperty("ad_account_id")
   @Pattern(regexp="^\\d+$")public String getAdAccountId() {
    return adAccountId;
  }

  @JsonProperty("ad_account_id")
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * The name of the ad account this invoice belongs to
   **/
  public BillingInvoiceResponse adAccountName(String adAccountName) {
    this.adAccountName = adAccountName;
    return this;
  }

  
  @ApiModelProperty(value = "The name of the ad account this invoice belongs to")
  @JsonProperty("ad_account_name")
  public String getAdAccountName() {
    return adAccountName;
  }

  @JsonProperty("ad_account_name")
  public void setAdAccountName(String adAccountName) {
    this.adAccountName = adAccountName;
  }

  /**
   * The amount billed in this invoice. Denoted in micro currency
   **/
  public BillingInvoiceResponse amountBilledMicroCurrency(Integer amountBilledMicroCurrency) {
    this.amountBilledMicroCurrency = amountBilledMicroCurrency;
    return this;
  }

  
  @ApiModelProperty(value = "The amount billed in this invoice. Denoted in micro currency")
  @JsonProperty("amount_billed_micro_currency")
  public Integer getAmountBilledMicroCurrency() {
    return amountBilledMicroCurrency;
  }

  @JsonProperty("amount_billed_micro_currency")
  public void setAmountBilledMicroCurrency(Integer amountBilledMicroCurrency) {
    this.amountBilledMicroCurrency = amountBilledMicroCurrency;
  }

  /**
   * The discount in this invoice. Denoted in micro currency
   **/
  public BillingInvoiceResponse amountDiscountMicroCurrency(Integer amountDiscountMicroCurrency) {
    this.amountDiscountMicroCurrency = amountDiscountMicroCurrency;
    return this;
  }

  
  @ApiModelProperty(value = "The discount in this invoice. Denoted in micro currency")
  @JsonProperty("amount_discount_micro_currency")
  public Integer getAmountDiscountMicroCurrency() {
    return amountDiscountMicroCurrency;
  }

  @JsonProperty("amount_discount_micro_currency")
  public void setAmountDiscountMicroCurrency(Integer amountDiscountMicroCurrency) {
    this.amountDiscountMicroCurrency = amountDiscountMicroCurrency;
  }

  /**
   * The net amount in this invoice. Denoted in micro currency
   **/
  public BillingInvoiceResponse amountNetMicroCurrency(Integer amountNetMicroCurrency) {
    this.amountNetMicroCurrency = amountNetMicroCurrency;
    return this;
  }

  
  @ApiModelProperty(value = "The net amount in this invoice. Denoted in micro currency")
  @JsonProperty("amount_net_micro_currency")
  public Integer getAmountNetMicroCurrency() {
    return amountNetMicroCurrency;
  }

  @JsonProperty("amount_net_micro_currency")
  public void setAmountNetMicroCurrency(Integer amountNetMicroCurrency) {
    this.amountNetMicroCurrency = amountNetMicroCurrency;
  }

  /**
   * The tax in this invoice. Denoted in micro currency
   **/
  public BillingInvoiceResponse amountTaxMicroCurrency(Integer amountTaxMicroCurrency) {
    this.amountTaxMicroCurrency = amountTaxMicroCurrency;
    return this;
  }

  
  @ApiModelProperty(value = "The tax in this invoice. Denoted in micro currency")
  @JsonProperty("amount_tax_micro_currency")
  public Integer getAmountTaxMicroCurrency() {
    return amountTaxMicroCurrency;
  }

  @JsonProperty("amount_tax_micro_currency")
  public void setAmountTaxMicroCurrency(Integer amountTaxMicroCurrency) {
    this.amountTaxMicroCurrency = amountTaxMicroCurrency;
  }

  /**
   * The country of the bill to address
   **/
  public BillingInvoiceResponse billToCountry(String billToCountry) {
    this.billToCountry = billToCountry;
    return this;
  }

  
  @ApiModelProperty(value = "The country of the bill to address")
  @JsonProperty("bill_to_country")
  public String getBillToCountry() {
    return billToCountry;
  }

  @JsonProperty("bill_to_country")
  public void setBillToCountry(String billToCountry) {
    this.billToCountry = billToCountry;
  }

  /**
   * The end date of the billing period. Format: YYYY-MM-DD
   **/
  public BillingInvoiceResponse billingPeriodEndDate(LocalDate billingPeriodEndDate) {
    this.billingPeriodEndDate = billingPeriodEndDate;
    return this;
  }

  
  @ApiModelProperty(value = "The end date of the billing period. Format: YYYY-MM-DD")
  @JsonProperty("billing_period_end_date")
   @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")public LocalDate getBillingPeriodEndDate() {
    return billingPeriodEndDate;
  }

  @JsonProperty("billing_period_end_date")
  public void setBillingPeriodEndDate(LocalDate billingPeriodEndDate) {
    this.billingPeriodEndDate = billingPeriodEndDate;
  }

  /**
   * The start date of the billing period. Format: YYYY-MM-DD
   **/
  public BillingInvoiceResponse billingPeriodStartDate(LocalDate billingPeriodStartDate) {
    this.billingPeriodStartDate = billingPeriodStartDate;
    return this;
  }

  
  @ApiModelProperty(value = "The start date of the billing period. Format: YYYY-MM-DD")
  @JsonProperty("billing_period_start_date")
   @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")public LocalDate getBillingPeriodStartDate() {
    return billingPeriodStartDate;
  }

  @JsonProperty("billing_period_start_date")
  public void setBillingPeriodStartDate(LocalDate billingPeriodStartDate) {
    this.billingPeriodStartDate = billingPeriodStartDate;
  }

  /**
   **/
  public BillingInvoiceResponse currency(Currency currency) {
    this.currency = currency;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("currency")
  public Currency getCurrency() {
    return currency;
  }

  @JsonProperty("currency")
  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  /**
   * The type of the document
   **/
  public BillingInvoiceResponse documentType(DocumentTypeEnum documentType) {
    this.documentType = documentType;
    return this;
  }

  
  @ApiModelProperty(value = "The type of the document")
  @JsonProperty("document_type")
  public DocumentTypeEnum getDocumentType() {
    return documentType;
  }

  @JsonProperty("document_type")
  public void setDocumentType(DocumentTypeEnum documentType) {
    this.documentType = documentType;
  }

  /**
   * Unique identifier for the billing invoice
   **/
  public BillingInvoiceResponse id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Unique identifier for the billing invoice")
  @JsonProperty("id")
   @Pattern(regexp="^\\d+$")public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The date the invoice is due. Format: YYYY-MM-DD
   **/
  public BillingInvoiceResponse invoiceDueDate(LocalDate invoiceDueDate) {
    this.invoiceDueDate = invoiceDueDate;
    return this;
  }

  
  @ApiModelProperty(value = "The date the invoice is due. Format: YYYY-MM-DD")
  @JsonProperty("invoice_due_date")
   @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")public LocalDate getInvoiceDueDate() {
    return invoiceDueDate;
  }

  @JsonProperty("invoice_due_date")
  public void setInvoiceDueDate(LocalDate invoiceDueDate) {
    this.invoiceDueDate = invoiceDueDate;
  }

  /**
   * The payment terms of the invoice
   **/
  public BillingInvoiceResponse paymentTerms(String paymentTerms) {
    this.paymentTerms = paymentTerms;
    return this;
  }

  
  @ApiModelProperty(example = "NET 30", value = "The payment terms of the invoice")
  @JsonProperty("payment_terms")
  public String getPaymentTerms() {
    return paymentTerms;
  }

  @JsonProperty("payment_terms")
  public void setPaymentTerms(String paymentTerms) {
    this.paymentTerms = paymentTerms;
  }

  /**
   * The status of the invoice
   **/
  public BillingInvoiceResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(example = "OPEN", value = "The status of the invoice")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  @JsonProperty("status")
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

