
/*
 * PlacementTrafficType.h
 *
 * A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both.
 */

#ifndef TINY_CPP_CLIENT_PlacementTrafficType_H_
#define TINY_CPP_CLIENT_PlacementTrafficType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both.
 *
 *  \ingroup Models
 *
 */

class PlacementTrafficType{
public:

    /*! \brief Constructor.
	 */
    PlacementTrafficType();
    PlacementTrafficType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PlacementTrafficType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_PlacementTrafficType_H_ */
