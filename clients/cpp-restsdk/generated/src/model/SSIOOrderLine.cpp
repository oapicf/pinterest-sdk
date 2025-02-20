/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/SSIOOrderLine.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



SSIOOrderLine::SSIOOrderLine()
{
    m_Salesforce_order_line_id = utility::conversions::to_string_t("");
    m_Salesforce_order_line_idIsSet = false;
    m_Ads_manager_order_line_id = utility::conversions::to_string_t("");
    m_Ads_manager_order_line_idIsSet = false;
    m_Pin_order_id = utility::conversions::to_string_t("");
    m_Pin_order_idIsSet = false;
    m_Last_modified_date_time = utility::conversions::to_string_t("");
    m_Last_modified_date_timeIsSet = false;
    m_Start_dateIsSet = false;
    m_End_dateIsSet = false;
    m_Bill_to_company_name = utility::conversions::to_string_t("");
    m_Bill_to_company_nameIsSet = false;
    m_Billing_contact_firstname = utility::conversions::to_string_t("");
    m_Billing_contact_firstnameIsSet = false;
    m_Billing_contact_lastname = utility::conversions::to_string_t("");
    m_Billing_contact_lastnameIsSet = false;
    m_Billing_contact_email = utility::conversions::to_string_t("");
    m_Billing_contact_emailIsSet = false;
    m_Media_contact_email = utility::conversions::to_string_t("");
    m_Media_contact_emailIsSet = false;
    m_Media_contact_firstname = utility::conversions::to_string_t("");
    m_Media_contact_firstnameIsSet = false;
    m_Media_contact_lastname = utility::conversions::to_string_t("");
    m_Media_contact_lastnameIsSet = false;
    m_Currency_infoIsSet = false;
    m_Agency_link = utility::conversions::to_string_t("");
    m_Agency_linkIsSet = false;
    m_Po_number = utility::conversions::to_string_t("");
    m_Po_numberIsSet = false;
    m_Order_name = utility::conversions::to_string_t("");
    m_Order_nameIsSet = false;
    m_Pmp_name = utility::conversions::to_string_t("");
    m_Pmp_nameIsSet = false;
    m_Accepted_terms_id = utility::conversions::to_string_t("");
    m_Accepted_terms_idIsSet = false;
    m_Accepted_terms_time = utility::conversions::to_string_t("");
    m_Accepted_terms_timeIsSet = false;
    m_Budget_amount = 0.0;
    m_Budget_amountIsSet = false;
    m_Estimated_monthly_spend = 0.0;
    m_Estimated_monthly_spendIsSet = false;
}

SSIOOrderLine::~SSIOOrderLine()
{
}

void SSIOOrderLine::validate()
{
    // TODO: implement validation
}

