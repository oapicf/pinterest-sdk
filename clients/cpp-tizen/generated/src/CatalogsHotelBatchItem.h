/*
 * CatalogsHotelBatchItem.h
 *
 * Hotel batch item
 */

#ifndef _CatalogsHotelBatchItem_H_
#define _CatalogsHotelBatchItem_H_


#include <string>
#include "CatalogsCreateHotelItem.h"
#include "CatalogsDeleteHotelItem.h"
#include "CatalogsUpdatableHotelAttributes.h"
#include "CatalogsUpdateHotelItem.h"
#include "CatalogsUpsertHotelItem.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Hotel batch item
 *
 *  \ingroup Models
 *
 */

class CatalogsHotelBatchItem : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsHotelBatchItem();
	CatalogsHotelBatchItem(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsHotelBatchItem();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The catalog hotel id in the merchant namespace
	 */
	std::string getHotelId();

	/*! \brief Set The catalog hotel id in the merchant namespace
	 */
	void setHotelId(std::string  hotel_id);
	/*! \brief Get 
	 */
	std::string getOperation();

	/*! \brief Set 
	 */
	void setOperation(std::string  operation);
	/*! \brief Get 
	 */
	CatalogsUpdatableHotelAttributes getAttributes();

	/*! \brief Set 
	 */
	void setAttributes(CatalogsUpdatableHotelAttributes  attributes);

private:
	std::string hotel_id;
	std::string operation;
	CatalogsUpdatableHotelAttributes attributes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsHotelBatchItem_H_ */
