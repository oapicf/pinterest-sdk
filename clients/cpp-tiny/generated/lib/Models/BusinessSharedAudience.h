
/*
 * BusinessSharedAudience.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_BusinessSharedAudience_H_
#define TINY_CPP_CLIENT_BusinessSharedAudience_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OperationType.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class BusinessSharedAudience{
public:

    /*! \brief Constructor.
	 */
    BusinessSharedAudience();
    BusinessSharedAudience(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BusinessSharedAudience();


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
	void setAudienceId(std::string  audience_id);
	/*! \brief Get 
	 */
	OperationType getOperationType();

	/*! \brief Set 
	 */
	void setOperationType(OperationType  operation_type);
	/*! \brief Get List of business IDs to share with or revoke from.
	 */
	std::list<std::string> getRecipientBusinessIds();

	/*! \brief Set List of business IDs to share with or revoke from.
	 */
	void setRecipientBusinessIds(std::list <std::string> recipient_business_ids);


    private:
    std::string audience_id{};
    OperationType operation_type;
    std::list<std::string> recipient_business_ids;
};
}

#endif /* TINY_CPP_CLIENT_BusinessSharedAudience_H_ */
