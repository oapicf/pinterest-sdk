
/*
 * MultiPinsAnalyticsMetricTypesItem.h
 *
 * Pin metric type for multi-pin analytics
 */

#ifndef TINY_CPP_CLIENT_MultiPinsAnalyticsMetricTypesItem_H_
#define TINY_CPP_CLIENT_MultiPinsAnalyticsMetricTypesItem_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Pin metric type for multi-pin analytics
 *
 *  \ingroup Models
 *
 */

class MultiPinsAnalyticsMetricTypesItem{
public:

    /*! \brief Constructor.
	 */
    MultiPinsAnalyticsMetricTypesItem();
    MultiPinsAnalyticsMetricTypesItem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MultiPinsAnalyticsMetricTypesItem();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_MultiPinsAnalyticsMetricTypesItem_H_ */
