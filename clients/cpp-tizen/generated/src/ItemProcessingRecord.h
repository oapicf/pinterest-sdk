/*
 * ItemProcessingRecord.h
 *
 * Object describing an item processing record
 */

#ifndef _ItemProcessingRecord_H_
#define _ItemProcessingRecord_H_


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

class ItemProcessingRecord : public Object {
public:
	/*! \brief Constructor.
	 */
	ItemProcessingRecord();
	ItemProcessingRecord(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ItemProcessingRecord();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The catalog item id in the merchant namespace
	 */
	std::string getItemId();

	/*! \brief Set The catalog item id in the merchant namespace
	 */
	void setItemId(std::string  item_id);
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
	std::string item_id;
	std::list <ItemValidationEvent>errors;
	std::list <ItemValidationEvent>warnings;
	ItemProcessingStatus status;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ItemProcessingRecord_H_ */
