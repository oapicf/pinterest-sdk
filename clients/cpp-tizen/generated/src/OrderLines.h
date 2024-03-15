/*
 * OrderLines.h
 *
 * Order Line
 */

#ifndef _OrderLines_H_
#define _OrderLines_H_


#include <string>
#include "OrderLinePaidType.h"
#include "OrderLineStatus.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Order Line
 *
 *  \ingroup Models
 *
 */

class OrderLines : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderLines();
	OrderLines(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderLines();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Order line ID.
	 */
	std::string getId();

	/*! \brief Set Order line ID.
	 */
	void setId(std::string  id);
	/*! \brief Get Always \"orderline\".
	 */
	std::string getType();

	/*! \brief Set Always \"orderline\".
	 */
	void setType(std::string  type);
	/*! \brief Get Ad account ID.
	 */
	std::string getAdAccountId();

	/*! \brief Set Ad account ID.
	 */
	void setAdAccountId(std::string  ad_account_id);
	/*! \brief Get Purchase order ID.
	 */
	std::string getPurchaseOrderId();

	/*! \brief Set Purchase order ID.
	 */
	void setPurchaseOrderId(std::string  purchase_order_id);
	/*! \brief Get Start time. Unix timestamp.
	 */
	long long getStartTime();

	/*! \brief Set Start time. Unix timestamp.
	 */
	void setStartTime(long long  start_time);
	/*! \brief Get End time. Unix timestamp.
	 */
	long long getEndTime();

	/*! \brief Set End time. Unix timestamp.
	 */
	void setEndTime(long long  end_time);
	/*! \brief Get Order line budget in micro currency.
	 */
	long long getBudget();

	/*! \brief Set Order line budget in micro currency.
	 */
	void setBudget(long long  budget);
	/*! \brief Get Order line paid budget in micro currency.
	 */
	long long getPaidBudget();

	/*! \brief Set Order line paid budget in micro currency.
	 */
	void setPaidBudget(long long  paid_budget);
	/*! \brief Get Order line status.
	 */
	OrderLineStatus getStatus();

	/*! \brief Set Order line status.
	 */
	void setStatus(OrderLineStatus  status);
	/*! \brief Get Order line name.
	 */
	std::string getName();

	/*! \brief Set Order line name.
	 */
	void setName(std::string  name);
	/*! \brief Get Order line paid type.
	 */
	OrderLinePaidType getPaidType();

	/*! \brief Set Order line paid type.
	 */
	void setPaidType(OrderLinePaidType  paid_type);

private:
	std::string id;
	std::string type;
	std::string ad_account_id;
	std::string purchase_order_id;
	long long start_time;
	long long end_time;
	long long budget;
	long long paid_budget;
	OrderLineStatus status;
	std::string name;
	OrderLinePaidType paid_type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrderLines_H_ */