web::json::value SSIOOrderLine::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Salesforce_order_line_idIsSet)
    {
        val[utility::conversions::to_string_t(U("salesforce_order_line_id"))] = ModelBase::toJson(m_Salesforce_order_line_id);
    }
    if(m_Ads_manager_order_line_idIsSet)
    {
        val[utility::conversions::to_string_t(U("ads_manager_order_line_id"))] = ModelBase::toJson(m_Ads_manager_order_line_id);
    }
    if(m_Pin_order_idIsSet)
    {
        val[utility::conversions::to_string_t(U("pin_order_id"))] = ModelBase::toJson(m_Pin_order_id);
    }
    if(m_Last_modified_date_timeIsSet)
    {
        val[utility::conversions::to_string_t(U("last_modified_date_time"))] = ModelBase::toJson(m_Last_modified_date_time);
    }
    if(m_Start_dateIsSet)
    {
        val[utility::conversions::to_string_t(U("start_date"))] = ModelBase::toJson(m_Start_date);
    }
    if(m_End_dateIsSet)
    {
        val[utility::conversions::to_string_t(U("end_date"))] = ModelBase::toJson(m_End_date);
    }
    if(m_Bill_to_company_nameIsSet)
    {
        val[utility::conversions::to_string_t(U("bill_to_company_name"))] = ModelBase::toJson(m_Bill_to_company_name);
    }
    if(m_Billing_contact_firstnameIsSet)
    {
        val[utility::conversions::to_string_t(U("billing_contact_firstname"))] = ModelBase::toJson(m_Billing_contact_firstname);
    }
    if(m_Billing_contact_lastnameIsSet)
    {
        val[utility::conversions::to_string_t(U("billing_contact_lastname"))] = ModelBase::toJson(m_Billing_contact_lastname);
    }
    if(m_Billing_contact_emailIsSet)
    {
        val[utility::conversions::to_string_t(U("billing_contact_email"))] = ModelBase::toJson(m_Billing_contact_email);
    }
    if(m_Media_contact_emailIsSet)
    {
        val[utility::conversions::to_string_t(U("media_contact_email"))] = ModelBase::toJson(m_Media_contact_email);
    }
    if(m_Media_contact_firstnameIsSet)
    {
        val[utility::conversions::to_string_t(U("media_contact_firstname"))] = ModelBase::toJson(m_Media_contact_firstname);
    }
    if(m_Media_contact_lastnameIsSet)
    {
        val[utility::conversions::to_string_t(U("media_contact_lastname"))] = ModelBase::toJson(m_Media_contact_lastname);
    }
    if(m_Currency_infoIsSet)
    {
        val[utility::conversions::to_string_t(U("currency_info"))] = ModelBase::toJson(m_Currency_info);
    }
    if(m_Agency_linkIsSet)
    {
        val[utility::conversions::to_string_t(U("agency_link"))] = ModelBase::toJson(m_Agency_link);
    }
    if(m_Po_numberIsSet)
    {
        val[utility::conversions::to_string_t(U("po_number"))] = ModelBase::toJson(m_Po_number);
    }
    if(m_Order_nameIsSet)
    {
        val[utility::conversions::to_string_t(U("order_name"))] = ModelBase::toJson(m_Order_name);
    }
    if(m_Pmp_nameIsSet)
    {
        val[utility::conversions::to_string_t(U("pmp_name"))] = ModelBase::toJson(m_Pmp_name);
    }
    if(m_Accepted_terms_idIsSet)
    {
        val[utility::conversions::to_string_t(U("accepted_terms_id"))] = ModelBase::toJson(m_Accepted_terms_id);
    }
    if(m_Accepted_terms_timeIsSet)
    {
        val[utility::conversions::to_string_t(U("accepted_terms_time"))] = ModelBase::toJson(m_Accepted_terms_time);
    }
    if(m_Budget_amountIsSet)
    {
        val[utility::conversions::to_string_t(U("budget_amount"))] = ModelBase::toJson(m_Budget_amount);
    }
    if(m_Estimated_monthly_spendIsSet)
    {
        val[utility::conversions::to_string_t(U("estimated_monthly_spend"))] = ModelBase::toJson(m_Estimated_monthly_spend);
    }

    return val;
}

