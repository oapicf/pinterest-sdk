
/*
 * AdAccountAnalyticsItems.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdAccountAnalyticsItems_H_
#define TINY_CPP_CLIENT_AdAccountAnalyticsItems_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Date.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdAccountAnalyticsItems{
public:

    /*! \brief Constructor.
	 */
    AdAccountAnalyticsItems();
    AdAccountAnalyticsItems(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdAccountAnalyticsItems();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getADACCOUNTID();

	/*! \brief Set 
	 */
	void setADACCOUNTID(std::string aD_ACCOUNT_ID);
	/*! \brief Get 
	 */
	Date getDATE();

	/*! \brief Set 
	 */
	void setDATE(Date dATE);


    private:
    std::string aD_ACCOUNT_ID{};
    Date dATE;
};
}

#endif /* TINY_CPP_CLIENT_AdAccountAnalyticsItems_H_ */
