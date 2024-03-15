/*
 * HotelProcessingRecord.h
 *
 * Object describing an item processing record
 */

#ifndef _HotelProcessingRecord_H_
#define _HotelProcessingRecord_H_


#include <string>
#include "ItemProcessingStatus.h"
#include "ItemValidationEvent.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Object describing an item processing record
 *
 *  \ingroup Models
 *
 */

class HotelProcessingRecord : public Object {
public:
	/*! \brief Constructor.
	 */
	HotelProcessingRecord();
	HotelProcessingRecord(char* str);

	/*! \brief Destructor.
	 */
	virtual ~HotelProcessingRecord();

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
	/*! \brief Get Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
	 */
	std::list<ItemValidationEvent> getErrors();

	/*! \brief Set Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
	 */
	void setErrors(std::list <ItemValidationEvent> errors);
	/*! \brief Get Array with the validation warnings for the item processing record
	 */
	std::list<ItemValidationEvent> getWarnings();

	/*! \brief Set Array with the validation warnings for the item processing record
	 */
	void setWarnings(std::list <ItemValidationEvent> warnings);
	/*! \brief Get 
	 */
	ItemProcessingStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(ItemProcessingStatus  status);

private:
	std::string hotel_id;
	std::list <ItemValidationEvent>errors;
	std::list <ItemValidationEvent>warnings;
	ItemProcessingStatus status;
	void __init();
	void __cleanup();

};
}
}

#endif /* _HotelProcessingRecord_H_ */