bool SSIOOrderLine::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("salesforce_order_line_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("salesforce_order_line_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setSalesforceOrderLineId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setSalesforceOrderLineId);
            setSalesforceOrderLineId(refVal_setSalesforceOrderLineId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("ads_manager_order_line_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("ads_manager_order_line_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setAdsManagerOrderLineId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAdsManagerOrderLineId);
            setAdsManagerOrderLineId(refVal_setAdsManagerOrderLineId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("pin_order_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("pin_order_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setPinOrderId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPinOrderId);
            setPinOrderId(refVal_setPinOrderId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("last_modified_date_time"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("last_modified_date_time")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setLastModifiedDateTime;
            ok &= ModelBase::fromJson(fieldValue, refVal_setLastModifiedDateTime);
            setLastModifiedDateTime(refVal_setLastModifiedDateTime);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("start_date"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("start_date")));
        if(!fieldValue.is_null())
        {
            utility::datetime refVal_setStartDate;
            ok &= ModelBase::fromJson(fieldValue, refVal_setStartDate);
            setStartDate(refVal_setStartDate);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("end_date"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("end_date")));
        if(!fieldValue.is_null())
        {
            utility::datetime refVal_setEndDate;
            ok &= ModelBase::fromJson(fieldValue, refVal_setEndDate);
            setEndDate(refVal_setEndDate);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("bill_to_company_name"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("bill_to_company_name")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setBillToCompanyName;
            ok &= ModelBase::fromJson(fieldValue, refVal_setBillToCompanyName);
            setBillToCompanyName(refVal_setBillToCompanyName);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("billing_contact_firstname"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("billing_contact_firstname")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setBillingContactFirstname;
            ok &= ModelBase::fromJson(fieldValue, refVal_setBillingContactFirstname);
            setBillingContactFirstname(refVal_setBillingContactFirstname);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("billing_contact_lastname"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("billing_contact_lastname")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setBillingContactLastname;
            ok &= ModelBase::fromJson(fieldValue, refVal_setBillingContactLastname);
            setBillingContactLastname(refVal_setBillingContactLastname);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("billing_contact_email"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("billing_contact_email")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setBillingContactEmail;
            ok &= ModelBase::fromJson(fieldValue, refVal_setBillingContactEmail);
            setBillingContactEmail(refVal_setBillingContactEmail);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("media_contact_email"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("media_contact_email")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setMediaContactEmail;
            ok &= ModelBase::fromJson(fieldValue, refVal_setMediaContactEmail);
            setMediaContactEmail(refVal_setMediaContactEmail);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("media_contact_firstname"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("media_contact_firstname")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setMediaContactFirstname;
            ok &= ModelBase::fromJson(fieldValue, refVal_setMediaContactFirstname);
            setMediaContactFirstname(refVal_setMediaContactFirstname);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("media_contact_lastname"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("media_contact_lastname")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setMediaContactLastname;
            ok &= ModelBase::fromJson(fieldValue, refVal_setMediaContactLastname);
            setMediaContactLastname(refVal_setMediaContactLastname);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("currency_info"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("currency_info")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<Currency> refVal_setCurrencyInfo;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCurrencyInfo);
            setCurrencyInfo(refVal_setCurrencyInfo);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("agency_link"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("agency_link")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setAgencyLink;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAgencyLink);
            setAgencyLink(refVal_setAgencyLink);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("po_number"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("po_number")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setPoNumber;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPoNumber);
            setPoNumber(refVal_setPoNumber);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("order_name"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("order_name")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setOrderName;
            ok &= ModelBase::fromJson(fieldValue, refVal_setOrderName);
            setOrderName(refVal_setOrderName);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("pmp_name"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("pmp_name")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setPmpName;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPmpName);
            setPmpName(refVal_setPmpName);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("accepted_terms_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("accepted_terms_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setAcceptedTermsId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAcceptedTermsId);
            setAcceptedTermsId(refVal_setAcceptedTermsId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("accepted_terms_time"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("accepted_terms_time")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setAcceptedTermsTime;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAcceptedTermsTime);
            setAcceptedTermsTime(refVal_setAcceptedTermsTime);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("budget_amount"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("budget_amount")));
        if(!fieldValue.is_null())
        {
            double refVal_setBudgetAmount;
            ok &= ModelBase::fromJson(fieldValue, refVal_setBudgetAmount);
            setBudgetAmount(refVal_setBudgetAmount);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("estimated_monthly_spend"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("estimated_monthly_spend")));
        if(!fieldValue.is_null())
        {
            double refVal_setEstimatedMonthlySpend;
            ok &= ModelBase::fromJson(fieldValue, refVal_setEstimatedMonthlySpend);
            setEstimatedMonthlySpend(refVal_setEstimatedMonthlySpend);
        }
    }
    return ok;
}

void SSIOOrderLine::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_Salesforce_order_line_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("salesforce_order_line_id")), m_Salesforce_order_line_id));
    }
    if(m_Ads_manager_order_line_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("ads_manager_order_line_id")), m_Ads_manager_order_line_id));
    }
    if(m_Pin_order_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("pin_order_id")), m_Pin_order_id));
    }
    if(m_Last_modified_date_timeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("last_modified_date_time")), m_Last_modified_date_time));
    }
    if(m_Start_dateIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("start_date")), m_Start_date));
    }
    if(m_End_dateIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("end_date")), m_End_date));
    }
    if(m_Bill_to_company_nameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("bill_to_company_name")), m_Bill_to_company_name));
    }
    if(m_Billing_contact_firstnameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("billing_contact_firstname")), m_Billing_contact_firstname));
    }
    if(m_Billing_contact_lastnameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("billing_contact_lastname")), m_Billing_contact_lastname));
    }
    if(m_Billing_contact_emailIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("billing_contact_email")), m_Billing_contact_email));
    }
    if(m_Media_contact_emailIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("media_contact_email")), m_Media_contact_email));
    }
    if(m_Media_contact_firstnameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("media_contact_firstname")), m_Media_contact_firstname));
    }
    if(m_Media_contact_lastnameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("media_contact_lastname")), m_Media_contact_lastname));
    }
    if(m_Currency_infoIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("currency_info")), m_Currency_info));
    }
    if(m_Agency_linkIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("agency_link")), m_Agency_link));
    }
    if(m_Po_numberIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("po_number")), m_Po_number));
    }
    if(m_Order_nameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("order_name")), m_Order_name));
    }
    if(m_Pmp_nameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("pmp_name")), m_Pmp_name));
    }
    if(m_Accepted_terms_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("accepted_terms_id")), m_Accepted_terms_id));
    }
    if(m_Accepted_terms_timeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("accepted_terms_time")), m_Accepted_terms_time));
    }
    if(m_Budget_amountIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("budget_amount")), m_Budget_amount));
    }
    if(m_Estimated_monthly_spendIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("estimated_monthly_spend")), m_Estimated_monthly_spend));
    }
}

