
/*
 * CreativeAssetsProcessingRecord.h
 *
 * Object describing an item processing record
 */

#ifndef TINY_CPP_CLIENT_CreativeAssetsProcessingRecord_H_
#define TINY_CPP_CLIENT_CreativeAssetsProcessingRecord_H_


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

class CreativeAssetsProcessingRecord{
public:

    /*! \brief Constructor.
	 */
    CreativeAssetsProcessingRecord();
    CreativeAssetsProcessingRecord(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreativeAssetsProcessingRecord();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The catalog creative assets id in the merchant namespace
	 */
	std::string getCreativeAssetsId();

	/*! \brief Set The catalog creative assets id in the merchant namespace
	 */
	void setCreativeAssetsId(std::string  creative_assets_id);
	/*! \brief Get Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
	 */
	std::list<ItemValidationEvent> getErrors();

	/*! \brief Set Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
	 */
	void setErrors(std::list <ItemValidationEvent> errors);
	/*! \brief Get 
	 */
	ItemProcessingStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(ItemProcessingStatus  status);
	/*! \brief Get Array with the validation warnings for the item processing record
	 */
	std::list<ItemValidationEvent> getWarnings();

	/*! \brief Set Array with the validation warnings for the item processing record
	 */
	void setWarnings(std::list <ItemValidationEvent> warnings);


    private:
    std::string creative_assets_id{};
    std::list<ItemValidationEvent> errors;
    ItemProcessingStatus status;
    std::list<ItemValidationEvent> warnings;
};
}

#endif /* TINY_CPP_CLIENT_CreativeAssetsProcessingRecord_H_ */
