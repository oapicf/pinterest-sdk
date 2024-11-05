/*
 * AdvancedAuctionItemsSubmitUpsertRecord.h
 *
 * Object describing an item bid option upsert operation
 */

#ifndef _AdvancedAuctionItemsSubmitUpsertRecord_H_
#define _AdvancedAuctionItemsSubmitUpsertRecord_H_


#include <string>
#include "AdvancedAuctionBidOptions.h"
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


/*! \brief Object describing an item bid option upsert operation
 *
 *  \ingroup Models
 *
 */

class AdvancedAuctionItemsSubmitUpsertRecord : public Object {
public:
	/*! \brief Constructor.
	 */
	AdvancedAuctionItemsSubmitUpsertRecord();
	AdvancedAuctionItemsSubmitUpsertRecord(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdvancedAuctionItemsSubmitUpsertRecord();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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

private:
	std::string item_id;
	Country country;
	Language language;
	AdvancedAuctionBidOptions bid_options;
	std::list <UpdateMaskBidOptionField>update_mask;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdvancedAuctionItemsSubmitUpsertRecord_H_ */