bool SSIOOrderLine::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("salesforce_order_line_id"))))
    {
        utility::string_t refVal_setSalesforceOrderLineId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("salesforce_order_line_id"))), refVal_setSalesforceOrderLineId );
        setSalesforceOrderLineId(refVal_setSalesforceOrderLineId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("ads_manager_order_line_id"))))
    {
        utility::string_t refVal_setAdsManagerOrderLineId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("ads_manager_order_line_id"))), refVal_setAdsManagerOrderLineId );
        setAdsManagerOrderLineId(refVal_setAdsManagerOrderLineId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("pin_order_id"))))
    {
        utility::string_t refVal_setPinOrderId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("pin_order_id"))), refVal_setPinOrderId );
        setPinOrderId(refVal_setPinOrderId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("last_modified_date_time"))))
    {
        utility::string_t refVal_setLastModifiedDateTime;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("last_modified_date_time"))), refVal_setLastModifiedDateTime );
        setLastModifiedDateTime(refVal_setLastModifiedDateTime);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("start_date"))))
    {
        utility::datetime refVal_setStartDate;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("start_date"))), refVal_setStartDate );
        setStartDate(refVal_setStartDate);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("end_date"))))
    {
        utility::datetime refVal_setEndDate;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("end_date"))), refVal_setEndDate );
        setEndDate(refVal_setEndDate);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("bill_to_company_name"))))
    {
        utility::string_t refVal_setBillToCompanyName;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("bill_to_company_name"))), refVal_setBillToCompanyName );
        setBillToCompanyName(refVal_setBillToCompanyName);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("billing_contact_firstname"))))
    {
        utility::string_t refVal_setBillingContactFirstname;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("billing_contact_firstname"))), refVal_setBillingContactFirstname );
        setBillingContactFirstname(refVal_setBillingContactFirstname);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("billing_contact_lastname"))))
    {
        utility::string_t refVal_setBillingContactLastname;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("billing_contact_lastname"))), refVal_setBillingContactLastname );
        setBillingContactLastname(refVal_setBillingContactLastname);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("billing_contact_email"))))
    {
        utility::string_t refVal_setBillingContactEmail;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("billing_contact_email"))), refVal_setBillingContactEmail );
        setBillingContactEmail(refVal_setBillingContactEmail);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("media_contact_email"))))
    {
        utility::string_t refVal_setMediaContactEmail;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("media_contact_email"))), refVal_setMediaContactEmail );
        setMediaContactEmail(refVal_setMediaContactEmail);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("media_contact_firstname"))))
    {
        utility::string_t refVal_setMediaContactFirstname;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("media_contact_firstname"))), refVal_setMediaContactFirstname );
        setMediaContactFirstname(refVal_setMediaContactFirstname);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("media_contact_lastname"))))
    {
        utility::string_t refVal_setMediaContactLastname;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("media_contact_lastname"))), refVal_setMediaContactLastname );
        setMediaContactLastname(refVal_setMediaContactLastname);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("currency_info"))))
    {
        std::shared_ptr<Currency> refVal_setCurrencyInfo;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("currency_info"))), refVal_setCurrencyInfo );
        setCurrencyInfo(refVal_setCurrencyInfo);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("agency_link"))))
    {
        utility::string_t refVal_setAgencyLink;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("agency_link"))), refVal_setAgencyLink );
        setAgencyLink(refVal_setAgencyLink);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("po_number"))))
    {
        utility::string_t refVal_setPoNumber;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("po_number"))), refVal_setPoNumber );
        setPoNumber(refVal_setPoNumber);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("order_name"))))
    {
        utility::string_t refVal_setOrderName;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("order_name"))), refVal_setOrderName );
        setOrderName(refVal_setOrderName);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("pmp_name"))))
    {
        utility::string_t refVal_setPmpName;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("pmp_name"))), refVal_setPmpName );
        setPmpName(refVal_setPmpName);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("accepted_terms_id"))))
    {
        utility::string_t refVal_setAcceptedTermsId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("accepted_terms_id"))), refVal_setAcceptedTermsId );
        setAcceptedTermsId(refVal_setAcceptedTermsId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("accepted_terms_time"))))
    {
        utility::string_t refVal_setAcceptedTermsTime;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("accepted_terms_time"))), refVal_setAcceptedTermsTime );
        setAcceptedTermsTime(refVal_setAcceptedTermsTime);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("budget_amount"))))
    {
        double refVal_setBudgetAmount;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("budget_amount"))), refVal_setBudgetAmount );
        setBudgetAmount(refVal_setBudgetAmount);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("estimated_monthly_spend"))))
    {
        double refVal_setEstimatedMonthlySpend;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("estimated_monthly_spend"))), refVal_setEstimatedMonthlySpend );
        setEstimatedMonthlySpend(refVal_setEstimatedMonthlySpend);
    }
    return ok;
}

