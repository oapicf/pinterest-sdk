
/*
 * VideoPinMetricTypes.h
 *
 * Video Pin metric types
 */

#ifndef TINY_CPP_CLIENT_VideoPinMetricTypes_H_
#define TINY_CPP_CLIENT_VideoPinMetricTypes_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Video Pin metric types
 *
 *  \ingroup Models
 *
 */

class VideoPinMetricTypes{
public:

    /*! \brief Constructor.
	 */
    VideoPinMetricTypes();
    VideoPinMetricTypes(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~VideoPinMetricTypes();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_VideoPinMetricTypes_H_ */
