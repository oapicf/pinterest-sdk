
/*
 * CampaignAdPreviewCreate.h
 *
 * Resource create operation model.
 */

#ifndef TINY_CPP_CLIENT_CampaignAdPreviewCreate_H_
#define TINY_CPP_CLIENT_CampaignAdPreviewCreate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class CampaignAdPreviewCreate{
public:

    /*! \brief Constructor.
	 */
    CampaignAdPreviewCreate();
    CampaignAdPreviewCreate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignAdPreviewCreate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Ad group ID to create a preview record for.
	 */
	std::string getAdGroupId();

	/*! \brief Set Ad group ID to create a preview record for.
	 */
	void setAdGroupId(std::string ad_group_id);


    private:
    std::string ad_group_id{};
};
}

#endif /* TINY_CPP_CLIENT_CampaignAdPreviewCreate_H_ */
