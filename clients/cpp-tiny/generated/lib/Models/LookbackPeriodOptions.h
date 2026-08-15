
/*
 * LookbackPeriodOptions.h
 *
 * Days in lookback window in the GET Conversion EQS response.
 */

#ifndef TINY_CPP_CLIENT_LookbackPeriodOptions_H_
#define TINY_CPP_CLIENT_LookbackPeriodOptions_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Days in lookback window in the GET Conversion EQS response.
 *
 *  \ingroup Models
 *
 */

class LookbackPeriodOptions{
public:

    /*! \brief Constructor.
	 */
    LookbackPeriodOptions();
    LookbackPeriodOptions(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LookbackPeriodOptions();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_LookbackPeriodOptions_H_ */
