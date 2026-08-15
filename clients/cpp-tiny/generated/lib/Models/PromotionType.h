
/*
 * PromotionType.h
 *
 * Determines the displayed promotion text along with what parameters (if any) are needed to complete the template. This list is not finalized, and will be updated as new types are supported.
 */

#ifndef TINY_CPP_CLIENT_PromotionType_H_
#define TINY_CPP_CLIENT_PromotionType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Determines the displayed promotion text along with what parameters (if any) are needed to complete the template. This list is not finalized, and will be updated as new types are supported.
 *
 *  \ingroup Models
 *
 */

class PromotionType{
public:

    /*! \brief Constructor.
	 */
    PromotionType();
    PromotionType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PromotionType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_PromotionType_H_ */
