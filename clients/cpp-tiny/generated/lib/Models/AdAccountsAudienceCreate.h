
/*
 * AdAccountsAudienceCreate.h
 *
 * Resource create operation model.
 */

#ifndef TINY_CPP_CLIENT_AdAccountsAudienceCreate_H_
#define TINY_CPP_CLIENT_AdAccountsAudienceCreate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AdAccountsAudienceRule.h"
#include "AudienceType.h"

namespace Tiny {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class AdAccountsAudienceCreate{
public:

    /*! \brief Constructor.
	 */
    AdAccountsAudienceCreate();
    AdAccountsAudienceCreate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdAccountsAudienceCreate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Ad account ID.
	 */
	std::string getAdAccountId();

	/*! \brief Set Ad account ID.
	 */
	void setAdAccountId(std::string ad_account_id);
	/*! \brief Get [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
	 */
	AudienceType getAudienceType();

	/*! \brief Set [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
	 */
	void setAudienceType(AudienceType audience_type);
	/*! \brief Get Audience description.
	 */
	std::string getDescription();

	/*! \brief Set Audience description.
	 */
	void setDescription(std::string description);
	/*! \brief Get Audience name.
	 */
	std::string getName();

	/*! \brief Set Audience name.
	 */
	void setName(std::string name);
	/*! \brief Get 
	 */
	AdAccountsAudienceRule getRule();

	/*! \brief Set 
	 */
	void setRule(AdAccountsAudienceRule rule);


    private:
    std::string ad_account_id{};
    AudienceType audience_type;
    std::string description{};
    std::string name{};
    AdAccountsAudienceRule rule;
};
}

#endif /* TINY_CPP_CLIENT_AdAccountsAudienceCreate_H_ */
