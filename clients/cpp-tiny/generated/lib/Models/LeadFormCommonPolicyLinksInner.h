
/*
 * LeadFormCommon_policy_links_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_LeadFormCommon_policy_links_inner_H_
#define TINY_CPP_CLIENT_LeadFormCommon_policy_links_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class LeadFormCommon_policy_links_inner{
public:

    /*! \brief Constructor.
	 */
    LeadFormCommon_policy_links_inner();
    LeadFormCommon_policy_links_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LeadFormCommon_policy_links_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Policy label for an additional policy link.
	 */
	std::string getLabel();

	/*! \brief Set Policy label for an additional policy link.
	 */
	void setLabel(std::string  label);
	/*! \brief Get Policy link for an additional policy link.
	 */
	std::string getLink();

	/*! \brief Set Policy link for an additional policy link.
	 */
	void setLink(std::string  link);


    private:
    std::string label{};
    std::string link{};
};
}

#endif /* TINY_CPP_CLIENT_LeadFormCommon_policy_links_inner_H_ */
