
/*
 * MetricsResponseDataItems.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MetricsResponseDataItems_H_
#define TINY_CPP_CLIENT_MetricsResponseDataItems_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Object.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MetricsResponseDataItems{
public:

    /*! \brief Constructor.
	 */
    MetricsResponseDataItems();
    MetricsResponseDataItems(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MetricsResponseDataItems();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Metrics object containing the requested metric columns and their values. The keys are metric names (e.g., AD_GROUP_ID, DATE, SPEND_IN_DOLLAR) and values are the metric values (strings or numbers).
	 */
	Object getMetrics();

	/*! \brief Set Metrics object containing the requested metric columns and their values. The keys are metric names (e.g., AD_GROUP_ID, DATE, SPEND_IN_DOLLAR) and values are the metric values (strings or numbers).
	 */
	void setMetrics(Object metrics);
	/*! \brief Get The targeting type for this data item (e.g., KEYWORD, APPTYPE, GENDER)
	 */
	std::string getTargetingType();

	/*! \brief Set The targeting type for this data item (e.g., KEYWORD, APPTYPE, GENDER)
	 */
	void setTargetingType(std::string targeting_type);
	/*! \brief Get The targeting value for this data item (e.g., 'christmas decor ideas', 'iphone', 'female')
	 */
	std::string getTargetingValue();

	/*! \brief Set The targeting value for this data item (e.g., 'christmas decor ideas', 'iphone', 'female')
	 */
	void setTargetingValue(std::string targeting_value);


    private:
    Object metrics;
    std::string targeting_type{};
    std::string targeting_value{};
};
}

#endif /* TINY_CPP_CLIENT_MetricsResponseDataItems_H_ */
