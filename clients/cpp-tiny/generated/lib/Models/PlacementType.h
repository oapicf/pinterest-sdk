
/*
 * PlacementType.h
 *
 * Placement type for bid multiplier targeting.
 */

#ifndef TINY_CPP_CLIENT_PlacementType_H_
#define TINY_CPP_CLIENT_PlacementType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Placement type for bid multiplier targeting.
 *
 *  \ingroup Models
 *
 */

class PlacementType{
public:

    /*! \brief Constructor.
	 */
    PlacementType();
    PlacementType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PlacementType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_PlacementType_H_ */
