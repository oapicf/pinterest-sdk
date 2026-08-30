
/*
 * BidStrategyType.h
 *
 * Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \&quot;Pinterest Performance+ bidding\&quot;.
 */

#ifndef TINY_CPP_CLIENT_BidStrategyType_H_
#define TINY_CPP_CLIENT_BidStrategyType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \"Pinterest Performance+ bidding\".
 *
 *  \ingroup Models
 *
 */

class BidStrategyType{
public:

    /*! \brief Constructor.
	 */
    BidStrategyType();
    BidStrategyType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BidStrategyType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_BidStrategyType_H_ */
