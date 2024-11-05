/*
 * CreativeAssetsProcessingRecord.h
 *
 * Object describing an item processing record
 */

#ifndef _CreativeAssetsProcessingRecord_H_
#define _CreativeAssetsProcessingRecord_H_


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

class CreativeAssetsProcessingRecord : public Object {
public:
	/*! \brief Constructor.
	 */
	CreativeAssetsProcessingRecord();
	CreativeAssetsProcessingRecord(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreativeAssetsProcessingRecord();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string creative_assets_id;
	std::list <ItemValidationEvent>errors;
	std::list <ItemValidationEvent>warnings;
	ItemProcessingStatus status;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreativeAssetsProcessingRecord_H_ */
