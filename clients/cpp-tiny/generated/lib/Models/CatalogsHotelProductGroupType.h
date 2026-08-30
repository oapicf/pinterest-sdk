
/*
 * CatalogsHotelProductGroupType.h
 *
 * Catalog hotel product group type
 */

#ifndef TINY_CPP_CLIENT_CatalogsHotelProductGroupType_H_
#define TINY_CPP_CLIENT_CatalogsHotelProductGroupType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Catalog hotel product group type
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelProductGroupType{
public:

    /*! \brief Constructor.
	 */
    CatalogsHotelProductGroupType();
    CatalogsHotelProductGroupType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsHotelProductGroupType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CatalogsHotelProductGroupType_H_ */
