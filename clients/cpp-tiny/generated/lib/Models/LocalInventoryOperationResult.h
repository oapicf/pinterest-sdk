
/*
 * LocalInventoryOperationResult.h
 *
 * Result model for local inventory operation
 */

#ifndef TINY_CPP_CLIENT_LocalInventoryOperationResult_H_
#define TINY_CPP_CLIENT_LocalInventoryOperationResult_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "SupplementalItemProcessingStatus.h"
#include "SupplementalItemValidationEvent.h"
#include <list>

namespace Tiny {


/*! \brief Result model for local inventory operation
 *
 *  \ingroup Models
 *
 */

class LocalInventoryOperationResult{
public:

    /*! \brief Constructor.
	 */
    LocalInventoryOperationResult();
    LocalInventoryOperationResult(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LocalInventoryOperationResult();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
	 */
	std::list<SupplementalItemValidationEvent> getErrors();

	/*! \brief Set Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
	 */
	void setErrors(std::list<SupplementalItemValidationEvent> errors);
	/*! \brief Get Catalog item id in the merchant namespace
	 */
	std::string getItemId();

	/*! \brief Set Catalog item id in the merchant namespace
	 */
	void setItemId(std::string item_id);
	/*! \brief Get Status of the item processing record
	 */
	SupplementalItemProcessingStatus getStatus();

	/*! \brief Set Status of the item processing record
	 */
	void setStatus(SupplementalItemProcessingStatus status);
	/*! \brief Get Store code for the local inventory item
	 */
	std::string getStoreCode();

	/*! \brief Set Store code for the local inventory item
	 */
	void setStoreCode(std::string store_code);
	/*! \brief Get 
	 */
	std::string getSupplementalType();

	/*! \brief Set 
	 */
	void setSupplementalType(std::string supplemental_type);
	/*! \brief Get Array with the validation warnings for the item processing record
	 */
	std::list<SupplementalItemValidationEvent> getWarnings();

	/*! \brief Set Array with the validation warnings for the item processing record
	 */
	void setWarnings(std::list<SupplementalItemValidationEvent> warnings);


    private:
    std::list<SupplementalItemValidationEvent> errors;
    std::string item_id{};
    SupplementalItemProcessingStatus status;
    std::string store_code{};
    std::string supplemental_type{};
    std::list<SupplementalItemValidationEvent> warnings;
};
}

#endif /* TINY_CPP_CLIENT_LocalInventoryOperationResult_H_ */
