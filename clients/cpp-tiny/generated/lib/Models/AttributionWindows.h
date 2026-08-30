
/*
 * AttributionWindows.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AttributionWindows_H_
#define TINY_CPP_CLIENT_AttributionWindows_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AttributionWindows{
public:

    /*! \brief Constructor.
	 */
    AttributionWindows();
    AttributionWindows(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AttributionWindows();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	int getClickWindowDays();

	/*! \brief Set 
	 */
	void setClickWindowDays(int click_window_days);
	/*! \brief Get 
	 */
	int getEngagementWindowDays();

	/*! \brief Set 
	 */
	void setEngagementWindowDays(int engagement_window_days);
	/*! \brief Get 
	 */
	int getViewWindowDays();

	/*! \brief Set 
	 */
	void setViewWindowDays(int view_window_days);


    private:
    int click_window_days{};
    int engagement_window_days{};
    int view_window_days{};
};
}

#endif /* TINY_CPP_CLIENT_AttributionWindows_H_ */
