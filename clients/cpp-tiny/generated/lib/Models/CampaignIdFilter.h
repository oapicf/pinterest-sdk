
/*
 * CampaignIdFilter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CampaignIdFilter_H_
#define TINY_CPP_CLIENT_CampaignIdFilter_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CampaignIdFilter{
public:

    /*! \brief Constructor.
	 */
    CampaignIdFilter();
    CampaignIdFilter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignIdFilter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get List of campaign ids
	 */
	std::list<std::string> getCampaignIds();

	/*! \brief Set List of campaign ids
	 */
	void setCampaignIds(std::list <std::string> campaign_ids);


    private:
    std::list<std::string> campaign_ids;
};
}

#endif /* TINY_CPP_CLIENT_CampaignIdFilter_H_ */
