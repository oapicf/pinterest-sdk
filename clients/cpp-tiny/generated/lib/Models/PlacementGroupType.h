
/*
 * PlacementGroupType.h
 *
 * Campaign placement group type
 */

#ifndef TINY_CPP_CLIENT_PlacementGroupType_H_
#define TINY_CPP_CLIENT_PlacementGroupType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Campaign placement group type
 *
 *  \ingroup Models
 *
 */

class PlacementGroupType{
public:

    /*! \brief Constructor.
	 */
    PlacementGroupType();
    PlacementGroupType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PlacementGroupType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_PlacementGroupType_H_ */
