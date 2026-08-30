
/*
 * ItemProcessingRecord.h
 *
 * Object describing an item processing record
 */

#ifndef TINY_CPP_CLIENT_ItemProcessingRecord_H_
#define TINY_CPP_CLIENT_ItemProcessingRecord_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ItemProcessingStatus.h"
#include "ItemValidationEvent.h"
#include <list>

namespace Tiny {


/*! \brief Object describing an item processing record
 *
 *  \ingroup Models
 *
 */

class ItemProcessingRecord{
public:

    /*! \brief Constructor.
	 */
    ItemProcessingRecord();
    ItemProcessingRecord(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ItemProcessingRecord();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
	 */
	std::list<ItemValidationEvent> getErrors();

	/*! \brief Set Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
	 */
	void setErrors(std::list<ItemValidationEvent> errors);
	/*! \brief Get The catalog item id in the merchant namespace
	 */
	std::string getItemId();

	/*! \brief Set The catalog item id in the merchant namespace
	 */
	void setItemId(std::string item_id);
	/*! \brief Get 
	 */
	ItemProcessingStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(ItemProcessingStatus status);
	/*! \brief Get Array with the validation warnings for the item processing record
	 */
	std::list<ItemValidationEvent> getWarnings();

	/*! \brief Set Array with the validation warnings for the item processing record
	 */
	void setWarnings(std::list<ItemValidationEvent> warnings);


    private:
    std::list<ItemValidationEvent> errors;
    std::string item_id{};
    ItemProcessingStatus status;
    std::list<ItemValidationEvent> warnings;
};
}

#endif /* TINY_CPP_CLIENT_ItemProcessingRecord_H_ */
