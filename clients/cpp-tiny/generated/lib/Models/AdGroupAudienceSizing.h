
/*
 * AdGroupAudienceSizing.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdGroupAudienceSizing_H_
#define TINY_CPP_CLIENT_AdGroupAudienceSizing_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdGroupAudienceSizing{
public:

    /*! \brief Constructor.
	 */
    AdGroupAudienceSizing();
    AdGroupAudienceSizing(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdGroupAudienceSizing();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The lower confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
	 */
	long getAudienceSizeLowerBound();

	/*! \brief Set The lower confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
	 */
	void setAudienceSizeLowerBound(long audience_size_lower_bound);
	/*! \brief Get The upper confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
	 */
	long getAudienceSizeUpperBound();

	/*! \brief Set The upper confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
	 */
	void setAudienceSizeUpperBound(long audience_size_upper_bound);


    private:
    long audience_size_lower_bound{};
    long audience_size_upper_bound{};
};
}

#endif /* TINY_CPP_CLIENT_AdGroupAudienceSizing_H_ */
