
/*
 * CatalogsHotelBatchItem.h
 *
 * Hotel batch item
 */

#ifndef TINY_CPP_CLIENT_CatalogsHotelBatchItem_H_
#define TINY_CPP_CLIENT_CatalogsHotelBatchItem_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CatalogsCreateHotelItem.h"
#include "CatalogsDeleteHotelItem.h"
#include "CatalogsUpdatableHotelAttributes.h"
#include "CatalogsUpdateHotelItem.h"
#include "CatalogsUpsertHotelItem.h"

namespace Tiny {


/*! \brief Hotel batch item
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelBatchItem{
public:

    /*! \brief Constructor.
	 */
    CatalogsHotelBatchItem();
    CatalogsHotelBatchItem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsHotelBatchItem();


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
	/*! \brief Get The catalog hotel id in the merchant namespace
	 */
	std::string getHotelId();

	/*! \brief Set The catalog hotel id in the merchant namespace
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

#endif /* TINY_CPP_CLIENT_CatalogsHotelBatchItem_H_ */
