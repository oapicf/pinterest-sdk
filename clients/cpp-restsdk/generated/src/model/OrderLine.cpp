/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/OrderLine.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



OrderLine::OrderLine()
{
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_Type = utility::conversions::to_string_t("");
    m_TypeIsSet = false;
    m_Ad_account_id = utility::conversions::to_string_t("");
    m_Ad_account_idIsSet = false;
    m_Purchase_order_id = utility::conversions::to_string_t("");
    m_Purchase_order_idIsSet = false;
    m_Start_time = 0.0;
    m_Start_timeIsSet = false;
    m_End_time = 0.0;
    m_End_timeIsSet = false;
    m_Budget = 0.0;
    m_BudgetIsSet = false;
    m_Paid_budget = 0.0;
    m_Paid_budgetIsSet = false;
    m_StatusIsSet = false;
    m_Name = utility::conversions::to_string_t("");
    m_NameIsSet = false;
    m_Paid_typeIsSet = false;
    m_Campaign_idsIsSet = false;
}

OrderLine::~OrderLine()
{
}

void OrderLine::validate()
{
    // TODO: implement validation
}

web::json::value OrderLine::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_IdIsSet)
    {
        val[utility::conversions::to_string_t(U("id"))] = ModelBase::toJson(m_Id);
    }
    if(m_TypeIsSet)
    {
        val[utility::conversions::to_string_t(U("type"))] = ModelBase::toJson(m_Type);
    }
    if(m_Ad_account_idIsSet)
    {
        val[utility::conversions::to_string_t(U("ad_account_id"))] = ModelBase::toJson(m_Ad_account_id);
    }
    if(m_Purchase_order_idIsSet)
    {
        val[utility::conversions::to_string_t(U("purchase_order_id"))] = ModelBase::toJson(m_Purchase_order_id);
    }
    if(m_Start_timeIsSet)
    {
        val[utility::conversions::to_string_t(U("start_time"))] = ModelBase::toJson(m_Start_time);
    }
    if(m_End_timeIsSet)
    {
        val[utility::conversions::to_string_t(U("end_time"))] = ModelBase::toJson(m_End_time);
    }
    if(m_BudgetIsSet)
    {
        val[utility::conversions::to_string_t(U("budget"))] = ModelBase::toJson(m_Budget);
    }
    if(m_Paid_budgetIsSet)
    {
        val[utility::conversions::to_string_t(U("paid_budget"))] = ModelBase::toJson(m_Paid_budget);
    }
    if(m_StatusIsSet)
    {
        val[utility::conversions::to_string_t(U("status"))] = ModelBase::toJson(m_Status);
    }
    if(m_NameIsSet)
    {
        val[utility::conversions::to_string_t(U("name"))] = ModelBase::toJson(m_Name);
    }
    if(m_Paid_typeIsSet)
    {
        val[utility::conversions::to_string_t(U("paid_type"))] = ModelBase::toJson(m_Paid_type);
    }
    if(m_Campaign_idsIsSet)
    {
        val[utility::conversions::to_string_t(U("campaign_ids"))] = ModelBase::toJson(m_Campaign_ids);
    }

    return val;
}

