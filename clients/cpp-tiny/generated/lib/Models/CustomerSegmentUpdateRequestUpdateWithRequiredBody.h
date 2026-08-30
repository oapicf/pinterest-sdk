
/*
 * CustomerSegmentUpdateRequestUpdateWithRequiredBody.h
 *
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */

#ifndef TINY_CPP_CLIENT_CustomerSegmentUpdateRequestUpdateWithRequiredBody_H_
#define TINY_CPP_CLIENT_CustomerSegmentUpdateRequestUpdateWithRequiredBody_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AudienceUpdateOperationType.h"
#include <list>

namespace Tiny {


/*! \brief Resource create or update operation model with required body fields (no OptionalProperties).
 *
 *  \ingroup Models
 *
 */

class CustomerSegmentUpdateRequestUpdateWithRequiredBody{
public:

    /*! \brief Constructor.
	 */
    CustomerSegmentUpdateRequestUpdateWithRequiredBody();
    CustomerSegmentUpdateRequestUpdateWithRequiredBody(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CustomerSegmentUpdateRequestUpdateWithRequiredBody();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Audience IDs to update the customer segment to. Only applicable for UPDATE operations.
	 */
	std::list<std::string> getAudienceIds();

	/*! \brief Set Audience IDs to update the customer segment to. Only applicable for UPDATE operations.
	 */
	void setAudienceIds(std::list<std::string> audience_ids);
	/*! \brief Get Customer segment ID.
	 */
	std::string getId();

	/*! \brief Set Customer segment ID.
	 */
	void setId(std::string id);
	/*! \brief Get 
	 */
	AudienceUpdateOperationType getOperationType();

	/*! \brief Set 
	 */
	void setOperationType(AudienceUpdateOperationType operation_type);


    private:
    std::list<std::string> audience_ids;
    std::string id{};
    AudienceUpdateOperationType operation_type;
};
}

#endif /* TINY_CPP_CLIENT_CustomerSegmentUpdateRequestUpdateWithRequiredBody_H_ */
