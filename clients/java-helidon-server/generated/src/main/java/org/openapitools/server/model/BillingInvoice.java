package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.BillingInvoiceDocumentType;
import org.openapitools.server.model.BillingInvoiceStatus;
import org.openapitools.server.model.Currency;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * A billing invoice in the advertiser account.
 */
public class BillingInvoice   {

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
    private BillingInvoiceDocumentType documentType;
    private String id;
    private LocalDate invoiceDueDate;
    private String paymentTerms;
    private BillingInvoiceStatus status;

    /**
     * Default constructor.
     */
    public BillingInvoice() {
    // JSON-B / Jackson
    }

    /**
     * Create BillingInvoice.
     *
     * @param adAccountId The ID of the ad account this invoice belongs to
     * @param adAccountName The name of the ad account this invoice belongs to
     * @param amountBilledMicroCurrency The amount billed in this invoice. Denoted in micro currency
     * @param amountDiscountMicroCurrency The discount in this invoice. Denoted in micro currency
     * @param amountNetMicroCurrency The net amount in this invoice. Denoted in micro currency
     * @param amountTaxMicroCurrency The tax in this invoice. Denoted in micro currency
     * @param billToCountry The country of the bill to address
     * @param billingPeriodEndDate The end date of the billing period. Format: YYYY-MM-DD
     * @param billingPeriodStartDate The start date of the billing period. Format: YYYY-MM-DD
     * @param currency currency
     * @param documentType The type of the document
     * @param id Unique identifier for the billing invoice
     * @param invoiceDueDate The date the invoice is due. Format: YYYY-MM-DD
     * @param paymentTerms The payment terms of the invoice
     * @param status The status of the invoice
     */
    public BillingInvoice(
        String adAccountId, 
        String adAccountName, 
        Integer amountBilledMicroCurrency, 
        Integer amountDiscountMicroCurrency, 
        Integer amountNetMicroCurrency, 
        Integer amountTaxMicroCurrency, 
        String billToCountry, 
        LocalDate billingPeriodEndDate, 
        LocalDate billingPeriodStartDate, 
        Currency currency, 
        BillingInvoiceDocumentType documentType, 
        String id, 
        LocalDate invoiceDueDate, 
        String paymentTerms, 
        BillingInvoiceStatus status
    ) {
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
     * Get currency
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

    /**
      * Create a string representation of this pojo.
    **/
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

