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



#include "CppRestOpenAPIClient/model/SSIOInsertionOrderCommon.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



SSIOInsertionOrderCommon::SSIOInsertionOrderCommon()
{
    m_Start_date = utility::conversions::to_string_t("");
    m_Start_dateIsSet = false;
    m_End_date = utility::conversions::to_string_t("");
    m_End_dateIsSet = false;
    m_Po_number = utility::conversions::to_string_t("");
    m_Po_numberIsSet = false;
    m_Budget_amount = 0.0;
    m_Budget_amountIsSet = false;
    m_Billing_contact_firstname = utility::conversions::to_string_t("");
    m_Billing_contact_firstnameIsSet = false;
    m_Billing_contact_lastname = utility::conversions::to_string_t("");
    m_Billing_contact_lastnameIsSet = false;
    m_Billing_contact_email = utility::conversions::to_string_t("");
    m_Billing_contact_emailIsSet = false;
    m_Media_contact_firstname = utility::conversions::to_string_t("");
    m_Media_contact_firstnameIsSet = false;
    m_Media_contact_lastname = utility::conversions::to_string_t("");
    m_Media_contact_lastnameIsSet = false;
    m_Media_contact_email = utility::conversions::to_string_t("");
    m_Media_contact_emailIsSet = false;
    m_Agency_link = utility::conversions::to_string_t("");
    m_Agency_linkIsSet = false;
    m_User_email = utility::conversions::to_string_t("");
    m_User_emailIsSet = false;
}

SSIOInsertionOrderCommon::~SSIOInsertionOrderCommon()
{
}

void SSIOInsertionOrderCommon::validate()
{
    // TODO: implement validation
}

web::json::value SSIOInsertionOrderCommon::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_Start_dateIsSet)
    {
        val[utility::conversions::to_string_t(U("start_date"))] = ModelBase::toJson(m_Start_date);
    }
    if(m_End_dateIsSet)
    {
        val[utility::conversions::to_string_t(U("end_date"))] = ModelBase::toJson(m_End_date);
    }
    if(m_Po_numberIsSet)
    {
        val[utility::conversions::to_string_t(U("po_number"))] = ModelBase::toJson(m_Po_number);
    }
    if(m_Budget_amountIsSet)
    {
        val[utility::conversions::to_string_t(U("budget_amount"))] = ModelBase::toJson(m_Budget_amount);
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
    if(m_Media_contact_firstnameIsSet)
    {
        val[utility::conversions::to_string_t(U("media_contact_firstname"))] = ModelBase::toJson(m_Media_contact_firstname);
    }
    if(m_Media_contact_lastnameIsSet)
    {
        val[utility::conversions::to_string_t(U("media_contact_lastname"))] = ModelBase::toJson(m_Media_contact_lastname);
    }
    if(m_Media_contact_emailIsSet)
    {
        val[utility::conversions::to_string_t(U("media_contact_email"))] = ModelBase::toJson(m_Media_contact_email);
    }
    if(m_Agency_linkIsSet)
    {
        val[utility::conversions::to_string_t(U("agency_link"))] = ModelBase::toJson(m_Agency_link);
    }
    if(m_User_emailIsSet)
    {
        val[utility::conversions::to_string_t(U("user_email"))] = ModelBase::toJson(m_User_email);
    }

    return val;
}

bool SSIOInsertionOrderCommon::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("start_date"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("start_date")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setStartDate;
            ok &= ModelBase::fromJson(fieldValue, refVal_setStartDate);
            setStartDate(refVal_setStartDate);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("end_date"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("end_date")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setEndDate;
            ok &= ModelBase::fromJson(fieldValue, refVal_setEndDate);
            setEndDate(refVal_setEndDate);
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
    if(val.has_field(utility::conversions::to_string_t(U("user_email"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("user_email")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setUserEmail;
            ok &= ModelBase::fromJson(fieldValue, refVal_setUserEmail);
            setUserEmail(refVal_setUserEmail);
        }
    }
    return ok;
}

void SSIOInsertionOrderCommon::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_Start_dateIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("start_date")), m_Start_date));
    }
    if(m_End_dateIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("end_date")), m_End_date));
    }
    if(m_Po_numberIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("po_number")), m_Po_number));
    }
    if(m_Budget_amountIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("budget_amount")), m_Budget_amount));
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
    if(m_Media_contact_firstnameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("media_contact_firstname")), m_Media_contact_firstname));
    }
    if(m_Media_contact_lastnameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("media_contact_lastname")), m_Media_contact_lastname));
    }
    if(m_Media_contact_emailIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("media_contact_email")), m_Media_contact_email));
    }
    if(m_Agency_linkIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("agency_link")), m_Agency_link));
    }
    if(m_User_emailIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("user_email")), m_User_email));
    }
}

