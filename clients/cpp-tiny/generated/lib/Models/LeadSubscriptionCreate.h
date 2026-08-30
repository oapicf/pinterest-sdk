
/*
 * LeadSubscriptionCreate.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_LeadSubscriptionCreate_H_
#define TINY_CPP_CLIENT_LeadSubscriptionCreate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class LeadSubscriptionCreate{
public:

    /*! \brief Constructor.
	 */
    LeadSubscriptionCreate();
    LeadSubscriptionCreate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LeadSubscriptionCreate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Lead form ID.
	 */
	std::string getLeadFormId();

	/*! \brief Set Lead form ID.
	 */
	void setLeadFormId(std::string lead_form_id);
	/*! \brief Get Standard HTTPS webhook URL.
	 */
	std::string getWebhookUrl();

	/*! \brief Set Standard HTTPS webhook URL.
	 */
	void setWebhookUrl(std::string webhook_url);


    private:
    std::string lead_form_id{};
    std::string webhook_url{};
};
}

#endif /* TINY_CPP_CLIENT_LeadSubscriptionCreate_H_ */
