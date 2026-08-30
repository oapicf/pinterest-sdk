
/*
 * MsotEventName.h
 *
 * Type of user conversion event.
 */

#ifndef TINY_CPP_CLIENT_MsotEventName_H_
#define TINY_CPP_CLIENT_MsotEventName_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Type of user conversion event.
 *
 *  \ingroup Models
 *
 */

class MsotEventName{
public:

    /*! \brief Constructor.
	 */
    MsotEventName();
    MsotEventName(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MsotEventName();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_MsotEventName_H_ */
