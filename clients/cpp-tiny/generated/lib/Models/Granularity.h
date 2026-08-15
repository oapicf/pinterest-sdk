
/*
 * Granularity.h
 *
 * Specifies the time interval at which analytics data is broken down. Determines how metrics are grouped within the requested date range. **Note:** The &#x60;HOUR&#x60; enum no longer provides data for conversion metrics, but it still returns data for non-conversion metrics. All other enums are unchanged.
 */

#ifndef TINY_CPP_CLIENT_Granularity_H_
#define TINY_CPP_CLIENT_Granularity_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Specifies the time interval at which analytics data is broken down. Determines how metrics are grouped within the requested date range. **Note:** The `HOUR` enum no longer provides data for conversion metrics, but it still returns data for non-conversion metrics. All other enums are unchanged.
 *
 *  \ingroup Models
 *
 */

class Granularity{
public:

    /*! \brief Constructor.
	 */
    Granularity();
    Granularity(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Granularity();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_Granularity_H_ */
