/*
 * LeadFormResponse.h
 *
 * 
 */

#ifndef _LeadFormResponse_H_
#define _LeadFormResponse_H_


#include <string>
#include "LeadFormQuestion.h"
#include "LeadFormStatus.h"
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

class LeadFormResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	LeadFormResponse();
	LeadFormResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LeadFormResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Internal name of the lead form.
	 */
	std::string getName();

	/*! \brief Set Internal name of the lead form.
	 */
	void setName(std::string  name);
	/*! \brief Get A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
	 */
	std::string getPrivacyPolicyLink();

	/*! \brief Set A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
	 */
	void setPrivacyPolicyLink(std::string  privacy_policy_link);
	/*! \brief Get Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.
	 */
	bool getHasAcceptedTerms();

	/*! \brief Set Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.
	 */
	void setHasAcceptedTerms(bool  has_accepted_terms);
	/*! \brief Get A message for people who complete the form to let them know what happens next.
	 */
	std::string getCompletionMessage();

	/*! \brief Set A message for people who complete the form to let them know what happens next.
	 */
	void setCompletionMessage(std::string  completion_message);
	/*! \brief Get 
	 */
	LeadFormStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(LeadFormStatus  status);
	/*! \brief Get Additional disclosure language to be included in the lead form.
	 */
	std::string getDisclosureLanguage();

	/*! \brief Set Additional disclosure language to be included in the lead form.
	 */
	void setDisclosureLanguage(std::string  disclosure_language);
	/*! \brief Get List of questions to be displayed on the lead form.
	 */
	std::list<LeadFormQuestion> getQuestions();

	/*! \brief Set List of questions to be displayed on the lead form.
	 */
	void setQuestions(std::list <LeadFormQuestion> questions);
	/*! \brief Get The ID of this lead form
	 */
	std::string getId();

	/*! \brief Set The ID of this lead form
	 */
	void setId(std::string  id);
	/*! \brief Get The Ad Account ID that this lead form belongs to.
	 */
	std::string getAdAccountId();

	/*! \brief Set The Ad Account ID that this lead form belongs to.
	 */
	void setAdAccountId(std::string  ad_account_id);
	/*! \brief Get Lead form creation time. Unix timestamp in seconds.
	 */
	int getCreatedTime();

	/*! \brief Set Lead form creation time. Unix timestamp in seconds.
	 */
	void setCreatedTime(int  created_time);
	/*! \brief Get Last update time. Unix timestamp in seconds.
	 */
	int getUpdatedTime();

	/*! \brief Set Last update time. Unix timestamp in seconds.
	 */
	void setUpdatedTime(int  updated_time);

private:
	std::string name;
	std::string privacy_policy_link;
	bool has_accepted_terms;
	std::string completion_message;
	LeadFormStatus status;
	std::string disclosure_language;
	std::list <LeadFormQuestion>questions;
	std::string id;
	std::string ad_account_id;
	int created_time;
	int updated_time;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LeadFormResponse_H_ */
