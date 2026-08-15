
/*
 * BulkEntityType.h
 *
 * Refers ads entity type. Schedule enum is only applicable to beta users
 */

#ifndef TINY_CPP_CLIENT_BulkEntityType_H_
#define TINY_CPP_CLIENT_BulkEntityType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Refers ads entity type. Schedule enum is only applicable to beta users
 *
 *  \ingroup Models
 *
 */

class BulkEntityType{
public:

    /*! \brief Constructor.
	 */
    BulkEntityType();
    BulkEntityType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BulkEntityType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_BulkEntityType_H_ */
