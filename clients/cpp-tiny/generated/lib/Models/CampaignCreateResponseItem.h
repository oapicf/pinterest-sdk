
/*
 * CampaignCreateResponseItem.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CampaignCreateResponseItem_H_
#define TINY_CPP_CLIENT_CampaignCreateResponseItem_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CampaignCreateResponseData.h"
#include "Exception.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CampaignCreateResponseItem{
public:

    /*! \brief Constructor.
	 */
    CampaignCreateResponseItem();
    CampaignCreateResponseItem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignCreateResponseItem();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CampaignCreateResponseData getData();

	/*! \brief Set 
	 */
	void setData(CampaignCreateResponseData  data);
	/*! \brief Get 
	 */
	std::list<Exception> getExceptions();

	/*! \brief Set 
	 */
	void setExceptions(std::list <Exception> exceptions);


    private:
    CampaignCreateResponseData data;
    std::list<Exception> exceptions;
};
}

#endif /* TINY_CPP_CLIENT_CampaignCreateResponseItem_H_ */
