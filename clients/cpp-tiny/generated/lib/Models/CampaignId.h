
/*
 * CampaignId.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CampaignId_H_
#define TINY_CPP_CLIENT_CampaignId_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CampaignId{
public:

    /*! \brief Constructor.
	 */
    CampaignId();
    CampaignId(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignId();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Campaign ID.
	 */
	std::string getId();

	/*! \brief Set Campaign ID.
	 */
	void setId(std::string  id);


    private:
    std::string id{};
};
}

#endif /* TINY_CPP_CLIENT_CampaignId_H_ */
