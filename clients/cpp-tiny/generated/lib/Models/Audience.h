
/*
 * Audience.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Audience_H_
#define TINY_CPP_CLIENT_Audience_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AudienceRule.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Audience{
public:

    /*! \brief Constructor.
	 */
    Audience();
    Audience(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Audience();


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
	void setAdAccountId(std::string  ad_account_id);
	/*! \brief Get <a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
	 */
	std::string getAudienceType();

	/*! \brief Set <a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
	 */
	void setAudienceType(std::string  audience_type);
	/*! \brief Get The company that created this audience.
	 */
	std::string getCreatedByCompanyName();

	/*! \brief Set The company that created this audience.
	 */
	void setCreatedByCompanyName(std::string  created_by_company_name);
	/*! \brief Get Creation time. Unix timestamp in seconds.
	 */
	int getCreatedTimestamp();

	/*! \brief Set Creation time. Unix timestamp in seconds.
	 */
	void setCreatedTimestamp(int  created_timestamp);
	/*! \brief Get Audience description.
	 */
	std::string getDescription();

	/*! \brief Set Audience description.
	 */
	void setDescription(std::string  description);
	/*! \brief Get Audience ID.
	 */
	std::string getId();

	/*! \brief Set Audience ID.
	 */
	void setId(std::string  id);
	/*! \brief Get Audience name.
	 */
	std::string getName();

	/*! \brief Set Audience name.
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	AudienceRule getRule();

	/*! \brief Set 
	 */
	void setRule(AudienceRule  rule);
	/*! \brief Get Audience size.
	 */
	int getSize();

	/*! \brief Set Audience size.
	 */
	void setSize(int  size);
	/*! \brief Get Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
	 */
	std::string getStatus();

	/*! \brief Set Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
	 */
	void setStatus(std::string  status);
	/*! \brief Get Always \"audience\".
	 */
	std::string getType();

	/*! \brief Set Always \"audience\".
	 */
	void setType(std::string  type);
	/*! \brief Get Last update time. Unix timestamp in seconds.
	 */
	int getUpdatedTimestamp();

	/*! \brief Set Last update time. Unix timestamp in seconds.
	 */
	void setUpdatedTimestamp(int  updated_timestamp);


    private:
    std::string ad_account_id{};
    std::string audience_type{};
    std::string created_by_company_name{};
    int created_timestamp{};
    std::string description{};
    std::string id{};
    std::string name{};
    AudienceRule rule;
    int size{};
    std::string status{};
    std::string type{};
    int updated_timestamp{};
};
}

#endif /* TINY_CPP_CLIENT_Audience_H_ */