bool OrderLine::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setId);
            setId(refVal_setId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("type"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("type")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setType;
            ok &= ModelBase::fromJson(fieldValue, refVal_setType);
            setType(refVal_setType);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("ad_account_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("ad_account_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setAdAccountId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAdAccountId);
            setAdAccountId(refVal_setAdAccountId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("purchase_order_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("purchase_order_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setPurchaseOrderId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPurchaseOrderId);
            setPurchaseOrderId(refVal_setPurchaseOrderId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("start_time"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("start_time")));
        if(!fieldValue.is_null())
        {
            double refVal_setStartTime;
            ok &= ModelBase::fromJson(fieldValue, refVal_setStartTime);
            setStartTime(refVal_setStartTime);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("end_time"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("end_time")));
        if(!fieldValue.is_null())
        {
            double refVal_setEndTime;
            ok &= ModelBase::fromJson(fieldValue, refVal_setEndTime);
            setEndTime(refVal_setEndTime);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("budget"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("budget")));
        if(!fieldValue.is_null())
        {
            double refVal_setBudget;
            ok &= ModelBase::fromJson(fieldValue, refVal_setBudget);
            setBudget(refVal_setBudget);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("paid_budget"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("paid_budget")));
        if(!fieldValue.is_null())
        {
            double refVal_setPaidBudget;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPaidBudget);
            setPaidBudget(refVal_setPaidBudget);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("status"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("status")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<OrderLineStatus> refVal_setStatus;
            ok &= ModelBase::fromJson(fieldValue, refVal_setStatus);
            setStatus(refVal_setStatus);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("name"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("name")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setName;
            ok &= ModelBase::fromJson(fieldValue, refVal_setName);
            setName(refVal_setName);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("paid_type"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("paid_type")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<OrderLinePaidType> refVal_setPaidType;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPaidType);
            setPaidType(refVal_setPaidType);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("campaign_ids"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("campaign_ids")));
        if(!fieldValue.is_null())
        {
            std::vector<utility::string_t> refVal_setCampaignIds;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCampaignIds);
            setCampaignIds(refVal_setCampaignIds);
        }
    }
    return ok;
}

void OrderLine::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_IdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("id")), m_Id));
    }
    if(m_TypeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("type")), m_Type));
    }
    if(m_Ad_account_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("ad_account_id")), m_Ad_account_id));
    }
    if(m_Purchase_order_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("purchase_order_id")), m_Purchase_order_id));
    }
    if(m_Start_timeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("start_time")), m_Start_time));
    }
    if(m_End_timeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("end_time")), m_End_time));
    }
    if(m_BudgetIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("budget")), m_Budget));
    }
    if(m_Paid_budgetIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("paid_budget")), m_Paid_budget));
    }
    if(m_StatusIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("status")), m_Status));
    }
    if(m_NameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("name")), m_Name));
    }
    if(m_Paid_typeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("paid_type")), m_Paid_type));
    }
    if(m_Campaign_idsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("campaign_ids")), m_Campaign_ids));
    }
}

bool OrderLine::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("id"))))
    {
        utility::string_t refVal_setId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("id"))), refVal_setId );
        setId(refVal_setId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("type"))))
    {
        utility::string_t refVal_setType;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("type"))), refVal_setType );
        setType(refVal_setType);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("ad_account_id"))))
    {
        utility::string_t refVal_setAdAccountId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("ad_account_id"))), refVal_setAdAccountId );
        setAdAccountId(refVal_setAdAccountId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("purchase_order_id"))))
    {
        utility::string_t refVal_setPurchaseOrderId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("purchase_order_id"))), refVal_setPurchaseOrderId );
        setPurchaseOrderId(refVal_setPurchaseOrderId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("start_time"))))
    {
        double refVal_setStartTime;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("start_time"))), refVal_setStartTime );
        setStartTime(refVal_setStartTime);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("end_time"))))
    {
        double refVal_setEndTime;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("end_time"))), refVal_setEndTime );
        setEndTime(refVal_setEndTime);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("budget"))))
    {
        double refVal_setBudget;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("budget"))), refVal_setBudget );
        setBudget(refVal_setBudget);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("paid_budget"))))
    {
        double refVal_setPaidBudget;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("paid_budget"))), refVal_setPaidBudget );
        setPaidBudget(refVal_setPaidBudget);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("status"))))
    {
        std::shared_ptr<OrderLineStatus> refVal_setStatus;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("status"))), refVal_setStatus );
        setStatus(refVal_setStatus);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("name"))))
    {
        utility::string_t refVal_setName;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("name"))), refVal_setName );
        setName(refVal_setName);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("paid_type"))))
    {
        std::shared_ptr<OrderLinePaidType> refVal_setPaidType;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("paid_type"))), refVal_setPaidType );
        setPaidType(refVal_setPaidType);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("campaign_ids"))))
    {
        std::vector<utility::string_t> refVal_setCampaignIds;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("campaign_ids"))), refVal_setCampaignIds );
        setCampaignIds(refVal_setCampaignIds);
    }
    return ok;
}

utility::string_t OrderLine::getId() const
{
    return m_Id;
}

void OrderLine::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool OrderLine::idIsSet() const
{
    return m_IdIsSet;
}

void OrderLine::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t OrderLine::getType() const
{
    return m_Type;
}

void OrderLine::setType(const utility::string_t& value)
{
    m_Type = value;
    m_TypeIsSet = true;
}

bool OrderLine::typeIsSet() const
{
    return m_TypeIsSet;
}

