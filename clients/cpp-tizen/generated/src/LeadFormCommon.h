/*
 * LeadFormCommon.h
 *
 * Creation fields
 */

#ifndef _LeadFormCommon_H_
#define _LeadFormCommon_H_


#include <string>
#include "LeadFormCommon_policy_links_inner.h"
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


/*! \brief Creation fields
 *
 *  \ingroup Models
 *
 */

class LeadFormCommon : public Object {
public:
	/*! \brief Constructor.
	 */
	LeadFormCommon();
	LeadFormCommon(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LeadFormCommon();

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
	/*! \brief Get Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's <a href=\"https://policy.pinterest.com/en/lead-ad-terms\">Lead Ad Terms</a>. As a reminder, all advertising on Pinterest is subject to the <a href=\"https://business.pinterest.com/en/pinterest-advertising-services-agreement/\">Pinterest Advertising Services Agreement</a> or an equivalent agreement as set forth on an IO
	 */
	bool getHasAcceptedTerms();

	/*! \brief Set Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's <a href=\"https://policy.pinterest.com/en/lead-ad-terms\">Lead Ad Terms</a>. As a reminder, all advertising on Pinterest is subject to the <a href=\"https://business.pinterest.com/en/pinterest-advertising-services-agreement/\">Pinterest Advertising Services Agreement</a> or an equivalent agreement as set forth on an IO
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
	/*! \brief Get List of additional policy links to be displayed on the lead form.
	 */
	std::list<LeadFormCommon_policy_links_inner> getPolicyLinks();

	/*! \brief Set List of additional policy links to be displayed on the lead form.
	 */
	void setPolicyLinks(std::list <LeadFormCommon_policy_links_inner> policy_links);

private:
	std::string name;
	std::string privacy_policy_link;
	bool has_accepted_terms;
	std::string completion_message;
	LeadFormStatus status;
	std::string disclosure_language;
	std::list <LeadFormQuestion>questions;
	std::list <LeadFormCommon_policy_links_inner>policy_links;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LeadFormCommon_H_ */
