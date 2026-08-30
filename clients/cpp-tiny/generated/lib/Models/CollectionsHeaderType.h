
/*
 * CollectionsHeaderType.h
 *
 * Collections ad header type
 */

#ifndef TINY_CPP_CLIENT_CollectionsHeaderType_H_
#define TINY_CPP_CLIENT_CollectionsHeaderType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Collections ad header type
 *
 *  \ingroup Models
 *
 */

class CollectionsHeaderType{
public:

    /*! \brief Constructor.
	 */
    CollectionsHeaderType();
    CollectionsHeaderType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CollectionsHeaderType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CollectionsHeaderType_H_ */
