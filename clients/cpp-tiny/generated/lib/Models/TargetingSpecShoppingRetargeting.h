
/*
 * TargetingSpecShoppingRetargeting.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_TargetingSpecShoppingRetargeting_H_
#define TINY_CPP_CLIENT_TargetingSpecShoppingRetargeting_H_


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

class TargetingSpecShoppingRetargeting{
public:

    /*! \brief Constructor.
	 */
    TargetingSpecShoppingRetargeting();
    TargetingSpecShoppingRetargeting(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TargetingSpecShoppingRetargeting();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Number of days ago to stop lookback timeframe for dynamic retargeting
	 */
	int getExclusionWindow();

	/*! \brief Set Number of days ago to stop lookback timeframe for dynamic retargeting
	 */
	void setExclusionWindow(int exclusion_window);
	/*! \brief Get Number of days ago to start lookback timeframe for dynamic retargeting
	 */
	int getLookbackWindow();

	/*! \brief Set Number of days ago to start lookback timeframe for dynamic retargeting
	 */
	void setLookbackWindow(int lookback_window);
	/*! \brief Get Event types to target for dynamic retargeting
	 */
	std::list<int> getTagTypes();

	/*! \brief Set Event types to target for dynamic retargeting
	 */
	void setTagTypes(std::list<int> tag_types);


    private:
    int exclusion_window{};
    int lookback_window{};
    std::list<int> tag_types;
};
}

#endif /* TINY_CPP_CLIENT_TargetingSpecShoppingRetargeting_H_ */
