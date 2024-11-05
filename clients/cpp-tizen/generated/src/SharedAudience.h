/*
 * SharedAudience.h
 *
 * 
 */

#ifndef _SharedAudience_H_
#define _SharedAudience_H_


#include <string>
#include "OperationType.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class SharedAudience : public Object {
public:
	/*! \brief Constructor.
	 */
	SharedAudience();
	SharedAudience(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SharedAudience();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	/*! \brief Get List of ad account IDs to share with or revoke from.
	 */
	std::list<std::string> getRecipientAccountIds();

	/*! \brief Set List of ad account IDs to share with or revoke from.
	 */
	void setRecipientAccountIds(std::list <std::string> recipient_account_ids);

private:
	std::string audience_id;
	OperationType operation_type;
	std::list <std::string>recipient_account_ids;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SharedAudience_H_ */
