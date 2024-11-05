/*
 * AdvancedAuctionProcessedItem.h
 *
 * Object describing the result of an operation on an item bid option
 */

#ifndef _AdvancedAuctionProcessedItem_H_
#define _AdvancedAuctionProcessedItem_H_


#include <string>
#include "AdvancedAuctionBidOptions.h"
#include "AdvancedAuctionItemsSubmitRecord.h"
#include "AdvancedAuctionOperation.h"
#include "AdvancedAuctionOperationError.h"
#include "Country.h"
#include "Language.h"
#include "UpdateMaskBidOptionField.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Object describing the result of an operation on an item bid option
 *
 *  \ingroup Models
 *
 */

class AdvancedAuctionProcessedItem : public Object {
public:
	/*! \brief Constructor.
	 */
	AdvancedAuctionProcessedItem();
	AdvancedAuctionProcessedItem(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdvancedAuctionProcessedItem();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	AdvancedAuctionOperation getOperation();

	/*! \brief Set 
	 */
	void setOperation(AdvancedAuctionOperation  operation);
	/*! \brief Get The catalog retail item id in the merchant namespace
	 */
	std::string getItemId();

	/*! \brief Set The catalog retail item id in the merchant namespace
	 */
	void setItemId(std::string  item_id);
	/*! \brief Get 
	 */
	Country getCountry();

	/*! \brief Set 
	 */
	void setCountry(Country  country);
	/*! \brief Get 
	 */
	Language getLanguage();

	/*! \brief Set 
	 */
	void setLanguage(Language  language);
	/*! \brief Get 
	 */
	AdvancedAuctionBidOptions getBidOptions();

	/*! \brief Set 
	 */
	void setBidOptions(AdvancedAuctionBidOptions  bid_options);
	/*! \brief Get The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.
	 */
	std::list<UpdateMaskBidOptionField> getUpdateMask();

	/*! \brief Set The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.
	 */
	void setUpdateMask(std::list <UpdateMaskBidOptionField> update_mask);
	/*! \brief Get Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
	 */
	std::list<AdvancedAuctionOperationError> getErrors();

	/*! \brief Set Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
	 */
	void setErrors(std::list <AdvancedAuctionOperationError> errors);

private:
	AdvancedAuctionOperation operation;
	std::string item_id;
	Country country;
	Language language;
	AdvancedAuctionBidOptions bid_options;
	std::list <UpdateMaskBidOptionField>update_mask;
	std::list <AdvancedAuctionOperationError>errors;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdvancedAuctionProcessedItem_H_ */
