
/*
 * AdsAnalyticsFilterOperator.h
 *
 * Filter operator for sync reporting
 */

#ifndef TINY_CPP_CLIENT_AdsAnalyticsFilterOperator_H_
#define TINY_CPP_CLIENT_AdsAnalyticsFilterOperator_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Filter operator for sync reporting
 *
 *  \ingroup Models
 *
 */

class AdsAnalyticsFilterOperator{
public:

    /*! \brief Constructor.
	 */
    AdsAnalyticsFilterOperator();
    AdsAnalyticsFilterOperator(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdsAnalyticsFilterOperator();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_AdsAnalyticsFilterOperator_H_ */
