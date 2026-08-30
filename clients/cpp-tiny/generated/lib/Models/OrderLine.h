
/*
 * OrderLine.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrderLine_H_
#define TINY_CPP_CLIENT_OrderLine_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrderLinePaidType.h"
#include "OrderLineStatus.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrderLine{
public:

    /*! \brief Constructor.
	 */
    OrderLine();
    OrderLine(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderLine();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Ad account ID.
	 */
	std::string getAdAccountId();

	/*! \brief Set Ad account ID.
	 */
	void setAdAccountId(std::string ad_account_id);
	/*! \brief Get Order line budget in micro currency.
	 */
	long getBudget();

	/*! \brief Set Order line budget in micro currency.
	 */
	void setBudget(long budget);
	/*! \brief Get Associated List of campaign IDs.
	 */
	std::list<std::string> getCampaignIds();

	/*! \brief Set Associated List of campaign IDs.
	 */
	void setCampaignIds(std::list<std::string> campaign_ids);
	/*! \brief Get End time. Unix timestamp.
	 */
	long getEndTime();

	/*! \brief Set End time. Unix timestamp.
	 */
	void setEndTime(long end_time);
	/*! \brief Get Order line ID.
	 */
	std::string getId();

	/*! \brief Set Order line ID.
	 */
	void setId(std::string id);
	/*! \brief Get Order line name.
	 */
	std::string getName();

	/*! \brief Set Order line name.
	 */
	void setName(std::string name);
	/*! \brief Get Order line paid budget in micro currency.
	 */
	long getPaidBudget();

	/*! \brief Set Order line paid budget in micro currency.
	 */
	void setPaidBudget(long paid_budget);
	/*! \brief Get Order line paid type.
	 */
	OrderLinePaidType getPaidType();

	/*! \brief Set Order line paid type.
	 */
	void setPaidType(OrderLinePaidType paid_type);
	/*! \brief Get Purchase order ID.
	 */
	std::string getPurchaseOrderId();

	/*! \brief Set Purchase order ID.
	 */
	void setPurchaseOrderId(std::string purchase_order_id);
	/*! \brief Get Start time. Unix timestamp.
	 */
	long getStartTime();

	/*! \brief Set Start time. Unix timestamp.
	 */
	void setStartTime(long start_time);
	/*! \brief Get Order line status.
	 */
	OrderLineStatus getStatus();

	/*! \brief Set Order line status.
	 */
	void setStatus(OrderLineStatus status);
	/*! \brief Get Always \"orderline\".
	 */
	std::string getType();

	/*! \brief Set Always \"orderline\".
	 */
	void setType(std::string type);


    private:
    std::string ad_account_id{};
    long budget{};
    std::list<std::string> campaign_ids;
    long end_time{};
    std::string id{};
    std::string name{};
    long paid_budget{};
    OrderLinePaidType paid_type;
    std::string purchase_order_id{};
    long start_time{};
    OrderLineStatus status;
    std::string type{};
};
}

#endif /* TINY_CPP_CLIENT_OrderLine_H_ */
