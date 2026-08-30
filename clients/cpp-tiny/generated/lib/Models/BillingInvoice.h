
/*
 * BillingInvoice.h
 *
 * A billing invoice in the advertiser account.
 */

#ifndef TINY_CPP_CLIENT_BillingInvoice_H_
#define TINY_CPP_CLIENT_BillingInvoice_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BillingInvoiceDocumentType.h"
#include "BillingInvoiceStatus.h"
#include "Currency.h"
#include "Date.h"

namespace Tiny {


/*! \brief A billing invoice in the advertiser account.
 *
 *  \ingroup Models
 *
 */

class BillingInvoice{
public:

    /*! \brief Constructor.
	 */
    BillingInvoice();
    BillingInvoice(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BillingInvoice();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The ID of the ad account this invoice belongs to
	 */
	std::string getAdAccountId();

	/*! \brief Set The ID of the ad account this invoice belongs to
	 */
	void setAdAccountId(std::string ad_account_id);
	/*! \brief Get The name of the ad account this invoice belongs to
	 */
	std::string getAdAccountName();

	/*! \brief Set The name of the ad account this invoice belongs to
	 */
	void setAdAccountName(std::string ad_account_name);
	/*! \brief Get The amount billed in this invoice. Denoted in micro currency
	 */
	int getAmountBilledMicroCurrency();

	/*! \brief Set The amount billed in this invoice. Denoted in micro currency
	 */
	void setAmountBilledMicroCurrency(int amount_billed_micro_currency);
	/*! \brief Get The discount in this invoice. Denoted in micro currency
	 */
	int getAmountDiscountMicroCurrency();

	/*! \brief Set The discount in this invoice. Denoted in micro currency
	 */
	void setAmountDiscountMicroCurrency(int amount_discount_micro_currency);
	/*! \brief Get The net amount in this invoice. Denoted in micro currency
	 */
	int getAmountNetMicroCurrency();

	/*! \brief Set The net amount in this invoice. Denoted in micro currency
	 */
	void setAmountNetMicroCurrency(int amount_net_micro_currency);
	/*! \brief Get The tax in this invoice. Denoted in micro currency
	 */
	int getAmountTaxMicroCurrency();

	/*! \brief Set The tax in this invoice. Denoted in micro currency
	 */
	void setAmountTaxMicroCurrency(int amount_tax_micro_currency);
	/*! \brief Get The country of the bill to address
	 */
	std::string getBillToCountry();

	/*! \brief Set The country of the bill to address
	 */
	void setBillToCountry(std::string bill_to_country);
	/*! \brief Get The end date of the billing period. Format: YYYY-MM-DD
	 */
	Date getBillingPeriodEndDate();

	/*! \brief Set The end date of the billing period. Format: YYYY-MM-DD
	 */
	void setBillingPeriodEndDate(Date billing_period_end_date);
	/*! \brief Get The start date of the billing period. Format: YYYY-MM-DD
	 */
	Date getBillingPeriodStartDate();

	/*! \brief Set The start date of the billing period. Format: YYYY-MM-DD
	 */
	void setBillingPeriodStartDate(Date billing_period_start_date);
	/*! \brief Get 
	 */
	Currency getCurrency();

	/*! \brief Set 
	 */
	void setCurrency(Currency currency);
	/*! \brief Get The type of the document
	 */
	BillingInvoiceDocumentType getDocumentType();

	/*! \brief Set The type of the document
	 */
	void setDocumentType(BillingInvoiceDocumentType document_type);
	/*! \brief Get Unique identifier for the billing invoice
	 */
	std::string getId();

	/*! \brief Set Unique identifier for the billing invoice
	 */
	void setId(std::string id);
	/*! \brief Get The date the invoice is due. Format: YYYY-MM-DD
	 */
	Date getInvoiceDueDate();

	/*! \brief Set The date the invoice is due. Format: YYYY-MM-DD
	 */
	void setInvoiceDueDate(Date invoice_due_date);
	/*! \brief Get The payment terms of the invoice
	 */
	std::string getPaymentTerms();

	/*! \brief Set The payment terms of the invoice
	 */
	void setPaymentTerms(std::string payment_terms);
	/*! \brief Get The status of the invoice
	 */
	BillingInvoiceStatus getStatus();

	/*! \brief Set The status of the invoice
	 */
	void setStatus(BillingInvoiceStatus status);


    private:
    std::string ad_account_id{};
    std::string ad_account_name{};
    int amount_billed_micro_currency{};
    int amount_discount_micro_currency{};
    int amount_net_micro_currency{};
    int amount_tax_micro_currency{};
    std::string bill_to_country{};
    Date billing_period_end_date;
    Date billing_period_start_date;
    Currency currency;
    BillingInvoiceDocumentType document_type;
    std::string id{};
    Date invoice_due_date;
    std::string payment_terms{};
    BillingInvoiceStatus status;
};
}

#endif /* TINY_CPP_CLIENT_BillingInvoice_H_ */
