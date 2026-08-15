
/*
 * PinPromotionSummaryStatus.h
 *
 * Summary status for pin promotions
 */

#ifndef TINY_CPP_CLIENT_PinPromotionSummaryStatus_H_
#define TINY_CPP_CLIENT_PinPromotionSummaryStatus_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Summary status for pin promotions
 *
 *  \ingroup Models
 *
 */

class PinPromotionSummaryStatus{
public:

    /*! \brief Constructor.
	 */
    PinPromotionSummaryStatus();
    PinPromotionSummaryStatus(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PinPromotionSummaryStatus();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_PinPromotionSummaryStatus_H_ */
