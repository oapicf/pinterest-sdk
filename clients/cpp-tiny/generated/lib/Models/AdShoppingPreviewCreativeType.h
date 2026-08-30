
/*
 * AdShoppingPreviewCreativeType.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdShoppingPreviewCreativeType_H_
#define TINY_CPP_CLIENT_AdShoppingPreviewCreativeType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdShoppingPreviewCreativeType{
public:

    /*! \brief Constructor.
	 */
    AdShoppingPreviewCreativeType();
    AdShoppingPreviewCreativeType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdShoppingPreviewCreativeType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_AdShoppingPreviewCreativeType_H_ */