bool SSIOInsertionOrderCommon::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("start_date"))))
    {
        utility::string_t refVal_setStartDate;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("start_date"))), refVal_setStartDate );
        setStartDate(refVal_setStartDate);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("end_date"))))
    {
        utility::string_t refVal_setEndDate;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("end_date"))), refVal_setEndDate );
        setEndDate(refVal_setEndDate);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("po_number"))))
    {
        utility::string_t refVal_setPoNumber;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("po_number"))), refVal_setPoNumber );
        setPoNumber(refVal_setPoNumber);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("budget_amount"))))
    {
        double refVal_setBudgetAmount;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("budget_amount"))), refVal_setBudgetAmount );
        setBudgetAmount(refVal_setBudgetAmount);
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("media_contact_email"))))
    {
        utility::string_t refVal_setMediaContactEmail;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("media_contact_email"))), refVal_setMediaContactEmail );
        setMediaContactEmail(refVal_setMediaContactEmail);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("agency_link"))))
    {
        utility::string_t refVal_setAgencyLink;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("agency_link"))), refVal_setAgencyLink );
        setAgencyLink(refVal_setAgencyLink);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("user_email"))))
    {
        utility::string_t refVal_setUserEmail;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("user_email"))), refVal_setUserEmail );
        setUserEmail(refVal_setUserEmail);
    }
    return ok;
}

utility::string_t SSIOInsertionOrderCommon::getStartDate() const
{
    return m_Start_date;
}

void SSIOInsertionOrderCommon::setStartDate(const utility::string_t& value)
{
    m_Start_date = value;
    m_Start_dateIsSet = true;
}

bool SSIOInsertionOrderCommon::startDateIsSet() const
{
    return m_Start_dateIsSet;
}

void SSIOInsertionOrderCommon::unsetStart_date()
{
    m_Start_dateIsSet = false;
}
utility::string_t SSIOInsertionOrderCommon::getEndDate() const
{
    return m_End_date;
}

void SSIOInsertionOrderCommon::setEndDate(const utility::string_t& value)
{
    m_End_date = value;
    m_End_dateIsSet = true;
}

bool SSIOInsertionOrderCommon::endDateIsSet() const
{
    return m_End_dateIsSet;
}

void SSIOInsertionOrderCommon::unsetEnd_date()
{
    m_End_dateIsSet = false;
}
utility::string_t SSIOInsertionOrderCommon::getPoNumber() const
{
    return m_Po_number;
}

void SSIOInsertionOrderCommon::setPoNumber(const utility::string_t& value)
{
    m_Po_number = value;
    m_Po_numberIsSet = true;
}

bool SSIOInsertionOrderCommon::poNumberIsSet() const
{
    return m_Po_numberIsSet;
}

void SSIOInsertionOrderCommon::unsetPo_number()
{
    m_Po_numberIsSet = false;
}
double SSIOInsertionOrderCommon::getBudgetAmount() const
{
    return m_Budget_amount;
}

void SSIOInsertionOrderCommon::setBudgetAmount(double value)
{
    m_Budget_amount = value;
    m_Budget_amountIsSet = true;
}

bool SSIOInsertionOrderCommon::budgetAmountIsSet() const
{
    return m_Budget_amountIsSet;
}

void SSIOInsertionOrderCommon::unsetBudget_amount()
{
    m_Budget_amountIsSet = false;
}
utility::string_t SSIOInsertionOrderCommon::getBillingContactFirstname() const
{
    return m_Billing_contact_firstname;
}

void SSIOInsertionOrderCommon::setBillingContactFirstname(const utility::string_t& value)
{
    m_Billing_contact_firstname = value;
    m_Billing_contact_firstnameIsSet = true;
}

bool SSIOInsertionOrderCommon::billingContactFirstnameIsSet() const
{
    return m_Billing_contact_firstnameIsSet;
}

