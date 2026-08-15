
/*
 * AdvancedAuctionItemsSubmitRecord.h
 *
 * Object describing an item bid option operation
 */

#ifndef TINY_CPP_CLIENT_AdvancedAuctionItemsSubmitRecord_H_
#define TINY_CPP_CLIENT_AdvancedAuctionItemsSubmitRecord_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AdvancedAuctionBidOptions.h"
#include "AdvancedAuctionItemsSubmitDeleteRecord.h"
#include "AdvancedAuctionItemsSubmitUpsertRecord.h"
#include "AdvancedAuctionOperation.h"
#include "AdvancedAuctionOperationError.h"
#include "Country.h"
#include "Language.h"
#include "UpdateMaskBidOptionField.h"
#include <list>

namespace Tiny {


/*! \brief Object describing an item bid option operation
 *
 *  \ingroup Models
 *
 */

class AdvancedAuctionItemsSubmitRecord{
public:

    /*! \brief Constructor.
	 */
    AdvancedAuctionItemsSubmitRecord();
    AdvancedAuctionItemsSubmitRecord(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdvancedAuctionItemsSubmitRecord();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	AdvancedAuctionOperation getOperation();

	/*! \brief Set 
	 */
	void setOperation(AdvancedAuctionOperation  operation);
	/*! \brief Get 
	 */
	Country getCountry();

	/*! \brief Set 
	 */
	void setCountry(Country  country);
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
	AdvancedAuctionBidOptions getBidOptions();

	/*! \brief Set 
	 */
	void setBidOptions(AdvancedAuctionBidOptions  bid_options);
	/*! \brief Get Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
	 */
	std::list<AdvancedAuctionOperationError> getErrors();

	/*! \brief Set Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
	 */
	void setErrors(std::list <AdvancedAuctionOperationError> errors);
	/*! \brief Get The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.
	 */
	std::list<UpdateMaskBidOptionField> getUpdateMask();

	/*! \brief Set The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.
	 */
	void setUpdateMask(std::list <UpdateMaskBidOptionField> update_mask);


    private:
    AdvancedAuctionOperation operation;
    Country country;
    std::string item_id{};
    Language language;
    AdvancedAuctionBidOptions bid_options;
    std::list<AdvancedAuctionOperationError> errors;
    std::list<UpdateMaskBidOptionField> update_mask;
};
}

#endif /* TINY_CPP_CLIENT_AdvancedAuctionItemsSubmitRecord_H_ */
