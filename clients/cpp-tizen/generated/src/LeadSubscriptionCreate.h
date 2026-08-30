/*
 * LeadSubscriptionCreate.h
 *
 * 
 */

#ifndef _LeadSubscriptionCreate_H_
#define _LeadSubscriptionCreate_H_


#include <string>
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

class LeadSubscriptionCreate : public Object {
public:
	/*! \brief Constructor.
	 */
	LeadSubscriptionCreate();
	LeadSubscriptionCreate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LeadSubscriptionCreate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Lead form ID.
	 */
	std::string getLeadFormId();

	/*! \brief Set Lead form ID.
	 */
	void setLeadFormId(std::string  lead_form_id);
	/*! \brief Get Standard HTTPS webhook URL.
	 */
	std::string getWebhookUrl();

	/*! \brief Set Standard HTTPS webhook URL.
	 */
	void setWebhookUrl(std::string  webhook_url);

private:
	std::string lead_form_id;
	std::string webhook_url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LeadSubscriptionCreate_H_ */
