package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.Currency;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BillingInvoiceResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BillingInvoiceResponse {

  private @Nullable String adAccountId;

  private @Nullable String adAccountName;

  private @Nullable Integer amountBilledMicroCurrency;

  private JsonNullable<Integer> amountDiscountMicroCurrency = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> amountNetMicroCurrency = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> amountTaxMicroCurrency = JsonNullable.<Integer>undefined();

  private @Nullable String billToCountry;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate billingPeriodEndDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate billingPeriodStartDate;

  private @Nullable Currency currency;

  /**
   * The type of the document
   */
  public enum DocumentTypeEnum {
    INVOICE("INVOICE"),
    
    CREDIT_MEMO("CREDIT_MEMO");

    private final String value;

    DocumentTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
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

  private @Nullable DocumentTypeEnum documentType;

  private @Nullable String id;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate invoiceDueDate;

  private @Nullable String paymentTerms;

  /**
   * The status of the invoice
   */
  public enum StatusEnum {
    OPEN("OPEN"),
    
    CLOSED("CLOSED");

    private final String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
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

  private @Nullable StatusEnum status;

  public BillingInvoiceResponse adAccountId(@Nullable String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  /**
   * The ID of the ad account this invoice belongs to
   * @return adAccountId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "ad_account_id", description = "The ID of the ad account this invoice belongs to", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_account_id")
  public @Nullable String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(@Nullable String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public BillingInvoiceResponse adAccountName(@Nullable String adAccountName) {
    this.adAccountName = adAccountName;
    return this;
  }

  /**
   * The name of the ad account this invoice belongs to
   * @return adAccountName
   */
  
  @Schema(name = "ad_account_name", description = "The name of the ad account this invoice belongs to", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_account_name")
  public @Nullable String getAdAccountName() {
    return adAccountName;
  }

  public void setAdAccountName(@Nullable String adAccountName) {
    this.adAccountName = adAccountName;
  }

  public BillingInvoiceResponse amountBilledMicroCurrency(@Nullable Integer amountBilledMicroCurrency) {
    this.amountBilledMicroCurrency = amountBilledMicroCurrency;
    return this;
  }

  /**
   * The amount billed in this invoice. Denoted in micro currency
   * @return amountBilledMicroCurrency
   */
  
  @Schema(name = "amount_billed_micro_currency", description = "The amount billed in this invoice. Denoted in micro currency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amount_billed_micro_currency")
  public @Nullable Integer getAmountBilledMicroCurrency() {
    return amountBilledMicroCurrency;
  }

  public void setAmountBilledMicroCurrency(@Nullable Integer amountBilledMicroCurrency) {
    this.amountBilledMicroCurrency = amountBilledMicroCurrency;
  }

  public BillingInvoiceResponse amountDiscountMicroCurrency(Integer amountDiscountMicroCurrency) {
    this.amountDiscountMicroCurrency = JsonNullable.of(amountDiscountMicroCurrency);
    return this;
  }

  /**
   * The discount in this invoice. Denoted in micro currency
   * @return amountDiscountMicroCurrency
   */
  
  @Schema(name = "amount_discount_micro_currency", description = "The discount in this invoice. Denoted in micro currency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amount_discount_micro_currency")
  public JsonNullable<Integer> getAmountDiscountMicroCurrency() {
    return amountDiscountMicroCurrency;
  }

  public void setAmountDiscountMicroCurrency(JsonNullable<Integer> amountDiscountMicroCurrency) {
    this.amountDiscountMicroCurrency = amountDiscountMicroCurrency;
  }

  public BillingInvoiceResponse amountNetMicroCurrency(Integer amountNetMicroCurrency) {
    this.amountNetMicroCurrency = JsonNullable.of(amountNetMicroCurrency);
    return this;
  }

  /**
   * The net amount in this invoice. Denoted in micro currency
   * @return amountNetMicroCurrency
   */
  
  @Schema(name = "amount_net_micro_currency", description = "The net amount in this invoice. Denoted in micro currency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amount_net_micro_currency")
  public JsonNullable<Integer> getAmountNetMicroCurrency() {
    return amountNetMicroCurrency;
  }

  public void setAmountNetMicroCurrency(JsonNullable<Integer> amountNetMicroCurrency) {
    this.amountNetMicroCurrency = amountNetMicroCurrency;
  }

  public BillingInvoiceResponse amountTaxMicroCurrency(Integer amountTaxMicroCurrency) {
    this.amountTaxMicroCurrency = JsonNullable.of(amountTaxMicroCurrency);
    return this;
  }

  /**
   * The tax in this invoice. Denoted in micro currency
   * @return amountTaxMicroCurrency
   */
  
  @Schema(name = "amount_tax_micro_currency", description = "The tax in this invoice. Denoted in micro currency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amount_tax_micro_currency")
  public JsonNullable<Integer> getAmountTaxMicroCurrency() {
    return amountTaxMicroCurrency;
  }

  public void setAmountTaxMicroCurrency(JsonNullable<Integer> amountTaxMicroCurrency) {
    this.amountTaxMicroCurrency = amountTaxMicroCurrency;
  }

  public BillingInvoiceResponse billToCountry(@Nullable String billToCountry) {
    this.billToCountry = billToCountry;
    return this;
  }

  /**
   * The country of the bill to address
   * @return billToCountry
   */
  
  @Schema(name = "bill_to_country", description = "The country of the bill to address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bill_to_country")
  public @Nullable String getBillToCountry() {
    return billToCountry;
  }

  public void setBillToCountry(@Nullable String billToCountry) {
    this.billToCountry = billToCountry;
  }

  public BillingInvoiceResponse billingPeriodEndDate(@Nullable LocalDate billingPeriodEndDate) {
    this.billingPeriodEndDate = billingPeriodEndDate;
    return this;
  }

  /**
   * The end date of the billing period. Format: YYYY-MM-DD
   * @return billingPeriodEndDate
   */
  @Valid @Pattern(regexp = "^(\\d{4})-(\\d{2})-(\\d{2})$") 
  @Schema(name = "billing_period_end_date", description = "The end date of the billing period. Format: YYYY-MM-DD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billing_period_end_date")
  public @Nullable LocalDate getBillingPeriodEndDate() {
    return billingPeriodEndDate;
  }

  public void setBillingPeriodEndDate(@Nullable LocalDate billingPeriodEndDate) {
    this.billingPeriodEndDate = billingPeriodEndDate;
  }

  public BillingInvoiceResponse billingPeriodStartDate(@Nullable LocalDate billingPeriodStartDate) {
    this.billingPeriodStartDate = billingPeriodStartDate;
    return this;
  }

  /**
   * The start date of the billing period. Format: YYYY-MM-DD
   * @return billingPeriodStartDate
   */
  @Valid @Pattern(regexp = "^(\\d{4})-(\\d{2})-(\\d{2})$") 
  @Schema(name = "billing_period_start_date", description = "The start date of the billing period. Format: YYYY-MM-DD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billing_period_start_date")
  public @Nullable LocalDate getBillingPeriodStartDate() {
    return billingPeriodStartDate;
  }

  public void setBillingPeriodStartDate(@Nullable LocalDate billingPeriodStartDate) {
    this.billingPeriodStartDate = billingPeriodStartDate;
  }

  public BillingInvoiceResponse currency(@Nullable Currency currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   */
  @Valid 
  @Schema(name = "currency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currency")
  public @Nullable Currency getCurrency() {
    return currency;
  }

  public void setCurrency(@Nullable Currency currency) {
    this.currency = currency;
  }

  public BillingInvoiceResponse documentType(@Nullable DocumentTypeEnum documentType) {
    this.documentType = documentType;
    return this;
  }

  /**
   * The type of the document
   * @return documentType
   */
  
  @Schema(name = "document_type", description = "The type of the document", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("document_type")
  public @Nullable DocumentTypeEnum getDocumentType() {
    return documentType;
  }

  public void setDocumentType(@Nullable DocumentTypeEnum documentType) {
    this.documentType = documentType;
  }

  public BillingInvoiceResponse id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the billing invoice
   * @return id
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", description = "Unique identifier for the billing invoice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public BillingInvoiceResponse invoiceDueDate(@Nullable LocalDate invoiceDueDate) {
    this.invoiceDueDate = invoiceDueDate;
    return this;
  }

  /**
   * The date the invoice is due. Format: YYYY-MM-DD
   * @return invoiceDueDate
   */
  @Valid @Pattern(regexp = "^(\\d{4})-(\\d{2})-(\\d{2})$") 
  @Schema(name = "invoice_due_date", description = "The date the invoice is due. Format: YYYY-MM-DD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invoice_due_date")
  public @Nullable LocalDate getInvoiceDueDate() {
    return invoiceDueDate;
  }

  public void setInvoiceDueDate(@Nullable LocalDate invoiceDueDate) {
    this.invoiceDueDate = invoiceDueDate;
  }

  public BillingInvoiceResponse paymentTerms(@Nullable String paymentTerms) {
    this.paymentTerms = paymentTerms;
    return this;
  }

  /**
   * The payment terms of the invoice
   * @return paymentTerms
   */
  
  @Schema(name = "payment_terms", example = "NET 30", description = "The payment terms of the invoice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("payment_terms")
  public @Nullable String getPaymentTerms() {
    return paymentTerms;
  }

  public void setPaymentTerms(@Nullable String paymentTerms) {
    this.paymentTerms = paymentTerms;
  }

  public BillingInvoiceResponse status(@Nullable StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the invoice
   * @return status
   */
  
  @Schema(name = "status", example = "OPEN", description = "The status of the invoice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@Nullable StatusEnum status) {
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
        equalsNullable(this.amountDiscountMicroCurrency, billingInvoiceResponse.amountDiscountMicroCurrency) &&
        equalsNullable(this.amountNetMicroCurrency, billingInvoiceResponse.amountNetMicroCurrency) &&
        equalsNullable(this.amountTaxMicroCurrency, billingInvoiceResponse.amountTaxMicroCurrency) &&
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

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, adAccountName, amountBilledMicroCurrency, hashCodeNullable(amountDiscountMicroCurrency), hashCodeNullable(amountNetMicroCurrency), hashCodeNullable(amountTaxMicroCurrency), billToCountry, billingPeriodEndDate, billingPeriodStartDate, currency, documentType, id, invoiceDueDate, paymentTerms, status);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