void SSIOInsertionOrderCommon::unsetBilling_contact_firstname()
{
    m_Billing_contact_firstnameIsSet = false;
}
utility::string_t SSIOInsertionOrderCommon::getBillingContactLastname() const
{
    return m_Billing_contact_lastname;
}

void SSIOInsertionOrderCommon::setBillingContactLastname(const utility::string_t& value)
{
    m_Billing_contact_lastname = value;
    m_Billing_contact_lastnameIsSet = true;
}

bool SSIOInsertionOrderCommon::billingContactLastnameIsSet() const
{
    return m_Billing_contact_lastnameIsSet;
}

void SSIOInsertionOrderCommon::unsetBilling_contact_lastname()
{
    m_Billing_contact_lastnameIsSet = false;
}
utility::string_t SSIOInsertionOrderCommon::getBillingContactEmail() const
{
    return m_Billing_contact_email;
}

void SSIOInsertionOrderCommon::setBillingContactEmail(const utility::string_t& value)
{
    m_Billing_contact_email = value;
    m_Billing_contact_emailIsSet = true;
}

bool SSIOInsertionOrderCommon::billingContactEmailIsSet() const
{
    return m_Billing_contact_emailIsSet;
}

void SSIOInsertionOrderCommon::unsetBilling_contact_email()
{
    m_Billing_contact_emailIsSet = false;
}
utility::string_t SSIOInsertionOrderCommon::getMediaContactFirstname() const
{
    return m_Media_contact_firstname;
}

void SSIOInsertionOrderCommon::setMediaContactFirstname(const utility::string_t& value)
{
    m_Media_contact_firstname = value;
    m_Media_contact_firstnameIsSet = true;
}

bool SSIOInsertionOrderCommon::mediaContactFirstnameIsSet() const
{
    return m_Media_contact_firstnameIsSet;
}

void SSIOInsertionOrderCommon::unsetMedia_contact_firstname()
{
    m_Media_contact_firstnameIsSet = false;
}
utility::string_t SSIOInsertionOrderCommon::getMediaContactLastname() const
{
    return m_Media_contact_lastname;
}

void SSIOInsertionOrderCommon::setMediaContactLastname(const utility::string_t& value)
{
    m_Media_contact_lastname = value;
    m_Media_contact_lastnameIsSet = true;
}

bool SSIOInsertionOrderCommon::mediaContactLastnameIsSet() const
{
    return m_Media_contact_lastnameIsSet;
}

void SSIOInsertionOrderCommon::unsetMedia_contact_lastname()
{
    m_Media_contact_lastnameIsSet = false;
}
utility::string_t SSIOInsertionOrderCommon::getMediaContactEmail() const
{
    return m_Media_contact_email;
}

void SSIOInsertionOrderCommon::setMediaContactEmail(const utility::string_t& value)
{
    m_Media_contact_email = value;
    m_Media_contact_emailIsSet = true;
}

bool SSIOInsertionOrderCommon::mediaContactEmailIsSet() const
{
    return m_Media_contact_emailIsSet;
}

void SSIOInsertionOrderCommon::unsetMedia_contact_email()
{
    m_Media_contact_emailIsSet = false;
}
utility::string_t SSIOInsertionOrderCommon::getAgencyLink() const
{
    return m_Agency_link;
}

void SSIOInsertionOrderCommon::setAgencyLink(const utility::string_t& value)
{
    m_Agency_link = value;
    m_Agency_linkIsSet = true;
}

bool SSIOInsertionOrderCommon::agencyLinkIsSet() const
{
    return m_Agency_linkIsSet;
}

void SSIOInsertionOrderCommon::unsetAgency_link()
{
    m_Agency_linkIsSet = false;
}
utility::string_t SSIOInsertionOrderCommon::getUserEmail() const
{
    return m_User_email;
}

void SSIOInsertionOrderCommon::setUserEmail(const utility::string_t& value)
{
    m_User_email = value;
    m_User_emailIsSet = true;
}

bool SSIOInsertionOrderCommon::userEmailIsSet() const
{
    return m_User_emailIsSet;
}

void SSIOInsertionOrderCommon::unsetUser_email()
{
    m_User_emailIsSet = false;
}
}
}
}
}


