
/*
 * AdvancedAuctionOperation.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdvancedAuctionOperation_H_
#define TINY_CPP_CLIENT_AdvancedAuctionOperation_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdvancedAuctionOperation{
public:

    /*! \brief Constructor.
	 */
    AdvancedAuctionOperation();
    AdvancedAuctionOperation(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdvancedAuctionOperation();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_AdvancedAuctionOperation_H_ */
