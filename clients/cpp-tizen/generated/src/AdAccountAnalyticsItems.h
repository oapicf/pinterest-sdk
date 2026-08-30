/*
 * AdAccountAnalyticsItems.h
 *
 * 
 */

#ifndef _AdAccountAnalyticsItems_H_
#define _AdAccountAnalyticsItems_H_


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

class AdAccountAnalyticsItems : public Object {
public:
	/*! \brief Constructor.
	 */
	AdAccountAnalyticsItems();
	AdAccountAnalyticsItems(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdAccountAnalyticsItems();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getADACCOUNTID();

	/*! \brief Set 
	 */
	void setADACCOUNTID(std::string  aD_ACCOUNT_ID);
	/*! \brief Get 
	 */
	Date getDATE();

	/*! \brief Set 
	 */
	void setDATE(Date  dATE);

private:
	std::string aD_ACCOUNT_ID;
	Date dATE;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdAccountAnalyticsItems_H_ */
