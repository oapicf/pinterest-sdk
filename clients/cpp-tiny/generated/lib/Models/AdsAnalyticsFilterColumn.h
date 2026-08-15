
/*
 * AdsAnalyticsFilterColumn.h
 *
 * Reporting columns for sync reporting data filter
 */

#ifndef TINY_CPP_CLIENT_AdsAnalyticsFilterColumn_H_
#define TINY_CPP_CLIENT_AdsAnalyticsFilterColumn_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Reporting columns for sync reporting data filter
 *
 *  \ingroup Models
 *
 */

class AdsAnalyticsFilterColumn{
public:

    /*! \brief Constructor.
	 */
    AdsAnalyticsFilterColumn();
    AdsAnalyticsFilterColumn(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdsAnalyticsFilterColumn();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_AdsAnalyticsFilterColumn_H_ */
