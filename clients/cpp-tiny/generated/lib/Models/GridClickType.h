
/*
 * GridClickType.h
 *
 * Where a user is taken after clicking on an ad in grid.  **Note:**  This parameter is read-only and is set to &#x60;DIRECT_TO_DESTINATION&#x60; by default for direct links supported ads. &#x60;grid_click_type&#x60; values provided will be ignored.
 */

#ifndef TINY_CPP_CLIENT_GridClickType_H_
#define TINY_CPP_CLIENT_GridClickType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Where a user is taken after clicking on an ad in grid.  **Note:**  This parameter is read-only and is set to `DIRECT_TO_DESTINATION` by default for direct links supported ads. `grid_click_type` values provided will be ignored.
 *
 *  \ingroup Models
 *
 */

class GridClickType{
public:

    /*! \brief Constructor.
	 */
    GridClickType();
    GridClickType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GridClickType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_GridClickType_H_ */
