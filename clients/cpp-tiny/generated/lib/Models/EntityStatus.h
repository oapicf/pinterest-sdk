
/*
 * EntityStatus.h
 *
 * Entity status
 */

#ifndef TINY_CPP_CLIENT_EntityStatus_H_
#define TINY_CPP_CLIENT_EntityStatus_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Entity status
 *
 *  \ingroup Models
 *
 */

class EntityStatus{
public:

    /*! \brief Constructor.
	 */
    EntityStatus();
    EntityStatus(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~EntityStatus();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_EntityStatus_H_ */
