
/*
 * AdGroupIdFilter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdGroupIdFilter_H_
#define TINY_CPP_CLIENT_AdGroupIdFilter_H_


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

class AdGroupIdFilter{
public:

    /*! \brief Constructor.
	 */
    AdGroupIdFilter();
    AdGroupIdFilter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdGroupIdFilter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get List of ad group ids
	 */
	std::list<std::string> getAdGroupIds();

	/*! \brief Set List of ad group ids
	 */
	void setAdGroupIds(std::list <std::string> ad_group_ids);


    private:
    std::list<std::string> ad_group_ids;
};
}

#endif /* TINY_CPP_CLIENT_AdGroupIdFilter_H_ */
