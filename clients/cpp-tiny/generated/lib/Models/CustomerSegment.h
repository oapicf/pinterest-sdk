
/*
 * CustomerSegment.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CustomerSegment_H_
#define TINY_CPP_CLIENT_CustomerSegment_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "TargetingTemplateStatus.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CustomerSegment{
public:

    /*! \brief Constructor.
	 */
    CustomerSegment();
    CustomerSegment(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CustomerSegment();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The ID of the ad account that this customer segment belongs to.
	 */
	std::string getAdAccountId();

	/*! \brief Set The ID of the ad account that this customer segment belongs to.
	 */
	void setAdAccountId(std::string ad_account_id);
	/*! \brief Get Audience IDs included in the customer segment.
	 */
	std::list<std::string> getAudienceIds();

	/*! \brief Set Audience IDs included in the customer segment.
	 */
	void setAudienceIds(std::list<std::string> audience_ids);
	/*! \brief Get Customer segment created time. Unix timestamp in seconds.
	 */
	int getCreatedTime();

	/*! \brief Set Customer segment created time. Unix timestamp in seconds.
	 */
	void setCreatedTime(int created_time);
	/*! \brief Get Customer segment ID.
	 */
	std::string getId();

	/*! \brief Set Customer segment ID.
	 */
	void setId(std::string id);
	/*! \brief Get Customer segment name.
	 */
	std::string getName();

	/*! \brief Set Customer segment name.
	 */
	void setName(std::string name);
	/*! \brief Get Indicates whether the customer segment is active or deleted.
	 */
	TargetingTemplateStatus getStatus();

	/*! \brief Set Indicates whether the customer segment is active or deleted.
	 */
	void setStatus(TargetingTemplateStatus status);
	/*! \brief Get Customer segment updated time. Unix timestamp in seconds.
	 */
	int getUpdatedTime();

	/*! \brief Set Customer segment updated time. Unix timestamp in seconds.
	 */
	void setUpdatedTime(int updated_time);


    private:
    std::string ad_account_id{};
    std::list<std::string> audience_ids;
    int created_time{};
    std::string id{};
    std::string name{};
    TargetingTemplateStatus status;
    int updated_time{};
};
}

#endif /* TINY_CPP_CLIENT_CustomerSegment_H_ */
