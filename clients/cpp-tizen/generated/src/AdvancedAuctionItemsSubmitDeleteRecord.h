/*
 * AdvancedAuctionItemsSubmitDeleteRecord.h
 *
 * Object describing an item bid option deletion operation
 */

#ifndef _AdvancedAuctionItemsSubmitDeleteRecord_H_
#define _AdvancedAuctionItemsSubmitDeleteRecord_H_


#include <string>
#include "AdvancedAuctionOperationError.h"
#include "Country.h"
#include "Language.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Object describing an item bid option deletion operation
 *
 *  \ingroup Models
 *
 */

class AdvancedAuctionItemsSubmitDeleteRecord : public Object {
public:
	/*! \brief Constructor.
	 */
	AdvancedAuctionItemsSubmitDeleteRecord();
	AdvancedAuctionItemsSubmitDeleteRecord(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdvancedAuctionItemsSubmitDeleteRecord();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	Country getCountry();

	/*! \brief Set 
	 */
	void setCountry(Country  country);
	/*! \brief Get Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
	 */
	std::list<AdvancedAuctionOperationError> getErrors();

	/*! \brief Set Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
	 */
	void setErrors(std::list <AdvancedAuctionOperationError> errors);
	/*! \brief Get The catalog retail item id in the merchant namespace
	 */
	std::string getItemId();

	/*! \brief Set The catalog retail item id in the merchant namespace
	 */
	void setItemId(std::string  item_id);
	/*! \brief Get 
	 */
	Language getLanguage();

	/*! \brief Set 
	 */
	void setLanguage(Language  language);
	/*! \brief Get 
	 */
	std::string getOperation();

	/*! \brief Set 
	 */
	void setOperation(std::string  operation);

private:
	Country country;
	std::list <AdvancedAuctionOperationError>errors;
	std::string item_id;
	Language language;
	std::string operation;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdvancedAuctionItemsSubmitDeleteRecord_H_ */