utility::string_t SSIOOrderLine::getSalesforceOrderLineId() const
{
    return m_Salesforce_order_line_id;
}

void SSIOOrderLine::setSalesforceOrderLineId(const utility::string_t& value)
{
    m_Salesforce_order_line_id = value;
    m_Salesforce_order_line_idIsSet = true;
}

bool SSIOOrderLine::salesforceOrderLineIdIsSet() const
{
    return m_Salesforce_order_line_idIsSet;
}

void SSIOOrderLine::unsetSalesforce_order_line_id()
{
    m_Salesforce_order_line_idIsSet = false;
}
utility::string_t SSIOOrderLine::getAdsManagerOrderLineId() const
{
    return m_Ads_manager_order_line_id;
}

void SSIOOrderLine::setAdsManagerOrderLineId(const utility::string_t& value)
{
    m_Ads_manager_order_line_id = value;
    m_Ads_manager_order_line_idIsSet = true;
}

bool SSIOOrderLine::adsManagerOrderLineIdIsSet() const
{
    return m_Ads_manager_order_line_idIsSet;
}

void SSIOOrderLine::unsetAds_manager_order_line_id()
{
    m_Ads_manager_order_line_idIsSet = false;
}
utility::string_t SSIOOrderLine::getPinOrderId() const
{
    return m_Pin_order_id;
}

void SSIOOrderLine::setPinOrderId(const utility::string_t& value)
{
    m_Pin_order_id = value;
    m_Pin_order_idIsSet = true;
}

bool SSIOOrderLine::pinOrderIdIsSet() const
{
    return m_Pin_order_idIsSet;
}

void SSIOOrderLine::unsetPin_order_id()
{
    m_Pin_order_idIsSet = false;
}
utility::string_t SSIOOrderLine::getLastModifiedDateTime() const
{
    return m_Last_modified_date_time;
}

void SSIOOrderLine::setLastModifiedDateTime(const utility::string_t& value)
{
    m_Last_modified_date_time = value;
    m_Last_modified_date_timeIsSet = true;
}

bool SSIOOrderLine::lastModifiedDateTimeIsSet() const
{
    return m_Last_modified_date_timeIsSet;
}

void SSIOOrderLine::unsetLast_modified_date_time()
{
    m_Last_modified_date_timeIsSet = false;
}
utility::datetime SSIOOrderLine::getStartDate() const
{
    return m_Start_date;
}

void SSIOOrderLine::setStartDate(const utility::datetime& value)
{
    m_Start_date = value;
    m_Start_dateIsSet = true;
}

bool SSIOOrderLine::startDateIsSet() const
{
    return m_Start_dateIsSet;
}

void SSIOOrderLine::unsetStart_date()
{
    m_Start_dateIsSet = false;
}
utility::datetime SSIOOrderLine::getEndDate() const
{
    return m_End_date;
}

void SSIOOrderLine::setEndDate(const utility::datetime& value)
{
    m_End_date = value;
    m_End_dateIsSet = true;
}

