/*
 * BidFloor.h
 *
 * 
 */

#ifndef _BidFloor_H_
#define _BidFloor_H_


#include <string>
#include <list>
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

class BidFloor : public Object {
public:
	/*! \brief Constructor.
	 */
	BidFloor();
	BidFloor(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BidFloor();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get A list of bid floors in micro currency. For example, [100000, 200000]
	 */
	std::list<int> getBidFloors();

	/*! \brief Set A list of bid floors in micro currency. For example, [100000, 200000]
	 */
	void setBidFloors(std::list <int> bid_floors);
	/*! \brief Get Always the string 'bidfloor'
	 */
	std::string getType();

	/*! \brief Set Always the string 'bidfloor'
	 */
	void setType(std::string  type);

private:
	std::list <int>bid_floors;
	std::string type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BidFloor_H_ */
