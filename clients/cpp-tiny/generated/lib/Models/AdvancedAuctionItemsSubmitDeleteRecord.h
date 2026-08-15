
/*
 * AdvancedAuctionItemsSubmitDeleteRecord.h
 *
 * Object describing an item bid option deletion operation
 */

#ifndef TINY_CPP_CLIENT_AdvancedAuctionItemsSubmitDeleteRecord_H_
#define TINY_CPP_CLIENT_AdvancedAuctionItemsSubmitDeleteRecord_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AdvancedAuctionOperationError.h"
#include "Country.h"
#include "Language.h"
#include <list>

namespace Tiny {


/*! \brief Object describing an item bid option deletion operation
 *
 *  \ingroup Models
 *
 */

class AdvancedAuctionItemsSubmitDeleteRecord{
public:

    /*! \brief Constructor.
	 */
    AdvancedAuctionItemsSubmitDeleteRecord();
    AdvancedAuctionItemsSubmitDeleteRecord(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdvancedAuctionItemsSubmitDeleteRecord();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
	/*! \brief Get Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
	 */
	std::list<AdvancedAuctionOperationError> getErrors();

	/*! \brief Set Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
	 */
	void setErrors(std::list <AdvancedAuctionOperationError> errors);


    private:
    Country country;
    std::string item_id{};
    Language language;
    std::list<AdvancedAuctionOperationError> errors;
};
}

#endif /* TINY_CPP_CLIENT_AdvancedAuctionItemsSubmitDeleteRecord_H_ */