bool SSIOOrderLine::endDateIsSet() const
{
    return m_End_dateIsSet;
}

void SSIOOrderLine::unsetEnd_date()
{
    m_End_dateIsSet = false;
}
utility::string_t SSIOOrderLine::getBillToCompanyName() const
{
    return m_Bill_to_company_name;
}

void SSIOOrderLine::setBillToCompanyName(const utility::string_t& value)
{
    m_Bill_to_company_name = value;
    m_Bill_to_company_nameIsSet = true;
}

bool SSIOOrderLine::billToCompanyNameIsSet() const
{
    return m_Bill_to_company_nameIsSet;
}

void SSIOOrderLine::unsetBill_to_company_name()
{
    m_Bill_to_company_nameIsSet = false;
}
utility::string_t SSIOOrderLine::getBillingContactFirstname() const
{
    return m_Billing_contact_firstname;
}

void SSIOOrderLine::setBillingContactFirstname(const utility::string_t& value)
{
    m_Billing_contact_firstname = value;
    m_Billing_contact_firstnameIsSet = true;
}

bool SSIOOrderLine::billingContactFirstnameIsSet() const
{
    return m_Billing_contact_firstnameIsSet;
}

void SSIOOrderLine::unsetBilling_contact_firstname()
{
    m_Billing_contact_firstnameIsSet = false;
}
utility::string_t SSIOOrderLine::getBillingContactLastname() const
{
    return m_Billing_contact_lastname;
}

void SSIOOrderLine::setBillingContactLastname(const utility::string_t& value)
{
    m_Billing_contact_lastname = value;
    m_Billing_contact_lastnameIsSet = true;
}

bool SSIOOrderLine::billingContactLastnameIsSet() const
{
    return m_Billing_contact_lastnameIsSet;
}

void SSIOOrderLine::unsetBilling_contact_lastname()
{
    m_Billing_contact_lastnameIsSet = false;
}
utility::string_t SSIOOrderLine::getBillingContactEmail() const
{
    return m_Billing_contact_email;
}

void SSIOOrderLine::setBillingContactEmail(const utility::string_t& value)
{
    m_Billing_contact_email = value;
    m_Billing_contact_emailIsSet = true;
}

bool SSIOOrderLine::billingContactEmailIsSet() const
{
    return m_Billing_contact_emailIsSet;
}

void SSIOOrderLine::unsetBilling_contact_email()
{
    m_Billing_contact_emailIsSet = false;
}
utility::string_t SSIOOrderLine::getMediaContactEmail() const
{
    return m_Media_contact_email;
}

void SSIOOrderLine::setMediaContactEmail(const utility::string_t& value)
{
    m_Media_contact_email = value;
    m_Media_contact_emailIsSet = true;
}

bool SSIOOrderLine::mediaContactEmailIsSet() const
{
    return m_Media_contact_emailIsSet;
}

void SSIOOrderLine::unsetMedia_contact_email()
{
    m_Media_contact_emailIsSet = false;
}
utility::string_t SSIOOrderLine::getMediaContactFirstname() const
{
    return m_Media_contact_firstname;
}

void SSIOOrderLine::setMediaContactFirstname(const utility::string_t& value)
{
    m_Media_contact_firstname = value;
    m_Media_contact_firstnameIsSet = true;
}

bool SSIOOrderLine::mediaContactFirstnameIsSet() const
{
    return m_Media_contact_firstnameIsSet;
}

void SSIOOrderLine::unsetMedia_contact_firstname()
{
    m_Media_contact_firstnameIsSet = false;
}
utility::string_t SSIOOrderLine::getMediaContactLastname() const
{
    return m_Media_contact_lastname;
}

void SSIOOrderLine::setMediaContactLastname(const utility::string_t& value)
{
    m_Media_contact_lastname = value;
    m_Media_contact_lastnameIsSet = true;
}

bool SSIOOrderLine::mediaContactLastnameIsSet() const
{
    return m_Media_contact_lastnameIsSet;
}

void SSIOOrderLine::unsetMedia_contact_lastname()
{
    m_Media_contact_lastnameIsSet = false;
}
std::shared_ptr<Currency> SSIOOrderLine::getCurrencyInfo() const
{
    return m_Currency_info;
}

void SSIOOrderLine::setCurrencyInfo(const std::shared_ptr<Currency>& value)
{
    m_Currency_info = value;
    m_Currency_infoIsSet = true;
}

