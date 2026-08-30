
/*
 * AttributionActionType.h
 *
 * Type of an attributed action.
 */

#ifndef TINY_CPP_CLIENT_AttributionActionType_H_
#define TINY_CPP_CLIENT_AttributionActionType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Type of an attributed action.
 *
 *  \ingroup Models
 *
 */

class AttributionActionType{
public:

    /*! \brief Constructor.
	 */
    AttributionActionType();
    AttributionActionType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AttributionActionType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_AttributionActionType_H_ */
