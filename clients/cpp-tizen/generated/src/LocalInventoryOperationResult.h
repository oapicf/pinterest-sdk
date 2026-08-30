/*
 * LocalInventoryOperationResult.h
 *
 * Result model for local inventory operation
 */

#ifndef _LocalInventoryOperationResult_H_
#define _LocalInventoryOperationResult_H_


#include <string>
#include "SupplementalItemProcessingStatus.h"
#include "SupplementalItemValidationEvent.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Result model for local inventory operation
 *
 *  \ingroup Models
 *
 */

class LocalInventoryOperationResult : public Object {
public:
	/*! \brief Constructor.
	 */
	LocalInventoryOperationResult();
	LocalInventoryOperationResult(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LocalInventoryOperationResult();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
	 */
	std::list<SupplementalItemValidationEvent> getErrors();

	/*! \brief Set Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
	 */
	void setErrors(std::list <SupplementalItemValidationEvent> errors);
	/*! \brief Get Catalog item id in the merchant namespace
	 */
	std::string getItemId();

	/*! \brief Set Catalog item id in the merchant namespace
	 */
	void setItemId(std::string  item_id);
	/*! \brief Get Status of the item processing record
	 */
	SupplementalItemProcessingStatus getStatus();

	/*! \brief Set Status of the item processing record
	 */
	void setStatus(SupplementalItemProcessingStatus  status);
	/*! \brief Get Store code for the local inventory item
	 */
	std::string getStoreCode();

	/*! \brief Set Store code for the local inventory item
	 */
	void setStoreCode(std::string  store_code);
	/*! \brief Get 
	 */
	std::string getSupplementalType();

	/*! \brief Set 
	 */
	void setSupplementalType(std::string  supplemental_type);
	/*! \brief Get Array with the validation warnings for the item processing record
	 */
	std::list<SupplementalItemValidationEvent> getWarnings();

	/*! \brief Set Array with the validation warnings for the item processing record
	 */
	void setWarnings(std::list <SupplementalItemValidationEvent> warnings);

private:
	std::list <SupplementalItemValidationEvent>errors;
	std::string item_id;
	SupplementalItemProcessingStatus status;
	std::string store_code;
	std::string supplemental_type;
	std::list <SupplementalItemValidationEvent>warnings;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LocalInventoryOperationResult_H_ */
