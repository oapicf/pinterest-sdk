
/*
 * AudienceUpdateRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AudienceUpdateRequest_H_
#define TINY_CPP_CLIENT_AudienceUpdateRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AudienceRule.h"
#include "AudienceUpdateOperationType.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AudienceUpdateRequest{
public:

    /*! \brief Constructor.
	 */
    AudienceUpdateRequest();
    AudienceUpdateRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AudienceUpdateRequest();


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
	/*! \brief Get Audience description.
	 */
	std::string getDescription();

	/*! \brief Set Audience description.
	 */
	void setDescription(std::string  description);
	/*! \brief Get 
	 */
	AudienceUpdateOperationType getOperationType();

	/*! \brief Set 
	 */
	void setOperationType(AudienceUpdateOperationType  operation_type);


    private:
    std::string ad_account_id{};
    std::string name{};
    AudienceRule rule;
    std::string description{};
    AudienceUpdateOperationType operation_type;
};
}

#endif /* TINY_CPP_CLIENT_AudienceUpdateRequest_H_ */
