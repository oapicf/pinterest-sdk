
/*
 * AdsAnalyticsMetricsFilter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdsAnalyticsMetricsFilter_H_
#define TINY_CPP_CLIENT_AdsAnalyticsMetricsFilter_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AdsAnalyticsFilterColumn.h"
#include "AdsAnalyticsFilterOperator.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdsAnalyticsMetricsFilter{
public:

    /*! \brief Constructor.
	 */
    AdsAnalyticsMetricsFilter();
    AdsAnalyticsMetricsFilter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdsAnalyticsMetricsFilter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	AdsAnalyticsFilterColumn getField();

	/*! \brief Set 
	 */
	void setField(AdsAnalyticsFilterColumn  field);
	/*! \brief Get 
	 */
	AdsAnalyticsFilterOperator getROperator();

	/*! \brief Set 
	 */
	void setROperator(AdsAnalyticsFilterOperator  r_operator);
	/*! \brief Get List of values for filtering
	 */
	std::list<long> getValues();

	/*! \brief Set List of values for filtering
	 */
	void setValues(std::list <long> values);


    private:
    AdsAnalyticsFilterColumn field;
    AdsAnalyticsFilterOperator r_operator;
    std::list<long> values;
};
}

#endif /* TINY_CPP_CLIENT_AdsAnalyticsMetricsFilter_H_ */
