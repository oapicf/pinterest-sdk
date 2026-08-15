
/*
 * CatalogsHotelItemErrorResponse.h
 *
 * Object describing a hotel item error
 */

#ifndef TINY_CPP_CLIENT_CatalogsHotelItemErrorResponse_H_
#define TINY_CPP_CLIENT_CatalogsHotelItemErrorResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsType.h"
#include "ItemValidationEvent.h"
#include <list>

namespace Tiny {


/*! \brief Object describing a hotel item error
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelItemErrorResponse{
public:

    /*! \brief Constructor.
	 */
    CatalogsHotelItemErrorResponse();
    CatalogsHotelItemErrorResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsHotelItemErrorResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsType getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(CatalogsType  catalog_type);
	/*! \brief Get Array with the errors for the item id requested
	 */
	std::list<ItemValidationEvent> getErrors();

	/*! \brief Set Array with the errors for the item id requested
	 */
	void setErrors(std::list <ItemValidationEvent> errors);
	/*! \brief Get The catalog hotel id in the merchant namespace
	 */
	std::string getHotelId();

	/*! \brief Set The catalog hotel id in the merchant namespace
	 */
	void setHotelId(std::string  hotel_id);


    private:
    CatalogsType catalog_type;
    std::list<ItemValidationEvent> errors;
    std::string hotel_id{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsHotelItemErrorResponse_H_ */
