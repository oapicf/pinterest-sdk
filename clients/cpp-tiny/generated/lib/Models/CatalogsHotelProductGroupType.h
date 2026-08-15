
/*
 * CatalogsHotelProductGroupType.h
 *
 * &lt;p&gt;Catalog hotel product group type&lt;/p&gt; &lt;p&gt;MERCHANT_CREATED: Product groups created by merchants. &lt;br&gt;ALL_LISTINGS: Includes every hotel item in your catalog.
 */

#ifndef TINY_CPP_CLIENT_CatalogsHotelProductGroupType_H_
#define TINY_CPP_CLIENT_CatalogsHotelProductGroupType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief <p>Catalog hotel product group type</p> <p>MERCHANT_CREATED: Product groups created by merchants. <br>ALL_LISTINGS: Includes every hotel item in your catalog.
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
