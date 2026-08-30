
/*
 * HotelIdFilter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_HotelIdFilter_H_
#define TINY_CPP_CLIENT_HotelIdFilter_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsProductGroupMultipleStringCriteria.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class HotelIdFilter{
public:

    /*! \brief Constructor.
	 */
    HotelIdFilter();
    HotelIdFilter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~HotelIdFilter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsProductGroupMultipleStringCriteria getHOTELID();

	/*! \brief Set 
	 */
	void setHOTELID(CatalogsProductGroupMultipleStringCriteria hOTEL_ID);


    private:
    CatalogsProductGroupMultipleStringCriteria hOTEL_ID;
};
}

#endif /* TINY_CPP_CLIENT_HotelIdFilter_H_ */
