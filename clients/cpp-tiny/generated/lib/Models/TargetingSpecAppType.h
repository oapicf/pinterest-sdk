
/*
 * TargetingSpecAppType.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_TargetingSpecAppType_H_
#define TINY_CPP_CLIENT_TargetingSpecAppType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class TargetingSpecAppType{
public:

    /*! \brief Constructor.
	 */
    TargetingSpecAppType();
    TargetingSpecAppType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TargetingSpecAppType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_TargetingSpecAppType_H_ */
