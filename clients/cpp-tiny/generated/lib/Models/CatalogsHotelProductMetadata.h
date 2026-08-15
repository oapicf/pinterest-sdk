
/*
 * CatalogsHotelProductMetadata.h
 *
 * Hotel product metadata entity
 */

#ifndef TINY_CPP_CLIENT_CatalogsHotelProductMetadata_H_
#define TINY_CPP_CLIENT_CatalogsHotelProductMetadata_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Hotel product metadata entity
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelProductMetadata{
public:

    /*! \brief Constructor.
	 */
    CatalogsHotelProductMetadata();
    CatalogsHotelProductMetadata(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsHotelProductMetadata();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The user-created unique ID that represents the hotel item.
	 */
	std::string getHotelId();

	/*! \brief Set The user-created unique ID that represents the hotel item.
	 */
	void setHotelId(std::string  hotel_id);


    private:
    std::string hotel_id{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsHotelProductMetadata_H_ */
