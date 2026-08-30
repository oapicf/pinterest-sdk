
/*
 * LeadForm.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_LeadForm_H_
#define TINY_CPP_CLIENT_LeadForm_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "LeadFormPolicyLink.h"
#include "LeadFormQuestion.h"
#include "LeadFormStatus.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class LeadForm{
public:

    /*! \brief Constructor.
	 */
    LeadForm();
    LeadForm(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LeadForm();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The Ad Account ID that this lead form belongs to.
	 */
	std::string getAdAccountId();

	/*! \brief Set The Ad Account ID that this lead form belongs to.
	 */
	void setAdAccountId(std::string ad_account_id);
	/*! \brief Get A message for people who complete the form to let them know what happens next.
	 */
	std::string getCompletionMessage();

	/*! \brief Set A message for people who complete the form to let them know what happens next.
	 */
	void setCompletionMessage(std::string completion_message);
	/*! \brief Get Lead form creation time. Unix timestamp in seconds.
	 */
	int getCreatedTime();

	/*! \brief Set Lead form creation time. Unix timestamp in seconds.
	 */
	void setCreatedTime(int created_time);
	/*! \brief Get Additional disclosure language to be included in the lead form.
	 */
	std::string getDisclosureLanguage();

	/*! \brief Set Additional disclosure language to be included in the lead form.
	 */
	void setDisclosureLanguage(std::string disclosure_language);
	/*! \brief Get Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO
	 */
	bool isHasAcceptedTerms();

	/*! \brief Set Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO
	 */
	void setHasAcceptedTerms(bool has_accepted_terms);
	/*! \brief Get The ID of this lead form
	 */
	std::string getId();

	/*! \brief Set The ID of this lead form
	 */
	void setId(std::string id);
	/*! \brief Get Internal name of the lead form.
	 */
	std::string getName();

	/*! \brief Set Internal name of the lead form.
	 */
	void setName(std::string name);
	/*! \brief Get List of additional policy links to be displayed on the lead form.
	 */
	std::list<LeadFormPolicyLink> getPolicyLinks();

	/*! \brief Set List of additional policy links to be displayed on the lead form.
	 */
	void setPolicyLinks(std::list<LeadFormPolicyLink> policy_links);
	/*! \brief Get A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
	 */
	std::string getPrivacyPolicyLink();

	/*! \brief Set A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
	 */
	void setPrivacyPolicyLink(std::string privacy_policy_link);
	/*! \brief Get List of questions to be displayed on the lead form.
	 */
	std::list<LeadFormQuestion> getQuestions();

	/*! \brief Set List of questions to be displayed on the lead form.
	 */
	void setQuestions(std::list<LeadFormQuestion> questions);
	/*! \brief Get 
	 */
	LeadFormStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(LeadFormStatus status);
	/*! \brief Get Last update time. Unix timestamp in seconds.
	 */
	int getUpdatedTime();

	/*! \brief Set Last update time. Unix timestamp in seconds.
	 */
	void setUpdatedTime(int updated_time);


    private:
    std::string ad_account_id{};
    std::string completion_message{};
    int created_time{};
    std::string disclosure_language{};
    bool has_accepted_terms{};
    std::string id{};
    std::string name{};
    std::list<LeadFormPolicyLink> policy_links;
    std::string privacy_policy_link{};
    std::list<LeadFormQuestion> questions;
    LeadFormStatus status;
    int updated_time{};
};
}

#endif /* TINY_CPP_CLIENT_LeadForm_H_ */
