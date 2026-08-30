
/*
 * BidFloor.h
 *
 * Bid floor request and response model.
 */

#ifndef TINY_CPP_CLIENT_BidFloor_H_
#define TINY_CPP_CLIENT_BidFloor_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief Bid floor request and response model.
 *
 *  \ingroup Models
 *
 */

class BidFloor{
public:

    /*! \brief Constructor.
	 */
    BidFloor();
    BidFloor(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BidFloor();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get A list of bid floors in micro currency. For example, [100000, 200000]
	 */
	std::list<int> getBidFloors();

	/*! \brief Set A list of bid floors in micro currency. For example, [100000, 200000]
	 */
	void setBidFloors(std::list<int> bid_floors);
	/*! \brief Get Always the string 'bidfloor'.
	 */
	std::string getType();

	/*! \brief Set Always the string 'bidfloor'.
	 */
	void setType(std::string type);


    private:
    std::list<int> bid_floors;
    std::string type{};
};
}

#endif /* TINY_CPP_CLIENT_BidFloor_H_ */
