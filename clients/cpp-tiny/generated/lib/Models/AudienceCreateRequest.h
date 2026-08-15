
/*
 * AudienceCreateRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AudienceCreateRequest_H_
#define TINY_CPP_CLIENT_AudienceCreateRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AudienceRule.h"
#include "AudienceType.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AudienceCreateRequest{
public:

    /*! \brief Constructor.
	 */
    AudienceCreateRequest();
    AudienceCreateRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AudienceCreateRequest();


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
	/*! \brief Get <a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR. Values are case-sensitive.
	 */
	AudienceType getAudienceType();

	/*! \brief Set <a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR. Values are case-sensitive.
	 */
	void setAudienceType(AudienceType  audience_type);
	/*! \brief Get Audience description.
	 */
	std::string getDescription();

	/*! \brief Set Audience description.
	 */
	void setDescription(std::string  description);


    private:
    std::string ad_account_id{};
    std::string name{};
    AudienceRule rule;
    AudienceType audience_type;
    std::string description{};
};
}

#endif /* TINY_CPP_CLIENT_AudienceCreateRequest_H_ */
