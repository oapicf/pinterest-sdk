
/*
 * StandardPinMetricTypes.h
 *
 * Standard Pin metric types
 */

#ifndef TINY_CPP_CLIENT_StandardPinMetricTypes_H_
#define TINY_CPP_CLIENT_StandardPinMetricTypes_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Standard Pin metric types
 *
 *  \ingroup Models
 *
 */

class StandardPinMetricTypes{
public:

    /*! \brief Constructor.
	 */
    StandardPinMetricTypes();
    StandardPinMetricTypes(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~StandardPinMetricTypes();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_StandardPinMetricTypes_H_ */