bool SSIOOrderLine::currencyInfoIsSet() const
{
    return m_Currency_infoIsSet;
}

void SSIOOrderLine::unsetCurrency_info()
{
    m_Currency_infoIsSet = false;
}
utility::string_t SSIOOrderLine::getAgencyLink() const
{
    return m_Agency_link;
}

void SSIOOrderLine::setAgencyLink(const utility::string_t& value)
{
    m_Agency_link = value;
    m_Agency_linkIsSet = true;
}

bool SSIOOrderLine::agencyLinkIsSet() const
{
    return m_Agency_linkIsSet;
}

void SSIOOrderLine::unsetAgency_link()
{
    m_Agency_linkIsSet = false;
}
utility::string_t SSIOOrderLine::getPoNumber() const
{
    return m_Po_number;
}

void SSIOOrderLine::setPoNumber(const utility::string_t& value)
{
    m_Po_number = value;
    m_Po_numberIsSet = true;
}

bool SSIOOrderLine::poNumberIsSet() const
{
    return m_Po_numberIsSet;
}

void SSIOOrderLine::unsetPo_number()
{
    m_Po_numberIsSet = false;
}
utility::string_t SSIOOrderLine::getOrderName() const
{
    return m_Order_name;
}

void SSIOOrderLine::setOrderName(const utility::string_t& value)
{
    m_Order_name = value;
    m_Order_nameIsSet = true;
}

bool SSIOOrderLine::orderNameIsSet() const
{
    return m_Order_nameIsSet;
}

void SSIOOrderLine::unsetOrder_name()
{
    m_Order_nameIsSet = false;
}
utility::string_t SSIOOrderLine::getPmpName() const
{
    return m_Pmp_name;
}

void SSIOOrderLine::setPmpName(const utility::string_t& value)
{
    m_Pmp_name = value;
    m_Pmp_nameIsSet = true;
}

bool SSIOOrderLine::pmpNameIsSet() const
{
    return m_Pmp_nameIsSet;
}

void SSIOOrderLine::unsetPmp_name()
{
    m_Pmp_nameIsSet = false;
}
utility::string_t SSIOOrderLine::getAcceptedTermsId() const
{
    return m_Accepted_terms_id;
}

void SSIOOrderLine::setAcceptedTermsId(const utility::string_t& value)
{
    m_Accepted_terms_id = value;
    m_Accepted_terms_idIsSet = true;
}

bool SSIOOrderLine::acceptedTermsIdIsSet() const
{
    return m_Accepted_terms_idIsSet;
}

void SSIOOrderLine::unsetAccepted_terms_id()
{
    m_Accepted_terms_idIsSet = false;
}
utility::string_t SSIOOrderLine::getAcceptedTermsTime() const
{
    return m_Accepted_terms_time;
}

void SSIOOrderLine::setAcceptedTermsTime(const utility::string_t& value)
{
    m_Accepted_terms_time = value;
    m_Accepted_terms_timeIsSet = true;
}

bool SSIOOrderLine::acceptedTermsTimeIsSet() const
{
    return m_Accepted_terms_timeIsSet;
}

void SSIOOrderLine::unsetAccepted_terms_time()
{
    m_Accepted_terms_timeIsSet = false;
}
double SSIOOrderLine::getBudgetAmount() const
{
    return m_Budget_amount;
}

void SSIOOrderLine::setBudgetAmount(double value)
{
    m_Budget_amount = value;
    m_Budget_amountIsSet = true;
}

bool SSIOOrderLine::budgetAmountIsSet() const
{
    return m_Budget_amountIsSet;
}

void SSIOOrderLine::unsetBudget_amount()
{
    m_Budget_amountIsSet = false;
}
double SSIOOrderLine::getEstimatedMonthlySpend() const
{
    return m_Estimated_monthly_spend;
}

void SSIOOrderLine::setEstimatedMonthlySpend(double value)
{
    m_Estimated_monthly_spend = value;
    m_Estimated_monthly_spendIsSet = true;
}

bool SSIOOrderLine::estimatedMonthlySpendIsSet() const
{
    return m_Estimated_monthly_spendIsSet;
}

void SSIOOrderLine::unsetEstimated_monthly_spend()
{
    m_Estimated_monthly_spendIsSet = false;
}
}
}
}
}