void OrderLine::unsetType()
{
    m_TypeIsSet = false;
}
utility::string_t OrderLine::getAdAccountId() const
{
    return m_Ad_account_id;
}

void OrderLine::setAdAccountId(const utility::string_t& value)
{
    m_Ad_account_id = value;
    m_Ad_account_idIsSet = true;
}

bool OrderLine::adAccountIdIsSet() const
{
    return m_Ad_account_idIsSet;
}

void OrderLine::unsetAd_account_id()
{
    m_Ad_account_idIsSet = false;
}
utility::string_t OrderLine::getPurchaseOrderId() const
{
    return m_Purchase_order_id;
}

void OrderLine::setPurchaseOrderId(const utility::string_t& value)
{
    m_Purchase_order_id = value;
    m_Purchase_order_idIsSet = true;
}

bool OrderLine::purchaseOrderIdIsSet() const
{
    return m_Purchase_order_idIsSet;
}

void OrderLine::unsetPurchase_order_id()
{
    m_Purchase_order_idIsSet = false;
}
double OrderLine::getStartTime() const
{
    return m_Start_time;
}

void OrderLine::setStartTime(double value)
{
    m_Start_time = value;
    m_Start_timeIsSet = true;
}

bool OrderLine::startTimeIsSet() const
{
    return m_Start_timeIsSet;
}

void OrderLine::unsetStart_time()
{
    m_Start_timeIsSet = false;
}
double OrderLine::getEndTime() const
{
    return m_End_time;
}

void OrderLine::setEndTime(double value)
{
    m_End_time = value;
    m_End_timeIsSet = true;
}

bool OrderLine::endTimeIsSet() const
{
    return m_End_timeIsSet;
}

void OrderLine::unsetEnd_time()
{
    m_End_timeIsSet = false;
}
double OrderLine::getBudget() const
{
    return m_Budget;
}

void OrderLine::setBudget(double value)
{
    m_Budget = value;
    m_BudgetIsSet = true;
}

bool OrderLine::budgetIsSet() const
{
    return m_BudgetIsSet;
}

void OrderLine::unsetBudget()
{
    m_BudgetIsSet = false;
}
double OrderLine::getPaidBudget() const
{
    return m_Paid_budget;
}

void OrderLine::setPaidBudget(double value)
{
    m_Paid_budget = value;
    m_Paid_budgetIsSet = true;
}

bool OrderLine::paidBudgetIsSet() const
{
    return m_Paid_budgetIsSet;
}

void OrderLine::unsetPaid_budget()
{
    m_Paid_budgetIsSet = false;
}
std::shared_ptr<OrderLineStatus> OrderLine::getStatus() const
{
    return m_Status;
}

void OrderLine::setStatus(const std::shared_ptr<OrderLineStatus>& value)
{
    m_Status = value;
    m_StatusIsSet = true;
}

bool OrderLine::statusIsSet() const
{
    return m_StatusIsSet;
}

void OrderLine::unsetStatus()
{
    m_StatusIsSet = false;
}
utility::string_t OrderLine::getName() const
{
    return m_Name;
}

void OrderLine::setName(const utility::string_t& value)
{
    m_Name = value;
    m_NameIsSet = true;
}

bool OrderLine::nameIsSet() const
{
    return m_NameIsSet;
}

void OrderLine::unsetName()
{
    m_NameIsSet = false;
}
std::shared_ptr<OrderLinePaidType> OrderLine::getPaidType() const
{
    return m_Paid_type;
}

void OrderLine::setPaidType(const std::shared_ptr<OrderLinePaidType>& value)
{
    m_Paid_type = value;
    m_Paid_typeIsSet = true;
}

bool OrderLine::paidTypeIsSet() const
{
    return m_Paid_typeIsSet;
}

void OrderLine::unsetPaid_type()
{
    m_Paid_typeIsSet = false;
}
std::vector<utility::string_t>& OrderLine::getCampaignIds()
{
    return m_Campaign_ids;
}

void OrderLine::setCampaignIds(const std::vector<utility::string_t>& value)
{
    m_Campaign_ids = value;
    m_Campaign_idsIsSet = true;
}

bool OrderLine::campaignIdsIsSet() const
{
    return m_Campaign_idsIsSet;
}

void OrderLine::unsetCampaign_ids()
{
    m_Campaign_idsIsSet = false;
}
}
}
}
}

