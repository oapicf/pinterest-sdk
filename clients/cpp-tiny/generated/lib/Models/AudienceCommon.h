
/*
 * AudienceCommon.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AudienceCommon_H_
#define TINY_CPP_CLIENT_AudienceCommon_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AudienceRule.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AudienceCommon{
public:

    /*! \brief Constructor.
	 */
    AudienceCommon();
    AudienceCommon(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AudienceCommon();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Ad account ID.
	 */
	std::string getAdAccountId();

	/*! \brief Set Ad account ID.
	 */
	void setAdAccountId(std::string  ad_account_id);
	/*! \brief Get Audience name.
	 */
	std::string getName();

	/*! \brief Set Audience name.
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	AudienceRule getRule();

	/*! \brief Set 
	 */
	void setRule(AudienceRule  rule);


    private:
    std::string ad_account_id{};
    std::string name{};
    AudienceRule rule;
};
}

#endif /* TINY_CPP_CLIENT_AudienceCommon_H_ */
