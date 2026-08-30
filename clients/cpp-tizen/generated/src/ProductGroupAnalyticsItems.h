/*
 * ProductGroupAnalyticsItems.h
 *
 * 
 */

#ifndef _ProductGroupAnalyticsItems_H_
#define _ProductGroupAnalyticsItems_H_


#include <string>
#include "Date.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ProductGroupAnalyticsItems : public Object {
public:
	/*! \brief Constructor.
	 */
	ProductGroupAnalyticsItems();
	ProductGroupAnalyticsItems(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProductGroupAnalyticsItems();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
	 */
	Date getDATE();

	/*! \brief Set Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
	 */
	void setDATE(Date  dATE);
	/*! \brief Get The ID of the product group that this metrics belongs to.
	 */
	std::string getPRODUCTGROUPID();

	/*! \brief Set The ID of the product group that this metrics belongs to.
	 */
	void setPRODUCTGROUPID(std::string  pRODUCT_GROUP_ID);

private:
	Date dATE;
	std::string pRODUCT_GROUP_ID;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProductGroupAnalyticsItems_H_ */
