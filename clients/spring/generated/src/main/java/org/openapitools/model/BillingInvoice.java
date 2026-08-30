package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BillingInvoiceDocumentType;
import org.openapitools.model.BillingInvoiceStatus;
import org.openapitools.model.Currency;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * A billing invoice in the advertiser account.
 */

@Schema(name = "BillingInvoice", description = "A billing invoice in the advertiser account.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BillingInvoice {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String adAccountId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String adAccountName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer amountBilledMicroCurrency;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Integer> amountDiscountMicroCurrency = JsonNullable.<Integer>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Integer> amountNetMicroCurrency = JsonNullable.<Integer>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Integer> amountTaxMicroCurrency = JsonNullable.<Integer>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String billToCountry;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate billingPeriodEndDate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate billingPeriodStartDate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Currency currency;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable BillingInvoiceDocumentType documentType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String id;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate invoiceDueDate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String paymentTerms;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable BillingInvoiceStatus status;

  public BillingInvoice adAccountId(@Nullable String adAccountId) {
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

  @JsonProperty("ad_account_id")
  public void setAdAccountId(@Nullable String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public BillingInvoice adAccountName(@Nullable String adAccountName) {
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

  @JsonProperty("ad_account_name")
  public void setAdAccountName(@Nullable String adAccountName) {
    this.adAccountName = adAccountName;
  }

  public BillingInvoice amountBilledMicroCurrency(@Nullable Integer amountBilledMicroCurrency) {
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

  @JsonProperty("amount_billed_micro_currency")
  public void setAmountBilledMicroCurrency(@Nullable Integer amountBilledMicroCurrency) {
    this.amountBilledMicroCurrency = amountBilledMicroCurrency;
  }

  public BillingInvoice amountDiscountMicroCurrency(Integer amountDiscountMicroCurrency) {
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

  public BillingInvoice amountNetMicroCurrency(Integer amountNetMicroCurrency) {
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

  public BillingInvoice amountTaxMicroCurrency(Integer amountTaxMicroCurrency) {
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

  public BillingInvoice billToCountry(@Nullable String billToCountry) {
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

  @JsonProperty("bill_to_country")
  public void setBillToCountry(@Nullable String billToCountry) {
    this.billToCountry = billToCountry;
  }

  public BillingInvoice billingPeriodEndDate(@Nullable LocalDate billingPeriodEndDate) {
    this.billingPeriodEndDate = billingPeriodEndDate;
    return this;
  }

  /**
   * The end date of the billing period. Format: YYYY-MM-DD
   * @return billingPeriodEndDate
   */
  @Valid 
  @Schema(name = "billing_period_end_date", description = "The end date of the billing period. Format: YYYY-MM-DD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billing_period_end_date")
  public @Nullable LocalDate getBillingPeriodEndDate() {
    return billingPeriodEndDate;
  }

  @JsonProperty("billing_period_end_date")
  public void setBillingPeriodEndDate(@Nullable LocalDate billingPeriodEndDate) {
    this.billingPeriodEndDate = billingPeriodEndDate;
  }

  public BillingInvoice billingPeriodStartDate(@Nullable LocalDate billingPeriodStartDate) {
    this.billingPeriodStartDate = billingPeriodStartDate;
    return this;
  }

  /**
   * The start date of the billing period. Format: YYYY-MM-DD
   * @return billingPeriodStartDate
   */
  @Valid 
  @Schema(name = "billing_period_start_date", description = "The start date of the billing period. Format: YYYY-MM-DD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billing_period_start_date")
  public @Nullable LocalDate getBillingPeriodStartDate() {
    return billingPeriodStartDate;
  }

  @JsonProperty("billing_period_start_date")
  public void setBillingPeriodStartDate(@Nullable LocalDate billingPeriodStartDate) {
    this.billingPeriodStartDate = billingPeriodStartDate;
  }

  public BillingInvoice currency(@Nullable Currency currency) {
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

  @JsonProperty("currency")
  public void setCurrency(@Nullable Currency currency) {
    this.currency = currency;
  }

  public BillingInvoice documentType(@Nullable BillingInvoiceDocumentType documentType) {
    this.documentType = documentType;
    return this;
  }

  /**
   * The type of the document
   * @return documentType
   */
  @Valid 
  @Schema(name = "document_type", description = "The type of the document", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("document_type")
  public @Nullable BillingInvoiceDocumentType getDocumentType() {
    return documentType;
  }

  @JsonProperty("document_type")
  public void setDocumentType(@Nullable BillingInvoiceDocumentType documentType) {
    this.documentType = documentType;
  }

  public BillingInvoice id(@Nullable String id) {
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

  @JsonProperty("id")
  public void setId(@Nullable String id) {
    this.id = id;
  }

  public BillingInvoice invoiceDueDate(@Nullable LocalDate invoiceDueDate) {
    this.invoiceDueDate = invoiceDueDate;
    return this;
  }

  /**
   * The date the invoice is due. Format: YYYY-MM-DD
   * @return invoiceDueDate
   */
  @Valid 
  @Schema(name = "invoice_due_date", description = "The date the invoice is due. Format: YYYY-MM-DD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invoice_due_date")
  public @Nullable LocalDate getInvoiceDueDate() {
    return invoiceDueDate;
  }

  @JsonProperty("invoice_due_date")
  public void setInvoiceDueDate(@Nullable LocalDate invoiceDueDate) {
    this.invoiceDueDate = invoiceDueDate;
  }

  public BillingInvoice paymentTerms(@Nullable String paymentTerms) {
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

  @JsonProperty("payment_terms")
  public void setPaymentTerms(@Nullable String paymentTerms) {
    this.paymentTerms = paymentTerms;
  }

  public BillingInvoice status(@Nullable BillingInvoiceStatus status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the invoice
   * @return status
   */
  @Valid 
  @Schema(name = "status", example = "OPEN", description = "The status of the invoice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable BillingInvoiceStatus getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(@Nullable BillingInvoiceStatus status) {
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
        equalsNullable(this.amountDiscountMicroCurrency, billingInvoice.amountDiscountMicroCurrency) &&
        equalsNullable(this.amountNetMicroCurrency, billingInvoice.amountNetMicroCurrency) &&
        equalsNullable(this.amountTaxMicroCurrency, billingInvoice.amountTaxMicroCurrency) &&
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

