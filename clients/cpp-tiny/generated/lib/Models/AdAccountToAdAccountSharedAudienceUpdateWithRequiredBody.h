
/*
 * AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody.h
 *
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */

#ifndef TINY_CPP_CLIENT_AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody_H_
#define TINY_CPP_CLIENT_AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OperationType.h"
#include <list>

namespace Tiny {


/*! \brief Resource create or update operation model with required body fields (no OptionalProperties).
 *
 *  \ingroup Models
 *
 */

class AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody{
public:

    /*! \brief Constructor.
	 */
    AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody();
    AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Unique identifier of an audience
	 */
	std::string getAudienceId();

	/*! \brief Set Unique identifier of an audience
	 */
	void setAudienceId(std::string audience_id);
	/*! \brief Get 
	 */
	OperationType getOperationType();

	/*! \brief Set 
	 */
	void setOperationType(OperationType operation_type);
	/*! \brief Get Ad account IDs to share with or revoke from (request) / that received the audience (response).
	 */
	std::list<std::string> getRecipientAccountIds();

	/*! \brief Set Ad account IDs to share with or revoke from (request) / that received the audience (response).
	 */
	void setRecipientAccountIds(std::list<std::string> recipient_account_ids);


    private:
    std::string audience_id{};
    OperationType operation_type;
    std::list<std::string> recipient_account_ids;
};
}

#endif /* TINY_CPP_CLIENT_AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody_H_ */
