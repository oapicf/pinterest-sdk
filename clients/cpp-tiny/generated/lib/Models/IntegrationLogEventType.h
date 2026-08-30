
/*
 * IntegrationLogEventType.h
 *
 * Log event type for integration applications.
 */

#ifndef TINY_CPP_CLIENT_IntegrationLogEventType_H_
#define TINY_CPP_CLIENT_IntegrationLogEventType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Log event type for integration applications.
 *
 *  \ingroup Models
 *
 */

class IntegrationLogEventType{
public:

    /*! \brief Constructor.
	 */
    IntegrationLogEventType();
    IntegrationLogEventType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~IntegrationLogEventType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_IntegrationLogEventType_H_ */
