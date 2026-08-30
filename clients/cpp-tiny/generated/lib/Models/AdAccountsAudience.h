
/*
 * AdAccountsAudience.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdAccountsAudience_H_
#define TINY_CPP_CLIENT_AdAccountsAudience_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AdAccountsAudienceRule.h"
#include "AudienceStatus.h"
#include "AudienceType.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdAccountsAudience{
public:

    /*! \brief Constructor.
	 */
    AdAccountsAudience();
    AdAccountsAudience(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdAccountsAudience();


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
	/*! \brief Get The company that created this audience.
	 */
	std::string getCreatedByCompanyName();

	/*! \brief Set The company that created this audience.
	 */
	void setCreatedByCompanyName(std::string created_by_company_name);
	/*! \brief Get Creation time. Unix timestamp in seconds.
	 */
	int getCreatedTimestamp();

	/*! \brief Set Creation time. Unix timestamp in seconds.
	 */
	void setCreatedTimestamp(int created_timestamp);
	/*! \brief Get Audience description.
	 */
	std::string getDescription();

	/*! \brief Set Audience description.
	 */
	void setDescription(std::string description);
	/*! \brief Get Audience ID.
	 */
	std::string getId();

	/*! \brief Set Audience ID.
	 */
	void setId(std::string id);
	/*! \brief Get Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only.
	 */
	bool isIsNca();

	/*! \brief Set Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only.
	 */
	void setIsNca(bool is_nca);
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
	/*! \brief Get Audience size.
	 */
	int getSize();

	/*! \brief Set Audience size.
	 */
	void setSize(int size);
	/*! \brief Get Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
	 */
	AudienceStatus getStatus();

	/*! \brief Set Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
	 */
	void setStatus(AudienceStatus status);
	/*! \brief Get Always \"audience\".
	 */
	std::string getType();

	/*! \brief Set Always \"audience\".
	 */
	void setType(std::string type);
	/*! \brief Get Last update time. Unix timestamp in seconds.
	 */
	int getUpdatedTimestamp();

	/*! \brief Set Last update time. Unix timestamp in seconds.
	 */
	void setUpdatedTimestamp(int updated_timestamp);


    private:
    std::string ad_account_id{};
    AudienceType audience_type;
    std::string created_by_company_name{};
    int created_timestamp{};
    std::string description{};
    std::string id{};
    bool is_nca{};
    std::string name{};
    AdAccountsAudienceRule rule;
    int size{};
    AudienceStatus status;
    std::string type{};
    int updated_timestamp{};
};
}

#endif /* TINY_CPP_CLIENT_AdAccountsAudience_H_ */
