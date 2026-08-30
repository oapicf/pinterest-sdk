
/*
 * CatalogsUpdateHotelItem.h
 *
 * Object describing an hotel item batch record
 */

#ifndef TINY_CPP_CLIENT_CatalogsUpdateHotelItem_H_
#define TINY_CPP_CLIENT_CatalogsUpdateHotelItem_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsUpdatableHotelAttributes.h"

namespace Tiny {


/*! \brief Object describing an hotel item batch record
 *
 *  \ingroup Models
 *
 */

class CatalogsUpdateHotelItem{
public:

    /*! \brief Constructor.
	 */
    CatalogsUpdateHotelItem();
    CatalogsUpdateHotelItem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsUpdateHotelItem();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CatalogsUpdatableHotelAttributes getAttributes();

	/*! \brief Set 
	 */
	void setAttributes(CatalogsUpdatableHotelAttributes attributes);
	/*! \brief Get The catalog hotel item id in the merchant namespace
	 */
	std::string getHotelId();

	/*! \brief Set The catalog hotel item id in the merchant namespace
	 */
	void setHotelId(std::string hotel_id);
	/*! \brief Get 
	 */
	std::string getOperation();

	/*! \brief Set 
	 */
	void setOperation(std::string operation);


    private:
    CatalogsUpdatableHotelAttributes attributes;
    std::string hotel_id{};
    std::string operation{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsUpdateHotelItem_H_ */
