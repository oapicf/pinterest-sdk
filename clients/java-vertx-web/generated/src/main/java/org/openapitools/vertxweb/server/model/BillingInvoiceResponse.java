package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.Currency;

@JsonInclude(JsonInclude.Include.NON_NULL)
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
    INVOICE("INVOICE"),
    CREDIT_MEMO("CREDIT_MEMO");

    private String value;

    DocumentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private DocumentTypeEnum documentType;
  private String id;
  private LocalDate invoiceDueDate;
  private String paymentTerms;


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
      return value;
    }
  }

  private StatusEnum status;

  public BillingInvoiceResponse () {

  }

  public BillingInvoiceResponse (String adAccountId, String adAccountName, Integer amountBilledMicroCurrency, Integer amountDiscountMicroCurrency, Integer amountNetMicroCurrency, Integer amountTaxMicroCurrency, String billToCountry, LocalDate billingPeriodEndDate, LocalDate billingPeriodStartDate, Currency currency, DocumentTypeEnum documentType, String id, LocalDate invoiceDueDate, String paymentTerms, StatusEnum status) {
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
  public DocumentTypeEnum getDocumentType() {
    return documentType;
  }
  public void setDocumentType(DocumentTypeEnum documentType) {
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
    return Objects.equals(adAccountId, billingInvoiceResponse.adAccountId) &&
        Objects.equals(adAccountName, billingInvoiceResponse.adAccountName) &&
        Objects.equals(amountBilledMicroCurrency, billingInvoiceResponse.amountBilledMicroCurrency) &&
        Objects.equals(amountDiscountMicroCurrency, billingInvoiceResponse.amountDiscountMicroCurrency) &&
        Objects.equals(amountNetMicroCurrency, billingInvoiceResponse.amountNetMicroCurrency) &&
        Objects.equals(amountTaxMicroCurrency, billingInvoiceResponse.amountTaxMicroCurrency) &&
        Objects.equals(billToCountry, billingInvoiceResponse.billToCountry) &&
        Objects.equals(billingPeriodEndDate, billingInvoiceResponse.billingPeriodEndDate) &&
        Objects.equals(billingPeriodStartDate, billingInvoiceResponse.billingPeriodStartDate) &&
        Objects.equals(currency, billingInvoiceResponse.currency) &&
        Objects.equals(documentType, billingInvoiceResponse.documentType) &&
        Objects.equals(id, billingInvoiceResponse.id) &&
        Objects.equals(invoiceDueDate, billingInvoiceResponse.invoiceDueDate) &&
        Objects.equals(paymentTerms, billingInvoiceResponse.paymentTerms) &&
        Objects.equals(status, billingInvoiceResponse.status);
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
