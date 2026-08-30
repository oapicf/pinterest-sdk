
/*
 * AdCollectionsHeaderType.h
 *
 * Collections ad header type for ads
 */

#ifndef TINY_CPP_CLIENT_AdCollectionsHeaderType_H_
#define TINY_CPP_CLIENT_AdCollectionsHeaderType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Collections ad header type for ads
 *
 *  \ingroup Models
 *
 */

class AdCollectionsHeaderType{
public:

    /*! \brief Constructor.
	 */
    AdCollectionsHeaderType();
    AdCollectionsHeaderType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdCollectionsHeaderType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_AdCollectionsHeaderType_H_ */
